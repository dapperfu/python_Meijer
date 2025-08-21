package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;

/* loaded from: classes6.dex */
public class zzcaq {
    final /* synthetic */ zzcas zza;
    private final Object zzb;
    private final zzbia zzc;
    private zzbfy zzd;
    private zzbhy zze;

    public final Object zzc() {
        return this.zzb;
    }

    public final zzbia zzd() {
        return this.zzc;
    }

    public final zzbhy zze() {
        return this.zze;
    }

    public final zzbfy zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzbia zzg() {
        return this.zzc;
    }

    final /* synthetic */ zzbfy zzh() {
        return this.zzd;
    }

    final /* synthetic */ void zzi(zzbfy zzbfyVar) {
        this.zzd = zzbfyVar;
    }

    final /* synthetic */ void zzj(zzbhy zzbhyVar) {
        this.zze = zzbhyVar;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzd);
        String strValueOf3 = String.valueOf(this.zze.getClass());
        String strValueOf4 = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 20 + length2 + 15 + strValueOf3.length() + 6 + strValueOf4.length());
        sb2.append("Address = ");
        sb2.append(strValueOf);
        sb2.append(", state = ");
        sb2.append(strValueOf2);
        sb2.append(", picker type: ");
        sb2.append(strValueOf3);
        sb2.append(", lb: ");
        sb2.append(strValueOf4);
        return sb2.toString();
    }

    protected zzcap zza() {
        return new zzcap(this);
    }

    protected final void zzb() {
        this.zzc.zzc();
        this.zzd = zzbfy.SHUTDOWN;
        zzcas.zzi.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.zzb);
    }

    public zzcaq(zzcas zzcasVar, Object obj, zzbhp zzbhpVar) {
        Objects.requireNonNull(zzcasVar);
        this.zza = zzcasVar;
        this.zze = new zzbhq(zzbht.zzd());
        this.zzb = obj;
        this.zzc = zzbhpVar.zza(zza());
        this.zzd = zzbfy.CONNECTING;
    }
}
