package com.google.android.libraries.places.internal;

import com.android.volley.k;
import com.android.volley.toolbox.j;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class zzfn extends j {
    final /* synthetic */ Map zza;

    @Override // com.android.volley.i
    public final Map getHeaders() {
        return this.zza;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfn(zzfr zzfrVar, int i10, String str, JSONObject jSONObject, k.b bVar, k.a aVar, Map map) {
        super(0, str, null, bVar, aVar);
        this.zza = map;
        Objects.requireNonNull(zzfrVar);
    }
}
