package d0;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.d0;
import androidx.compose.ui.layout.e0;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C5813i;
import androidx.compose.ui.node.InterfaceC5812h;
import androidx.compose.ui.node.InterfaceC5825v;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.j0;
import androidx.compose.ui.node.u0;
import androidx.compose.ui.node.v0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o1.C15992b;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.InterfaceC16643h0;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001SB3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u001b\u0010!\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\r*\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u0004\u0018\u00010J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T"}, d2 = {"Ld0/t;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/node/v;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/i0;", "Landroidx/compose/ui/node/B0;", "Lh0/l;", "interactionSource", "Landroidx/compose/ui/focus/M;", "focusability", "Lkotlin/Function1;", "", "", "onFocusChange", "<init>", "(Lh0/l;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/focus/E;", "previousState", "currentState", "X2", "(Landroidx/compose/ui/focus/E;Landroidx/compose/ui/focus/E;)V", "Landroidx/compose/ui/layout/d0;", "Y2", "()Landroidx/compose/ui/layout/d0;", "W2", "()V", "isFocused", "T2", "(Z)V", "S2", "Lh0/i;", "interaction", "U2", "(Lh0/l;Lh0/i;)V", "Z2", "(Lh0/l;)V", "Lr1/u;", "T1", "(Lr1/u;)V", "v2", "B0", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "q", "Lh0/l;", "r", "Lkotlin/jvm/functions/Function1;", "s", "Z", "o2", "()Z", "shouldAutoInvalidate", "Lh0/d;", "t", "Lh0/d;", "focusedInteraction", "Landroidx/compose/ui/layout/d0$a;", "u", "Landroidx/compose/ui/layout/d0$a;", "pinnedHandle", "v", "Landroidx/compose/ui/layout/LayoutCoordinates;", "globalLayoutCoordinates", "Landroidx/compose/ui/focus/G;", "w", "Landroidx/compose/ui/focus/G;", "focusTargetNode", "Lkotlin/Function0;", "x", "Lkotlin/jvm/functions/Function0;", "requestFocus", "Ld0/u;", "V2", "()Ld0/u;", "focusedBoundsObserver", "", "Y", "()Ljava/lang/Object;", "traverseKey", "y", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13452t extends AbstractC5817m implements u0, InterfaceC5825v, InterfaceC5812h, i0, B0 {

    /* renamed from: y, reason: collision with root package name */
    private static final a f127006y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f127007z = 8;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private h0.l interactionSource;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Function1<Boolean, Unit> onFocusChange;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private h0.d focusedInteraction;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private d0.a pinnedHandle;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates globalLayoutCoordinates;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.focus.G focusTargetNode;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private Function0<Boolean> requestFocus;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld0/t$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.t$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.t$b */
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.G.u0(C13452t.this.focusTargetNode, 0, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {314}, m = "invokeSuspend")
    /* renamed from: d0.t$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f127017a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f127018b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.i f127019c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16643h0 f127020d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h0.l lVar, h0.i iVar, InterfaceC16643h0 interfaceC16643h0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f127018b = lVar;
            this.f127019c = iVar;
            this.f127020d = interfaceC16643h0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f127018b, this.f127019c, this.f127020d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f127017a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h0.l lVar = this.f127018b;
                h0.i iVar = this.f127019c;
                this.f127017a = 1;
                if (lVar.c(iVar, this) == objF) {
                    return objF;
                }
            }
            InterfaceC16643h0 interfaceC16643h0 = this.f127020d;
            if (interfaceC16643h0 != null) {
                interfaceC16643h0.dispose();
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.t$d */
    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.l f127021f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0.i f127022g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h0.l lVar, h0.i iVar) {
            super(1);
            this.f127021f = lVar;
            this.f127022g = iVar;
        }

        public final void a(Throwable th2) {
            this.f127021f.a(this.f127022g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.t$e */
    /* synthetic */ class e extends FunctionReferenceImpl implements Function2<androidx.compose.ui.focus.E, androidx.compose.ui.focus.E, Unit> {
        e(Object obj) {
            super(2, obj, C13452t.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        }

        public final void a(androidx.compose.ui.focus.E e10, androidx.compose.ui.focus.E e11) {
            ((C13452t) this.receiver).X2(e10, e11);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10, androidx.compose.ui.focus.E e11) {
            a(e10, e11);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", f = "Focusable.kt", l = {214}, m = "invokeSuspend")
    /* renamed from: d0.t$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f127023a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13452t.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f127023a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13452t c13452t = C13452t.this;
                this.f127023a = 1;
                if (C15992b.b(c13452t, null, this, 1, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.t$g */
    static final class g extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<d0> f127025f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C13452t f127026g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Ref.ObjectRef<d0> objectRef, C13452t c13452t) {
            super(0);
            this.f127025f = objectRef;
            this.f127026g = c13452t;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f127025f.f142835a = C5813i.a(this.f127026g, e0.a());
        }
    }

    public /* synthetic */ C13452t(h0.l lVar, int i10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, i10, function1);
    }

    public /* synthetic */ C13452t(h0.l lVar, int i10, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i11 & 2) != 0 ? androidx.compose.ui.focus.M.INSTANCE.a() : i10, (i11 & 4) != 0 ? null : function1, null);
    }

    private final void S2() {
        h0.d dVar;
        h0.l lVar = this.interactionSource;
        if (lVar != null && (dVar = this.focusedInteraction) != null) {
            lVar.a(new h0.e(dVar));
        }
        this.focusedInteraction = null;
    }

    private final void T2(boolean isFocused) {
        h0.l lVar = this.interactionSource;
        if (lVar != null) {
            if (!isFocused) {
                h0.d dVar = this.focusedInteraction;
                if (dVar != null) {
                    U2(lVar, new h0.e(dVar));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            h0.d dVar2 = this.focusedInteraction;
            if (dVar2 != null) {
                U2(lVar, new h0.e(dVar2));
                this.focusedInteraction = null;
            }
            h0.d dVar3 = new h0.d();
            U2(lVar, dVar3);
            this.focusedInteraction = dVar3;
        }
    }

    private final void W2() {
        C13453u c13453uV2;
        LayoutCoordinates layoutCoordinates = this.globalLayoutCoordinates;
        if (layoutCoordinates != null) {
            Intrinsics.g(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (c13453uV2 = V2()) == null) {
                return;
            }
            c13453uV2.K2(this.globalLayoutCoordinates);
        }
    }

    private final d0 Y2() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        j0.a(this, new g(objectRef, this));
        return (d0) objectRef.f142835a;
    }

    @Override // androidx.compose.ui.node.InterfaceC5825v
    public void O(LayoutCoordinates coordinates) {
        this.globalLayoutCoordinates = coordinates;
        if (this.focusTargetNode.d0().a()) {
            if (coordinates.isAttached()) {
                W2();
                return;
            }
            C13453u c13453uV2 = V2();
            if (c13453uV2 != null) {
                c13453uV2.K2(null);
            }
        }
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(r1.u uVar) {
        r1.s.k0(uVar, this.focusTargetNode.d0().a());
        if (this.requestFocus == null) {
            this.requestFocus = new b();
        }
        r1.s.W(uVar, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: Y */
    public Object getTraverseKey() {
        return f127006y;
    }

    public final void Z2(h0.l interactionSource) {
        if (Intrinsics.e(this.interactionSource, interactionSource)) {
            return;
        }
        S2();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void v2() {
        d0.a aVar = this.pinnedHandle;
        if (aVar != null) {
            aVar.release();
        }
        this.pinnedHandle = null;
    }

    private final void U2(h0.l lVar, h0.i iVar) {
        InterfaceC16643h0 interfaceC16643h0K;
        if (getIsAttached()) {
            C0 c02 = (C0) j2().getCoroutineContext().g(C0.INSTANCE);
            if (c02 != null) {
                interfaceC16643h0K = c02.K(new d(lVar, iVar));
            } else {
                interfaceC16643h0K = null;
            }
            C16648k.d(j2(), null, null, new c(lVar, iVar, interfaceC16643h0K, null), 3, null);
            return;
        }
        lVar.a(iVar);
    }

    private final C13453u V2() {
        if (getIsAttached()) {
            B0 b0A = androidx.compose.ui.node.C0.a(this, C13453u.INSTANCE);
            if (b0A instanceof C13453u) {
                return (C13453u) b0A;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(androidx.compose.ui.focus.E previousState, androidx.compose.ui.focus.E currentState) {
        boolean zA;
        if (!getIsAttached() || (zA = currentState.a()) == previousState.a()) {
            return;
        }
        Function1<Boolean, Unit> function1 = this.onFocusChange;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zA));
        }
        d0.a aVarA = null;
        if (zA) {
            C16648k.d(j2(), null, null, new f(null), 3, null);
            d0 d0VarY2 = Y2();
            if (d0VarY2 != null) {
                aVarA = d0VarY2.a();
            }
            this.pinnedHandle = aVarA;
            W2();
        } else {
            d0.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.pinnedHandle = null;
            C13453u c13453uV2 = V2();
            if (c13453uV2 != null) {
                c13453uV2.K2(null);
            }
        }
        v0.b(this);
        T2(zA);
    }

    @Override // androidx.compose.ui.node.i0
    public void B0() {
        d0.a aVarA;
        d0 d0VarY2 = Y2();
        if (this.focusTargetNode.d0().a()) {
            d0.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            if (d0VarY2 != null) {
                aVarA = d0VarY2.a();
            } else {
                aVarA = null;
            }
            this.pinnedHandle = aVarA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C13452t(h0.l lVar, int i10, Function1<? super Boolean, Unit> function1) {
        this.interactionSource = lVar;
        this.onFocusChange = function1;
        this.focusTargetNode = (androidx.compose.ui.focus.G) K2(androidx.compose.ui.focus.H.a(i10, new e(this)));
    }
}
