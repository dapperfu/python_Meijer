package kt;

import java.io.Serializable;

/* renamed from: kt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC15416b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f148865a;

    /* renamed from: b, reason: collision with root package name */
    private String f148866b;

    /* renamed from: c, reason: collision with root package name */
    private Long f148867c;

    /* renamed from: d, reason: collision with root package name */
    private Long f148868d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC15416b abstractC15416b = (AbstractC15416b) obj;
        Long l10 = this.f148865a;
        if (l10 == null) {
            if (abstractC15416b.f148865a != null) {
                return false;
            }
        } else if (!l10.equals(abstractC15416b.f148865a)) {
            return false;
        }
        Long l11 = this.f148867c;
        if (l11 == null) {
            if (abstractC15416b.f148867c != null) {
                return false;
            }
        } else if (!l11.equals(abstractC15416b.f148867c)) {
            return false;
        }
        Long l12 = this.f148868d;
        if (l12 == null) {
            if (abstractC15416b.f148868d != null) {
                return false;
            }
        } else if (!l12.equals(abstractC15416b.f148868d)) {
            return false;
        }
        String str = this.f148866b;
        if (str == null) {
            if (abstractC15416b.f148866b != null) {
                return false;
            }
        } else if (!str.equals(abstractC15416b.f148866b)) {
            return false;
        }
        return true;
    }

    public Long a() {
        return this.f148867c;
    }

    public Long b() {
        return this.f148868d;
    }

    public String c() {
        return this.f148866b;
    }

    public void d(Long l10) {
        this.f148867c = l10;
    }

    public void e(Long l10) {
        this.f148868d = l10;
    }

    public void f(String str) {
        this.f148866b = str;
    }

    public int hashCode() {
        Long l10 = this.f148865a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Long l11 = this.f148867c;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f148868d;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f148866b;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format("BasePlaceEvent [id=%s, type=%s, placeId=%s, time=%s]", this.f148865a, this.f148866b, this.f148867c, this.f148868d);
    }
}
