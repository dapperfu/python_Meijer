package com.google.ads.interactivemedia.v3.internal;

import Ic.a;
import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5228f;
import android.content.Context;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzok {
    private final Context zza;
    private final Executor zzb;
    private final zznt zzc;
    private final zznv zzd;
    private final zzoj zze;
    private final zzoj zzf;
    private AbstractC5232j zzg;
    private AbstractC5232j zzh;

    zzok(Context context, Executor executor, zznt zzntVar, zznv zznvVar, zzoh zzohVar, zzoi zzoiVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzntVar;
        this.zzd = zznvVar;
        this.zze = zzohVar;
        this.zzf = zzoiVar;
    }

    public static zzok zze(Context context, Executor executor, zznt zzntVar, zznv zznvVar) {
        final zzok zzokVar = new zzok(context, executor, zzntVar, zznvVar, new zzoh(), new zzoi());
        if (zzokVar.zzd.zzh()) {
            zzokVar.zzg = zzokVar.zzh(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzoe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc();
                }
            });
        } else {
            zzokVar.zzg = C5235m.f(zzokVar.zze.zza());
        }
        zzokVar.zzh = zzokVar.zzh(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzof
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
        return zzokVar;
    }

    private final AbstractC5232j zzh(Callable callable) {
        return C5235m.c(this.zzb, callable).f(this.zzb, new InterfaceC5228f() { // from class: com.google.ads.interactivemedia.v3.internal.zzog
            @Override // Td.InterfaceC5228f
            public final void onFailure(Exception exc) {
                this.zza.zzf(exc);
            }
        });
    }

    public final zzbp zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzbp zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    final /* synthetic */ zzbp zzd() throws Exception {
        Context context = this.zza;
        return zzob.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }

    private static zzbp zzg(AbstractC5232j abstractC5232j, zzbp zzbpVar) {
        if (!abstractC5232j.r()) {
            return zzbpVar;
        }
        return (zzbp) abstractC5232j.n();
    }

    final /* synthetic */ zzbp zzc() throws Exception {
        zzan zzanVarZza = zzbp.zza();
        a.C0217a c0217aA = Ic.a.a(this.zza);
        String strA = c0217aA.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strA);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strA = Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            zzanVarZza.zzs(strA);
            zzanVarZza.zzr(c0217aA.b());
            zzanVarZza.zzab(6);
        }
        return (zzbp) zzanVarZza.zzal();
    }
}
