package kt;

/* renamed from: kt.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15423i extends AbstractC15416b {

    /* renamed from: e, reason: collision with root package name */
    private Long f148883e;

    /* renamed from: f, reason: collision with root package name */
    private double f148884f;

    /* renamed from: g, reason: collision with root package name */
    private double f148885g;

    @Override // kt.AbstractC15416b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C15423i c15423i = (C15423i) obj;
        if (Double.doubleToLongBits(this.f148884f) != Double.doubleToLongBits(c15423i.f148884f) || Double.doubleToLongBits(this.f148885g) != Double.doubleToLongBits(c15423i.f148885g)) {
            return false;
        }
        Long l10 = this.f148883e;
        if (l10 == null) {
            if (c15423i.f148883e != null) {
                return false;
            }
        } else if (!l10.equals(c15423i.f148883e)) {
            return false;
        }
        return true;
    }

    public Long g() {
        return this.f148883e;
    }

    public void h(double d10) {
        this.f148885g = d10;
    }

    public void i(Long l10) {
        this.f148883e = l10;
    }

    public void j(double d10) {
        this.f148884f = d10;
    }

    @Override // kt.AbstractC15416b
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = super.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.f148884f);
        int i10 = (iHashCode2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f148885g);
        int i11 = ((i10 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        Long l10 = this.f148883e;
        if (l10 == null) {
            iHashCode = 0;
        } else {
            iHashCode = l10.hashCode();
        }
        return i11 + iHashCode;
    }

    @Override // kt.AbstractC15416b
    public String toString() {
        return String.format("OrganizationPlaceEvent [%s]", super.toString());
    }
}
