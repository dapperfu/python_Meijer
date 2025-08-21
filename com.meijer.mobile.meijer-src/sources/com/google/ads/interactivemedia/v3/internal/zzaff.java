package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzaff implements zzaft {
    private final zzafb zza;
    private final zzagh zzb;
    private final boolean zzc;
    private final zzadl zzd;

    private zzaff(zzagh zzaghVar, zzadl zzadlVar, zzafb zzafbVar) {
        this.zzb = zzaghVar;
        this.zzc = zzafbVar instanceof zzadv;
        this.zzd = zzadlVar;
        this.zza = zzafbVar;
    }

    static zzaff zzc(zzagh zzaghVar, zzadl zzadlVar, zzafb zzafbVar) {
        return new zzaff(zzaghVar, zzadlVar, zzafbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final int zza(Object obj) {
        int iZzb = ((zzady) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzadv) obj).zzb.zzc() : iZzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final int zzb(Object obj) {
        int iHashCode = ((zzady) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzadv) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzacl zzaclVar) throws IOException {
        zzady zzadyVar = (zzady) obj;
        if (zzadyVar.zzc == zzagi.zzc()) {
            zzadyVar.zzc = zzagi.zzf();
        }
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final void zzj(Object obj, zzagu zzaguVar) throws IOException {
        Iterator itZze = ((zzadv) obj).zzb.zze();
        while (itZze.hasNext()) {
            Map.Entry entry = (Map.Entry) itZze.next();
            zzado zzadoVar = (zzado) entry.getKey();
            if (zzadoVar.zzc() != zzagt.MESSAGE || zzadoVar.zze() || zzadoVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzaej) {
                zzaguVar.zzw(zzadoVar.zza(), ((zzaej) entry).zza().zzb());
            } else {
                zzaguVar.zzw(zzadoVar.zza(), entry.getValue());
            }
        }
        ((zzady) obj).zzc.zzk(zzaguVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzady) obj).zzc.equals(((zzady) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzadv) obj).zzb.equals(((zzadv) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final Object zze() {
        zzafb zzafbVar = this.zza;
        return zzafbVar instanceof zzady ? ((zzady) zzafbVar).zzaB() : zzafbVar.zzaQ().zzan();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final void zzg(Object obj, Object obj2) {
        zzafv.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzafv.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final void zzh(Object obj, zzafl zzaflVar, zzadk zzadkVar) throws IOException {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final boolean zzl(Object obj) {
        return ((zzadv) obj).zzb.zzh();
    }
}
