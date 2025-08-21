package kt;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private Long f148913a;

    /* renamed from: b, reason: collision with root package name */
    private String f148914b;

    /* renamed from: c, reason: collision with root package name */
    private String f148915c;

    /* renamed from: d, reason: collision with root package name */
    private String f148916d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        String str = this.f148916d;
        if (str == null) {
            if (sVar.f148916d != null) {
                return false;
            }
        } else if (!str.equals(sVar.f148916d)) {
            return false;
        }
        Long l10 = this.f148913a;
        if (l10 == null) {
            if (sVar.f148913a != null) {
                return false;
            }
        } else if (!l10.equals(sVar.f148913a)) {
            return false;
        }
        String str2 = this.f148915c;
        if (str2 == null) {
            if (sVar.f148915c != null) {
                return false;
            }
        } else if (!str2.equals(sVar.f148915c)) {
            return false;
        }
        String str3 = this.f148914b;
        if (str3 == null) {
            if (sVar.f148914b != null) {
                return false;
            }
        } else if (!str3.equals(sVar.f148914b)) {
            return false;
        }
        return true;
    }

    public void a(String str) {
        this.f148915c = str;
    }

    public void b(String str) {
        this.f148914b = str;
    }

    public int hashCode() {
        String str = this.f148916d;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Long l10 = this.f148913a;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.f148915c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f148914b;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "UserPushDetail [id=" + this.f148913a + ", token=" + this.f148914b + ", platform=" + this.f148915c + ", deviceId=" + this.f148916d + "]";
    }
}
