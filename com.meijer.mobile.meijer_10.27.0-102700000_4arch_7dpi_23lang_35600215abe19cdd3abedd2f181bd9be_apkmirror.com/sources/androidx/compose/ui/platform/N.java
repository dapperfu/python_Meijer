package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;
import qv.C16658p;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/N;", "Landroidx/compose/ui/platform/f1;", "Lqv/O;", "Landroid/view/View;", "view", "Lz1/O;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Lz1/O;Lqv/O;)V", "Landroidx/compose/ui/platform/b1;", "request", "", "a", "(Landroidx/compose/ui/platform/b1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "d", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Lz1/O;", "c", "Lqv/O;", "LP0/n;", "Landroidx/compose/ui/platform/K0;", "Ljava/util/concurrent/atomic/AtomicReference;", "methodSessionMutex", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "e", "()Z", "isReadyForConnection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N implements InterfaceC5852f1, InterfaceC16622O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z1.O textInputService;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference methodSessionMutex = P0.n.a();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f51851a;

        /* renamed from: c, reason: collision with root package name */
        int f51853c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51851a = obj;
            this.f51853c |= Integer.MIN_VALUE;
            return N.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "it", "Landroidx/compose/ui/platform/K0;", "a", "(Lqv/O;)Landroidx/compose/ui/platform/K0;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<InterfaceC16622O, K0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5840b1 f51854f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ N f51855g;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ N f51856f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N n10) {
                super(0);
                this.f51856f = n10;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C16623P.f(this.f51856f.coroutineScope, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5840b1 interfaceC5840b1, N n10) {
            super(1);
            this.f51854f = interfaceC5840b1;
            this.f51855g = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K0 invoke(InterfaceC16622O interfaceC16622O) {
            return new K0(this.f51854f, new a(this.f51855g));
        }
    }

    @Override // qv.InterfaceC16622O
    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/K0;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/K0;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<K0, Continuation<?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f51857a;

        /* renamed from: b, reason: collision with root package name */
        int f51858b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f51859c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ K0 f51861f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ N f51862g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K0 k02, N n10) {
                super(1);
                this.f51861f = k02;
                this.f51862g = n10;
            }

            public final void a(Throwable th2) {
                this.f51861f.d();
                this.f51862g.textInputService.f();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f142422a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = N.this.new c(continuation);
            cVar.f51859c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K0 k02, Continuation<?> continuation) {
            return ((c) create(k02, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f51858b;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                K0 k02 = (K0) this.f51859c;
                N n10 = N.this;
                this.f51859c = k02;
                this.f51857a = n10;
                this.f51858b = 1;
                C16658p c16658p = new C16658p(IntrinsicsKt.c(this), 1);
                c16658p.C();
                n10.textInputService.e();
                c16658p.F(new a(k02, n10));
                Object objV = c16658p.v();
                if (objV == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (objV == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.InterfaceC5849e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(androidx.compose.ui.platform.InterfaceC5840b1 r6, kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.N.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.N$a r0 = (androidx.compose.ui.platform.N.a) r0
            int r1 = r0.f51853c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51853c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.N$a r0 = new androidx.compose.ui.platform.N$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51851a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f51853c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.ResultKt.b(r7)
            goto L4a
        L31:
            kotlin.ResultKt.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.N$b r2 = new androidx.compose.ui.platform.N$b
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.N$c r6 = new androidx.compose.ui.platform.N$c
            r4 = 0
            r6.<init>(r4)
            r0.f51853c = r3
            java.lang.Object r6 = P0.n.d(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.N.a(androidx.compose.ui.platform.b1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InputConnection d(EditorInfo outAttrs) {
        K0 k02 = (K0) P0.n.c(this.methodSessionMutex);
        if (k02 != null) {
            return k02.c(outAttrs);
        }
        return null;
    }

    public final boolean e() {
        K0 k02 = (K0) P0.n.c(this.methodSessionMutex);
        return k02 != null && k02.e();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5849e1
    public View getView() {
        return this.view;
    }

    public N(View view, z1.O o10, InterfaceC16622O interfaceC16622O) {
        this.view = view;
        this.textInputService = o10;
        this.coroutineScope = interfaceC16622O;
    }
}
