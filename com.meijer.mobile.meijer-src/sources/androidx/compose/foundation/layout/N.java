package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import com.google.android.gms.common.api.a;
import j0.EnumC14907k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/N;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Lj0/k;", "direction", "", "unbounded", "Lkotlin/Function2;", "LH1/r;", "LH1/t;", "LH1/n;", "alignmentCallback", "<init>", "(Lj0/k;ZLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "Lj0/k;", "getDirection", "()Lj0/k;", "M2", "(Lj0/k;)V", "p", "Z", "getUnbounded", "()Z", "N2", "(Z)V", "q", "Lkotlin/jvm/functions/Function2;", "K2", "()Lkotlin/jvm/functions/Function2;", "L2", "(Lkotlin/jvm/functions/Function2;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private EnumC14907k direction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean unbounded;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Function2<? super H1.r, ? super H1.t, H1.n> alignmentCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f48727g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f48728h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f48729i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f48730j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, f0 f0Var, int i11, androidx.compose.ui.layout.K k10) {
            super(1);
            this.f48727g = i10;
            this.f48728h = f0Var;
            this.f48729i = i11;
            this.f48730j = k10;
        }

        public final void a(f0.a aVar) {
            f0.a.j(aVar, this.f48728h, N.this.K2().invoke(H1.r.b(H1.r.c(((this.f48729i - this.f48728h.getHeight()) & 4294967295L) | ((this.f48727g - this.f48728h.getWidth()) << 32))), this.f48730j.getLayoutDirection()).getPackedValue(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public final Function2<H1.r, H1.t, H1.n> K2() {
        return this.alignmentCallback;
    }

    public final void L2(Function2<? super H1.r, ? super H1.t, H1.n> function2) {
        this.alignmentCallback = function2;
    }

    public final void M2(EnumC14907k enumC14907k) {
        this.direction = enumC14907k;
    }

    public final void N2(boolean z10) {
        this.unbounded = z10;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        EnumC14907k enumC14907k = this.direction;
        EnumC14907k enumC14907k2 = EnumC14907k.f139711a;
        int iN = enumC14907k != enumC14907k2 ? 0 : H1.b.n(j10);
        EnumC14907k enumC14907k3 = this.direction;
        EnumC14907k enumC14907k4 = EnumC14907k.f139712b;
        int iM = enumC14907k3 == enumC14907k4 ? H1.b.m(j10) : 0;
        EnumC14907k enumC14907k5 = this.direction;
        int iK = a.e.API_PRIORITY_OTHER;
        int iL = (enumC14907k5 == enumC14907k2 || !this.unbounded) ? H1.b.l(j10) : Integer.MAX_VALUE;
        if (this.direction == enumC14907k4 || !this.unbounded) {
            iK = H1.b.k(j10);
        }
        f0 f0VarK0 = i10.k0(H1.c.a(iN, iL, iM, iK));
        int iO = RangesKt.o(f0VarK0.getWidth(), H1.b.n(j10), H1.b.l(j10));
        int iO2 = RangesKt.o(f0VarK0.getHeight(), H1.b.m(j10), H1.b.k(j10));
        return androidx.compose.ui.layout.K.G0(k10, iO, iO2, null, new a(iO, f0VarK0, iO2, k10), 4, null);
    }

    public N(EnumC14907k enumC14907k, boolean z10, Function2<? super H1.r, ? super H1.t, H1.n> function2) {
        this.direction = enumC14907k;
        this.unbounded = z10;
        this.alignmentCallback = function2;
    }
}
