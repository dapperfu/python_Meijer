package k6;

import H1.r;
import H1.s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lk6/f;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/D;", "", "width", "height", "<init>", "(II)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "I", "getWidth", "()I", "L2", "(I)V", "p", "getHeight", "K2", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15103f extends Modifier.c implements D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int height;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.f$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f141545f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(1);
            this.f141545f = f0Var;
        }

        public final void a(f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            f0.a.l(layout, this.f141545f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    public final void K2(int i10) {
        this.height = i10;
    }

    public final void L2(int i10) {
        this.width = i10;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K measure, I measurable, long j10) {
        Intrinsics.j(measure, "$this$measure");
        Intrinsics.j(measurable, "measurable");
        long jD = H1.c.d(j10, s.a(this.width, this.height));
        f0 f0VarK0 = measurable.k0((H1.b.k(j10) != Integer.MAX_VALUE || H1.b.l(j10) == Integer.MAX_VALUE) ? (H1.b.l(j10) != Integer.MAX_VALUE || H1.b.k(j10) == Integer.MAX_VALUE) ? H1.c.a(r.g(jD), r.g(jD), r.f(jD), r.f(jD)) : H1.c.a((r.f(jD) * this.width) / this.height, (r.f(jD) * this.width) / this.height, r.f(jD), r.f(jD)) : H1.c.a(r.g(jD), r.g(jD), (r.g(jD) * this.height) / this.width, (r.g(jD) * this.height) / this.width));
        return K.G0(measure, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0), 4, null);
    }

    public C15103f(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
