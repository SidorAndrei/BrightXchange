import { useAtom } from "jotai";
import { BASE_PATH, CART_PRODUCTS, USER, USER_PATH } from "../../atoms/STORE";
import Navigation from "../../components/navigation/Navigation";
import axios from "axios";

const CartPage = () => {
  const [cartItems, setCartItems] = useAtom(CART_PRODUCTS);
  const [user] = useAtom(USER);
  let totalCost = 0;

  const onChange = (e) => {
    console.log(e.target.value);
    if (e.target.value === "") {
      e.target.value = 0;
    }
    axios
      .put(
        `${USER_PATH}/cart-item`,
        {
          id: e.target.id,
          quantity: e.target.value,
        },
        { headers: { authorization: user.token } }
      )
      .then(() => {
        axios
          .get(`${USER_PATH}/cart-item/${user.id}`, {
            headers: { authorization: user.token },
          })
          .then((r) => {
            setCartItems(r.data);
          });
      });
  };
  const payment = () => {
    axios.post(`${BASE_PATH}/pay/${user.id}`).then((r) => {
      console.log(r);
    });
  };
  return (
    <>
      <Navigation />
      <table style={{ marginTop: "120px" }}>
        <thead>
          <tr>
            <th></th>
            <th>Nume Produs</th>
            <th>Pret</th>
            <th>Cantitate</th>
            <th>Pret total</th>
          </tr>
        </thead>
        <tbody>
          {cartItems.map((item, index) => {
            let cost = item.quantity * item.product.price;
            totalCost += cost;
            return (
              <tr key={`item_${index}`}>
                <td>{index}</td>
                <td>{item.product.name}</td>
                <td>{item.product.price} RON</td>
                <td>
                  <input
                    id={item.id}
                    onChange={onChange}
                    type={"number"}
                    min={0}
                    minLength={1}
                    value={item.quantity}
                  />
                </td>
                <td>{cost} RON</td>
              </tr>
            );
          })}
          <tr>
            <td style={{ height: "20px" }}></td>
          </tr>
          <tr>
            <td>TOTAL:</td>
            <td></td>
            <td></td>
            <td></td>
            <td>{totalCost} RON</td>
          </tr>
          <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>
              <button onClick={payment}>PAY</button>
            </td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default CartPage;
