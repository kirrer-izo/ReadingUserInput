public class PaintJob {

    public static void main(String[] args) {

    }

    public static int getBucketCount (double width, double height, double areaPerBucket ,int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double bucketsRequired = (area / areaPerBucket) - extraBuckets;


        return (int) Math.ceil(bucketsRequired);
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        double bucketsRequired = (area / areaPerBucket);


        return (int) Math.ceil(bucketsRequired);
    }



}
