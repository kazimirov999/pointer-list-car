public enum Direction {
    LEFT(-30), RIGHT(30);

    private float degree;

    Direction(float degree) {
        this.degree = degree;
    }

    public float getDegree() {
        return degree;
    }
}
