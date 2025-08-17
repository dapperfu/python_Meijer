package com.bugsnag.android;

import Q6.ImmutableConfig;
import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/bugsnag/android/A;", "LR6/c;", "LR6/b;", "contextModule", "LR6/a;", "configModule", "LR6/d;", "systemServiceModule", "Lcom/bugsnag/android/f1;", "trackerModule", "LQ6/a;", "bgTaskService", "Lcom/bugsnag/android/v;", "connectivity", "", "deviceId", "internalDeviceId", "Lcom/bugsnag/android/w0;", "memoryTrimState", "<init>", "(LR6/b;LR6/a;LR6/d;Lcom/bugsnag/android/f1;LQ6/a;Lcom/bugsnag/android/v;Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/w0;)V", "Landroid/content/Context;", "b", "Landroid/content/Context;", "ctx", "LQ6/f;", "c", "LQ6/f;", "cfg", "Lcom/bugsnag/android/t0;", "d", "Lcom/bugsnag/android/t0;", "logger", "Lcom/bugsnag/android/J;", "e", "Lcom/bugsnag/android/J;", "deviceBuildInfo", "Ljava/io/File;", "kotlin.jvm.PlatformType", "f", "Ljava/io/File;", "dataDir", "Lcom/bugsnag/android/h;", "g", "Lkotlin/Lazy;", "j", "()Lcom/bugsnag/android/h;", "appDataCollector", "Lcom/bugsnag/android/RootDetector;", "h", "l", "()Lcom/bugsnag/android/RootDetector;", "rootDetector", "Lcom/bugsnag/android/K;", "i", "k", "()Lcom/bugsnag/android/K;", "deviceDataCollector", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class A extends R6.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context ctx;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig cfg;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final J deviceBuildInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final File dataDir;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy appDataCollector;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy rootDetector;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy deviceDataCollector;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/h;", "c", "()Lcom/bugsnag/android/h;"}, k = 3, mv = {1, 4, 2})
    static final class a extends Lambda implements Function0<C6471h> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f1 f63039g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ R6.d f63040h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C6501w0 f63041i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, R6.d dVar, C6501w0 c6501w0) {
            super(0);
            this.f63039g = f1Var;
            this.f63040h = dVar;
            this.f63041i = c6501w0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C6471h invoke() {
            return new C6471h(A.this.ctx, A.this.ctx.getPackageManager(), A.this.cfg, this.f63039g.getSessionTracker(), this.f63040h.getActivityManager(), this.f63039g.getLaunchCrashTracker(), this.f63041i);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/K;", "c", "()Lcom/bugsnag/android/K;"}, k = 3, mv = {1, 4, 2})
    static final class b extends Lambda implements Function0<K> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6498v f63043g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f63044h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f63045i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Q6.a f63046j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6498v interfaceC6498v, String str, String str2, Q6.a aVar) {
            super(0);
            this.f63043g = interfaceC6498v;
            this.f63044h = str;
            this.f63045i = str2;
            this.f63046j = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            InterfaceC6498v interfaceC6498v = this.f63043g;
            Context context = A.this.ctx;
            Resources resources = A.this.ctx.getResources();
            Intrinsics.f(resources, "ctx.resources");
            String str = this.f63044h;
            String str2 = this.f63045i;
            J j10 = A.this.deviceBuildInfo;
            File dataDir = A.this.dataDir;
            Intrinsics.f(dataDir, "dataDir");
            return new K(interfaceC6498v, context, resources, str, str2, j10, dataDir, A.this.l(), this.f63046j, A.this.logger);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/RootDetector;", "c", "()Lcom/bugsnag/android/RootDetector;"}, k = 3, mv = {1, 4, 2})
    static final class c extends Lambda implements Function0<RootDetector> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final RootDetector invoke() {
            return new RootDetector(A.this.deviceBuildInfo, null, null, A.this.logger, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RootDetector l() {
        return (RootDetector) this.rootDetector.getValue();
    }

    public final C6471h j() {
        return (C6471h) this.appDataCollector.getValue();
    }

    public final K k() {
        return (K) this.deviceDataCollector.getValue();
    }

    public A(R6.b bVar, R6.a aVar, R6.d dVar, f1 f1Var, Q6.a aVar2, InterfaceC6498v interfaceC6498v, String str, String str2, C6501w0 c6501w0) {
        this.ctx = bVar.getCtx();
        ImmutableConfig config = aVar.getConfig();
        this.cfg = config;
        this.logger = config.getLogger();
        this.deviceBuildInfo = J.INSTANCE.a();
        this.dataDir = Environment.getDataDirectory();
        this.appDataCollector = b(new a(f1Var, dVar, c6501w0));
        this.rootDetector = b(new c());
        this.deviceDataCollector = b(new b(interfaceC6498v, str, str2, aVar2));
    }
}
