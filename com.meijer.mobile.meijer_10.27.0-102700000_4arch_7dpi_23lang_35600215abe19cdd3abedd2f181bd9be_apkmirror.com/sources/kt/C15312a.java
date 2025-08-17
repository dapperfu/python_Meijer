package kt;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15312a implements k {

    /* renamed from: a, reason: collision with root package name */
    private Long f147949a;

    /* renamed from: b, reason: collision with root package name */
    private String f147950b;

    /* renamed from: c, reason: collision with root package name */
    private Long f147951c;

    /* renamed from: d, reason: collision with root package name */
    private String f147952d;

    /* renamed from: e, reason: collision with root package name */
    private List<l> f147953e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private String f147954f;

    @Override // kt.k
    public C15317f a2() {
        return null;
    }

    @Override // kt.k
    public C15316e d2() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15312a c15312a = (C15312a) obj;
        Long l10 = this.f147949a;
        if (l10 == null) {
            if (c15312a.f147949a != null) {
                return false;
            }
        } else if (!l10.equals(c15312a.f147949a)) {
            return false;
        }
        return true;
    }

    public Long a() {
        return this.f147951c;
    }

    public List<l> b() {
        return this.f147953e;
    }

    public String c() {
        return this.f147950b;
    }

    @Override // kt.k
    public Long getId() {
        return this.f147949a;
    }

    @Override // kt.k
    public String getName() {
        return this.f147952d;
    }

    public int hashCode() {
        Long l10 = this.f147949a;
        return (l10 == null ? 0 : l10.hashCode()) + 31;
    }

    public String toString() {
        return "BasePlace [id=" + this.f147949a + ", uuid=" + this.f147950b + ", organizationId=" + this.f147951c + ", name=" + this.f147952d + ", geoFenceCircle=" + ((Object) null) + ", geoFencePolygon=" + ((Object) null) + ", placeAttributes=" + this.f147953e + "]";
    }

    @Override // kt.k
    public String w() {
        return this.f147954f;
    }
}
