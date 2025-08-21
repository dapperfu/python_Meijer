package h6;

/* loaded from: classes4.dex */
public enum K {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean b(int i10, boolean z10, int i11) {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if ((!z10 || i10 >= 28) && i11 <= 4 && i10 > 25) {
            return false;
        }
        return true;
    }
}
