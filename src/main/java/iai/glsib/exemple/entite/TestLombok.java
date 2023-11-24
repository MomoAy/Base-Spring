package iai.glsib.exemple.entite;

import lombok.*;

import java.util.Objects;

@Data//@Getter @Setter @ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestLombok {
    private int id;
    private String first;
    private String second;

    /*public TestLombok() {
    }

    public TestLombok(int id, String first, String second) {
        this.id = id;
        this.first = first;
        this.second = second;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestLombok that = (TestLombok) o;
        return id == that.id && Objects.equals(first, that.first) && Objects.equals(second, that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first, second);
    }

    @Override
    public String toString() {
        return "TestLombok{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }*/

}
