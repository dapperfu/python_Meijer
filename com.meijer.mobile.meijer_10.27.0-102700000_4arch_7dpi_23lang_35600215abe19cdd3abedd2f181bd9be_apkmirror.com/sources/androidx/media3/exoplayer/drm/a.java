package androidx.media3.exoplayer.drm;

import d3.P;
import d3.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return P.f127086a >= 27 ? bArr : P.q0(c(P.G(bArr)));
    }

    public static byte[] b(byte[] bArr) throws JSONException {
        if (P.f127086a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(P.G(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return P.q0(sb2.toString());
        } catch (JSONException e10) {
            r.e("ClearKeyUtil", "Failed to adjust response data: " + P.G(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
