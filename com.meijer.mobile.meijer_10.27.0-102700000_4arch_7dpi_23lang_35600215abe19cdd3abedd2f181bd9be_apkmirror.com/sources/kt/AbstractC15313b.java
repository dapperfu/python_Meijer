package kt;

import java.io.Serializable;

/* renamed from: kt.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15313b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f147955a;

    /* renamed from: b, reason: collision with root package name */
    private String f147956b;

    /* renamed from: c, reason: collision with root package name */
    private Long f147957c;

    /* renamed from: d, reason: collision with root package name */
    private Long f147958d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC15313b abstractC15313b = (AbstractC15313b) obj;
        Long l10 = this.f147955a;
        if (l10 == null) {
            if (abstractC15313b.f147955a != null) {
                return false;
            }
        } else if (!l10.equals(abstractC15313b.f147955a)) {
            return false;
        }
        Long l11 = this.f147957c;
        if (l11 == null) {
            if (abstractC15313b.f147957c != null) {
                return false;
            }
        } else if (!l11.equals(abstractC15313b.f147957c)) {
            return false;
        }
        Long l12 = this.f147958d;
        if (l12 == null) {
            if (abstractC15313b.f147958d != null) {
                return false;
            }
        } else if (!l12.equals(abstractC15313b.f147958d)) {
            return false;
        }
        String str = this.f147956b;
        if (str == null) {
            if (abstractC15313b.f147956b != null) {
                return false;
            }
        } else if (!str.equals(abstractC15313b.f147956b)) {
            return false;
        }
        return true;
    }

    public Long a() {
        return this.f147957c;
    }

    public Long b() {
        return this.f147958d;
    }

    public String c() {
        return this.f147956b;
    }

    public void d(Long l10) {
        this.f147957c = l10;
    }

    public void e(Long l10) {
        this.f147958d = l10;
    }

    public void f(String str) {
        this.f147956b = str;
    }

    public int hashCode() {
        Long l10 = this.f147955a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Long l11 = this.f147957c;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f147958d;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f147956b;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format("BasePlaceEvent [id=%s, type=%s, placeId=%s, time=%s]", this.f147955a, this.f147956b, this.f147957c, this.f147958d);
    }
}
