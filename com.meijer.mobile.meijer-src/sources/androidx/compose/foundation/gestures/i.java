package androidx.compose.foundation.gestures;

import H1.y;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.focus.H;
import androidx.compose.ui.focus.M;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.InterfaceC5954h;
import androidx.compose.ui.node.u0;
import androidx.compose.ui.node.v0;
import d0.C13586u;
import d0.EnumC13564E;
import d0.J;
import e1.C13749a;
import e1.C13751c;
import e1.C13752d;
import e1.InterfaceC13753e;
import f1.C13939b;
import f1.C13941d;
import f1.C13942e;
import g1.C14314q;
import g1.C14316t;
import g1.EnumC14315s;
import g1.PointerInputChange;
import h0.l;
import java.util.List;
import kotlin.C13898F;
import kotlin.C13903K;
import kotlin.C13916e;
import kotlin.C13920i;
import kotlin.C13922k;
import kotlin.C13934w;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13900H;
import kotlin.InterfaceC13918g;
import kotlin.InterfaceC13930s;
import kotlin.InterfaceC13936y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.w;
import mv.C15809k;
import mv.InterfaceC15783O;
import p0.C16331d;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJO\u0010)\u001a\u00020\u00182=\u0010(\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00180!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180&\u0012\u0006\u0012\u0004\u0018\u00010'0 H\u0096@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001aJ\u001a\u0010.\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001aJ\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u00100JU\u00101\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u0010\u001cJ\u000f\u00104\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u0010\u001cJ\u001a\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001a\u00109\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u00108J*\u0010@\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0013\u0010C\u001a\u00020\u0018*\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010L\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u00100R\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cRH\u0010j\u001a4\u0012\u0013\u0012\u00110e¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(f\u0012\u0013\u0012\u00110e¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020\r\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR4\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0&\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010o\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"Landroidx/compose/foundation/gestures/i;", "Landroidx/compose/foundation/gestures/e;", "Le1/e;", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/node/h;", "Lf0/H;", "state", "Ld0/J;", "overscrollEffect", "Lf0/s;", "flingBehavior", "Lf0/z;", "orientation", "", "enabled", "reverseDirection", "Lh0/l;", "interactionSource", "Lf0/g;", "bringIntoViewSpec", "<init>", "(Lf0/H;Ld0/J;Lf0/s;Lf0/z;ZZLh0/l;Lf0/g;)V", "LH1/y;", "velocity", "", "s3", "(J)V", "q3", "()V", "v3", "t3", "p3", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/d$b;", "Lkotlin/ParameterName;", "name", "dragDelta", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "Z2", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LU0/f;", "startedPosition", "d3", "e3", "i3", "()Z", "u3", "(Lf0/H;Lf0/z;Ld0/J;ZZLf0/s;Lh0/l;Lf0/g;)V", "t2", "M", "Le1/b;", "event", "r1", "(Landroid/view/KeyEvent;)Z", "V0", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "Lr1/u;", "T1", "(Lr1/u;)V", "z", "Ld0/J;", "A", "Lf0/s;", "B", "Z", "o2", "shouldAutoInvalidate", "Lf1/b;", "C", "Lf1/b;", "nestedScrollDispatcher", "Lf0/F;", "D", "Lf0/F;", "scrollableContainerNode", "Lf0/k;", "E", "Lf0/k;", "defaultFlingBehavior", "Lf0/K;", "F", "Lf0/K;", "scrollingLogic", "Landroidx/compose/foundation/gestures/h;", "G", "Landroidx/compose/foundation/gestures/h;", "nestedScrollConnection", "Lf0/i;", "H", "Lf0/i;", "contentInViewNode", "", "x", "y", "I", "Lkotlin/jvm/functions/Function2;", "scrollByAction", "J", "scrollByOffsetAction", "Lf0/w;", "K", "Lf0/w;", "mouseWheelScrollingLogic", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class i extends androidx.compose.foundation.gestures.e implements InterfaceC13753e, u0, InterfaceC5954h {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13930s flingBehavior;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C13939b nestedScrollDispatcher;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C13898F scrollableContainerNode;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final C13922k defaultFlingBehavior;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final C13903K scrollingLogic;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.gestures.h nestedScrollConnection;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final C13920i contentInViewNode;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Float, ? super Float, Boolean> scrollByAction;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Function2<? super U0.f, ? super Continuation<? super U0.f>, ? extends Object> scrollByOffsetAction;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private C13934w mouseWheelScrollingLogic;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private J overscrollEffect;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<LayoutCoordinates, Unit> {
        a() {
            super(1);
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            i.this.contentInViewNode.e3(layoutCoordinates);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/y;", "", "<anonymous>", "(Lf0/y;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {330}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC13936y, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48560a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d.b, Unit>, Continuation<? super Unit>, Object> f48562c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C13903K f48563d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/d$b;", "it", "", "a", "(Landroidx/compose/foundation/gestures/d$b;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<d.b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC13936y f48564f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C13903K f48565g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC13936y interfaceC13936y, C13903K c13903k) {
                super(1);
                this.f48564f = interfaceC13936y;
                this.f48565g = c13903k;
            }

            public final void a(d.b bVar) {
                this.f48564f.a(this.f48565g.C(bVar.getDelta()), C13942e.INSTANCE.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(d.b bVar) {
                a(bVar);
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f48562c, this.f48563d, continuation);
            bVar.f48561b = obj;
            return bVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super Function1<? super d.b, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, C13903K c13903k, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f48562c = function2;
            this.f48563d = c13903k;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13936y interfaceC13936y, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC13936y, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48560a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13936y interfaceC13936y = (InterfaceC13936y) this.f48561b;
                Function2<Function1<? super d.b, Unit>, Continuation<? super Unit>, Object> function2 = this.f48562c;
                a aVar = new a(interfaceC13936y, this.f48563d);
                this.f48560a = 1;
                if (function2.invoke(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class c extends AdaptedFunctionReference implements Function2<y, Continuation<? super Unit>, Object>, SuspendFunction {
        c(Object obj) {
            super(2, obj, i.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        public final Object a(long j10, Continuation<? super Unit> continuation) {
            return i.r3((i) this.f143708a, j10, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(y yVar, Continuation<? super Unit> continuation) {
            return a(yVar.getPackedValue(), continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {341}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48566a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f48568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f48568c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new d(this.f48568c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48566a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13903K c13903k = i.this.scrollingLogic;
                long j10 = this.f48568c;
                this.f48566a = 1;
                if (c13903k.u(j10, false, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {475}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48569a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f48571c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f48571c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new e(this.f48571c, continuation);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/y;", "", "<anonymous>", "(Lf0/y;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC13936y, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f48572a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f48573b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f48574c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f48574c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f48574c, continuation);
                aVar.f48573b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC13936y interfaceC13936y, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC13936y, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f48572a == 0) {
                    ResultKt.b(obj);
                    ((InterfaceC13936y) this.f48573b).b(this.f48574c, C13942e.INSTANCE.d());
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48569a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13903K c13903k = i.this.scrollingLogic;
                EnumC13564E enumC13564E = EnumC13564E.f127648b;
                a aVar = new a(this.f48571c, null);
                this.f48569a = 1;
                if (c13903k.z(enumC13564E, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", l = {347}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48575a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f48577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f48577c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new f(this.f48577c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48575a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13903K c13903k = i.this.scrollingLogic;
                long j10 = this.f48577c;
                this.f48575a = 1;
                if (c13903k.u(j10, true, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function0<Boolean> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(i.this.getIsAttached());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "", "a", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function2<Float, Float, Boolean> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {518}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f48580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f48581b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f48582c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f48583d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, float f10, float f11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f48581b = iVar;
                this.f48582c = f10;
                this.f48583d = f11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f48581b, this.f48582c, this.f48583d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f48580a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C13903K c13903k = this.f48581b.scrollingLogic;
                    float f10 = this.f48582c;
                    float f11 = this.f48583d;
                    long jE = U0.f.e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
                    this.f48580a = 1;
                    if (androidx.compose.foundation.gestures.g.l(c13903k, jE, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        h() {
            super(2);
        }

        public final Boolean a(float f10, float f11) {
            C15809k.d(i.this.j2(), null, null, new a(i.this, f10, f11, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
            return a(f10.floatValue(), f11.floatValue());
        }
    }

    private final void p3() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    @Override // e1.InterfaceC13753e
    public boolean V0(KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.e
    public void d3(long startedPosition) {
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/f;", "offset", "<anonymous>", "(LU0/f;)LU0/f;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.i$i, reason: collision with other inner class name */
    static final class C1007i extends SuspendLambda implements Function2<U0.f, Continuation<? super U0.f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48584a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ long f48585b;

        C1007i(Continuation<? super C1007i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1007i c1007i = i.this.new C1007i(continuation);
            c1007i.f48585b = ((U0.f) obj).getPackedValue();
            return c1007i;
        }

        public final Object d(long j10, Continuation<? super U0.f> continuation) {
            return ((C1007i) create(U0.f.d(j10), continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(U0.f fVar, Continuation<? super U0.f> continuation) {
            return d(fVar.getPackedValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48584a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            long j10 = this.f48585b;
            C13903K c13903k = i.this.scrollingLogic;
            this.f48584a = 1;
            Object objL = androidx.compose.foundation.gestures.g.l(c13903k, j10, this);
            if (objL == objF) {
                return objF;
            }
            return objL;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [f0.s] */
    public i(InterfaceC13900H interfaceC13900H, J j10, InterfaceC13930s interfaceC13930s, EnumC13937z enumC13937z, boolean z10, boolean z11, l lVar, InterfaceC13918g interfaceC13918g) {
        super(androidx.compose.foundation.gestures.g.f48524a, z10, lVar, enumC13937z);
        this.overscrollEffect = j10;
        this.flingBehavior = interfaceC13930s;
        C13939b c13939b = new C13939b();
        this.nestedScrollDispatcher = c13939b;
        this.scrollableContainerNode = (C13898F) K2(new C13898F(z10));
        C13922k c13922k = new C13922k(w.c(androidx.compose.foundation.gestures.g.f48527d), null, 2, null);
        this.defaultFlingBehavior = c13922k;
        J j11 = this.overscrollEffect;
        ?? r14 = this.flingBehavior;
        C13903K c13903k = new C13903K(interfaceC13900H, j11, r14 == 0 ? c13922k : r14, enumC13937z, z11, c13939b, new g());
        this.scrollingLogic = c13903k;
        androidx.compose.foundation.gestures.h hVar = new androidx.compose.foundation.gestures.h(c13903k, z10);
        this.nestedScrollConnection = hVar;
        C13920i c13920i = (C13920i) K2(new C13920i(enumC13937z, c13903k, z11, interfaceC13918g));
        this.contentInViewNode = c13920i;
        K2(C13941d.c(hVar, c13939b));
        K2(H.b(M.INSTANCE.b(), null, 2, null));
        K2(new C16331d(c13920i));
        K2(new C13586u(new a()));
    }

    private final void q3() {
        if (this.mouseWheelScrollingLogic == null) {
            this.mouseWheelScrollingLogic = new C13934w(this.scrollingLogic, C13916e.a(this), new c(this), C5957k.k(this));
        }
        C13934w c13934w = this.mouseWheelScrollingLogic;
        if (c13934w != null) {
            c13934w.v(j2());
        }
    }

    private final void s3(long velocity) {
        C15809k.d(this.nestedScrollDispatcher.e(), null, null, new f(velocity, null), 3, null);
    }

    private final void t3() {
        this.scrollByAction = new h();
        this.scrollByOffsetAction = new C1007i(null);
    }

    @Override // androidx.compose.foundation.gestures.e
    public Object Z2(Function2<? super Function1<? super d.b, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C13903K c13903k = this.scrollingLogic;
        Object objZ = c13903k.z(EnumC13564E.f127648b, new b(function2, c13903k, null), continuation);
        return objZ == IntrinsicsKt.f() ? objZ : Unit.f143329a;
    }

    @Override // androidx.compose.foundation.gestures.e
    public void e3(long velocity) {
        C15809k.d(this.nestedScrollDispatcher.e(), null, null, new d(velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.e
    /* renamed from: i3 */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.B();
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void u3(InterfaceC13900H state, EnumC13937z orientation, J overscrollEffect, boolean enabled, boolean reverseDirection, InterfaceC13930s flingBehavior, l interactionSource, InterfaceC13918g bringIntoViewSpec) {
        boolean z10;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.a(enabled);
            this.scrollableContainerNode.L2(enabled);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean zI = this.scrollingLogic.I(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.h3(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        k3(androidx.compose.foundation.gestures.g.f48524a, enabled, interactionSource, this.scrollingLogic.t() ? EnumC13937z.f131419a : EnumC13937z.f131420b, zI);
        if (z11) {
            p3();
            v0.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object r3(i iVar, long j10, Continuation continuation) {
        iVar.s3(j10);
        return Unit.f143329a;
    }

    private final void v3() {
        if (!getIsAttached()) {
            return;
        }
        this.defaultFlingBehavior.g(C5957k.k(this));
    }

    @Override // androidx.compose.ui.node.InterfaceC5956j, androidx.compose.ui.node.q0
    public void M() {
        v1();
        v3();
        C13934w c13934w = this.mouseWheelScrollingLogic;
        if (c13934w != null) {
            c13934w.z(C5957k.k(this));
        }
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(u uVar) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            t3();
        }
        Function2<? super Float, ? super Float, Boolean> function2 = this.scrollByAction;
        if (function2 != null) {
            s.Y(uVar, null, function2, 1, null);
        }
        Function2<? super U0.f, ? super Continuation<? super U0.f>, ? extends Object> function22 = this.scrollByOffsetAction;
        if (function22 != null) {
            s.Z(uVar, function22);
        }
    }

    @Override // e1.InterfaceC13753e
    public boolean r1(KeyEvent event) {
        float f10;
        long jE;
        float f11;
        if (getEnabled()) {
            long jA = C13752d.a(event);
            C13749a.Companion companion = C13749a.INSTANCE;
            if ((C13749a.q(jA, companion.l()) || C13749a.q(C13752d.a(event), companion.m())) && C13751c.e(C13752d.b(event), C13751c.INSTANCE.a()) && !C13752d.e(event)) {
                if (this.scrollingLogic.t()) {
                    int viewportSize = (int) (this.contentInViewNode.getViewportSize() & 4294967295L);
                    if (C13749a.q(C13752d.a(event), companion.m())) {
                        f11 = viewportSize;
                    } else {
                        f11 = -viewportSize;
                    }
                    jE = U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
                } else {
                    int viewportSize2 = (int) (this.contentInViewNode.getViewportSize() >> 32);
                    if (C13749a.q(C13752d.a(event), companion.m())) {
                        f10 = viewportSize2;
                    } else {
                        f10 = -viewportSize2;
                    }
                    jE = U0.f.e((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
                }
                C15809k.d(j2(), null, null, new e(jE, null), 3, null);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.compose.foundation.gestures.e, androidx.compose.ui.node.q0
    public void s1(C14314q pointerEvent, EnumC14315s pass, long bounds) {
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (a3().invoke(listC.get(i10)).booleanValue()) {
                super.s1(pointerEvent, pass, bounds);
                break;
            }
            i10++;
        }
        if (getEnabled()) {
            if (pass == EnumC14315s.f133968a && C14316t.i(pointerEvent.getType(), C14316t.INSTANCE.f())) {
                q3();
            }
            C13934w c13934w = this.mouseWheelScrollingLogic;
            if (c13934w != null) {
                c13934w.u(pointerEvent, pass, bounds);
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        v3();
        C13934w c13934w = this.mouseWheelScrollingLogic;
        if (c13934w != null) {
            c13934w.z(C5957k.k(this));
        }
    }
}
