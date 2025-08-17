package Q6;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.D;
import com.bugsnag.android.F;
import com.bugsnag.android.G;
import com.bugsnag.android.InterfaceC6495t0;
import com.bugsnag.android.K0;
import com.bugsnag.android.Q;
import com.bugsnag.android.U;
import com.bugsnag.android.Y;
import com.bugsnag.android.Y0;
import com.bugsnag.android.b1;
import com.bugsnag.android.e1;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\bO\b\u0086\b\u0018\u00002\u00020\u0001B³\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0017\u0012\u0006\u0010$\u001a\u00020\u0017\u0012\u0006\u0010%\u001a\u00020\u0017\u0012\u0006\u0010&\u001a\u00020\u0017\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0002052\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0010¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\bK\u0010BJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\bL\u0010?J\u0010\u0010M\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bO\u0010PJ\u001a\u0010R\u001a\u00020\u00042\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bT\u0010NR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010JR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010W\u001a\u0004\b^\u0010JR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b^\u0010c\u001a\u0004\bd\u0010eR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bf\u0010c\u001a\u0004\bg\u0010eR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\bh\u0010c\u001a\u0004\bi\u0010eR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bd\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8\u0006¢\u0006\f\n\u0004\b[\u0010j\u001a\u0004\bm\u0010lR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010U\u001a\u0004\bn\u0010NR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010U\u001a\u0004\bf\u0010NR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010U\u001a\u0004\b]\u0010NR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010U\u001a\u0004\bY\u0010NR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bh\u0010wR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bo\u0010zR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010W\u001a\u0004\b|\u0010JR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b}\u0010>\u001a\u0004\bp\u0010~R\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\bt\u0010\u0081\u0001R\u0017\u0010#\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b|\u0010A\u001a\u0004\bu\u0010PR\u0018\u0010$\u001a\u00020\u00178\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010A\u001a\u0004\bx\u0010PR\u0017\u0010%\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bi\u0010A\u001a\u0004\b{\u0010PR\u0018\u0010&\u001a\u00020\u00178\u0006¢\u0006\r\n\u0005\b\u0083\u0001\u0010A\u001a\u0004\b}\u0010PR \u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0006¢\u0006\u000f\n\u0005\bn\u0010\u0084\u0001\u001a\u0006\b\u0082\u0001\u0010\u0085\u0001R\u0019\u0010*\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010W\u001a\u0005\b\u0086\u0001\u0010JR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\b_\u0010JR\u001b\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000e\n\u0005\b:\u0010\u0087\u0001\u001a\u0005\b\u007f\u0010\u0088\u0001R\u001b\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000e\n\u0005\bm\u0010\u0089\u0001\u001a\u0005\bV\u0010\u008a\u0001R\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\r\n\u0004\br\u0010c\u001a\u0005\b\u0083\u0001\u0010e¨\u0006\u008b\u0001"}, d2 = {"LQ6/f;", "", "", "apiKey", "", "autoDetectErrors", "Lcom/bugsnag/android/U;", "enabledErrorTypes", "autoTrackSessions", "Lcom/bugsnag/android/b1;", "sendThreads", "", "discardClasses", "enabledReleaseStages", "projectPackages", "", "Lcom/bugsnag/android/BreadcrumbType;", "enabledBreadcrumbTypes", "Lcom/bugsnag/android/Y0;", "telemetry", "releaseStage", "buildUuid", "appVersion", "", "versionCode", "appType", "Lcom/bugsnag/android/D;", "delivery", "Lcom/bugsnag/android/Q;", "endpoints", "persistUser", "", "launchDurationMillis", "Lcom/bugsnag/android/t0;", "logger", "maxBreadcrumbs", "maxPersistedEvents", "maxPersistedSessions", "maxReportedThreads", "Lkotlin/Lazy;", "Ljava/io/File;", "persistenceDirectory", "sendLaunchCrashesSynchronously", "attemptDeliveryOnCrash", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/ApplicationInfo;", "appInfo", "redactedKeys", "<init>", "(Ljava/lang/String;ZLcom/bugsnag/android/U;ZLcom/bugsnag/android/b1;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/bugsnag/android/D;Lcom/bugsnag/android/Q;ZJLcom/bugsnag/android/t0;IIIILkotlin/Lazy;ZZLandroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Ljava/util/Collection;)V", "Lcom/bugsnag/android/Y;", "payload", "Lcom/bugsnag/android/G;", "m", "(Lcom/bugsnag/android/Y;)Lcom/bugsnag/android/G;", "Lcom/bugsnag/android/K0;", "session", "B", "(Lcom/bugsnag/android/K0;)Lcom/bugsnag/android/G;", "", "exc", "J", "(Ljava/lang/Throwable;)Z", "errorClass", "I", "(Ljava/lang/String;)Z", "autoCaptured", "K", "(Z)Z", "type", "E", "(Lcom/bugsnag/android/BreadcrumbType;)Z", "H", "()Z", "F", "G", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "getAutoDetectErrors", "c", "Lcom/bugsnag/android/U;", "j", "()Lcom/bugsnag/android/U;", "d", "f", "e", "Lcom/bugsnag/android/b1;", "A", "()Lcom/bugsnag/android/b1;", "Ljava/util/Collection;", "i", "()Ljava/util/Collection;", "g", "k", "h", "w", "Ljava/util/Set;", "getEnabledBreadcrumbTypes", "()Ljava/util/Set;", "C", "y", "l", "n", "Ljava/lang/Integer;", "D", "()Ljava/lang/Integer;", "o", "p", "Lcom/bugsnag/android/D;", "()Lcom/bugsnag/android/D;", "q", "Lcom/bugsnag/android/Q;", "()Lcom/bugsnag/android/Q;", "r", "u", "s", "()J", "t", "Lcom/bugsnag/android/t0;", "()Lcom/bugsnag/android/t0;", "v", "x", "Lkotlin/Lazy;", "()Lkotlin/Lazy;", "z", "Landroid/content/pm/PackageInfo;", "()Landroid/content/pm/PackageInfo;", "Landroid/content/pm/ApplicationInfo;", "()Landroid/content/pm/ApplicationInfo;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: Q6.f, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ImmutableConfig {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean attemptDeliveryOnCrash;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final PackageInfo packageInfo;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApplicationInfo appInfo;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<String> redactedKeys;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoDetectErrors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final U enabledErrorTypes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoTrackSessions;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b1 sendThreads;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<String> discardClasses;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<String> enabledReleaseStages;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<String> projectPackages;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<BreadcrumbType> enabledBreadcrumbTypes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<Y0> telemetry;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String releaseStage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildUuid;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersion;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer versionCode;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appType;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final D delivery;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final Q endpoints;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean persistUser;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long launchDurationMillis;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6495t0 logger;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxBreadcrumbs;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxPersistedEvents;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxPersistedSessions;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxReportedThreads;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final Lazy<File> persistenceDirectory;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sendLaunchCrashesSynchronously;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableConfig(String str, boolean z10, U u10, boolean z11, b1 b1Var, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, Set<? extends BreadcrumbType> set, Set<? extends Y0> set2, String str2, String str3, String str4, Integer num, String str5, D d10, Q q10, boolean z12, long j10, InterfaceC6495t0 interfaceC6495t0, int i10, int i11, int i12, int i13, Lazy<? extends File> lazy, boolean z13, boolean z14, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection<String> collection4) {
        this.apiKey = str;
        this.autoDetectErrors = z10;
        this.enabledErrorTypes = u10;
        this.autoTrackSessions = z11;
        this.sendThreads = b1Var;
        this.discardClasses = collection;
        this.enabledReleaseStages = collection2;
        this.projectPackages = collection3;
        this.enabledBreadcrumbTypes = set;
        this.telemetry = set2;
        this.releaseStage = str2;
        this.buildUuid = str3;
        this.appVersion = str4;
        this.versionCode = num;
        this.appType = str5;
        this.delivery = d10;
        this.endpoints = q10;
        this.persistUser = z12;
        this.launchDurationMillis = j10;
        this.logger = interfaceC6495t0;
        this.maxBreadcrumbs = i10;
        this.maxPersistedEvents = i11;
        this.maxPersistedSessions = i12;
        this.maxReportedThreads = i13;
        this.persistenceDirectory = lazy;
        this.sendLaunchCrashesSynchronously = z13;
        this.attemptDeliveryOnCrash = z14;
        this.packageInfo = packageInfo;
        this.appInfo = applicationInfo;
        this.redactedKeys = collection4;
    }

    /* renamed from: A, reason: from getter */
    public final b1 getSendThreads() {
        return this.sendThreads;
    }

    @JvmName
    public final G B(K0 session) {
        String sessions = this.endpoints.getSessions();
        String strB = session.b();
        Intrinsics.f(strB, "session.apiKey");
        return new G(sessions, F.d(strB));
    }

    public final Set<Y0> C() {
        return this.telemetry;
    }

    /* renamed from: D, reason: from getter */
    public final Integer getVersionCode() {
        return this.versionCode;
    }

    public final boolean E(BreadcrumbType type) {
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        return (set == null || set.contains(type)) ? false : true;
    }

    public final boolean F(String errorClass) {
        return CollectionsKt.h0(this.discardClasses, errorClass);
    }

    public final boolean H() {
        Collection<String> collection = this.enabledReleaseStages;
        return (collection == null || CollectionsKt.h0(collection, this.releaseStage)) ? false : true;
    }

    /* renamed from: a, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: b, reason: from getter */
    public final ApplicationInfo getAppInfo() {
        return this.appInfo;
    }

    /* renamed from: c, reason: from getter */
    public final String getAppType() {
        return this.appType;
    }

    /* renamed from: d, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getAttemptDeliveryOnCrash() {
        return this.attemptDeliveryOnCrash;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImmutableConfig)) {
            return false;
        }
        ImmutableConfig immutableConfig = (ImmutableConfig) other;
        return Intrinsics.e(this.apiKey, immutableConfig.apiKey) && this.autoDetectErrors == immutableConfig.autoDetectErrors && Intrinsics.e(this.enabledErrorTypes, immutableConfig.enabledErrorTypes) && this.autoTrackSessions == immutableConfig.autoTrackSessions && Intrinsics.e(this.sendThreads, immutableConfig.sendThreads) && Intrinsics.e(this.discardClasses, immutableConfig.discardClasses) && Intrinsics.e(this.enabledReleaseStages, immutableConfig.enabledReleaseStages) && Intrinsics.e(this.projectPackages, immutableConfig.projectPackages) && Intrinsics.e(this.enabledBreadcrumbTypes, immutableConfig.enabledBreadcrumbTypes) && Intrinsics.e(this.telemetry, immutableConfig.telemetry) && Intrinsics.e(this.releaseStage, immutableConfig.releaseStage) && Intrinsics.e(this.buildUuid, immutableConfig.buildUuid) && Intrinsics.e(this.appVersion, immutableConfig.appVersion) && Intrinsics.e(this.versionCode, immutableConfig.versionCode) && Intrinsics.e(this.appType, immutableConfig.appType) && Intrinsics.e(this.delivery, immutableConfig.delivery) && Intrinsics.e(this.endpoints, immutableConfig.endpoints) && this.persistUser == immutableConfig.persistUser && this.launchDurationMillis == immutableConfig.launchDurationMillis && Intrinsics.e(this.logger, immutableConfig.logger) && this.maxBreadcrumbs == immutableConfig.maxBreadcrumbs && this.maxPersistedEvents == immutableConfig.maxPersistedEvents && this.maxPersistedSessions == immutableConfig.maxPersistedSessions && this.maxReportedThreads == immutableConfig.maxReportedThreads && Intrinsics.e(this.persistenceDirectory, immutableConfig.persistenceDirectory) && this.sendLaunchCrashesSynchronously == immutableConfig.sendLaunchCrashesSynchronously && this.attemptDeliveryOnCrash == immutableConfig.attemptDeliveryOnCrash && Intrinsics.e(this.packageInfo, immutableConfig.packageInfo) && Intrinsics.e(this.appInfo, immutableConfig.appInfo) && Intrinsics.e(this.redactedKeys, immutableConfig.redactedKeys);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getAutoTrackSessions() {
        return this.autoTrackSessions;
    }

    /* renamed from: g, reason: from getter */
    public final String getBuildUuid() {
        return this.buildUuid;
    }

    /* renamed from: h, reason: from getter */
    public final D getDelivery() {
        return this.delivery;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.apiKey;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z10 = this.autoDetectErrors;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        U u10 = this.enabledErrorTypes;
        int iHashCode2 = (i11 + (u10 != null ? u10.hashCode() : 0)) * 31;
        boolean z11 = this.autoTrackSessions;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode2 + i12) * 31;
        b1 b1Var = this.sendThreads;
        int iHashCode3 = (i13 + (b1Var != null ? b1Var.hashCode() : 0)) * 31;
        Collection<String> collection = this.discardClasses;
        int iHashCode4 = (iHashCode3 + (collection != null ? collection.hashCode() : 0)) * 31;
        Collection<String> collection2 = this.enabledReleaseStages;
        int iHashCode5 = (iHashCode4 + (collection2 != null ? collection2.hashCode() : 0)) * 31;
        Collection<String> collection3 = this.projectPackages;
        int iHashCode6 = (iHashCode5 + (collection3 != null ? collection3.hashCode() : 0)) * 31;
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        int iHashCode7 = (iHashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        Set<Y0> set2 = this.telemetry;
        int iHashCode8 = (iHashCode7 + (set2 != null ? set2.hashCode() : 0)) * 31;
        String str2 = this.releaseStage;
        int iHashCode9 = (iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buildUuid;
        int iHashCode10 = (iHashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.appVersion;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.versionCode;
        int iHashCode12 = (iHashCode11 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.appType;
        int iHashCode13 = (iHashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31;
        D d10 = this.delivery;
        int iHashCode14 = (iHashCode13 + (d10 != null ? d10.hashCode() : 0)) * 31;
        Q q10 = this.endpoints;
        int iHashCode15 = (iHashCode14 + (q10 != null ? q10.hashCode() : 0)) * 31;
        boolean z12 = this.persistUser;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        long j10 = this.launchDurationMillis;
        int i15 = (((iHashCode15 + i14) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        InterfaceC6495t0 interfaceC6495t0 = this.logger;
        int iHashCode16 = (((((((((i15 + (interfaceC6495t0 != null ? interfaceC6495t0.hashCode() : 0)) * 31) + this.maxBreadcrumbs) * 31) + this.maxPersistedEvents) * 31) + this.maxPersistedSessions) * 31) + this.maxReportedThreads) * 31;
        Lazy<File> lazy = this.persistenceDirectory;
        int iHashCode17 = (iHashCode16 + (lazy != null ? lazy.hashCode() : 0)) * 31;
        boolean z13 = this.sendLaunchCrashesSynchronously;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (iHashCode17 + i16) * 31;
        boolean z14 = this.attemptDeliveryOnCrash;
        int i18 = (i17 + (z14 ? 1 : z14 ? 1 : 0)) * 31;
        PackageInfo packageInfo = this.packageInfo;
        int iHashCode18 = (i18 + (packageInfo != null ? packageInfo.hashCode() : 0)) * 31;
        ApplicationInfo applicationInfo = this.appInfo;
        int iHashCode19 = (iHashCode18 + (applicationInfo != null ? applicationInfo.hashCode() : 0)) * 31;
        Collection<String> collection4 = this.redactedKeys;
        return iHashCode19 + (collection4 != null ? collection4.hashCode() : 0);
    }

    public final Collection<String> i() {
        return this.discardClasses;
    }

    /* renamed from: j, reason: from getter */
    public final U getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    public final Collection<String> k() {
        return this.enabledReleaseStages;
    }

    /* renamed from: l, reason: from getter */
    public final Q getEndpoints() {
        return this.endpoints;
    }

    @JvmName
    public final G m(Y payload) {
        return new G(this.endpoints.getNotify(), F.b(payload));
    }

    /* renamed from: n, reason: from getter */
    public final long getLaunchDurationMillis() {
        return this.launchDurationMillis;
    }

    /* renamed from: o, reason: from getter */
    public final InterfaceC6495t0 getLogger() {
        return this.logger;
    }

    /* renamed from: p, reason: from getter */
    public final int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    /* renamed from: q, reason: from getter */
    public final int getMaxPersistedEvents() {
        return this.maxPersistedEvents;
    }

    /* renamed from: r, reason: from getter */
    public final int getMaxPersistedSessions() {
        return this.maxPersistedSessions;
    }

    /* renamed from: s, reason: from getter */
    public final int getMaxReportedThreads() {
        return this.maxReportedThreads;
    }

    /* renamed from: t, reason: from getter */
    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    public String toString() {
        return "ImmutableConfig(apiKey=" + this.apiKey + ", autoDetectErrors=" + this.autoDetectErrors + ", enabledErrorTypes=" + this.enabledErrorTypes + ", autoTrackSessions=" + this.autoTrackSessions + ", sendThreads=" + this.sendThreads + ", discardClasses=" + this.discardClasses + ", enabledReleaseStages=" + this.enabledReleaseStages + ", projectPackages=" + this.projectPackages + ", enabledBreadcrumbTypes=" + this.enabledBreadcrumbTypes + ", telemetry=" + this.telemetry + ", releaseStage=" + this.releaseStage + ", buildUuid=" + this.buildUuid + ", appVersion=" + this.appVersion + ", versionCode=" + this.versionCode + ", appType=" + this.appType + ", delivery=" + this.delivery + ", endpoints=" + this.endpoints + ", persistUser=" + this.persistUser + ", launchDurationMillis=" + this.launchDurationMillis + ", logger=" + this.logger + ", maxBreadcrumbs=" + this.maxBreadcrumbs + ", maxPersistedEvents=" + this.maxPersistedEvents + ", maxPersistedSessions=" + this.maxPersistedSessions + ", maxReportedThreads=" + this.maxReportedThreads + ", persistenceDirectory=" + this.persistenceDirectory + ", sendLaunchCrashesSynchronously=" + this.sendLaunchCrashesSynchronously + ", attemptDeliveryOnCrash=" + this.attemptDeliveryOnCrash + ", packageInfo=" + this.packageInfo + ", appInfo=" + this.appInfo + ", redactedKeys=" + this.redactedKeys + ")";
    }

    /* renamed from: u, reason: from getter */
    public final boolean getPersistUser() {
        return this.persistUser;
    }

    public final Lazy<File> v() {
        return this.persistenceDirectory;
    }

    public final Collection<String> w() {
        return this.projectPackages;
    }

    public final Collection<String> x() {
        return this.redactedKeys;
    }

    /* renamed from: y, reason: from getter */
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getSendLaunchCrashesSynchronously() {
        return this.sendLaunchCrashesSynchronously;
    }

    public final boolean G(Throwable exc) {
        List<Throwable> listA = e1.a(exc);
        if ((listA instanceof Collection) && listA.isEmpty()) {
            return false;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (F(((Throwable) it.next()).getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(String errorClass) {
        if (!H() && !F(errorClass)) {
            return false;
        }
        return true;
    }

    public final boolean J(Throwable exc) {
        if (!H() && !G(exc)) {
            return false;
        }
        return true;
    }

    public final boolean K(boolean autoCaptured) {
        if (!H()) {
            if (!autoCaptured || this.autoTrackSessions) {
                return false;
            }
            return true;
        }
        return true;
    }
}
