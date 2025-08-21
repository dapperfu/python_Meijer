package p8;

import B2.InterfaceC2911h;
import F2.f;
import F2.i;
import F2.j;
import android.content.Context;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mv.C0;
import mv.C15784P;
import mv.C15800f0;
import mv.C15807j;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.X0;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 12\u00020\u0001:\u0001\u001dB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)¨\u00062"}, d2 = {"Lp8/c;", "", "LB2/h;", "LF2/f;", "dataStore", "Lmv/O;", "scope", "<init>", "(LB2/h;Lmv/O;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "j", "()V", "", "o", "(I)I", "n", "newSessionId", "", "newVisitorId", "p", "(IJ)V", "l", "()I", "m", "()J", "k", "a", "LB2/h;", "b", "Lmv/O;", "c", "Ljava/lang/Integer;", "sessionId", "d", "Ljava/lang/Long;", "visitorId", "Lmv/C0;", "e", "Lmv/C0;", "preloadJob", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "preloadInProgress", "g", "writeJob", "h", "agent.core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    private static final f.a<Integer> f156207i = i.e(PreferencesHelper.SESSION_ID);

    /* renamed from: j, reason: collision with root package name */
    private static final f.a<Long> f156208j = i.f("visitor_id");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<F2.f> dataStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O scope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile Integer sessionId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile Long visitorId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private C0 preloadJob;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean preloadInProgress;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C0 writeJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.android.agent.data.SessionParameterStore$ensurePreloadComplete$1", f = "SessionParameterStore.kt", l = {103}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156216a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156216a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C0 c02 = c.this.preloadJob;
                if (c02 != null) {
                    this.f156216a = 1;
                    if (c02.o0(this) == objF) {
                        return objF;
                    }
                } else {
                    return null;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.android.agent.data.SessionParameterStore$flush$1$1", f = "SessionParameterStore.kt", l = {175}, m = "invokeSuspend")
    /* renamed from: p8.c$c, reason: collision with other inner class name */
    static final class C2418c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f156219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2418c(C0 c02, Continuation<? super C2418c> continuation) {
            super(2, continuation);
            this.f156219b = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2418c(this.f156219b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C2418c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156218a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C0 c02 = this.f156219b;
                this.f156218a = 1;
                if (c02.o0(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.android.agent.data.SessionParameterStore$preload$1", f = "SessionParameterStore.kt", l = {86}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156220a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.dynatrace.android.agent.data.SessionParameterStore$preload$1$sessionParameters$1", f = "SessionParameterStore.kt", l = {84}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function3<InterfaceC16562g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f156222a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f156223b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f156224c;

            a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super F2.f> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
                a aVar = new a(continuation);
                aVar.f156223b = interfaceC16562g;
                aVar.f156224c = th2;
                return aVar.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f156222a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f156223b;
                    z8.f.b("dtxSessionParameter", "failed to read session parameters from data store", (Throwable) this.f156224c);
                    F2.f fVarA = F2.g.a();
                    this.f156223b = null;
                    this.f156222a = 1;
                    if (interfaceC16562g.emit(fVarA, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iO;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156220a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fG = C16563h.g(c.this.dataStore.getData(), new a(null));
                this.f156220a = 1;
                obj = C16563h.A(interfaceC16561fG, this);
                if (obj == objF) {
                    return objF;
                }
            }
            F2.f fVar = (F2.f) obj;
            c cVar = c.this;
            Integer num = (Integer) fVar.b(c.f156207i);
            if (num != null) {
                iO = c.this.o(num.intValue());
            } else {
                iO = 0;
            }
            cVar.sessionId = Boxing.d(iO);
            c cVar2 = c.this;
            Long lE = (Long) fVar.b(c.f156208j);
            if (lE == null) {
                lE = Boxing.e(0L);
            }
            cVar2.visitorId = lE;
            z8.f.a("dtxSessionParameter", "preloading completed: sessionId: " + c.this.sessionId + ", visitorId: " + c.this.visitorId);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.android.agent.data.SessionParameterStore$update$1", f = "SessionParameterStore.kt", l = {123}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156225a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f156227c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f156228d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "sessionParameters", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.dynatrace.android.agent.data.SessionParameterStore$update$1$1", f = "SessionParameterStore.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f156229a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f156230b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f156231c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f156232d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, long j10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f156231c = i10;
                this.f156232d = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f156231c, this.f156232d, continuation);
                aVar.f156230b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f156229a == 0) {
                    ResultKt.b(obj);
                    F2.c cVar = (F2.c) this.f156230b;
                    cVar.i(c.f156207i, Boxing.d(this.f156231c));
                    cVar.i(c.f156208j, Boxing.e(this.f156232d));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, long j10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f156227c = i10;
            this.f156228d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new e(this.f156227c, this.f156228d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156225a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC2911h interfaceC2911h = c.this.dataStore;
                    a aVar = new a(this.f156227c, this.f156228d, null);
                    this.f156225a = 1;
                    if (j.a(interfaceC2911h, aVar, this) == objF) {
                        return objF;
                    }
                }
            } catch (IOException e10) {
                z8.f.b("dtxSessionParameter", "failed to write to data store", e10);
            }
            return Unit.f143329a;
        }
    }

    public c(InterfaceC2911h<F2.f> dataStore, InterfaceC15783O scope) {
        Intrinsics.j(dataStore, "dataStore");
        Intrinsics.j(scope, "scope");
        this.dataStore = dataStore;
        this.scope = scope;
        this.preloadInProgress = new AtomicBoolean(false);
    }

    public final synchronized void p(int newSessionId, long newVisitorId) throws Throwable {
        Throwable th2;
        int iO;
        try {
            try {
                iO = o(newSessionId);
                this.sessionId = Integer.valueOf(iO);
                this.visitorId = Long.valueOf(newVisitorId);
                C0 c02 = this.writeJob;
                if (c02 != null) {
                    try {
                        C0.a.a(c02, null, 1, null);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                this.writeJob = C15809k.d(this.scope, null, null, new e(iO, newVisitorId, null), 3, null);
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void k() throws InterruptedException {
        C0 c02 = this.writeJob;
        if (c02 == null || !c02.a()) {
            return;
        }
        z8.f.a("dtxSessionParameter", "need to wait for updates to be written to data store");
        C15807j.b(null, new C2418c(c02, null), 1, null);
    }

    public final int l() throws InterruptedException {
        Integer num = this.sessionId;
        if (num != null) {
            return num.intValue();
        }
        j();
        Integer num2 = this.sessionId;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final long m() throws InterruptedException {
        Long l10 = this.visitorId;
        if (l10 != null) {
            return l10.longValue();
        }
        j();
        Long l11 = this.visitorId;
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    public final void n() {
        if (this.preloadInProgress.compareAndSet(false, true)) {
            this.preloadJob = C15809k.d(this.scope, null, null, new d(null), 3, null);
        }
    }

    private final void j() throws InterruptedException {
        n();
        C15807j.b(null, new b(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(int i10) {
        if (i10 < Integer.MAX_VALUE && i10 >= 0) {
            return i10;
        }
        z8.f.a("dtxSessionParameter", "session id is out of range and will be reset to 0");
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(p8.e.c(context), C15784P.a(X0.b(null, 1, null).n0(C15800f0.a())));
        Intrinsics.j(context, "context");
    }
}
