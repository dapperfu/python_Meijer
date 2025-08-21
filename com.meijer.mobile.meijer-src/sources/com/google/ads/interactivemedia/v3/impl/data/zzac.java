package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzac extends zzbn {
    private final String adsIdentityToken;
    private final String appSetId;
    private final int appSetIdScope;
    private final String deviceId;
    private final String idType;
    private final boolean isLimitedAdTracking;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String adsIdentityToken() {
        return this.adsIdentityToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String appSetId() {
        return this.appSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public int appSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbn) {
            zzbn zzbnVar = (zzbn) obj;
            String str = this.deviceId;
            if (str != null ? str.equals(zzbnVar.deviceId()) : zzbnVar.deviceId() == null) {
                if (this.idType.equals(zzbnVar.idType()) && this.isLimitedAdTracking == zzbnVar.isLimitedAdTracking() && this.appSetId.equals(zzbnVar.appSetId()) && this.appSetIdScope == zzbnVar.appSetIdScope() && this.adsIdentityToken.equals(zzbnVar.adsIdentityToken())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String idType() {
        return this.idType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public boolean isLimitedAdTracking() {
        return this.isLimitedAdTracking;
    }

    public int hashCode() {
        String str = this.deviceId;
        return (((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.idType.hashCode()) * 1000003) ^ (true != this.isLimitedAdTracking ? 1237 : 1231)) * 1000003) ^ this.appSetId.hashCode()) * 1000003) ^ this.appSetIdScope) * 1000003) ^ this.adsIdentityToken.hashCode();
    }

    public String toString() {
        return "IdentifierInfo{deviceId=" + this.deviceId + ", idType=" + this.idType + ", isLimitedAdTracking=" + this.isLimitedAdTracking + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", adsIdentityToken=" + this.adsIdentityToken + "}";
    }

    zzac(String str, String str2, boolean z10, String str3, int i10, String str4) {
        this.deviceId = str;
        if (str2 != null) {
            this.idType = str2;
            this.isLimitedAdTracking = z10;
            if (str3 != null) {
                this.appSetId = str3;
                this.appSetIdScope = i10;
                if (str4 != null) {
                    this.adsIdentityToken = str4;
                    return;
                }
                throw new NullPointerException("Null adsIdentityToken");
            }
            throw new NullPointerException("Null appSetId");
        }
        throw new NullPointerException("Null idType");
    }
}
