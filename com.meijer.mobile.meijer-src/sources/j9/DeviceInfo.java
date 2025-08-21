package j9;

import W8.ChannelSettings;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import s9.C17033a;
import w9.C17852a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\r\b\u0097\b\u0018\u0000 F2\u00020\u0001:\u0001\u001dB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u00100\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b\u001f\u0010\u0016R\u001a\u00102\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b%\u0010\u0016R\u001a\u00105\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0016R\u001a\u00107\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b)\u0010\u0016R\u001a\u00108\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b-\u0010\u0016R\u001a\u00109\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b1\u0010\u0016R\u001a\u0010>\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b#\u0010=R\u001a\u0010?\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b;\u0010,R\"\u0010B\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b6\u0010\u0016\"\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0016R\u0016\u0010D\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010E\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u0006G"}, d2 = {"Lj9/c;", "", "Landroid/content/Context;", "context", "Ls9/a;", "clientIdProvider", "Lw9/a;", "versionProvider", "Lj9/e;", "languageProvider", "LW8/b;", "notificationSettings", "", "isAutomaticPushSendingEnabled", "isGooglePlayAvailable", "<init>", "(Landroid/content/Context;Ls9/a;Lw9/a;Lj9/e;LW8/b;ZZ)V", "Lkotlin/Pair;", "", "p", "()Lkotlin/Pair;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "b", "Ls9/a;", "c", "Lw9/a;", "d", "Lj9/e;", "e", "LW8/b;", "h", "()LW8/b;", "f", "Z", "m", "()Z", "g", "o", "Ljava/lang/String;", "clientId", "i", "language", "j", "l", "timezone", "k", "manufacturer", "model", "osVersion", "Landroid/util/DisplayMetrics;", "n", "Landroid/util/DisplayMetrics;", "()Landroid/util/DisplayMetrics;", "displayMetrics", "isDebugMode", "setSdkVersion", "(Ljava/lang/String;)V", "sdkVersion", "platform", "applicationVersion", "deviceInfoPayload", "q", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j9.c, reason: from toString */
/* loaded from: classes4.dex */
public /* data */ class DeviceInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C17033a clientIdProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C17852a versionProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final e languageProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final W8.b notificationSettings;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutomaticPushSendingEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isGooglePlayAvailable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String clientId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String language;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String timezone;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String manufacturer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String model;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String osVersion;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final DisplayMetrics displayMetrics;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isDebugMode;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String sdkVersion;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.e(this.context, deviceInfo.context) && Intrinsics.e(this.clientIdProvider, deviceInfo.clientIdProvider) && Intrinsics.e(this.versionProvider, deviceInfo.versionProvider) && Intrinsics.e(this.languageProvider, deviceInfo.languageProvider) && Intrinsics.e(getNotificationSettings(), deviceInfo.getNotificationSettings()) && getIsAutomaticPushSendingEnabled() == deviceInfo.getIsAutomaticPushSendingEnabled() && getIsGooglePlayAvailable() == deviceInfo.getIsGooglePlayAvailable();
    }

    public DeviceInfo(Context context, C17033a clientIdProvider, C17852a versionProvider, e languageProvider, W8.b notificationSettings, boolean z10, boolean z11) {
        Intrinsics.j(context, "context");
        Intrinsics.j(clientIdProvider, "clientIdProvider");
        Intrinsics.j(versionProvider, "versionProvider");
        Intrinsics.j(languageProvider, "languageProvider");
        Intrinsics.j(notificationSettings, "notificationSettings");
        this.context = context;
        this.clientIdProvider = clientIdProvider;
        this.versionProvider = versionProvider;
        this.languageProvider = languageProvider;
        this.notificationSettings = notificationSettings;
        this.isAutomaticPushSendingEnabled = z10;
        this.isGooglePlayAvailable = z11;
        this.clientId = clientIdProvider.d();
        String strA = languageProvider.a(Locale.getDefault());
        Intrinsics.i(strA, "provideLanguage(...)");
        this.language = strA;
        String str = new SimpleDateFormat("Z", Locale.ENGLISH).format(Calendar.getInstance().getTime());
        Intrinsics.i(str, "format(...)");
        this.timezone = str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.i(MANUFACTURER, "MANUFACTURER");
        this.manufacturer = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.i(MODEL, "MODEL");
        this.model = MODEL;
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.i(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Intrinsics.i(displayMetrics, "getDisplayMetrics(...)");
        this.displayMetrics = displayMetrics;
        this.isDebugMode = (context.getApplicationInfo().flags & 2) != 0;
        String strA2 = versionProvider.a();
        Intrinsics.i(strA2, "provideSdkVersion(...)");
        this.sdkVersion = strA2;
    }

    private Pair<String, Object> p() {
        if (!I9.a.f14384a.e()) {
            return TuplesKt.a("channelSettings", CollectionsKt.e(new JSONObject()));
        }
        List<ChannelSettings> listC = getNotificationSettings().c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        for (ChannelSettings channelSettings : listC) {
            arrayList.add(new JSONObject(MapsKt.o(TuplesKt.a("channelId", channelSettings.g()), TuplesKt.a("importance", Integer.valueOf(channelSettings.h())), TuplesKt.a("isCanBypassDnd", Boolean.valueOf(channelSettings.i())), TuplesKt.a("isCanShowBadge", Boolean.valueOf(channelSettings.j())), TuplesKt.a("isShouldVibrate", Boolean.valueOf(channelSettings.k())))));
        }
        return TuplesKt.a("channelSettings", arrayList);
    }

    public String a() {
        String str;
        try {
            str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        return str == null ? zzbz.UNKNOWN_CONTENT_TYPE : str;
    }

    /* renamed from: b, reason: from getter */
    public String getClientId() {
        return this.clientId;
    }

    public String c() {
        String string = new JSONObject(MapsKt.o(TuplesKt.a("notificationSettings", MapsKt.o(p(), TuplesKt.a("importance", Integer.valueOf(getNotificationSettings().a())), TuplesKt.a("areNotificationsEnabled", Boolean.valueOf(getNotificationSettings().b())))), TuplesKt.a("hwid", getClientId()), TuplesKt.a("platform", j()), TuplesKt.a("language", getLanguage()), TuplesKt.a("timezone", getTimezone()), TuplesKt.a("manufacturer", getManufacturer()), TuplesKt.a("model", getModel()), TuplesKt.a("osVersion", getOsVersion()), TuplesKt.a("displayMetrics", getDisplayMetrics().widthPixels + "x" + getDisplayMetrics().heightPixels), TuplesKt.a("sdkVersion", getSdkVersion()), TuplesKt.a("appVersion", a()))).toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* renamed from: d, reason: from getter */
    public DisplayMetrics getDisplayMetrics() {
        return this.displayMetrics;
    }

    /* renamed from: e, reason: from getter */
    public String getLanguage() {
        return this.language;
    }

    /* renamed from: f, reason: from getter */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /* renamed from: g, reason: from getter */
    public String getModel() {
        return this.model;
    }

    /* renamed from: h, reason: from getter */
    public W8.b getNotificationSettings() {
        return this.notificationSettings;
    }

    public int hashCode() {
        return (((((((((((this.context.hashCode() * 31) + this.clientIdProvider.hashCode()) * 31) + this.versionProvider.hashCode()) * 31) + this.languageProvider.hashCode()) * 31) + getNotificationSettings().hashCode()) * 31) + Boolean.hashCode(getIsAutomaticPushSendingEnabled())) * 31) + Boolean.hashCode(getIsGooglePlayAvailable());
    }

    /* renamed from: i, reason: from getter */
    public String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: k, reason: from getter */
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: l, reason: from getter */
    public String getTimezone() {
        return this.timezone;
    }

    /* renamed from: m, reason: from getter */
    public boolean getIsAutomaticPushSendingEnabled() {
        return this.isAutomaticPushSendingEnabled;
    }

    /* renamed from: n, reason: from getter */
    public boolean getIsDebugMode() {
        return this.isDebugMode;
    }

    /* renamed from: o, reason: from getter */
    public boolean getIsGooglePlayAvailable() {
        return this.isGooglePlayAvailable;
    }

    public String toString() {
        return "DeviceInfo(context=" + this.context + ", clientIdProvider=" + this.clientIdProvider + ", versionProvider=" + this.versionProvider + ", languageProvider=" + this.languageProvider + ", notificationSettings=" + getNotificationSettings() + ", isAutomaticPushSendingEnabled=" + getIsAutomaticPushSendingEnabled() + ", isGooglePlayAvailable=" + getIsGooglePlayAvailable() + ")";
    }

    public String j() {
        if (getIsGooglePlayAvailable()) {
            return "android";
        }
        return "android-huawei";
    }
}
