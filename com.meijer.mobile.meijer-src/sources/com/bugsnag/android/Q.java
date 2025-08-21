package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.bugsnag.android.V;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020 2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010$J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b*\u0010$J\u0019\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u0002052\u0006\u00104\u001a\u00020,¢\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000108¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001e0;¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020,H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010,¢\u0006\u0004\b@\u00100J\u0011\u0010A\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\bA\u0010$J\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u001aH\u0000¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010LR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010MR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010NR\u001c\u0010R\u001a\n P*\u0004\u0018\u00010O0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010QR\u0014\u0010T\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010SR\u0016\u0010V\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010UR\u0016\u0010X\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010WR\u0016\u0010Z\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010YR\u0014\u0010[\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010YR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001e0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\\R\"\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010^R\u001e\u0010a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010`R\u0016\u0010d\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010c¨\u0006e"}, d2 = {"Lcom/bugsnag/android/Q;", "", "Lcom/bugsnag/android/y;", "connectivity", "Landroid/content/Context;", "appContext", "Landroid/content/res/Resources;", "resources", "LS6/d;", "Lcom/bugsnag/android/V$c;", "deviceIdStore", "Lcom/bugsnag/android/N;", "buildInfo", "Ljava/io/File;", "dataDirectory", "", "rootedFuture", "LR6/b;", "bgTaskService", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Lcom/bugsnag/android/y;Landroid/content/Context;Landroid/content/res/Resources;LS6/d;Lcom/bugsnag/android/N;Ljava/io/File;LS6/d;LR6/b;Lcom/bugsnag/android/D0;)V", "g", "()Z", "r", "", "p", "()Ljava/lang/Integer;", "", "", "into", "", "t", "(Ljava/util/Map;)V", "l", "()Ljava/lang/String;", "s", "m", "", "o", "()Ljava/lang/Float;", "q", "Ljava/util/concurrent/Future;", "", "u", "()Ljava/util/concurrent/Future;", "f", "()Ljava/lang/Long;", "Lcom/bugsnag/android/M;", "h", "()Lcom/bugsnag/android/M;", "now", "Lcom/bugsnag/android/W;", "i", "(J)Lcom/bugsnag/android/W;", "", "k", "()Ljava/util/Map;", "", "j", "()[Ljava/lang/String;", "c", "()J", "e", "n", "newOrientation", "w", "(I)Z", "a", "Lcom/bugsnag/android/y;", "b", "Landroid/content/Context;", "LS6/d;", "d", "Lcom/bugsnag/android/N;", "Ljava/io/File;", "LR6/b;", "Lcom/bugsnag/android/D0;", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "Landroid/util/DisplayMetrics;", "displayMetrics", "Z", "emulator", "Ljava/lang/Float;", "screenDensity", "Ljava/lang/Integer;", "dpi", "Ljava/lang/String;", "screenResolution", "locale", "[Ljava/lang/String;", "cpuAbi", "Ljava/util/Map;", "runtimeVersions", "Ljava/util/concurrent/Future;", "totalMemoryFuture", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "orientation", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6629y connectivity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final S6.d<V.DeviceIds> deviceIdStore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final N buildInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final File dataDirectory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final S6.d<Boolean> rootedFuture;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final R6.b bgTaskService;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final DisplayMetrics displayMetrics;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Map<String, Object> runtimeVersions;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private AtomicInteger orientation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean emulator = r();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Float screenDensity = o();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Integer dpi = p();

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String screenResolution = q();

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String locale = Locale.getDefault().toString();

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String[] cpuAbi = j();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Future<Long> totalMemoryFuture = u();

    private final boolean g() {
        try {
            S6.d<Boolean> dVar = this.rootedFuture;
            if (dVar != null) {
                return dVar.get().booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final Long e() {
        Long lValueOf;
        try {
            ActivityManager activityManagerA = B.a(this.appContext);
            if (activityManagerA == null) {
                lValueOf = null;
            } else {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManagerA.getMemoryInfo(memoryInfo);
                lValueOf = Long.valueOf(memoryInfo.availMem);
            }
            return lValueOf != null ? lValueOf : (Long) Process.class.getDeclaredMethod("getFreeMemory", null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long d(Q q10) {
        return Long.valueOf(q10.dataDirectory.getUsableSpace());
    }

    private final Long f() {
        Long lValueOf;
        Object objB;
        ActivityManager activityManagerA = B.a(this.appContext);
        if (activityManagerA == null) {
            lValueOf = null;
        } else {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerA.getMemoryInfo(memoryInfo);
            lValueOf = Long.valueOf(memoryInfo.totalMem);
        }
        if (lValueOf != null) {
            return lValueOf;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b((Long) Process.class.getDeclaredMethod("getTotalMemory", null).invoke(null, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return (Long) (Result.g(objB) ? null : objB);
    }

    private final String m() {
        return this.connectivity.c();
    }

    private final Float o() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics == null) {
            return null;
        }
        return Float.valueOf(displayMetrics.density);
    }

    private final Integer p() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics == null) {
            return null;
        }
        return Integer.valueOf(displayMetrics.densityDpi);
    }

    private final String q() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics == null) {
            return null;
        }
        int iMax = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        DisplayMetrics displayMetrics2 = this.displayMetrics;
        int iMin = Math.min(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iMax);
        sb2.append('x');
        sb2.append(iMin);
        return sb2.toString();
    }

    private final boolean r() {
        String fingerprint = this.buildInfo.getFingerprint();
        return fingerprint != null && (StringsKt.W(fingerprint, zzbz.UNKNOWN_CONTENT_TYPE, false, 2, null) || StringsKt.d0(fingerprint, "generic", false, 2, null) || StringsKt.d0(fingerprint, "vbox", false, 2, null));
    }

    private final boolean s() {
        if (Build.VERSION.SDK_INT >= 31) {
            LocationManager locationManagerC = B.c(this.appContext);
            return locationManagerC != null && locationManagerC.isLocationEnabled();
        }
        String string = Settings.Secure.getString(this.appContext.getContentResolver(), "location_providers_allowed");
        return string != null && string.length() > 0;
    }

    private final void t(Map<String, Object> into) {
        try {
            Intent intentE = B.e(this.appContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), this.logger);
            if (intentE != null) {
                int intExtra = intentE.getIntExtra("level", -1);
                int intExtra2 = intentE.getIntExtra("scale", -1);
                if (intExtra != -1 || intExtra2 != -1) {
                    into.put("batteryLevel", Float.valueOf(intExtra / intExtra2));
                }
                int intExtra3 = intentE.getIntExtra("status", -1);
                into.put("charging", Boolean.valueOf(intExtra3 == 2 || intExtra3 == 5));
            }
        } catch (Exception unused) {
            this.logger.g("Could not get battery status");
        }
    }

    private final Future<Long> u() {
        try {
            return this.bgTaskService.e(R6.t.DEFAULT, new Callable() { // from class: com.bugsnag.android.O
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Q.v(this.f63974a);
                }
            });
        } catch (RejectedExecutionException e10) {
            this.logger.b("Failed to lookup available device memory", e10);
            return null;
        }
    }

    @SuppressLint({"UsableSpace"})
    public final long c() {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b((Long) this.bgTaskService.e(R6.t.IO, new Callable() { // from class: com.bugsnag.android.P
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Q.d(this.f63978a);
                }
            }).get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.g(objB)) {
            objB = 0L;
        }
        return ((Number) objB).longValue();
    }

    public final M h() {
        Object objB;
        N n10 = this.buildInfo;
        String[] strArr = this.cpuAbi;
        Boolean boolValueOf = Boolean.valueOf(g());
        V.DeviceIds deviceIds = this.deviceIdStore.get();
        String deviceId = deviceIds == null ? null : deviceIds.getDeviceId();
        String str = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(future == null ? null : future.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return new M(n10, strArr, boolValueOf, deviceId, str, (Long) (Result.g(objB) ? null : objB), MapsKt.D(this.runtimeVersions));
    }

    public final W i(long now) {
        Object objB;
        N n10 = this.buildInfo;
        Boolean boolValueOf = Boolean.valueOf(g());
        V.DeviceIds deviceIds = this.deviceIdStore.get();
        String deviceId = deviceIds == null ? null : deviceIds.getDeviceId();
        String str = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(future == null ? null : future.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return new W(n10, boolValueOf, deviceId, str, (Long) (Result.g(objB) ? null : objB), MapsKt.D(this.runtimeVersions), Long.valueOf(c()), e(), n(), new Date(now));
    }

    public final String[] j() {
        String[] cpuAbis = this.buildInfo.getCpuAbis();
        return cpuAbis == null ? new String[0] : cpuAbis;
    }

    public final Map<String, Object> k() {
        HashMap map = new HashMap();
        t(map);
        map.put("locationStatus", l());
        map.put("networkAccess", m());
        map.put("brand", this.buildInfo.getBrand());
        map.put("screenDensity", this.screenDensity);
        map.put("dpi", this.dpi);
        map.put("emulator", Boolean.valueOf(this.emulator));
        map.put("screenResolution", this.screenResolution);
        return map;
    }

    public final String n() {
        int i10 = this.orientation.get();
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 != 2) {
            return null;
        }
        return "landscape";
    }

    public final boolean w(int newOrientation) {
        return this.orientation.getAndSet(newOrientation) != newOrientation;
    }

    public Q(InterfaceC6629y interfaceC6629y, Context context, Resources resources, S6.d<V.DeviceIds> dVar, N n10, File file, S6.d<Boolean> dVar2, R6.b bVar, D0 d02) {
        this.connectivity = interfaceC6629y;
        this.appContext = context;
        this.deviceIdStore = dVar;
        this.buildInfo = n10;
        this.dataDirectory = file;
        this.rootedFuture = dVar2;
        this.bgTaskService = bVar;
        this.logger = d02;
        this.displayMetrics = resources.getDisplayMetrics();
        this.orientation = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer apiLevel = n10.getApiLevel();
        if (apiLevel != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(apiLevel.intValue()));
        }
        String osBuild = n10.getOsBuild();
        if (osBuild != null) {
            linkedHashMap.put("osBuild", osBuild);
        }
        this.runtimeVersions = linkedHashMap;
    }

    private final String l() {
        try {
            if (s()) {
                return "allowed";
            }
            return "disallowed";
        } catch (Exception unused) {
            this.logger.g("Could not get locationStatus");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long v(Q q10) {
        return q10.f();
    }
}
