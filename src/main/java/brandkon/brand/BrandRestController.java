package brandkon.brand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandRestController {

    @GetMapping("/brands")
    public List<BrandResponse> findAll(@RequestParam(required = false) String category) {
        return List.of();
    }

    @GetMapping("/brands/{brandId}")
    public BrandResponse findById(@PathVariable Long brandId) {
        return new BrandResponse(
                1L,
                "스타벅스",
                "");
    }
}
