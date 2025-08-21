package com.google.android.gms.internal.ads;

import M4.e;
import android.net.Uri;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7213Qa0 implements e.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7281Sa0 f70427a;

    C7213Qa0(C7281Sa0 c7281Sa0) {
        this.f70427a = c7281Sa0;
    }

    @Override // M4.e.a
    public final void onPostMessage(WebView webView, M4.b bVar, Uri uri, boolean z10, M4.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(bVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    C6772Da0.f67101a.getClass();
                    return;
                } else {
                    C7281Sa0.c(this.f70427a, string2);
                    return;
                }
            }
            C7281Sa0.e(this.f70427a, string2);
        } catch (JSONException e10) {
            C6672Ab0.a("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
