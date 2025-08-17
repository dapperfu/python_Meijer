package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzkj extends zzks {
    @Override // com.google.android.libraries.places.internal.zzks
    protected final String zzf() {
        return "autocomplete/json";
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final Map zze() {
        HashMap map = new HashMap();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zza();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        String query = findAutocompletePredictionsRequest.getQuery();
        zzks.zzg(map, "input", query == null ? null : query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " "), null);
        if (typesFilter.isEmpty()) {
            zzks.zzg(map, "types", typeFilter != null ? zzlm.zza(typeFilter) : null, null);
        } else {
            zzks.zzg(map, "types", TextUtils.join("|", typesFilter), null);
        }
        zzks.zzg(map, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zzks.zzg(map, "origin", zzlk.zzc(findAutocompletePredictionsRequest.getOrigin()), null);
        zzks.zzg(map, "locationbias", zzlk.zzd(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzks.zzg(map, "locationrestriction", zzlk.zze(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        List<String> countries = findAutocompletePredictionsRequest.getCountries();
        StringBuilder sb2 = new StringBuilder();
        for (String str : countries) {
            String strConcat = TextUtils.isEmpty(str) ? null : "country:".concat(String.valueOf(str.toLowerCase(Locale.US)));
            if (strConcat != null) {
                if (sb2.length() != 0) {
                    sb2.append('|');
                }
                sb2.append(strConcat);
            }
        }
        zzks.zzg(map, "components", sb2.length() == 0 ? null : sb2.toString(), null);
        return map;
    }

    zzkj(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, zzmx zzmxVar) {
        super(findAutocompletePredictionsRequest, locale, str, zzmxVar);
    }
}
