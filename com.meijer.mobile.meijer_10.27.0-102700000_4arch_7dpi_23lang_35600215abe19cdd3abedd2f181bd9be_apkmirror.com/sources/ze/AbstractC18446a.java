package ze;

/* renamed from: ze.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC18446a extends AbstractC18449d {

    /* renamed from: a, reason: collision with root package name */
    private final int f171799a;

    /* renamed from: b, reason: collision with root package name */
    private final int f171800b;

    /* renamed from: c, reason: collision with root package name */
    private final String f171801c;

    /* renamed from: d, reason: collision with root package name */
    private final String f171802d;

    /* renamed from: e, reason: collision with root package name */
    private final String f171803e;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC18449d) {
            AbstractC18449d abstractC18449d = (AbstractC18449d) obj;
            if (this.f171799a == abstractC18449d.getWidth() && this.f171800b == abstractC18449d.getHeight() && ((str = this.f171801c) != null ? str.equals(abstractC18449d.F0()) : abstractC18449d.F0() == null) && ((str2 = this.f171802d) != null ? str2.equals(abstractC18449d.b()) : abstractC18449d.b() == null) && ((str3 = this.f171803e) != null ? str3.equals(abstractC18449d.c()) : abstractC18449d.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ze.AbstractC18449d
    public String F0() {
        return this.f171801c;
    }

    @Override // ze.AbstractC18449d
    public String b() {
        return this.f171802d;
    }

    @Override // ze.AbstractC18449d
    public String c() {
        return this.f171803e;
    }

    @Override // ze.AbstractC18449d
    public int getHeight() {
        return this.f171800b;
    }

    @Override // ze.AbstractC18449d
    public int getWidth() {
        return this.f171799a;
    }

    public final int hashCode() {
        int i10 = ((this.f171799a ^ 1000003) * 1000003) ^ this.f171800b;
        String str = this.f171801c;
        int iHashCode = ((i10 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f171802d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f171803e;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "IconClickFallbackImage{width=" + this.f171799a + ", height=" + this.f171800b + ", altText=" + this.f171801c + ", creativeType=" + this.f171802d + ", staticResourceUri=" + this.f171803e + "}";
    }

    AbstractC18446a(int i10, int i11, String str, String str2, String str3) {
        this.f171799a = i10;
        this.f171800b = i11;
        this.f171801c = str;
        this.f171802d = str2;
        this.f171803e = str3;
    }
}
