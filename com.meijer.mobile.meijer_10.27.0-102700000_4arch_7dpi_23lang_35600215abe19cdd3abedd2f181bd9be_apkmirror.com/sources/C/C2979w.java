package C;

/* renamed from: C.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2979w {

    /* renamed from: c, reason: collision with root package name */
    public static final C2979w f3532c = new C2979w(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C2979w f3533d = new C2979w(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final C2979w f3534e = new C2979w(2, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final C2979w f3535f = new C2979w(3, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final C2979w f3536g = new C2979w(4, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final C2979w f3537h = new C2979w(5, 10);

    /* renamed from: i, reason: collision with root package name */
    public static final C2979w f3538i = new C2979w(6, 10);

    /* renamed from: j, reason: collision with root package name */
    public static final C2979w f3539j = new C2979w(6, 8);

    /* renamed from: a, reason: collision with root package name */
    private final int f3540a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3541b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2979w) {
            C2979w c2979w = (C2979w) obj;
            if (this.f3540a == c2979w.b() && this.f3541b == c2979w.a()) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f3541b;
    }

    public int b() {
        return this.f3540a;
    }

    public int hashCode() {
        return ((this.f3540a ^ 1000003) * 1000003) ^ this.f3541b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f3540a) + ", bitDepth=" + this.f3541b + "}";
    }

    public C2979w(int i10, int i11) {
        this.f3540a = i10;
        this.f3541b = i11;
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
