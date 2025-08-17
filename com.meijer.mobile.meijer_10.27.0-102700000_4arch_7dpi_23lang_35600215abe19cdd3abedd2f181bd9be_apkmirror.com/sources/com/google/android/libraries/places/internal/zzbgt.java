package com.google.android.libraries.places.internal;

import Be.j;
import Be.l;
import Be.p;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: classes6.dex */
public final class zzbgt extends zzbjm {
    private final SocketAddress zza;
    private final InetSocketAddress zzb;
    private final String zzc;
    private final String zzd;

    public static zzbgs zze() {
        return new zzbgs(null);
    }

    public final String zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final SocketAddress zzc() {
        return this.zza;
    }

    public final InetSocketAddress zzd() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgt)) {
            return false;
        }
        zzbgt zzbgtVar = (zzbgt) obj;
        return l.a(this.zza, zzbgtVar.zza) && l.a(this.zzb, zzbgtVar.zzb) && l.a(this.zzc, zzbgtVar.zzc) && l.a(this.zzd, zzbgtVar.zzd);
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb, this.zzc, this.zzd);
    }

    /* synthetic */ zzbgt(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2, byte[] bArr) {
        p.r(socketAddress, "proxyAddress");
        p.r(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            p.z(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.zza = socketAddress;
        this.zzb = inetSocketAddress;
        this.zzc = str;
        this.zzd = str2;
    }

    public final String toString() {
        boolean z10;
        j.b bVarD = j.c(this).d("proxyAddr", this.zza).d("targetAddr", this.zzb).d("username", this.zzc);
        if (this.zzd != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return bVarD.e("hasPassword", z10).toString();
    }
}
