package Ca;

import Ba.NotificationData;
import Ba.NotificationMethod;
import Ba.NotificationResourceIds;
import Ba.m;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import v9.C17649a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u00020\u001e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#¨\u0006$"}, d2 = {"LCa/d;", "LCa/a;", "LC9/a;", "metaDataReader", "Landroid/content/Context;", "context", "Lv9/a;", "uuidProvider", "<init>", "(LC9/a;Landroid/content/Context;Lv9/a;)V", "LBa/n;", "e", "()LBa/n;", "", "", "remoteMessageData", "LBa/l;", "f", "(Ljava/util/Map;)LBa/l;", "b", "()LBa/l;", "notificationMethod", "LBa/m;", "g", "(Ljava/lang/String;)LBa/m;", "c", "(Ljava/util/Map;)Ljava/lang/String;", "rootParams", "d", "(Ljava/lang/String;)Ljava/util/Map;", "LBa/k;", "a", "(Ljava/util/Map;)LBa/k;", "LC9/a;", "Landroid/content/Context;", "Lv9/a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C9.a metaDataReader;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    public d(C9.a metaDataReader, Context context, C17649a uuidProvider) {
        Intrinsics.j(metaDataReader, "metaDataReader");
        Intrinsics.j(context, "context");
        Intrinsics.j(uuidProvider, "uuidProvider");
        this.metaDataReader = metaDataReader;
        this.context = context;
        this.uuidProvider = uuidProvider;
    }

    private final NotificationMethod b() {
        String strA = this.uuidProvider.a();
        Intrinsics.i(strA, "provideId(...)");
        return new NotificationMethod(strA, m.f2607a);
    }

    private final String c(Map<String, String> remoteMessageData) {
        String orDefault = remoteMessageData.getOrDefault("ems.tap_actions.default_action.name", null);
        String orDefault2 = remoteMessageData.getOrDefault("ems.tap_actions.default_action.type", null);
        String orDefault3 = remoteMessageData.getOrDefault("ems.tap_actions.default_action.url", null);
        String orDefault4 = remoteMessageData.getOrDefault("ems.tap_actions.default_action.payload", null);
        JSONObject jSONObjectPut = orDefault2 != null ? new JSONObject().put("name", orDefault).put("type", orDefault2).put("url", orDefault3).put("payload", orDefault4 != null ? new JSONObject(orDefault4) : null) : null;
        if (jSONObjectPut != null) {
            return jSONObjectPut.toString();
        }
        return null;
    }

    private final Map<String, String> d(String rootParams) {
        JSONObject jSONObject;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (rootParams != null) {
            try {
                jSONObject = new JSONObject(rootParams);
            } catch (Exception unused) {
                jSONObject = new JSONObject("{}");
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.i(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        return linkedHashMap;
    }

    private final NotificationResourceIds e() {
        return new NotificationResourceIds(this.metaDataReader.b(this.context, "com.emarsys.mobileengage.small_notification_icon", a.INSTANCE.a()), this.metaDataReader.a(this.context, "com.emarsys.mobileengage.notification_color"));
    }

    private final NotificationMethod f(Map<String, String> remoteMessageData) {
        String str = remoteMessageData.get("ems.notification_method.collapse_key");
        return str != null ? new NotificationMethod(str, g(remoteMessageData.get("ems.notification_method.operation"))) : b();
    }

    private final m g(String notificationMethod) {
        if (notificationMethod == null) {
            return m.f2607a;
        }
        String upperCase = notificationMethod.toUpperCase(Locale.ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        return m.valueOf(upperCase);
    }

    @Override // Ca.a
    public NotificationData a(Map<String, String> remoteMessageData) {
        Intrinsics.j(remoteMessageData, "remoteMessageData");
        NotificationResourceIds notificationResourceIdsE = e();
        String str = remoteMessageData.get("ems.message_id");
        if (str == null) {
            str = "Missing messageId";
        }
        String str2 = str;
        String str3 = remoteMessageData.get("notification.image");
        String str4 = remoteMessageData.get("notification.icon");
        String str5 = remoteMessageData.get("notification.title");
        String str6 = remoteMessageData.get("ems.style");
        String str7 = remoteMessageData.get("ems.multichannel_id");
        String str8 = remoteMessageData.get("notification.body");
        String str9 = remoteMessageData.get("notification.channel_id");
        NotificationMethod notificationMethodF = f(remoteMessageData);
        String str10 = remoteMessageData.get("ems.sid");
        if (str10 == null) {
            str10 = "Missing sid";
        }
        String str11 = str10;
        String str12 = remoteMessageData.get("ems.actions");
        String strC = c(remoteMessageData);
        String str13 = remoteMessageData.get("ems.inapp");
        Map<String, String> mapD = d(remoteMessageData.get("ems.root_params"));
        String str14 = mapD.get("u");
        if (str14 == null) {
            str14 = "{}";
        }
        return new NotificationData(str3, str4, str6, str5, str8, str9, str7, str11, notificationResourceIdsE.getSmallIconResourceId(), notificationResourceIdsE.getColorResourceId(), notificationMethodF.getCollapseId(), notificationMethodF.getOperation().name(), str12, strC, str13, mapD, str14, str2);
    }
}
