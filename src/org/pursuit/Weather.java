package org.pursuit;
//
//public enum Weather {
////    SUNNY,
////    RAINY,
////    CLOUDY,
////    UNKNOWN,

    public enum Weather {
        SUNNY("Wear sunglasses!"),
        RAINY("Wear a raincoat!"),
        CLOUDY("Wear a jacket!"),
        UNKNOWN("I don't know what to wear! Ack!!!");

        private String text;

        private Weather(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
//enum not used in app cuz take too muc mem
// stack overflow enum
