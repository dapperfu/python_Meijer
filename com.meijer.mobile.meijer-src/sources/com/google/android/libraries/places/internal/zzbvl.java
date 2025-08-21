package com.google.android.libraries.places.internal;

import De.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
abstract class zzbvl implements zzblr {
    private static final Random zzD;
    private static final boolean zzE;
    private static final zzbjv zza;
    static final zzbil zze;
    static final zzbil zzf;
    private long zzA;
    private zzbjv zzB;
    private boolean zzC;
    private final zzbiu zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzg;
    private final zzbip zzh;
    private final zzbvm zzi;
    private final zzbpg zzj;
    private final boolean zzk;
    private final zzbuu zzm;
    private final long zzn;
    private final long zzo;
    private final zzbvk zzp;
    private zzbuy zzv;
    private long zzw;
    private zzblt zzx;
    private zzbuv zzy;
    private zzbuv zzz;
    private final Executor zzd = new zzbkd(new zzbuc(this));
    private final Object zzl = new Object();
    private final zzbpl zzq = new zzbpl();
    private volatile zzbva zzr = new zzbva(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    private final AtomicBoolean zzs = new AtomicBoolean();
    private final AtomicInteger zzt = new AtomicInteger();
    private final AtomicInteger zzu = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        r10 = (com.google.android.libraries.places.internal.zzbkd) r9.zzd;
        r10.zzb(r1);
        r10.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        r10.zza.zzf(new com.google.android.libraries.places.internal.zzbvi(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r0 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r9.zzr.zzf != r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r10 = r9.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        r10 = com.google.android.libraries.places.internal.zzbvl.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r0.zzl(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        if (r5 >= r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        r7 = (com.google.android.libraries.places.internal.zzbus) r3.get(r5);
        r7.zza(r10);
        r4 = r4 | (r7 instanceof com.google.android.libraries.places.internal.zzbuz);
        r7 = r9.zzr;
        r8 = r7.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        if (r8 != r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        if (r7.zzg == false) goto L62;
     */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzx(com.google.android.libraries.places.internal.zzbvj r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.zzl
            monitor-enter(r5)
            com.google.android.libraries.places.internal.zzbva r6 = r9.zzr     // Catch: java.lang.Throwable -> L12
            com.google.android.libraries.places.internal.zzbvj r7 = r6.zzf     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L15
            if (r7 == r10) goto L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L12:
            r10 = move-exception
            goto Lac
        L15:
            boolean r7 = r6.zzg     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L1b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L1b:
            java.util.List r7 = r6.zzb     // Catch: java.lang.Throwable -> L12
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L12
            if (r2 != r8) goto L61
            com.google.android.libraries.places.internal.zzbva r0 = r6.zza(r10)     // Catch: java.lang.Throwable -> L12
            r9.zzr = r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r9.zzm()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L31
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L31:
            com.google.android.libraries.places.internal.zzbuq r1 = new com.google.android.libraries.places.internal.zzbuq     // Catch: java.lang.Throwable -> L12
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
        L37:
            if (r1 == 0) goto L44
            java.util.concurrent.Executor r10 = r9.zzd
            com.google.android.libraries.places.internal.zzbkd r10 = (com.google.android.libraries.places.internal.zzbkd) r10
            r10.zzb(r1)
            r10.zza()
            return
        L44:
            if (r4 != 0) goto L50
            com.google.android.libraries.places.internal.zzblr r0 = r10.zza
            com.google.android.libraries.places.internal.zzbvi r1 = new com.google.android.libraries.places.internal.zzbvi
            r1.<init>(r9, r10)
            r0.zzf(r1)
        L50:
            com.google.android.libraries.places.internal.zzblr r0 = r10.zza
            com.google.android.libraries.places.internal.zzbva r1 = r9.zzr
            com.google.android.libraries.places.internal.zzbvj r1 = r1.zzf
            if (r1 != r10) goto L5b
            com.google.android.libraries.places.internal.zzbjv r10 = r9.zzB
            goto L5d
        L5b:
            com.google.android.libraries.places.internal.zzbjv r10 = com.google.android.libraries.places.internal.zzbvl.zza
        L5d:
            r0.zzl(r10)
            return
        L61:
            boolean r6 = r10.zzb     // Catch: java.lang.Throwable -> L12
            if (r6 == 0) goto L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L67:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L12
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L7d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L12
            goto L87
        L7d:
            r3.clear()     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> L12
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L12
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.size()
            r5 = r0
        L8d:
            if (r5 >= r2) goto La9
            java.lang.Object r7 = r3.get(r5)
            com.google.android.libraries.places.internal.zzbus r7 = (com.google.android.libraries.places.internal.zzbus) r7
            r7.zza(r10)
            boolean r7 = r7 instanceof com.google.android.libraries.places.internal.zzbuz
            r4 = r4 | r7
            com.google.android.libraries.places.internal.zzbva r7 = r9.zzr
            com.google.android.libraries.places.internal.zzbvj r8 = r7.zzf
            if (r8 == 0) goto La3
            if (r8 != r10) goto La9
        La3:
            boolean r7 = r7.zzg
            int r5 = r5 + 1
            if (r7 == 0) goto L8d
        La9:
            r2 = r6
            goto L5
        Lac:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbvl.zzx(com.google.android.libraries.places.internal.zzbvj):void");
    }

    final /* synthetic */ zzbiu zzD() {
        return this.zzb;
    }

    final /* synthetic */ Executor zzE() {
        return this.zzc;
    }

    final /* synthetic */ Executor zzF() {
        return this.zzd;
    }

    final /* synthetic */ ScheduledExecutorService zzG() {
        return this.zzg;
    }

    final /* synthetic */ zzbvm zzH() {
        return this.zzi;
    }

    final /* synthetic */ zzbpg zzI() {
        return this.zzj;
    }

    final /* synthetic */ boolean zzJ() {
        return this.zzk;
    }

    final /* synthetic */ Object zzK() {
        return this.zzl;
    }

    final /* synthetic */ zzbuu zzL() {
        return this.zzm;
    }

    final /* synthetic */ long zzM() {
        return this.zzn;
    }

    final /* synthetic */ long zzN() {
        return this.zzo;
    }

    final /* synthetic */ zzbvk zzO() {
        return this.zzp;
    }

    final /* synthetic */ zzbpl zzP() {
        return this.zzq;
    }

    final /* synthetic */ zzbva zzQ() {
        return this.zzr;
    }

    final /* synthetic */ void zzR(zzbva zzbvaVar) {
        this.zzr = zzbvaVar;
    }

    final /* synthetic */ AtomicBoolean zzS() {
        return this.zzs;
    }

    final /* synthetic */ AtomicInteger zzT() {
        return this.zzt;
    }

    final /* synthetic */ AtomicInteger zzU() {
        return this.zzu;
    }

    final /* synthetic */ zzbuy zzV() {
        return this.zzv;
    }

    final /* synthetic */ long zzW() {
        return this.zzw;
    }

    final /* synthetic */ void zzX(long j10) {
        this.zzw = j10;
    }

    final /* synthetic */ zzblt zzY() {
        return this.zzx;
    }

    final /* synthetic */ void zzZ(zzbuv zzbuvVar) {
        this.zzy = zzbuvVar;
    }

    final /* synthetic */ void zzaa(zzbuv zzbuvVar) {
        this.zzz = zzbuvVar;
    }

    final /* synthetic */ long zzab() {
        return this.zzA;
    }

    final /* synthetic */ void zzac(long j10) {
        this.zzA = j10;
    }

    final /* synthetic */ boolean zzad() {
        return this.zzC;
    }

    final /* synthetic */ void zzae(boolean z10) {
        this.zzC = true;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final zzbez zzam() {
        throw null;
    }

    abstract zzbjv zze();

    abstract void zzg();

    abstract zzblr zzh(zzbip zzbipVar, zzbfm zzbfmVar, int i10, boolean z10);

    static {
        zzbik zzbikVar = zzbip.zza;
        zze = zzbil.zzc("grpc-previous-rpc-attempts", zzbikVar);
        zzf = zzbil.zzc("grpc-retry-pushback-ms", zzbikVar);
        zza = zzbjv.zzb.zze("Stream thrown away because RetriableStream committed");
        zzD = new Random();
        zzE = zzbpf.zzj("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    zzbvl(zzbiu zzbiuVar, zzbip zzbipVar, zzbuu zzbuuVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, zzbvm zzbvmVar, zzbpg zzbpgVar, zzbvk zzbvkVar) {
        this.zzb = zzbiuVar;
        this.zzm = zzbuuVar;
        this.zzn = j10;
        this.zzo = j11;
        this.zzc = executor;
        this.zzg = scheduledExecutorService;
        this.zzh = zzbipVar;
        this.zzi = zzbvmVar;
        if (zzbvmVar != null) {
            this.zzA = zzbvmVar.zzb;
        }
        this.zzj = zzbpgVar;
        p.e(zzbvmVar == null || zzbpgVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.zzk = zzbpgVar != null;
        this.zzp = zzbvkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final Runnable zzo(zzbvj zzbvjVar) {
        List list;
        Collection collectionSingleton;
        boolean z10;
        Future future;
        Future future2;
        synchronized (this.zzl) {
            try {
                if (this.zzr.zzf != null) {
                    return null;
                }
                Collection collection = this.zzr.zzc;
                zzbva zzbvaVar = this.zzr;
                p.x(zzbvaVar.zzf == null, "Already committed");
                List list2 = zzbvaVar.zzb;
                if (zzbvaVar.zzc.contains(zzbvjVar)) {
                    list = null;
                    collectionSingleton = Collections.singleton(zzbvjVar);
                    z10 = true;
                } else {
                    list = list2;
                    collectionSingleton = Collections.EMPTY_LIST;
                    z10 = false;
                }
                this.zzr = new zzbva(list, collectionSingleton, zzbvaVar.zzd, zzbvjVar, zzbvaVar.zzg, z10, zzbvaVar.zzh, zzbvaVar.zze);
                this.zzm.zza(-this.zzw);
                zzbuv zzbuvVar = this.zzy;
                boolean z11 = zzbuvVar != null ? zzbuvVar.zzc : false;
                if (zzbuvVar != null) {
                    Future futureZzb = zzbuvVar.zzb();
                    this.zzy = null;
                    future = futureZzb;
                } else {
                    future = null;
                }
                zzbuv zzbuvVar2 = this.zzz;
                if (zzbuvVar2 != null) {
                    Future futureZzb2 = zzbuvVar2.zzb();
                    this.zzz = null;
                    future2 = futureZzb2;
                } else {
                    future2 = null;
                }
                return new zzbue(this, collection, zzbvjVar, future, z11, future2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final zzbvj zzq(int i10, boolean z10) {
        AtomicInteger atomicInteger;
        int i11;
        do {
            atomicInteger = this.zzu;
            i11 = atomicInteger.get();
            if (i11 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + 1));
        zzbvj zzbvjVar = new zzbvj(i10);
        zzbup zzbupVar = new zzbup(this, new zzbut(this, zzbvjVar));
        zzbip zzbipVar = this.zzh;
        zzbip zzbipVar2 = new zzbip();
        zzbipVar2.zzf(zzbipVar);
        if (i10 > 0) {
            zzbipVar2.zzc(zze, String.valueOf(i10));
        }
        zzbvjVar.zza = zzh(zzbipVar2, zzbupVar, i10, z10);
        return zzbvjVar;
    }

    private final void zzai(zzbus zzbusVar) {
        Collection collection;
        synchronized (this.zzl) {
            try {
                if (!this.zzr.zza) {
                    this.zzr.zzb.add(zzbusVar);
                }
                collection = this.zzr.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzbusVar.zza((zzbvj) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final boolean zzz(zzbva zzbvaVar) {
        return zzbvaVar.zzf == null && zzbvaVar.zze < this.zzj.zza && !zzbvaVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzak, reason: merged with bridge method [inline-methods] */
    public final void zzA() {
        Future future;
        synchronized (this.zzl) {
            try {
                zzbuv zzbuvVar = this.zzz;
                future = null;
                if (zzbuvVar != null) {
                    Future futureZzb = zzbuvVar.zzb();
                    this.zzz = null;
                    future = futureZzb;
                }
                this.zzr = this.zzr.zzb();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzal, reason: merged with bridge method [inline-methods] */
    public final void zzB(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        this.zzv = new zzbuy(zzbjvVar, zzblsVar, zzbipVar);
        if (this.zzu.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            zzbkd zzbkdVar = (zzbkd) this.zzd;
            zzbkdVar.zzb(new zzbur(this, zzbjvVar, zzblsVar, zzbipVar));
            zzbkdVar.zza();
        }
    }

    public static long zzj(long j10) {
        return (long) (j10 * (zzE ? (zzD.nextDouble() * 0.8d) + 0.4d : zzD.nextDouble()));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zza(zzbgg zzbggVar) {
        zzai(new zzbug(this, zzbggVar));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzb(int i10) {
        zzai(new zzbul(this, i10));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzc(int i10) {
        zzai(new zzbuk(this, i10));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzd(zzbgj zzbgjVar) {
        zzai(new zzbuh(this, zzbgjVar));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        zzbuv zzbuvVar;
        zzbvk zzbvkVar;
        this.zzx = zzbltVar;
        zzbjv zzbjvVarZze = zze();
        if (zzbjvVarZze != null) {
            zzl(zzbjvVarZze);
            return;
        }
        synchronized (this.zzl) {
            this.zzr.zzb.add(new zzbuz(this));
        }
        zzbvj zzbvjVarZzq = zzq(0, false);
        if (zzbvjVarZzq == null) {
            return;
        }
        if (this.zzk) {
            Object obj = this.zzl;
            synchronized (obj) {
                try {
                    this.zzr = this.zzr.zzc(zzbvjVarZzq);
                    zzbuvVar = null;
                    if (zzz(this.zzr) && ((zzbvkVar = this.zzp) == null || zzbvkVar.zza())) {
                        zzbuvVar = new zzbuv(obj);
                        this.zzz = zzbuvVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zzbuvVar != null) {
                zzbuvVar.zza(this.zzg.schedule(new zzbux(this, zzbuvVar), this.zzj.zzb, TimeUnit.NANOSECONDS));
            }
        }
        zzx(zzbvjVarZzq);
    }

    final void zzi(Object obj) {
        zzbva zzbvaVar = this.zzr;
        if (zzbvaVar.zza) {
            zzbvaVar.zzf.zza.zzt(this.zzb.zze(obj));
        } else {
            zzai(new zzbuo(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzk() {
        zzai(new zzbuj(this));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzl(zzbjv zzbjvVar) {
        zzbvj zzbvjVar;
        zzbvj zzbvjVar2 = new zzbvj(0);
        zzbvjVar2.zza = new zzbst();
        Runnable runnableZzo = zzo(zzbvjVar2);
        if (runnableZzo != null) {
            synchronized (this.zzl) {
                this.zzr = this.zzr.zza(zzbvjVar2);
            }
            runnableZzo.run();
            zzB(zzbjvVar, zzbls.PROCESSED, new zzbip());
            return;
        }
        synchronized (this.zzl) {
            try {
                if (this.zzr.zzc.contains(this.zzr.zzf)) {
                    zzbvjVar = this.zzr.zzf;
                } else {
                    this.zzB = zzbjvVar;
                    zzbvjVar = null;
                }
                zzbva zzbvaVar = this.zzr;
                this.zzr = new zzbva(zzbvaVar.zzb, zzbvaVar.zzc, zzbvaVar.zzd, zzbvaVar.zzf, true, zzbvaVar.zza, zzbvaVar.zzh, zzbvaVar.zze);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzbvjVar != null) {
            zzbvjVar.zza.zzl(zzbjvVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final boolean zzm() {
        Iterator it = this.zzr.zzc.iterator();
        while (it.hasNext()) {
            if (((zzbvj) it.next()).zza.zzm()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        zzbva zzbvaVar;
        synchronized (this.zzl) {
            zzbplVar.zzb("closed", this.zzq);
            zzbvaVar = this.zzr;
        }
        zzbvj zzbvjVar = zzbvaVar.zzf;
        if (zzbvjVar != null) {
            zzbpl zzbplVar2 = new zzbpl();
            zzbvjVar.zza.zzn(zzbplVar2);
            zzbplVar.zzb("committed", zzbplVar2);
            return;
        }
        zzbpl zzbplVar3 = new zzbpl();
        for (zzbvj zzbvjVar2 : zzbvaVar.zzc) {
            zzbpl zzbplVar4 = new zzbpl();
            zzbvjVar2.zza.zzn(zzbplVar4);
            zzbplVar3.zza(zzbplVar4);
        }
        zzbplVar.zzb("open", zzbplVar3);
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzr() {
        zzai(new zzbum(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzs(int i10) {
        zzbva zzbvaVar = this.zzr;
        if (zzbvaVar.zza) {
            zzbvaVar.zzf.zza.zzs(i10);
        } else {
            zzai(new zzbun(this, i10));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzt(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzu() {
        zzbva zzbvaVar = this.zzr;
        if (zzbvaVar.zza) {
            zzbvaVar.zzf.zza.zzu();
        } else {
            zzai(new zzbui(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzv(zzbfu zzbfuVar) {
        zzai(new zzbuf(this, zzbfuVar));
    }

    final /* synthetic */ void zzy(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            zzA();
            return;
        }
        Object obj = this.zzl;
        synchronized (obj) {
            try {
                zzbuv zzbuvVar = this.zzz;
                if (zzbuvVar == null) {
                    return;
                }
                Future futureZzb = zzbuvVar.zzb();
                zzbuv zzbuvVar2 = new zzbuv(obj);
                this.zzz = zzbuvVar2;
                if (futureZzb != null) {
                    futureZzb.cancel(false);
                }
                zzbuvVar2.zza(this.zzg.schedule(new zzbux(this, zzbuvVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void zzp(zzbvj zzbvjVar) {
        Runnable runnableZzo = zzo(zzbvjVar);
        if (runnableZzo != null) {
            this.zzc.execute(runnableZzo);
        }
    }
}
