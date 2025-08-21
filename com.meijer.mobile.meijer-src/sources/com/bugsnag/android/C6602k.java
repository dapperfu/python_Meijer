package com.bugsnag.android;

import R6.ImmutableConfig;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.radiusnetworks.flybuy.sdk.data.order.OrderState;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001/BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b.\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00105R$\u00109\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00106\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010)R\u0014\u0010:\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00106R\u0016\u0010<\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010;R\u0018\u0010'\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00106R\u0016\u0010=\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0016\u0010>\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00106R\u0016\u0010@\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010B\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00106R\u0016\u0010D\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106¨\u0006F"}, d2 = {"Lcom/bugsnag/android/k;", "", "Landroid/content/Context;", "appContext", "Landroid/content/pm/PackageManager;", "packageManager", "LR6/k;", "config", "Lcom/bugsnag/android/Z0;", "sessionTracker", "Landroid/app/ActivityManager;", "activityManager", "Lcom/bugsnag/android/B0;", "launchCrashTracker", "Lcom/bugsnag/android/G0;", "memoryTrimState", "<init>", "(Landroid/content/Context;Landroid/content/pm/PackageManager;LR6/k;Lcom/bugsnag/android/Z0;Landroid/app/ActivityManager;Lcom/bugsnag/android/B0;Lcom/bugsnag/android/G0;)V", "", "i", "()Ljava/lang/String;", "", "map", "", "k", "(Ljava/util/Map;)V", "", "j", "()Ljava/lang/Boolean;", "g", "c", "Lcom/bugsnag/android/f;", "d", "()Lcom/bugsnag/android/f;", "Lcom/bugsnag/android/l;", "e", "()Lcom/bugsnag/android/l;", "f", "()Ljava/util/Map;", "binaryArch", "l", "(Ljava/lang/String;)V", "inForeground", "", "b", "(Ljava/lang/Boolean;)Ljava/lang/Long;", "h", "a", "Landroid/content/pm/PackageManager;", "LR6/k;", "Lcom/bugsnag/android/Z0;", "Landroid/app/ActivityManager;", "Lcom/bugsnag/android/B0;", "Lcom/bugsnag/android/G0;", "Ljava/lang/String;", "getCodeBundleId", "setCodeBundleId", "codeBundleId", "packageName", "Ljava/lang/Boolean;", "bgWorkRestricted", "appName", "processName", "m", "releaseStage", "n", "versionName", "o", "installerPackage", "p", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6602k {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: q, reason: collision with root package name */
    private static final long f64253q = SystemClock.elapsedRealtime();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PackageManager packageManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Z0 sessionTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ActivityManager activityManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final B0 launchCrashTracker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final G0 memoryTrimState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String codeBundleId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String binaryArch;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String releaseStage;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String versionName;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String installerPackage;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Boolean bgWorkRestricted = j();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String appName = g();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String processName = c();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/k$a;", "", "<init>", "()V", "", "a", "()J", "startTimeMs", "J", "b", "", "IMPORTANCE_CANT_SAVE_STATE_PRE_26", "I", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return SystemClock.elapsedRealtime() - b();
        }

        public final long b() {
            return C6602k.f64253q;
        }
    }

    @SuppressLint({"PrivateApi"})
    private final String c() {
        Object objB;
        String processName;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
            } else {
                Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null).invoke(null, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                processName = (String) objInvoke;
            }
            objB = Result.b(processName);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return (String) (Result.g(objB) ? null : objB);
    }

    @SuppressLint({"SwitchIntDef"})
    private final String i() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        String str = null;
        try {
            runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Exception unused) {
            return str;
        }
        if (runningAppProcessInfo.pid == 0) {
            return null;
        }
        int i10 = runningAppProcessInfo.importance;
        if (i10 == 1) {
            return "provider in use";
        }
        if (i10 == 2) {
            return "service in use";
        }
        switch (i10) {
            case HttpResponseStatus.INFORMATIONAL_CONTINUE /* 100 */:
                return "foreground";
            case 125:
                return "foreground service";
            case 130:
                return "perceptible";
            case BinsView.TOTE_WIDTH_DP /* 150 */:
                return "top sleeping";
            case 170:
                return "can't save state";
            case HttpResponseStatus.SUCCESS_OK /* 200 */:
                return "visible";
            case 230:
                return "perceptible";
            case HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES /* 300 */:
                return "service";
            case 325:
                return "top sleeping";
            case 350:
                return "can't save state";
            case HttpResponseStatus.ERROR_BAD_REQUEST /* 400 */:
                return "cached/background";
            case HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR /* 500 */:
                return "empty";
            case 1000:
                return OrderState.GONE;
            default:
                str = "unknown importance (" + runningAppProcessInfo.importance + ')';
                return str;
        }
        return str;
    }

    public final String h() {
        InstallSourceInfo installSourceInfo;
        try {
            if (Build.VERSION.SDK_INT < 30) {
                PackageManager packageManager = this.packageManager;
                if (packageManager == null) {
                    return null;
                }
                return packageManager.getInstallerPackageName(this.packageName);
            }
            PackageManager packageManager2 = this.packageManager;
            if (packageManager2 == null || (installSourceInfo = packageManager2.getInstallSourceInfo(this.packageName)) == null) {
                return null;
            }
            return installSourceInfo.getInstallingPackageName();
        } catch (Exception unused) {
            return null;
        }
    }

    private final String g() {
        ApplicationInfo appInfo = this.config.getAppInfo();
        PackageManager packageManager = this.packageManager;
        if (packageManager == null || appInfo == null) {
            return null;
        }
        return packageManager.getApplicationLabel(appInfo).toString();
    }

    private final Boolean j() {
        ActivityManager activityManager = this.activityManager;
        if (activityManager == null || Build.VERSION.SDK_INT < 28 || !activityManager.isBackgroundRestricted()) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final Long b(Boolean inForeground) {
        if (inForeground == null) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.sessionTracker.j();
        long j11 = (!inForeground.booleanValue() || j10 == 0) ? 0L : jElapsedRealtime - j10;
        if (j11 > 0) {
            return Long.valueOf(j11);
        }
        return 0L;
    }

    public final C6592f d() {
        return new C6592f(this.config, this.binaryArch, this.packageName, this.releaseStage, this.versionName, this.codeBundleId);
    }

    public final C6604l e() {
        boolean zK = this.sessionTracker.k();
        return new C6604l(this.config, this.binaryArch, this.packageName, this.releaseStage, this.versionName, this.codeBundleId, Long.valueOf(INSTANCE.a()), b(Boolean.valueOf(zK)), Boolean.valueOf(zK), Boolean.valueOf(this.launchCrashTracker.d()));
    }

    public final Map<String, Object> f() {
        HashMap map = new HashMap();
        map.put("name", this.appName);
        map.put("activeScreen", this.sessionTracker.h());
        map.put("lowMemory", Boolean.valueOf(this.memoryTrimState.getIsLowMemory()));
        map.put("memoryTrimLevel", this.memoryTrimState.e());
        map.put("processImportance", i());
        k(map);
        Boolean bool = this.bgWorkRestricted;
        if (bool != null) {
            map.put("backgroundWorkRestricted", bool);
        }
        String str = this.processName;
        if (str == null) {
            return map;
        }
        map.put("processName", str);
        return map;
    }

    public final void l(String binaryArch) {
        this.binaryArch = binaryArch;
    }

    public C6602k(Context context, PackageManager packageManager, ImmutableConfig immutableConfig, Z0 z02, ActivityManager activityManager, B0 b02, G0 g02) {
        this.packageManager = packageManager;
        this.config = immutableConfig;
        this.sessionTracker = z02;
        this.activityManager = activityManager;
        this.launchCrashTracker = b02;
        this.memoryTrimState = g02;
        this.packageName = context.getPackageName();
        this.releaseStage = immutableConfig.getReleaseStage();
        String appVersion = immutableConfig.getAppVersion();
        if (appVersion == null) {
            PackageInfo packageInfo = immutableConfig.getPackageInfo();
            if (packageInfo == null) {
                appVersion = null;
            } else {
                appVersion = packageInfo.versionName;
            }
        }
        this.versionName = appVersion;
        this.installerPackage = h();
    }

    private final void k(Map<String, Object> map) {
        Runtime runtime = Runtime.getRuntime();
        long j10 = runtime.totalMemory();
        long jFreeMemory = runtime.freeMemory();
        map.put("memoryUsage", Long.valueOf(j10 - jFreeMemory));
        map.put("totalMemory", Long.valueOf(j10));
        map.put("freeMemory", Long.valueOf(jFreeMemory));
        map.put("memoryLimit", Long.valueOf(runtime.maxMemory()));
        map.put("installerPackage", this.installerPackage);
    }
}
