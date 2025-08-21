package com.google.android.libraries.places.internal;

import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class zzbhh {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final BaseEncoding zzb = zzbip.zzb;

    public static zzbip zzb(byte[]... bArr) {
        return new zzbip(bArr.length >> 1, bArr);
    }

    public static zzbil zza(String str, zzbhg zzbhgVar) {
        boolean z10 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        int i10 = zzbil.zza;
        return new zzbin(str, z10, zzbhgVar, null);
    }

    public static byte[][] zzc(zzbip zzbipVar) {
        return zzbipVar.zze();
    }

    public static int zzd(zzbip zzbipVar) {
        return zzbipVar.zza();
    }
}
