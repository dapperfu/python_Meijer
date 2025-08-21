package kt;

import java.io.Serializable;

/* loaded from: classes12.dex */
public class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f148887a;

    /* renamed from: b, reason: collision with root package name */
    private String f148888b;

    /* renamed from: c, reason: collision with root package name */
    private String f148889c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        Long l10 = this.f148887a;
        if (l10 == null) {
            if (lVar.f148887a != null) {
                return false;
            }
        } else if (!l10.equals(lVar.f148887a)) {
            return false;
        }
        String str = this.f148888b;
        if (str == null) {
            if (lVar.f148888b != null) {
                return false;
            }
        } else if (!str.equals(lVar.f148888b)) {
            return false;
        }
        String str2 = this.f148889c;
        if (str2 == null) {
            if (lVar.f148889c != null) {
                return false;
            }
        } else if (!str2.equals(lVar.f148889c)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f148888b;
    }

    public String b() {
        return this.f148889c;
    }

    public int hashCode() {
        Long l10 = this.f148887a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        String str = this.f148888b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f148889c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PlaceAttribute [id=" + this.f148887a + ", key=" + this.f148888b + ", value=" + this.f148889c + "]";
    }
}
