package com.bugsnag.android;

import android.content.Context;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ³\u00012\u00020\u00012\u00020\u00012\u00020\u00012\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0005R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b'\u0010\u0005R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0014\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0005R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\b\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010\b\"\u0004\bD\u0010@R\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0007\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010O\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010=\u001a\u0004\b&\u0010\b\"\u0004\bN\u0010@R\"\u0010S\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010\b\"\u0004\bR\u0010@R\"\u0010Y\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010U\u001a\u0004\bG\u0010V\"\u0004\bW\u0010XR\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010=\u001a\u0004\b#\u0010\b\"\u0004\bZ\u0010@R$\u0010^\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b]\u0010\u0005R.\u0010f\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\b\\\u0010c\"\u0004\bd\u0010eR$\u0010m\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\b5\u0010j\"\u0004\bk\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\"\u0010v\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010+\u001a\u0004\ba\u0010s\"\u0004\bt\u0010uR\"\u0010x\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010+\u001a\u0004\bh\u0010s\"\u0004\b=\u0010uR\"\u0010{\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010+\u001a\u0004\bo\u0010s\"\u0004\bz\u0010uR\"\u0010}\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010+\u001a\u0004\br\u0010s\"\u0004\b|\u0010uR$\u0010\u0081\u0001\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010\u0007\u001a\u0004\b\u007f\u0010I\"\u0005\b\u0080\u0001\u0010KR%\u0010\u0084\u0001\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b\u0082\u0001\u0010+\u001a\u0004\bw\u0010s\"\u0005\b\u0083\u0001\u0010uR'\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b\u0085\u0001\u0010\u0014\u001a\u0004\b0\u0010\u0015\"\u0005\b\u0086\u0001\u0010\u0005R0\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b<\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R0\u0010\u0091\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b1\u0010\u008b\u0001\u001a\u0005\bM\u0010\u008c\u0001\"\u0006\b\u0090\u0001\u0010\u008e\u0001R1\u0010\u0094\u0001\u001a\f\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bQ\u0010\u008b\u0001\u001a\u0005\bB\u0010\u008c\u0001\"\u0006\b\u0093\u0001\u0010\u008e\u0001R0\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b7\u0010\u008b\u0001\u001a\u0006\b\u0096\u0001\u0010\u008c\u0001\"\u0006\b\u0097\u0001\u0010\u008e\u0001R0\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u008b\u0001\u001a\u0006\b\u0085\u0001\u0010\u008c\u0001\"\u0006\b\u0099\u0001\u0010\u008e\u0001R*\u0010 \u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u007f\u0010\u009c\u0001\u001a\u0005\b~\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R$\u0010¢\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u000e\u0010=\u001a\u0004\b\u001f\u0010\b\"\u0005\b¡\u0001\u0010@R\u001b\u0010¦\u0001\u001a\u00030£\u00018\u0006¢\u0006\u000e\n\u0005\b+\u0010¤\u0001\u001a\u0005\by\u0010¥\u0001R2\u0010¬\u0001\u001a\u0016\u0012\u0005\u0012\u00030¨\u00010§\u0001j\n\u0012\u0005\u0012\u00030¨\u0001`©\u00018\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\b\u0007\u0010ª\u0001\u001a\u0006\b\u0082\u0001\u0010«\u0001R(\u0010°\u0001\u001a\u00020n2\u0006\u0010`\u001a\u00020n8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bP\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R9\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00012\u000e\u0010`\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008c\u0001\"\u0006\b±\u0001\u0010\u008e\u0001¨\u0006´\u0001"}, d2 = {"Lcom/bugsnag/android/w;", "", "", "apiKey", "<init>", "(Ljava/lang/String;)V", "", "J", "()Z", "", "coll", "k0", "(Ljava/util/Collection;)Ljava/lang/String;", "Lcom/bugsnag/android/s1;", "H", "()Lcom/bugsnag/android/s1;", "", "g", "()Ljava/util/Map;", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setApiKey", "b", "Lcom/bugsnag/android/s1;", "user", "Lcom/bugsnag/android/r;", "c", "Lcom/bugsnag/android/r;", "callbackState", "Lcom/bugsnag/android/I0;", "d", "Lcom/bugsnag/android/I0;", "metadataState", "Lcom/bugsnag/android/n0;", "e", "Lcom/bugsnag/android/n0;", "featureFlagState", "f", "N", "appVersion", "", "Ljava/lang/Integer;", "I", "()Ljava/lang/Integer;", "j0", "(Ljava/lang/Integer;)V", "versionCode", "h", "C", "f0", "releaseStage", "Lcom/bugsnag/android/m1;", "i", "Lcom/bugsnag/android/m1;", "E", "()Lcom/bugsnag/android/m1;", "h0", "(Lcom/bugsnag/android/m1;)V", "sendThreads", "j", "Z", "x", "c0", "(Z)V", "persistUser", "k", "o", "V", "generateAnonymousId", "", "l", "p", "()J", "W", "(J)V", "launchDurationMillis", "m", "Q", "autoTrackSessions", "n", "D", "g0", "sendLaunchCrashesSynchronously", "Lcom/bugsnag/android/a0;", "Lcom/bugsnag/android/a0;", "()Lcom/bugsnag/android/a0;", "setEnabledErrorTypes", "(Lcom/bugsnag/android/a0;)V", "enabledErrorTypes", "P", "autoDetectErrors", "q", "M", "appType", "Lcom/bugsnag/android/D0;", "value", "r", "Lcom/bugsnag/android/D0;", "()Lcom/bugsnag/android/D0;", "X", "(Lcom/bugsnag/android/D0;)V", "logger", "Lcom/bugsnag/android/H;", "s", "Lcom/bugsnag/android/H;", "()Lcom/bugsnag/android/H;", "R", "(Lcom/bugsnag/android/H;)V", "delivery", "Lcom/bugsnag/android/X;", "t", "Lcom/bugsnag/android/X;", "_endpoints", "u", "()I", "Y", "(I)V", "maxBreadcrumbs", "v", "maxPersistedEvents", "w", "a0", "maxPersistedSessions", "b0", "maxReportedThreads", "y", "G", "i0", "threadCollectionTimeLimitMillis", "z", "setMaxStringValueLength", "maxStringValueLength", "A", "setContext", "context", "", "Ljava/util/regex/Pattern;", "B", "Ljava/util/Set;", "()Ljava/util/Set;", "S", "(Ljava/util/Set;)V", "discardClasses", "T", "enabledReleaseStages", "Lcom/bugsnag/android/BreadcrumbType;", "setEnabledBreadcrumbTypes", "enabledBreadcrumbTypes", "Lcom/bugsnag/android/j1;", "F", "setTelemetry", "telemetry", "d0", "projectPackages", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", "setPersistenceDirectory", "(Ljava/io/File;)V", "persistenceDirectory", "O", "attemptDeliveryOnCrash", "Lcom/bugsnag/android/M0;", "Lcom/bugsnag/android/M0;", "()Lcom/bugsnag/android/M0;", "notifier", "Ljava/util/HashSet;", "Lcom/bugsnag/android/T0;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "()Ljava/util/HashSet;", "plugins", "()Lcom/bugsnag/android/X;", "U", "(Lcom/bugsnag/android/X;)V", "endpoints", "e0", "redactedKeys", "K", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6625w {

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String context;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Set<String> enabledReleaseStages;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Set<? extends BreadcrumbType> enabledBreadcrumbTypes;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private File persistenceDirectory;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean attemptDeliveryOnCrash;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String apiKey;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String appVersion;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String releaseStage;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private H delivery;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private X _endpoints;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private s1 user = new s1(null, null, null, 7, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CallbackState callbackState = new CallbackState(null, null, null, null, 15, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final MetadataState metadataState = new MetadataState(null, 1, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final FeatureFlagState featureFlagState = new FeatureFlagState(null, 1, null);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Integer versionCode = 0;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private m1 sendThreads = m1.ALWAYS;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean persistUser = true;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean generateAnonymousId = true;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long launchDurationMillis = 5000;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean autoTrackSessions = true;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean sendLaunchCrashesSynchronously = true;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private C6583a0 enabledErrorTypes = new C6583a0(false, false, false, false, 15, null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean autoDetectErrors = true;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String appType = "android";

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private D0 logger = E.f63902a;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int maxBreadcrumbs = 100;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int maxPersistedEvents = 32;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int maxPersistedSessions = 128;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int maxReportedThreads = HttpResponseStatus.SUCCESS_OK;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long threadCollectionTimeLimitMillis = 5000;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int maxStringValueLength = 10000;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Set<Pattern> discardClasses = SetsKt.e();

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Set<? extends j1> telemetry = EnumSet.of(j1.INTERNAL_ERRORS, j1.USAGE);

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Set<String> projectPackages = SetsKt.e();

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final M0 notifier = new M0(null, null, null, 7, null);

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final HashSet<T0> plugins = new HashSet<>();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/w$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bugsnag/android/x;", "a", "(Landroid/content/Context;)Lcom/bugsnag/android/x;", "", "apiKey", "b", "(Landroid/content/Context;Ljava/lang/String;)Lcom/bugsnag/android/x;", "", "DEFAULT_LAUNCH_CRASH_THRESHOLD_MS", "J", "", "DEFAULT_MAX_BREADCRUMBS", "I", "DEFAULT_MAX_PERSISTED_EVENTS", "DEFAULT_MAX_PERSISTED_SESSIONS", "DEFAULT_MAX_REPORTED_THREADS", "DEFAULT_MAX_STRING_VALUE_LENGTH", "DEFAULT_NOTIFY", "Ljava/lang/String;", "DEFAULT_SESSION", "DEFAULT_THREAD_COLLECTION_TIME_LIMIT_MS", "HUB_NOTIFY", "HUB_PREFIX", "HUB_SESSION", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C6627x a(Context context) {
            return C6625w.L(context, null);
        }

        private Companion() {
        }

        @JvmStatic
        protected final C6627x b(Context context, String apiKey) {
            return new E0().c(context, apiKey);
        }
    }

    @JvmStatic
    public static final C6627x K(Context context) {
        return INSTANCE.a(context);
    }

    @JvmStatic
    protected static final C6627x L(Context context, String str) {
        return INSTANCE.b(context, str);
    }

    private final boolean J() {
        String str = this.apiKey;
        return str != null && StringsKt.W(str, "00000", false, 2, null);
    }

    private final String k0(Collection<? extends Object> coll) {
        String strB0;
        if (coll == null) {
            return "";
        }
        Collection<? extends Object> collection = coll;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        List listY0 = CollectionsKt.Y0(arrayList);
        return (listY0 == null || (strB0 = CollectionsKt.B0(listY0, ",", null, null, 0, null, null, 62, null)) == null) ? "" : strB0;
    }

    public final Set<String> A() {
        return this.projectPackages;
    }

    public final Set<Pattern> B() {
        return this.metadataState.getMetadata().j();
    }

    /* renamed from: C, reason: from getter */
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getSendLaunchCrashesSynchronously() {
        return this.sendLaunchCrashesSynchronously;
    }

    /* renamed from: E, reason: from getter */
    public final m1 getSendThreads() {
        return this.sendThreads;
    }

    public final Set<j1> F() {
        return this.telemetry;
    }

    /* renamed from: G, reason: from getter */
    public final long getThreadCollectionTimeLimitMillis() {
        return this.threadCollectionTimeLimitMillis;
    }

    /* renamed from: H, reason: from getter */
    public s1 getUser() {
        return this.user;
    }

    /* renamed from: I, reason: from getter */
    public final Integer getVersionCode() {
        return this.versionCode;
    }

    public final void M(String str) {
        this.appType = str;
    }

    public final void N(String str) {
        this.appVersion = str;
    }

    public final void O(boolean z10) {
        this.attemptDeliveryOnCrash = z10;
    }

    public final void P(boolean z10) {
        this.autoDetectErrors = z10;
    }

    public final void Q(boolean z10) {
        this.autoTrackSessions = z10;
    }

    public final void R(H h10) {
        this.delivery = h10;
    }

    public final void S(Set<Pattern> set) {
        this.discardClasses = set;
    }

    public final void T(Set<String> set) {
        this.enabledReleaseStages = set;
    }

    public final void U(X x10) {
        this._endpoints = x10;
    }

    public final void V(boolean z10) {
        this.generateAnonymousId = z10;
    }

    public final void W(long j10) {
        this.launchDurationMillis = j10;
    }

    public final void X(D0 d02) {
        if (d02 == null) {
            d02 = L0.f63946a;
        }
        this.logger = d02;
    }

    public final void Y(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public final void Z(int i10) {
        this.maxPersistedEvents = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final void a0(int i10) {
        this.maxPersistedSessions = i10;
    }

    /* renamed from: b, reason: from getter */
    public final String getAppType() {
        return this.appType;
    }

    public final void b0(int i10) {
        this.maxReportedThreads = i10;
    }

    /* renamed from: c, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final void c0(boolean z10) {
        this.persistUser = z10;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getAttemptDeliveryOnCrash() {
        return this.attemptDeliveryOnCrash;
    }

    public final void d0(Set<String> set) {
        this.projectPackages = set;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getAutoDetectErrors() {
        return this.autoDetectErrors;
    }

    public final void e0(Set<Pattern> set) {
        this.metadataState.getMetadata().m(set);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getAutoTrackSessions() {
        return this.autoTrackSessions;
    }

    public final void f0(String str) {
        this.releaseStage = str;
    }

    public final Map<String, Object> g() {
        Pair pairA;
        C6625w c6625w = new C6625w("");
        Pair pairA2 = this.plugins.size() > 0 ? TuplesKt.a("pluginCount", Integer.valueOf(this.plugins.size())) : null;
        boolean z10 = this.autoDetectErrors;
        Pair pairA3 = z10 != c6625w.autoDetectErrors ? TuplesKt.a("autoDetectErrors", Boolean.valueOf(z10)) : null;
        boolean z11 = this.autoTrackSessions;
        Pair pairA4 = z11 != c6625w.autoTrackSessions ? TuplesKt.a("autoTrackSessions", Boolean.valueOf(z11)) : null;
        Pair pairA5 = this.discardClasses.size() > 0 ? TuplesKt.a("discardClassesCount", Integer.valueOf(this.discardClasses.size())) : null;
        Pair pairA6 = !Intrinsics.e(this.enabledBreadcrumbTypes, c6625w.enabledBreadcrumbTypes) ? TuplesKt.a("enabledBreadcrumbTypes", k0(this.enabledBreadcrumbTypes)) : null;
        if (Intrinsics.e(this.enabledErrorTypes, c6625w.enabledErrorTypes)) {
            pairA = null;
        } else {
            pairA = TuplesKt.a("enabledErrorTypes", k0(CollectionsKt.r(this.enabledErrorTypes.getAnrs() ? "anrs" : null, this.enabledErrorTypes.getNdkCrashes() ? "ndkCrashes" : null, this.enabledErrorTypes.getUnhandledExceptions() ? "unhandledExceptions" : null, this.enabledErrorTypes.getUnhandledRejections() ? "unhandledRejections" : null)));
        }
        long j10 = this.launchDurationMillis;
        Pair pairA7 = j10 != 0 ? TuplesKt.a("launchDurationMillis", Long.valueOf(j10)) : null;
        Pair pairA8 = !Intrinsics.e(this.logger, L0.f63946a) ? TuplesKt.a("logger", Boolean.TRUE) : null;
        int i10 = this.maxBreadcrumbs;
        Pair pairA9 = i10 != c6625w.maxBreadcrumbs ? TuplesKt.a("maxBreadcrumbs", Integer.valueOf(i10)) : null;
        int i11 = this.maxPersistedEvents;
        Pair pairA10 = i11 != c6625w.maxPersistedEvents ? TuplesKt.a("maxPersistedEvents", Integer.valueOf(i11)) : null;
        int i12 = this.maxPersistedSessions;
        Pair pairA11 = i12 != c6625w.maxPersistedSessions ? TuplesKt.a("maxPersistedSessions", Integer.valueOf(i12)) : null;
        int i13 = this.maxReportedThreads;
        Pair pairA12 = i13 != c6625w.maxReportedThreads ? TuplesKt.a("maxReportedThreads", Integer.valueOf(i13)) : null;
        Pair pair = pairA2;
        long j11 = this.threadCollectionTimeLimitMillis;
        Pair pairA13 = j11 != c6625w.threadCollectionTimeLimitMillis ? TuplesKt.a("threadCollectionTimeLimitMillis", Long.valueOf(j11)) : null;
        Pair pairA14 = this.persistenceDirectory != null ? TuplesKt.a("persistenceDirectorySet", Boolean.TRUE) : null;
        m1 m1Var = this.sendThreads;
        Pair pair2 = pairA13;
        Pair pairA15 = m1Var != c6625w.sendThreads ? TuplesKt.a("sendThreads", m1Var) : null;
        boolean z12 = this.attemptDeliveryOnCrash;
        return MapsKt.y(CollectionsKt.r(pair, pairA3, pairA4, pairA5, pairA6, pairA, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pair2, pairA14, pairA15, z12 != c6625w.attemptDeliveryOnCrash ? TuplesKt.a("attemptDeliveryOnCrash", Boolean.valueOf(z12)) : null));
    }

    public final void g0(boolean z10) {
        this.sendLaunchCrashesSynchronously = z10;
    }

    /* renamed from: h, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final void h0(m1 m1Var) {
        this.sendThreads = m1Var;
    }

    /* renamed from: i, reason: from getter */
    public final H getDelivery() {
        return this.delivery;
    }

    public final void i0(long j10) {
        this.threadCollectionTimeLimitMillis = j10;
    }

    public final Set<Pattern> j() {
        return this.discardClasses;
    }

    public final void j0(Integer num) {
        this.versionCode = num;
    }

    public final Set<BreadcrumbType> k() {
        return this.enabledBreadcrumbTypes;
    }

    /* renamed from: l, reason: from getter */
    public final C6583a0 getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    public final Set<String> m() {
        return this.enabledReleaseStages;
    }

    public final X n() {
        X x10 = this._endpoints;
        return x10 == null ? J() ? new X("https://notify.insighthub.smartbear.com", "https://sessions.insighthub.smartbear.com") : new X("https://notify.bugsnag.com", "https://sessions.bugsnag.com") : x10;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getGenerateAnonymousId() {
        return this.generateAnonymousId;
    }

    /* renamed from: p, reason: from getter */
    public final long getLaunchDurationMillis() {
        return this.launchDurationMillis;
    }

    /* renamed from: q, reason: from getter */
    public final D0 getLogger() {
        return this.logger;
    }

    /* renamed from: r, reason: from getter */
    public final int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    /* renamed from: s, reason: from getter */
    public final int getMaxPersistedEvents() {
        return this.maxPersistedEvents;
    }

    /* renamed from: t, reason: from getter */
    public final int getMaxPersistedSessions() {
        return this.maxPersistedSessions;
    }

    /* renamed from: u, reason: from getter */
    public final int getMaxReportedThreads() {
        return this.maxReportedThreads;
    }

    /* renamed from: v, reason: from getter */
    public final int getMaxStringValueLength() {
        return this.maxStringValueLength;
    }

    /* renamed from: w, reason: from getter */
    public final M0 getNotifier() {
        return this.notifier;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getPersistUser() {
        return this.persistUser;
    }

    /* renamed from: y, reason: from getter */
    public final File getPersistenceDirectory() {
        return this.persistenceDirectory;
    }

    protected final HashSet<T0> z() {
        return this.plugins;
    }

    public C6625w(String str) {
        this.apiKey = str;
    }
}
