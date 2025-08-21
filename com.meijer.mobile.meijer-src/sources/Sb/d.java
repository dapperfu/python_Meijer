package Sb;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f34474a;

    /* renamed from: b, reason: collision with root package name */
    private Long f34475b;

    /* renamed from: c, reason: collision with root package name */
    private String f34476c;

    /* renamed from: d, reason: collision with root package name */
    private List<a> f34477d;

    /* renamed from: e, reason: collision with root package name */
    private String f34478e;

    public c b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        Long l10 = this.f34475b;
        if (l10 == null) {
            if (dVar.f34475b != null) {
                return false;
            }
        } else if (!l10.equals(dVar.f34475b)) {
            return false;
        }
        String str = this.f34474a;
        if (str == null) {
            if (dVar.f34474a != null) {
                return false;
            }
        } else if (!str.equals(dVar.f34474a)) {
            return false;
        }
        String str2 = this.f34476c;
        if (str2 == null) {
            if (dVar.f34476c != null) {
                return false;
            }
        } else if (!str2.equals(dVar.f34476c)) {
            return false;
        }
        return true;
    }

    public List<a> a() {
        return this.f34477d;
    }

    public String c() {
        return this.f34476c;
    }

    public Long getId() {
        return this.f34475b;
    }

    public String getName() {
        return this.f34474a;
    }

    public int hashCode() {
        Long l10 = this.f34475b;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        String str = this.f34474a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34476c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String w() {
        return this.f34478e;
    }
}
