package com.google.android.libraries.places.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzpb {
    private final zzaju zza;
    private final List zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final zzajp zze;
    private final zzajz zzf;
    private zzoz zzg;
    private zzajw zzh;

    public zzpb(zzaju orientation, List content, boolean z10, boolean z11, zzajp mediaSize, zzajz attributionPosition) {
        Intrinsics.j(orientation, "orientation");
        Intrinsics.j(content, "content");
        Intrinsics.j(mediaSize, "mediaSize");
        Intrinsics.j(attributionPosition, "attributionPosition");
        this.zza = orientation;
        this.zzb = content;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = mediaSize;
        this.zzf = attributionPosition;
        this.zzh = zzajw.UNDEFINED;
    }

    public final void zza(zzoz zzozVar) {
        this.zzg = zzozVar;
    }

    public final void zzb(zzajw zzajwVar) {
        Intrinsics.j(zzajwVar, "<set-?>");
        this.zzh = zzajwVar;
    }

    public final void zzc() {
        zzg(2);
    }

    public final void zzd() {
        zzg(3);
    }

    public final void zze() {
        zzg(4);
    }

    public final void zzf() {
        zzg(5);
    }

    private final void zzg(int i10) {
        zzajn zzajnVarZza = zzajx.zza();
        zzajnVarZza.zzh(i10);
        zzajnVarZza.zza(this.zza);
        zzajnVarZza.zzb(this.zzb);
        zzajnVarZza.zzc(this.zzh);
        zzajnVarZza.zzd(this.zzc);
        zzajnVarZza.zze(this.zzd);
        zzajnVarZza.zzf(this.zze);
        zzajnVarZza.zzg(this.zzf);
        zzbae zzbaeVarZzG = zzajnVarZza.zzG();
        Intrinsics.i(zzbaeVarZzG, "build(...)");
        zzajx zzajxVar = (zzajx) zzbaeVarZzG;
        zzoz zzozVar = this.zzg;
        if (zzozVar != null) {
            zzozVar.zzc(zzajxVar);
        }
    }
}
