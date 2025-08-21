package Ca;

import Ba.NotificationData;
import Ba.NotificationMethod;
import Ba.NotificationResourceIds;
import Ba.m;
import I9.i;
import android.content.Context;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import v9.C17649a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0012¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0012¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006 "}, d2 = {"LCa/c;", "LCa/a;", "LC9/a;", "metaDataReader", "Landroid/content/Context;", "context", "Lv9/a;", "uuidProvider", "<init>", "(LC9/a;Landroid/content/Context;Lv9/a;)V", "LBa/n;", "c", "()LBa/n;", "Lorg/json/JSONObject;", "notificationMethod", "LBa/l;", "d", "(Lorg/json/JSONObject;)LBa/l;", "b", "()LBa/l;", "LBa/m;", "e", "(Lorg/json/JSONObject;)LBa/m;", "", "", "remoteMessageData", "LBa/k;", "a", "(Ljava/util/Map;)LBa/k;", "LC9/a;", "Landroid/content/Context;", "Lv9/a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class c implements a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C9.a metaDataReader;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    public c(C9.a metaDataReader, Context context, C17649a uuidProvider) {
        Intrinsics.j(metaDataReader, "metaDataReader");
        Intrinsics.j(context, "context");
        Intrinsics.j(uuidProvider, "uuidProvider");
        this.metaDataReader = metaDataReader;
        this.context = context;
        this.uuidProvider = uuidProvider;
    }

    private NotificationMethod b() {
        String strA = this.uuidProvider.a();
        Intrinsics.i(strA, "provideId(...)");
        return new NotificationMethod(strA, m.f2607a);
    }

    private NotificationResourceIds c() {
        return new NotificationResourceIds(this.metaDataReader.b(this.context, "com.emarsys.mobileengage.small_notification_icon", a.INSTANCE.a()), this.metaDataReader.a(this.context, "com.emarsys.mobileengage.notification_color"));
    }

    private NotificationMethod d(JSONObject notificationMethod) throws JSONException {
        if (notificationMethod == null || !notificationMethod.has("collapseId")) {
            return b();
        }
        String string = notificationMethod.getString("collapseId");
        m mVarE = e(notificationMethod);
        Intrinsics.g(string);
        return new NotificationMethod(string, mVarE);
    }

    private m e(JSONObject notificationMethod) throws JSONException {
        if (!notificationMethod.has("operation")) {
            return m.f2607a;
        }
        String string = notificationMethod.getString("operation");
        Intrinsics.i(string, "getString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        return m.valueOf(upperCase);
    }

    @Override // Ca.a
    public NotificationData a(Map<String, String> remoteMessageData) {
        Intrinsics.j(remoteMessageData, "remoteMessageData");
        NotificationResourceIds notificationResourceIdsC = c();
        Map mapD = MapsKt.D(remoteMessageData);
        String str = (String) mapD.remove("message_id");
        if (str == null) {
            str = "Missing messageId";
        }
        String str2 = str;
        String str3 = (String) mapD.remove("image_url");
        String str4 = (String) mapD.remove("icon_url");
        String str5 = (String) mapD.remove("title");
        String str6 = (String) mapD.remove("ems");
        if (str6 == null) {
            str6 = "{}";
        }
        JSONObject jSONObject = new JSONObject(str6);
        String strOptString = jSONObject.optString("style");
        String strOptString2 = jSONObject.optString("multichannelId");
        String str7 = (String) mapD.remove("body");
        String str8 = (String) mapD.remove("channel_id");
        String str9 = (String) mapD.remove("u");
        String str10 = str9 != null ? str9 : "{}";
        String strD = i.d(new JSONObject(str10), "sid");
        if (strD == null) {
            strD = "Missing sid";
        }
        NotificationMethod notificationMethodD = jSONObject.has("notificationMethod") ? d(jSONObject.optJSONObject("notificationMethod")) : b();
        return new NotificationData(str3, str4, strOptString, str5, str7, str8, strOptString2, strD, notificationResourceIdsC.getSmallIconResourceId(), notificationResourceIdsC.getColorResourceId(), notificationMethodD.getCollapseId(), notificationMethodD.getOperation().name(), i.d(jSONObject, "actions"), i.d(jSONObject, "default_action"), i.d(jSONObject, "inapp"), mapD, str10, str2);
    }
}
