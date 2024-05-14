package org.example.models;

import org.openqa.selenium.By;

public class Details{
        public Details(String area, String noOfFloors) {
            this.area = area;
            this.noOfFloors = noOfFloors;
//        this.RCNo = RCNo;
        }
    


        String area;

        String noOfFloors;
        public void fillHouseType() {
            fillArea();
            fillNoOfFloors();
        }

 public void fillArea() {
        Utils._driver.findElement(By.name("FAreaOverAll")).sendKeys(this.area);

    }
    public void fillNoOfFloors() {
        Utils._driver.findElement(By.name("FAreaOverAll")).sendKeys(this.noOfFloors);


    }
    
}
