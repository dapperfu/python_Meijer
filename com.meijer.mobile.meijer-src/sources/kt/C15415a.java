package kt;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15415a implements k {

    /* renamed from: a, reason: collision with root package name */
    private Long f148859a;

    /* renamed from: b, reason: collision with root package name */
    private String f148860b;

    /* renamed from: c, reason: collision with root package name */
    private Long f148861c;

    /* renamed from: d, reason: collision with root package name */
    private String f148862d;

    /* renamed from: e, reason: collision with root package name */
    private List<l> f148863e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private String f148864f;

    @Override // kt.k
    public C15420f a2() {
        return null;
    }

    @Override // kt.k
    public C15419e c2() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15415a c15415a = (C15415a) obj;
        Long l10 = this.f148859a;
        if (l10 == null) {
            if (c15415a.f148859a != null) {
                return false;
            }
        } else if (!l10.equals(c15415a.f148859a)) {
            return false;
        }
        return true;
    }

    public Long a() {
        return this.f148861c;
    }

    public List<l> b() {
        return this.f148863e;
    }

    public String c() {
        return this.f148860b;
    }

    @Override // kt.k
    public Long getId() {
        return this.f148859a;
    }

    @Override // kt.k
    public String getName() {
        return this.f148862d;
    }

    public int hashCode() {
        Long l10 = this.f148859a;
        return (l10 == null ? 0 : l10.hashCode()) + 31;
    }

    public String toString() {
        return "BasePlace [id=" + this.f148859a + ", uuid=" + this.f148860b + ", organizationId=" + this.f148861c + ", name=" + this.f148862d + ", geoFenceCircle=" + ((Object) null) + ", geoFencePolygon=" + ((Object) null) + ", placeAttributes=" + this.f148863e + "]";
    }

    @Override // kt.k
    public String w() {
        return this.f148864f;
    }
}
