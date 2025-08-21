package Be;

/* loaded from: classes4.dex */
abstract class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final int f2713a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2714b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2715c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2716d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2717e;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f2713a == dVar.getWidth() && this.f2714b == dVar.getHeight() && ((str = this.f2715c) != null ? str.equals(dVar.E0()) : dVar.E0() == null) && ((str2 = this.f2716d) != null ? str2.equals(dVar.b()) : dVar.b() == null) && ((str3 = this.f2717e) != null ? str3.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // Be.d
    public String E0() {
        return this.f2715c;
    }

    @Override // Be.d
    public String b() {
        return this.f2716d;
    }

    @Override // Be.d
    public String c() {
        return this.f2717e;
    }

    @Override // Be.d
    public int getHeight() {
        return this.f2714b;
    }

    @Override // Be.d
    public int getWidth() {
        return this.f2713a;
    }

    public final int hashCode() {
        int i10 = ((this.f2713a ^ 1000003) * 1000003) ^ this.f2714b;
        String str = this.f2715c;
        int iHashCode = ((i10 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2716d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2717e;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "IconClickFallbackImage{width=" + this.f2713a + ", height=" + this.f2714b + ", altText=" + this.f2715c + ", creativeType=" + this.f2716d + ", staticResourceUri=" + this.f2717e + "}";
    }

    a(int i10, int i11, String str, String str2, String str3) {
        this.f2713a = i10;
        this.f2714b = i11;
        this.f2715c = str;
        this.f2716d = str2;
        this.f2717e = str3;
    }
}
