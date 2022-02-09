package ru.lebedevbars.entity;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ruser")
public class User {
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return first_Name; }
    public void setFirstName(String firstName) { this.first_Name = firstName; }

    public String getLastName() { return last_Name; }
    public void setLastName(String lastName) { this.last_Name = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_Name;
    private String last_Name;
    private String email;
    private String password;
}
