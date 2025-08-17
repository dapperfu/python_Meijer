package com.google.android.gms.internal.ads;

import Mc.C4169y;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.r30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9243r30 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f77914a;

    public C9243r30(Map map) {
        this.f77914a = map;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("video_decoders", C4169y.b().l(this.f77914a));
        } catch (JSONException e10) {
            Pc.p0.k("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
