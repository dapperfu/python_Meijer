package sa;

import B9.ResponseModel;
import G9.h;
import G9.i;
import V9.AppEventActionModel;
import V9.CustomEventActionModel;
import V9.DismissActionModel;
import V9.OpenExternalUrlActionModel;
import Y9.InboxResult;
import Y9.Message;
import io.constructor.data.local.PreferencesHelper;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsa/c;", "LQ8/c;", "LB9/c;", "LY9/a;", "<init>", "()V", "Lorg/json/JSONObject;", "inboxMessageResponse", "LY9/b;", "c", "(Lorg/json/JSONObject;)LY9/b;", "", "", "e", "(Lorg/json/JSONObject;)Ljava/util/List;", "actionJson", "LV9/a;", "b", "(Lorg/json/JSONObject;)LV9/a;", "responseModel", "d", "(LB9/c;)LY9/a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: sa.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16917c implements Q8.c<ResponseModel, InboxResult> {
    private V9.a b(JSONObject actionJson) throws JSONException {
        URL url;
        String strOptString = actionJson.optString("type");
        if (strOptString == null) {
            return null;
        }
        switch (strOptString.hashCode()) {
            case -1198421327:
                if (!strOptString.equals("MEAppEvent")) {
                    return null;
                }
                String string = actionJson.getString(PreferencesHelper.PREF_ID);
                Intrinsics.i(string, "getString(...)");
                String string2 = actionJson.getString("title");
                Intrinsics.i(string2, "getString(...)");
                String string3 = actionJson.getString("type");
                Intrinsics.i(string3, "getString(...)");
                String string4 = actionJson.getString("name");
                Intrinsics.i(string4, "getString(...)");
                JSONObject jSONObject = (!actionJson.has("payload") || actionJson.isNull("payload")) ? new JSONObject() : actionJson.getJSONObject("payload");
                Intrinsics.g(jSONObject);
                return new AppEventActionModel(string, string2, string3, string4, h.g(jSONObject));
            case -958641558:
                if (!strOptString.equals("Dismiss")) {
                    return null;
                }
                String string5 = actionJson.getString(PreferencesHelper.PREF_ID);
                Intrinsics.i(string5, "getString(...)");
                String string6 = actionJson.getString("title");
                Intrinsics.i(string6, "getString(...)");
                String string7 = actionJson.getString("type");
                Intrinsics.i(string7, "getString(...)");
                return new DismissActionModel(string5, string6, string7);
            case -934042383:
                if (!strOptString.equals("MECustomEvent")) {
                    return null;
                }
                String string8 = actionJson.getString(PreferencesHelper.PREF_ID);
                Intrinsics.i(string8, "getString(...)");
                String string9 = actionJson.getString("title");
                Intrinsics.i(string9, "getString(...)");
                String string10 = actionJson.getString("type");
                Intrinsics.i(string10, "getString(...)");
                String string11 = actionJson.getString("name");
                Intrinsics.i(string11, "getString(...)");
                JSONObject jSONObject2 = actionJson.getJSONObject("payload");
                Intrinsics.i(jSONObject2, "getJSONObject(...)");
                return new CustomEventActionModel(string8, string9, string10, string11, h.g(jSONObject2));
            case 309565658:
                if (!strOptString.equals("OpenExternalUrl")) {
                    return null;
                }
                try {
                    url = new URL(actionJson.getString("url"));
                } catch (Exception unused) {
                    url = new URL("https://");
                }
                String string12 = actionJson.getString(PreferencesHelper.PREF_ID);
                Intrinsics.i(string12, "getString(...)");
                String string13 = actionJson.getString("title");
                Intrinsics.i(string13, "getString(...)");
                String string14 = actionJson.getString("type");
                Intrinsics.i(string14, "getString(...)");
                return new OpenExternalUrlActionModel(string12, string13, string14, url);
            default:
                return null;
        }
    }

    private Message c(JSONObject inboxMessageResponse) throws JSONException {
        Map<String, String> mapD;
        JSONArray jSONArrayOptJSONArray;
        List<String> listE = e(inboxMessageResponse);
        String string = inboxMessageResponse.getString(PreferencesHelper.PREF_ID);
        Intrinsics.i(string, "getString(...)");
        String string2 = inboxMessageResponse.getString("campaignId");
        Intrinsics.i(string2, "getString(...)");
        ArrayList arrayList = null;
        String string3 = inboxMessageResponse.isNull("collapseId") ? null : inboxMessageResponse.getString("collapseId");
        String string4 = inboxMessageResponse.getString("title");
        Intrinsics.i(string4, "getString(...)");
        String string5 = inboxMessageResponse.getString("body");
        Intrinsics.i(string5, "getString(...)");
        String strD = i.d(inboxMessageResponse, "imageUrl");
        String strD2 = i.d(inboxMessageResponse, "imageAltText");
        long j10 = inboxMessageResponse.getLong("receivedAt");
        Long lValueOf = Long.valueOf(inboxMessageResponse.getLong("updatedAt"));
        Long lC = i.c(inboxMessageResponse, "expiresAt");
        List<String> list = inboxMessageResponse.isNull("tags") ? null : listE;
        if (inboxMessageResponse.isNull("properties")) {
            mapD = null;
        } else {
            JSONObject jSONObject = inboxMessageResponse.getJSONObject("properties");
            Intrinsics.i(jSONObject, "getJSONObject(...)");
            mapD = h.d(jSONObject);
        }
        JSONObject jSONObjectOptJSONObject = inboxMessageResponse.optJSONObject("ems");
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("actions")) != null) {
            List<JSONObject> listH = h.f11292a.h(jSONArrayOptJSONArray);
            arrayList = new ArrayList();
            Iterator<T> it = listH.iterator();
            while (it.hasNext()) {
                V9.a aVarB = b((JSONObject) it.next());
                if (aVarB != null) {
                    arrayList.add(aVarB);
                }
            }
        }
        return new Message(string, string2, string3, string4, string5, strD, strD2, j10, lValueOf, lC, list, mapD, arrayList);
    }

    private List<String> e(JSONObject inboxMessageResponse) throws JSONException {
        JSONArray jSONArrayOptJSONArray = inboxMessageResponse.optJSONArray("tags");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArrayOptJSONArray.getString(i10);
                Intrinsics.i(string, "getString(...)");
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    @Override // Q8.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InboxResult a(ResponseModel responseModel) throws JSONException {
        Intrinsics.j(responseModel, "responseModel");
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectH = responseModel.h();
        JSONArray jSONArrayOptJSONArray = jSONObjectH != null ? jSONObjectH.optJSONArray("messages") : null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                    Intrinsics.g(jSONObject);
                    arrayList.add(c(jSONObject));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return new InboxResult(arrayList);
    }
}
