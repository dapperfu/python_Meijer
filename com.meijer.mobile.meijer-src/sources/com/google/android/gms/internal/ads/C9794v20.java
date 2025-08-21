package com.google.android.gms.internal.ads;

import Kc.a;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.v20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9794v20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0277a f79813a;

    /* renamed from: b, reason: collision with root package name */
    private final String f79814b;

    /* renamed from: c, reason: collision with root package name */
    private final C7151Od0 f79815c;

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectG = Rc.U.g((JSONObject) obj, "pii");
            a.C0277a c0277a = this.f79813a;
            if (c0277a == null || TextUtils.isEmpty(c0277a.a())) {
                String str = this.f79814b;
                if (str != null) {
                    jSONObjectG.put("pdid", str);
                    jSONObjectG.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectG.put("rdid", this.f79813a.a());
            jSONObjectG.put("is_lat", this.f79813a.b());
            jSONObjectG.put("idtype", "adid");
            C7151Od0 c7151Od0 = this.f79815c;
            if (c7151Od0.c()) {
                jSONObjectG.put("paidv1_id_android_3p", c7151Od0.b());
                jSONObjectG.put("paidv1_creation_time_android_3p", this.f79815c.a());
            }
        } catch (JSONException e10) {
            Rc.p0.l("Failed putting Ad ID.", e10);
        }
    }

    public C9794v20(a.C0277a c0277a, String str, C7151Od0 c7151Od0) {
        this.f79813a = c0277a;
        this.f79814b = str;
        this.f79815c = c7151Od0;
    }
}
