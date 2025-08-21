package androidx.compose.foundation.gestures;

import H1.y;
import androidx.compose.foundation.gestures.d;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.EnumC13564E;
import g1.PointerInputChange;
import h0.l;
import kotlin.C13928q;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13925n;
import kotlin.InterfaceC13929r;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012<\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\u00020\u001f*\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u0010*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010!JO\u0010'\u001a\u00020\u00152=\u0010&\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00150\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160#H\u0096@¢\u0006\u0004\b'\u0010(J\u001a\u0010)\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010-JÏ\u0001\u0010.\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172<\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104RL\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106RL\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/foundation/gestures/e;", "Lf0/r;", "state", "Lkotlin/Function1;", "Lg1/B;", "", "canDrag", "Lf0/z;", "orientation", "enabled", "Lh0/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lmv/O;", "LU0/f;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Lf0/r;Lkotlin/jvm/functions/Function1;Lf0/z;ZLh0/l;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "LH1/y;", "r3", "(J)J", "s3", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/d$b;", "dragDelta", "forEachDelta", "Z2", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d3", "(J)V", "e3", "i3", "()Z", "t3", "z", "Lf0/r;", "A", "Lf0/z;", "B", "Z", "C", "Lkotlin/jvm/functions/Function3;", "D", "E", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private EnumC13937z orientation;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean startDragImmediately;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Function3<? super InterfaceC15783O, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Function3<? super InterfaceC15783O, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13929r state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {309}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48516a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48517b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f48519d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f48519d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = f.this.new b(this.f48519d, continuation);
            bVar.f48517b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48516a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f48517b;
                Function3 function3 = f.this.onDragStarted;
                U0.f fVarD = U0.f.d(this.f48519d);
                this.f48516a = 1;
                if (function3.invoke(interfaceC15783O, fVarD, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {316}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48520a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48521b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f48523d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f48523d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = f.this.new c(this.f48523d, continuation);
            cVar.f48521b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48520a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f48521b;
                Function3 function3 = f.this.onDragStopped;
                Float fC = Boxing.c(C13928q.k(f.this.r3(this.f48523d), f.this.orientation));
                this.f48520a = 1;
                if (function3.invoke(interfaceC15783O, fC, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/n;", "", "<anonymous>", "(Lf0/n;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC13925n, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48510a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d.b, Unit>, Continuation<? super Unit>, Object> f48512c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f48513d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/d$b;", "dragDelta", "", "a", "(Landroidx/compose/foundation/gestures/d$b;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.f$a$a, reason: collision with other inner class name */
        static final class C1006a extends Lambda implements Function1<d.b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC13925n f48514f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ f f48515g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1006a(InterfaceC13925n interfaceC13925n, f fVar) {
                super(1);
                this.f48514f = interfaceC13925n;
                this.f48515g = fVar;
            }

            public final void a(d.b bVar) {
                this.f48514f.a(C13928q.j(this.f48515g.s3(bVar.getDelta()), this.f48515g.orientation));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(d.b bVar) {
                a(bVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super d.b, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f48512c = function2;
            this.f48513d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f48512c, this.f48513d, continuation);
            aVar.f48511b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13925n interfaceC13925n, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC13925n, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48510a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13925n interfaceC13925n = (InterfaceC13925n) this.f48511b;
                Function2<Function1<? super d.b, Unit>, Continuation<? super Unit>, Object> function2 = this.f48512c;
                C1006a c1006a = new C1006a(interfaceC13925n, this.f48513d);
                this.f48510a = 1;
                if (function2.invoke(c1006a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r3(long j10) {
        return y.m(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s3(long j10) {
        return U0.f.r(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.e
    public Object Z2(Function2<? super Function1<? super d.b, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objA = this.state.a(EnumC13564E.f127648b, new a(function2, this, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }

    @Override // androidx.compose.foundation.gestures.e
    /* renamed from: i3, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void t3(InterfaceC13929r state, Function1<? super PointerInputChange, Boolean> canDrag, EnumC13937z orientation, boolean enabled, l interactionSource, boolean startDragImmediately, Function3<? super InterfaceC15783O, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super InterfaceC15783O, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z10;
        boolean z11 = true;
        if (Intrinsics.e(this.state, state)) {
            z10 = false;
        } else {
            this.state = state;
            z10 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z10 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z11 = z10;
        }
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.startDragImmediately = startDragImmediately;
        k3(canDrag, enabled, interactionSource, orientation, z11);
    }

    public f(InterfaceC13929r interfaceC13929r, Function1<? super PointerInputChange, Boolean> function1, EnumC13937z enumC13937z, boolean z10, l lVar, boolean z11, Function3<? super InterfaceC15783O, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super InterfaceC15783O, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z12) {
        super(function1, z10, lVar, enumC13937z);
        this.state = interfaceC13929r;
        this.orientation = enumC13937z;
        this.startDragImmediately = z11;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z12;
    }

    @Override // androidx.compose.foundation.gestures.e
    public void d3(long startedPosition) {
        if (getIsAttached() && !Intrinsics.e(this.onDragStarted, C13928q.f131330a)) {
            C15809k.d(j2(), null, EnumC15785Q.f151688d, new b(startedPosition, null), 1, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.e
    public void e3(long velocity) {
        if (getIsAttached() && !Intrinsics.e(this.onDragStopped, C13928q.f131331b)) {
            C15809k.d(j2(), null, EnumC15785Q.f151688d, new c(velocity, null), 1, null);
        }
    }
}
