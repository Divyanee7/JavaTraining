package com.yash.carparking;

public class CarParking {
    private Car[][] parkingSlots=new Car[5][];

    public CarParking()
    {
        parkingSlots[0]=new Car[5];
        parkingSlots[1]=new Car[4];
        parkingSlots[2]=new Car[3];
        parkingSlots[3]=new Car[2];
        parkingSlots[4]=new Car[1];
    }
    public void showAvailability()
    {
        System.out.println("Parking Availability: ");
        for(int i=0; i<parkingSlots.length; i++) //row
        {
            int available=0;
            for(Car slot:parkingSlots[i])  //column
            {
                if(slot==null)
                    available++;
            }
            System.out.println("Parking slots on floor "+(i+1)+" is "+available);
        }
    }

    public boolean parkCar(Car car)
    {
        for(int i=0; i<parkingSlots.length; i++)
        {
            for(int j=0; j<parkingSlots[i].length; j++)
            {
                if(parkingSlots[i][j]==null)
                {
                    parkingSlots[i][j]=car;
                    System.out.println("Car Parked on the floor: "+(i+1)+" with token "+car.getTokenNumber());
                    return true;
                }
            }
        }
        System.out.println("Parking is full");
        return false;
    }

    public boolean getCar(int tokenNo)
    {
        for(int i=0; i<parkingSlots.length; i++) //row
        {
            for(int j=0; j<parkingSlots[i].length; j++) //column
            {
                if(parkingSlots[i][j]!=null && parkingSlots[i][j].getTokenNumber()==tokenNo)
                {
                    System.out.println("Car retrieved from the parking on floor "+(i+1));
                    parkingSlots[i][j]=null;
                    return true;
                }
            }

        }
        System.out.println("Car with token number "+tokenNo+" Not Found");
        return false;
    }


}
