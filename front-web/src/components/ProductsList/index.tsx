import './styles.css';
import ProductCard from "../ProductCard";
import {Product} from "../../pages/Orders/types";

type Props = {
    products: Product[];
}

const ProductsList = ({ products }: Props) => (
    <div className="orders-list-container">
        <div className="orders-list-items">
            {products.map(product => (
                <ProductCard key={product.id} product={product}/>
            ))}
        </div>
    </div>
);

export default ProductsList;