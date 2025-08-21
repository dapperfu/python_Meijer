package C;

/* renamed from: C.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3037w {

    /* renamed from: c, reason: collision with root package name */
    public static final C3037w f3990c = new C3037w(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C3037w f3991d = new C3037w(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final C3037w f3992e = new C3037w(2, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final C3037w f3993f = new C3037w(3, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final C3037w f3994g = new C3037w(4, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final C3037w f3995h = new C3037w(5, 10);

    /* renamed from: i, reason: collision with root package name */
    public static final C3037w f3996i = new C3037w(6, 10);

    /* renamed from: j, reason: collision with root package name */
    public static final C3037w f3997j = new C3037w(6, 8);

    /* renamed from: a, reason: collision with root package name */
    private final int f3998a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3999b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3037w) {
            C3037w c3037w = (C3037w) obj;
            if (this.f3998a == c3037w.b() && this.f3999b == c3037w.a()) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f3999b;
    }

    public int b() {
        return this.f3998a;
    }

    public int hashCode() {
        return ((this.f3998a ^ 1000003) * 1000003) ^ this.f3999b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f3998a) + ", bitDepth=" + this.f3999b + "}";
    }

    public C3037w(int i10, int i11) {
        this.f3998a = i10;
        this.f3999b = i11;
    }

    private static String c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public boolean d() {
        if (e() && b() != 1 && a() == 10) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (b() != 0 && b() != 2 && a() != 0) {
            return true;
        }
        return false;
    }
}
