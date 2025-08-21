package androidx.compose.material;

import H1.r;
import H1.s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.D;
import kotlin.C17997e;
import kotlin.EnumC13937z;
import kotlin.InterfaceC17986a0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003Bg\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012H\u0010\u000f\u001aD\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r0\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"Rd\u0010\u000f\u001aD\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/material/b;", "T", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/D;", "Lx0/e;", "state", "Lkotlin/Function2;", "LH1/r;", "Lkotlin/ParameterName;", "name", "size", "LH1/b;", "constraints", "Lkotlin/Pair;", "Lx0/a0;", "anchors", "Lf0/z;", "orientation", "<init>", "(Lx0/e;Lkotlin/jvm/functions/Function2;Lf0/z;)V", "", "u2", "()V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "Lx0/e;", "L2", "()Lx0/e;", "O2", "(Lx0/e;)V", "p", "Lkotlin/jvm/functions/Function2;", "getAnchors", "()Lkotlin/jvm/functions/Function2;", "M2", "(Lkotlin/jvm/functions/Function2;)V", "q", "Lf0/z;", "K2", "()Lf0/z;", "N2", "(Lf0/z;)V", "", "r", "Z", "didLookahead", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b<T> extends Modifier.c implements D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private C17997e<T> state;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Function2<? super r, ? super H1.b, ? extends Pair<? extends InterfaceC17986a0<T>, ? extends T>> anchors;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private EnumC13937z orientation;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean didLookahead;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ K f50076f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b<T> f50077g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f50078h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K k10, b<T> bVar, f0 f0Var) {
            super(1);
            this.f50076f = k10;
            this.f50077g = bVar;
            this.f50078h = f0Var;
        }

        public final void a(f0.a aVar) {
            float fC = this.f50076f.v0() ? this.f50077g.L2().o().c(this.f50077g.L2().x()) : this.f50077g.L2().A();
            float f10 = this.f50077g.getOrientation() == EnumC13937z.f131420b ? fC : 0.0f;
            if (this.f50077g.getOrientation() != EnumC13937z.f131419a) {
                fC = 0.0f;
            }
            f0.a.h(aVar, this.f50078h, MathKt.d(f10), MathKt.d(fC), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        this.didLookahead = false;
    }

    /* renamed from: K2, reason: from getter */
    public final EnumC13937z getOrientation() {
        return this.orientation;
    }

    public final C17997e<T> L2() {
        return this.state;
    }

    public final void M2(Function2<? super r, ? super H1.b, ? extends Pair<? extends InterfaceC17986a0<T>, ? extends T>> function2) {
        this.anchors = function2;
    }

    public final void N2(EnumC13937z enumC13937z) {
        this.orientation = enumC13937z;
    }

    public final void O2(C17997e<T> c17997e) {
        this.state = c17997e;
    }

    public b(C17997e<T> c17997e, Function2<? super r, ? super H1.b, ? extends Pair<? extends InterfaceC17986a0<T>, ? extends T>> function2, EnumC13937z enumC13937z) {
        this.state = c17997e;
        this.anchors = function2;
        this.orientation = enumC13937z;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        boolean z10;
        f0 f0VarK0 = i10.k0(j10);
        if (!k10.v0() || !this.didLookahead) {
            Pair<? extends InterfaceC17986a0<T>, ? extends T> pairInvoke = this.anchors.invoke(r.b(s.a(f0VarK0.getWidth(), f0VarK0.getHeight())), H1.b.a(j10));
            this.state.I(pairInvoke.c(), pairInvoke.d());
        }
        if (!k10.v0() && !this.didLookahead) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.didLookahead = z10;
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(k10, this, f0VarK0), 4, null);
    }
}
