package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_RoomCondition_OccupiedAndDirty(){
        //Arrange
        Room kingRoom = new Room(1, 139);
    // class  object       constructor

        //Act
        kingRoom.checkIn(); //The checkIn() method is called on the kingRoom object.


        //Assert
        assertTrue(kingRoom.isDirty());
        assertTrue(kingRoom.isOccupied());
    }

    @Test
    public void checkOut_RoomCondition_ShouldBeAvailable(){
        //Arrange
        Room kingRoom = new Room(2,139);

        //Act
        kingRoom.checkout();

        //Assert
        assertFalse(kingRoom.isOccupied());

    }

    @Test
    public void cleanRoom_RoomCondition_CleanRoom(){
        //Arrange
        Room kingRoom = new Room(1,139);
        //Act
        kingRoom.cleanRoom();
        //Assert
        assertFalse(kingRoom.isDirty());

    }

}