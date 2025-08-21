package gg;

import com.fullstory.FS;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import ig.AbstractC14731d;
import ig.AbstractC14732e;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C14360a {

    /* renamed from: a, reason: collision with root package name */
    f f134184a;

    /* renamed from: b, reason: collision with root package name */
    f f134185b;

    public static C14360a a(f fVar, f fVar2) {
        return new C14360a(fVar, fVar2);
    }

    private String c(String str) {
        String strD = d(this.f134184a, str);
        if (strD != null) {
            return strD;
        }
        String strD2 = d(this.f134185b, str);
        return strD2 != null ? strD2 : "";
    }

    C14360a(f fVar, f fVar2) {
        this.f134184a = fVar;
        this.f134185b = fVar2;
    }

    private static String d(f fVar, String str) {
        g gVarF = fVar.f();
        if (gVarF == null) {
            return null;
        }
        try {
            return gVarF.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    AbstractC14732e b(g gVar) throws JSONException, FirebaseRemoteConfigClientException {
        JSONArray jSONArrayJ = gVar.j();
        long jK = gVar.k();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayJ.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArrayJ.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    FS.log_w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(AbstractC14731d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jK).a());
            } catch (JSONException e10) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return AbstractC14732e.a(hashSet);
    }
}
