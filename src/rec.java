public class rec {
    double height;
    double width;

    void setParam(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double square() {
        return(height*width);
    }

    double perimetr() {
        return (2*height+2*width);
    }
}
