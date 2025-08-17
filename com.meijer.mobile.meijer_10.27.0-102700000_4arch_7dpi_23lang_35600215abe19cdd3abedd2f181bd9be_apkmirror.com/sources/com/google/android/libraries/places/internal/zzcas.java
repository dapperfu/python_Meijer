package com.google.android.libraries.places.internal;

import Be.p;
import Ce.Q;
import Ce.Y;
import He.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class zzcas extends zzbia {
    private static final Logger zzi = Logger.getLogger(zzcas.class.getName());
    private static final int zzj = new Random().nextInt();
    protected boolean zzf;
    protected zzbfy zzh;
    private final zzbhr zzl;
    private List zzk = new ArrayList(0);
    protected final zzbic zzg = new zzbtp();

    protected abstract void zze();

    protected zzcaq zzf(Object obj) {
        throw null;
    }

    protected final zzbhr zzg() {
        return this.zzl;
    }

    public final Collection zzh() {
        return this.zzk;
    }

    final /* synthetic */ zzbhr zzk() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final zzbjv zza(zzbhw zzbhwVar) {
        zzbjv zzbjvVarZze;
        zzi.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", zzbhwVar);
        try {
            this.zzf = true;
            LinkedHashMap linkedHashMapF = Y.f(zzbhwVar.zzc().size());
            for (zzbgl zzbglVar : zzbhwVar.zzc()) {
                zzbhv zzbhvVarZzb = zzbhwVar.zzb();
                zzbhvVarZzb.zza(Collections.singletonList(zzbglVar));
                zzbex zzbexVarZzb = zzbez.zzb();
                zzbexVarZzb.zza(zzbia.zze, Boolean.TRUE);
                zzbhvVarZzb.zzb(zzbexVarZzb.zzc());
                zzbhvVarZzb.zzc(null);
                linkedHashMapF.put(new zzcar(zzbglVar), zzbhvVarZzb.zzd());
            }
            if (linkedHashMapF.isEmpty()) {
                zzbjv zzbjvVar = zzbjv.zzi;
                String string = zzbhwVar.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 41);
                sb2.append("NameResolver returned no usable address. ");
                sb2.append(string);
                zzbjvVarZze = zzbjvVar.zze(sb2.toString());
                zzb(zzbjvVarZze);
            } else {
                LinkedHashMap linkedHashMapF2 = Y.f(this.zzk.size());
                for (zzcaq zzcaqVar : this.zzk) {
                    linkedHashMapF2.put(zzcaqVar.zzc(), zzcaqVar);
                }
                zzbjv zzbjvVar2 = zzbjv.zza;
                ArrayList arrayList = new ArrayList(linkedHashMapF.size());
                for (Map.Entry entry : linkedHashMapF.entrySet()) {
                    zzcaq zzcaqVarZzf = (zzcaq) linkedHashMapF2.remove(entry.getKey());
                    if (zzcaqVarZzf == null) {
                        zzcaqVarZzf = zzf(entry.getKey());
                    }
                    arrayList.add(zzcaqVarZzf);
                }
                int iA = arrayList.isEmpty() ? 0 : j.a(zzj, arrayList.size());
                for (zzcaq zzcaqVar2 : Q.c(Q.l(arrayList, iA), Q.i(arrayList, iA))) {
                    zzbhw zzbhwVar2 = (zzbhw) linkedHashMapF.get(zzcaqVar2.zzc());
                    if (zzbhwVar2 != null) {
                        zzbjv zzbjvVarZza = zzcaqVar2.zzg().zza(zzbhwVar2);
                        if (!zzbjvVarZza.zzj()) {
                            zzbjvVar2 = zzbjvVarZza;
                        }
                    }
                }
                this.zzk = arrayList;
                zze();
                Iterator it = linkedHashMapF2.values().iterator();
                while (it.hasNext()) {
                    ((zzcaq) it.next()).zzb();
                }
                zzbjvVarZze = zzbjvVar2;
            }
            this.zzf = false;
            return zzbjvVarZze;
        } catch (Throwable th2) {
            this.zzf = false;
            throw th2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzb(zzbjv zzbjvVar) {
        if (this.zzh != zzbfy.READY) {
            this.zzl.zzb(zzbfy.TRANSIENT_FAILURE, new zzbhq(zzbht.zzb(zzbjvVar)));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzc() {
        zzi.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.zzk.iterator();
        while (it.hasNext()) {
            ((zzcaq) it.next()).zzb();
        }
        this.zzk.clear();
    }

    protected final List zzi() {
        ArrayList arrayList = new ArrayList();
        for (zzcaq zzcaqVar : this.zzk) {
            if (zzcaqVar.zzf() == zzbfy.READY) {
                arrayList.add(zzcaqVar);
            }
        }
        return arrayList;
    }

    protected zzcas(zzbhr zzbhrVar) {
        this.zzl = (zzbhr) p.r(zzbhrVar, "helper");
        zzi.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }
}
