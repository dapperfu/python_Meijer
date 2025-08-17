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
import t1.EnumC17055a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/selection/c;", "Landroidx/compose/foundation/d;", "Lt1/a;", "state", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lt1/a;Lh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "q3", "(Lt1/a;Lh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "Lr1/u;", "X2", "(Lr1/u;)V", "J", "Lt1/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends d {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private EnumC17055a state;

    public /* synthetic */ c(EnumC17055a enumC17055a, l lVar, InterfaceC13428B interfaceC13428B, boolean z10, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC17055a, lVar, interfaceC13428B, z10, role, function0);
    }

    private c(EnumC17055a enumC17055a, l lVar, InterfaceC13428B interfaceC13428B, boolean z10, Role role, Function0<Unit> function0) {
        super(lVar, interfaceC13428B, z10, null, role, function0, null);
        this.state = enumC17055a;
    }

    @Override // androidx.compose.foundation.a
    public void X2(u uVar) {
        s.G0(uVar, this.state);
    }

    public final void q3(EnumC17055a state, l interactionSource, InterfaceC13428B indicationNodeFactory, boolean enabled, Role role, Function0<Unit> onClick) {
        if (this.state != state) {
            this.state = state;
            v0.b(this);
        }
        super.p3(interactionSource, indicationNodeFactory, enabled, null, role, onClick);
    }
}
