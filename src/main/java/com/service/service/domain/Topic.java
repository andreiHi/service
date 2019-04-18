package com.service.service.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 03.01.2019.
 * @version $Id$.
 * @since 0.1.
 */
@Entity
@Table(name = "topic")
public class Topic implements Serializable {
    @Transient
    public static final String ID_GENERATOR = "ID_GENERATOR";

    @Id
    @GeneratedValue(generator = ID_GENERATOR)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(name = "name", length = 80)
    private String name;

    @Column(name = "description", length = 5000)
    private String description;

    @Column(name = "text_field1", length = 5000)
    private String textField1;

    @Column(name = "text_field2", length = 5000)
    private String textField2;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", length = 19)
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTextField1() {
        return textField1;
    }

    public void setTextField1(String textField1) {
        this.textField1 = textField1;
    }

    public String getTextField2() {
        return textField2;
    }

    public void setTextField2(String textField2) {
        this.textField2 = textField2;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", textField1='" + textField1 + '\'' +
                ", textField2='" + textField2 + '\'' +
                ", created=" + created +
                '}';
    }
}
