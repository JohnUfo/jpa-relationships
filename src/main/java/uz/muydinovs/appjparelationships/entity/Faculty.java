package uz.muydinovs.appjparelationships.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "faculties")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"name","university_id"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    private University university;

    public Faculty(String name, University university) {
        this.name = name;
        this.university = university;
    }
}
