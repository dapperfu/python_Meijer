package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzkf extends zzks {
    @Override // com.google.android.libraries.places.internal.zzks
    protected final String zzf() {
        return "details/json";
    }

    zzkf(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, zzmx zzmxVar) {
        super(fetchPlaceRequest, locale, str, zzmxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final Map zze() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zza();
        HashMap map = new HashMap();
        zzks.zzg(map, "placeid", fetchPlaceRequest.getPlaceId(), null);
        zzks.zzg(map, "sessiontoken", fetchPlaceRequest.getSessionToken(), null);
        zzks.zzg(map, "fields", zzll.zzb(fetchPlaceRequest.getPlaceFields()), null);
        return map;
    }
}
