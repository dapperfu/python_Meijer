package Ba;

import W8.ChannelSettings;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.m;
import ba.NotificationInformation;
import com.adobe.marketing.mobile.u;
import com.adobe.marketing.mobile.v;
import fa.C13973b;
import j9.DeviceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import va.C17650a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u0019\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J%\u0010.\u001a\u00020\u00152\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b.\u0010\u0017J-\u00100\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b0\u00101J)\u00102\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b2\u00103J!\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u00107\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"LBa/h;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "remoteMessageData", "Lj9/c;", "deviceInfo", "LI9/f;", "fileDownloader", "Lva/a;", "actionCommandFactory", "LCa/b;", "remoteMessageMapperFactory", "", "i", "(Landroid/content/Context;Ljava/util/Map;Lj9/c;LI9/f;Lva/a;LCa/b;)V", "remoteMessage", "", "m", "(Ljava/util/Map;)Z", "n", "k", "LBa/k;", "notificationData", "Landroidx/core/app/m$e;", "d", "(LBa/k;Landroid/content/Context;)Landroidx/core/app/m$e;", "h", "(Lj9/c;LBa/k;Landroid/content/Context;)LBa/k;", "p", "(Landroidx/core/app/m$e;Landroid/content/Context;LI9/f;LBa/k;)Landroidx/core/app/m$e;", "LW8/b;", "notificationSettings", "channelId", "o", "(LW8/b;Ljava/lang/String;)Z", "b", "(Landroid/content/Context;)Ljava/lang/String;", "", "Ljava/lang/Runnable;", "f", "(Lva/a;LBa/k;)Ljava/util/List;", "l", "Landroid/app/Notification;", "c", "(Landroid/content/Context;Lj9/c;LI9/f;LBa/k;)Landroid/app/Notification;", "q", "(Landroidx/core/app/m$e;LBa/k;LI9/f;Lj9/c;)Landroidx/core/app/m$e;", "inappData", "g", "(LI9/f;Ljava/lang/String;)Ljava/lang/String;", "inAppDescriptor", "e", "(LBa/k;Ljava/lang/String;)LBa/k;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2583a = new h();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.f2607a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.f2608b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.f2609c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String b(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        v.a();
        NotificationChannel notificationChannelA = u.a("ems_debug", "Emarsys SDK Debug Messages", 4);
        ((NotificationManager) systemService).createNotificationChannel(notificationChannelA);
        String id2 = notificationChannelA.getId();
        Intrinsics.i(id2, "getId(...)");
        return id2;
    }

    private final NotificationData h(DeviceInfo deviceInfo, NotificationData notificationData, Context context) {
        if (!I9.a.f14384a.e() || !deviceInfo.getIsDebugMode() || o(deviceInfo.getNotificationSettings(), notificationData.getChannelId())) {
            return notificationData;
        }
        return NotificationData.b(notificationData, null, null, null, "Emarsys SDK", "DEBUG - channel_id mismatch: " + notificationData.getChannelId() + " not found!", b(context), null, null, 0, 0, null, null, null, null, null, null, null, null, 262087, null);
    }

    @JvmStatic
    public static final void i(Context context, Map<String, String> remoteMessageData, DeviceInfo deviceInfo, I9.f fileDownloader, C17650a actionCommandFactory, Ca.b remoteMessageMapperFactory) {
        Intrinsics.j(context, "context");
        Intrinsics.j(remoteMessageData, "remoteMessageData");
        Intrinsics.j(deviceInfo, "deviceInfo");
        Intrinsics.j(fileDownloader, "fileDownloader");
        Intrinsics.j(actionCommandFactory, "actionCommandFactory");
        Intrinsics.j(remoteMessageMapperFactory, "remoteMessageMapperFactory");
        NotificationData notificationDataA = remoteMessageMapperFactory.a(remoteMessageData).a(remoteMessageData);
        h hVar = f2583a;
        if (hVar.l(remoteMessageData)) {
            for (final Runnable runnable : hVar.f(actionCommandFactory, notificationDataA)) {
                C13973b.b().getConcurrentHandlerHolder().h(new Runnable() { // from class: Ba.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.j(runnable);
                    }
                });
            }
            return;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String collapseId = notificationDataA.getCollapseId();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        Notification notificationC = hVar.c(applicationContext, deviceInfo, fileDownloader, notificationDataA);
        int i10 = a.$EnumSwitchMapping$0[m.valueOf(notificationDataA.getOperation()).ordinal()];
        if (i10 == 1 || i10 == 2) {
            notificationManager.notify(collapseId, collapseId.hashCode(), notificationC);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            notificationManager.cancel(collapseId, collapseId.hashCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @JvmStatic
    public static final boolean k(Map<String, String> remoteMessage) {
        Intrinsics.j(remoteMessage, "remoteMessage");
        h hVar = f2583a;
        return hVar.m(remoteMessage) || hVar.n(remoteMessage);
    }

    private final boolean m(Map<String, String> remoteMessage) {
        return remoteMessage.containsKey("ems_msg");
    }

    private final boolean n(Map<String, String> remoteMessage) {
        return remoteMessage.containsKey("ems.version");
    }

    public final Notification c(Context context, DeviceInfo deviceInfo, I9.f fileDownloader, NotificationData notificationData) {
        Intrinsics.j(context, "context");
        Intrinsics.j(deviceInfo, "deviceInfo");
        Intrinsics.j(fileDownloader, "fileDownloader");
        Intrinsics.j(notificationData, "notificationData");
        NotificationData notificationDataH = h(deviceInfo, notificationData, context);
        Notification notificationC = q(p(d(notificationDataH, context), context, fileDownloader, notificationDataH), notificationDataH, fileDownloader, deviceInfo).c();
        Intrinsics.i(notificationC, "build(...)");
        return notificationC;
    }

    public final NotificationData e(NotificationData notificationData, String inAppDescriptor) {
        Intrinsics.j(notificationData, "notificationData");
        return inAppDescriptor != null ? NotificationData.b(notificationData, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, inAppDescriptor, null, null, null, 245759, null) : NotificationData.b(notificationData, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, 262143, null);
    }

    public final List<Runnable> f(C17650a actionCommandFactory, NotificationData notificationData) {
        Intrinsics.j(actionCommandFactory, "actionCommandFactory");
        Intrinsics.j(notificationData, "notificationData");
        String actions = notificationData.getActions();
        JSONArray jSONArray = actions != null ? new JSONArray(actions) : null;
        ArrayList arrayList = new ArrayList();
        String campaignId = notificationData.getCampaignId();
        if (campaignId != null && campaignId.length() != 0) {
            arrayList.add(new wa.j(C13973b.b().r(), new NotificationInformation(notificationData.getCampaignId())));
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                Intrinsics.g(jSONObjectOptJSONObject);
                arrayList.add(actionCommandFactory.a(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public final String g(I9.f fileDownloader, String inappData) throws JSONException {
        Intrinsics.j(fileDownloader, "fileDownloader");
        if (inappData != null) {
            try {
                JSONObject jSONObject = new JSONObject(inappData);
                if (O9.a.a(jSONObject).c("campaign_id", String.class).c("url", String.class).d().isEmpty()) {
                    String string = jSONObject.getString("url");
                    Intrinsics.i(string, "getString(...)");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("campaignId", jSONObject.getString("campaign_id"));
                    jSONObject2.put("url", string);
                    jSONObject2.put("fileUrl", I9.f.f(fileDownloader, string, 0, 2, null));
                    return jSONObject2.toString();
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final boolean l(Map<String, String> remoteMessageData) {
        String str;
        String str2 = remoteMessageData != null ? remoteMessageData.get("ems") : null;
        return (str2 != null ? new JSONObject(str2).optBoolean("silent", false) : false) || ((remoteMessageData == null || (str = remoteMessageData.get("ems.silent")) == null) ? false : Boolean.parseBoolean(str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final m.e q(m.e eVar, NotificationData notificationData, I9.f fileDownloader, DeviceInfo deviceInfo) {
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(notificationData, "notificationData");
        Intrinsics.j(fileDownloader, "fileDownloader");
        Intrinsics.j(deviceInfo, "deviceInfo");
        I9.g gVar = I9.g.f14390a;
        Bitmap bitmapF = gVar.f(fileDownloader, notificationData.getImageUrl(), deviceInfo);
        Bitmap bitmapF2 = gVar.f(fileDownloader, notificationData.getIconImageUrl(), deviceInfo);
        String style = notificationData.getStyle();
        if (style != null) {
            switch (style.hashCode()) {
                case -1077038977:
                    if (style.equals("BIG_PICTURE")) {
                        return Ba.a.f2577a.a(eVar, notificationData, bitmapF, bitmapF2);
                    }
                    break;
                case -177839924:
                    if (style.equals("THUMBNAIL")) {
                        return p.f2614a.a(eVar, notificationData, bitmapF, bitmapF2);
                    }
                    break;
                case 1547600172:
                    if (style.equals("BIG_TEXT")) {
                        return b.f2578a.a(eVar, notificationData, bitmapF, bitmapF2);
                    }
                    break;
                case 1672907751:
                    if (style.equals("MESSAGE")) {
                        return f.f2581a.a(eVar, notificationData, bitmapF, bitmapF2);
                    }
                    break;
            }
        }
        return c.f2579a.a(eVar, notificationData, bitmapF, bitmapF2);
    }

    private h() {
    }

    private final m.e d(NotificationData notificationData, Context context) {
        if (notificationData.getChannelId() == null) {
            return new m.e(context);
        }
        return new m.e(context, notificationData.getChannelId());
    }

    private final boolean o(W8.b notificationSettings, String channelId) {
        List<ChannelSettings> listC = notificationSettings.c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(((ChannelSettings) it.next()).g(), channelId)) {
                return true;
            }
        }
        return false;
    }

    private final m.e p(m.e eVar, Context context, I9.f fVar, NotificationData notificationData) {
        JSONArray jSONArray;
        List<m.a> listM;
        String actions = notificationData.getActions();
        if (actions != null) {
            jSONArray = new JSONArray(actions);
        } else {
            jSONArray = null;
        }
        if (jSONArray == null || (listM = j.f2586a.c(context, jSONArray, notificationData)) == null) {
            listM = CollectionsKt.m();
        }
        eVar.k(notificationData.getTitle()).j(notificationData.getBody()).y(notificationData.getSmallIconResourceId()).f(false).i(e.f2580a.c(context, e(notificationData, g(fVar, notificationData.getInapp()))));
        int size = listM.size();
        for (int i10 = 0; i10 < size; i10++) {
            eVar.b(listM.get(i10));
        }
        if (notificationData.getColorResourceId() != 0) {
            eVar.h(Z1.b.c(context, notificationData.getColorResourceId()));
        }
        return eVar;
    }
}
