package hello.core.order;

public class Order {
    /* 주문 속성 */
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    /* 생성자 */
    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    /* 비즈니스 로직 : 할인적용 금액 */
    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    /* getter & setter */
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    /* 출력시 보기 쉽도록 하는 메서드 */
    @Override
    public String toString() { //객체 자체를 출력할 경우 toString() 메서드가 호출된다
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                "}";
    }
}
