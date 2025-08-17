package x3;

/* renamed from: x3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18009n {

    /* renamed from: a, reason: collision with root package name */
    public final int f169235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f169236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f169237c;

    public static C18009n a(d3.D d10) {
        String str;
        d10.X(2);
        int iH = d10.H();
        int i10 = iH >> 1;
        int iH2 = ((d10.H() >> 3) & 31) | ((iH & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(iH2 < 10 ? ".0" : ".");
        sb2.append(iH2);
        return new C18009n(i10, iH2, sb2.toString());
    }

    private C18009n(int i10, int i11, String str) {
        this.f169235a = i10;
        this.f169236b = i11;
        this.f169237c = str;
    }
}
