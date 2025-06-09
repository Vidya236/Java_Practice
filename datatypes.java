class datatypes {
    public static void main(String[] args) {
        String brand_name = "Highlander";
        System.out.println("Brand name: " + brand_name);

        String model = "Men comfort Relaxed Fit Textured Spread Collar Casual Shirt";
        System.out.println("Model: " + model);

        float rating = 4.6f;
        System.out.println("Rating: " + rating);

        short price = 750;
        System.out.println("Price: " + price);

        byte size = 41;
        char sizess = 'L';
        System.out.printf("size: %d %c\n", size, sizess);

        short retailPrice = 3949;
        System.out.println("Retail Price: " + retailPrice);

        byte offer = 81;
        System.out.println("Offer: " + offer + "%");

        boolean isOrderPlaced = true;
        System.out.println("Is Order Placed: " + isOrderPlaced);
        System.out.println("\n");

        String carModel = "Mahindra Thar";
        System.out.println("Car Model: " + carModel);

        float priceRangeFrom = 11.50f;
        float priceRangeTo = 17.62f;
        System.out.printf("Price Range: %.2f - %.2f Lakh\n", priceRangeFrom, priceRangeTo);

        int emi = 310238;
        System.out.println("EMI: " + emi);

        int monthlyEmi = emi / 36;
        System.out.println("Monthly EMI: " + monthlyEmi);

        byte reviews = 14;
        char c = 'k';
        System.out.println("Reviews: " + reviews + c);

        float power = 116.53f;
        float pow = 150.19f;
        System.out.printf("Power: %.2f - %.2f BHP \n", power, pow);

        long mileage = 1500000;
        System.out.println("Mileage: " + mileage);

    }
}
