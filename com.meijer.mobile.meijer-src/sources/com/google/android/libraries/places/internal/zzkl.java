package com.google.android.libraries.places.internal;

import De.v;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzjz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzkl {
    zzkl() {
    }

    public static final FindAutocompletePredictionsResponse zza(zzkk zzkkVar) throws ApiException {
        int iZza = zzlj.zza(zzkkVar.status);
        if (PlacesStatusCodes.isError(iZza)) {
            throw new ApiException(new Status(iZza, zzlj.zzb(zzkkVar.status, zzkkVar.errorMessage)));
        }
        ArrayList arrayList = new ArrayList();
        zzjz[] zzjzVarArr = zzkkVar.predictions;
        if (zzjzVarArr != null) {
            for (zzjz zzjzVar : zzjzVarArr) {
                if (zzjzVar == null || TextUtils.isEmpty(zzjzVar.zzc())) {
                    throw new ApiException(new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
                }
                AutocompletePrediction.Builder builder = AutocompletePrediction.builder(zzjzVar.zzc());
                builder.setDistanceMeters(zzjzVar.zzb());
                builder.setPlaceTypes(zzlf.zzf(zzlf.zzd(zzjzVar.zze())));
                builder.setTypes(zzlf.zzf(zzlf.zzc(zzjzVar.zze())));
                builder.setFullText(v.e(zzjzVar.zza()));
                builder.zzb(zzb(zzjzVar.zzf()));
                zzjz.zza zzaVarZzd = zzjzVar.zzd();
                if (zzaVarZzd != null) {
                    builder.setPrimaryText(v.e(zzaVarZzd.zza()));
                    builder.zzc(zzb(zzaVarZzd.zzc()));
                    builder.setSecondaryText(v.e(zzaVarZzd.zzb()));
                    builder.zzd(zzb(zzaVarZzd.zzd()));
                }
                arrayList.add(builder.build());
            }
        }
        return FindAutocompletePredictionsResponse.newInstance(arrayList);
    }

    private static List zzb(List list) throws ApiException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzjz.zzb zzbVar = (zzjz.zzb) it.next();
            Status status = new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result");
            if (zzbVar == null) {
                throw new ApiException(status);
            }
            Integer num = zzbVar.offset;
            Integer num2 = zzbVar.length;
            if (num == null || num2 == null) {
                throw new ApiException(status);
            }
            com.google.android.libraries.places.api.model.zzej zzejVarZzc = com.google.android.libraries.places.api.model.zzek.zzc();
            zzejVarZzc.zza(num.intValue());
            zzejVarZzc.zzb(num2.intValue());
            arrayList.add(zzejVarZzc.zzc());
        }
        return arrayList;
    }
}
