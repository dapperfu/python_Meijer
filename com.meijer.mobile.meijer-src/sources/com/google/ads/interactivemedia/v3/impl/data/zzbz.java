package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzag.class)
/* loaded from: classes4.dex */
public abstract class zzbz {
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    public static zzbz forResponse(String str, String str2) {
        return forResponse(str, str2, UNKNOWN_CONTENT_TYPE);
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();

    private static zzbz create(String str, String str2, String str3, int i10) {
        return new zzag(str, str2, str3, i10);
    }

    public static zzbz forError(String str, int i10) {
        return create(str, "", UNKNOWN_CONTENT_TYPE, i10);
    }

    public static zzbz forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }
}
