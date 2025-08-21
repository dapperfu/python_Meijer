package com.google.android.libraries.places.internal;

import De.p;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbxj extends zzbpi implements zzbyd {
    final /* synthetic */ zzbxk zza;
    private final int zzb;
    private final Object zzc;
    private List zzd;
    private final zzcbj zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private final zzbwz zzk;
    private final zzbyh zzl;
    private final zzbxt zzm;
    private boolean zzn;
    private final zzcbb zzo;
    private zzbye zzp;
    private int zzq;

    final zzcbb zzI() {
        return this.zzo;
    }

    final int zzJ() {
        return this.zzq;
    }

    final /* synthetic */ void zzL(zzbjv zzbjvVar, boolean z10, zzbip zzbipVar) throws EOFException {
        zzP(zzbjvVar, true, null);
    }

    final /* synthetic */ Object zzO() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbpi
    protected final void zzz(zzbjv zzbjvVar, boolean z10, zzbip zzbipVar) throws EOFException {
        zzP(zzbjvVar, false, zzbipVar);
    }

    private final void zzP(zzbjv zzbjvVar, boolean z10, zzbip zzbipVar) throws EOFException {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (!this.zzn) {
            this.zzm.zzn(this.zzq, zzbjvVar, zzbls.PROCESSED, z10, zzbyz.CANCEL, zzbipVar);
            return;
        }
        this.zzm.zzj(this.zza);
        this.zzd = null;
        zzcbj zzcbjVar = this.zze;
        zzcbjVar.zzt(zzcbjVar.zzb());
        this.zzn = false;
        if (zzbipVar == null) {
            zzbipVar = new zzbip();
        }
        zzg(zzbjvVar, zzbls.PROCESSED, true, zzbipVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final void zzD(int i10) {
        int i11 = this.zzj - i10;
        this.zzj = i11;
        int i12 = this.zzb;
        if (i11 <= i12 * 0.5f) {
            int i13 = i12 - i11;
            this.zzi += i13;
            this.zzj = i11 + i13;
            this.zzk.zzk(this.zzq, i13);
        }
    }

    public final void zzF(int i10) {
        p.y(this.zzq == -1, "the stream has been started with id %s", i10);
        this.zzq = i10;
        zzbyh zzbyhVar = this.zzl;
        this.zzp = zzbyhVar.zze(this, i10);
        zzbxk zzbxkVar = this.zza;
        zzbxj zzbxjVarZzJ = zzbxkVar.zzJ();
        super.zzr();
        zzbxjVarZzJ.zzu().zza();
        if (this.zzn) {
            this.zzk.zzf(false, false, this.zzq, 0, this.zzd);
            zzbxkVar.zzH().zzb();
            this.zzd = null;
            zzcbj zzcbjVar = this.zze;
            if (zzcbjVar.zzb() > 0) {
                zzbyhVar.zzc(this.zzf, this.zzp, zzcbjVar, this.zzg);
            }
            this.zzn = false;
        }
    }

    public final void zzG(List list, boolean z10) {
        if (z10) {
            zzC(zzbyi.zzb(list));
        } else {
            zzA(zzbyi.zza(list));
        }
    }

    final zzbye zzK() {
        zzbye zzbyeVar;
        synchronized (this.zzc) {
            zzbyeVar = this.zzp;
        }
        return zzbyeVar;
    }

    final /* synthetic */ void zzM(zzcbj zzcbjVar, boolean z10, boolean z11) {
        if (this.zzh) {
            return;
        }
        if (!this.zzn) {
            p.x(this.zzq != -1, "streamId should be set");
            this.zzl.zzc(z10, this.zzp, zzcbjVar, z11);
        } else {
            this.zze.zzc(zzcbjVar, (int) zzcbjVar.zzb());
            this.zzf |= z10;
            this.zzg |= z11;
        }
    }

    final /* synthetic */ void zzN(zzbip zzbipVar, String str) {
        zzbxt zzbxtVar = this.zzm;
        boolean zZzh = zzbxtVar.zzh();
        zzbzd zzbzdVar = zzbxb.zza;
        p.r(zzbipVar, "headers");
        p.r(str, "defaultPath");
        zzbxk zzbxkVar = this.zza;
        String strZzI = zzbxkVar.zzI();
        p.r(strZzI, "authority");
        zzbipVar.zzd(zzbpf.zzg);
        zzbipVar.zzd(zzbpf.zzh);
        zzbil zzbilVar = zzbpf.zzi;
        zzbipVar.zzd(zzbilVar);
        ArrayList arrayList = new ArrayList(zzbhh.zzd(zzbipVar) + 7);
        if (zZzh) {
            arrayList.add(zzbxb.zzb);
        } else {
            arrayList.add(zzbxb.zza);
        }
        arrayList.add(zzbxb.zzc);
        String strZzG = zzbxkVar.zzG();
        zzcbn zzcbnVar = zzbzd.zze;
        zzcbn zzcbnVar2 = zzcbn.zza;
        arrayList.add(new zzbzd(zzcbnVar, zzcbm.zza(strZzI)));
        arrayList.add(new zzbzd(zzbzd.zzc, zzcbm.zza(str)));
        arrayList.add(new zzbzd(zzbilVar.zzd(), strZzG));
        arrayList.add(zzbxb.zze);
        arrayList.add(zzbxb.zzf);
        byte[][] bArrZza = zzbwl.zza(zzbipVar);
        for (int i10 = 0; i10 < bArrZza.length; i10 += 2) {
            zzcbn zzcbnVarZzb = zzcbm.zzb(bArrZza[i10]);
            if (zzcbnVarZzb.zza().length != 0 && zzcbnVarZzb.zza()[0] != 58) {
                arrayList.add(new zzbzd(zzcbnVarZzb, zzcbm.zzb(bArrZza[i10 + 1])));
            }
        }
        this.zzd = arrayList;
        zzbxtVar.zzi(zzbxkVar, zzbxkVar.zzI());
    }

    @Override // com.google.android.libraries.places.internal.zzbkl, com.google.android.libraries.places.internal.zzbsk
    public final void zzb(boolean z10) {
        if (zzc()) {
            this.zzm.zzn(this.zzq, null, zzbls.PROCESSED, false, null, null);
        } else {
            this.zzm.zzn(this.zzq, null, zzbls.PROCESSED, false, zzbyz.CANCEL, null);
        }
        super.zzb(z10);
    }

    @Override // com.google.android.libraries.places.internal.zzbks
    public final void zzy(Runnable runnable) {
        synchronized (this.zzc) {
            runnable.run();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbxj(zzbxk zzbxkVar, int i10, zzbwg zzbwgVar, Object obj, zzbwz zzbwzVar, zzbyh zzbyhVar, zzbxt zzbxtVar, int i11, String str, zzbfd zzbfdVar) {
        super(i10, zzbwgVar, zzbxkVar.zzo(), zzbfdVar);
        Objects.requireNonNull(zzbxkVar);
        this.zza = zzbxkVar;
        this.zze = new zzcbj();
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzn = true;
        this.zzq = -1;
        this.zzc = p.r(obj, "lock");
        this.zzk = zzbwzVar;
        this.zzl = zzbyhVar;
        this.zzm = zzbxtVar;
        this.zzi = i11;
        this.zzj = i11;
        this.zzb = i11;
        this.zzo = zzcba.zza(str);
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final void zzE(Throwable th2) throws EOFException {
        zzP(zzbjv.zzb(th2), true, new zzbip());
    }

    public final void zzH(zzcbj zzcbjVar, boolean z10, int i10) {
        int iZzb = this.zzi - (((int) zzcbjVar.zzb()) + i10);
        this.zzi = iZzb;
        this.zzj -= i10;
        if (iZzb < 0) {
            this.zzk.zzb(this.zzq, zzbyz.FLOW_CONTROL_ERROR);
            this.zzm.zzn(this.zzq, zzbjv.zzh.zze("Received data size exceeded our receiving window size"), zzbls.PROCESSED, false, null, null);
        } else {
            super.zzB(new zzbxz(zzcbjVar), z10);
        }
    }
}
