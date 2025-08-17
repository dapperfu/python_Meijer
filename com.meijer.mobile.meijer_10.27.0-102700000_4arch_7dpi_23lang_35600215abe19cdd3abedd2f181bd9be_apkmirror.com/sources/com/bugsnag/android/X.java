package com.bugsnag.android;

import Q6.ImmutableConfig;
import Q6.TrimMetrics;
import com.bugsnag.android.C6482m0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00012\u00020\u0001B9\b\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB¯\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0016¢\u0006\u0004\b\r\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0016H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020,H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020,2\u0006\u00107\u001a\u000206H\u0004¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u0015\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020>2\u0006\u0010A\u001a\u00020<¢\u0006\u0004\bB\u0010@J-\u0010F\u001a\u00020,2\b\u0010C\u001a\u0004\u0018\u00010\u000f2\b\u0010D\u001a\u0004\u0018\u00010\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bF\u0010GJ-\u0010K\u001a\u00020,2\u0006\u0010H\u001a\u00020\u000f2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ)\u0010N\u001a\u00020,2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000f2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\bN\u0010OJ!\u0010Q\u001a\u00020,2\u0006\u0010E\u001a\u00020\u000f2\b\u0010P\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bQ\u0010RR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bQ\u0010S\u001a\u0004\bT\u0010UR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bK\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010t\u001a\u0004\b]\u0010;\"\u0004\bu\u0010vR\"\u0010}\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\ba\u0010z\"\u0004\b{\u0010|R'\u0010\u0084\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b:\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\be\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u0086\u0001\u001a\u0005\bm\u0010\u0087\u0001\"\u0006\b\u008b\u0001\u0010\u0089\u0001R-\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b(\u0010\u0086\u0001\u001a\u0006\b\u0085\u0001\u0010\u0087\u0001\"\u0006\b\u008c\u0001\u0010\u0089\u0001R'\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b2\u0010t\u001a\u0005\b\u008d\u0001\u0010;\"\u0005\b\u008e\u0001\u0010vR'\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b{\u0010t\u001a\u0005\b\u0090\u0001\u0010;\"\u0005\b\u0091\u0001\u0010vR)\u0010\u0098\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0094\u0001\u001a\u0005\bq\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009e\u0001\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u00107\u001a\u0002062\u0006\u0010J\u001a\u0002068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bx\u0010\u009f\u0001\"\u0005\b \u0001\u00109R(\u0010£\u0001\u001a\u00020#2\u0006\u0010J\u001a\u00020#8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u008a\u0001\u0010%\"\u0006\b¡\u0001\u0010¢\u0001R3\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¤\u0001\u0010i\"\u0005\b¥\u0001\u0010k¨\u0006§\u0001"}, d2 = {"Lcom/bugsnag/android/X;", "", "Lcom/bugsnag/android/m0$a;", "", "originalError", "LQ6/f;", "config", "Lcom/bugsnag/android/P0;", "severityReason", "Lcom/bugsnag/android/x0;", "data", "Lcom/bugsnag/android/e0;", "featureFlags", "<init>", "(Ljava/lang/Throwable;LQ6/f;Lcom/bugsnag/android/P0;Lcom/bugsnag/android/x0;Lcom/bugsnag/android/e0;)V", "", "apiKey", "Lcom/bugsnag/android/t0;", "logger", "", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumbs", "", "discardClasses", "Lcom/bugsnag/android/S;", "errors", "metadata", "", "projectPackages", "Lcom/bugsnag/android/Z0;", "threads", "Lcom/bugsnag/android/h1;", "user", "redactionKeys", "(Ljava/lang/String;Lcom/bugsnag/android/t0;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Lcom/bugsnag/android/x0;Lcom/bugsnag/android/e0;Ljava/lang/Throwable;Ljava/util/Collection;Lcom/bugsnag/android/P0;Ljava/util/List;Lcom/bugsnag/android/h1;Ljava/util/Set;)V", "", "j", "()Z", "Lcom/bugsnag/android/V;", "event", "o", "(Lcom/bugsnag/android/V;)Z", "Lcom/bugsnag/android/m0;", "parentWriter", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "Lcom/bugsnag/android/ErrorType;", "g", "()Ljava/util/Set;", "p", "()V", "D", "(Lcom/bugsnag/android/P0;)V", "Lcom/bugsnag/android/Severity;", "severity", "C", "(Lcom/bugsnag/android/Severity;)V", "l", "()Ljava/lang/String;", "", "maxLength", "LQ6/p;", "B", "(I)LQ6/p;", "byteCount", "A", PreferencesHelper.PREF_ID, "email", "name", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "section", "", "value", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "key", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "variant", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Throwable;", "getOriginalError", "()Ljava/lang/Throwable;", "Lcom/bugsnag/android/P0;", "getSeverityReason$bugsnag_android_core_release", "()Lcom/bugsnag/android/P0;", "setSeverityReason$bugsnag_android_core_release", "Lcom/bugsnag/android/t0;", "getLogger", "()Lcom/bugsnag/android/t0;", "d", "Lcom/bugsnag/android/x0;", "getMetadata", "()Lcom/bugsnag/android/x0;", "e", "Lcom/bugsnag/android/e0;", "getFeatureFlags", "()Lcom/bugsnag/android/e0;", "f", "Ljava/util/Set;", "Ljava/util/Collection;", "getProjectPackages$bugsnag_android_core_release", "()Ljava/util/Collection;", "w", "(Ljava/util/Collection;)V", "Lcom/bugsnag/android/D0;", "h", "Lcom/bugsnag/android/D0;", "jsonStreamer", "Lcom/bugsnag/android/K0;", "i", "Lcom/bugsnag/android/K0;", "session", "Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "Lcom/bugsnag/android/i;", "k", "Lcom/bugsnag/android/i;", "()Lcom/bugsnag/android/i;", "q", "(Lcom/bugsnag/android/i;)V", "app", "Lcom/bugsnag/android/P;", "Lcom/bugsnag/android/P;", "getDevice", "()Lcom/bugsnag/android/P;", "t", "(Lcom/bugsnag/android/P;)V", "device", "m", "Ljava/util/List;", "()Ljava/util/List;", "r", "(Ljava/util/List;)V", "n", "setErrors", "setThreads", "getGroupingHash", "u", "groupingHash", "getContext", "s", "context", "LQ6/h;", "LQ6/h;", "()LQ6/h;", "v", "(LQ6/h;)V", "internalMetrics", "Lcom/bugsnag/android/h1;", "getUserImpl$bugsnag_android_core_release", "()Lcom/bugsnag/android/h1;", "z", "(Lcom/bugsnag/android/h1;)V", "userImpl", "()Lcom/bugsnag/android/Severity;", "setSeverity", "setUnhandled", "(Z)V", "unhandled", "getRedactedKeys", "x", "redactedKeys", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class X implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Throwable originalError;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private P0 severityReason;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Metadata metadata;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C6466e0 featureFlags;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<String> discardClasses;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Collection<String> projectPackages;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final D0 jsonStreamer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public K0 session;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String apiKey;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public C6473i app;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public P device;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private List<Breadcrumb> breadcrumbs;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List<S> errors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private List<Z0> threads;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String groupingHash;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String context;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Q6.h internalMetrics;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private h1 userImpl;

    @JvmOverloads
    public X(Throwable th2, ImmutableConfig immutableConfig, P0 p02, Metadata c6503x0) {
        this(th2, immutableConfig, p02, c6503x0, null, 16, null);
    }

    public final TrimMetrics A(int byteCount) {
        int length = 0;
        int i10 = 0;
        while (length < byteCount && !this.breadcrumbs.isEmpty()) {
            length += Q6.k.f29894c.e(this.breadcrumbs.remove(0)).length;
            i10++;
        }
        if (i10 != 1) {
            List<Breadcrumb> list = this.breadcrumbs;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Removed, along with ");
            sb2.append(i10 - 1);
            sb2.append(" older breadcrumbs, to reduce payload size");
            list.add(new Breadcrumb(sb2.toString(), this.logger));
        } else {
            this.breadcrumbs.add(new Breadcrumb("Removed to reduce payload size", this.logger));
        }
        return new TrimMetrics(i10, length);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ X(Throwable th2, ImmutableConfig immutableConfig, P0 p02, Metadata c6503x0, C6466e0 c6466e0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        this((i10 & 1) != 0 ? null : th2, immutableConfig, p02, (i10 & 8) != 0 ? new Metadata(null, i11, 0 == true ? 1 : 0) : c6503x0, (i10 & 16) != 0 ? new C6466e0(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0) : c6466e0);
    }

    public final TrimMetrics B(int maxLength) {
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

    protected final void C(Severity severity) {
        this.severityReason = new P0(this.severityReason.e(), severity, this.severityReason.f(), this.severityReason.g(), this.severityReason.c(), this.severityReason.b());
    }

    public final void D(P0 severityReason) {
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

    public final C6473i e() {
        C6473i c6473i = this.app;
        if (c6473i == null) {
            Intrinsics.y("app");
        }
        return c6473i;
    }

    public final List<Breadcrumb> f() {
        return this.breadcrumbs;
    }

    public final Set<ErrorType> g() {
        List<S> list = this.errors;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ErrorType errorTypeE = ((S) it.next()).e();
            if (errorTypeE != null) {
                arrayList.add(errorTypeE);
            }
        }
        Set setO1 = CollectionsKt.o1(arrayList);
        List<S> list2 = this.errors;
        ArrayList<List> arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((S) it2.next()).d());
        }
        ArrayList arrayList3 = new ArrayList();
        for (List it3 : arrayList2) {
            Intrinsics.f(it3, "it");
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = it3.iterator();
            while (it4.hasNext()) {
                ErrorType errorTypeA = ((R0) it4.next()).getType();
                if (errorTypeA != null) {
                    arrayList4.add(errorTypeA);
                }
            }
            CollectionsKt.C(arrayList3, arrayList4);
        }
        return SetsKt.l(setO1, arrayList3);
    }

    public final List<S> h() {
        return this.errors;
    }

    /* renamed from: i, reason: from getter */
    public final Q6.h getInternalMetrics() {
        return this.internalMetrics;
    }

    public final boolean j() {
        return this.severityReason.f63193g;
    }

    public final Severity k() {
        Severity severityD = this.severityReason.d();
        Intrinsics.f(severityD, "severityReason.currentSeverity");
        return severityD;
    }

    public final String l() {
        String strE = this.severityReason.e();
        Intrinsics.f(strE, "severityReason.severityReasonType");
        return strE;
    }

    public final List<Z0> m() {
        return this.threads;
    }

    public final boolean n() {
        return this.severityReason.f();
    }

    public final void q(C6473i c6473i) {
        this.app = c6473i;
    }

    public final void r(List<Breadcrumb> list) {
        this.breadcrumbs = list;
    }

    public final void s(String str) {
        this.context = str;
    }

    public final void t(P p10) {
        this.device = p10;
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 parentWriter) throws IOException {
        C6482m0 c6482m0 = new C6482m0(parentWriter, this.jsonStreamer);
        c6482m0.d();
        c6482m0.l("context").O(this.context);
        c6482m0.l("metaData").e0(this.metadata);
        c6482m0.l("severity").e0(k());
        c6482m0.l("severityReason").e0(this.severityReason);
        c6482m0.l("unhandled").R(this.severityReason.f());
        c6482m0.l("exceptions");
        c6482m0.c();
        Iterator<T> it = this.errors.iterator();
        while (it.hasNext()) {
            c6482m0.e0((S) it.next());
        }
        c6482m0.h();
        c6482m0.l("projectPackages");
        c6482m0.c();
        Iterator<T> it2 = this.projectPackages.iterator();
        while (it2.hasNext()) {
            c6482m0.O((String) it2.next());
        }
        c6482m0.h();
        c6482m0.l("user").e0(this.userImpl);
        C6482m0 c6482m0L = c6482m0.l("app");
        C6473i c6473i = this.app;
        if (c6473i == null) {
            Intrinsics.y("app");
        }
        c6482m0L.e0(c6473i);
        C6482m0 c6482m0L2 = c6482m0.l("device");
        P p10 = this.device;
        if (p10 == null) {
            Intrinsics.y("device");
        }
        c6482m0L2.e0(p10);
        c6482m0.l("breadcrumbs").e0(this.breadcrumbs);
        c6482m0.l("groupingHash").O(this.groupingHash);
        Map<String, Object> mapE = this.internalMetrics.e();
        if (!mapE.isEmpty()) {
            c6482m0.l("usage");
            c6482m0.d();
            for (Map.Entry<String, Object> entry : mapE.entrySet()) {
                c6482m0.l(entry.getKey()).e0(entry.getValue());
            }
            c6482m0.i();
        }
        c6482m0.l("threads");
        c6482m0.c();
        Iterator<T> it3 = this.threads.iterator();
        while (it3.hasNext()) {
            c6482m0.e0((Z0) it3.next());
        }
        c6482m0.h();
        c6482m0.l("featureFlags").e0(this.featureFlags);
        K0 k02 = this.session;
        if (k02 != null) {
            K0 copy = K0.a(k02);
            c6482m0.l("session").d();
            C6482m0 c6482m0L3 = c6482m0.l(PreferencesHelper.PREF_ID);
            Intrinsics.f(copy, "copy");
            c6482m0L3.O(copy.d());
            c6482m0.l("startedAt").e0(copy.e());
            c6482m0.l("events").d();
            c6482m0.l("handled").H(copy.c());
            c6482m0.l("unhandled").H(copy.f());
            c6482m0.i();
            c6482m0.i();
        }
        c6482m0.i();
    }

    public final void u(String str) {
        this.groupingHash = str;
    }

    public final void v(Q6.h hVar) {
        this.internalMetrics = hVar;
    }

    public final void w(Collection<String> collection) {
        this.projectPackages = collection;
    }

    public final void x(Collection<String> collection) {
        Collection<String> collection2 = collection;
        this.jsonStreamer.h(CollectionsKt.o1(collection2));
        this.metadata.m(CollectionsKt.o1(collection2));
    }

    public void y(String id2, String email, String name) {
        this.userImpl = new h1(id2, email, name);
    }

    public final void z(h1 h1Var) {
        this.userImpl = h1Var;
    }

    protected final boolean o(V event) {
        String strB;
        List<S> listE = event.e();
        Intrinsics.f(listE, "event.errors");
        if (!listE.isEmpty()) {
            S error = listE.get(0);
            Intrinsics.f(error, "error");
            strB = error.b();
        } else {
            strB = null;
        }
        return Intrinsics.e("ANR", strB);
    }

    public final void p() {
        if (g().size() == 1) {
            List<S> list = this.errors;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<R0> listD = ((S) it.next()).d();
                Intrinsics.f(listD, "it.stacktrace");
                CollectionsKt.C(arrayList, listD);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((R0) it2.next()).b(null);
            }
        }
    }

    @JvmOverloads
    public X(Throwable th2, ImmutableConfig immutableConfig, P0 p02, Metadata c6503x0, C6466e0 c6466e0) {
        List listA;
        String apiKey = immutableConfig.getApiKey();
        InterfaceC6495t0 logger = immutableConfig.getLogger();
        ArrayList arrayList = new ArrayList();
        Set setO1 = CollectionsKt.o1(immutableConfig.i());
        if (th2 == null) {
            listA = new ArrayList();
        } else {
            listA = S.a(th2, immutableConfig.w(), immutableConfig.getLogger());
            Intrinsics.f(listA, "Error.createError(origin…tPackages, config.logger)");
        }
        this(apiKey, logger, arrayList, setO1, listA, c6503x0.e(), c6466e0.b(), th2, immutableConfig.w(), p02, new c1(th2, p02.f(), immutableConfig).b(), new h1(null, null, null, 7, null), CollectionsKt.o1(immutableConfig.x()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ X(java.lang.String r18, com.bugsnag.android.InterfaceC6495t0 r19, java.util.List r20, java.util.Set r21, java.util.List r22, com.bugsnag.android.Metadata r23, com.bugsnag.android.C6466e0 r24, java.lang.Throwable r25, java.util.Collection r26, com.bugsnag.android.P0 r27, java.util.List r28, com.bugsnag.android.h1 r29, java.util.Set r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
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
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            com.bugsnag.android.x0 r1 = new com.bugsnag.android.x0
            r1.<init>(r3, r2, r3)
            r8 = r1
            goto L37
        L35:
            r8 = r23
        L37:
            r1 = r0 & 64
            if (r1 == 0) goto L42
            com.bugsnag.android.e0 r1 = new com.bugsnag.android.e0
            r1.<init>(r3, r2, r3)
            r9 = r1
            goto L44
        L42:
            r9 = r24
        L44:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L4a
            r10 = r3
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
            if (r1 == 0) goto L6b
            java.lang.String r1 = "handledException"
            com.bugsnag.android.P0 r1 = com.bugsnag.android.P0.h(r1)
            java.lang.String r2 = "SeverityReason.newInstan…REASON_HANDLED_EXCEPTION)"
            kotlin.jvm.internal.Intrinsics.f(r1, r2)
            r12 = r1
            goto L6d
        L6b:
            r12 = r27
        L6d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L78
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13 = r1
            goto L7a
        L78:
            r13 = r28
        L7a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L97
            com.bugsnag.android.h1 r1 = new com.bugsnag.android.h1
            r2 = 7
            r4 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r20 = r1
            r24 = r2
            r25 = r4
            r21 = r14
            r22 = r15
            r23 = r16
            r20.<init>(r21, r22, r23, r24, r25)
            r14 = r1
            goto L99
        L97:
            r14 = r29
        L99:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto La5
            r15 = r3
            r2 = r17
            r4 = r19
            r3 = r18
            goto Lad
        La5:
            r15 = r30
            r2 = r17
            r3 = r18
            r4 = r19
        Lad:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.X.<init>(java.lang.String, com.bugsnag.android.t0, java.util.List, java.util.Set, java.util.List, com.bugsnag.android.x0, com.bugsnag.android.e0, java.lang.Throwable, java.util.Collection, com.bugsnag.android.P0, java.util.List, com.bugsnag.android.h1, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public X(String str, InterfaceC6495t0 interfaceC6495t0, List<Breadcrumb> list, Set<String> set, List<S> list2, Metadata c6503x0, C6466e0 c6466e0, Throwable th2, Collection<String> collection, P0 p02, List<Z0> list3, h1 h1Var, Set<String> set2) {
        D0 d02 = new D0();
        d02.h(CollectionsKt.o1(d02.c()));
        Unit unit = Unit.f142422a;
        this.jsonStreamer = d02;
        this.internalMetrics = new Q6.j();
        this.logger = interfaceC6495t0;
        this.apiKey = str;
        this.breadcrumbs = list;
        this.discardClasses = set;
        this.errors = list2;
        this.metadata = c6503x0;
        this.featureFlags = c6466e0;
        this.originalError = th2;
        this.projectPackages = collection;
        this.severityReason = p02;
        this.threads = list3;
        this.userImpl = h1Var;
        if (set2 != null) {
            x(set2);
        }
    }
}
