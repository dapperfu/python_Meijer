package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzr extends zzbe {
    private final String clickThroughUrl;
    private final String size;
    private final String src;
    private final zzbd type;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.size.equals(zzbeVar.size()) && this.src.equals(zzbeVar.src()) && this.clickThroughUrl.equals(zzbeVar.clickThroughUrl()) && this.type.equals(zzbeVar.type())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public String size() {
        return this.size;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public String src() {
        return this.src;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public zzbd type() {
        return this.type;
    }

    public int hashCode() {
        return ((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.src.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    zzr(String str, String str2, String str3, zzbd zzbdVar) {
        if (str != null) {
            this.size = str;
            if (str2 != null) {
                this.src = str2;
                if (str3 != null) {
                    this.clickThroughUrl = str3;
                    if (zzbdVar != null) {
                        this.type = zzbdVar;
                        return;
                    }
                    throw new NullPointerException("Null type");
                }
                throw new NullPointerException("Null clickThroughUrl");
            }
            throw new NullPointerException("Null src");
        }
        throw new NullPointerException("Null size");
    }
}
