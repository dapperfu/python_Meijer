package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzap extends zzcg {
    private final int major;
    private final int micro;
    private final int minor;

    zzap(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.micro = i12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.major == zzcgVar.major() && this.minor == zzcgVar.minor() && this.micro == zzcgVar.micro()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003) ^ this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcg
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcg
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcg
    public int minor() {
        return this.minor;
    }

    public String toString() {
        return "SecureSignalsVersionData{major=" + this.major + ", minor=" + this.minor + ", micro=" + this.micro + "}";
    }
}
