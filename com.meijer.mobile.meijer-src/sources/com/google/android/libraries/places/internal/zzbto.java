package com.google.android.libraries.places.internal;

import De.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
final class zzbto extends zzbia {
    private final zzbhr zzf;
    private zzbhx zzg;
    private zzbfy zzh = zzbfy.IDLE;

    final /* synthetic */ zzbhr zzf() {
        return this.zzf;
    }

    private final void zzg(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        this.zzh = zzbfyVar;
        this.zzf.zzb(zzbfyVar, zzbhyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzb(zzbjv zzbjvVar) {
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar != null) {
            zzbhxVar.zzb();
            this.zzg = null;
        }
        zzg(zzbfy.TRANSIENT_FAILURE, new zzbtl(zzbht.zzb(zzbjvVar)));
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzc() {
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar != null) {
            zzbhxVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzd() {
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar != null) {
            zzbhxVar.zzc();
        }
    }

    zzbto(zzbhr zzbhrVar) {
        this.zzf = (zzbhr) p.r(zzbhrVar, "helper");
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final zzbjv zza(zzbhw zzbhwVar) {
        Boolean bool;
        List listZzc = zzbhwVar.zzc();
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
        if ((zzbhwVar.zze() instanceof zzbtk) && (bool = ((zzbtk) zzbhwVar.zze()).zza) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listZzc);
            Collections.shuffle(arrayList, new Random());
            listZzc = arrayList;
        }
        zzbhx zzbhxVar = this.zzg;
        if (zzbhxVar == null) {
            zzbhr zzbhrVar = this.zzf;
            zzbhm zzbhmVarZzd = zzbho.zzd();
            zzbhmVarZzd.zzb(listZzc);
            zzbhx zzbhxVarZza = zzbhrVar.zza(zzbhmVarZzd.zzc());
            zzbhxVarZza.zza(new zzbtj(this, zzbhxVarZza));
            this.zzg = zzbhxVarZza;
            zzg(zzbfy.CONNECTING, new zzbtl(zzbht.zza(zzbhxVarZza, null)));
            zzbhxVarZza.zzc();
        } else {
            zzbhxVar.zzd(listZzc);
        }
        return zzbjv.zza;
    }

    final /* synthetic */ void zze(zzbhx zzbhxVar, zzbfz zzbfzVar) {
        zzbhy zzbtlVar;
        zzbfy zzbfyVarZzc = zzbfzVar.zzc();
        if (zzbfyVarZzc != zzbfy.SHUTDOWN) {
            zzbfy zzbfyVar = zzbfy.TRANSIENT_FAILURE;
            if (zzbfyVarZzc == zzbfyVar || zzbfyVarZzc == zzbfy.IDLE) {
                this.zzf.zzc();
            }
            if (this.zzh == zzbfyVar) {
                if (zzbfyVarZzc != zzbfy.CONNECTING) {
                    if (zzbfyVarZzc == zzbfy.IDLE) {
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
                            zzbtlVar = new zzbtn(this, zzbhxVar);
                        } else {
                            throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(zzbfyVarZzc)));
                        }
                    } else {
                        zzbtlVar = new zzbtl(zzbht.zzb(zzbfzVar.zzd()));
                    }
                } else {
                    zzbtlVar = new zzbtl(zzbht.zza(zzbhxVar, null));
                }
            } else {
                zzbtlVar = new zzbtl(zzbht.zzd());
            }
            zzg(zzbfyVarZzc, zzbtlVar);
        }
    }
}
