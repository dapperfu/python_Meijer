package com.google.android.gms.internal.ads;

import L4.e;
import android.net.Uri;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7088Qa0 implements e.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7156Sa0 f69587a;

    C7088Qa0(C7156Sa0 c7156Sa0) {
        this.f69587a = c7156Sa0;
    }

    @Override // L4.e.a
    public final void onPostMessage(WebView webView, L4.b bVar, Uri uri, boolean z10, L4.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(bVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    C6647Da0.f66261a.getClass();
                    return;
                } else {
                    C7156Sa0.c(this.f69587a, string2);
                    return;
                }
            }
            C7156Sa0.e(this.f69587a, string2);
        } catch (JSONException e10) {
            C6547Ab0.a("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
