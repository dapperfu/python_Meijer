package qf;

import qf.L;

/* renamed from: qf.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C16643c extends L.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f158344a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158345b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158346c;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof L.a) {
            L.a aVar = (L.a) obj;
            if (this.f158344a.equals(aVar.c()) && ((str = this.f158345b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f158346c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // qf.L.a
    public String c() {
        return this.f158344a;
    }

    @Override // qf.L.a
    public String d() {
        return this.f158346c;
    }

    @Override // qf.L.a
    public String e() {
        return this.f158345b;
    }

    public int hashCode() {
        int iHashCode = (this.f158344a.hashCode() ^ 1000003) * 1000003;
        String str = this.f158345b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f158346c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f158344a + ", firebaseInstallationId=" + this.f158345b + ", firebaseAuthenticationToken=" + this.f158346c + "}";
    }

    C16643c(String str, String str2, String str3) {
        if (str != null) {
            this.f158344a = str;
            this.f158345b = str2;
            this.f158346c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }
}
