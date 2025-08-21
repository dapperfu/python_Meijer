package com.google.android.libraries.places.internal;

import De.p;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: classes6.dex */
public final class zzbgs {
    private SocketAddress zza;
    private InetSocketAddress zzb;
    private String zzc;
    private String zzd;

    private zzbgs() {
        throw null;
    }

    public final zzbgs zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzbgs zzd(String str) {
        this.zzd = str;
        return this;
    }

    /* synthetic */ zzbgs(byte[] bArr) {
    }

    public final zzbgs zza(SocketAddress socketAddress) {
        this.zza = (SocketAddress) p.r(socketAddress, "proxyAddress");
        return this;
    }

    public final zzbgs zzb(InetSocketAddress inetSocketAddress) {
        this.zzb = (InetSocketAddress) p.r(inetSocketAddress, "targetAddress");
        return this;
    }

    public final zzbgt zze() {
        return new zzbgt(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
