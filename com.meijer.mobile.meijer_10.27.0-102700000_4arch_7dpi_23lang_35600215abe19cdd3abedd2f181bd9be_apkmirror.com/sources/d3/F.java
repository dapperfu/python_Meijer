package d3;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: c, reason: collision with root package name */
    public static final F f127068c = new F(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final F f127069d = new F(0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f127070a;

    /* renamed from: b, reason: collision with root package name */
    private final int f127071b;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            F f10 = (F) obj;
            if (this.f127070a == f10.f127070a && this.f127071b == f10.f127071b) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f127071b;
    }

    public int b() {
        return this.f127070a;
    }

    public int hashCode() {
        int i10 = this.f127071b;
        int i11 = this.f127070a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f127070a + "x" + this.f127071b;
    }

    public F(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        C13466a.a(z10);
        this.f127070a = i10;
        this.f127071b = i11;
    }
}
