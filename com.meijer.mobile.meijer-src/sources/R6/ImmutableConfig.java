package R6;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.C6583a0;
import com.bugsnag.android.C6591e0;
import com.bugsnag.android.D0;
import com.bugsnag.android.H;
import com.bugsnag.android.J;
import com.bugsnag.android.K;
import com.bugsnag.android.V0;
import com.bugsnag.android.X;
import com.bugsnag.android.j1;
import com.bugsnag.android.m1;
import com.bugsnag.android.o1;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\bT\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020\u0019\u0012\u0006\u0010&\u001a\u00020\u0019\u0012\u0006\u0010'\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020\u0019\u0012\u0006\u0010)\u001a\u00020\u0019\u0012\u0006\u0010*\u001a\u00020!\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0011¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0004¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\bP\u0010GJ\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bQ\u0010DJ\u0010\u0010R\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010W\u001a\u00020\u00042\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010SR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010OR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010OR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\bc\u0010h\u001a\u0004\bi\u0010jR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bk\u0010h\u001a\u0004\bl\u0010jR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\bm\u0010h\u001a\u0004\bn\u0010jR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\bp\u0010qR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\f\n\u0004\b`\u0010o\u001a\u0004\br\u0010qR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010Z\u001a\u0004\bs\u0010SR!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bk\u0010vR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010Z\u001a\u0004\bb\u0010SR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b{\u0010Z\u001a\u0004\b^\u0010SR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bm\u0010~R\u0019\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\bt\u0010\u0081\u0001R\u0019\u0010 \u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\\\u001a\u0005\b\u0083\u0001\u0010OR\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010Q\u001a\u0005\b{\u0010\u0085\u0001R\u001a\u0010$\u001a\u00020#8\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b|\u0010\u0088\u0001R\u0018\u0010%\u001a\u00020\u00198\u0006¢\u0006\r\n\u0005\b\u0089\u0001\u0010P\u001a\u0004\b\u007f\u0010UR\u0019\u0010&\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010P\u001a\u0005\b\u0082\u0001\u0010UR\u0019\u0010'\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010P\u001a\u0005\b\u0084\u0001\u0010UR\u0019\u0010(\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010P\u001a\u0005\b\u0086\u0001\u0010UR\u0018\u0010)\u001a\u00020\u00198\u0006¢\u0006\r\n\u0004\bn\u0010P\u001a\u0005\b\u0089\u0001\u0010UR\u001a\u0010*\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010Q\u001a\u0006\b\u008d\u0001\u0010\u0085\u0001R \u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\u000f\n\u0005\bs\u0010\u008e\u0001\u001a\u0006\b\u008b\u0001\u0010\u008f\u0001R\u0019\u0010.\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\\\u001a\u0005\b\u0090\u0001\u0010OR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\\\u001a\u0004\bd\u0010OR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\\\u001a\u0004\bw\u0010OR\u001c\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0005\br\u0010\u0091\u0001\u001a\u0006\b\u008a\u0001\u0010\u0092\u0001R\u001c\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0093\u0001\u001a\u0005\b[\u0010\u0094\u0001R\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\r\n\u0004\by\u0010h\u001a\u0005\b\u008c\u0001\u0010j¨\u0006\u0095\u0001"}, d2 = {"LR6/k;", "", "", "apiKey", "", "autoDetectErrors", "Lcom/bugsnag/android/a0;", "enabledErrorTypes", "autoTrackSessions", "Lcom/bugsnag/android/m1;", "sendThreads", "", "Ljava/util/regex/Pattern;", "discardClasses", "enabledReleaseStages", "projectPackages", "", "Lcom/bugsnag/android/BreadcrumbType;", "enabledBreadcrumbTypes", "Lcom/bugsnag/android/j1;", "telemetry", "releaseStage", "LS6/d;", "buildUuid", "appVersion", "", "versionCode", "appType", "Lcom/bugsnag/android/H;", "delivery", "Lcom/bugsnag/android/X;", "endpoints", "persistUser", "", "launchDurationMillis", "Lcom/bugsnag/android/D0;", "logger", "maxBreadcrumbs", "maxPersistedEvents", "maxPersistedSessions", "maxReportedThreads", "maxStringValueLength", "threadCollectionTimeLimitMillis", "Lkotlin/Lazy;", "Ljava/io/File;", "persistenceDirectory", "sendLaunchCrashesSynchronously", "attemptDeliveryOnCrash", "generateAnonymousId", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/ApplicationInfo;", "appInfo", "redactedKeys", "<init>", "(Ljava/lang/String;ZLcom/bugsnag/android/a0;ZLcom/bugsnag/android/m1;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;LS6/d;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/bugsnag/android/H;Lcom/bugsnag/android/X;ZJLcom/bugsnag/android/D0;IIIIIJLkotlin/Lazy;ZZZLandroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Ljava/util/Collection;)V", "Lcom/bugsnag/android/e0;", "payload", "Lcom/bugsnag/android/K;", "m", "(Lcom/bugsnag/android/e0;)Lcom/bugsnag/android/K;", "Lcom/bugsnag/android/V0;", "session", "D", "(Lcom/bugsnag/android/V0;)Lcom/bugsnag/android/K;", "", "exc", "M", "(Ljava/lang/Throwable;)Z", "errorClass", "L", "(Ljava/lang/String;)Z", "autoCaptured", "N", "(Z)Z", "type", "H", "(Lcom/bugsnag/android/BreadcrumbType;)Z", "K", "()Z", "I", "J", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "getAutoDetectErrors", "c", "Lcom/bugsnag/android/a0;", "j", "()Lcom/bugsnag/android/a0;", "d", "f", "e", "Lcom/bugsnag/android/m1;", "C", "()Lcom/bugsnag/android/m1;", "Ljava/util/Collection;", "i", "()Ljava/util/Collection;", "g", "k", "h", "y", "Ljava/util/Set;", "getEnabledBreadcrumbTypes", "()Ljava/util/Set;", "E", "A", "l", "LS6/d;", "()LS6/d;", "n", "Ljava/lang/Integer;", "G", "()Ljava/lang/Integer;", "o", "p", "Lcom/bugsnag/android/H;", "()Lcom/bugsnag/android/H;", "q", "Lcom/bugsnag/android/X;", "()Lcom/bugsnag/android/X;", "r", "w", "s", "()J", "t", "Lcom/bugsnag/android/D0;", "()Lcom/bugsnag/android/D0;", "u", "v", "x", "z", "F", "Lkotlin/Lazy;", "()Lkotlin/Lazy;", "B", "Landroid/content/pm/PackageInfo;", "()Landroid/content/pm/PackageInfo;", "Landroid/content/pm/ApplicationInfo;", "()Landroid/content/pm/ApplicationInfo;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: R6.k, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ImmutableConfig {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final Lazy<File> persistenceDirectory;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sendLaunchCrashesSynchronously;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean attemptDeliveryOnCrash;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean generateAnonymousId;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final PackageInfo packageInfo;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApplicationInfo appInfo;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<Pattern> redactedKeys;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoDetectErrors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C6583a0 enabledErrorTypes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoTrackSessions;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final m1 sendThreads;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<Pattern> discardClasses;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<String> enabledReleaseStages;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<String> projectPackages;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<BreadcrumbType> enabledBreadcrumbTypes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<j1> telemetry;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String releaseStage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final S6.d<String> buildUuid;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersion;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer versionCode;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appType;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final H delivery;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final X endpoints;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean persistUser;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long launchDurationMillis;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final D0 logger;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxBreadcrumbs;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxPersistedEvents;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxPersistedSessions;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxReportedThreads;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxStringValueLength;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final long threadCollectionTimeLimitMillis;

    public final boolean I(String errorClass) {
        if (errorClass != null && errorClass.length() != 0) {
            Collection<Pattern> collection = this.discardClasses;
            if ((collection instanceof Collection) && collection.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (((Pattern) it.next()).matcher(errorClass.toString()).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImmutableConfig)) {
            return false;
        }
        ImmutableConfig immutableConfig = (ImmutableConfig) other;
        return Intrinsics.e(this.apiKey, immutableConfig.apiKey) && this.autoDetectErrors == immutableConfig.autoDetectErrors && Intrinsics.e(this.enabledErrorTypes, immutableConfig.enabledErrorTypes) && this.autoTrackSessions == immutableConfig.autoTrackSessions && this.sendThreads == immutableConfig.sendThreads && Intrinsics.e(this.discardClasses, immutableConfig.discardClasses) && Intrinsics.e(this.enabledReleaseStages, immutableConfig.enabledReleaseStages) && Intrinsics.e(this.projectPackages, immutableConfig.projectPackages) && Intrinsics.e(this.enabledBreadcrumbTypes, immutableConfig.enabledBreadcrumbTypes) && Intrinsics.e(this.telemetry, immutableConfig.telemetry) && Intrinsics.e(this.releaseStage, immutableConfig.releaseStage) && Intrinsics.e(this.buildUuid, immutableConfig.buildUuid) && Intrinsics.e(this.appVersion, immutableConfig.appVersion) && Intrinsics.e(this.versionCode, immutableConfig.versionCode) && Intrinsics.e(this.appType, immutableConfig.appType) && Intrinsics.e(this.delivery, immutableConfig.delivery) && Intrinsics.e(this.endpoints, immutableConfig.endpoints) && this.persistUser == immutableConfig.persistUser && this.launchDurationMillis == immutableConfig.launchDurationMillis && Intrinsics.e(this.logger, immutableConfig.logger) && this.maxBreadcrumbs == immutableConfig.maxBreadcrumbs && this.maxPersistedEvents == immutableConfig.maxPersistedEvents && this.maxPersistedSessions == immutableConfig.maxPersistedSessions && this.maxReportedThreads == immutableConfig.maxReportedThreads && this.maxStringValueLength == immutableConfig.maxStringValueLength && this.threadCollectionTimeLimitMillis == immutableConfig.threadCollectionTimeLimitMillis && Intrinsics.e(this.persistenceDirectory, immutableConfig.persistenceDirectory) && this.sendLaunchCrashesSynchronously == immutableConfig.sendLaunchCrashesSynchronously && this.attemptDeliveryOnCrash == immutableConfig.attemptDeliveryOnCrash && this.generateAnonymousId == immutableConfig.generateAnonymousId && Intrinsics.e(this.packageInfo, immutableConfig.packageInfo) && Intrinsics.e(this.appInfo, immutableConfig.appInfo) && Intrinsics.e(this.redactedKeys, immutableConfig.redactedKeys);
    }

    /* renamed from: A, reason: from getter */
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getSendLaunchCrashesSynchronously() {
        return this.sendLaunchCrashesSynchronously;
    }

    /* renamed from: C, reason: from getter */
    public final m1 getSendThreads() {
        return this.sendThreads;
    }

    @JvmName
    public final K D(V0 session) {
        return new K(this.endpoints.getSessions(), J.c(session.c()));
    }

    public final Set<j1> E() {
        return this.telemetry;
    }

    /* renamed from: F, reason: from getter */
    public final long getThreadCollectionTimeLimitMillis() {
        return this.threadCollectionTimeLimitMillis;
    }

    /* renamed from: G, reason: from getter */
    public final Integer getVersionCode() {
        return this.versionCode;
    }

    public final boolean H(BreadcrumbType type) {
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        return (set == null || set.contains(type)) ? false : true;
    }

    public final boolean K() {
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

    /* renamed from: f, reason: from getter */
    public final boolean getAutoTrackSessions() {
        return this.autoTrackSessions;
    }

    public final S6.d<String> g() {
        return this.buildUuid;
    }

    /* renamed from: h, reason: from getter */
    public final H getDelivery() {
        return this.delivery;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.apiKey.hashCode() * 31;
        boolean z10 = this.autoDetectErrors;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iHashCode2 = (((iHashCode + i10) * 31) + this.enabledErrorTypes.hashCode()) * 31;
        boolean z11 = this.autoTrackSessions;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int iHashCode3 = (((((iHashCode2 + i11) * 31) + this.sendThreads.hashCode()) * 31) + this.discardClasses.hashCode()) * 31;
        Collection<String> collection = this.enabledReleaseStages;
        int iHashCode4 = (((iHashCode3 + (collection == null ? 0 : collection.hashCode())) * 31) + this.projectPackages.hashCode()) * 31;
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        int iHashCode5 = (((iHashCode4 + (set == null ? 0 : set.hashCode())) * 31) + this.telemetry.hashCode()) * 31;
        String str = this.releaseStage;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        S6.d<String> dVar = this.buildUuid;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.appVersion;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.versionCode;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.appType;
        int iHashCode10 = (((((iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.delivery.hashCode()) * 31) + this.endpoints.hashCode()) * 31;
        boolean z12 = this.persistUser;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int iHashCode11 = (((((((((((((((((((iHashCode10 + i12) * 31) + Long.hashCode(this.launchDurationMillis)) * 31) + this.logger.hashCode()) * 31) + Integer.hashCode(this.maxBreadcrumbs)) * 31) + Integer.hashCode(this.maxPersistedEvents)) * 31) + Integer.hashCode(this.maxPersistedSessions)) * 31) + Integer.hashCode(this.maxReportedThreads)) * 31) + Integer.hashCode(this.maxStringValueLength)) * 31) + Long.hashCode(this.threadCollectionTimeLimitMillis)) * 31) + this.persistenceDirectory.hashCode()) * 31;
        boolean z13 = this.sendLaunchCrashesSynchronously;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (iHashCode11 + i13) * 31;
        boolean z14 = this.attemptDeliveryOnCrash;
        int i15 = z14;
        if (z14 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z15 = this.generateAnonymousId;
        int i17 = (i16 + (z15 ? 1 : z15 ? 1 : 0)) * 31;
        PackageInfo packageInfo = this.packageInfo;
        int iHashCode12 = (i17 + (packageInfo == null ? 0 : packageInfo.hashCode())) * 31;
        ApplicationInfo applicationInfo = this.appInfo;
        return ((iHashCode12 + (applicationInfo != null ? applicationInfo.hashCode() : 0)) * 31) + this.redactedKeys.hashCode();
    }

    public final Collection<Pattern> i() {
        return this.discardClasses;
    }

    /* renamed from: j, reason: from getter */
    public final C6583a0 getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    public final Collection<String> k() {
        return this.enabledReleaseStages;
    }

    /* renamed from: l, reason: from getter */
    public final X getEndpoints() {
        return this.endpoints;
    }

    @JvmName
    public final K m(C6591e0 payload) {
        return new K(this.endpoints.getNotify(), J.a(payload));
    }

    /* renamed from: n, reason: from getter */
    public final boolean getGenerateAnonymousId() {
        return this.generateAnonymousId;
    }

    /* renamed from: o, reason: from getter */
    public final long getLaunchDurationMillis() {
        return this.launchDurationMillis;
    }

    /* renamed from: p, reason: from getter */
    public final D0 getLogger() {
        return this.logger;
    }

    /* renamed from: q, reason: from getter */
    public final int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    /* renamed from: r, reason: from getter */
    public final int getMaxPersistedEvents() {
        return this.maxPersistedEvents;
    }

    /* renamed from: s, reason: from getter */
    public final int getMaxPersistedSessions() {
        return this.maxPersistedSessions;
    }

    /* renamed from: t, reason: from getter */
    public final int getMaxReportedThreads() {
        return this.maxReportedThreads;
    }

    public String toString() {
        return "ImmutableConfig(apiKey=" + this.apiKey + ", autoDetectErrors=" + this.autoDetectErrors + ", enabledErrorTypes=" + this.enabledErrorTypes + ", autoTrackSessions=" + this.autoTrackSessions + ", sendThreads=" + this.sendThreads + ", discardClasses=" + this.discardClasses + ", enabledReleaseStages=" + this.enabledReleaseStages + ", projectPackages=" + this.projectPackages + ", enabledBreadcrumbTypes=" + this.enabledBreadcrumbTypes + ", telemetry=" + this.telemetry + ", releaseStage=" + ((Object) this.releaseStage) + ", buildUuid=" + this.buildUuid + ", appVersion=" + ((Object) this.appVersion) + ", versionCode=" + this.versionCode + ", appType=" + ((Object) this.appType) + ", delivery=" + this.delivery + ", endpoints=" + this.endpoints + ", persistUser=" + this.persistUser + ", launchDurationMillis=" + this.launchDurationMillis + ", logger=" + this.logger + ", maxBreadcrumbs=" + this.maxBreadcrumbs + ", maxPersistedEvents=" + this.maxPersistedEvents + ", maxPersistedSessions=" + this.maxPersistedSessions + ", maxReportedThreads=" + this.maxReportedThreads + ", maxStringValueLength=" + this.maxStringValueLength + ", threadCollectionTimeLimitMillis=" + this.threadCollectionTimeLimitMillis + ", persistenceDirectory=" + this.persistenceDirectory + ", sendLaunchCrashesSynchronously=" + this.sendLaunchCrashesSynchronously + ", attemptDeliveryOnCrash=" + this.attemptDeliveryOnCrash + ", generateAnonymousId=" + this.generateAnonymousId + ", packageInfo=" + this.packageInfo + ", appInfo=" + this.appInfo + ", redactedKeys=" + this.redactedKeys + ')';
    }

    /* renamed from: u, reason: from getter */
    public final int getMaxStringValueLength() {
        return this.maxStringValueLength;
    }

    /* renamed from: v, reason: from getter */
    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getPersistUser() {
        return this.persistUser;
    }

    public final Lazy<File> x() {
        return this.persistenceDirectory;
    }

    public final Collection<String> y() {
        return this.projectPackages;
    }

    public final Collection<Pattern> z() {
        return this.redactedKeys;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableConfig(String str, boolean z10, C6583a0 c6583a0, boolean z11, m1 m1Var, Collection<Pattern> collection, Collection<String> collection2, Collection<String> collection3, Set<? extends BreadcrumbType> set, Set<? extends j1> set2, String str2, S6.d<String> dVar, String str3, Integer num, String str4, H h10, X x10, boolean z12, long j10, D0 d02, int i10, int i11, int i12, int i13, int i14, long j11, Lazy<? extends File> lazy, boolean z13, boolean z14, boolean z15, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection<Pattern> collection4) {
        this.apiKey = str;
        this.autoDetectErrors = z10;
        this.enabledErrorTypes = c6583a0;
        this.autoTrackSessions = z11;
        this.sendThreads = m1Var;
        this.discardClasses = collection;
        this.enabledReleaseStages = collection2;
        this.projectPackages = collection3;
        this.enabledBreadcrumbTypes = set;
        this.telemetry = set2;
        this.releaseStage = str2;
        this.buildUuid = dVar;
        this.appVersion = str3;
        this.versionCode = num;
        this.appType = str4;
        this.delivery = h10;
        this.endpoints = x10;
        this.persistUser = z12;
        this.launchDurationMillis = j10;
        this.logger = d02;
        this.maxBreadcrumbs = i10;
        this.maxPersistedEvents = i11;
        this.maxPersistedSessions = i12;
        this.maxReportedThreads = i13;
        this.maxStringValueLength = i14;
        this.threadCollectionTimeLimitMillis = j11;
        this.persistenceDirectory = lazy;
        this.sendLaunchCrashesSynchronously = z13;
        this.attemptDeliveryOnCrash = z14;
        this.generateAnonymousId = z15;
        this.packageInfo = packageInfo;
        this.appInfo = applicationInfo;
        this.redactedKeys = collection4;
    }

    public final boolean J(Throwable exc) {
        List<Throwable> listA = o1.a(exc);
        if ((listA instanceof Collection) && listA.isEmpty()) {
            return false;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (I(((Throwable) it.next()).getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean L(String errorClass) {
        if (!K() && !I(errorClass)) {
            return false;
        }
        return true;
    }

    public final boolean M(Throwable exc) {
        if (!K() && !J(exc)) {
            return false;
        }
        return true;
    }

    public final boolean N(boolean autoCaptured) {
        if (!K()) {
            if (!autoCaptured || this.autoTrackSessions) {
                return false;
            }
            return true;
        }
        return true;
    }
}
