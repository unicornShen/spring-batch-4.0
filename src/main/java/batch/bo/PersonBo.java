package batch.bo;

import java.io.Serializable;

/**
 *
 * @author Unicorn
 */
public class PersonBo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;

    public PersonBo() {
        super();
    }

    public PersonBo(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
