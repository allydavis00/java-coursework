//Allyson Davis
//Exercise 10.15
//PieceWorker.java

public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    // five-argument constructor
    public PieceWorker(String firstname, String lastname, String ssn, double wage, int pieces) {
        super(firstname, lastname, ssn );

        //if wage is invalid throw exception
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }

        //if pieces is invalid throw exception
        if (pieces < 0) {
            throw new IllegalArgumentException("Pieces must be >= 0");
        }

        this.wage = wage;
        this.pieces = pieces;
    }// end five-argument PieceworkerEmployee constructor

    //sets wages of employee
    public void setWage(double wage) {
        //if wage is invalid throw exception
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }//end setWage

    // gets wages of employee  
    public double getWage() {
        return wage;
    }//end getWage

    // sets number of pieces produced by employee
    public void setPieces(int piece) {
        //if pieces is invalid throw exception
        if (pieces < 0) {
            throw new IllegalArgumentException("Pieces must be >= 0");
        }
        this.pieces = pieces;
    }//end setPieces

    // returns number of pieces
    public int getPieces() {
        return pieces;
    }//end getPieces

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWage()*getPieces();
    }//end earnings

    // return String representation of PieceworkerEmployee object
    @Override
    public String toString() {
        return String.format( "%s: %s\n%s: $%,.2f; %s: %,d", "Piece worker", super.toString(), "wage per piece", getWage(), "pieces produced", getPieces() );
    }// end of toString method

}//end class