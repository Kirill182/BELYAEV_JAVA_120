package my.home.shop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToMany
    @JoinTable( name = "articles_carts",
                joinColumns = @JoinColumn(name = "cart_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "article_id", referencedColumnName = "id")
    )
    private List<Article> articles;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
