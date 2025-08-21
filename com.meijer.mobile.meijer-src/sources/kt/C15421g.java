package kt;

import java.io.Serializable;

/* renamed from: kt.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15421g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f148873a;

    /* renamed from: b, reason: collision with root package name */
    private Double f148874b;

    /* renamed from: c, reason: collision with root package name */
    private Double f148875c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15421g c15421g = (C15421g) obj;
        Long l10 = this.f148873a;
        if (l10 == null) {
            if (c15421g.f148873a != null) {
                return false;
            }
        } else if (!l10.equals(c15421g.f148873a)) {
            return false;
        }
        Double d10 = this.f148874b;
        if (d10 == null) {
            if (c15421g.f148874b != null) {
                return false;
            }
        } else if (!d10.equals(c15421g.f148874b)) {
            return false;
        }
        Double d11 = this.f148875c;
        if (d11 == null) {
            if (c15421g.f148875c != null) {
                return false;
            }
        } else if (!d11.equals(c15421g.f148875c)) {
            return false;
        }
        return true;
    }

    public Double a() {
        return this.f148874b;
    }

    public Double b() {
        return this.f148875c;
    }

    public int hashCode() {
        Long l10 = this.f148873a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Double d10 = this.f148874b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f148875c;
        return iHashCode2 + (d11 != null ? d11.hashCode() : 0);
    }

    public String toString() {
        return String.format("Location [id=%s, latitude=%s, longitude=%s]", this.f148873a, this.f148874b, this.f148875c);
    }
}
