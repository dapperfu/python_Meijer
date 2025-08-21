package Fa;

import I9.p;
import W8.ChannelSettings;
import W9.MobileEngageRequestContext;
import j9.DeviceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import oa.C16089a;
import pa.ButtonClicked;
import qa.C16616a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\r\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\r\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0010JI\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0015JM\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\f¨\u0006\""}, d2 = {"LFa/c;", "", "<init>", "()V", "", "pushToken", "", "g", "(Ljava/lang/String;)Ljava/util/Map;", "LW9/k;", "requestContext", "h", "(LW9/k;)Ljava/util/Map;", "eventName", "eventAttributes", "b", "(Ljava/lang/String;Ljava/util/Map;LW9/k;)Ljava/util/Map;", "e", "LFa/a;", "eventType", "d", "(LFa/a;Ljava/lang/String;Ljava/util/Map;LW9/k;)Ljava/util/Map;", "c", "", "events", "Lqa/a;", "displayedIams", "Lpa/a;", "buttonClicks", "", "doNotDisturb", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)Ljava/util/Map;", "f", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f9129a = new c();

    @JvmStatic
    public static final Map<String, Object> a(List<? extends Object> events, List<? extends C16616a> displayedIams, List<ButtonClicked> buttonClicks, boolean doNotDisturb) {
        Intrinsics.j(events, "events");
        Intrinsics.j(displayedIams, "displayedIams");
        Intrinsics.j(buttonClicks, "buttonClicks");
        Map<String, Object> mapR = MapsKt.r(TuplesKt.a("viewedMessages", C16089a.d(displayedIams)), TuplesKt.a("clicks", C16089a.b(buttonClicks)));
        if (doNotDisturb) {
            mapR.put("dnd", Boolean.TRUE);
        }
        mapR.put("events", events);
        return mapR;
    }

    @JvmStatic
    public static final Map<String, Object> b(String eventName, Map<String, String> eventAttributes, MobileEngageRequestContext requestContext) {
        Intrinsics.j(eventName, "eventName");
        Intrinsics.j(requestContext, "requestContext");
        return f9129a.d(a.f9122a, eventName, eventAttributes, requestContext);
    }

    private final Map<String, Object> c(a eventType, String eventName, Map<String, String> eventAttributes, MobileEngageRequestContext requestContext) {
        Map<String, Object> mapR = MapsKt.r(TuplesKt.a("type", d.a(eventType)), TuplesKt.a("name", eventName), TuplesKt.a("timestamp", p.a(requestContext.getTimestampProvider().a())));
        if (eventAttributes != null && !eventAttributes.isEmpty()) {
            mapR.put("attributes", eventAttributes);
        }
        String sessionId = requestContext.getSessionIdHolder().getSessionId();
        if (sessionId != null) {
            mapR.put("sessionId", sessionId);
        }
        return mapR;
    }

    @JvmStatic
    public static final Map<String, Object> e(String eventName, Map<String, String> eventAttributes, MobileEngageRequestContext requestContext) {
        Intrinsics.j(eventName, "eventName");
        Intrinsics.j(requestContext, "requestContext");
        return f9129a.d(a.f9123b, eventName, eventAttributes, requestContext);
    }

    @JvmStatic
    public static final Map<String, Object> f(MobileEngageRequestContext requestContext) {
        Intrinsics.j(requestContext, "requestContext");
        return MapsKt.r(TuplesKt.a("refreshToken", requestContext.j().get()));
    }

    @JvmStatic
    public static final Map<String, Object> g(String pushToken) {
        Intrinsics.j(pushToken, "pushToken");
        return MapsKt.r(TuplesKt.a("pushToken", pushToken));
    }

    @JvmStatic
    public static final Map<String, Object> h(MobileEngageRequestContext requestContext) {
        Intrinsics.j(requestContext, "requestContext");
        DeviceInfo deviceInfo = requestContext.getDeviceInfo();
        Map<String, Object> mapR = MapsKt.r(TuplesKt.a("platform", deviceInfo.j()), TuplesKt.a("applicationVersion", deviceInfo.a()), TuplesKt.a("deviceModel", deviceInfo.getModel()), TuplesKt.a("osVersion", deviceInfo.getOsVersion()), TuplesKt.a("sdkVersion", deviceInfo.getSdkVersion()), TuplesKt.a("language", deviceInfo.getLanguage()), TuplesKt.a("timezone", deviceInfo.getTimezone()));
        W8.b notificationSettings = deviceInfo.getNotificationSettings();
        Map mapR2 = MapsKt.r(TuplesKt.a("areNotificationsEnabled", Boolean.valueOf(notificationSettings.b())), TuplesKt.a("importance", Integer.valueOf(notificationSettings.a())));
        ArrayList arrayList = new ArrayList();
        if (I9.a.f14384a.e()) {
            for (ChannelSettings channelSettings : notificationSettings.c()) {
                String channelId = channelSettings.getChannelId();
                int importance = channelSettings.getImportance();
                boolean isCanBypassDnd = channelSettings.getIsCanBypassDnd();
                arrayList.add(MapsKt.o(TuplesKt.a("channelId", channelId), TuplesKt.a("importance", Integer.valueOf(importance)), TuplesKt.a("canShowBadge", Boolean.valueOf(channelSettings.getIsCanShowBadge())), TuplesKt.a("canBypassDnd", Boolean.valueOf(isCanBypassDnd)), TuplesKt.a("shouldVibrate", Boolean.valueOf(channelSettings.getIsShouldVibrate())), TuplesKt.a("shouldShowLights", Boolean.valueOf(channelSettings.getIsShouldShowLights()))));
            }
            mapR2.put("channelSettings", arrayList);
        }
        mapR.put("pushSettings", mapR2);
        return mapR;
    }

    private c() {
    }

    private final Map<String, Object> d(a eventType, String eventName, Map<String, String> eventAttributes, MobileEngageRequestContext requestContext) {
        return MapsKt.o(TuplesKt.a("clicks", CollectionsKt.m()), TuplesKt.a("viewedMessages", CollectionsKt.m()), TuplesKt.a("events", CollectionsKt.e(c(eventType, eventName, eventAttributes, requestContext))));
    }
}
