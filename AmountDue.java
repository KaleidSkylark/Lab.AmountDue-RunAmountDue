class AmountDue {

        // Overloaded computeAmountDue(). This sum takes 1 double parameter 
        public double computeAmountDue(double price) { 
            return (price)+(price*.12); 
        } 
      
        // Overloaded computeAmountDue(). This sum takes 2 double parameters 
        public double computeAmountDue(double price, double quantity) { 
            return (price)+(price*.12)*quantity; 
        } 
      
        // Overloaded computeAmountDue(). This sum takes 3 double parameters 
        public double computeAmountDue(double price, double quantity, double discount) { 
            return ((price*quantity)-discount)+(price*.12); 
        } 
    }
