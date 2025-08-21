package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzazr extends zzazq {
    zzazr() {
    }

    @Override // com.google.android.libraries.places.internal.zzazq
    final zzazu zza(Object obj) {
        zzbab zzbabVar = (zzbab) obj;
        if (zzbabVar.zzb.zzc()) {
            zzbabVar.zzb = zzbabVar.zzb.clone();
        }
        return zzbabVar.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzazq
    final void zzb(Object obj) {
        ((zzbab) obj).zzb.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzazq
    final void zzd(zzbby zzbbyVar, Object obj, zzazp zzazpVar, zzazu zzazuVar) throws IOException {
        zzbad zzbadVar = (zzbad) obj;
        zzazuVar.zzg(zzbadVar.zzb, zzbbyVar.zzo(zzbadVar.zza.getClass(), zzazpVar));
    }

    @Override // com.google.android.libraries.places.internal.zzazq
    final void zzc(zzbcz zzbczVar, Map.Entry entry) throws IOException {
        zzbac zzbacVar = (zzbac) entry.getKey();
        zzbcx zzbcxVar = zzbcx.zza;
        switch (zzbacVar.zzb.ordinal()) {
            case 0:
                zzbczVar.zzf(525004180, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzbczVar.zze(525004180, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzbczVar.zzc(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzbczVar.zzh(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzbczVar.zzi(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzbczVar.zzj(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzbczVar.zzk(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzbczVar.zzl(525004180, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzbczVar.zzm(525004180, (String) entry.getValue());
                break;
            case 9:
                zzbczVar.zzs(525004180, entry.getValue(), zzbbv.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzbczVar.zzr(525004180, entry.getValue(), zzbbv.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzbczVar.zzn(525004180, (zzayz) entry.getValue());
                break;
            case 12:
                zzbczVar.zzo(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzbczVar.zzi(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zzbczVar.zzb(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzbczVar.zzd(525004180, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzbczVar.zzp(525004180, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzbczVar.zzq(525004180, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
