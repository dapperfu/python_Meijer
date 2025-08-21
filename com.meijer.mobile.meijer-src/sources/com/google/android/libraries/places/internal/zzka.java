package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzka extends zzks {
    zzka(FetchPhotoRequest fetchPhotoRequest, String str, zzmx zzmxVar) {
        super(fetchPhotoRequest, null, str, zzmxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzks
    protected final String zzf() {
        return "photo";
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final Map zze() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zza();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap map = new HashMap();
        zzks.zzg(map, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zzks.zzg(map, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        map.put("photoreference", photoMetadata.zza());
        return map;
    }
}
