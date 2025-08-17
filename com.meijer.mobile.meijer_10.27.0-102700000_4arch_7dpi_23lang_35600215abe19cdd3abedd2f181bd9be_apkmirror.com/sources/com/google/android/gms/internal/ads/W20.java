package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class W20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final List f70991a;

    public W20(List list) {
        this.f70991a = list;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f70991a));
        } catch (JSONException unused) {
            Pc.p0.k("Failed putting experiment ids.");
        }
    }
}
