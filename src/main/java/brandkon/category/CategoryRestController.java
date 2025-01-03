package brandkon.category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryRestController {

    @GetMapping("/categories")
    public List<CategoryResponse> getAll() {
        return List.of(
                new CategoryResponse(
                        1L,
                        "카페",
                        "cafe",
                        "/icons/cafe.png"
                )
        );
    }
}
