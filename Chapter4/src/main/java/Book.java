import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by deft1 on 13.05.2017.
 */

@Entity
@NamedNativeQueries({
        @NamedNativeQuery(name = "findAllBooks", query = "SELECT b FROM Book b"),
        @NamedNativeQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title = 'H2G2'")
})
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String title;
    private Float price;
    @Size(min = 10, max = 2000)
    private String description;
    private String isbn;
    private Integer nmOfPage;
    private Boolean illustrations;

    public Book() {
    }

    public Book(String title, String description, Float price, String isbn, Integer nmOfPage, Boolean illustrations) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.isbn = isbn;
        this.nmOfPage = nmOfPage;
        this.illustrations = illustrations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNmOfPage() {
        return nmOfPage;
    }

    public void setNmOfPage(Integer nmOfPage) {
        this.nmOfPage = nmOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }
}
