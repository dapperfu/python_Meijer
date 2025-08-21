package com.bugsnag.android;

import R6.ImmutableConfig;
import com.bugsnag.android.AbstractC6613p0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00188\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Lcom/bugsnag/android/f0;", "LS6/a;", "LS6/c;", "contextModule", "LS6/b;", "configModule", "Lcom/bugsnag/android/D;", "dataCollectionModule", "LR6/b;", "bgTaskService", "Lcom/bugsnag/android/q1;", "trackerModule", "LS6/f;", "systemServiceModule", "Lcom/bugsnag/android/M0;", "notifier", "Lcom/bugsnag/android/r;", "callbackState", "<init>", "(LS6/c;LS6/b;Lcom/bugsnag/android/D;LR6/b;Lcom/bugsnag/android/q1;LS6/f;Lcom/bugsnag/android/M0;Lcom/bugsnag/android/r;)V", "LR6/k;", "c", "LR6/k;", "cfg", "LS6/e;", "Lcom/bugsnag/android/t0;", "d", "LS6/e;", "delegate", "Lcom/bugsnag/android/k0;", "e", "()LS6/e;", "eventStore", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6593f0 extends S6.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig cfg;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final S6.e<C6620t0> delegate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final S6.e<C6603k0> eventStore;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f0$a", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.f0$a */
    public static final class a extends S6.e<C6620t0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S6.c f64208f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S6.f f64209g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ D f64210h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ q1 f64211i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ M0 f64212j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ R6.b f64213k;

        public a(S6.c cVar, S6.f fVar, D d10, q1 q1Var, M0 m02, R6.b bVar) {
            this.f64208f = cVar;
            this.f64209g = fVar;
            this.f64210h = d10;
            this.f64211i = q1Var;
            this.f64212j = m02;
            this.f64213k = bVar;
        }

        @Override // S6.e
        public C6620t0 f() {
            if (C6593f0.this.cfg.E().contains(j1.INTERNAL_ERRORS)) {
                return new C6620t0(this.f64208f.getCtx(), C6593f0.this.cfg.getLogger(), C6593f0.this.cfg, this.f64209g.getStorageManager(), this.f64210h.g().get(), this.f64210h.h(), this.f64211i.c().get(), this.f64212j, this.f64213k);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/bugsnag/android/f0$b", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.f0$b */
    public static final class b extends S6.e<C6603k0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ M0 f64215f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ R6.b f64216g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CallbackState f64217h;

        public b(M0 m02, R6.b bVar, CallbackState callbackState) {
            this.f64215f = m02;
            this.f64216g = bVar;
            this.f64217h = callbackState;
        }

        @Override // S6.e
        public C6603k0 f() {
            return new C6603k0(C6593f0.this.cfg, C6593f0.this.cfg.getLogger(), this.f64215f, this.f64216g, (AbstractC6613p0.a) C6593f0.this.delegate.a(), this.f64217h);
        }
    }

    public C6593f0(S6.c cVar, S6.b bVar, D d10, R6.b bVar2, q1 q1Var, S6.f fVar, M0 m02, CallbackState callbackState) {
        super(bVar2, null, 2, null);
        this.cfg = bVar.getConfig();
        R6.b bVar3 = this.bgTaskService;
        R6.t tVar = this.taskType;
        a aVar = new a(cVar, fVar, d10, q1Var, m02, bVar2);
        bVar3.b(tVar, aVar);
        this.delegate = aVar;
        R6.b bVar4 = this.bgTaskService;
        R6.t tVar2 = this.taskType;
        b bVar5 = new b(m02, bVar2, callbackState);
        bVar4.b(tVar2, bVar5);
        this.eventStore = bVar5;
    }

    public final S6.e<C6603k0> c() {
        return this.eventStore;
    }
}
