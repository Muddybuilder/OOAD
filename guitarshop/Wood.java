package guitarshop;
public enum Wood {
    MAHOGANY, MAPLE, CEDAR, ALDER, SITKA;

    public String toString() {
        switch (this) {
            case MAHOGANY:
                return "mahogany";
            case MAPLE:
                return "maple";
            case CEDAR:
                return "cedar";
            case ALDER:
                return "alder";
            case SITKA:
                return "sitka";
            default:
                return "";
        }
    }
}
