package Qb;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f29924a;

    /* renamed from: b, reason: collision with root package name */
    private Long f29925b;

    /* renamed from: c, reason: collision with root package name */
    private String f29926c;

    /* renamed from: d, reason: collision with root package name */
    private List<a> f29927d;

    /* renamed from: e, reason: collision with root package name */
    private String f29928e;

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
        Long l10 = this.f29925b;
        if (l10 == null) {
            if (dVar.f29925b != null) {
                return false;
            }
        } else if (!l10.equals(dVar.f29925b)) {
            return false;
        }
        String str = this.f29924a;
        if (str == null) {
            if (dVar.f29924a != null) {
                return false;
            }
        } else if (!str.equals(dVar.f29924a)) {
            return false;
        }
        String str2 = this.f29926c;
        if (str2 == null) {
            if (dVar.f29926c != null) {
                return false;
            }
        } else if (!str2.equals(dVar.f29926c)) {
            return false;
        }
        return true;
    }

    public List<a> a() {
        return this.f29927d;
    }

    public String c() {
        return this.f29926c;
    }

    public Long getId() {
        return this.f29925b;
    }

    public String getName() {
        return this.f29924a;
    }

    public int hashCode() {
        Long l10 = this.f29925b;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        String str = this.f29924a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29926c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String w() {
        return this.f29928e;
    }
}
