package com.bugsnag.android;

import R6.ImmutableConfig;
import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import com.bugsnag.android.V;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b'\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002030*8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b,\u0010.¨\u00066"}, d2 = {"Lcom/bugsnag/android/D;", "LS6/a;", "LS6/c;", "contextModule", "LS6/b;", "configModule", "LS6/f;", "systemServiceModule", "Lcom/bugsnag/android/q1;", "trackerModule", "LR6/b;", "bgTaskService", "Lcom/bugsnag/android/y;", "connectivity", "LS6/d;", "Lcom/bugsnag/android/V;", "deviceIdStore", "Lcom/bugsnag/android/G0;", "memoryTrimState", "<init>", "(LS6/c;LS6/b;LS6/f;Lcom/bugsnag/android/q1;LR6/b;Lcom/bugsnag/android/y;LS6/d;Lcom/bugsnag/android/G0;)V", "Landroid/content/Context;", "c", "Landroid/content/Context;", "ctx", "LR6/k;", "d", "LR6/k;", "cfg", "Lcom/bugsnag/android/D0;", "e", "Lcom/bugsnag/android/D0;", "logger", "Lcom/bugsnag/android/N;", "f", "Lcom/bugsnag/android/N;", "deviceBuildInfo", "Ljava/io/File;", "kotlin.jvm.PlatformType", "g", "Ljava/io/File;", "dataDir", "LS6/e;", "Lcom/bugsnag/android/k;", "h", "LS6/e;", "()LS6/e;", "appDataCollector", "", "i", "rootDetection", "Lcom/bugsnag/android/Q;", "j", "deviceDataCollector", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class D extends S6.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context ctx;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig cfg;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final N deviceBuildInfo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final File dataDir;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final S6.e<C6602k> appDataCollector;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final S6.e<Boolean> rootDetection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final S6.e<Q> deviceDataCollector;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/D$a", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends S6.e<V.DeviceIds> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S6.d f63892e;

        public a(S6.d dVar) {
            this.f63892e = dVar;
        }

        @Override // S6.e
        public V.DeviceIds f() {
            return ((V) this.f63892e.get()).a();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/D$b", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends S6.e<C6602k> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q1 f63894f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S6.f f63895g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ G0 f63896h;

        public b(q1 q1Var, S6.f fVar, G0 g02) {
            this.f63894f = q1Var;
            this.f63895g = fVar;
            this.f63896h = g02;
        }

        @Override // S6.e
        public C6602k f() {
            return new C6602k(D.this.ctx, D.this.ctx.getPackageManager(), D.this.cfg, this.f63894f.c().get(), this.f63895g.getActivityManager(), this.f63894f.getLaunchCrashTracker(), this.f63896h);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/D$c", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends S6.e<Boolean> {
        public c() {
        }

        @Override // S6.e
        public Boolean f() {
            return Boolean.valueOf(new RootDetector(D.this.deviceBuildInfo, null, null, D.this.logger, 6, null).g());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/D$d", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends S6.e<Q> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6629y f63898e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D f63899f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S6.d f63900g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ R6.b f63901h;

        public d(InterfaceC6629y interfaceC6629y, D d10, S6.d dVar, R6.b bVar) {
            this.f63898e = interfaceC6629y;
            this.f63899f = d10;
            this.f63900g = dVar;
            this.f63901h = bVar;
        }

        @Override // S6.e
        public Q f() {
            InterfaceC6629y interfaceC6629y = this.f63898e;
            Context context = this.f63899f.ctx;
            Resources resources = this.f63899f.ctx.getResources();
            D d10 = this.f63899f;
            a aVar = new a(this.f63900g);
            d10.bgTaskService.b(d10.taskType, aVar);
            return new Q(interfaceC6629y, context, resources, aVar, this.f63899f.deviceBuildInfo, this.f63899f.dataDir, this.f63899f.rootDetection, this.f63901h, this.f63899f.logger);
        }
    }

    public D(S6.c cVar, S6.b bVar, S6.f fVar, q1 q1Var, R6.b bVar2, InterfaceC6629y interfaceC6629y, S6.d<V> dVar, G0 g02) {
        super(bVar2, null, 2, null);
        this.ctx = cVar.getCtx();
        ImmutableConfig config = bVar.getConfig();
        this.cfg = config;
        this.logger = config.getLogger();
        this.deviceBuildInfo = N.INSTANCE.a();
        this.dataDir = Environment.getDataDirectory();
        R6.b bVar3 = this.bgTaskService;
        R6.t tVar = this.taskType;
        b bVar4 = new b(q1Var, fVar, g02);
        bVar3.b(tVar, bVar4);
        this.appDataCollector = bVar4;
        R6.b bVar5 = this.bgTaskService;
        R6.t tVar2 = this.taskType;
        c cVar2 = new c();
        bVar5.b(tVar2, cVar2);
        this.rootDetection = cVar2;
        R6.b bVar6 = this.bgTaskService;
        R6.t tVar3 = this.taskType;
        d dVar2 = new d(interfaceC6629y, this, dVar, bVar2);
        bVar6.b(tVar3, dVar2);
        this.deviceDataCollector = dVar2;
    }

    public final S6.e<C6602k> g() {
        return this.appDataCollector;
    }

    public final S6.e<Q> h() {
        return this.deviceDataCollector;
    }
}
