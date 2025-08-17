package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzz.class)
/* loaded from: classes4.dex */
public abstract class zzbk {
    public abstract String alternateText();

    public abstract String creativeType();

    public abstract int height();

    public abstract String imageUrl();

    public abstract int width();

    public static zzbk create(int i10, int i11, String str, String str2, String str3) {
        return new zzz(i10, i11, str, str2, str3);
    }

    public String getAlternateText() {
        return alternateText();
    }

    public String getCreativeType() {
        return creativeType();
    }

    public int getHeight() {
        return height();
    }

    public String getResourceUri() {
        return imageUrl();
    }

    public int getWidth() {
        return width();
    }

    public final String toString() {
        return "IconClickFallbackImageMsgData [width=" + width() + ", height=" + height() + ", imageUrl=" + imageUrl() + ", alternateText=" + alternateText() + ", creativeType=" + creativeType() + "]";
    }
}
