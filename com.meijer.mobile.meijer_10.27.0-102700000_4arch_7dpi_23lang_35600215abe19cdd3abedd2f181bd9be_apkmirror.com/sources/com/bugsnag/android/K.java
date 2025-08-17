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
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\u00020 2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010$J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b*\u0010$J\u0019\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u0002052\u0006\u00104\u001a\u00020,¢\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000108¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0;¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020,H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010,¢\u0006\u0004\b@\u00100J\u0011\u0010A\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\bA\u0010$J\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u001bH\u0000¢\u0006\u0004\bC\u0010DR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010MR\u0016\u0010P\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010OR\u0016\u0010R\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010QR\u0014\u0010S\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010TR\"\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010VR\u001c\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010XR\u001e\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010XR\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\\R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010_R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010QR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010`R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010aR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010c¨\u0006d"}, d2 = {"Lcom/bugsnag/android/K;", "", "Lcom/bugsnag/android/v;", "connectivity", "Landroid/content/Context;", "appContext", "Landroid/content/res/Resources;", "resources", "", "deviceId", "internalDeviceId", "Lcom/bugsnag/android/J;", "buildInfo", "Ljava/io/File;", "dataDirectory", "Lcom/bugsnag/android/RootDetector;", "rootDetector", "LQ6/a;", "bgTaskService", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Lcom/bugsnag/android/v;Landroid/content/Context;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/J;Ljava/io/File;Lcom/bugsnag/android/RootDetector;LQ6/a;Lcom/bugsnag/android/t0;)V", "", "f", "()Z", "q", "", "o", "()Ljava/lang/Integer;", "", "into", "", "s", "(Ljava/util/Map;)V", "k", "()Ljava/lang/String;", "r", "l", "", "n", "()Ljava/lang/Float;", "p", "Ljava/util/concurrent/Future;", "", "t", "()Ljava/util/concurrent/Future;", "e", "()Ljava/lang/Long;", "Lcom/bugsnag/android/I;", "g", "()Lcom/bugsnag/android/I;", "now", "Lcom/bugsnag/android/P;", "h", "(J)Lcom/bugsnag/android/P;", "", "j", "()Ljava/util/Map;", "", "i", "()[Ljava/lang/String;", "c", "()J", "d", "m", "newOrientation", "u", "(I)Z", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "a", "Landroid/util/DisplayMetrics;", "displayMetrics", "b", "Z", "emulator", "Ljava/lang/Float;", "screenDensity", "Ljava/lang/Integer;", "dpi", "Ljava/lang/String;", "screenResolution", "locale", "[Ljava/lang/String;", "cpuAbi", "Ljava/util/Map;", "runtimeVersions", "Ljava/util/concurrent/Future;", "rootedFuture", "totalMemoryFuture", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "orientation", "Lcom/bugsnag/android/v;", "Landroid/content/Context;", "Lcom/bugsnag/android/J;", "Ljava/io/File;", "LQ6/a;", "Lcom/bugsnag/android/t0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DisplayMetrics displayMetrics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean emulator = q();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Float screenDensity = n();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer dpi = o();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String screenResolution = p();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String locale;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String[] cpuAbi;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Map<String, Object> runtimeVersions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Future<Boolean> rootedFuture;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Future<Long> totalMemoryFuture;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private AtomicInteger orientation;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6498v connectivity;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String deviceId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String internalDeviceId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final J buildInfo;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final File dataDirectory;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Q6.a bgTaskService;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class a<V> implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RootDetector f63127a;

        a(RootDetector rootDetector) {
            this.f63127a = rootDetector;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean call() {
            return Boolean.valueOf(this.f63127a.g());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 4, 2})
    static final class b<V> implements Callable<Long> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long call() {
            return Long.valueOf(K.this.dataDirectory.getUsableSpace());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 4, 2})
    static final class c<V> implements Callable<Long> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long call() {
            return K.this.e();
        }
    }

    private final boolean f() throws ExecutionException, InterruptedException {
        try {
            Future<Boolean> future = this.rootedFuture;
            if (future == null) {
                return false;
            }
            Boolean bool = future.get();
            Intrinsics.f(bool, "rootedFuture.get()");
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final Long d() {
        Long lValueOf;
        try {
            ActivityManager activityManagerA = C6504y.a(this.appContext);
            if (activityManagerA != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManagerA.getMemoryInfo(memoryInfo);
                lValueOf = Long.valueOf(memoryInfo.availMem);
            } else {
                lValueOf = null;
            }
            return lValueOf != null ? lValueOf : (Long) Process.class.getDeclaredMethod("getFreeMemory", null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long e() {
        Long lValueOf;
        Object objB;
        ActivityManager activityManagerA = C6504y.a(this.appContext);
        if (activityManagerA != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerA.getMemoryInfo(memoryInfo);
            lValueOf = Long.valueOf(memoryInfo.totalMem);
        } else {
            lValueOf = null;
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

    private final String l() {
        return this.connectivity.c();
    }

    private final Float n() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            return Float.valueOf(displayMetrics.density);
        }
        return null;
    }

    private final Integer o() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            return Integer.valueOf(displayMetrics.densityDpi);
        }
        return null;
    }

    private final String p() {
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

    private final boolean q() {
        String fingerprint = this.buildInfo.getFingerprint();
        return fingerprint != null && (StringsKt.W(fingerprint, zzbz.UNKNOWN_CONTENT_TYPE, false, 2, null) || StringsKt.c0(fingerprint, "generic", false, 2, null) || StringsKt.c0(fingerprint, "vbox", false, 2, null));
    }

    private final boolean r() {
        if (Build.VERSION.SDK_INT >= 31) {
            LocationManager locationManagerC = C6504y.c(this.appContext);
            return locationManagerC != null && locationManagerC.isLocationEnabled();
        }
        String string = Settings.Secure.getString(this.appContext.getContentResolver(), "location_providers_allowed");
        return string != null && string.length() > 0;
    }

    private final void s(Map<String, Object> into) {
        try {
            Intent intentE = C6504y.e(this.appContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), this.logger);
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

    private final Future<Long> t() {
        try {
            return this.bgTaskService.d(Q6.n.DEFAULT, new c());
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
            objB = Result.b((Long) this.bgTaskService.d(Q6.n.IO, new b()).get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.g(objB)) {
            objB = 0L;
        }
        return ((Number) objB).longValue();
    }

    public final I g() {
        Object objB;
        J j10 = this.buildInfo;
        String[] strArr = this.cpuAbi;
        Boolean boolValueOf = Boolean.valueOf(f());
        String str = this.deviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(future != null ? future.get() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return new I(j10, strArr, boolValueOf, str, str2, (Long) (Result.g(objB) ? null : objB), MapsKt.D(this.runtimeVersions));
    }

    public final P h(long now) {
        Object objB;
        J j10 = this.buildInfo;
        Boolean boolValueOf = Boolean.valueOf(f());
        String str = this.deviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(future != null ? future.get() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return new P(j10, boolValueOf, str, str2, (Long) (Result.g(objB) ? null : objB), MapsKt.D(this.runtimeVersions), Long.valueOf(c()), d(), m(), new Date(now));
    }

    public final String[] i() {
        String[] cpuAbis = this.buildInfo.getCpuAbis();
        return cpuAbis != null ? cpuAbis : new String[0];
    }

    public final Map<String, Object> j() {
        HashMap map = new HashMap();
        s(map);
        map.put("locationStatus", k());
        map.put("networkAccess", l());
        map.put("brand", this.buildInfo.getBrand());
        map.put("screenDensity", this.screenDensity);
        map.put("dpi", this.dpi);
        map.put("emulator", Boolean.valueOf(this.emulator));
        map.put("screenResolution", this.screenResolution);
        return map;
    }

    public final String m() {
        int i10 = this.orientation.get();
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 != 2) {
            return null;
        }
        return "landscape";
    }

    public final boolean u(int newOrientation) {
        return this.orientation.getAndSet(newOrientation) != newOrientation;
    }

    public K(InterfaceC6498v interfaceC6498v, Context context, Resources resources, String str, String str2, J j10, File file, RootDetector rootDetector, Q6.a aVar, InterfaceC6495t0 interfaceC6495t0) {
        Future<Boolean> futureD;
        this.connectivity = interfaceC6498v;
        this.appContext = context;
        this.deviceId = str;
        this.internalDeviceId = str2;
        this.buildInfo = j10;
        this.dataDirectory = file;
        this.bgTaskService = aVar;
        this.logger = interfaceC6495t0;
        this.displayMetrics = resources.getDisplayMetrics();
        String string = Locale.getDefault().toString();
        Intrinsics.f(string, "Locale.getDefault().toString()");
        this.locale = string;
        this.cpuAbi = i();
        this.totalMemoryFuture = t();
        this.orientation = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer apiLevel = j10.getApiLevel();
        if (apiLevel != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(apiLevel.intValue()));
        }
        String osBuild = j10.getOsBuild();
        if (osBuild != null) {
            linkedHashMap.put("osBuild", osBuild);
        }
        this.runtimeVersions = linkedHashMap;
        try {
            futureD = aVar.d(Q6.n.IO, new a(rootDetector));
        } catch (RejectedExecutionException e10) {
            this.logger.b("Failed to perform root detection checks", e10);
            futureD = null;
        }
        this.rootedFuture = futureD;
    }

    private final String k() {
        try {
            if (r()) {
                return "allowed";
            }
            return "disallowed";
        } catch (Exception unused) {
            this.logger.g("Could not get locationStatus");
            return null;
        }
    }
}
