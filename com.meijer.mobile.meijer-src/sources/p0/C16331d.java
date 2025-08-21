package p0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.C;
import androidx.compose.ui.node.C5957k;
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
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import o1.C16067b;
import o1.InterfaceC16066a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lp0/d;", "Landroidx/compose/ui/Modifier$c;", "Lo1/a;", "Landroidx/compose/ui/node/C;", "Lp0/c;", "responder", "<init>", "(Lp0/c;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "s", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "J0", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "Lp0/c;", "M2", "()Lp0/c;", "setResponder", "", "p", "Z", "o2", "()Z", "shouldAutoInvalidate", "q", "hasBeenPlaced", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16331d extends Modifier.c implements InterfaceC16066a, C {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16330c responder;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean hasBeenPlaced;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lmv/C0;", "<anonymous>", "(Lmv/O;)Lmv/C0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: p0.d$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super C0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155981a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f155982b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LayoutCoordinates f155984d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Rect> f155985e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Rect> f155986f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend")
        /* renamed from: p0.d$a$a, reason: collision with other inner class name */
        static final class C2413a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155987a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16331d f155988b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LayoutCoordinates f155989c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Rect> f155990d;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: p0.d$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C2414a extends FunctionReferenceImpl implements Function0<Rect> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C16331d f155991b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LayoutCoordinates f155992c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function0<Rect> f155993d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2414a(C16331d c16331d, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
                    super(0, Intrinsics.Kotlin.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f155991b = c16331d;
                    this.f155992c = layoutCoordinates;
                    this.f155993d = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Rect invoke() {
                    return C16331d.L2(this.f155991b, this.f155992c, this.f155993d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2413a(C16331d c16331d, LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super C2413a> continuation) {
                super(2, continuation);
                this.f155988b = c16331d;
                this.f155989c = layoutCoordinates;
                this.f155990d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2413a(this.f155988b, this.f155989c, this.f155990d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C2413a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f155987a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16330c responder = this.f155988b.getResponder();
                    C2414a c2414a = new C2414a(this.f155988b, this.f155989c, this.f155990d);
                    this.f155987a = 1;
                    if (responder.J1(c2414a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend")
        /* renamed from: p0.d$a$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f155994a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C16331d f155995b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Rect> f155996c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C16331d c16331d, Function0<Rect> function0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f155995b = c16331d;
                this.f155996c = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f155995b, this.f155996c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f155994a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C16331d c16331d = this.f155995b;
                    Function0<Rect> function0 = this.f155996c;
                    this.f155994a = 1;
                    if (C16067b.a(c16331d, function0, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Function0<Rect> function02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f155984d = layoutCoordinates;
            this.f155985e = function0;
            this.f155986f = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C16331d.this.new a(this.f155984d, this.f155985e, this.f155986f, continuation);
            aVar.f155982b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super C0> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f155981a == 0) {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f155982b;
                C15809k.d(interfaceC15783O, null, null, new C2413a(C16331d.this, this.f155984d, this.f155985e, null), 3, null);
                return C15809k.d(interfaceC15783O, null, null, new b(C16331d.this, this.f155986f, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "c", "()Landroidx/compose/ui/geometry/Rect;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: p0.d$b */
    static final class b extends Lambda implements Function0<Rect> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LayoutCoordinates f155998g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Rect> f155999h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
            super(0);
            this.f155998g = layoutCoordinates;
            this.f155999h = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Rect invoke() {
            Rect rectL2 = C16331d.L2(C16331d.this, this.f155998g, this.f155999h);
            if (rectL2 != null) {
                return C16331d.this.getResponder().w1(rectL2);
            }
            return null;
        }
    }

    @Override // androidx.compose.ui.node.C
    public void s(LayoutCoordinates coordinates) {
        this.hasBeenPlaced = true;
    }

    @Override // o1.InterfaceC16066a
    public Object J0(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new a(layoutCoordinates, function0, new b(layoutCoordinates, function0), null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    /* renamed from: M2, reason: from getter */
    public final InterfaceC16330c getResponder() {
        return this.responder;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public C16331d(InterfaceC16330c interfaceC16330c) {
        this.responder = interfaceC16330c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect L2(C16331d c16331d, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
        Rect rectInvoke;
        if (!c16331d.getIsAttached() || !c16331d.hasBeenPlaced) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesM = C5957k.m(c16331d);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null && (rectInvoke = function0.invoke()) != null) {
            return C16329b.b(layoutCoordinatesM, layoutCoordinates, rectInvoke);
        }
        return null;
    }
}
