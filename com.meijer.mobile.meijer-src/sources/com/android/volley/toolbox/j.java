package com.android.volley.toolbox;

import com.android.volley.ParseError;
import com.android.volley.k;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class j extends k<JSONObject> {
    public j(String str, k.b<JSONObject> bVar, k.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Deprecated
    public j(String str, JSONObject jSONObject, k.b<JSONObject> bVar, k.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.k, com.android.volley.i
    protected com.android.volley.k<JSONObject> parseNetworkResponse(com.android.volley.h hVar) {
        try {
            return com.android.volley.k.c(new JSONObject(new String(hVar.f63753b, e.f(hVar.f63754c, "utf-8"))), e.e(hVar));
        } catch (UnsupportedEncodingException e10) {
            return com.android.volley.k.a(new ParseError(e10));
        } catch (JSONException e11) {
            return com.android.volley.k.a(new ParseError(e11));
        }
    }

    public j(int i10, String str, JSONObject jSONObject, k.b<JSONObject> bVar, k.a aVar) {
        super(i10, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
