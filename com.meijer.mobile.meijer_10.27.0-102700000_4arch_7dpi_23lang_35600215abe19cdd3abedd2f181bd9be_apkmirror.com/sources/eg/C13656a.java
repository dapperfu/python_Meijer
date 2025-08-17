package eg;

import com.fullstory.FS;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import gg.AbstractC14257d;
import gg.AbstractC14258e;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: eg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C13656a {

    /* renamed from: a, reason: collision with root package name */
    f f128716a;

    /* renamed from: b, reason: collision with root package name */
    f f128717b;

    public static C13656a a(f fVar, f fVar2) {
        return new C13656a(fVar, fVar2);
    }

    private String c(String str) {
        String strD = d(this.f128716a, str);
        if (strD != null) {
            return strD;
        }
        String strD2 = d(this.f128717b, str);
        return strD2 != null ? strD2 : "";
    }

    C13656a(f fVar, f fVar2) {
        this.f128716a = fVar;
        this.f128717b = fVar2;
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

    AbstractC14258e b(g gVar) throws JSONException, FirebaseRemoteConfigClientException {
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
                hashSet.add(AbstractC14257d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jK).a());
            } catch (JSONException e10) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return AbstractC14258e.a(hashSet);
    }
}
