package com.sdajava.builder;


/**
 * Created by lukas on 28.03.2017.
 */
public class User {

    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address;  //optional


    private User(UserBuilder userBuilder) {
        setFirstName(userBuilder.firstName);
        setLastName(userBuilder.lastName);
        setAge(userBuilder.age);
        setPhone(userBuilder.phone);
        setAddress(userBuilder.address);
    }

    @Override
    public String toString() {
        return "User{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static final class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder firstName(String val) {
            firstName = val;
            return this;
        }

        public UserBuilder lastName(String val) {
            lastName = val;
            return this;
        }

        public UserBuilder age(int val) {
            age = val;
            return this;
        }

        public UserBuilder phone(String val) {
            phone = val;
            return this;
        }

        public UserBuilder address(String val) {
            address = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
