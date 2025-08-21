package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzag extends zzbz {
    private final String content;
    private final String contentType;
    private final int errorCode;

    /* renamed from: id, reason: collision with root package name */
    private final String f65238id;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public String content() {
        return this.content;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbz) {
            zzbz zzbzVar = (zzbz) obj;
            if (this.f65238id.equals(zzbzVar.id()) && this.content.equals(zzbzVar.content()) && this.contentType.equals(zzbzVar.contentType()) && this.errorCode == zzbzVar.errorCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public int errorCode() {
        return this.errorCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public String id() {
        return this.f65238id;
    }

    public int hashCode() {
        return ((((((this.f65238id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.errorCode;
    }

    public String toString() {
        return "NetworkResponseData{id=" + this.f65238id + ", content=" + this.content + ", contentType=" + this.contentType + ", errorCode=" + this.errorCode + "}";
    }

    zzag(String str, String str2, String str3, int i10) {
        if (str != null) {
            this.f65238id = str;
            if (str2 != null) {
                this.content = str2;
                if (str3 != null) {
                    this.contentType = str3;
                    this.errorCode = i10;
                    return;
                }
                throw new NullPointerException("Null contentType");
            }
            throw new NullPointerException("Null content");
        }
        throw new NullPointerException("Null id");
    }
}
