package deep_copy.copy;

public class Address {
    public String house_number;
    public String district;
    public String state;
    public String country;


    public Address(){}

    

    public Address(String house_number,String district,String state,String country){
        this.house_number=house_number;
        this.district=district;
        this.state=state;
        this.country=country;
    }

    public Address(Address address){
        this.house_number=address.house_number;
        this.district=address.district;
        this.state=address.state;
        this.country=address.country;
    }


    public String getHouse_number() {
        return this.house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // @Override
    // public String toString() {
    //     return "{" +
    //         " house_number='" + getHouse_number() + "'" +
    //         ", district='" + getDistrict() + "'" +
    //         ", state='" + getState() + "'" +
    //         ", country='" + getCountry() + "'" +
    //         "}";
    // }


}
