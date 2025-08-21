package ct;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mv.C15809k;
import mv.C15837y;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import mv.W;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BK\u0012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0086P¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001a¨\u0006$"}, d2 = {"Lct/e;", "", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "factory", "", "keepDataInMemory", "Lkotlin/Function0;", "", "awaitListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lmv/O;", "scope", "Lmv/W;", "m", "(Lmv/O;)Lmv/W;", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function1;", "b", "c", "Lkotlin/jvm/functions/Function0;", "d", "Ljava/lang/Object;", "data", "e", "Z", "dataInitialized", "f", "Lmv/W;", "deferred", "g", "lock", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Continuation<? super T>, Object> factory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<T, Boolean> keepDataInMemory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> awaitListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile T data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile boolean dataInitialized;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile W<? extends T> deferred;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.util.CoalescingOrchestrator", f = "CoalescingOrchestrator.kt", l = {44}, m = "get")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f127577a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f127578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<T> f127579c;

        /* renamed from: d, reason: collision with root package name */
        int f127580d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<T> eVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f127579c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f127578b = obj;
            this.f127580d |= Integer.MIN_VALUE;
            return this.f127579c.l(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.util.CoalescingOrchestrator$get$result$1", f = "CoalescingOrchestrator.kt", l = {59}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f127581a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f127582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<e<T>> f127583c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef<e<T>> objectRef, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f127583c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f127583c, continuation);
            bVar.f127582b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [T, mv.C0, mv.W] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f127581a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f127582b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Object obj2 = ((e) this.f127583c.f143742a).lock;
                Ref.ObjectRef<e<T>> objectRef2 = this.f127583c;
                synchronized (obj2) {
                    if (((e) objectRef2.f143742a).dataInitialized) {
                        Object obj3 = ((e) objectRef2.f143742a).data;
                        if (obj3 == null) {
                            Intrinsics.x("data");
                            obj3 = Unit.f143329a;
                        }
                        return obj3;
                    }
                    ?? r52 = (T) ((e) objectRef2.f143742a).deferred;
                    if (r52 != 0 && !r52.isCancelled()) {
                        objectRef.f143742a = r52;
                    } else {
                        objectRef.f143742a = (T) objectRef2.f143742a.m(interfaceC15783O);
                    }
                    Unit unit = Unit.f143329a;
                    Function0 function0 = ((e) this.f127583c.f143742a).awaitListener;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    W w10 = (W) objectRef.f143742a;
                    this.f127581a = 1;
                    Object objH = w10.H(this);
                    if (objH == objF) {
                        return objF;
                    }
                    return objH;
                }
            } catch (CancellationException unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.util.CoalescingOrchestrator$loadDataAsync$local$1", f = "CoalescingOrchestrator.kt", l = {74}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f127584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T> f127585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<T> eVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f127585b = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f127585b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f127584a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Function1 function1 = ((e) this.f127585b).factory;
                this.f127584a = 1;
                obj = function1.invoke(this);
                if (obj == objF) {
                    return objF;
                }
            }
            Object obj2 = ((e) this.f127585b).lock;
            e<T> eVar = this.f127585b;
            synchronized (obj2) {
                try {
                    if (((Boolean) ((e) eVar).keepDataInMemory.invoke(obj)).booleanValue()) {
                        ((e) eVar).data = obj;
                        ((e) eVar).dataInitialized = true;
                    }
                    ((e) eVar).deferred = null;
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Function1<? super Continuation<? super T>, ? extends Object> factory, Function1<? super T, Boolean> keepDataInMemory, Function0<Unit> function0) {
        Intrinsics.j(factory, "factory");
        Intrinsics.j(keepDataInMemory, "keepDataInMemory");
        this.factory = factory;
        this.keepDataInMemory = keepDataInMemory;
        this.awaitListener = function0;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W<T> m(InterfaceC15783O scope) {
        C15837y c15837y = (W<? extends T>) C15809k.b(scope, null, EnumC15785Q.f151686b, new c(this, null), 1, null);
        this.deferred = c15837y;
        return c15837y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:24:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ct.e.a
            if (r0 == 0) goto L13
            r0 = r6
            ct.e$a r0 = (ct.e.a) r0
            int r1 = r0.f127580d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127580d = r1
            goto L18
        L13:
            ct.e$a r0 = new ct.e$a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f127578b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f127580d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f127577a
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.ResultKt.b(r6)
            goto L69
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            r6.f143742a = r5
            r2 = r6
        L40:
            T r6 = r2.f143742a
            ct.e r6 = (ct.e) r6
            boolean r6 = r6.dataInitialized
            if (r6 == 0) goto L58
            T r6 = r2.f143742a
            ct.e r6 = (ct.e) r6
            T r6 = r6.data
            if (r6 != 0) goto L57
            java.lang.String r6 = "data"
            kotlin.jvm.internal.Intrinsics.x(r6)
            kotlin.Unit r6 = kotlin.Unit.f143329a
        L57:
            return r6
        L58:
            ct.e$b r6 = new ct.e$b
            r4 = 0
            r6.<init>(r2, r4)
            r0.f127577a = r2
            r0.f127580d = r3
            java.lang.Object r6 = mv.C15784P.g(r6, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            if (r6 == 0) goto L6c
            return r6
        L6c:
            T r6 = r2.f143742a
            ct.e r6 = (ct.e) r6
            r2.f143742a = r6
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: ct.e.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ e(Function1 function1, Function1 function12, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, (i10 & 4) != 0 ? null : function0);
    }
}
