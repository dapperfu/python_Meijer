package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbqa {
    private List zza;
    private int zzb;
    private int zzc;

    public zzbqa(List list) {
        this.zza = list;
    }

    public final boolean zzb() {
        return this.zzb == 0 && this.zzc == 0;
    }

    public final void zzd() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final boolean zzh(SocketAddress socketAddress) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            int iIndexOf = ((zzbgl) this.zza.get(i10)).zza().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.zzb = i10;
                this.zzc = iIndexOf;
                return true;
            }
        }
        return false;
    }

    public final boolean zza() {
        return this.zzb < this.zza.size();
    }

    public final void zzc() {
        zzbgl zzbglVar = (zzbgl) this.zza.get(this.zzb);
        int i10 = this.zzc + 1;
        this.zzc = i10;
        if (i10 >= zzbglVar.zza().size()) {
            this.zzb++;
            this.zzc = 0;
        }
    }

    public final SocketAddress zze() {
        return (SocketAddress) ((zzbgl) this.zza.get(this.zzb)).zza().get(this.zzc);
    }

    public final zzbez zzf() {
        return ((zzbgl) this.zza.get(this.zzb)).zzb();
    }

    public final void zzg(List list) {
        this.zza = list;
        zzd();
    }
}
