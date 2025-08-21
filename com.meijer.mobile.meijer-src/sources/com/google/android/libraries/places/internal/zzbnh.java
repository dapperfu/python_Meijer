package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class zzbnh implements zzbsj {
    private final Executor zzc;
    private final zzbkd zzd;
    private Runnable zze;
    private Runnable zzf;
    private Runnable zzg;
    private zzbsi zzh;
    private final zzbhf zza = zzbhf.zza(zzbnh.class, null);
    private final Object zzb = new Object();
    private Collection zzi = new LinkedHashSet();
    private volatile zzbng zzj = new zzbng(null, null, null);

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        return this.zza;
    }

    final /* synthetic */ Object zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzbkd zzi() {
        return this.zzd;
    }

    final /* synthetic */ Runnable zzj() {
        return this.zzf;
    }

    final /* synthetic */ Runnable zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(Runnable runnable) {
        this.zzg = null;
    }

    final /* synthetic */ zzbsi zzm() {
        return this.zzh;
    }

    final /* synthetic */ Collection zzn() {
        return this.zzi;
    }

    final /* synthetic */ zzbng zzo() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final Runnable zzao(zzbsi zzbsiVar) {
        this.zzh = zzbsiVar;
        this.zze = new zzbnb(this, zzbsiVar);
        this.zzf = new zzbnc(this, zzbsiVar);
        this.zzg = new zzbnd(this, zzbsiVar);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r4 = new com.google.android.libraries.places.internal.zzbnf(r3, r0, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r0.zza().zzk() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r5.zzh() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        r4.zzj(r5.zzf());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r3.zzi.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        r5 = r3.zzi.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r3.zzd.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.libraries.places.internal.zzblr] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.libraries.places.internal.zzboo] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.libraries.places.internal.zzblr] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.libraries.places.internal.zzbnf, java.lang.Object] */
    @Override // com.google.android.libraries.places.internal.zzblu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.internal.zzblr zzb(com.google.android.libraries.places.internal.zzbiu r4, com.google.android.libraries.places.internal.zzbip r5, com.google.android.libraries.places.internal.zzbfd r6, com.google.android.libraries.places.internal.zzbfp[] r7) {
        /*
            r3 = this;
            com.google.android.libraries.places.internal.zzbtq r0 = new com.google.android.libraries.places.internal.zzbtq     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzbsw r1 = new com.google.android.libraries.places.internal.zzbsw     // Catch: java.lang.Throwable -> L19
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L19
            r0.<init>(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzbng r4 = r3.zzj     // Catch: java.lang.Throwable -> L19
        Lc:
            com.google.android.libraries.places.internal.zzbjv r5 = r4.zzb     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L1c
            com.google.android.libraries.places.internal.zzboo r4 = new com.google.android.libraries.places.internal.zzboo     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzbls r6 = com.google.android.libraries.places.internal.zzbls.PROCESSED     // Catch: java.lang.Throwable -> L19
            r4.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L19
            goto L8a
        L19:
            r4 = move-exception
            goto L99
        L1c:
            com.google.android.libraries.places.internal.zzbhy r5 = r4.zza     // Catch: java.lang.Throwable -> L19
            r6 = 0
            if (r5 == 0) goto L40
            com.google.android.libraries.places.internal.zzbht r5 = r5.zza(r0)     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzbfd r1 = r0.zza()     // Catch: java.lang.Throwable -> L19
            boolean r2 = r1.zzk()     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzblu r2 = com.google.android.libraries.places.internal.zzbpf.zze(r5, r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L41
            com.google.android.libraries.places.internal.zzbiu r4 = r0.zzc()     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzbip r5 = r0.zzb()     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzblr r4 = r2.zzb(r4, r5, r1, r7)     // Catch: java.lang.Throwable -> L19
            goto L8a
        L40:
            r5 = r6
        L41:
            java.lang.Object r1 = r3.zzb     // Catch: java.lang.Throwable -> L19
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L19
            com.google.android.libraries.places.internal.zzbng r2 = r3.zzj     // Catch: java.lang.Throwable -> L67
            if (r4 != r2) goto L93
            com.google.android.libraries.places.internal.zzbnf r4 = new com.google.android.libraries.places.internal.zzbnf     // Catch: java.lang.Throwable -> L67
            r4.<init>(r3, r0, r7, r6)     // Catch: java.lang.Throwable -> L67
            com.google.android.libraries.places.internal.zzbfd r6 = r0.zza()     // Catch: java.lang.Throwable -> L67
            boolean r6 = r6.zzk()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L69
            if (r5 == 0) goto L69
            boolean r6 = r5.zzh()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L69
            com.google.android.libraries.places.internal.zzbjv r5 = r5.zzf()     // Catch: java.lang.Throwable -> L67
            r4.zzj(r5)     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r4 = move-exception
            goto L97
        L69:
            java.util.Collection r5 = r3.zzi     // Catch: java.lang.Throwable -> L67
            r5.add(r4)     // Catch: java.lang.Throwable -> L67
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L67
            java.util.Collection r5 = r3.zzi     // Catch: java.lang.Throwable -> L90
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L90
            r6 = 1
            if (r5 != r6) goto L80
            com.google.android.libraries.places.internal.zzbkd r5 = r3.zzd     // Catch: java.lang.Throwable -> L67
            java.lang.Runnable r6 = r3.zze     // Catch: java.lang.Throwable -> L67
            r5.zzb(r6)     // Catch: java.lang.Throwable -> L67
        L80:
            int r5 = r7.length     // Catch: java.lang.Throwable -> L67
            r6 = 0
        L82:
            if (r6 >= r5) goto L89
            r0 = r7[r6]     // Catch: java.lang.Throwable -> L67
            int r6 = r6 + 1
            goto L82
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
        L8a:
            com.google.android.libraries.places.internal.zzbkd r5 = r3.zzd
            r5.zza()
            return r4
        L90:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L90
            throw r4     // Catch: java.lang.Throwable -> L67
        L93:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            r4 = r2
            goto Lc
        L97:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            throw r4     // Catch: java.lang.Throwable -> L19
        L99:
            com.google.android.libraries.places.internal.zzbkd r5 = r3.zzd
            r5.zza()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbnh.zzb(com.google.android.libraries.places.internal.zzbiu, com.google.android.libraries.places.internal.zzbip, com.google.android.libraries.places.internal.zzbfd, com.google.android.libraries.places.internal.zzbfp[]):com.google.android.libraries.places.internal.zzblr");
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zzd(zzbjv zzbjvVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            try {
                if (this.zzj.zzb != null) {
                    return;
                }
                this.zzj = this.zzj.zzb(zzbjvVar);
                zzbkd zzbkdVar = this.zzd;
                zzbkdVar.zzb(new zzbne(this, zzbjvVar));
                if (!zzf() && (runnable = this.zzg) != null) {
                    zzbkdVar.zzb(runnable);
                    this.zzg = null;
                }
                this.zzd.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzf() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = !this.zzi.isEmpty();
        }
        return z10;
    }

    final void zzg(zzbhy zzbhyVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            this.zzj = this.zzj.zza(zzbhyVar);
            if (zzbhyVar != null && zzf()) {
                ArrayList arrayList = new ArrayList(this.zzi);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zzbnf zzbnfVar = (zzbnf) arrayList.get(i10);
                    zzbht zzbhtVarZza = zzbhyVar.zza(zzbnfVar.zzh());
                    zzbfd zzbfdVarZza = zzbnfVar.zzh().zza();
                    if (zzbfdVarZza.zzk() && zzbhtVarZza.zzh()) {
                        zzbnfVar.zzj(zzbhtVarZza.zzf());
                    }
                    zzblu zzbluVarZze = zzbpf.zze(zzbhtVarZza, zzbfdVarZza.zzk());
                    if (zzbluVarZze != null) {
                        Executor executorZzj = this.zzc;
                        if (zzbfdVarZza.zzj() != null) {
                            executorZzj = zzbfdVarZza.zzj();
                        }
                        Runnable runnableZzg = zzbnfVar.zzg(zzbluVarZze, null);
                        if (runnableZzg != null) {
                            executorZzj.execute(runnableZzg);
                        }
                        arrayList2.add(zzbnfVar);
                    }
                }
                synchronized (this.zzb) {
                    try {
                        if (zzf()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                this.zzi.remove((zzbnf) it.next());
                            }
                            if (this.zzi.isEmpty()) {
                                this.zzi = new LinkedHashSet();
                            }
                            if (!zzf()) {
                                zzbkd zzbkdVar = this.zzd;
                                zzbkdVar.zzb(this.zzf);
                                if (this.zzj.zzb != null && (runnable = this.zzg) != null) {
                                    zzbkdVar.zzb(runnable);
                                    this.zzg = null;
                                }
                            }
                            this.zzd.zza();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    zzbnh(Executor executor, zzbkd zzbkdVar) {
        this.zzc = executor;
        this.zzd = zzbkdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zze(zzbjv zzbjvVar) {
        Collection<zzbnf> collection;
        Runnable runnable;
        zzd(zzbjvVar);
        synchronized (this.zzb) {
            try {
                collection = this.zzi;
                runnable = this.zzg;
                this.zzg = null;
                if (!collection.isEmpty()) {
                    this.zzi = Collections.EMPTY_LIST;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (runnable != null) {
            for (zzbnf zzbnfVar : collection) {
                Runnable runnableZzo = zzbnfVar.zzo(new zzboo(zzbjvVar, zzbls.REFUSED, zzbnfVar.zzi()));
                if (runnableZzo != null) {
                    ((zzbnp) runnableZzo).zza.zzp();
                }
            }
            zzbkd zzbkdVar = this.zzd;
            zzbkdVar.zzb(runnable);
            zzbkdVar.zza();
        }
    }
}
