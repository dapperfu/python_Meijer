package com.bugsnag.android;

import R6.ImmutableConfig;
import R6.TrimMetrics;
import com.bugsnag.android.C6624v0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00012\u00020\u0001B9\b\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB¯\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\r\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020'H\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0016H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020-H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020-2\u0006\u00108\u001a\u000207H\u0004¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u0015\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020?2\u0006\u0010B\u001a\u00020=¢\u0006\u0004\bC\u0010AJ-\u0010G\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u00010\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u000f2\b\u0010F\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bG\u0010HJ-\u0010L\u001a\u00020-2\u0006\u0010I\u001a\u00020\u000f2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010O\u001a\u00020-2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u000f2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\bO\u0010PJ!\u0010R\u001a\u00020-2\u0006\u0010F\u001a\u00020\u000f2\b\u0010Q\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bR\u0010SR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bR\u0010T\u001a\u0004\bU\u0010VR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bL\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\br\u0010sR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\b^\u0010<\"\u0004\bw\u0010xR\"\u0010~\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010z\u001a\u0004\bb\u0010{\"\u0004\b|\u0010}R(\u0010\u0085\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bh\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b;\u0010\u0086\u0001\u001a\u0005\bf\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u0086\u0001\u001a\u0005\br\u0010\u0087\u0001\"\u0006\b\u008b\u0001\u0010\u0089\u0001R.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u0086\u0001\u001a\u0006\b\u008a\u0001\u0010\u0087\u0001\"\u0006\b\u008d\u0001\u0010\u0089\u0001R'\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b)\u0010v\u001a\u0005\b\u008e\u0001\u0010<\"\u0005\b\u008f\u0001\u0010xR'\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b3\u0010v\u001a\u0005\b\u0091\u0001\u0010<\"\u0005\b\u0092\u0001\u0010xR(\u0010\u0099\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b|\u0010\u0095\u0001\u001a\u0005\bu\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R)\u0010\u009f\u0001\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010¦\u0001\u001a\u0005\u0018\u00010 \u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R'\u00108\u001a\u0002072\u0006\u0010K\u001a\u0002078F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0080\u0001\u0010§\u0001\"\u0005\b¨\u0001\u0010:R(\u0010«\u0001\u001a\u00020$2\u0006\u0010K\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u008c\u0001\u0010&\"\u0006\b©\u0001\u0010ª\u0001R3\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¬\u0001\u0010k\"\u0005\b\u00ad\u0001\u0010m¨\u0006¯\u0001"}, d2 = {"Lcom/bugsnag/android/d0;", "", "Lcom/bugsnag/android/v0$a;", "", "originalError", "LR6/k;", "config", "Lcom/bugsnag/android/a1;", "severityReason", "Lcom/bugsnag/android/H0;", "data", "Lcom/bugsnag/android/o0;", "featureFlags", "<init>", "(Ljava/lang/Throwable;LR6/k;Lcom/bugsnag/android/a1;Lcom/bugsnag/android/H0;Lcom/bugsnag/android/o0;)V", "", "apiKey", "Lcom/bugsnag/android/D0;", "logger", "", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumbs", "", "Ljava/util/regex/Pattern;", "discardClasses", "Lcom/bugsnag/android/Y;", "errors", "metadata", "", "projectPackages", "Lcom/bugsnag/android/k1;", "threads", "Lcom/bugsnag/android/s1;", "user", "redactionKeys", "(Ljava/lang/String;Lcom/bugsnag/android/D0;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Lcom/bugsnag/android/H0;Lcom/bugsnag/android/o0;Ljava/lang/Throwable;Ljava/util/Collection;Lcom/bugsnag/android/a1;Ljava/util/List;Lcom/bugsnag/android/s1;Ljava/util/Set;)V", "", "k", "()Z", "Lcom/bugsnag/android/b0;", "event", "p", "(Lcom/bugsnag/android/b0;)Z", "Lcom/bugsnag/android/v0;", "parentWriter", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "Lcom/bugsnag/android/ErrorType;", "h", "()Ljava/util/Set;", "q", "()V", "F", "(Lcom/bugsnag/android/a1;)V", "Lcom/bugsnag/android/Severity;", "severity", "E", "(Lcom/bugsnag/android/Severity;)V", "m", "()Ljava/lang/String;", "", "maxLength", "LR6/v;", "D", "(I)LR6/v;", "byteCount", "C", PreferencesHelper.PREF_ID, "email", "name", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "section", "", "value", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "key", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "variant", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Throwable;", "getOriginalError", "()Ljava/lang/Throwable;", "Lcom/bugsnag/android/a1;", "getSeverityReason$bugsnag_android_core_release", "()Lcom/bugsnag/android/a1;", "setSeverityReason$bugsnag_android_core_release", "Lcom/bugsnag/android/D0;", "getLogger", "()Lcom/bugsnag/android/D0;", "d", "Lcom/bugsnag/android/H0;", "getMetadata", "()Lcom/bugsnag/android/H0;", "e", "Lcom/bugsnag/android/o0;", "getFeatureFlags", "()Lcom/bugsnag/android/o0;", "f", "Ljava/util/Set;", "g", "Ljava/util/Collection;", "getProjectPackages$bugsnag_android_core_release", "()Ljava/util/Collection;", "x", "(Ljava/util/Collection;)V", "Lcom/bugsnag/android/O0;", "Lcom/bugsnag/android/O0;", "jsonStreamer", "Lcom/bugsnag/android/V0;", "i", "Lcom/bugsnag/android/V0;", "session", "j", "Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "Lcom/bugsnag/android/l;", "Lcom/bugsnag/android/l;", "()Lcom/bugsnag/android/l;", "r", "(Lcom/bugsnag/android/l;)V", "app", "Lcom/bugsnag/android/W;", "l", "Lcom/bugsnag/android/W;", "()Lcom/bugsnag/android/W;", "u", "(Lcom/bugsnag/android/W;)V", "device", "Ljava/util/List;", "()Ljava/util/List;", "s", "(Ljava/util/List;)V", "n", "setErrors", "o", "setThreads", "getGroupingHash", "v", "groupingHash", "getContext", "t", "context", "LR6/m;", "LR6/m;", "()LR6/m;", "w", "(LR6/m;)V", "internalMetrics", "Lcom/bugsnag/android/s1;", "getUserImpl$bugsnag_android_core_release", "()Lcom/bugsnag/android/s1;", "B", "(Lcom/bugsnag/android/s1;)V", "userImpl", "Lcom/bugsnag/android/p1;", "Lcom/bugsnag/android/p1;", "getTraceCorrelation", "()Lcom/bugsnag/android/p1;", "z", "(Lcom/bugsnag/android/p1;)V", "traceCorrelation", "()Lcom/bugsnag/android/Severity;", "setSeverity", "setUnhandled", "(Z)V", "unhandled", "getRedactedKeys", "y", "redactedKeys", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6589d0 implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Throwable originalError;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a1 severityReason;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Metadata metadata;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C6611o0 featureFlags;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<Pattern> discardClasses;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Collection<String> projectPackages;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final O0 jsonStreamer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public V0 session;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String apiKey;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public C6604l app;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public W device;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private List<Breadcrumb> breadcrumbs;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List<Y> errors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private List<k1> threads;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String groupingHash;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String context;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private R6.m internalMetrics;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private s1 userImpl;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private TraceCorrelation traceCorrelation;

    @JvmOverloads
    public C6589d0(Throwable th2, ImmutableConfig immutableConfig, a1 a1Var, Metadata metadata) {
        this(th2, immutableConfig, a1Var, metadata, null, 16, null);
    }

    public final TrimMetrics C(int byteCount) {
        int length = 0;
        int i10 = 0;
        while (length < byteCount && !this.breadcrumbs.isEmpty()) {
            length += R6.q.f32021a.g(this.breadcrumbs.remove(0)).length;
            i10++;
        }
        if (i10 == 1) {
            this.breadcrumbs.add(new Breadcrumb("Removed to reduce payload size", this.logger));
        } else {
            List<Breadcrumb> list = this.breadcrumbs;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Removed, along with ");
            sb2.append(i10 - 1);
            sb2.append(" older breadcrumbs, to reduce payload size");
            list.add(new Breadcrumb(sb2.toString(), this.logger));
        }
        return new TrimMetrics(i10, length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C6589d0(Throwable th2, ImmutableConfig immutableConfig, a1 a1Var, Metadata metadata, C6611o0 c6611o0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2, immutableConfig, a1Var, (i10 & 8) != 0 ? new Metadata(null, 1, 0 == true ? 1 : 0) : metadata, (i10 & 16) != 0 ? new C6611o0() : c6611o0);
    }

    public void A(String id2, String email, String name) {
        this.userImpl = new s1(id2, email, name);
    }

    public final void B(s1 s1Var) {
        this.userImpl = s1Var;
    }

    public final TrimMetrics D(int maxLength) {
        TrimMetrics trimMetricsO = this.metadata.o(maxLength);
        int iD = trimMetricsO.d();
        int iC = trimMetricsO.c();
        Iterator<Breadcrumb> it = this.breadcrumbs.iterator();
        while (it.hasNext()) {
            TrimMetrics trimMetricsA = it.next().impl.a(maxLength);
            iD += trimMetricsA.d();
            iC += trimMetricsA.c();
        }
        return new TrimMetrics(iD, iC);
    }

    protected final void E(Severity severity) {
        this.severityReason = new a1(this.severityReason.e(), severity, this.severityReason.f(), this.severityReason.g(), this.severityReason.c(), this.severityReason.b());
    }

    public final void F(a1 severityReason) {
        this.severityReason = severityReason;
    }

    public void a(String name, String variant) {
        this.featureFlags.a(name, variant);
    }

    public void b(String section, String key, Object value) {
        this.metadata.a(section, key, value);
    }

    public void c(String section, Map<String, ? extends Object> value) {
        this.metadata.b(section, value);
    }

    /* renamed from: d, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final C6604l e() {
        C6604l c6604l = this.app;
        if (c6604l != null) {
            return c6604l;
        }
        Intrinsics.x("app");
        return null;
    }

    public final List<Breadcrumb> f() {
        return this.breadcrumbs;
    }

    public final W g() {
        W w10 = this.device;
        if (w10 != null) {
            return w10;
        }
        Intrinsics.x("device");
        return null;
    }

    public final Set<ErrorType> h() {
        List<Y> list = this.errors;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ErrorType errorTypeE = ((Y) it.next()).e();
            if (errorTypeE != null) {
                arrayList.add(errorTypeE);
            }
        }
        Set setO1 = CollectionsKt.o1(arrayList);
        List<Y> list2 = this.errors;
        ArrayList<List> arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Y) it2.next()).d());
        }
        ArrayList arrayList3 = new ArrayList();
        for (List list3 : arrayList2) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ErrorType errorTypeD = ((c1) it3.next()).getType();
                if (errorTypeD != null) {
                    arrayList4.add(errorTypeD);
                }
            }
            CollectionsKt.C(arrayList3, arrayList4);
        }
        return SetsKt.l(setO1, arrayList3);
    }

    public final List<Y> i() {
        return this.errors;
    }

    /* renamed from: j, reason: from getter */
    public final R6.m getInternalMetrics() {
        return this.internalMetrics;
    }

    public final boolean k() {
        return this.severityReason.f64093g;
    }

    public final Severity l() {
        return this.severityReason.d();
    }

    public final String m() {
        return this.severityReason.e();
    }

    public final List<k1> n() {
        return this.threads;
    }

    public final boolean o() {
        return this.severityReason.f();
    }

    public final void r(C6604l c6604l) {
        this.app = c6604l;
    }

    public final void s(List<Breadcrumb> list) {
        this.breadcrumbs = list;
    }

    public final void t(String str) {
        this.context = str;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 parentWriter) throws IOException {
        C6624v0 c6624v0 = new C6624v0(parentWriter, this.jsonStreamer);
        c6624v0.d();
        c6624v0.l("context").O(this.context);
        c6624v0.l("metaData").e0(this.metadata);
        c6624v0.l("severity").e0(l());
        c6624v0.l("severityReason").e0(this.severityReason);
        c6624v0.l("unhandled").R(this.severityReason.f());
        c6624v0.l("exceptions");
        c6624v0.c();
        Iterator<T> it = this.errors.iterator();
        while (it.hasNext()) {
            c6624v0.e0((Y) it.next());
        }
        c6624v0.h();
        c6624v0.l("projectPackages");
        c6624v0.c();
        Iterator<T> it2 = this.projectPackages.iterator();
        while (it2.hasNext()) {
            c6624v0.O((String) it2.next());
        }
        c6624v0.h();
        c6624v0.l("user").e0(this.userImpl);
        c6624v0.l("app").e0(e());
        c6624v0.l("device").e0(g());
        c6624v0.l("breadcrumbs").e0(this.breadcrumbs);
        c6624v0.l("groupingHash").O(this.groupingHash);
        Map<String, Object> mapE = this.internalMetrics.e();
        if (!mapE.isEmpty()) {
            c6624v0.l("usage");
            c6624v0.d();
            for (Map.Entry<String, Object> entry : mapE.entrySet()) {
                c6624v0.l(entry.getKey()).e0(entry.getValue());
            }
            c6624v0.i();
        }
        c6624v0.l("threads");
        c6624v0.c();
        Iterator<T> it3 = this.threads.iterator();
        while (it3.hasNext()) {
            c6624v0.e0((k1) it3.next());
        }
        c6624v0.h();
        c6624v0.l("featureFlags").e0(this.featureFlags);
        TraceCorrelation traceCorrelation = this.traceCorrelation;
        if (traceCorrelation != null) {
            c6624v0.l("correlation").e0(traceCorrelation);
        }
        V0 v02 = this.session;
        if (v02 != null) {
            V0 v0B = V0.b(v02);
            c6624v0.l("session").d();
            c6624v0.l(PreferencesHelper.PREF_ID).O(v0B.e());
            c6624v0.l("startedAt").e0(v0B.g());
            c6624v0.l("events").d();
            c6624v0.l("handled").H(v0B.d());
            c6624v0.l("unhandled").H(v0B.h());
            c6624v0.i();
            c6624v0.i();
        }
        c6624v0.i();
    }

    public final void u(W w10) {
        this.device = w10;
    }

    public final void v(String str) {
        this.groupingHash = str;
    }

    public final void w(R6.m mVar) {
        this.internalMetrics = mVar;
    }

    public final void x(Collection<String> collection) {
        this.projectPackages = collection;
    }

    public final void y(Collection<Pattern> collection) {
        Collection<Pattern> collection2 = collection;
        this.jsonStreamer.h(CollectionsKt.o1(collection2));
        this.metadata.m(CollectionsKt.o1(collection2));
    }

    public final void z(TraceCorrelation traceCorrelation) {
        this.traceCorrelation = traceCorrelation;
    }

    protected final boolean p(C6585b0 event) {
        String strB;
        List<Y> listE = event.e();
        if (!listE.isEmpty()) {
            strB = listE.get(0).b();
        } else {
            strB = null;
        }
        return Intrinsics.e("ANR", strB);
    }

    public final void q() {
        if (h().size() == 1) {
            List<Y> list = this.errors;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.C(arrayList, ((Y) it.next()).d());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((c1) it2.next()).e(null);
            }
        }
    }

    @JvmOverloads
    public C6589d0(Throwable th2, ImmutableConfig immutableConfig, a1 a1Var, Metadata metadata, C6611o0 c6611o0) {
        List listA;
        String apiKey = immutableConfig.getApiKey();
        D0 logger = immutableConfig.getLogger();
        ArrayList arrayList = new ArrayList();
        Set setO1 = CollectionsKt.o1(immutableConfig.i());
        if (th2 == null) {
            listA = new ArrayList();
        } else {
            listA = Y.a(th2, immutableConfig.y(), immutableConfig.getLogger());
        }
        this(apiKey, logger, arrayList, setO1, listA, metadata.e(), c6611o0.b(), th2, immutableConfig.y(), a1Var, new n1(th2, a1Var.f(), immutableConfig).c(), new s1(null, null, null, 7, null), CollectionsKt.o1(immutableConfig.z()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ C6589d0(java.lang.String r18, com.bugsnag.android.D0 r19, java.util.List r20, java.util.Set r21, java.util.List r22, com.bugsnag.android.Metadata r23, com.bugsnag.android.C6611o0 r24, java.lang.Throwable r25, java.util.Collection r26, com.bugsnag.android.a1 r27, java.util.List r28, com.bugsnag.android.s1 r29, java.util.Set r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            if (r1 == 0) goto Ld
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = r1
            goto Lf
        Ld:
            r5 = r20
        Lf:
            r1 = r0 & 8
            if (r1 == 0) goto L19
            java.util.Set r1 = kotlin.collections.SetsKt.e()
            r6 = r1
            goto L1b
        L19:
            r6 = r21
        L1b:
            r1 = r0 & 16
            if (r1 == 0) goto L26
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
            goto L28
        L26:
            r7 = r22
        L28:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L35
            com.bugsnag.android.H0 r1 = new com.bugsnag.android.H0
            r3 = 1
            r1.<init>(r2, r3, r2)
            r8 = r1
            goto L37
        L35:
            r8 = r23
        L37:
            r1 = r0 & 64
            if (r1 == 0) goto L42
            com.bugsnag.android.o0 r1 = new com.bugsnag.android.o0
            r1.<init>()
            r9 = r1
            goto L44
        L42:
            r9 = r24
        L44:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L4a
            r10 = r2
            goto L4c
        L4a:
            r10 = r25
        L4c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L58
            java.util.Set r1 = kotlin.collections.SetsKt.e()
            java.util.Collection r1 = (java.util.Collection) r1
            r11 = r1
            goto L5a
        L58:
            r11 = r26
        L5a:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L66
            java.lang.String r1 = "handledException"
            com.bugsnag.android.a1 r1 = com.bugsnag.android.a1.h(r1)
            r12 = r1
            goto L68
        L66:
            r12 = r27
        L68:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L73
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13 = r1
            goto L75
        L73:
            r13 = r28
        L75:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L92
            com.bugsnag.android.s1 r1 = new com.bugsnag.android.s1
            r3 = 7
            r4 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r20 = r1
            r24 = r3
            r25 = r4
            r21 = r14
            r22 = r15
            r23 = r16
            r20.<init>(r21, r22, r23, r24, r25)
            r14 = r1
            goto L94
        L92:
            r14 = r29
        L94:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto La0
            r15 = r2
            r3 = r18
            r4 = r19
            r2 = r17
            goto La8
        La0:
            r15 = r30
            r2 = r17
            r3 = r18
            r4 = r19
        La8:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C6589d0.<init>(java.lang.String, com.bugsnag.android.D0, java.util.List, java.util.Set, java.util.List, com.bugsnag.android.H0, com.bugsnag.android.o0, java.lang.Throwable, java.util.Collection, com.bugsnag.android.a1, java.util.List, com.bugsnag.android.s1, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C6589d0(String str, D0 d02, List<Breadcrumb> list, Set<Pattern> set, List<Y> list2, Metadata metadata, C6611o0 c6611o0, Throwable th2, Collection<String> collection, a1 a1Var, List<k1> list3, s1 s1Var, Set<Pattern> set2) {
        O0 o02 = new O0();
        o02.h(CollectionsKt.o1(o02.c()));
        this.jsonStreamer = o02;
        this.internalMetrics = new R6.o();
        this.logger = d02;
        this.apiKey = str;
        this.breadcrumbs = list;
        this.discardClasses = set;
        this.errors = list2;
        this.metadata = metadata;
        this.featureFlags = c6611o0;
        this.originalError = th2;
        this.projectPackages = collection;
        this.severityReason = a1Var;
        this.threads = list3;
        this.userImpl = s1Var;
        if (set2 == null) {
            return;
        }
        y(set2);
    }
}
