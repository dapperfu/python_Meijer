package androidx.compose.animation;

import H1.n;
import H1.r;
import H1.t;
import androidx.compose.runtime.z1;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import kotlin.AbstractC6176q;
import kotlin.C6331n;
import kotlin.ChangeSize;
import kotlin.EnumC6171k;
import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Slide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.p;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ&\u0010%\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001aR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b\u0012\u0010H\"\u0004\bI\u0010JR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"8\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u0010U\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR4\u0010l\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060f0d¢\u0006\u0002\bg8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR4\u0010o\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0f0d¢\u0006\u0002\bg8\u0006¢\u0006\f\n\u0004\bm\u0010i\u001a\u0004\bn\u0010kR\u0013\u0010q\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\bp\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/animation/g;", "Lb0/q;", "Lc0/k0;", "Lb0/k;", "transition", "Lc0/k0$a;", "LH1/r;", "Lc0/n;", "sizeAnimation", "LH1/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/h;", "enter", "Landroidx/compose/animation/j;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lb0/p;", "graphicsLayerBlock", "<init>", "(Lc0/k0;Lc0/k0$a;Lc0/k0$a;Lc0/k0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function0;Lb0/p;)V", "targetState", "fullSize", "W2", "(Lb0/k;J)J", "", "t2", "()V", "Y2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "X2", "o", "Lc0/k0;", "getTransition", "()Lc0/k0;", "V2", "(Lc0/k0;)V", "p", "Lc0/k0$a;", "getSizeAnimation", "()Lc0/k0$a;", "T2", "(Lc0/k0$a;)V", "q", "getOffsetAnimation", "S2", "r", "getSlideAnimation", "U2", "s", "Landroidx/compose/animation/h;", "L2", "()Landroidx/compose/animation/h;", "O2", "(Landroidx/compose/animation/h;)V", "t", "Landroidx/compose/animation/j;", "M2", "()Landroidx/compose/animation/j;", "P2", "(Landroidx/compose/animation/j;)V", "u", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "N2", "(Lkotlin/jvm/functions/Function0;)V", "v", "Lb0/p;", "getGraphicsLayerBlock", "()Lb0/p;", "Q2", "(Lb0/p;)V", "w", "Z", "lookaheadConstraintsAvailable", "x", "J", "lookaheadSize", "value", "y", "R2", "(J)V", "lookaheadConstraints", "LP0/e;", "z", "LP0/e;", "getCurrentAlignment", "()LP0/e;", "setCurrentAlignment", "(LP0/e;)V", "currentAlignment", "Lkotlin/Function1;", "Lc0/k0$b;", "Lc0/F;", "Lkotlin/ExtensionFunctionType;", "A", "Lkotlin/jvm/functions/Function1;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "sizeTransitionSpec", "B", "getSlideSpec", "slideSpec", "K2", "alignment", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class g extends AbstractC6176q {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private k0<EnumC6171k> transition;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private k0<EnumC6171k>.a<r, C6331n> sizeAnimation;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private k0<EnumC6171k>.a<n, C6331n> offsetAnimation;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private k0<EnumC6171k>.a<n, C6331n> slideAnimation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.animation.h enter;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.animation.j exit;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Function0<Boolean> isEnabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private p graphicsLayerBlock;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private P0.e currentAlignment;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = androidx.compose.animation.e.c();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints = H1.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Function1<k0.b<EnumC6171k>, InterfaceC6293F<r>> sizeTransitionSpec = new i();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Function1<k0.b<EnumC6171k>, InterfaceC6293F<n>> slideSpec = new j();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6171k.values().length];
            try {
                iArr[EnumC6171k.f59616b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6171k.f59615a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6171k.f59617c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f47859f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0 f0Var) {
            super(1);
            this.f47859f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f47859f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f47860f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f47861g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f47862h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.e, Unit> f47863i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(f0 f0Var, long j10, long j11, Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
            super(1);
            this.f47860f = f0Var;
            this.f47861g = j10;
            this.f47862h = j11;
            this.f47863i = function1;
        }

        public final void a(f0.a aVar) {
            aVar.u(this.f47860f, n.k(this.f47862h) + n.k(this.f47861g), n.l(this.f47862h) + n.l(this.f47861g), 0.0f, this.f47863i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f47864f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f0 f0Var) {
            super(1);
            this.f47864f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f47864f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/k;", "it", "LH1/r;", "a", "(Lb0/k;)J"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<EnumC6171k, r> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f47866g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10) {
            super(1);
            this.f47866g = j10;
        }

        public final long a(EnumC6171k enumC6171k) {
            return g.this.W2(enumC6171k, this.f47866g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ r invoke(EnumC6171k enumC6171k) {
            return r.b(a(enumC6171k));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/k;", "it", "LH1/n;", "a", "(Lb0/k;)J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.animation.g$g, reason: collision with other inner class name */
    static final class C0975g extends Lambda implements Function1<EnumC6171k, n> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f47869g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0975g(long j10) {
            super(1);
            this.f47869g = j10;
        }

        public final long a(EnumC6171k enumC6171k) {
            return g.this.Y2(enumC6171k, this.f47869g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ n invoke(EnumC6171k enumC6171k) {
            return n.c(a(enumC6171k));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/k;", "it", "LH1/n;", "a", "(Lb0/k;)J"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<EnumC6171k, n> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f47871g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10) {
            super(1);
            this.f47871g = j10;
        }

        public final long a(EnumC6171k enumC6171k) {
            return g.this.X2(enumC6171k, this.f47871g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ n invoke(EnumC6171k enumC6171k) {
            return n.c(a(enumC6171k));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lb0/k;", "Lc0/F;", "LH1/r;", "a", "(Lc0/k0$b;)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function1<k0.b<EnumC6171k>, InterfaceC6293F<r>> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6293F<r> invoke(k0.b<EnumC6171k> bVar) {
            EnumC6171k enumC6171k = EnumC6171k.f59615a;
            EnumC6171k enumC6171k2 = EnumC6171k.f59616b;
            InterfaceC6293F<r> interfaceC6293FB = null;
            if (bVar.c(enumC6171k, enumC6171k2)) {
                ChangeSize changeSize = g.this.getEnter().getData().getChangeSize();
                if (changeSize != null) {
                    interfaceC6293FB = changeSize.b();
                }
            } else if (bVar.c(enumC6171k2, EnumC6171k.f59617c)) {
                ChangeSize changeSize2 = g.this.getExit().getData().getChangeSize();
                if (changeSize2 != null) {
                    interfaceC6293FB = changeSize2.b();
                }
            } else {
                interfaceC6293FB = androidx.compose.animation.f.f47810d;
            }
            return interfaceC6293FB == null ? androidx.compose.animation.f.f47810d : interfaceC6293FB;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lb0/k;", "Lc0/F;", "LH1/n;", "a", "(Lc0/k0$b;)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class j extends Lambda implements Function1<k0.b<EnumC6171k>, InterfaceC6293F<n>> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6293F<n> invoke(k0.b<EnumC6171k> bVar) {
            InterfaceC6293F<n> interfaceC6293FA;
            InterfaceC6293F<n> interfaceC6293FA2;
            EnumC6171k enumC6171k = EnumC6171k.f59615a;
            EnumC6171k enumC6171k2 = EnumC6171k.f59616b;
            if (bVar.c(enumC6171k, enumC6171k2)) {
                Slide slide = g.this.getEnter().getData().getSlide();
                return (slide == null || (interfaceC6293FA2 = slide.a()) == null) ? androidx.compose.animation.f.f47809c : interfaceC6293FA2;
            }
            if (!bVar.c(enumC6171k2, EnumC6171k.f59617c)) {
                return androidx.compose.animation.f.f47809c;
            }
            Slide slide2 = g.this.getExit().getData().getSlide();
            return (slide2 == null || (interfaceC6293FA = slide2.a()) == null) ? androidx.compose.animation.f.f47809c : interfaceC6293FA;
        }
    }

    private final void R2(long j10) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j10;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lb0/k;", "Lc0/F;", "LH1/n;", "a", "(Lc0/k0$b;)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<k0.b<EnumC6171k>, InterfaceC6293F<n>> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f47867f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6293F<n> invoke(k0.b<EnumC6171k> bVar) {
            return androidx.compose.animation.f.f47809c;
        }
    }

    public final P0.e K2() {
        P0.e alignment;
        P0.e alignment2;
        if (this.transition.m().c(EnumC6171k.f59615a, EnumC6171k.f59616b)) {
            ChangeSize changeSize = this.enter.getData().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    /* renamed from: L2, reason: from getter */
    public final androidx.compose.animation.h getEnter() {
        return this.enter;
    }

    /* renamed from: M2, reason: from getter */
    public final androidx.compose.animation.j getExit() {
        return this.exit;
    }

    public final void N2(Function0<Boolean> function0) {
        this.isEnabled = function0;
    }

    public final void O2(androidx.compose.animation.h hVar) {
        this.enter = hVar;
    }

    public final void P2(androidx.compose.animation.j jVar) {
        this.exit = jVar;
    }

    public final void Q2(p pVar) {
        this.graphicsLayerBlock = pVar;
    }

    public final void S2(k0<EnumC6171k>.a<n, C6331n> aVar) {
        this.offsetAnimation = aVar;
    }

    public final void T2(k0<EnumC6171k>.a<r, C6331n> aVar) {
        this.sizeAnimation = aVar;
    }

    public final void U2(k0<EnumC6171k>.a<n, C6331n> aVar) {
        this.slideAnimation = aVar;
    }

    public final void V2(k0<EnumC6171k> k0Var) {
        this.transition = k0Var;
    }

    public final long W2(EnumC6171k targetState, long fullSize) {
        Function1<r, r> function1D;
        Function1<r, r> function1D2;
        int i10 = a.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                ChangeSize changeSize = this.enter.getData().getChangeSize();
                if (changeSize != null && (function1D = changeSize.d()) != null) {
                    return function1D.invoke(r.b(fullSize)).getPackedValue();
                }
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ChangeSize changeSize2 = this.exit.getData().getChangeSize();
                if (changeSize2 != null && (function1D2 = changeSize2.d()) != null) {
                    return function1D2.invoke(r.b(fullSize)).getPackedValue();
                }
            }
        }
        return fullSize;
    }

    public final long X2(EnumC6171k targetState, long fullSize) {
        Function1<r, n> function1B;
        Function1<r, n> function1B2;
        Slide slide = this.enter.getData().getSlide();
        long jB = (slide == null || (function1B2 = slide.b()) == null) ? n.INSTANCE.b() : function1B2.invoke(r.b(fullSize)).getPackedValue();
        Slide slide2 = this.exit.getData().getSlide();
        long jB2 = (slide2 == null || (function1B = slide2.b()) == null) ? n.INSTANCE.b() : function1B.invoke(r.b(fullSize)).getPackedValue();
        int i10 = a.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            return n.INSTANCE.b();
        }
        if (i10 == 2) {
            return jB;
        }
        if (i10 == 3) {
            return jB2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long Y2(EnumC6171k targetState, long fullSize) {
        if (this.currentAlignment == null) {
            return n.INSTANCE.b();
        }
        if (K2() == null) {
            return n.INSTANCE.b();
        }
        if (Intrinsics.e(this.currentAlignment, K2())) {
            return n.INSTANCE.b();
        }
        int i10 = a.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            return n.INSTANCE.b();
        }
        if (i10 == 2) {
            return n.INSTANCE.b();
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeSize changeSize = this.exit.getData().getChangeSize();
        if (changeSize == null) {
            return n.INSTANCE.b();
        }
        long packedValue = changeSize.d().invoke(r.b(fullSize)).getPackedValue();
        P0.e eVarK2 = K2();
        Intrinsics.g(eVarK2);
        t tVar = t.f12006a;
        long jA = eVarK2.a(fullSize, packedValue, tVar);
        P0.e eVar = this.currentAlignment;
        Intrinsics.g(eVar);
        return n.n(jA, eVar.a(fullSize, packedValue, tVar));
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        z1<n> z1VarA;
        z1<n> z1VarA2;
        if (this.transition.h() == this.transition.o()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            P0.e eVarK2 = K2();
            if (eVarK2 == null) {
                eVarK2 = P0.e.INSTANCE.o();
            }
            this.currentAlignment = eVarK2;
        }
        if (k10.v0()) {
            f0 f0VarK0 = i10.k0(j10);
            long jC = r.c((f0VarK0.getWidth() << 32) | (f0VarK0.getHeight() & 4294967295L));
            this.lookaheadSize = jC;
            R2(j10);
            return K.G0(k10, (int) (jC >> 32), (int) (jC & 4294967295L), null, new b(f0VarK0), 4, null);
        }
        if (!this.isEnabled.invoke().booleanValue()) {
            f0 f0VarK02 = i10.k0(j10);
            return K.G0(k10, f0VarK02.getWidth(), f0VarK02.getHeight(), null, new d(f0VarK02), 4, null);
        }
        Function1<androidx.compose.ui.graphics.e, Unit> function1Init = this.graphicsLayerBlock.init();
        f0 f0VarK03 = i10.k0(j10);
        long jC2 = r.c((f0VarK03.getWidth() << 32) | (f0VarK03.getHeight() & 4294967295L));
        long j11 = androidx.compose.animation.e.d(this.lookaheadSize) ? this.lookaheadSize : jC2;
        k0<EnumC6171k>.a<r, C6331n> aVar = this.sizeAnimation;
        z1<r> z1VarA3 = aVar != null ? aVar.a(this.sizeTransitionSpec, new e(j11)) : null;
        if (z1VarA3 != null) {
            jC2 = z1VarA3.getValue().getPackedValue();
        }
        long jD = H1.c.d(j10, jC2);
        k0<EnumC6171k>.a<n, C6331n> aVar2 = this.offsetAnimation;
        long jB = (aVar2 == null || (z1VarA2 = aVar2.a(f.f47867f, new C0975g(j11))) == null) ? n.INSTANCE.b() : z1VarA2.getValue().getPackedValue();
        k0<EnumC6171k>.a<n, C6331n> aVar3 = this.slideAnimation;
        long jB2 = (aVar3 == null || (z1VarA = aVar3.a(this.slideSpec, new h(j11))) == null) ? n.INSTANCE.b() : z1VarA.getValue().getPackedValue();
        P0.e eVar = this.currentAlignment;
        return K.G0(k10, (int) (jD >> 32), (int) (jD & 4294967295L), null, new c(f0VarK03, n.o(eVar != null ? eVar.a(j11, jD, t.f12006a) : n.INSTANCE.b(), jB2), jB, function1Init), 4, null);
    }

    public g(k0<EnumC6171k> k0Var, k0<EnumC6171k>.a<r, C6331n> aVar, k0<EnumC6171k>.a<n, C6331n> aVar2, k0<EnumC6171k>.a<n, C6331n> aVar3, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function0<Boolean> function0, p pVar) {
        this.transition = k0Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = hVar;
        this.exit = jVar;
        this.isEnabled = function0;
        this.graphicsLayerBlock = pVar;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        super.t2();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = androidx.compose.animation.e.c();
    }
}
