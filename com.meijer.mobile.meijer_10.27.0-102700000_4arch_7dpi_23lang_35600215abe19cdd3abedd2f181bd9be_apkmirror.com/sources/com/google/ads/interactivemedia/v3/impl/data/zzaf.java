package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzaf extends zzby {
    private final int connectionTimeoutMs;
    private final String content;

    /* renamed from: id, reason: collision with root package name */
    private final String f64397id;
    private final int readTimeoutMs;
    private final zzbx requestType;
    private final String url;
    private final String userAgent;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzby) {
            zzby zzbyVar = (zzby) obj;
            if (this.requestType.equals(zzbyVar.requestType()) && this.f64397id.equals(zzbyVar.id()) && this.url.equals(zzbyVar.url()) && ((str = this.content) != null ? str.equals(zzbyVar.content()) : zzbyVar.content() == null) && this.userAgent.equals(zzbyVar.userAgent()) && this.connectionTimeoutMs == zzbyVar.connectionTimeoutMs() && this.readTimeoutMs == zzbyVar.readTimeoutMs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String id() {
        return this.f64397id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public zzbx requestType() {
        return this.requestType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String userAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int iHashCode = ((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.f64397id.hashCode()) * 1000003) ^ this.url.hashCode();
        String str = this.content;
        return (((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003) ^ this.readTimeoutMs;
    }

    public String toString() {
        return "NetworkRequestData{requestType=" + String.valueOf(this.requestType) + ", id=" + this.f64397id + ", url=" + this.url + ", content=" + this.content + ", userAgent=" + this.userAgent + ", connectionTimeoutMs=" + this.connectionTimeoutMs + ", readTimeoutMs=" + this.readTimeoutMs + "}";
    }

    zzaf(zzbx zzbxVar, String str, String str2, String str3, String str4, int i10, int i11) {
        if (zzbxVar != null) {
            this.requestType = zzbxVar;
            if (str != null) {
                this.f64397id = str;
                if (str2 != null) {
                    this.url = str2;
                    this.content = str3;
                    if (str4 != null) {
                        this.userAgent = str4;
                        this.connectionTimeoutMs = i10;
                        this.readTimeoutMs = i11;
                        return;
                    }
                    throw new NullPointerException("Null userAgent");
                }
                throw new NullPointerException("Null url");
            }
            throw new NullPointerException("Null id");
        }
        throw new NullPointerException("Null requestType");
    }
}
