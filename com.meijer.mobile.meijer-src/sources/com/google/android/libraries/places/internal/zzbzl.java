package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbzl implements zzbzp {
    private static final Logger zza = Logger.getLogger(zzbzi.class.getName());
    private static final zzcbn zzb;

    static {
        zzcbn zzcbnVar = zzcbn.zza;
        zzb = zzcbm.zza("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    static /* synthetic */ IllegalArgumentException zzc(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    static /* synthetic */ int zze(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return i10 - s10;
        }
        throw zzi("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException zzi(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // com.google.android.libraries.places.internal.zzbzp
    public final zzbzb zza(zzcbl zzcblVar, boolean z10) {
        return new zzbzj(zzcblVar, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbzp
    public final zzbzc zzb(zzcbk zzcbkVar, boolean z10) {
        return new zzbzk(zzcbkVar, true);
    }

    static /* synthetic */ int zzf(zzcbl zzcblVar) {
        return (zzcblVar.zzj() & 255) | ((zzcblVar.zzj() & 255) << 16) | ((zzcblVar.zzj() & 255) << 8);
    }
}
