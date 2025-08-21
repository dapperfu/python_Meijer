package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.InterfaceC5872l0;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/o0;", "", "Landroidx/compose/ui/node/Owner;", "owner", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/f1;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "session", "c", "(Landroidx/compose/ui/node/Owner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/platform/o0;", "parent", "Landroidx/compose/ui/platform/a1;", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/ui/platform/a1;", "setInterceptor", "(Landroidx/compose/ui/platform/a1;)V", "interceptor", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6020o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6020o0 parent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 interceptor;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
    /* renamed from: androidx.compose.ui.platform.o0$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f52337a;

        /* renamed from: c, reason: collision with root package name */
        int f52339c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52337a = obj;
            this.f52339c |= Integer.MIN_VALUE;
            return C6020o0.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/f1;", "", "<anonymous>", "(Landroidx/compose/ui/platform/f1;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.o0$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC5994f1, Continuation<?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f52340a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52341b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC5994f1, Continuation<?>, Object> f52342c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6020o0 f52343d;

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/ui/platform/o0$b$a", "Landroidx/compose/ui/platform/f1;", "Landroidx/compose/ui/platform/b1;", "request", "", "a", "(Landroidx/compose/ui/platform/b1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.o0$b$a */
        public static final class a implements InterfaceC5994f1 {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ InterfaceC5994f1 f52344a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5994f1 f52345b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AtomicReference f52346c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C6020o0 f52347d;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod")
            /* renamed from: androidx.compose.ui.platform.o0$b$a$a, reason: collision with other inner class name */
            static final class C1078a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f52348a;

                /* renamed from: c, reason: collision with root package name */
                int f52350c;

                C1078a(Continuation<? super C1078a> continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f52348a = obj;
                    this.f52350c |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "it", "", "a", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.ui.platform.o0$b$a$b, reason: collision with other inner class name */
            static final class C1079b extends Lambda implements Function1<InterfaceC15783O, Unit> {

                /* renamed from: f, reason: collision with root package name */
                public static final C1079b f52351f = new C1079b();

                C1079b() {
                    super(1);
                }

                public final void a(InterfaceC15783O interfaceC15783O) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15783O interfaceC15783O) {
                    a(interfaceC15783O);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.o0$b$a$c */
            static final class c extends SuspendLambda implements Function2<Unit, Continuation<?>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f52352a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C6020o0 f52353b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5982b1 f52354c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5994f1 f52355d;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/a1;", "c", "()Landroidx/compose/ui/platform/a1;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: androidx.compose.ui.platform.o0$b$a$c$a, reason: collision with other inner class name */
                static final class C1080a extends Lambda implements Function0<InterfaceC5979a1> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C6020o0 f52356f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1080a(C6020o0 c6020o0) {
                        super(0);
                        this.f52356f = c6020o0;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final InterfaceC5979a1 invoke() {
                        return this.f52356f.b();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C6020o0 c6020o0, InterfaceC5982b1 interfaceC5982b1, InterfaceC5994f1 interfaceC5994f1, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f52353b = c6020o0;
                    this.f52354c = interfaceC5982b1;
                    this.f52355d = interfaceC5994f1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f52353b, this.f52354c, this.f52355d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Unit unit, Continuation<?> continuation) {
                    return ((c) create(unit, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/a1;", "interceptor", "", "<anonymous>", "(Landroidx/compose/ui/platform/a1;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
                /* renamed from: androidx.compose.ui.platform.o0$b$a$c$b, reason: collision with other inner class name */
                static final class C1081b extends SuspendLambda implements Function2<InterfaceC5979a1, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f52357a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f52358b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5982b1 f52359c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5994f1 f52360d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1081b(InterfaceC5982b1 interfaceC5982b1, InterfaceC5994f1 interfaceC5994f1, Continuation<? super C1081b> continuation) {
                        super(2, continuation);
                        this.f52359c = interfaceC5982b1;
                        this.f52360d = interfaceC5994f1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1081b c1081b = new C1081b(this.f52359c, this.f52360d, continuation);
                        c1081b.f52358b = obj;
                        return c1081b;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(InterfaceC5979a1 interfaceC5979a1, Continuation<? super Unit> continuation) {
                        return ((C1081b) create(interfaceC5979a1, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f52357a;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                        } else {
                            ResultKt.b(obj);
                            InterfaceC5979a1 interfaceC5979a1 = (InterfaceC5979a1) this.f52358b;
                            InterfaceC5982b1 interfaceC5982b1 = this.f52359c;
                            InterfaceC5994f1 interfaceC5994f1 = this.f52360d;
                            this.f52357a = 1;
                            if (interfaceC5979a1.a(interfaceC5982b1, interfaceC5994f1, this) == objF) {
                                return objF;
                            }
                        }
                        throw new KotlinNothingValueException();
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f52352a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16561f interfaceC16561fQ = androidx.compose.runtime.o1.q(new C1080a(this.f52353b));
                        C1081b c1081b = new C1081b(this.f52354c, this.f52355d, null);
                        this.f52352a = 1;
                        if (C16563h.k(interfaceC16561fQ, c1081b, this) == objF) {
                            return objF;
                        }
                    }
                    throw new IllegalStateException("Interceptors flow should never terminate.");
                }
            }

            @Override // mv.InterfaceC15783O
            public CoroutineContext getCoroutineContext() {
                return this.f52344a.getCoroutineContext();
            }

            @Override // androidx.compose.ui.platform.InterfaceC5991e1
            public View getView() {
                return this.f52344a.getView();
            }

            a(InterfaceC5994f1 interfaceC5994f1, AtomicReference atomicReference, C6020o0 c6020o0) {
                this.f52345b = interfaceC5994f1;
                this.f52346c = atomicReference;
                this.f52347d = c6020o0;
                this.f52344a = interfaceC5994f1;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // androidx.compose.ui.platform.InterfaceC5991e1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object a(androidx.compose.ui.platform.InterfaceC5982b1 r9, kotlin.coroutines.Continuation<?> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof androidx.compose.ui.platform.C6020o0.b.a.C1078a
                    if (r0 == 0) goto L13
                    r0 = r10
                    androidx.compose.ui.platform.o0$b$a$a r0 = (androidx.compose.ui.platform.C6020o0.b.a.C1078a) r0
                    int r1 = r0.f52350c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f52350c = r1
                    goto L18
                L13:
                    androidx.compose.ui.platform.o0$b$a$a r0 = new androidx.compose.ui.platform.o0$b$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f52348a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f52350c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 == r3) goto L2d
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L2d:
                    kotlin.ResultKt.b(r10)
                    goto L4b
                L31:
                    kotlin.ResultKt.b(r10)
                    java.util.concurrent.atomic.AtomicReference r10 = r8.f52346c
                    androidx.compose.ui.platform.o0$b$a$b r2 = androidx.compose.ui.platform.C6020o0.b.a.C1079b.f52351f
                    androidx.compose.ui.platform.o0$b$a$c r4 = new androidx.compose.ui.platform.o0$b$a$c
                    androidx.compose.ui.platform.o0 r5 = r8.f52347d
                    androidx.compose.ui.platform.f1 r6 = r8.f52345b
                    r7 = 0
                    r4.<init>(r5, r9, r6, r7)
                    r0.f52350c = r3
                    java.lang.Object r9 = P0.n.d(r10, r2, r4, r0)
                    if (r9 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
                    r9.<init>()
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6020o0.b.a.a(androidx.compose.ui.platform.b1, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super InterfaceC5994f1, ? super Continuation<?>, ? extends Object> function2, C6020o0 c6020o0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f52342c = function2;
            this.f52343d = c6020o0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f52342c, this.f52343d, continuation);
            bVar.f52341b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5994f1 interfaceC5994f1, Continuation<?> continuation) {
            return ((b) create(interfaceC5994f1, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f52340a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                a aVar = new a((InterfaceC5994f1) this.f52341b, P0.n.a(), this.f52343d);
                Function2<InterfaceC5994f1, Continuation<?>, Object> function2 = this.f52342c;
                this.f52340a = 1;
                if (function2.invoke(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5979a1 b() {
        return (InterfaceC5979a1) this.interceptor.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(androidx.compose.ui.node.Owner r6, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.InterfaceC5994f1, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<?> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.platform.C6020o0.a
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.o0$a r0 = (androidx.compose.ui.platform.C6020o0.a) r0
            int r1 = r0.f52339c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52339c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.o0$a r0 = new androidx.compose.ui.platform.o0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f52337a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f52339c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.ResultKt.b(r8)
            goto L45
        L31:
            kotlin.ResultKt.b(r8)
            androidx.compose.ui.platform.o0 r8 = r5.parent
            androidx.compose.ui.platform.o0$b r2 = new androidx.compose.ui.platform.o0$b
            r4 = 0
            r2.<init>(r7, r5, r4)
            r0.f52339c = r3
            java.lang.Object r6 = androidx.compose.ui.platform.C5988d1.a(r6, r8, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C6020o0.c(androidx.compose.ui.node.Owner, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
