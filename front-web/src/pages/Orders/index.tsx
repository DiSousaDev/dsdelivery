import './styles.css';
import {useEffect, useState} from "react";
import StepsHeader from "../../components/StepsHeader";
import ProductsList from "../../components/ProductsList";
import {OrderLocationData, Product} from "./types";
import OrderLocation from "../../components/OrderLocation";
import {fetchProducts} from "../../api";

const Orders = () => {
    const [products, setProducts] = useState<Product[]>([]);
    const [orderLocation, setOrderLocation] = useState<OrderLocationData>();

    useEffect(() => {
        fetchProducts()
            .then(response => setProducts(response.data))
            .catch(error => console.log(error))
    }, [])

    return (
        <div className="orders-container">
            <StepsHeader />
            <ProductsList products={products}/>
            <OrderLocation onChangeLocation={location => setOrderLocation(location)} />
        </div>
    );
}

export default Orders;