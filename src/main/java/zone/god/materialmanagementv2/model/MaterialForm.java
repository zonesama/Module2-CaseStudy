package zone.god.materialmanagementv2.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Size;
import java.sql.Date;

public class MaterialForm {
    private int id;
    @Size(max = 49)
    private String code, name;
    private Date importDate;
    private String description;
    private double price;
    private int quantity;
    private MultipartFile image;
    private Supplier supplier;

    public MaterialForm() {
    }

    public MaterialForm(int id, @Size(max = 49) String code, @Size(max = 49) String name, Date importDate, String description, double price, int quantity, MultipartFile image, Supplier supplier) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.importDate = importDate;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.supplier = supplier;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
