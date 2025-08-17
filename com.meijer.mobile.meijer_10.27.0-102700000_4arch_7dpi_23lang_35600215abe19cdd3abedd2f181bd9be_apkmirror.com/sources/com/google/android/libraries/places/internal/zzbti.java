package com.google.android.libraries.places.internal;

import Ce.L;
import Ce.U;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbti extends zzbia {
    private static final Logger zzf = Logger.getLogger(zzbti.class.getName());
    private final boolean zzg;
    private final zzbhr zzh;
    private final Map zzi;
    private final zzbtb zzj;
    private int zzk;
    private boolean zzl;
    private zzbkc zzm;
    private zzbfy zzn;
    private zzbfy zzo;
    private boolean zzp;
    private zzbkc zzq;
    private final boolean zzr;
    private zzbon zzs;

    final /* synthetic */ zzbhr zzi() {
        return this.zzh;
    }

    final /* synthetic */ Map zzj() {
        return this.zzi;
    }

    final /* synthetic */ zzbtb zzk() {
        return this.zzj;
    }

    final /* synthetic */ void zzl(zzbkc zzbkcVar) {
        this.zzm = null;
    }

    final /* synthetic */ boolean zzm() {
        return this.zzp;
    }

    final /* synthetic */ void zzn(zzbkc zzbkcVar) {
        this.zzq = null;
    }

    static boolean zze() {
        return zzbpf.zzj("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzo(L l10) {
        Map map = this.zzi;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet2.addAll(((zzbgl) l10.get(i10)).zza());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((zzbth) map.remove(socketAddress)).zza().zzb();
            }
        }
        return hashSet.isEmpty();
    }

    private final void zzp() {
        if (this.zzr && this.zzq == null) {
            if (this.zzs == null) {
                this.zzs = new zzbon();
            }
            long jZza = this.zzs.zza();
            zzbhr zzbhrVar = this.zzh;
            this.zzq = zzbhrVar.zzd().zzd(new zzbsx(this), jZza, TimeUnit.NANOSECONDS, zzbhrVar.zze());
        }
    }

    private final void zzr(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        if (zzbfyVar == this.zzo && (zzbfyVar == zzbfy.IDLE || zzbfyVar == zzbfy.CONNECTING)) {
            return;
        }
        this.zzo = zzbfyVar;
        this.zzh.zzb(zzbfyVar, zzbhyVar);
    }

    private final void zzs() {
        if (this.zzg) {
            zzbkc zzbkcVar = this.zzm;
            if (zzbkcVar == null || !zzbkcVar.zzb()) {
                zzbhr zzbhrVar = this.zzh;
                this.zzm = zzbhrVar.zzd().zzd(new zzbsy(this), 250L, TimeUnit.MILLISECONDS, zzbhrVar.zze());
            }
        }
    }

    private final void zzt() {
        zzbkc zzbkcVar = this.zzm;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
            this.zzm = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.SocketAddress zzu(com.google.android.libraries.places.internal.zzbhx r3) {
        /*
            com.google.android.libraries.places.internal.zzbrv r3 = (com.google.android.libraries.places.internal.zzbrv) r3
            com.google.android.libraries.places.internal.zzbrx r0 = r3.zzj
            com.google.android.libraries.places.internal.zzbkd r0 = r0.zze
            r0.zzc()
            boolean r0 = r3.zzg
            java.lang.String r1 = "not started"
            Be.p.x(r0, r1)
            java.util.List r3 = r3.zze
            r0 = 0
            if (r3 == 0) goto L1d
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            Be.p.z(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            com.google.android.libraries.places.internal.zzbgl r3 = (com.google.android.libraries.places.internal.zzbgl) r3
            java.util.List r3 = r3.zza()
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbti.zzu(com.google.android.libraries.places.internal.zzbhx):java.net.SocketAddress");
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final zzbjv zza(zzbhw zzbhwVar) {
        Boolean bool;
        if (this.zzn == zzbfy.SHUTDOWN) {
            return zzbjv.zzg.zze("Already shut down");
        }
        Boolean bool2 = (Boolean) zzbhwVar.zzd().zza(zzbia.zze);
        this.zzp = bool2 == null || !bool2.booleanValue();
        List<zzbgl> listZzc = zzbhwVar.zzc();
        if (listZzc.isEmpty()) {
            zzbjv zzbjvVar = zzbjv.zzi;
            String strValueOf = String.valueOf(zzbhwVar.zzc());
            String strValueOf2 = String.valueOf(zzbhwVar.zzd());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 55 + strValueOf2.length());
            sb2.append("NameResolver returned no usable address. addrs=");
            sb2.append(strValueOf);
            sb2.append(", attrs=");
            sb2.append(strValueOf2);
            zzbjv zzbjvVarZze = zzbjvVar.zze(sb2.toString());
            zzb(zzbjvVarZze);
            return zzbjvVarZze;
        }
        Iterator it = listZzc.iterator();
        while (it.hasNext()) {
            if (((zzbgl) it.next()) == null) {
                zzbjv zzbjvVar2 = zzbjv.zzi;
                String strValueOf3 = String.valueOf(zzbhwVar.zzc());
                String strValueOf4 = String.valueOf(zzbhwVar.zzd());
                StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 69 + strValueOf4.length());
                sb3.append("NameResolver returned address list with null endpoint. addrs=");
                sb3.append(strValueOf3);
                sb3.append(", attrs=");
                sb3.append(strValueOf4);
                zzbjv zzbjvVarZze2 = zzbjvVar2.zze(sb3.toString());
                zzb(zzbjvVarZze2);
                return zzbjvVarZze2;
            }
        }
        this.zzl = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (zzbgl zzbglVar : listZzc) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : zzbglVar.zza()) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new zzbgl(arrayList2, zzbglVar.zzb()));
            }
        }
        if ((zzbhwVar.zze() instanceof zzbtd) && (bool = ((zzbtd) zzbhwVar.zze()).zza) != null && bool.booleanValue()) {
            Collections.shuffle(arrayList, new Random());
        }
        L lK = L.p().j(arrayList).k();
        zzbfy zzbfyVar = this.zzn;
        zzbfy zzbfyVar2 = zzbfy.READY;
        if (zzbfyVar == zzbfyVar2 || zzbfyVar == zzbfy.CONNECTING) {
            zzbtb zzbtbVar = this.zzj;
            SocketAddress socketAddressZzd = zzbtbVar.zzd();
            zzbtbVar.zzg(lK);
            if (zzbtbVar.zzh(socketAddressZzd)) {
                ((zzbth) this.zzi.get(socketAddressZzd)).zza().zzd(zzbtbVar.zzf());
                zzo(lK);
                return zzbjv.zza;
            }
        } else {
            this.zzj.zzg(lK);
        }
        if (zzo(lK)) {
            zzbfy zzbfyVar3 = zzbfy.CONNECTING;
            this.zzn = zzbfyVar3;
            zzr(zzbfyVar3, new zzbte(zzbht.zzd()));
        }
        zzbfy zzbfyVar4 = this.zzn;
        if (zzbfyVar4 == zzbfyVar2) {
            zzbfy zzbfyVar5 = zzbfy.IDLE;
            this.zzn = zzbfyVar5;
            zzr(zzbfyVar5, new zzbtg(this, this));
        } else if (zzbfyVar4 == zzbfy.CONNECTING || zzbfyVar4 == zzbfy.TRANSIENT_FAILURE) {
            zzt();
            zzd();
        }
        return zzbjv.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzb(zzbjv zzbjvVar) {
        if (this.zzn == zzbfy.SHUTDOWN) {
            return;
        }
        Map map = this.zzi;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((zzbth) it.next()).zza().zzb();
        }
        map.clear();
        this.zzj.zzg(L.x());
        zzbfy zzbfyVar = zzbfy.TRANSIENT_FAILURE;
        this.zzn = zzbfyVar;
        zzr(zzbfyVar, new zzbte(zzbht.zzb(zzbjvVar)));
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzc() {
        Map map = this.zzi;
        zzf.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        zzbfy zzbfyVar = zzbfy.SHUTDOWN;
        this.zzn = zzbfyVar;
        this.zzo = zzbfyVar;
        zzt();
        zzbkc zzbkcVar = this.zzq;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
            this.zzq = null;
        }
        this.zzs = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((zzbth) it.next()).zza().zzb();
        }
        map.clear();
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzd() {
        zzbtb zzbtbVar = this.zzj;
        if (!zzbtbVar.zza() || this.zzn == zzbfy.SHUTDOWN) {
            return;
        }
        Map map = this.zzi;
        SocketAddress socketAddressZzd = zzbtbVar.zzd();
        zzbth zzbthVar = (zzbth) map.get(socketAddressZzd);
        if (zzbthVar == null) {
            zzbez zzbezVarZze = zzbtbVar.zze();
            zzbsz zzbszVar = new zzbsz(this, null);
            zzbhr zzbhrVar = this.zzh;
            zzbhm zzbhmVarZzd = zzbho.zzd();
            zzbhmVarZzd.zzb(U.i(new zzbgl(Collections.singletonList(socketAddressZzd), zzbezVarZze)));
            zzbhmVarZzd.zza(zzbia.zzb, zzbszVar);
            zzbhmVarZzd.zza(zzbia.zzc, Boolean.valueOf(this.zzr));
            zzbhx zzbhxVarZza = zzbhrVar.zza(zzbhmVarZzd.zzc());
            final zzbth zzbthVar2 = new zzbth(zzbhxVarZza, zzbfy.IDLE);
            zzbszVar.zzb(zzbthVar2);
            map.put(socketAddressZzd, zzbthVar2);
            zzbez zzbezVarZzb = ((zzbrv) zzbhxVarZza).zza.zzb();
            if (this.zzp || zzbezVarZzb.zza(zzbia.zzd) == null) {
                zzbthVar2.zzi(zzbfz.zza(zzbfy.READY));
            }
            zzbhxVarZza.zza(new zzbhz() { // from class: com.google.android.libraries.places.internal.zzbtc
                @Override // com.google.android.libraries.places.internal.zzbhz
                public final /* synthetic */ void zza(zzbfz zzbfzVar) {
                    this.zza.zzf(zzbthVar2, zzbfzVar);
                }
            });
            zzbthVar = zzbthVar2;
        }
        int iOrdinal = zzbthVar.zzb().ordinal();
        if (iOrdinal == 0) {
            zzs();
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            zzbthVar.zzf().zzc();
            zzbthVar.zzd(zzbfy.CONNECTING);
            zzs();
            return;
        }
        if (!this.zzr) {
            zzbtbVar.zzb();
            zzd();
        } else if (!zzbtbVar.zza()) {
            zzp();
        } else {
            zzbthVar.zzf().zzc();
            zzbthVar.zzd(zzbfy.CONNECTING);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    zzbti(com.google.android.libraries.places.internal.zzbhr r6) {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = zze()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            int r0 = com.google.android.libraries.places.internal.zzbtp.zzb
            java.lang.String r0 = "GRPC_PF_USE_HAPPY_EYEBALLS"
            boolean r0 = com.google.android.libraries.places.internal.zzbpf.zzj(r0, r2)
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            r5.zzg = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.zzi = r3
            com.google.android.libraries.places.internal.zzbtb r3 = new com.google.android.libraries.places.internal.zzbtb
            Ce.L r4 = Ce.L.x()
            r3.<init>(r4, r0)
            r5.zzj = r3
            r5.zzk = r2
            r5.zzl = r1
            r0 = 0
            r5.zzm = r0
            com.google.android.libraries.places.internal.zzbfy r2 = com.google.android.libraries.places.internal.zzbfy.IDLE
            r5.zzn = r2
            r5.zzo = r2
            r5.zzp = r1
            r5.zzq = r0
            boolean r0 = zze()
            r5.zzr = r0
            java.lang.String r0 = "helper"
            java.lang.Object r6 = Be.p.r(r6, r0)
            com.google.android.libraries.places.internal.zzbhr r6 = (com.google.android.libraries.places.internal.zzbhr) r6
            r5.zzh = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbti.<init>(com.google.android.libraries.places.internal.zzbhr):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final void zzg(zzbth zzbthVar) {
        zzbfy zzbfyVarZzg = zzbthVar.zzg();
        zzbfy zzbfyVar = zzbfy.READY;
        if (zzbfyVarZzg == zzbfyVar) {
            if (!this.zzp && zzbthVar.zze() != zzbfyVar) {
                zzbfy zzbfyVarZze = zzbthVar.zze();
                zzbfy zzbfyVar2 = zzbfy.TRANSIENT_FAILURE;
                if (zzbfyVarZze == zzbfyVar2) {
                    zzr(zzbfyVar2, new zzbte(zzbht.zzb(zzbthVar.zzh().zzd())));
                    return;
                } else {
                    if (this.zzo != zzbfyVar2) {
                        zzr(zzbthVar.zze(), new zzbte(zzbht.zzd()));
                        return;
                    }
                    return;
                }
            }
            zzr(zzbfyVar, new zzbhq(zzbht.zza(zzbthVar.zzf(), null)));
        }
    }

    final /* synthetic */ void zzf(zzbth zzbthVar, zzbfz zzbfzVar) {
        zzbhx zzbhxVarZzf = zzbthVar.zzf();
        zzbfy zzbfyVarZzc = zzbfzVar.zzc();
        Map map = this.zzi;
        if (zzbthVar == map.get(zzu(zzbhxVarZzf)) && zzbfyVarZzc != zzbfy.SHUTDOWN) {
            zzbfy zzbfyVar = zzbfy.IDLE;
            if (zzbfyVarZzc == zzbfyVar && zzbthVar.zzg() == zzbfy.READY) {
                this.zzh.zzc();
            }
            zzbthVar.zzd(zzbfyVarZzc);
            zzbfy zzbfyVar2 = this.zzn;
            zzbfy zzbfyVar3 = zzbfy.TRANSIENT_FAILURE;
            if (zzbfyVar2 == zzbfyVar3 || this.zzo == zzbfyVar3) {
                if (zzbfyVarZzc != zzbfy.CONNECTING) {
                    if (zzbfyVarZzc == zzbfyVar) {
                        zzd();
                        return;
                    }
                } else {
                    return;
                }
            }
            int iOrdinal = zzbfyVarZzc.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            this.zzj.zzc();
                            this.zzn = zzbfyVar;
                            zzr(zzbfyVar, new zzbtg(this, this));
                            return;
                        }
                        throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(zzbfyVarZzc)));
                    }
                    zzbtb zzbtbVar = this.zzj;
                    if (zzbtbVar.zza() && map.get(zzbtbVar.zzd()) == zzbthVar) {
                        if (zzbtbVar.zzb()) {
                            zzt();
                            zzd();
                        } else if (map.size() >= zzbtbVar.zzi()) {
                            zzp();
                        } else {
                            zzbtbVar.zzc();
                            zzd();
                        }
                    }
                    if (map.size() >= zzbtbVar.zzi()) {
                        Iterator it = map.values().iterator();
                        while (it.hasNext()) {
                            if (!((zzbth) it.next()).zzc()) {
                                return;
                            }
                        }
                        this.zzn = zzbfyVar3;
                        zzr(zzbfyVar3, new zzbte(zzbht.zzb(zzbfzVar.zzd())));
                        int i10 = this.zzk + 1;
                        this.zzk = i10;
                        if (i10 >= zzbtbVar.zzi() || this.zzl) {
                            this.zzl = false;
                            this.zzk = 0;
                            this.zzh.zzc();
                            return;
                        }
                        return;
                    }
                    return;
                }
                zzbkc zzbkcVar = this.zzq;
                if (zzbkcVar != null) {
                    zzbkcVar.zza();
                    this.zzq = null;
                }
                this.zzs = null;
                zzt();
                for (zzbth zzbthVar2 : map.values()) {
                    if (!zzbthVar2.zza().equals(zzbthVar.zzf())) {
                        zzbthVar2.zza().zzb();
                    }
                }
                map.clear();
                zzbfy zzbfyVar4 = zzbfy.READY;
                zzbthVar.zzd(zzbfyVar4);
                map.put(zzu(zzbthVar.zzf()), zzbthVar);
                this.zzj.zzh(zzu(zzbthVar.zzf()));
                this.zzn = zzbfyVar4;
                zzg(zzbthVar);
                return;
            }
            zzbfy zzbfyVar5 = zzbfy.CONNECTING;
            this.zzn = zzbfyVar5;
            zzr(zzbfyVar5, new zzbte(zzbht.zzd()));
        }
    }
}
