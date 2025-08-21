package com.bugsnag.android;

import R6.ImmutableConfig;
import android.content.Context;
import com.bugsnag.android.V;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u0010\u0010\u0017R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00128\u0006¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u001f\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00128\u0006¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006*"}, d2 = {"Lcom/bugsnag/android/f1;", "LS6/a;", "Landroid/content/Context;", "appContext", "LR6/k;", "immutableConfig", "LR6/b;", "bgTaskService", "<init>", "(Landroid/content/Context;LR6/k;LR6/b;)V", "Lcom/bugsnag/android/s1;", "initialUser", "LS6/d;", "Lcom/bugsnag/android/t1;", "i", "(Lcom/bugsnag/android/s1;)LS6/d;", "c", "LR6/k;", "LS6/e;", "Ljava/io/File;", "d", "LS6/e;", "b", "()LS6/e;", "bugsnagDir", "Lcom/bugsnag/android/b1;", "e", "g", "sharedPrefMigrator", "Lcom/bugsnag/android/V;", "f", "deviceIdStore", "Lcom/bugsnag/android/v1;", "h", "userStore", "Lcom/bugsnag/android/z0;", "lastRunInfoStore", "Lcom/bugsnag/android/Y0;", "sessionStore", "Lcom/bugsnag/android/y0;", "j", "lastRunInfo", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class f1 extends S6.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig immutableConfig;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final S6.e<File> bugsnagDir;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final S6.e<b1> sharedPrefMigrator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final S6.e<V> deviceIdStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final S6.e<v1> userStore;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final S6.e<C6632z0> lastRunInfoStore;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final S6.e<Y0> sessionStore;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final S6.e<LastRunInfo> lastRunInfo;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$a", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends S6.e<t1> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s1 f64227f;

        public a(s1 s1Var) {
            this.f64227f = s1Var;
        }

        @Override // S6.e
        public t1 f() {
            t1 t1VarB = f1.this.h().get().b(this.f64227f);
            b1 b1VarA = f1.this.g().a();
            if (b1VarA == null) {
                return t1VarB;
            }
            b1VarA.b();
            return t1VarB;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$b", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends S6.e<LastRunInfo> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S6.d f64228e;

        public b(S6.d dVar) {
            this.f64228e = dVar;
        }

        @Override // S6.e
        public LastRunInfo f() {
            C6632z0 c6632z0 = (C6632z0) this.f64228e.get();
            LastRunInfo lastRunInfoD = c6632z0.d();
            c6632z0.f(new LastRunInfo(0, false, false));
            return lastRunInfoD;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$c", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends S6.e<File> {
        public c() {
        }

        @Override // S6.e
        public File f() {
            return R6.e.a(f1.this.immutableConfig.x());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$d", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends S6.e<b1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f64230e;

        public d(Context context) {
            this.f64230e = context;
        }

        @Override // S6.e
        public b1 f() {
            return new b1(this.f64230e);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$e", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e extends S6.e<V> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f64232f;

        public e(Context context) {
            this.f64232f = context;
        }

        @Override // S6.e
        public V f() {
            S6.e<b1> eVarG = f1.this.g();
            D0 logger = f1.this.immutableConfig.getLogger();
            return new V(this.f64232f, null, null, null, null, eVarG, f1.this.immutableConfig, logger, 30, null);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$f", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f extends S6.e<v1> {
        public f() {
        }

        @Override // S6.e
        public v1 f() {
            boolean persistUser = f1.this.immutableConfig.getPersistUser();
            S6.e<File> eVarB = f1.this.b();
            f1 f1Var = f1.this;
            i iVar = new i(f1Var.c());
            f1Var.bgTaskService.b(f1Var.taskType, iVar);
            return new v1(persistUser, eVarB, iVar, null, f1.this.g(), f1.this.immutableConfig.getLogger(), 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$g", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g extends S6.e<C6632z0> {
        public g() {
        }

        @Override // S6.e
        public C6632z0 f() {
            return new C6632z0(f1.this.immutableConfig);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$h", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class h extends S6.e<Y0> {
        public h() {
        }

        @Override // S6.e
        public Y0 f() {
            return new Y0(f1.this.b().get(), f1.this.immutableConfig.getMaxPersistedSessions(), f1.this.immutableConfig.getApiKey(), f1.this.immutableConfig.getLogger(), null);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f1$i", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class i extends S6.e<V.DeviceIds> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S6.d f64236e;

        public i(S6.d dVar) {
            this.f64236e = dVar;
        }

        @Override // S6.e
        public V.DeviceIds f() {
            return ((V) this.f64236e.get()).a();
        }
    }

    public f1(Context context, ImmutableConfig immutableConfig, R6.b bVar) {
        super(bVar, R6.t.IO);
        this.immutableConfig = immutableConfig;
        R6.b bVar2 = this.bgTaskService;
        R6.t tVar = this.taskType;
        c cVar = new c();
        bVar2.b(tVar, cVar);
        this.bugsnagDir = cVar;
        R6.b bVar3 = this.bgTaskService;
        R6.t tVar2 = this.taskType;
        d dVar = new d(context);
        bVar3.b(tVar2, dVar);
        this.sharedPrefMigrator = dVar;
        R6.b bVar4 = this.bgTaskService;
        R6.t tVar3 = this.taskType;
        e eVar = new e(context);
        bVar4.b(tVar3, eVar);
        this.deviceIdStore = eVar;
        R6.b bVar5 = this.bgTaskService;
        R6.t tVar4 = this.taskType;
        f fVar = new f();
        bVar5.b(tVar4, fVar);
        this.userStore = fVar;
        R6.b bVar6 = this.bgTaskService;
        R6.t tVar5 = this.taskType;
        g gVar = new g();
        bVar6.b(tVar5, gVar);
        this.lastRunInfoStore = gVar;
        R6.b bVar7 = this.bgTaskService;
        R6.t tVar6 = this.taskType;
        h hVar = new h();
        bVar7.b(tVar6, hVar);
        this.sessionStore = hVar;
        b bVar8 = new b(gVar);
        this.bgTaskService.b(this.taskType, bVar8);
        this.lastRunInfo = bVar8;
    }

    public final S6.e<File> b() {
        return this.bugsnagDir;
    }

    public final S6.e<V> c() {
        return this.deviceIdStore;
    }

    public final S6.e<LastRunInfo> d() {
        return this.lastRunInfo;
    }

    public final S6.e<C6632z0> e() {
        return this.lastRunInfoStore;
    }

    public final S6.e<Y0> f() {
        return this.sessionStore;
    }

    public final S6.e<b1> g() {
        return this.sharedPrefMigrator;
    }

    public final S6.e<v1> h() {
        return this.userStore;
    }

    public final S6.d<t1> i(s1 initialUser) {
        R6.b bVar = this.bgTaskService;
        R6.t tVar = this.taskType;
        a aVar = new a(initialUser);
        bVar.b(tVar, aVar);
        return aVar;
    }
}
