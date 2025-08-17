package kotlin;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.C5813i;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.InterfaceC5812h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lx0/J0;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/D;", "<init>", "()V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.J0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17887J0 extends Modifier.c implements InterfaceC5812h, D {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.J0$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f167079f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f0 f167080g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f167081h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, f0 f0Var, int i11) {
            super(1);
            this.f167079f = i10;
            this.f167080g = f0Var;
            this.f167081h = i11;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f167080g, MathKt.d((this.f167079f - this.f167080g.getWidth()) / 2.0f), MathKt.d((this.f167081h - this.f167080g.getHeight()) / 2.0f), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        boolean z10;
        int width;
        int height;
        if (getIsAttached() && ((Boolean) C5813i.a(this, C17871B0.b())).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = C17871B0.f166729c;
        f0 f0VarK0 = i10.k0(j10);
        if (z10) {
            width = Math.max(f0VarK0.getWidth(), k10.E0(H1.k.h(j11)));
        } else {
            width = f0VarK0.getWidth();
        }
        int i11 = width;
        if (z10) {
            height = Math.max(f0VarK0.getHeight(), k10.E0(H1.k.g(j11)));
        } else {
            height = f0VarK0.getHeight();
        }
        int i12 = height;
        return K.G0(k10, i11, i12, null, new a(i11, f0VarK0, i12), 4, null);
    }
}
