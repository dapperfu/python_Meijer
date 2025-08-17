package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
final class zzbyr extends zzbyv {
    private final zzbyq zzb;
    private final zzbyq zzc;
    private final zzbyq zzd;
    private final zzbyq zze;
    private final int zzf;

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final int zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final void zza(SSLSocket sSLSocket, String str, List list) throws NoSuchMethodException, SecurityException {
        if (str != null) {
            this.zzb.zzb(sSLSocket, Boolean.TRUE);
            this.zzc.zzb(sSLSocket, str);
        }
        zzbyq zzbyqVar = this.zze;
        if (zzbyqVar.zza(sSLSocket)) {
            zzbyqVar.zzc(sSLSocket, zzbyv.zzg(list));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final String zzb(SSLSocket sSLSocket) {
        byte[] bArr;
        zzbyq zzbyqVar = this.zzd;
        if (zzbyqVar.zza(sSLSocket) && (bArr = (byte[]) zzbyqVar.zzc(sSLSocket, new Object[0])) != null) {
            return new String(bArr, zzbyy.zzb);
        }
        return null;
    }

    public zzbyr(zzbyq zzbyqVar, zzbyq zzbyqVar2, Method method, Method method2, zzbyq zzbyqVar3, zzbyq zzbyqVar4, Provider provider, int i10) {
        super(provider);
        this.zzb = zzbyqVar;
        this.zzc = zzbyqVar2;
        this.zzd = zzbyqVar3;
        this.zze = zzbyqVar4;
        this.zzf = i10;
    }
}
