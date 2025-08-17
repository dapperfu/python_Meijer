package kotlin;

import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0017BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0014\u0010\u0011J\"\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0014\u0010-\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001f¨\u0006."}, d2 = {"Lx0/M0;", "", "Lx0/N0;", "initialValue", "LH1/d;", "density", "Lkotlin/Function1;", "", "confirmValueChange", "Lc0/i;", "", "animationSpec", "isSkipHalfExpanded", "<init>", "(Lx0/N0;LH1/d;Lkotlin/jvm/functions/Function1;Lc0/i;Z)V", "", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "i", "c", "target", "velocity", "a", "(Lx0/N0;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/i;", "getAnimationSpec$material_release", "()Lc0/i;", "b", "Z", "j", "()Z", "Lx0/e;", "Lx0/e;", "d", "()Lx0/e;", "anchoredDraggableState", "e", "()Lx0/N0;", "currentValue", "g", "targetValue", "k", "isVisible", "f", "hasHalfExpandedState", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.M0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17893M0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f167209e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6326i<Float> animationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isSkipHalfExpanded;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17931e<EnumC17895N0> anchoredDraggableState;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000f\u0012\u0002\b\u00030\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lx0/M0$a;", "", "<init>", "()V", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "Lx0/N0;", "", "confirmValueChange", "skipHalfExpanded", "LH1/d;", "density", "LL0/k;", "Lx0/M0;", "a", "(Lc0/i;Lkotlin/jvm/functions/Function1;ZLH1/d;)LL0/k;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.M0$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/N0;", "it", "Lx0/M0;", "a", "(Lx0/N0;)Lx0/M0;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.M0$a$b */
        static final class b extends Lambda implements Function1<EnumC17895N0, C17893M0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ H1.d f167214f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC17895N0, Boolean> f167215g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC6326i<Float> f167216h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f167217i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(H1.d dVar, Function1<? super EnumC17895N0, Boolean> function1, InterfaceC6326i<Float> interfaceC6326i, boolean z10) {
                super(1);
                this.f167214f = dVar;
                this.f167215g = function1;
                this.f167216h = interfaceC6326i;
                this.f167217i = z10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C17893M0 invoke(EnumC17895N0 enumC17895N0) {
                return new C17893M0(enumC17895N0, this.f167214f, this.f167215g, this.f167216h, this.f167217i);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Lx0/M0;", "it", "Lx0/N0;", "a", "(LL0/m;Lx0/M0;)Lx0/N0;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.M0$a$a, reason: collision with other inner class name */
        static final class C2659a extends Lambda implements Function2<L0.m, C17893M0, EnumC17895N0> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2659a f167213f = new C2659a();

            C2659a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC17895N0 invoke(L0.m mVar, C17893M0 c17893m0) {
                return c17893m0.e();
            }
        }

        private Companion() {
        }

        public final L0.k<C17893M0, ?> a(InterfaceC6326i<Float> animationSpec, Function1<? super EnumC17895N0, Boolean> confirmValueChange, boolean skipHalfExpanded, H1.d density) {
            return L0.l.a(C2659a.f167213f, new b(density, confirmValueChange, animationSpec, skipHalfExpanded));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.M0$c */
    static final class c extends Lambda implements Function1<Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ H1.d f167218f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H1.d dVar) {
            super(1);
            this.f167218f = dVar;
        }

        public final Float b(float f10) {
            return Float.valueOf(this.f167218f.I1(C17891L0.f167126a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.M0$d */
    static final class d extends Lambda implements Function0<Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ H1.d f167219f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H1.d dVar) {
            super(0);
            this.f167219f = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f167219f.I1(C17891L0.f167127b));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.M0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17895N0.values().length];
            try {
                iArr[EnumC17895N0.f167226a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Object b(C17893M0 c17893m0, EnumC17895N0 enumC17895N0, float f10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = c17893m0.anchoredDraggableState.v();
        }
        return c17893m0.a(enumC17895N0, f10, continuation);
    }

    public final Object a(EnumC17895N0 enumC17895N0, float f10, Continuation<? super Unit> continuation) {
        Object objF = androidx.compose.material.a.f(this.anchoredDraggableState, enumC17895N0, f10, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f142422a;
    }

    public final Object c(Continuation<? super Unit> continuation) {
        InterfaceC17920a0<EnumC17895N0> interfaceC17920a0O = this.anchoredDraggableState.o();
        EnumC17895N0 enumC17895N0 = EnumC17895N0.f167227b;
        if (!interfaceC17920a0O.d(enumC17895N0)) {
            return Unit.f142422a;
        }
        Object objB = b(this, enumC17895N0, 0.0f, continuation, 2, null);
        return objB == IntrinsicsKt.f() ? objB : Unit.f142422a;
    }

    public final C17931e<EnumC17895N0> d() {
        return this.anchoredDraggableState;
    }

    public final EnumC17895N0 e() {
        return this.anchoredDraggableState.s();
    }

    public final boolean f() {
        return this.anchoredDraggableState.o().d(EnumC17895N0.f167228c);
    }

    public final EnumC17895N0 g() {
        return this.anchoredDraggableState.x();
    }

    public final Object i(Continuation<? super Unit> continuation) {
        Object objB = b(this, EnumC17895N0.f167226a, 0.0f, continuation, 2, null);
        return objB == IntrinsicsKt.f() ? objB : Unit.f142422a;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    public final boolean k() {
        return this.anchoredDraggableState.s() != EnumC17895N0.f167226a;
    }

    public final Object l(Continuation<? super Unit> continuation) {
        InterfaceC17920a0<EnumC17895N0> interfaceC17920a0O = this.anchoredDraggableState.o();
        EnumC17895N0 enumC17895N0 = EnumC17895N0.f167227b;
        boolean zD = interfaceC17920a0O.d(enumC17895N0);
        if (b.$EnumSwitchMapping$0[e().ordinal()] == 1) {
            if (f()) {
                enumC17895N0 = EnumC17895N0.f167228c;
            }
        } else if (!zD) {
            enumC17895N0 = EnumC17895N0.f167226a;
        }
        Object objB = b(this, enumC17895N0, 0.0f, continuation, 2, null);
        return objB == IntrinsicsKt.f() ? objB : Unit.f142422a;
    }

    public C17893M0(EnumC17895N0 enumC17895N0, H1.d dVar, Function1<? super EnumC17895N0, Boolean> function1, InterfaceC6326i<Float> interfaceC6326i, boolean z10) {
        this.animationSpec = interfaceC6326i;
        this.isSkipHalfExpanded = z10;
        this.anchoredDraggableState = new C17931e<>(enumC17895N0, new c(dVar), new d(dVar), interfaceC6326i, function1);
        if (!z10 || enumC17895N0 != EnumC17895N0.f167228c) {
        } else {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public final Object h(Continuation<? super Unit> continuation) {
        if (!f()) {
            return Unit.f142422a;
        }
        Object objB = b(this, EnumC17895N0.f167228c, 0.0f, continuation, 2, null);
        if (objB == IntrinsicsKt.f()) {
            return objB;
        }
        return Unit.f142422a;
    }
}
