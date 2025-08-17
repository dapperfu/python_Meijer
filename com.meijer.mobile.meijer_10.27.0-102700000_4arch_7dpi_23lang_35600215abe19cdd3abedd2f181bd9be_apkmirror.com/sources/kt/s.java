package kt;

/* loaded from: classes11.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private Long f148003a;

    /* renamed from: b, reason: collision with root package name */
    private String f148004b;

    /* renamed from: c, reason: collision with root package name */
    private String f148005c;

    /* renamed from: d, reason: collision with root package name */
    private String f148006d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        String str = this.f148006d;
        if (str == null) {
            if (sVar.f148006d != null) {
                return false;
            }
        } else if (!str.equals(sVar.f148006d)) {
            return false;
        }
        Long l10 = this.f148003a;
        if (l10 == null) {
            if (sVar.f148003a != null) {
                return false;
            }
        } else if (!l10.equals(sVar.f148003a)) {
            return false;
        }
        String str2 = this.f148005c;
        if (str2 == null) {
            if (sVar.f148005c != null) {
                return false;
            }
        } else if (!str2.equals(sVar.f148005c)) {
            return false;
        }
        String str3 = this.f148004b;
        if (str3 == null) {
            if (sVar.f148004b != null) {
                return false;
            }
        } else if (!str3.equals(sVar.f148004b)) {
            return false;
        }
        return true;
    }

    public void a(String str) {
        this.f148005c = str;
    }

    public void b(String str) {
        this.f148004b = str;
    }

    public int hashCode() {
        String str = this.f148006d;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Long l10 = this.f148003a;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.f148005c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f148004b;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "UserPushDetail [id=" + this.f148003a + ", token=" + this.f148004b + ", platform=" + this.f148005c + ", deviceId=" + this.f148006d + "]";
    }
}
