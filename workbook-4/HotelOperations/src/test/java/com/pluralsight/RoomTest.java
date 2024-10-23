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
        kingRoom.checkIn();

        //Assert
        assertTrue(kingRoom.isDirty());
        assertTrue(kingRoom.isOccupied());
    }

}