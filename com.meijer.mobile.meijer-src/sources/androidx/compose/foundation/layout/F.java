package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import j0.InterfaceC14882C;
import k0.C15077a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Lj0/C;", "paddingValues", "<init>", "(Lj0/C;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "Lj0/C;", "getPaddingValues", "()Lj0/C;", "K2", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class F extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC14882C paddingValues;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f48653f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f48654g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f48655h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, int i10, int i11) {
            super(1);
            this.f48653f = f0Var;
            this.f48654g = i10;
            this.f48655h = i11;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f48653f, this.f48654g, this.f48655h, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        float fB = this.paddingValues.b(k10.getLayoutDirection());
        float top = this.paddingValues.getTop();
        float fC = this.paddingValues.c(k10.getLayoutDirection());
        float bottom = this.paddingValues.getBottom();
        float f10 = 0;
        if (!((H1.h.o(bottom, H1.h.p(f10)) >= 0) & (H1.h.o(fB, H1.h.p(f10)) >= 0) & (H1.h.o(top, H1.h.p(f10)) >= 0) & (H1.h.o(fC, H1.h.p(f10)) >= 0))) {
            C15077a.a("Padding must be non-negative");
        }
        int iE0 = k10.E0(fB);
        int iE02 = k10.E0(fC) + iE0;
        int iE03 = k10.E0(top);
        int iE04 = k10.E0(bottom) + iE03;
        f0 f0VarK0 = i10.k0(H1.c.i(j10, -iE02, -iE04));
        return androidx.compose.ui.layout.K.G0(k10, H1.c.g(j10, f0VarK0.getWidth() + iE02), H1.c.f(j10, f0VarK0.getHeight() + iE04), null, new a(f0VarK0, iE0, iE03), 4, null);
    }

    public final void K2(InterfaceC14882C interfaceC14882C) {
        this.paddingValues = interfaceC14882C;
    }

    public F(InterfaceC14882C interfaceC14882C) {
        this.paddingValues = interfaceC14882C;
    }
}
