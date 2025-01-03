package brandkon.product;

public record ProductDetailResponse(
        Long productId,
        String productName,
        int price,
        Brand brand,
        int expirationDays
) {
    public record Brand(
            Long id,
            String name,
            String guidelines
    ) {
    }
}
