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
        assertEquals(checkInTime,kate.getStartTime());
    }

    @Test
    public void punchOut_GettingCheckOutTime_ReceivingTotalHoursOfWork(){
        //Arrange
        Employee kate = new Employee(1,"Kate","development",150 );
        double checkInTime = 9.0;
        kate.punchIn(checkInTime);
        //Act
        kate.punchOut(17.5);

        //Assert
        assertEquals(8.5, kate.getHoursWorked());

    }

}