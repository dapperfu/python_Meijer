package com.google.android.gms.internal.ads;

import Ic.a;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.v20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9669v20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0217a f78973a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78974b;

    /* renamed from: c, reason: collision with root package name */
    private final C7026Od0 f78975c;

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectG = Pc.U.g((JSONObject) obj, "pii");
            a.C0217a c0217a = this.f78973a;
            if (c0217a == null || TextUtils.isEmpty(c0217a.a())) {
                String str = this.f78974b;
                if (str != null) {
                    jSONObjectG.put("pdid", str);
                    jSONObjectG.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectG.put("rdid", this.f78973a.a());
            jSONObjectG.put("is_lat", this.f78973a.b());
            jSONObjectG.put("idtype", "adid");
            C7026Od0 c7026Od0 = this.f78975c;
            if (c7026Od0.c()) {
                jSONObjectG.put("paidv1_id_android_3p", c7026Od0.b());
                jSONObjectG.put("paidv1_creation_time_android_3p", this.f78975c.a());
            }
        } catch (JSONException e10) {
            Pc.p0.l("Failed putting Ad ID.", e10);
        }
    }

    public C9669v20(a.C0217a c0217a, String str, C7026Od0 c7026Od0) {
        this.f78973a = c0217a;
        this.f78974b = str;
        this.f78975c = c7026Od0;
    }
}
