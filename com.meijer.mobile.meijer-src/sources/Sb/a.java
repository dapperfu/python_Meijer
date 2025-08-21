package Sb;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f34471a;

    /* renamed from: b, reason: collision with root package name */
    private String f34472b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f34471a;
        if (str == null) {
            if (aVar.f34471a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f34471a)) {
            return false;
        }
        String str2 = this.f34472b;
        if (str2 == null) {
            if (aVar.f34472b != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f34472b)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f34471a;
    }

    public String b() {
        return this.f34472b;
    }

    public int hashCode() {
        String str = this.f34471a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f34472b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
