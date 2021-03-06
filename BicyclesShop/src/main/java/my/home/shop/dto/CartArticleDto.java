package my.home.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartArticleDto {
    private Long cartId;
    private Long articleId;
    private String name;
    private Double price;
}

