package com.manchesterdigital;

public class OrderProcessor {

    private  OrderStatus orderStatus;

    public OrderProcessor(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void obtainCurrentOrderStatus(){
        if (orderStatus == OrderStatus.DISPATCHED){
            System.out.println("You should receive your item soon");
        }
        else {
            System.out.println("We have no estimate: However your order is at stage " +
                    orderStatus.toString());
        }
    } //enums

    public void printOrderMessage(){
//        switch (orderStatus){
//            case PENDING:
//                System.out.println("Order is pending");
//                break;
//            case DECLINED:
//                System.out.println("Order is declined");
//                break;
//            case DISPATCHED:
//                System.out.println("Order is dispatched");
//                break;
//            case AWAITING_PAYMENT:
//                System.out.println("Order is awaiting payment");
//                break;
//            default:
//                System.out.println("Order has been processed");
//        } //refactored enum to incorporate these into the actual statuses

        System.out.println(orderStatus.getMessage());
    }

}
