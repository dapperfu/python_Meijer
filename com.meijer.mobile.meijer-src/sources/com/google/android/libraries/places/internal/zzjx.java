package com.google.android.libraries.places.internal;

import Ee.L;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class zzjx {
    private final zziz zza;

    zzjx(zziz zzizVar) {
        this.zza = zzizVar;
    }

    static final List zzb(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzatk zzatkVar = (zzatk) it.next();
            int iZza = zzatkVar.zza();
            int iZzc = zzatkVar.zzc() - zzatkVar.zza();
            com.google.android.libraries.places.api.model.zzej zzejVarZzc = com.google.android.libraries.places.api.model.zzek.zzc();
            zzejVarZzc.zza(iZza);
            zzejVarZzc.zzb(iZzc);
            arrayList.add(zzejVarZzc.zzc());
        }
        return arrayList;
    }

    public final AutocompletePrediction zza(zzatn zzatnVar) {
        Integer numValueOf;
        zzatg zzatgVarZzc = zzatnVar.zzc();
        if (zzatnVar.zza()) {
            List<Place.Type> listZza = this.zza.zza(zzatgVarZzc.zze());
            if (listZza == null) {
                listZza = L.x();
            }
            AutocompletePrediction.Builder builder = AutocompletePrediction.builder(zzatgVarZzc.zza());
            if (zzatgVarZzc.zzf() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(zzatgVarZzc.zzf());
            }
            builder.setDistanceMeters(numValueOf);
            builder.setPlaceTypes(listZza);
            builder.setTypes(L.s(zzatgVarZzc.zze()));
            builder.setFullText(zzatgVarZzc.zzc().zza());
            builder.zzb(zzb(zzatgVarZzc.zzc().zzc()));
            builder.setPrimaryText(zzatgVarZzc.zzd().zza().zza());
            builder.zzc(zzb(zzatgVarZzc.zzd().zza().zzc()));
            builder.setSecondaryText(zzatgVarZzc.zzd().zzc().zza());
            builder.zzd(zzb(zzatgVarZzc.zzd().zzc().zzc()));
            return builder.build();
        }
        throw new IllegalArgumentException("Suggestion does not contain a PlacePrediction.");
    }
}
