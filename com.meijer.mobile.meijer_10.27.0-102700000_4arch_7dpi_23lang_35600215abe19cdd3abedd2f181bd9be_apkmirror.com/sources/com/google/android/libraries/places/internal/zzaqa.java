package com.google.android.libraries.places.internal;

import Be.p;
import Ce.L;
import Ce.U;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class zzaqa extends zzbgp {
    private final L zza;
    private final LinkedHashMap zzb;
    private final Queue zzc;
    private final LinkedHashMap zzd;
    private final Set zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzbip zzi;
    private zzbjv zzj;
    private zzbip zzk;

    private final boolean zzf() {
        return !this.zzb.isEmpty();
    }

    private final void zzg() {
        if (this.zzg) {
            Queue<zzapz> queue = this.zzc;
            for (zzapz zzapzVar : queue) {
                Iterator it = U.k(this.zza.subList(0, zzapzVar.zzd())).iterator();
                while (it.hasNext()) {
                    Iterator it2 = U.k((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        if (this.zze.contains((zzapa) it2.next())) {
                            p.r(zzapzVar.zzc(), "Response message cannot be null");
                        }
                    }
                    if (!zzapzVar.zza()) {
                        return;
                    } else {
                        zzapzVar.zze(zzapzVar.zzd() - 1);
                    }
                }
            }
            while (!queue.isEmpty() && ((zzapz) queue.peek()).zzb()) {
                zze().zzb(((zzapz) queue.poll()).zzc());
            }
            zzh();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(zzbip zzbipVar) {
        this.zzi = zzbipVar;
        Iterator it = U.k(this.zza.subList(0, this.zzf)).iterator();
        while (it.hasNext()) {
            this.zzf--;
            Iterator it2 = U.k((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.zze.contains((zzapa) it2.next());
            }
            if (zzf()) {
                return;
            }
        }
        zze().zza(this.zzi);
        this.zzg = true;
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(Object obj) {
        this.zzc.add(new zzapz(this, obj, this.zza.size()));
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(zzbjv zzbjvVar, zzbip zzbipVar) {
        this.zzj = zzbjvVar;
        this.zzk = zzbipVar;
        this.zzh = true;
        zzh();
    }

    zzaqa(zzbfh zzbfhVar, L l10, Set set, Executor executor) {
        super(zzbfhVar);
        this.zzb = new LinkedHashMap();
        this.zzc = new ArrayDeque();
        this.zzd = new LinkedHashMap();
        this.zza = l10;
        this.zzf = l10.size();
        this.zze = set;
    }

    private final void zzh() {
        if (!zzf() && this.zzc.isEmpty() && this.zzh) {
            Iterator it = U.k(this.zza).iterator();
            while (it.hasNext()) {
                for (zzapa zzapaVar : U.k((List) it.next())) {
                    zzbjv zzbjvVar = this.zzj;
                    zzbip zzbipVar = this.zzk;
                    this.zze.contains(zzapaVar);
                }
            }
            if (this.zzd.isEmpty()) {
                zze().zzc(this.zzj, this.zzk);
            }
        }
    }
}
