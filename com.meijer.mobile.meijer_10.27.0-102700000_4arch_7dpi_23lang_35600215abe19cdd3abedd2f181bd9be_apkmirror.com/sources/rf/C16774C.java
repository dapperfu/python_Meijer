package rf;

import rf.AbstractC16778G;

/* renamed from: rf.C, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16774C extends AbstractC16778G.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f158194a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158195b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158196c;

    /* renamed from: d, reason: collision with root package name */
    private final String f158197d;

    /* renamed from: e, reason: collision with root package name */
    private final int f158198e;

    /* renamed from: f, reason: collision with root package name */
    private final lf.f f158199f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16778G.a) {
            AbstractC16778G.a aVar = (AbstractC16778G.a) obj;
            if (this.f158194a.equals(aVar.a()) && this.f158195b.equals(aVar.f()) && this.f158196c.equals(aVar.g()) && this.f158197d.equals(aVar.e()) && this.f158198e == aVar.c() && this.f158199f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // rf.AbstractC16778G.a
    public String a() {
        return this.f158194a;
    }

    @Override // rf.AbstractC16778G.a
    public int c() {
        return this.f158198e;
    }

    @Override // rf.AbstractC16778G.a
    public lf.f d() {
        return this.f158199f;
    }

    @Override // rf.AbstractC16778G.a
    public String e() {
        return this.f158197d;
    }

    @Override // rf.AbstractC16778G.a
    public String f() {
        return this.f158195b;
    }

    @Override // rf.AbstractC16778G.a
    public String g() {
        return this.f158196c;
    }

    public int hashCode() {
        return ((((((((((this.f158194a.hashCode() ^ 1000003) * 1000003) ^ this.f158195b.hashCode()) * 1000003) ^ this.f158196c.hashCode()) * 1000003) ^ this.f158197d.hashCode()) * 1000003) ^ this.f158198e) * 1000003) ^ this.f158199f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f158194a + ", versionCode=" + this.f158195b + ", versionName=" + this.f158196c + ", installUuid=" + this.f158197d + ", deliveryMechanism=" + this.f158198e + ", developmentPlatformProvider=" + this.f158199f + "}";
    }

    C16774C(String str, String str2, String str3, String str4, int i10, lf.f fVar) {
        if (str != null) {
            this.f158194a = str;
            if (str2 != null) {
                this.f158195b = str2;
                if (str3 != null) {
                    this.f158196c = str3;
                    if (str4 != null) {
                        this.f158197d = str4;
                        this.f158198e = i10;
                        if (fVar != null) {
                            this.f158199f = fVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }
}
