package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzao extends zzcf {
    private final zzcg adapterVersion;
    private final Boolean isPublisherCreated;
    private final String name;
    private final zzcg sdkVersion;
    private final String signals;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcf
    public zzcg adapterVersion() {
        return this.adapterVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcf) {
            zzcf zzcfVar = (zzcf) obj;
            zzcg zzcgVar = this.adapterVersion;
            if (zzcgVar != null ? zzcgVar.equals(zzcfVar.adapterVersion()) : zzcfVar.adapterVersion() == null) {
                zzcg zzcgVar2 = this.sdkVersion;
                if (zzcgVar2 != null ? zzcgVar2.equals(zzcfVar.sdkVersion()) : zzcfVar.sdkVersion() == null) {
                    if (this.name.equals(zzcfVar.name()) && this.signals.equals(zzcfVar.signals()) && this.isPublisherCreated.equals(zzcfVar.isPublisherCreated())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcf
    public Boolean isPublisherCreated() {
        return this.isPublisherCreated;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcf
    public String name() {
        return this.name;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcf
    public zzcg sdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcf
    public String signals() {
        return this.signals;
    }

    public int hashCode() {
        zzcg zzcgVar = this.adapterVersion;
        int iHashCode = zzcgVar == null ? 0 : zzcgVar.hashCode();
        zzcg zzcgVar2 = this.sdkVersion;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ (zzcgVar2 != null ? zzcgVar2.hashCode() : 0)) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.signals.hashCode()) * 1000003) ^ this.isPublisherCreated.hashCode();
    }

    public String toString() {
        zzcg zzcgVar = this.sdkVersion;
        return "SecureSignalsData{adapterVersion=" + String.valueOf(this.adapterVersion) + ", sdkVersion=" + String.valueOf(zzcgVar) + ", name=" + this.name + ", signals=" + this.signals + ", isPublisherCreated=" + this.isPublisherCreated + "}";
    }

    zzao(zzcg zzcgVar, zzcg zzcgVar2, String str, String str2, Boolean bool) {
        this.adapterVersion = zzcgVar;
        this.sdkVersion = zzcgVar2;
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.signals = str2;
                if (bool != null) {
                    this.isPublisherCreated = bool;
                    return;
                }
                throw new NullPointerException("Null isPublisherCreated");
            }
            throw new NullPointerException("Null signals");
        }
        throw new NullPointerException("Null name");
    }
}
