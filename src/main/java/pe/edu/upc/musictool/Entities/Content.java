package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContent;
    @Column(name = "titleContent",nullable = false, length = 100)
    private String titleContent;
    @Column(name = "descriptionContent",nullable = false, length = 300)
    private String descriptionContent;
    @Column(name = "priceContent",nullable = false)
    private Double priceContent;
    @Column(name = "freeContent",nullable = false)
    private Boolean freeContent;
    @Column(name = "typeContent",nullable = false)
    private String typeContent;
    @Column(name = "fileContent",nullable = false)
    private String fileContent;

    @ManyToOne
    @JoinColumn(name = "libraryId")
    private Library library;

    public Content(Integer idContent, String titleContent, String descriptionContent, Double priceContent, Boolean freeContent, String typeContent, String fileContent, Library library) {
        this.idContent = idContent;
        this.titleContent = titleContent;
        this.descriptionContent = descriptionContent;
        this.priceContent = priceContent;
        this.freeContent = freeContent;
        this.typeContent = typeContent;
        this.fileContent = fileContent;
        this.library = library;
    }

    public Content() {
    }

    public Integer getIdContent() {
        return idContent;
    }

    public void setIdContent(Integer idContent) {
        this.idContent = idContent;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public String getDescriptionContent() {
        return descriptionContent;
    }

    public void setDescriptionContent(String descriptionContent) {
        this.descriptionContent = descriptionContent;
    }

    public Double getPriceContent() {
        return priceContent;
    }

    public void setPriceContent(Double priceContent) {
        this.priceContent = priceContent;
    }

    public Boolean getFreeContent() {
        return freeContent;
    }

    public void setFreeContent(Boolean freeContent) {
        this.freeContent = freeContent;
    }

    public String getTypeContent() {
        return typeContent;
    }

    public void setTypeContent(String typeContent) {
        this.typeContent = typeContent;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
