package com.google.android.libraries.places.internal;

import Ee.L;
import Ee.s0;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.u;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class zzapy extends zzbfi {
    private final zzbfe zza;
    private final zzbiu zzb;
    private final L zzc;
    private final Executor zzd;
    private final zzbfd zzj;
    private int zzk;
    private zzapx zzl;
    private int zzn;
    private zzbfh zzo;
    private zzbip zzp;
    private final zzapw zzr;
    private zzbfi zzt;
    private final Set zze = s0.h();
    private final LinkedHashMap zzf = new LinkedHashMap();
    private final Set zzg = s0.h();
    private boolean zzq = false;
    private boolean zzs = false;
    private final Deque zzh = new ArrayDeque();
    private final Queue zzm = new ArrayDeque();
    private final Queue zzi = new ArrayDeque();

    final /* synthetic */ Executor zzq() {
        return this.zzd;
    }

    final /* synthetic */ zzapx zzr() {
        return this.zzl;
    }

    final /* synthetic */ zzapw zzs() {
        return this.zzr;
    }

    private final void zzB() {
        while (true) {
            Deque deque = this.zzh;
            if (deque.isEmpty() || !((zzapv) deque.peek()).zza()) {
                return;
            }
            Object objZzc = ((zzapv) deque.poll()).zzc();
            if (this.zzl.zzg() == 4) {
                this.zzt.zzb(objZzc);
            } else {
                this.zzi.add(objZzc);
            }
        }
    }

    private final void zzC() {
        if (this.zzq) {
            zzapv zzapvVar = (zzapv) this.zzh.peekLast();
            int iZzg = this.zzl.zzg() - 1;
            if (iZzg != 1) {
                if (iZzg == 3 && zzapvVar == null) {
                    this.zzt.zzd();
                    return;
                }
                return;
            }
            if (zzapvVar == null || zzapvVar.zzb()) {
                zzw();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzf(zzbip zzbipVar) {
        final zzaoy zzaoyVarZza = zzaoy.zza(this.zzb, this.zzj, zzbipVar, this.zza.zzb());
        L l10 = (L) this.zzc.get(this.zzl.zze());
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzapa zzapaVar = (zzapa) l10.get(i10);
            zzaqg zzaqgVarZza = zzapaVar.zza(zzv(zzaoyVarZza));
            if (zzaqgVarZza.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                q qVarZzd = zzaqgVarZza.zzd();
                this.zzf.put(zzapaVar, qVarZzd);
                qVarZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzg(zzaoyVarZza);
                    }
                }), this.zzd);
            }
            zzx(zzaqgVarZza);
            this.zzg.add(zzapaVar);
        }
        if (this.zzf.isEmpty()) {
            zzw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzh(final zzaoy zzaoyVar) {
        LinkedHashMap linkedHashMap = this.zzf;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((q) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            zzapa zzapaVar = (zzapa) entry.getKey();
            zzaqg zzaqgVarZzb = zzapaVar.zzb(zzv(zzaoyVar));
            if (zzaqgVarZzb.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                q qVarZzd = zzaqgVarZzb.zzd();
                linkedHashMap.put(zzapaVar, qVarZzd);
                qVarZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzaph
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzh(zzaoyVar);
                    }
                }), this.zzd);
            }
            zzx(zzaqgVarZzb);
        }
        if (!linkedHashMap.isEmpty() || this.zzs) {
            return;
        }
        zzw();
    }

    private final zzaoy zzv(zzaoy zzaoyVar) {
        zzbfd zzbfdVar = this.zzj;
        if (zzbfdVar == zzaoyVar.zzc()) {
            return zzaoyVar;
        }
        return zzaoy.zza(this.zzb, zzbfdVar, zzaoyVar.zzb(), zzaoyVar.zzd());
    }

    private final void zzw() {
        zzapx zzapxVarZzc = this.zzl.zzc();
        this.zzl = zzapxVarZzc;
        int iZzg = zzapxVarZzc.zzg() - 1;
        if (iZzg == 0) {
            zzf(this.zzp);
            return;
        }
        if (iZzg != 2) {
            zzy();
            return;
        }
        zzbfi zzbfiVarZza = this.zza.zza(this.zzb, this.zzj);
        this.zzt = zzbfiVarZza;
        zzbfiVarZza.zza(this.zzo, this.zzp);
        int i10 = this.zzk;
        if (i10 > 0) {
            this.zzt.zzc(i10);
        }
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            this.zzt.zzb(it.next());
        }
        if (this.zzq && this.zzh.isEmpty()) {
            this.zzt.zzd();
        }
        zzw();
    }

    private final void zzy() {
        int iZzg = this.zzl.zzg() - 1;
        if (iZzg == 1) {
            for (zzapv zzapvVar : this.zzh) {
                if (zzapvVar.zze() <= this.zzl.zzf()) {
                    zzz(zzapvVar, zzapvVar.zze(), this.zzl.zzf() + 1);
                }
            }
            return;
        }
        if (iZzg != 3) {
            return;
        }
        for (zzapv zzapvVar2 : this.zzh) {
            zzz(zzapvVar2, zzapvVar2.zze(), this.zzl.zzd());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, final zzbip zzbipVar) {
        L l10 = this.zzc;
        Set set = this.zzg;
        Executor executor = this.zzd;
        this.zzo = new zzapu(this, new zzaql(new zzaqa(zzbfhVar, l10, set, executor)));
        this.zzp = zzbipVar;
        executor.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzape
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzbipVar);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzb(final Object obj) {
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj(obj);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzc(final int i10) {
        synchronized (this.zzm) {
            this.zzn += i10;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.zzm;
        synchronized (queue) {
            try {
                if (!queue.isEmpty()) {
                    int i11 = this.zzn;
                    for (int i12 = 0; i12 < i11; i12++) {
                        Object objPoll = queue.poll();
                        if (objPoll != null) {
                            arrayDeque.add(objPoll);
                            this.zzn--;
                        }
                    }
                    boolean zIsEmpty = queue.isEmpty();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        this.zzo.zzb(it.next());
                    }
                    if (zIsEmpty) {
                        this.zzo.zzc(zzbjv.zza, null);
                    }
                }
            } finally {
            }
        }
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzm(i10);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn();
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zze(final String str, final Throwable th2) {
        this.zzd.execute(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str, th2);
            }
        }));
    }

    final /* synthetic */ void zzi(q qVar) {
        this.zze.remove(qVar);
    }

    final /* synthetic */ void zzj(Object obj) {
        this.zzh.add(new zzapv(this, obj, null));
        zzy();
    }

    final /* synthetic */ void zzm(int i10) {
        if (this.zzs) {
            return;
        }
        if (this.zzl.zzg() == 4) {
            this.zzt.zzc(i10);
        } else {
            this.zzk += i10;
        }
    }

    final /* synthetic */ void zzn() {
        if (this.zzs) {
            return;
        }
        this.zzq = true;
        zzC();
    }

    final /* synthetic */ void zzo(String str, Throwable th2) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            ((q) it.next()).cancel(true);
        }
        zzbfi zzbfiVar = this.zzt;
        if (zzbfiVar != null) {
            zzbfiVar.zze(str, th2);
        }
    }

    zzapy(zzbfe zzbfeVar, zzbiu zzbiuVar, zzbfd zzbfdVar, int i10, L l10) {
        this.zza = zzbfeVar;
        this.zzb = zzbiuVar;
        this.zzj = zzbfdVar;
        this.zzc = l10;
        this.zzl = zzapx.zzb(l10.size());
        Executor executorZzj = zzbfdVar.zzj();
        zzapw zzapwVar = new zzapw(executorZzj == null ? u.a() : executorZzj);
        this.zzr = zzapwVar;
        final Executor executorC = u.c(zzapwVar);
        this.zzd = new Executor() { // from class: com.google.android.libraries.places.internal.zzapp
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(final Runnable runnable) {
                final zzapy zzapyVar = this.zza;
                executorC.execute(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzapyVar.zzp(runnable);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzl(final zzaoz zzaozVar, final zzapv zzapvVar) {
        Iterator it = zzapvVar.zzd().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((q) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            zzapa zzapaVar = (zzapa) entry.getKey();
            zzaqg zzaqgVarZza = zzaqg.zza();
            if (zzaqgVarZza.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                q qVarZzd = zzaqgVarZza.zzd();
                zzapvVar.zzd().put(zzapaVar, qVarZzd);
                qVarZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl(zzaozVar, zzapvVar);
                    }
                }), this.zzd);
            }
            zzx(zzaqgVarZza);
        }
        if (zzapvVar.zzd().isEmpty()) {
            zzB();
            zzC();
        }
    }

    private final boolean zzx(zzaqg zzaqgVar) {
        int iOrdinal = zzaqgVar.zzc().ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    this.zzl.zza();
                    return false;
                }
                throw new IllegalStateException("Unrecognized outcome type: ".concat(String.valueOf(zzaqgVar.zzc())));
            }
            final q qVarZzd = zzaqgVar.zzd();
            this.zze.add(qVarZzd);
            qVarZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi(qVarZzd);
                }
            }), this.zzd);
            return false;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzz(final zzapv zzapvVar, int i10, int i11) {
        final zzaoz zzaozVarZza = zzaoz.zza(zzapvVar.zzc());
        while (i10 < i11) {
            L l10 = (L) this.zzc.get(i10);
            int size = l10.size();
            for (int i12 = 0; i12 < size; i12++) {
                zzapa zzapaVar = (zzapa) l10.get(i12);
                zzaqg zzaqgVarZza = zzaqg.zza();
                if (zzaqgVarZza.zzc().equals(zzaqe.CONTINUE_AFTER)) {
                    q qVarZzd = zzaqgVarZza.zzd();
                    zzapvVar.zzd().put(zzapaVar, qVarZzd);
                    qVarZzd.addListener(zzrh.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzapk
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzk(zzaozVarZza, zzapvVar);
                        }
                    }), this.zzd);
                }
                zzx(zzaqgVarZza);
            }
            i10++;
        }
        zzapvVar.zzf(i11);
        if (zzapvVar.zzd().isEmpty()) {
            zzB();
            zzC();
        }
    }

    final /* synthetic */ void zzp(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            this.zzs = true;
            zzbfh zzbfhVar = this.zzo;
            if (zzbfhVar != null) {
                zzbfhVar.zzc(zzbjv.zzb(th2), new zzbip());
                if (this.zzt != null && this.zzl.zzg() == 4) {
                    this.zzt.zze(null, th2);
                }
            }
        }
    }
}
