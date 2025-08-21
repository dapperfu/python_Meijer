package ia;

import D9.ResponseModel;
import Z9.Geofence;
import Z9.Trigger;
import io.constructor.data.local.PreferencesHelper;
import ja.GeofenceGroup;
import ja.GeofenceResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\f\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, d2 = {"Lia/p;", "LS8/c;", "LD9/c;", "Lja/b;", "<init>", "()V", "Lorg/json/JSONArray;", "groupJsonArray", "", "Lja/a;", "c", "(Lorg/json/JSONArray;)Ljava/util/List;", "geofenceJsonArray", "LZ9/a;", "b", "responseModel", "e", "(LD9/c;)Lja/b;", "triggerJsonArray", "LZ9/b;", "d", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class p implements S8.c<ResponseModel, GeofenceResponse> {
    private List<Geofence> b(JSONArray geofenceJsonArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = geofenceJsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = geofenceJsonArray.getJSONObject(i10);
            String string = jSONObject.getString(PreferencesHelper.PREF_ID);
            double d10 = jSONObject.getDouble("lat");
            double d11 = jSONObject.getDouble("lon");
            double d12 = jSONObject.getDouble("r");
            double dOptDouble = jSONObject.optDouble("waitInterval", 0.0d);
            JSONArray jSONArray = jSONObject.getJSONArray("triggers");
            Intrinsics.g(jSONArray);
            List<Trigger> listD = d(jSONArray);
            Intrinsics.g(string);
            arrayList.add(new Geofence(string, d10, d11, d12, Double.valueOf(dOptDouble), listD));
        }
        return arrayList;
    }

    private List<GeofenceGroup> c(JSONArray groupJsonArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = groupJsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = groupJsonArray.getJSONObject(i10);
            String string = jSONObject.getString(PreferencesHelper.PREF_ID);
            double d10 = jSONObject.getDouble("waitInterval");
            JSONArray jSONArray = jSONObject.getJSONArray("geofences");
            Intrinsics.g(jSONArray);
            List<Geofence> listB = b(jSONArray);
            if (!listB.isEmpty()) {
                Intrinsics.g(string);
                arrayList.add(new GeofenceGroup(string, Double.valueOf(d10), listB));
            }
        }
        return arrayList;
    }

    public List<Trigger> d(JSONArray triggerJsonArray) throws Exception {
        Intrinsics.j(triggerJsonArray, "triggerJsonArray");
        ArrayList arrayList = new ArrayList();
        int length = triggerJsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject jSONObject = triggerJsonArray.getJSONObject(i10);
                String string = jSONObject.getString(PreferencesHelper.PREF_ID);
                String string2 = jSONObject.getString("type");
                Intrinsics.i(string2, "getString(...)");
                Z9.c cVarValueOf = Z9.c.valueOf(string2);
                int iOptInt = jSONObject.optInt("loiteringDelay");
                if (jSONObject.has("loiteringDelay") || cVarValueOf != Z9.c.f43657c) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("action");
                    Intrinsics.g(string);
                    Intrinsics.g(jSONObject2);
                    arrayList.add(new Trigger(string, cVarValueOf, iOptInt, jSONObject2));
                }
            } catch (Exception e10) {
                if (e10 instanceof IllegalArgumentException) {
                    continue;
                } else if (!(e10 instanceof JSONException)) {
                    throw e10;
                }
            }
        }
        return arrayList;
    }

    @Override // S8.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public GeofenceResponse a(ResponseModel responseModel) throws JSONException {
        Intrinsics.j(responseModel, "responseModel");
        ArrayList arrayList = new ArrayList();
        double dOptDouble = 0.5d;
        try {
            String body = responseModel.getBody();
            if (body != null) {
                JSONObject jSONObject = new JSONObject(body);
                dOptDouble = jSONObject.optDouble("refreshRadiusRatio", 0.5d);
                JSONArray jSONArray = jSONObject.getJSONArray("groups");
                Intrinsics.g(jSONArray);
                arrayList.addAll(c(jSONArray));
            }
        } catch (Exception e10) {
            if (!(e10 instanceof JSONException)) {
                K9.e.INSTANCE.c(new L9.b(e10, null, 2, null));
            }
        }
        return new GeofenceResponse(arrayList, dOptDouble);
    }
}
