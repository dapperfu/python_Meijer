package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzev implements zzex {
    private final String zza;

    public zzev(String str) {
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzex
    public final boolean zza(zzew zzewVar, Context context, boolean z10, boolean z11) {
        String str;
        String host;
        if (z10 || !z11 || (str = this.zza) == null || !str.contains("GOOGLE_INSTREAM_VIDEO_NONCE")) {
            return false;
        }
        String str2 = this.zza;
        List list = zzewVar.zzc;
        if (str2 == null || list == null || (host = Uri.parse(str2).getHost()) == null) {
            return true;
        }
        if (host.startsWith("www.")) {
            host = host.substring(4);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Objects.equals(host, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
