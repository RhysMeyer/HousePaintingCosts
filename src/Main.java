public class Main {
    public static void main (String[] args) {

        int costOfPaintPerCanInPence = 1000;
        double wallLengthInMm = Math.random() * 100;
        double wallHeightInMm = Math.random() * 100;
        double wallAreaInMmSq = wallLengthInMm*wallHeightInMm;
        double areaPerLitreMmSq = 2000;

        boolean featureWall = false;
        double featureWallLengthInMm = Math.random() * 100;
        double featureWallHeightInMm = Math.random() * 100;
        double featureWallAreaInMmSq = featureWallLengthInMm*featureWallHeightInMm;
        int costOfFeaturePaintPerCanInPence = 3000;
        int NumOfWalls = 4;
        double TotalCost = wallAreaInMmSq * NumOfWalls;

        int cansNeededNormal=0;
        int cansNeededFeature=0;

        if(featureWall ==  true)
        {
            cansNeededNormal = (int) Math.ceil(wallAreaInMmSq*3/areaPerLitreMmSq);
            cansNeededFeature = (int) Math.ceil(featureWallAreaInMmSq/areaPerLitreMmSq);

            TotalCost = (costOfPaintPerCanInPence * cansNeededNormal)/100*3 + (cansNeededFeature * costOfFeaturePaintPerCanInPence / 100);
            System.out.println("To Paint a room you will need to spend £" +(TotalCost)+ " for " + (cansNeededNormal + cansNeededFeature) + " cans! in order to pain an area of " + (wallAreaInMmSq*3+featureWallAreaInMmSq)/1000 + " M/s, including a feature wall");
        }
        else
        {
            cansNeededNormal = (int) Math.ceil(wallAreaInMmSq*4/areaPerLitreMmSq);
            TotalCost = (costOfPaintPerCanInPence * cansNeededNormal)/100*4;
            System.out.println("To Paint a room you will need to spend £" +(TotalCost)+ " for " + (cansNeededNormal + cansNeededFeature) + " cans! in order to pain an area of " + (wallAreaInMmSq*4)/1000 + " M/s without a feature wall.");
        }
    }
}