class Test {
    public static void main(String[] args) {
        Pointcol p = new Pointcol(1, 2, (byte) 3);
        p.afficheCol();
        p.colorer((byte) 4);
        p.afficheCol();
    }
}