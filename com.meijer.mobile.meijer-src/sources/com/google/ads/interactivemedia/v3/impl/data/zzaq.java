package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzaq extends zzch {
    private final Integer height;
    private final Integer width;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzch) {
            zzch zzchVar = (zzch) obj;
            if (this.width.equals(zzchVar.width()) && this.height.equals(zzchVar.height())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzch
    public Integer height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzch
    public Integer width() {
        return this.width;
    }

    public int hashCode() {
        return ((this.width.hashCode() ^ 1000003) * 1000003) ^ this.height.hashCode();
    }

    public String toString() {
        return "SizeData{width=" + this.width + ", height=" + this.height + "}";
    }

    zzaq(Integer num, Integer num2) {
        if (num != null) {
            this.width = num;
            if (num2 != null) {
                this.height = num2;
                return;
            }
            throw new NullPointerException("Null height");
        }
        throw new NullPointerException("Null width");
    }
}
