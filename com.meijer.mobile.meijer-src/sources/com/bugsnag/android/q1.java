package com.bugsnag.android;

import R6.ImmutableConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/q1;", "LS6/a;", "LS6/b;", "configModule", "Lcom/bugsnag/android/f1;", "storageModule", "Lcom/bugsnag/android/s;", "client", "LR6/b;", "bgTaskService", "Lcom/bugsnag/android/r;", "callbackState", "<init>", "(LS6/b;Lcom/bugsnag/android/f1;Lcom/bugsnag/android/s;LR6/b;Lcom/bugsnag/android/r;)V", "LR6/k;", "c", "LR6/k;", "config", "Lcom/bugsnag/android/B0;", "d", "Lcom/bugsnag/android/B0;", "b", "()Lcom/bugsnag/android/B0;", "launchCrashTracker", "LS6/e;", "Lcom/bugsnag/android/Z0;", "e", "LS6/e;", "()LS6/e;", "sessionTracker", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class q1 extends S6.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final B0 launchCrashTracker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final S6.e<Z0> sessionTracker;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/q1$a", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends S6.e<Z0> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6617s f64347e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q1 f64348f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ CallbackState f64349g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f1 f64350h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ R6.b f64351i;

        public a(C6617s c6617s, q1 q1Var, CallbackState callbackState, f1 f1Var, R6.b bVar) {
            this.f64347e = c6617s;
            this.f64348f = q1Var;
            this.f64349g = callbackState;
            this.f64350h = f1Var;
            this.f64351i = bVar;
        }

        @Override // S6.e
        public Z0 f() {
            this.f64347e.h();
            return new Z0(this.f64348f.config, this.f64349g, this.f64347e, this.f64350h.f().get(), this.f64348f.config.getLogger(), this.f64351i);
        }
    }

    public q1(S6.b bVar, f1 f1Var, C6617s c6617s, R6.b bVar2, CallbackState callbackState) {
        super(bVar2, null, 2, null);
        ImmutableConfig config = bVar.getConfig();
        this.config = config;
        this.launchCrashTracker = new B0(config, null, 2, null);
        R6.b bVar3 = this.bgTaskService;
        R6.t tVar = this.taskType;
        a aVar = new a(c6617s, this, callbackState, f1Var, bVar2);
        bVar3.b(tVar, aVar);
        this.sessionTracker = aVar;
    }

    /* renamed from: b, reason: from getter */
    public final B0 getLaunchCrashTracker() {
        return this.launchCrashTracker;
    }

    public final S6.e<Z0> c() {
        return this.sessionTracker;
    }
}
