package brandkon.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    // 상품 목록 조회
    @GetMapping("/products")
    public List<ProductResponse> findAll(
            @RequestParam(required = false) Long brandId) {
        return List.of();
    }

    // 인기 상품 목록 조회
    @GetMapping("/products/popular")
    public List<ProductResponse> findPopular(
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) Long brandId) {
        return List.of();
    }

    // 상품 상세 조회
    @GetMapping("/products/{productId}")
    public ProductDetailResponse findById(@PathVariable Long productId) {
        return new ProductDetailResponse(
                1L,
                "아메리카노",
                2000,
                new ProductDetailResponse.Brand(
                        1L,
                        "메가커피",
                        ""
                ),
                366
        );
    }
}
