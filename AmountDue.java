class AmountDue {
        
        public double computeAmountDue(double price) { 
            return (price)+(price*.12); 
        } 

        public double computeAmountDue(double price, double quantity) { 
            return (price)+(price*.12)*quantity; 
        } 

        public double computeAmountDue(double price, double quantity, double discount) { 
            return ((price*quantity)-discount)+(price*.12); 
        } 
    }
