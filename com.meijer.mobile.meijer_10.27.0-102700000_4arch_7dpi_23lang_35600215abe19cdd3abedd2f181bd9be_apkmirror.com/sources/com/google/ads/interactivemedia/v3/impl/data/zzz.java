package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzz extends zzbk {
    private final String alternateText;
    private final String creativeType;
    private final int height;
    private final String imageUrl;
    private final int width;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbk
    public String alternateText() {
        return this.alternateText;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbk
    public String creativeType() {
        return this.creativeType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbk) {
            zzbk zzbkVar = (zzbk) obj;
            if (this.width == zzbkVar.width() && this.height == zzbkVar.height() && this.imageUrl.equals(zzbkVar.imageUrl()) && this.alternateText.equals(zzbkVar.alternateText()) && this.creativeType.equals(zzbkVar.creativeType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbk
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbk
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbk
    public int width() {
        return this.width;
    }

    public int hashCode() {
        return ((((((((this.width ^ 1000003) * 1000003) ^ this.height) * 1000003) ^ this.imageUrl.hashCode()) * 1000003) ^ this.alternateText.hashCode()) * 1000003) ^ this.creativeType.hashCode();
    }

    zzz(int i10, int i11, String str, String str2, String str3) {
        this.width = i10;
        this.height = i11;
        if (str != null) {
            this.imageUrl = str;
            if (str2 != null) {
                this.alternateText = str2;
                if (str3 != null) {
                    this.creativeType = str3;
                    return;
                }
                throw new NullPointerException("Null creativeType");
            }
            throw new NullPointerException("Null alternateText");
        }
        throw new NullPointerException("Null imageUrl");
    }
}
