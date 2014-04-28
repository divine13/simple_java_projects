class EnumTest{
	public static void main(String[] args) {
		Colors colors = new Colors();
        colors.color = Colors.ThreeColors.RED;
        System.out.println(colors.color);
	}
}
class Colors{
	enum ThreeColors {BLUE, RED, GREEN}
	ThreeColors color;
}