package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC5933s;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/w;", "Landroidx/compose/foundation/layout/y;", "Lj0/x;", "height", "", "enforceIncoming", "<init>", "(Lj0/x;Z)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "K2", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)J", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "width", "F", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "r", "o", "Lj0/x;", "getHeight", "()Lj0/x;", "N2", "(Lj0/x;)V", "p", "Z", "L2", "()Z", "M2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class w extends y {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private j0.x height;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    @Override // androidx.compose.foundation.layout.y, androidx.compose.ui.node.D
    public int F(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        return this.height == j0.x.f139749a ? rVar.W(i10) : rVar.A(i10);
    }

    @Override // androidx.compose.foundation.layout.y
    public long K2(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        int iW = this.height == j0.x.f139749a ? i10.W(H1.b.l(j10)) : i10.A(H1.b.l(j10));
        if (iW < 0) {
            iW = 0;
        }
        return H1.b.INSTANCE.d(iW);
    }

    @Override // androidx.compose.foundation.layout.y
    /* renamed from: L2, reason: from getter */
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public void M2(boolean z10) {
        this.enforceIncoming = z10;
    }

    public final void N2(j0.x xVar) {
        this.height = xVar;
    }

    @Override // androidx.compose.foundation.layout.y, androidx.compose.ui.node.D
    public int r(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        return this.height == j0.x.f139749a ? rVar.W(i10) : rVar.A(i10);
    }

    public w(j0.x xVar, boolean z10) {
        this.height = xVar;
        this.enforceIncoming = z10;
    }
}
