package com.adobe.marketing.mobile.analytics.internal;

import com.adobe.marketing.mobile.D;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/a;", "", "<init>", "()V", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "MAP_TO_CONTEXT_DATA_KEYS", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f62893a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, String> MAP_TO_CONTEXT_DATA_KEYS = MapsKt.o(TuplesKt.a("advertisingidentifier", "a.adid"), TuplesKt.a("appid", "a.AppID"), TuplesKt.a("carriername", "a.CarrierName"), TuplesKt.a("crashevent", "a.CrashEvent"), TuplesKt.a("dailyenguserevent", "a.DailyEngUserEvent"), TuplesKt.a("dayofweek", "a.DayOfWeek"), TuplesKt.a("dayssincefirstuse", "a.DaysSinceFirstUse"), TuplesKt.a("dayssincelastuse", "a.DaysSinceLastUse"), TuplesKt.a("dayssincelastupgrade", "a.DaysSinceLastUpgrade"), TuplesKt.a("devicename", "a.DeviceName"), TuplesKt.a("resolution", "a.Resolution"), TuplesKt.a("hourofday", "a.HourOfDay"), TuplesKt.a("ignoredsessionlength", "a.ignoredSessionLength"), TuplesKt.a("installdate", "a.InstallDate"), TuplesKt.a("installevent", "a.InstallEvent"), TuplesKt.a("launchevent", "a.LaunchEvent"), TuplesKt.a("launches", "a.Launches"), TuplesKt.a("launchessinceupgrade", "a.LaunchesSinceUpgrade"), TuplesKt.a("locale", "a.locale"), TuplesKt.a("systemlocale", "a.systemLocale"), TuplesKt.a("monthlyenguserevent", "a.MonthlyEngUserEvent"), TuplesKt.a("osversion", "a.OSVersion"), TuplesKt.a("prevsessionlength", "a.PrevSessionLength"), TuplesKt.a("runmode", "a.RunMode"), TuplesKt.a("upgradeevent", "a.UpgradeEvent"), TuplesKt.a("previousosversion", "a.OSVersion"), TuplesKt.a("previousappid", "a.AppID"));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/a$a;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/D;", "b", "Lcom/adobe/marketing/mobile/D;", "a", "()Lcom/adobe/marketing/mobile/D;", "DEFAULT_PRIVACY_STATUS", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.analytics.internal.a$a, reason: collision with other inner class name */
    public static final class C1236a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1236a f62895a = new C1236a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final D DEFAULT_PRIVACY_STATUS = D.OPT_IN;

        public final D a() {
            return DEFAULT_PRIVACY_STATUS;
        }

        private C1236a() {
        }
    }

    public final Map<String, String> a() {
        return MAP_TO_CONTEXT_DATA_KEYS;
    }

    private a() {
    }
}
