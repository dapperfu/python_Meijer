package kt;

/* renamed from: kt.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15320i extends AbstractC15313b {

    /* renamed from: e, reason: collision with root package name */
    private Long f147973e;

    /* renamed from: f, reason: collision with root package name */
    private double f147974f;

    /* renamed from: g, reason: collision with root package name */
    private double f147975g;

    @Override // kt.AbstractC15313b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C15320i c15320i = (C15320i) obj;
        if (Double.doubleToLongBits(this.f147974f) != Double.doubleToLongBits(c15320i.f147974f) || Double.doubleToLongBits(this.f147975g) != Double.doubleToLongBits(c15320i.f147975g)) {
            return false;
        }
        Long l10 = this.f147973e;
        if (l10 == null) {
            if (c15320i.f147973e != null) {
                return false;
            }
        } else if (!l10.equals(c15320i.f147973e)) {
            return false;
        }
        return true;
    }

    public Long g() {
        return this.f147973e;
    }

    public void h(double d10) {
        this.f147975g = d10;
    }

    public void i(Long l10) {
        this.f147973e = l10;
    }

    public void j(double d10) {
        this.f147974f = d10;
    }

    @Override // kt.AbstractC15313b
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = super.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.f147974f);
        int i10 = (iHashCode2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f147975g);
        int i11 = ((i10 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        Long l10 = this.f147973e;
        if (l10 == null) {
            iHashCode = 0;
        } else {
            iHashCode = l10.hashCode();
        }
        return i11 + iHashCode;
    }

    @Override // kt.AbstractC15313b
    public String toString() {
        return String.format("OrganizationPlaceEvent [%s]", super.toString());
    }
}
