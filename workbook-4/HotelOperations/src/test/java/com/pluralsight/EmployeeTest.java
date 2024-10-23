package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_GettingCheckInTime_RecordStartWorkingTime(){
        //Arrange
        Employee kate = new Employee(1,"Kate","development",150 );
        //Act
        double checkInTime = 8.0;
        kate.punchIn(checkInTime);

        //Assert
        assertEquals(checkInTime,kate.getRegularHours());
    }

    @Test
    public void punchOut_GettingCheckOutTime_ReceivingTotalHoursOfWork(){
        //Arrange
        //Act
        //Assert
        
    }

}