package fsimpl;

/* renamed from: fsimpl.dq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14045dq {
    public static final byte ADD = 17;
    public static final byte CLEAR = 1;
    public static final byte DARKEN = 13;
    public static final byte DST = 3;
    public static final byte DST_ATOP = 11;
    public static final byte DST_IN = 7;
    public static final byte DST_OUT = 9;
    public static final byte DST_OVER = 5;
    public static final byte LIGHTEN = 14;
    public static final byte MULTIPLY = 15;
    public static final byte OVERLAY = 18;
    public static final byte SCREEN = 16;
    public static final byte SRC = 2;
    public static final byte SRC_ATOP = 10;
    public static final byte SRC_IN = 6;
    public static final byte SRC_OUT = 8;
    public static final byte SRC_OVER = 4;
    public static final byte UNAVAILABLE = 0;
    public static final byte XOR = 12;
    public static final String[] names = {"UNAVAILABLE", "CLEAR", "SRC", "DST", "SRC_OVER", "DST_OVER", "SRC_IN", "DST_IN", "SRC_OUT", "DST_OUT", "SRC_ATOP", "DST_ATOP", "XOR", "DARKEN", "LIGHTEN", "MULTIPLY", "SCREEN", "ADD", "OVERLAY"};

    private C14045dq() {
    }

    public static String name(int i10) {
        return names[i10];
    }
}
