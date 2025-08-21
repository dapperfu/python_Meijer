package com.google.android.libraries.places.internal;

import De.j;
import De.p;
import De.u;
import De.w;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbrx extends zzbif implements zzbhe {
    static final Logger zza = Logger.getLogger(zzbrx.class.getName());
    private static final zzbfi zzaj;
    static final zzbjv zzb;
    static final zzbjv zzc;
    static final zzbjv zzd;
    private static final zzbsh zzg;
    private static final zzbhb zzh;
    private static final zzbhs zzi;
    private final zzbfe zzA;
    private final List zzB;
    private final String zzC;
    private zzbjf zzD;
    private boolean zzE;
    private zzbrf zzF;
    private boolean zzG;
    private final Set zzH;
    private Collection zzI;
    private final Object zzJ;
    private final Set zzK;
    private final zzbnh zzL;
    private final zzbrw zzM;
    private final AtomicBoolean zzN;
    private boolean zzO;
    private boolean zzP;
    private volatile boolean zzQ;
    private final CountDownLatch zzR;
    private final zzblg zzS;
    private final zzblh zzT;
    private final zzblj zzU;
    private final zzbfg zzV;
    private final zzbgy zzW;
    private final zzbrr zzX;
    private zzbsh zzY;
    private boolean zzZ;
    private final boolean zzaa;
    private final zzbuu zzab;
    private final long zzac;
    private final long zzad;
    private final boolean zzae;
    private final zzbsi zzaf;
    private final zzbqx zzag;
    private final zzbub zzah;
    private final zzbiw zzai;
    private int zzak;
    private final zzbom zzal;
    final zzbkd zze;
    final zzbpk zzf;
    private final zzbhf zzj;
    private final String zzk;
    private final URI zzl;
    private final zzbjg zzm;
    private final zzbiy zzn;
    private final zzblb zzo;
    private final zzblw zzp;
    private final zzbrs zzq;
    private final Executor zzr;
    private final zzbsu zzs;
    private final zzbrb zzt;
    private final zzbrb zzu;
    private final zzbwk zzv;
    private final zzbgj zzw;
    private final w zzx;
    private final long zzy;
    private final zzbmi zzz;

    final /* synthetic */ zzbmi zzA() {
        return this.zzz;
    }

    final /* synthetic */ List zzB() {
        return this.zzB;
    }

    final /* synthetic */ String zzC() {
        return this.zzC;
    }

    final /* synthetic */ zzbjf zzD() {
        return this.zzD;
    }

    final /* synthetic */ zzbrf zzE() {
        return this.zzF;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzG;
    }

    final /* synthetic */ Set zzG() {
        return this.zzH;
    }

    final /* synthetic */ Collection zzH() {
        return this.zzI;
    }

    final /* synthetic */ void zzI(Collection collection) {
        this.zzI = collection;
    }

    final /* synthetic */ Object zzJ() {
        return this.zzJ;
    }

    final /* synthetic */ zzbnh zzK() {
        return this.zzL;
    }

    final /* synthetic */ zzbrw zzL() {
        return this.zzM;
    }

    final /* synthetic */ AtomicBoolean zzM() {
        return this.zzN;
    }

    final /* synthetic */ boolean zzN() {
        return this.zzO;
    }

    final /* synthetic */ void zzO(boolean z10) {
        this.zzO = true;
    }

    final /* synthetic */ boolean zzP() {
        return this.zzP;
    }

    final /* synthetic */ void zzQ(boolean z10) {
        this.zzP = true;
    }

    final /* synthetic */ boolean zzR() {
        return this.zzQ;
    }

    final /* synthetic */ zzblg zzS() {
        return this.zzS;
    }

    final /* synthetic */ zzblh zzT() {
        return this.zzT;
    }

    final /* synthetic */ zzblj zzU() {
        return this.zzU;
    }

    final /* synthetic */ zzbfg zzV() {
        return this.zzV;
    }

    final /* synthetic */ zzbgy zzW() {
        return this.zzW;
    }

    final /* synthetic */ zzbrr zzX() {
        return this.zzX;
    }

    final /* synthetic */ zzbsh zzY() {
        return this.zzY;
    }

    final /* synthetic */ void zzZ(zzbsh zzbshVar) {
        this.zzY = zzbshVar;
    }

    final /* synthetic */ boolean zzaa() {
        return this.zzZ;
    }

    final /* synthetic */ void zzab(boolean z10) {
        this.zzZ = true;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzaa;
    }

    final /* synthetic */ zzbuu zzad() {
        return this.zzab;
    }

    final /* synthetic */ long zzae() {
        return this.zzac;
    }

    final /* synthetic */ long zzaf() {
        return this.zzad;
    }

    final /* synthetic */ boolean zzag() {
        return this.zzae;
    }

    final /* synthetic */ zzbqx zzah() {
        return this.zzag;
    }

    final /* synthetic */ int zzaj() {
        return this.zzak;
    }

    final /* synthetic */ void zzak(int i10) {
        this.zzak = i10;
    }

    final /* synthetic */ zzbom zzal() {
        return this.zzal;
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        return this.zzj;
    }

    final /* synthetic */ void zzj(boolean z10) {
        zzam(false);
    }

    final /* synthetic */ void zzk() {
        zzam(true);
        zzbnh zzbnhVar = this.zzL;
        zzbnhVar.zzg(null);
        this.zzV.zza(2, "Entering IDLE state");
        this.zzz.zza(zzbfy.IDLE);
        if (this.zzf.zzc(this.zzJ, zzbnhVar)) {
            zze();
        }
    }

    final /* synthetic */ zzblw zzu() {
        return this.zzp;
    }

    final /* synthetic */ zzbrs zzv() {
        return this.zzq;
    }

    final /* synthetic */ Executor zzw() {
        return this.zzr;
    }

    final /* synthetic */ zzbwk zzx() {
        return this.zzv;
    }

    final /* synthetic */ zzbgj zzy() {
        return this.zzw;
    }

    static {
        zzbjv zzbjvVar = zzbjv.zzi;
        zzb = zzbjvVar.zze("Channel shutdownNow invoked");
        zzc = zzbjvVar.zze("Channel shutdown invoked");
        zzd = zzbjvVar.zze("Subchannel shutdown invoked");
        zzg = new zzbsh(null, new HashMap(), new HashMap(), null, null, null);
        zzh = new zzbqo();
        zzi = new zzbqt();
        zzaj = new zzbqv();
    }

    zzbrx(zzbsc zzbscVar, zzblw zzblwVar, URI uri, zzbjg zzbjgVar, zzbom zzbomVar, zzbsu zzbsuVar, w wVar, List list, zzbwk zzbwkVar) {
        zzbkd zzbkdVar = new zzbkd(new zzbqu(this));
        this.zze = zzbkdVar;
        this.zzz = new zzbmi();
        this.zzH = new HashSet(16, 0.75f);
        this.zzJ = new Object();
        this.zzK = new HashSet(1, 0.75f);
        byte[] bArr = null;
        this.zzM = new zzbrw(this, bArr);
        this.zzN = new AtomicBoolean(false);
        this.zzR = new CountDownLatch(1);
        this.zzak = 1;
        this.zzY = zzg;
        this.zzZ = false;
        this.zzab = new zzbuu();
        int i10 = zzbgg.zza;
        zzbra zzbraVar = new zzbra(this, bArr);
        this.zzaf = zzbraVar;
        this.zzf = new zzbrc(this, null);
        this.zzag = new zzbqx(this, null);
        String str = (String) p.r(zzbscVar.zzh, "target");
        this.zzk = str;
        zzbhf zzbhfVarZzb = zzbhf.zzb("Channel", str);
        this.zzj = zzbhfVarZzb;
        this.zzv = (zzbwk) p.r(zzbwkVar, "timeProvider");
        zzbsu zzbsuVar2 = (zzbsu) p.r(zzbscVar.zzd, "executorPool");
        this.zzs = zzbsuVar2;
        Executor executor = (Executor) p.r((Executor) zzbsuVar2.zza(), "executor");
        this.zzr = executor;
        zzbrb zzbrbVar = new zzbrb((zzbsu) p.r(zzbscVar.zze, "offloadExecutorPool"));
        this.zzu = zzbrbVar;
        zzblf zzblfVar = new zzblf(zzblwVar, null, zzbrbVar);
        this.zzp = zzblfVar;
        new zzblf(zzblwVar, null, zzbrbVar);
        zzbrs zzbrsVar = new zzbrs(zzblfVar.zzb(), null);
        this.zzq = zzbrsVar;
        long jZza = zzbwkVar.zza();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 14);
        sb2.append("Channel for '");
        sb2.append(str);
        sb2.append("'");
        zzblj zzbljVar = new zzblj(zzbhfVarZzb, 0, jZza, sb2.toString());
        this.zzU = zzbljVar;
        zzbli zzbliVar = new zzbli(zzbljVar, zzbwkVar);
        this.zzV = zzbliVar;
        zzbjn zzbjnVar = zzbpf.zzk;
        this.zzae = true;
        zzblb zzblbVar = new zzblb(zzbie.zza(), zzbscVar.zzj);
        this.zzo = zzblbVar;
        this.zzl = (URI) p.r(uri, "targetUri");
        this.zzm = (zzbjg) p.r(zzbjgVar, "nameResolverProvider");
        zzbvr zzbvrVar = new zzbvr(true, 5, 5, zzblbVar);
        zzbss zzbssVar = new zzbss(zzbscVar.zzo, zzbiv.zza());
        this.zzai = zzbssVar;
        zzbix zzbixVarZzg = zzbiy.zzg();
        zzbscVar.zzc();
        zzbixVarZzg.zza(443);
        zzbixVarZzg.zzb(zzbjnVar);
        zzbixVarZzg.zzc(zzbkdVar);
        zzbixVarZzg.zzd(zzbrsVar);
        zzbixVarZzg.zze(zzbvrVar);
        zzbixVarZzg.zzf(zzbliVar);
        zzbixVarZzg.zzg(zzbrbVar);
        zzbixVarZzg.zzh(zzbssVar);
        zzbixVarZzg.zzi(zzbscVar.zzf);
        zzbiy zzbiyVarZzj = zzbixVarZzg.zzj();
        this.zzn = zzbiyVarZzj;
        this.zzD = zzf(uri, null, zzbjgVar, zzbiyVarZzj);
        this.zzt = new zzbrb(zzbsuVar);
        zzbnh zzbnhVar = new zzbnh(executor, zzbkdVar);
        this.zzL = zzbnhVar;
        zzbnhVar.zzao(zzbraVar);
        this.zzal = zzbomVar;
        this.zzaa = true;
        zzbrr zzbrrVar = new zzbrr(this, this.zzD.zza(), null);
        this.zzX = zzbrrVar;
        this.zzA = zzbfl.zza(zzbrrVar, list);
        this.zzB = new ArrayList(zzbscVar.zzg);
        this.zzx = (w) p.r(wVar, "stopwatchSupplier");
        long j10 = zzbscVar.zzm;
        if (j10 == -1) {
            this.zzy = -1L;
        } else {
            p.k(j10 >= zzbsc.zzb, "invalid idleTimeoutMillis %s", j10);
            this.zzy = zzbscVar.zzm;
        }
        this.zzah = new zzbub(new zzbrd(this, null), zzbkdVar, zzblfVar.zzb(), u.c());
        this.zzw = (zzbgj) p.r(zzbscVar.zzk, "decompressorRegistry");
        this.zzC = zzbscVar.zzi;
        this.zzad = 16777216L;
        this.zzac = 1048576L;
        zzbqq zzbqqVar = new zzbqq(this, zzbwkVar);
        this.zzS = zzbqqVar;
        this.zzT = zzbqqVar.zza();
        zzbgy zzbgyVar = (zzbgy) p.q(zzbscVar.zzn);
        this.zzW = zzbgyVar;
        zzbgyVar.zzc(this);
    }

    private final void zzam(boolean z10) {
        this.zze.zzc();
        if (z10) {
            p.x(this.zzE, "nameResolver is not started");
            p.x(this.zzF != null, "lbHelper is null");
        }
        zzbjf zzbjfVar = this.zzD;
        if (zzbjfVar != null) {
            zzbjfVar.zzc();
            this.zzE = false;
            if (z10) {
                this.zzD = zzf(this.zzl, null, this.zzm, this.zzn);
            } else {
                this.zzD = null;
            }
        }
        zzbrf zzbrfVar = this.zzF;
        if (zzbrfVar != null) {
            zzbrfVar.zza.zzb();
            this.zzF = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzan, reason: merged with bridge method [inline-methods] */
    public final void zzm() {
        long j10 = this.zzy;
        if (j10 == -1) {
            return;
        }
        this.zzah.zza(j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        return this.zzA.zza(zzbiuVar, zzbfdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        return this.zzA.zzb();
    }

    final void zze() {
        this.zze.zzc();
        if (this.zzN.get() || this.zzG) {
            return;
        }
        if (this.zzf.zzb()) {
            this.zzah.zzb(false);
        } else {
            zzm();
        }
        if (this.zzF == null) {
            this.zzV.zza(2, "Exiting idle mode");
            zzbrf zzbrfVar = new zzbrf(this, null);
            zzbrfVar.zza = new zzbkw(this.zzo, zzbrfVar);
            this.zzF = zzbrfVar;
            this.zzz.zza(zzbfy.CONNECTING);
            this.zzD.zzb(new zzbrh(this, zzbrfVar, this.zzD));
            this.zzE = true;
        }
    }

    public final zzbrx zzg() {
        zzbfg zzbfgVar = this.zzV;
        zzbfgVar.zza(1, "shutdownNow() called");
        zzbfgVar.zza(1, "shutdown() called");
        if (this.zzN.compareAndSet(false, true)) {
            zzbkd zzbkdVar = this.zze;
            zzbkdVar.zzb(new zzbqr(this));
            zzbkdVar.zza();
            zzbrr zzbrrVar = this.zzX;
            zzbkd zzbkdVar2 = zzbrrVar.zza.zze;
            zzbkdVar2.zzb(new zzbrj(zzbrrVar));
            zzbkdVar2.zza();
            zzbkdVar.zzb(new zzbqp(this));
            zzbkdVar.zza();
        }
        zzbrr zzbrrVar2 = this.zzX;
        zzbkd zzbkdVar3 = zzbrrVar2.zza.zze;
        zzbkdVar3.zzb(new zzbrk(zzbrrVar2));
        zzbkdVar3.zza();
        zzbkd zzbkdVar4 = this.zze;
        zzbkdVar4.zzb(new zzbqs(this));
        zzbkdVar4.zza();
        return this;
    }

    final void zzh(Throwable th2) {
        if (this.zzG) {
            return;
        }
        this.zzG = true;
        try {
            this.zzah.zzb(true);
            zzam(false);
        } finally {
            this.zzL.zzg(new zzbhq(zzbht.zzc(zzbjv.zzh.zze("Panic! This is a bug!").zzd(th2))));
            this.zzX.zzc(null);
            this.zzV.zza(4, "PANIC! Entering TRANSIENT_FAILURE");
            this.zzz.zza(zzbfy.TRANSIENT_FAILURE);
        }
    }

    final /* synthetic */ void zzi() {
        if (this.zzO) {
            Iterator it = this.zzH.iterator();
            while (it.hasNext()) {
                ((zzbqg) it.next()).zze(zzb);
            }
            Iterator it2 = this.zzK.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zzah.zzb(true);
    }

    final /* synthetic */ void zzn() {
        this.zze.zzc();
        if (this.zzE) {
            this.zzD.zzd();
        }
    }

    final /* synthetic */ void zzo(zzbhy zzbhyVar) {
        this.zzL.zzg(zzbhyVar);
    }

    final /* synthetic */ void zzq() {
        if (!this.zzQ && this.zzN.get() && this.zzH.isEmpty() && this.zzK.isEmpty()) {
            this.zzV.zza(2, "Terminated");
            this.zzW.zzf(this);
            this.zzs.zzb(this.zzr);
            this.zzt.zzb();
            this.zzu.zzb();
            this.zzp.close();
            this.zzQ = true;
            this.zzR.countDown();
        }
    }

    final /* synthetic */ w zzz() {
        return this.zzx;
    }

    static zzbjf zzf(URI uri, String str, zzbjg zzbjgVar, zzbiy zzbiyVar) {
        zzbjf zzbjfVarZza = zzbjgVar.zza(uri, zzbiyVar);
        if (zzbjfVarZza != null) {
            return new zzbvq(zzbjfVarZza, new zzbld(new zzbom(), zzbiyVar.zzd(), zzbiyVar.zzc()), zzbiyVar.zzc());
        }
        throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(uri)));
    }

    public final String toString() {
        return j.c(this).c("logId", this.zzj.zzc()).d("target", this.zzk).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbif
    public final /* bridge */ /* synthetic */ zzbif zzd() {
        zzg();
        return this;
    }

    final /* synthetic */ Executor zzp(zzbfd zzbfdVar) {
        Executor executorZzj = zzbfdVar.zzj();
        if (executorZzj == null) {
            return this.zzr;
        }
        return executorZzj;
    }
}
