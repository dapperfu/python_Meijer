package of;

import of.L;

/* renamed from: of.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16035c extends L.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f153492a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153493b;

    /* renamed from: c, reason: collision with root package name */
    private final String f153494c;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof L.a) {
            L.a aVar = (L.a) obj;
            if (this.f153492a.equals(aVar.c()) && ((str = this.f153493b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f153494c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // of.L.a
    public String c() {
        return this.f153492a;
    }

    @Override // of.L.a
    public String d() {
        return this.f153494c;
    }

    @Override // of.L.a
    public String e() {
        return this.f153493b;
    }

    public int hashCode() {
        int iHashCode = (this.f153492a.hashCode() ^ 1000003) * 1000003;
        String str = this.f153493b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f153494c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f153492a + ", firebaseInstallationId=" + this.f153493b + ", firebaseAuthenticationToken=" + this.f153494c + "}";
    }

    C16035c(String str, String str2, String str3) {
        if (str != null) {
            this.f153492a = str;
            this.f153493b = str2;
            this.f153494c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }
}
