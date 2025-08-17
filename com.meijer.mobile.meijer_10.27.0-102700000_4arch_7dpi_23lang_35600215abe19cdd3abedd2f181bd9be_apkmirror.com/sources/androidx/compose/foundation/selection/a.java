package androidx.compose.foundation.selection;

import androidx.compose.foundation.d;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13428B;
import h0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/selection/a;", "Landroidx/compose/foundation/d;", "", "selected", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(ZLh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "q3", "(ZLh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "Lr1/u;", "X2", "(Lr1/u;)V", "J", "Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean selected;

    public /* synthetic */ a(boolean z10, l lVar, InterfaceC13428B interfaceC13428B, boolean z11, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, lVar, interfaceC13428B, z11, role, function0);
    }

    private a(boolean z10, l lVar, InterfaceC13428B interfaceC13428B, boolean z11, Role role, Function0<Unit> function0) {
        super(lVar, interfaceC13428B, z11, null, role, function0, null);
        this.selected = z10;
    }

    @Override // androidx.compose.foundation.a
    public void X2(u uVar) {
        s.t0(uVar, this.selected);
    }

    public final void q3(boolean selected, l interactionSource, InterfaceC13428B indicationNodeFactory, boolean enabled, Role role, Function0<Unit> onClick) {
        if (this.selected != selected) {
            this.selected = selected;
            v0.b(this);
        }
        super.p3(interactionSource, indicationNodeFactory, enabled, null, role, onClick);
    }
}
