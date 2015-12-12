package ra.model;

import javax.persistence.*;

/**
 * Created by the-l_000 on 12.12.2015.
 */
@Entity
@Table(name = "rltn_product_category", schema = "", catalog = "RefugeesWelcomeApp")
@IdClass(RltnProductCategoryEntityPK.class)
public class RltnProductCategoryEntity {
    private int product;
    private int category;

    @Id
    @Column(name = "product", nullable = false)
    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Id
    @Column(name = "category", nullable = false)
    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RltnProductCategoryEntity that = (RltnProductCategoryEntity) o;

        if (product != that.product) return false;
        if (category != that.category) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = product;
        result = 31 * result + category;
        return result;
    }
}
