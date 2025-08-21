package com.bugsnag.android;

import R6.ImmutableConfig;
import R6.TrimMetrics;
import com.bugsnag.android.C6624v0;
import com.bugsnag.android.G;
import com.bugsnag.android.k1;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\u001fB;\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010 R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R.\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010,R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00108¨\u0006:"}, d2 = {"Lcom/bugsnag/android/e0;", "Lcom/bugsnag/android/v0$a;", "Lcom/bugsnag/android/G;", "", "apiKey", "Lcom/bugsnag/android/b0;", "event", "Ljava/io/File;", "eventFile", "Lcom/bugsnag/android/M0;", "notifier", "LR6/k;", "config", "<init>", "(Ljava/lang/String;Lcom/bugsnag/android/b0;Ljava/io/File;Lcom/bugsnag/android/M0;LR6/k;)V", "b", "()Lcom/bugsnag/android/b0;", "", "Lcom/bugsnag/android/ErrorType;", "d", "()Ljava/util/Set;", "", "maxSizeBytes", "h", "(I)Lcom/bugsnag/android/e0;", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "", "a", "()[B", "g", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "LR6/k;", "<set-?>", "Lcom/bugsnag/android/b0;", "getEvent", "setEvent$bugsnag_android_core_release", "(Lcom/bugsnag/android/b0;)V", "Ljava/io/File;", "getEventFile$bugsnag_android_core_release", "()Ljava/io/File;", "e", "[B", "cachedBytes", "f", "Lcom/bugsnag/android/M0;", "getNotifier$bugsnag_android_core_release", "()Lcom/bugsnag/android/M0;", "Lcom/bugsnag/android/D0;", "()Lcom/bugsnag/android/D0;", "logger", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6591e0 implements C6624v0.a, G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String apiKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C6585b0 event;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private File eventFile;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private byte[] cachedBytes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final M0 notifier;

    @JvmOverloads
    public C6591e0(String str, C6585b0 c6585b0, M0 m02, ImmutableConfig immutableConfig) {
        this(str, c6585b0, null, m02, immutableConfig, 4, null);
    }

    public final byte[] g() {
        this.cachedBytes = null;
        return a();
    }

    @JvmOverloads
    public C6591e0(String str, C6585b0 c6585b0, File file, M0 m02, ImmutableConfig immutableConfig) {
        this.apiKey = str;
        this.config = immutableConfig;
        this.event = c6585b0;
        this.eventFile = file;
        M0 m03 = new M0(m02.getName(), m02.getVersion(), m02.getUrl());
        m03.e(CollectionsKt.m1(m02.a()));
        this.notifier = m03;
    }

    private final C6585b0 b() {
        C6585b0 c6585b0 = this.event;
        if (c6585b0 != null) {
            return c6585b0;
        }
        File file = this.eventFile;
        Intrinsics.g(file);
        String apiKey = this.apiKey;
        if (apiKey == null) {
            apiKey = this.config.getApiKey();
        }
        C6585b0 c6585b0C = new F0(file, apiKey, f()).invoke();
        this.event = c6585b0C;
        return c6585b0C;
    }

    private final D0 f() {
        return this.config.getLogger();
    }

    public static /* synthetic */ C6591e0 i(C6591e0 c6591e0, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 999700;
        }
        return c6591e0.h(i10);
    }

    @Override // com.bugsnag.android.G
    public byte[] a() throws IOException {
        byte[] bArr = this.cachedBytes;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrG = R6.q.f32021a.g(this);
        this.cachedBytes = bArrG;
        return bArrG;
    }

    /* renamed from: c, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final Set<ErrorType> d() {
        C6589d0 c6589d0F;
        C6585b0 c6585b0 = this.event;
        Set<ErrorType> setH = (c6585b0 == null || (c6589d0F = c6585b0.f()) == null) ? null : c6589d0F.h();
        if (setH != null) {
            return setH;
        }
        File file = this.eventFile;
        Set<ErrorType> setD = file != null ? EventFilenameInfo.INSTANCE.i(file, this.config).d() : null;
        return setD == null ? SetsKt.e() : setD;
    }

    public String e() {
        return G.a.a(this);
    }

    @JvmOverloads
    public final C6591e0 h(int maxSizeBytes) {
        if (a().length > maxSizeBytes) {
            C6585b0 c6585b0B = b();
            TrimMetrics trimMetricsD = c6585b0B.f().D(this.config.getMaxStringValueLength());
            c6585b0B.f().getInternalMetrics().b(trimMetricsD.getItemsTrimmed(), trimMetricsD.getDataTrimmed());
            int size = c6585b0B.i().size();
            int maxReportedThreads = this.config.getMaxReportedThreads();
            if (size > maxReportedThreads) {
                c6585b0B.i().subList(maxReportedThreads, size).clear();
                c6585b0B.i().add(new k1("", '[' + (size - maxReportedThreads) + " threads omitted as the maxReportedThreads limit (" + maxReportedThreads + ") was exceeded]", ErrorType.UNKNOWN, false, k1.b.UNKNOWN, new d1(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, this.config.y(), f()), f()));
            }
            byte[] bArrG = g();
            if (bArrG.length > maxSizeBytes) {
                TrimMetrics trimMetricsC = c6585b0B.f().C(bArrG.length - maxSizeBytes);
                c6585b0B.f().getInternalMetrics().d(trimMetricsC.d(), trimMetricsC.c());
                g();
                return this;
            }
        }
        return this;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws Throwable {
        writer.d();
        writer.l("apiKey").O(this.apiKey);
        writer.l("payloadVersion").O("4.0");
        writer.l("notifier").e0(this.notifier);
        writer.l("events").c();
        C6585b0 c6585b0 = this.event;
        if (c6585b0 != null) {
            writer.e0(c6585b0);
        } else {
            File file = this.eventFile;
            if (file != null) {
                writer.e0(file);
            }
        }
        writer.h();
        writer.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6591e0(String str, C6585b0 c6585b0, File file, M0 m02, ImmutableConfig immutableConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ImmutableConfig immutableConfig2;
        M0 m03;
        File file2;
        c6585b0 = (i10 & 2) != 0 ? null : c6585b0;
        if ((i10 & 4) != 0) {
            immutableConfig2 = immutableConfig;
            m03 = m02;
            file2 = null;
        } else {
            immutableConfig2 = immutableConfig;
            m03 = m02;
            file2 = file;
        }
        this(str, c6585b0, file2, m03, immutableConfig2);
    }
}
