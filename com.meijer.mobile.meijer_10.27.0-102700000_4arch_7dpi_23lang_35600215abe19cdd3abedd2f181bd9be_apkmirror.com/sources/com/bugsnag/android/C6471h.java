package com.bugsnag.android;

import Q6.ImmutableConfig;
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
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001c\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001.BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b-\u0010\u001cR$\u00102\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010(R\u0014\u00103\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010/R\u0016\u00105\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u0010&\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010/R\u0016\u00106\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u0016\u00107\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010/R\u0016\u00108\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0016\u00109\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0016\u0010:\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/bugsnag/android/h;", "", "Landroid/content/Context;", "appContext", "Landroid/content/pm/PackageManager;", "packageManager", "LQ6/f;", "config", "Lcom/bugsnag/android/O0;", "sessionTracker", "Landroid/app/ActivityManager;", "activityManager", "Lcom/bugsnag/android/r0;", "launchCrashTracker", "Lcom/bugsnag/android/w0;", "memoryTrimState", "<init>", "(Landroid/content/Context;Landroid/content/pm/PackageManager;LQ6/f;Lcom/bugsnag/android/O0;Landroid/app/ActivityManager;Lcom/bugsnag/android/r0;Lcom/bugsnag/android/w0;)V", "", "", "map", "", "j", "(Ljava/util/Map;)V", "", "i", "()Ljava/lang/Boolean;", "g", "()Ljava/lang/String;", "c", "Lcom/bugsnag/android/c;", "d", "()Lcom/bugsnag/android/c;", "Lcom/bugsnag/android/i;", "e", "()Lcom/bugsnag/android/i;", "f", "()Ljava/util/Map;", "binaryArch", "k", "(Ljava/lang/String;)V", "inForeground", "", "b", "(Ljava/lang/Boolean;)Ljava/lang/Long;", "h", "a", "Ljava/lang/String;", "getCodeBundleId", "setCodeBundleId", "codeBundleId", "packageName", "Ljava/lang/Boolean;", "bgWorkRestricted", "appName", "processName", "releaseStage", "versionName", "installerPackage", "Landroid/content/pm/PackageManager;", "LQ6/f;", "l", "Lcom/bugsnag/android/O0;", "m", "Landroid/app/ActivityManager;", "n", "Lcom/bugsnag/android/r0;", "o", "Lcom/bugsnag/android/w0;", "q", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6471h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String codeBundleId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Boolean bgWorkRestricted;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String binaryArch;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String appName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String processName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String releaseStage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String versionName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String installerPackage;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final PackageManager packageManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final O0 sessionTracker;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ActivityManager activityManager;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final C6491r0 launchCrashTracker;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C6501w0 memoryTrimState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name */
    private static final long f63438p = SystemClock.elapsedRealtime();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/h$a;", "", "<init>", "()V", "", "a", "()J", "startTimeMs", "J", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return SystemClock.elapsedRealtime() - b();
        }

        public final long b() {
            return C6471h.f63438p;
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
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
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

    public final String h() {
        InstallSourceInfo installSourceInfo;
        try {
            if (Build.VERSION.SDK_INT < 30) {
                PackageManager packageManager = this.packageManager;
                if (packageManager != null) {
                    return packageManager.getInstallerPackageName(this.packageName);
                }
                return null;
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

    private final Boolean i() {
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
        long jI = this.sessionTracker.i();
        long j10 = (!inForeground.booleanValue() || jI == 0) ? 0L : jElapsedRealtime - jI;
        if (j10 > 0) {
            return Long.valueOf(j10);
        }
        return 0L;
    }

    public final C6461c d() {
        return new C6461c(this.config, this.binaryArch, this.packageName, this.releaseStage, this.versionName, this.codeBundleId);
    }

    public final C6473i e() {
        Boolean boolJ = this.sessionTracker.j();
        return new C6473i(this.config, this.binaryArch, this.packageName, this.releaseStage, this.versionName, this.codeBundleId, Long.valueOf(INSTANCE.a()), b(boolJ), boolJ, Boolean.valueOf(this.launchCrashTracker.a()));
    }

    public final Map<String, Object> f() {
        HashMap map = new HashMap();
        map.put("name", this.appName);
        map.put("activeScreen", this.sessionTracker.g());
        map.put("lowMemory", Boolean.valueOf(this.memoryTrimState.getIsLowMemory()));
        map.put("memoryTrimLevel", this.memoryTrimState.c());
        j(map);
        Boolean bool = this.bgWorkRestricted;
        if (bool != null) {
            map.put("backgroundWorkRestricted", bool);
        }
        String str = this.processName;
        if (str != null) {
            map.put("processName", str);
        }
        return map;
    }

    public final void k(String binaryArch) {
        this.binaryArch = binaryArch;
    }

    public C6471h(Context context, PackageManager packageManager, ImmutableConfig immutableConfig, O0 o02, ActivityManager activityManager, C6491r0 c6491r0, C6501w0 c6501w0) {
        this.packageManager = packageManager;
        this.config = immutableConfig;
        this.sessionTracker = o02;
        this.activityManager = activityManager;
        this.launchCrashTracker = c6491r0;
        this.memoryTrimState = c6501w0;
        String packageName = context.getPackageName();
        Intrinsics.f(packageName, "appContext.packageName");
        this.packageName = packageName;
        this.bgWorkRestricted = i();
        this.appName = g();
        this.processName = c();
        this.releaseStage = immutableConfig.getReleaseStage();
        String appVersion = immutableConfig.getAppVersion();
        if (appVersion == null) {
            PackageInfo packageInfo = immutableConfig.getPackageInfo();
            if (packageInfo != null) {
                appVersion = packageInfo.versionName;
            } else {
                appVersion = null;
            }
        }
        this.versionName = appVersion;
        this.installerPackage = h();
    }

    private final void j(Map<String, Object> map) {
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
