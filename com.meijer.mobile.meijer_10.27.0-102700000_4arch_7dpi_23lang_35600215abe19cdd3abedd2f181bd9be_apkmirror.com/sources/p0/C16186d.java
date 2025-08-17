package p0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.C;
import androidx.compose.ui.node.C5815k;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o1.C15992b;
import o1.InterfaceC15991a;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lp0/d;", "Landroidx/compose/ui/Modifier$c;", "Lo1/a;", "Landroidx/compose/ui/node/C;", "Lp0/c;", "responder", "<init>", "(Lp0/c;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "s", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "J0", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "Lp0/c;", "M2", "()Lp0/c;", "setResponder", "", "p", "Z", "o2", "()Z", "shouldAutoInvalidate", "q", "hasBeenPlaced", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16186d extends Modifier.c implements InterfaceC15991a, C {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16185c responder;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean hasBeenPlaced;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lqv/C0;", "<anonymous>", "(Lqv/O;)Lqv/C0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: p0.d$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super C0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155307a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f155308b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LayoutCoordinates f155310d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Rect> f155311e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Rect> f155312f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend")
        /* renamed from: p0.d$a$a, reason: collision with other inner class name */
        static final class C2409a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155313a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16186d f155314b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LayoutCoordinates f155315c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Rect> f155316d;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: p0.d$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C2410a extends FunctionReferenceImpl implements Function0<Rect> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C16186d f155317b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LayoutCoordinates f155318c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function0<Rect> f155319d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2410a(C16186d c16186d, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
                    super(0, Intrinsics.Kotlin.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f155317b = c16186d;
                    this.f155318c = layoutCoordinates;
                    this.f155319d = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Rect invoke() {
                    return C16186d.L2(this.f155317b, this.f155318c, this.f155319d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2409a(C16186d c16186d, LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super C2409a> continuation) {
                super(2, continuation);
                this.f155314b = c16186d;
                this.f155315c = layoutCoordinates;
                this.f155316d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2409a(this.f155314b, this.f155315c, this.f155316d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2409a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f155313a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16185c responder = this.f155314b.getResponder();
                    C2410a c2410a = new C2410a(this.f155314b, this.f155315c, this.f155316d);
                    this.f155313a = 1;
                    if (responder.J1(c2410a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend")
        /* renamed from: p0.d$a$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155320a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16186d f155321b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Rect> f155322c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C16186d c16186d, Function0<Rect> function0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f155321b = c16186d;
                this.f155322c = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f155321b, this.f155322c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f155320a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C16186d c16186d = this.f155321b;
                    Function0<Rect> function0 = this.f155322c;
                    this.f155320a = 1;
                    if (C15992b.a(c16186d, function0, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Function0<Rect> function02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f155310d = layoutCoordinates;
            this.f155311e = function0;
            this.f155312f = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C16186d.this.new a(this.f155310d, this.f155311e, this.f155312f, continuation);
            aVar.f155308b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super C0> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f155307a == 0) {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f155308b;
                C16648k.d(interfaceC16622O, null, null, new C2409a(C16186d.this, this.f155310d, this.f155311e, null), 3, null);
                return C16648k.d(interfaceC16622O, null, null, new b(C16186d.this, this.f155312f, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "c", "()Landroidx/compose/ui/geometry/Rect;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: p0.d$b */
    static final class b extends Lambda implements Function0<Rect> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LayoutCoordinates f155324g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Rect> f155325h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
            super(0);
            this.f155324g = layoutCoordinates;
            this.f155325h = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Rect invoke() {
            Rect rectL2 = C16186d.L2(C16186d.this, this.f155324g, this.f155325h);
            if (rectL2 != null) {
                return C16186d.this.getResponder().w1(rectL2);
            }
            return null;
        }
    }

    @Override // androidx.compose.ui.node.C
    public void s(LayoutCoordinates coordinates) {
        this.hasBeenPlaced = true;
    }

    @Override // o1.InterfaceC15991a
    public Object J0(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new a(layoutCoordinates, function0, new b(layoutCoordinates, function0), null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    /* renamed from: M2, reason: from getter */
    public final InterfaceC16185c getResponder() {
        return this.responder;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public C16186d(InterfaceC16185c interfaceC16185c) {
        this.responder = interfaceC16185c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect L2(C16186d c16186d, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
        Rect rectInvoke;
        if (!c16186d.getIsAttached() || !c16186d.hasBeenPlaced) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesM = C5815k.m(c16186d);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null && (rectInvoke = function0.invoke()) != null) {
            return C16184b.b(layoutCoordinatesM, layoutCoordinates, rectInvoke);
        }
        return null;
    }
}
