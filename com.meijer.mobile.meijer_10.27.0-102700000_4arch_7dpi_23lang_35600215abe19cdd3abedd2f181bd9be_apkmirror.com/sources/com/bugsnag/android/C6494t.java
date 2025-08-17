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

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 W2\u00020\u00012\u00020\u00012\u00020\u00012\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!\"\u0004\b\"\u0010\u0005R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b,\u0010!\"\u0004\b-\u0010\u0005R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010E\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00109\u001a\u0004\b%\u0010;\"\u0004\bG\u0010=R\"\u0010L\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00109\u001a\u0004\bJ\u0010;\"\u0004\bK\u0010=R\"\u0010S\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bI\u0010P\"\u0004\bQ\u0010RR\"\u0010V\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00109\u001a\u0004\b\u001f\u0010;\"\u0004\bU\u0010=R$\u0010X\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\bW\u0010\u0005R.\u0010`\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010Y8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]\"\u0004\b^\u0010_R$\u0010g\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\b8\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bT\u0010k\"\u0004\bl\u0010mR\"\u0010s\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010W\u001a\u0004\bb\u0010p\"\u0004\bq\u0010rR\"\u0010v\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010W\u001a\u0004\bi\u0010p\"\u0004\bu\u0010rR\"\u0010y\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010W\u001a\u0004\bo\u0010p\"\u0004\bx\u0010rR\"\u0010|\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010W\u001a\u0004\bt\u0010p\"\u0004\b{\u0010rR\"\u0010~\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010W\u001a\u0004\bw\u0010p\"\u0004\b}\u0010rR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010 \u001a\u0004\b0\u0010!\"\u0005\b\u0080\u0001\u0010\u0005R/\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b@\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R1\u0010\u008b\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0005\bN\u0010\u0085\u0001\"\u0006\b\u008a\u0001\u0010\u0087\u0001R2\u0010\u008f\u0001\u001a\f\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008d\u0001\u0010\u0084\u0001\u001a\u0005\bF\u0010\u0085\u0001\"\u0006\b\u008e\u0001\u0010\u0087\u0001R0\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b,\u0010\u0084\u0001\u001a\u0006\b\u0091\u0001\u0010\u0085\u0001\"\u0006\b\u0092\u0001\u0010\u0087\u0001R/\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bJ\u0010\u0084\u0001\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001\"\u0006\b\u0094\u0001\u0010\u0087\u0001R*\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b2\u0010\u0097\u0001\u001a\u0005\b\u007f\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R%\u0010\u009d\u0001\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b\u0091\u0001\u00109\u001a\u0004\b\u001c\u0010;\"\u0005\b\u009c\u0001\u0010=R\u001b\u0010¡\u0001\u001a\u00030\u009e\u00018\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010\u009f\u0001\u001a\u0005\bz\u0010 \u0001R2\u0010§\u0001\u001a\u0016\u0012\u0005\u0012\u00030£\u00010¢\u0001j\n\u0012\u0005\u0012\u00030£\u0001`¤\u00018\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\b'\u0010¥\u0001\u001a\u0006\b\u0083\u0001\u0010¦\u0001R$\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b¨\u0001\u0010 \u001a\u0004\b\u0010\u0010!\"\u0005\b©\u0001\u0010\u0005R6\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0082\u00012\r\u0010Z\u001a\t\u0012\u0004\u0012\u00020\u00020\u0082\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008d\u0001\u0010\u0085\u0001\"\u0005\b9\u0010\u0087\u0001¨\u0006«\u0001"}, d2 = {"Lcom/bugsnag/android/t;", "", "", "apiKey", "<init>", "(Ljava/lang/String;)V", "", "coll", "e0", "(Ljava/util/Collection;)Ljava/lang/String;", "Lcom/bugsnag/android/h1;", "F", "()Lcom/bugsnag/android/h1;", "", "g", "()Ljava/util/Map;", "a", "Lcom/bugsnag/android/h1;", "user", "Lcom/bugsnag/android/o;", "b", "Lcom/bugsnag/android/o;", "callbackState", "Lcom/bugsnag/android/y0;", "c", "Lcom/bugsnag/android/y0;", "metadataState", "Lcom/bugsnag/android/d0;", "d", "Lcom/bugsnag/android/d0;", "featureFlagState", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "J", "appVersion", "", "f", "Ljava/lang/Integer;", "G", "()Ljava/lang/Integer;", "d0", "(Ljava/lang/Integer;)V", "versionCode", "B", "a0", "releaseStage", "Lcom/bugsnag/android/b1;", "h", "Lcom/bugsnag/android/b1;", "D", "()Lcom/bugsnag/android/b1;", "c0", "(Lcom/bugsnag/android/b1;)V", "sendThreads", "", "i", "Z", "w", "()Z", "X", "(Z)V", "persistUser", "", "j", "o", "()J", "R", "(J)V", "launchDurationMillis", "k", "M", "autoTrackSessions", "l", "C", "b0", "sendLaunchCrashesSynchronously", "Lcom/bugsnag/android/U;", "m", "Lcom/bugsnag/android/U;", "()Lcom/bugsnag/android/U;", "setEnabledErrorTypes", "(Lcom/bugsnag/android/U;)V", "enabledErrorTypes", "n", "L", "autoDetectErrors", "I", "appType", "Lcom/bugsnag/android/t0;", "value", "p", "Lcom/bugsnag/android/t0;", "()Lcom/bugsnag/android/t0;", "S", "(Lcom/bugsnag/android/t0;)V", "logger", "Lcom/bugsnag/android/D;", "q", "Lcom/bugsnag/android/D;", "()Lcom/bugsnag/android/D;", "N", "(Lcom/bugsnag/android/D;)V", "delivery", "Lcom/bugsnag/android/Q;", "r", "Lcom/bugsnag/android/Q;", "()Lcom/bugsnag/android/Q;", "Q", "(Lcom/bugsnag/android/Q;)V", "endpoints", "s", "()I", "T", "(I)V", "maxBreadcrumbs", "t", "U", "maxPersistedEvents", "u", "V", "maxPersistedSessions", "v", "W", "maxReportedThreads", "setMaxStringValueLength", "maxStringValueLength", "x", "setContext", "context", "", "y", "Ljava/util/Set;", "()Ljava/util/Set;", "O", "(Ljava/util/Set;)V", "discardClasses", "z", "P", "enabledReleaseStages", "Lcom/bugsnag/android/BreadcrumbType;", "A", "setEnabledBreadcrumbTypes", "enabledBreadcrumbTypes", "Lcom/bugsnag/android/Y0;", "E", "setTelemetry", "telemetry", "Y", "projectPackages", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", "setPersistenceDirectory", "(Ljava/io/File;)V", "persistenceDirectory", "K", "attemptDeliveryOnCrash", "Lcom/bugsnag/android/B0;", "Lcom/bugsnag/android/B0;", "()Lcom/bugsnag/android/B0;", "notifier", "Ljava/util/HashSet;", "Lcom/bugsnag/android/I0;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "()Ljava/util/HashSet;", "plugins", "H", "setApiKey", "redactedKeys", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6494t {

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Set<? extends BreadcrumbType> enabledBreadcrumbTypes;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Set<? extends Y0> telemetry;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Set<String> projectPackages;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private File persistenceDirectory;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean attemptDeliveryOnCrash;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final B0 notifier;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final HashSet<I0> plugins;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private String apiKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String appVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String releaseStage;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean persistUser;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private D delivery;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String context;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Set<String> enabledReleaseStages;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private h1 user = new h1(null, null, null, 7, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CallbackState callbackState = new CallbackState(null, null, null, null, 15, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final MetadataState metadataState = new MetadataState(null, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final FeatureFlagState featureFlagState = new FeatureFlagState(null, 1, null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Integer versionCode = 0;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b1 sendThreads = b1.ALWAYS;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long launchDurationMillis = 5000;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean autoTrackSessions = true;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean sendLaunchCrashesSynchronously = true;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private U enabledErrorTypes = new U(false, false, false, false, 15, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean autoDetectErrors = true;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String appType = "android";

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6495t0 logger = B.f63051a;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Q endpoints = new Q(null, null, 3, null);

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int maxBreadcrumbs = 100;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxPersistedEvents = 32;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int maxPersistedSessions = 128;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int maxReportedThreads = HttpResponseStatus.SUCCESS_OK;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int maxStringValueLength = 10000;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Set<String> discardClasses = SetsKt.e();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/t$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bugsnag/android/u;", "a", "(Landroid/content/Context;)Lcom/bugsnag/android/u;", "", "apiKey", "b", "(Landroid/content/Context;Ljava/lang/String;)Lcom/bugsnag/android/u;", "", "DEFAULT_LAUNCH_CRASH_THRESHOLD_MS", "J", "", "DEFAULT_MAX_BREADCRUMBS", "I", "DEFAULT_MAX_PERSISTED_EVENTS", "DEFAULT_MAX_PERSISTED_SESSIONS", "DEFAULT_MAX_REPORTED_THREADS", "DEFAULT_MAX_STRING_VALUE_LENGTH", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.t$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final C6496u a(Context context) {
            return b(context, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        protected final C6496u b(Context context, String apiKey) {
            return new C6497u0().b(context, apiKey);
        }
    }

    @JvmStatic
    public static final C6496u H(Context context) {
        return INSTANCE.a(context);
    }

    private final String e0(Collection<? extends Object> coll) {
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
        return this.metadataState.getMetadata().j();
    }

    /* renamed from: B, reason: from getter */
    public final String getReleaseStage() {
        return this.releaseStage;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getSendLaunchCrashesSynchronously() {
        return this.sendLaunchCrashesSynchronously;
    }

    /* renamed from: D, reason: from getter */
    public final b1 getSendThreads() {
        return this.sendThreads;
    }

    public final Set<Y0> E() {
        return this.telemetry;
    }

    /* renamed from: F, reason: from getter */
    public h1 getUser() {
        return this.user;
    }

    /* renamed from: G, reason: from getter */
    public final Integer getVersionCode() {
        return this.versionCode;
    }

    public final void I(String str) {
        this.appType = str;
    }

    public final void J(String str) {
        this.appVersion = str;
    }

    public final void K(boolean z10) {
        this.attemptDeliveryOnCrash = z10;
    }

    public final void L(boolean z10) {
        this.autoDetectErrors = z10;
    }

    public final void M(boolean z10) {
        this.autoTrackSessions = z10;
    }

    public final void N(D d10) {
        this.delivery = d10;
    }

    public final void O(Set<String> set) {
        this.discardClasses = set;
    }

    public final void P(Set<String> set) {
        this.enabledReleaseStages = set;
    }

    public final void Q(Q q10) {
        this.endpoints = q10;
    }

    public final void R(long j10) {
        this.launchDurationMillis = j10;
    }

    public final void S(InterfaceC6495t0 interfaceC6495t0) {
        if (interfaceC6495t0 == null) {
            interfaceC6495t0 = A0.f63048a;
        }
        this.logger = interfaceC6495t0;
    }

    public final void T(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public final void U(int i10) {
        this.maxPersistedEvents = i10;
    }

    public final void V(int i10) {
        this.maxPersistedSessions = i10;
    }

    public final void W(int i10) {
        this.maxReportedThreads = i10;
    }

    public final void X(boolean z10) {
        this.persistUser = z10;
    }

    public final void Y(Set<String> set) {
        this.projectPackages = set;
    }

    public final void Z(Set<String> set) {
        this.metadataState.getMetadata().m(set);
    }

    /* renamed from: a, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final void a0(String str) {
        this.releaseStage = str;
    }

    /* renamed from: b, reason: from getter */
    public final String getAppType() {
        return this.appType;
    }

    public final void b0(boolean z10) {
        this.sendLaunchCrashesSynchronously = z10;
    }

    /* renamed from: c, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final void c0(b1 b1Var) {
        this.sendThreads = b1Var;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getAttemptDeliveryOnCrash() {
        return this.attemptDeliveryOnCrash;
    }

    public final void d0(Integer num) {
        this.versionCode = num;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getAutoDetectErrors() {
        return this.autoDetectErrors;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getAutoTrackSessions() {
        return this.autoTrackSessions;
    }

    public final Map<String, Object> g() {
        Pair pairA;
        C6494t c6494t = new C6494t("");
        Pair pairA2 = this.plugins.size() > 0 ? TuplesKt.a("pluginCount", Integer.valueOf(this.plugins.size())) : null;
        boolean z10 = this.autoDetectErrors;
        Pair pairA3 = z10 != c6494t.autoDetectErrors ? TuplesKt.a("autoDetectErrors", Boolean.valueOf(z10)) : null;
        boolean z11 = this.autoTrackSessions;
        Pair pairA4 = z11 != c6494t.autoTrackSessions ? TuplesKt.a("autoTrackSessions", Boolean.valueOf(z11)) : null;
        Pair pairA5 = this.discardClasses.size() > 0 ? TuplesKt.a("discardClassesCount", Integer.valueOf(this.discardClasses.size())) : null;
        Pair pairA6 = !Intrinsics.e(this.enabledBreadcrumbTypes, c6494t.enabledBreadcrumbTypes) ? TuplesKt.a("enabledBreadcrumbTypes", e0(this.enabledBreadcrumbTypes)) : null;
        if (Intrinsics.e(this.enabledErrorTypes, c6494t.enabledErrorTypes)) {
            pairA = null;
        } else {
            pairA = TuplesKt.a("enabledErrorTypes", e0(CollectionsKt.r(this.enabledErrorTypes.getAnrs() ? "anrs" : null, this.enabledErrorTypes.getNdkCrashes() ? "ndkCrashes" : null, this.enabledErrorTypes.getUnhandledExceptions() ? "unhandledExceptions" : null, this.enabledErrorTypes.getUnhandledRejections() ? "unhandledRejections" : null)));
        }
        long j10 = this.launchDurationMillis;
        Pair pairA7 = j10 != 0 ? TuplesKt.a("launchDurationMillis", Long.valueOf(j10)) : null;
        Pair pairA8 = !Intrinsics.e(this.logger, A0.f63048a) ? TuplesKt.a("logger", Boolean.TRUE) : null;
        int i10 = this.maxBreadcrumbs;
        Pair pairA9 = i10 != c6494t.maxBreadcrumbs ? TuplesKt.a("maxBreadcrumbs", Integer.valueOf(i10)) : null;
        int i11 = this.maxPersistedEvents;
        Pair pairA10 = i11 != c6494t.maxPersistedEvents ? TuplesKt.a("maxPersistedEvents", Integer.valueOf(i11)) : null;
        int i12 = this.maxPersistedSessions;
        Pair pairA11 = i12 != c6494t.maxPersistedSessions ? TuplesKt.a("maxPersistedSessions", Integer.valueOf(i12)) : null;
        int i13 = this.maxReportedThreads;
        Pair pairA12 = i13 != c6494t.maxReportedThreads ? TuplesKt.a("maxReportedThreads", Integer.valueOf(i13)) : null;
        Pair pairA13 = this.persistenceDirectory != null ? TuplesKt.a("persistenceDirectorySet", Boolean.TRUE) : null;
        b1 b1Var = this.sendThreads;
        Pair pair = pairA13;
        Pair pairA14 = b1Var != c6494t.sendThreads ? TuplesKt.a("sendThreads", b1Var) : null;
        boolean z12 = this.attemptDeliveryOnCrash;
        return MapsKt.y(CollectionsKt.r(pairA2, pairA3, pairA4, pairA5, pairA6, pairA, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pair, pairA14, z12 != c6494t.attemptDeliveryOnCrash ? TuplesKt.a("attemptDeliveryOnCrash", Boolean.valueOf(z12)) : null));
    }

    /* renamed from: h, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: i, reason: from getter */
    public final D getDelivery() {
        return this.delivery;
    }

    public final Set<String> j() {
        return this.discardClasses;
    }

    public final Set<BreadcrumbType> k() {
        return this.enabledBreadcrumbTypes;
    }

    /* renamed from: l, reason: from getter */
    public final U getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    public final Set<String> m() {
        return this.enabledReleaseStages;
    }

    /* renamed from: n, reason: from getter */
    public final Q getEndpoints() {
        return this.endpoints;
    }

    /* renamed from: o, reason: from getter */
    public final long getLaunchDurationMillis() {
        return this.launchDurationMillis;
    }

    /* renamed from: p, reason: from getter */
    public final InterfaceC6495t0 getLogger() {
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

    /* renamed from: u, reason: from getter */
    public final int getMaxStringValueLength() {
        return this.maxStringValueLength;
    }

    /* renamed from: v, reason: from getter */
    public final B0 getNotifier() {
        return this.notifier;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getPersistUser() {
        return this.persistUser;
    }

    /* renamed from: x, reason: from getter */
    public final File getPersistenceDirectory() {
        return this.persistenceDirectory;
    }

    protected final HashSet<I0> y() {
        return this.plugins;
    }

    public final Set<String> z() {
        return this.projectPackages;
    }

    public C6494t(String str) {
        this.apiKey = str;
        EnumSet enumSetOf = EnumSet.of(Y0.INTERNAL_ERRORS, Y0.USAGE);
        Intrinsics.f(enumSetOf, "EnumSet.of(Telemetry.INT…_ERRORS, Telemetry.USAGE)");
        this.telemetry = enumSetOf;
        this.projectPackages = SetsKt.e();
        this.notifier = new B0(null, null, null, 7, null);
        this.plugins = new HashSet<>();
    }
}
