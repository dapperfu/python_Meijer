package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzan extends zzce {
    private final Integer height;
    private final Integer width;

    /* renamed from: x, reason: collision with root package name */
    private final Integer f64399x;

    /* renamed from: y, reason: collision with root package name */
    private final Integer f64400y;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzce) {
            zzce zzceVar = (zzce) obj;
            if (this.f64399x.equals(zzceVar.x()) && this.f64400y.equals(zzceVar.y()) && this.width.equals(zzceVar.width()) && this.height.equals(zzceVar.height())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer width() {
        return this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer x() {
        return this.f64399x;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer y() {
        return this.f64400y;
    }

    public int hashCode() {
        return ((((((this.f64399x.hashCode() ^ 1000003) * 1000003) ^ this.f64400y.hashCode()) * 1000003) ^ this.width.hashCode()) * 1000003) ^ this.height.hashCode();
    }

    zzan(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num != null) {
            this.f64399x = num;
            if (num2 != null) {
                this.f64400y = num2;
                if (num3 != null) {
                    this.width = num3;
                    if (num4 != null) {
                        this.height = num4;
                        return;
                    }
                    throw new NullPointerException("Null height");
                }
                throw new NullPointerException("Null width");
            }
            throw new NullPointerException("Null y");
        }
        throw new NullPointerException("Null x");
    }
}
