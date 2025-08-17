package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.d;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzev implements zzer {
    private final zzbif zza;
    private final s zzb;
    private final zzeo zzc;

    public zzev(zzbif managedChannel, zzeo zwiebackCookieManager, s backgroundExecutorService) {
        Intrinsics.j(managedChannel, "managedChannel");
        Intrinsics.j(zwiebackCookieManager, "zwiebackCookieManager");
        Intrinsics.j(backgroundExecutorService, "backgroundExecutorService");
        this.zza = managedChannel;
        this.zzc = zwiebackCookieManager;
        this.zzb = backgroundExecutorService;
    }

    static /* synthetic */ q zzc(zzev zzevVar, String cookie) {
        Intrinsics.j(cookie, "cookie");
        zzbdt zzbdtVarZzb = zzbdu.zzb(zzevVar.zza);
        zzbdo zzbdoVarZzc = zzbdp.zzc();
        zzbdoVarZzc.zza(cookie);
        return zzcaj.zzb(zzbdtVarZzb.zzc().zza(zzbdu.zza(), zzbdtVarZzb.zzd()), (zzbdp) zzbdoVarZzc.zzG());
    }

    @Override // com.google.android.libraries.places.internal.zzer
    public final void zza() {
        q qVarZza = this.zzc.zza();
        final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzet
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return zzev.zzc(this.zza, (String) obj);
            }
        };
        d dVar = new d() { // from class: com.google.android.libraries.places.internal.zzes
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return (q) function1.invoke(obj);
            }
        };
        s sVar = this.zzb;
        k.a(k.e(qVarZza, dVar, sVar), new zzeu(this), sVar);
    }

    @Override // com.google.android.libraries.places.internal.zzer
    public final void zzb() {
        this.zza.zzd();
    }
}
