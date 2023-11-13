package de.tum.cit.ase;

public class BusLine {
        private int lineNumber;
        private int oneRoundDuration;
        private BusDriver firstDriver;
        private BusDriver secondDriver;
        private Bus bus;

        public BusLine(int lineNumber, int oneRoundDuration, BusDriver firstDriver, BusDriver secondDriver) {
            this.lineNumber = lineNumber;
            this.oneRoundDuration = oneRoundDuration;
            this.firstDriver = firstDriver;
            this.secondDriver = secondDriver;
            this.bus = new Bus();

        }

        public void doOneRound(BusDriver driver) {
            firstDriver.startShift();
            System.out.println("... " + oneRoundDuration + " hour(s) later...");
            String endShiftMessage = firstDriver.getEndShiftString(oneRoundDuration);
            System.out.println(endShiftMessage.toUpperCase());

            secondDriver.startShift();
            System.out.println("... " + oneRoundDuration + " hour(s) later...");
            endShiftMessage = secondDriver.getEndShiftString(oneRoundDuration);
            System.out.println(endShiftMessage.toUpperCase());
        }


    }

