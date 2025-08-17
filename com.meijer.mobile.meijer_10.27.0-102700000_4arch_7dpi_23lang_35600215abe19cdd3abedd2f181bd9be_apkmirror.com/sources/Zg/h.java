package Zg;

/* loaded from: classes7.dex */
public enum h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: a, reason: collision with root package name */
    private final int[] f42743a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42744b;

    public static h a(int i10) {
        if (i10 == 0) {
            return TERMINATOR;
        }
        if (i10 == 1) {
            return NUMERIC;
        }
        if (i10 == 2) {
            return ALPHANUMERIC;
        }
        if (i10 == 3) {
            return STRUCTURED_APPEND;
        }
        if (i10 == 4) {
            return BYTE;
        }
        if (i10 == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i10 == 7) {
            return ECI;
        }
        if (i10 == 8) {
            return KANJI;
        }
        if (i10 == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i10 == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return this.f42744b;
    }

    h(int[] iArr, int i10) {
        this.f42743a = iArr;
        this.f42744b = i10;
    }

    public int e(j jVar) {
        char c10;
        int iJ = jVar.j();
        if (iJ <= 9) {
            c10 = 0;
        } else if (iJ <= 26) {
            c10 = 1;
        } else {
            c10 = 2;
        }
        return this.f42743a[c10];
    }
}
