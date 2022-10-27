package Sprint1.Inlämningsuppgift1Växter;

    //skapar enumeratorer(enums)
    public enum TypeOfLiquid { //deklarerar konstanter med värde
        TAPWATER("kranvatten"),
        MINERALWATER("mineralvatten"),
        PROTEINDRINK("proteindryck");


        public String typeOfLiquid;

        TypeOfLiquid(String t) { //konstruktor
            this.typeOfLiquid = t;
        }



    }


