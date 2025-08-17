package com.google.android.libraries.places.internal;

import Be.j;
import Be.p;
import Be.u;
import Be.w;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbqg implements zzbhe, zzbwm {
    private final zzbhf zza;
    private final String zzb;
    private final String zzc;
    private final zzbpz zzd;
    private final zzblw zze;
    private final ScheduledExecutorService zzf;
    private final zzbgy zzg;
    private final zzblh zzh;
    private final zzbfg zzi;
    private final boolean zzj;
    private final List zzk;
    private final zzbkd zzl;
    private final zzbqa zzm;
    private volatile List zzn;
    private final u zzo;
    private zzbkc zzp;
    private zzbkc zzq;
    private zzbsj zzr;
    private zzbmg zzu;
    private volatile zzbsj zzv;
    private zzbjv zzx;
    private volatile zzbez zzy;
    private zzbon zzz;
    private final Collection zzs = new ArrayList();
    private final zzbpk zzt = new zzbpn(this);
    private volatile zzbfz zzw = zzbfz.zza(zzbfy.IDLE);

    zzbqg(zzbho zzbhoVar, String str, String str2, zzbom zzbomVar, zzblw zzblwVar, ScheduledExecutorService scheduledExecutorService, w wVar, zzbkd zzbkdVar, zzbpz zzbpzVar, zzbgy zzbgyVar, zzblh zzblhVar, zzblj zzbljVar, zzbhf zzbhfVar, zzbfg zzbfgVar, List list) {
        List listZza = zzbhoVar.zza();
        p.r(listZza, "addressGroups");
        p.e(!listZza.isEmpty(), "addressGroups is empty");
        zzL(listZza, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listZza));
        this.zzn = listUnmodifiableList;
        this.zzm = new zzbqa(listUnmodifiableList);
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzblwVar;
        this.zzf = scheduledExecutorService;
        this.zzo = (u) wVar.get();
        this.zzl = zzbkdVar;
        this.zzd = zzbpzVar;
        this.zzg = zzbgyVar;
        this.zzh = zzblhVar;
        this.zza = (zzbhf) p.r(zzbhfVar, "logId");
        this.zzi = (zzbfg) p.r(zzbfgVar, "channelLogger");
        this.zzk = list;
        this.zzj = ((Boolean) zzbhoVar.zzc(zzbia.zzc)).booleanValue();
    }

    final /* synthetic */ zzbmg zzA() {
        return this.zzu;
    }

    final /* synthetic */ void zzB(zzbmg zzbmgVar) {
        this.zzu = null;
    }

    final /* synthetic */ zzbsj zzC() {
        return this.zzv;
    }

    final /* synthetic */ void zzD(zzbsj zzbsjVar) {
        this.zzv = zzbsjVar;
    }

    final /* synthetic */ zzbfz zzE() {
        return this.zzw;
    }

    final /* synthetic */ zzbjv zzF() {
        return this.zzx;
    }

    final /* synthetic */ void zzG(zzbjv zzbjvVar) {
        this.zzx = zzbjvVar;
    }

    final /* synthetic */ void zzH(zzbez zzbezVar) {
        this.zzy = zzbezVar;
    }

    final /* synthetic */ void zzI(zzbon zzbonVar) {
        this.zzz = null;
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        return this.zza;
    }

    final /* synthetic */ zzbpz zzl() {
        return this.zzd;
    }

    final /* synthetic */ ScheduledExecutorService zzm() {
        return this.zzf;
    }

    final /* synthetic */ zzbgy zzn() {
        return this.zzg;
    }

    final /* synthetic */ zzbfg zzo() {
        return this.zzi;
    }

    final /* synthetic */ List zzp() {
        return this.zzk;
    }

    final /* synthetic */ zzbkd zzq() {
        return this.zzl;
    }

    final /* synthetic */ zzbqa zzr() {
        return this.zzm;
    }

    final /* synthetic */ void zzs(List list) {
        this.zzn = list;
    }

    final /* synthetic */ void zzt(zzbkc zzbkcVar) {
        this.zzp = null;
    }

    final /* synthetic */ zzbkc zzu() {
        return this.zzq;
    }

    final /* synthetic */ void zzv(zzbkc zzbkcVar) {
        this.zzq = zzbkcVar;
    }

    final /* synthetic */ zzbsj zzw() {
        return this.zzr;
    }

    final /* synthetic */ void zzx(zzbsj zzbsjVar) {
        this.zzr = zzbsjVar;
    }

    final /* synthetic */ Collection zzy() {
        return this.zzs;
    }

    final /* synthetic */ zzbpk zzz() {
        return this.zzt;
    }

    private final void zzK(zzbfz zzbfzVar) {
        this.zzl.zzc();
        if (this.zzw.zzc() != zzbfzVar.zzc()) {
            p.z(this.zzw.zzc() != zzbfy.SHUTDOWN, "Cannot transition out of SHUTDOWN to %s", zzbfzVar.zzc());
            if (this.zzj && zzbfzVar.zzc() == zzbfy.TRANSIENT_FAILURE) {
                this.zzw = zzbfz.zza(zzbfy.IDLE);
            } else {
                this.zzw = zzbfzVar;
            }
            zzbpz zzbpzVar = this.zzd;
            p.x(true, "listener is null");
            ((zzbrt) zzbpzVar).zza.zza(zzbfzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzM(zzbjv zzbjvVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzbjvVar.zzg());
        if (zzbjvVar.zzh() != null) {
            sb2.append("(");
            sb2.append(zzbjvVar.zzh());
            sb2.append(")");
        }
        if (zzbjvVar.zzi() != null) {
            sb2.append("[");
            sb2.append(zzbjvVar.zzi());
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbwm
    public final zzblu zza() {
        zzbsj zzbsjVar = this.zzv;
        if (zzbsjVar != null) {
            return zzbsjVar;
        }
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(new zzbpp(this));
        zzbkdVar.zza();
        return null;
    }

    public final void zzb(List list) {
        p.r(list, "newAddressGroups");
        zzL(list, "newAddressGroups contains null entry");
        p.e(!list.isEmpty(), "newAddressGroups is empty");
        zzbpr zzbprVar = new zzbpr(this, Collections.unmodifiableList(new ArrayList(list)));
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbprVar);
        zzbkdVar.zza();
    }

    public final void zzd(zzbjv zzbjvVar) {
        zzbps zzbpsVar = new zzbps(this, zzbjvVar);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbpsVar);
        zzbkdVar.zza();
    }

    final /* synthetic */ void zzf() {
        zzbgt zzbgtVar;
        this.zzl.zzc();
        p.x(this.zzp == null, "Should have no reconnectTask scheduled");
        zzbqa zzbqaVar = this.zzm;
        if (zzbqaVar.zzb()) {
            this.zzo.f().g();
        }
        SocketAddress socketAddressZze = zzbqaVar.zze();
        byte[] bArr = null;
        if (socketAddressZze instanceof zzbgt) {
            zzbgt zzbgtVar2 = (zzbgt) socketAddressZze;
            zzbgtVar = zzbgtVar2;
            socketAddressZze = zzbgtVar2.zzd();
        } else {
            zzbgtVar = null;
        }
        zzbez zzbezVarZzf = zzbqaVar.zzf();
        String str = (String) zzbezVarZzf.zza(zzbgl.zza);
        zzblv zzblvVar = new zzblv();
        if (str == null) {
            str = this.zzb;
        }
        zzblvVar.zzb(str);
        zzblvVar.zzd(zzbezVarZzf);
        zzblvVar.zzf(this.zzc);
        zzblvVar.zzh(zzbgtVar);
        zzbqf zzbqfVar = new zzbqf();
        zzbqfVar.zza = this.zza;
        zzbpy zzbpyVar = new zzbpy(this.zze.zza(socketAddressZze, zzblvVar, zzbqfVar), this.zzh, bArr);
        zzbqfVar.zza = zzbpyVar.zzc();
        this.zzg.zzd(zzbpyVar);
        this.zzu = zzbpyVar;
        this.zzs.add(zzbpyVar);
        zzbpyVar.zzao(new zzbqe(this, zzbpyVar));
        this.zzi.zzb(2, "Started transport {0}", zzbqfVar.zza);
    }

    final /* synthetic */ void zzg(zzbjv zzbjvVar) {
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzc();
        zzK(zzbfz.zzb(zzbjvVar));
        if (this.zzj) {
            return;
        }
        if (this.zzz == null) {
            this.zzz = new zzbon();
        }
        long jZza = this.zzz.zza();
        u uVar = this.zzo;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jD = jZza - uVar.d(timeUnit);
        this.zzi.zzb(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", zzM(zzbjvVar), Long.valueOf(jD));
        p.x(this.zzp == null, "previous reconnectTask is not done");
        this.zzp = zzbkdVar.zzd(new zzbpo(this), jD, timeUnit, this.zzf);
    }

    final /* synthetic */ void zzh(zzbfy zzbfyVar) {
        this.zzl.zzc();
        zzK(zzbfz.zza(zzbfyVar));
    }

    final /* synthetic */ void zzi() {
        zzbpt zzbptVar = new zzbpt(this);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbptVar);
        zzbkdVar.zza();
    }

    final /* synthetic */ void zzj(zzbmg zzbmgVar, boolean z10) {
        zzbpu zzbpuVar = new zzbpu(this, zzbmgVar, z10);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbpuVar);
        zzbkdVar.zza();
    }

    final /* synthetic */ void zzk() {
        this.zzl.zzc();
        zzbkc zzbkcVar = this.zzp;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
            this.zzp = null;
            this.zzz = null;
        }
    }

    private static void zzL(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p.r(it.next(), str);
        }
    }

    public final String toString() {
        return j.c(this).c("logId", this.zza.zzc()).d("addressGroups", this.zzn).toString();
    }

    final void zze(zzbjv zzbjvVar) {
        zzd(zzbjvVar);
        zzbpv zzbpvVar = new zzbpv(this, zzbjvVar);
        zzbkd zzbkdVar = this.zzl;
        zzbkdVar.zzb(zzbpvVar);
        zzbkdVar.zza();
    }
}
