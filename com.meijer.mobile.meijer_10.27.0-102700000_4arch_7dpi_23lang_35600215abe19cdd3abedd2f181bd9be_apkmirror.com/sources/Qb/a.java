package Qb;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f29921a;

    /* renamed from: b, reason: collision with root package name */
    private String f29922b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f29921a;
        if (str == null) {
            if (aVar.f29921a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f29921a)) {
            return false;
        }
        String str2 = this.f29922b;
        if (str2 == null) {
            if (aVar.f29922b != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f29922b)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f29921a;
    }

    public String b() {
        return this.f29922b;
    }

    public int hashCode() {
        String str = this.f29921a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f29922b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
