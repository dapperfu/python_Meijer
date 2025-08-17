package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C10497p7;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f84864a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f84865b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f84866c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ E2 f84867d;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c A[Catch: NumberFormatException | JSONException -> 0x0124, NumberFormatException | JSONException -> 0x0124, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0124, blocks: (B:10:0x0027, B:44:0x0093, B:44:0x0093, B:45:0x00a4, B:45:0x00a4, B:47:0x00b5, B:47:0x00b5, B:49:0x00c7, B:49:0x00c7, B:50:0x00d0, B:50:0x00d0, B:51:0x00d4, B:51:0x00d4, B:53:0x00e5, B:53:0x00e5, B:55:0x00f7, B:55:0x00f7, B:56:0x0100, B:56:0x0100, B:57:0x0104, B:57:0x0104, B:58:0x0110, B:58:0x0110, B:59:0x011c, B:59:0x011c), top: B:71:0x0027, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.A2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        E2 e22 = this.f84867d;
        SharedPreferences.Editor editorEdit = e22.n().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f84864a);
        } else {
            String str = this.f84864a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C10497p7.a();
                        X2 x22 = e22.f84868a;
                        if (x22.u().F(null, C11120d2.f85433R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                x22.a().m().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                x22.a().m().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        this.f84867d.f84868a.a().m().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f84866c = bundle2;
    }

    public A2(E2 e22, String str, Bundle bundle) {
        Objects.requireNonNull(e22);
        this.f84867d = e22;
        com.google.android.gms.common.internal.r.f(str);
        this.f84864a = str;
        this.f84865b = new Bundle();
    }
}
