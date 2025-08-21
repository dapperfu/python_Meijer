package androidx.compose.foundation.selection;

import androidx.compose.ui.node.Y;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13561B;
import h0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t1.EnumC17174a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/selection/c;", "Lt1/a;", "state", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lt1/a;Lh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "k", "()Landroidx/compose/foundation/selection/c;", "node", "n", "(Landroidx/compose/foundation/selection/c;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lt1/a;", "c", "Lh0/l;", "d", "Ld0/B;", "e", "Z", "f", "Landroidx/compose/ui/semantics/Role;", "g", "Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class TriStateToggleableElement extends Y<c> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC17174a state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13561B indicationNodeFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Role role;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    public /* synthetic */ TriStateToggleableElement(EnumC17174a enumC17174a, l lVar, InterfaceC13561B interfaceC13561B, boolean z10, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC17174a, lVar, interfaceC13561B, z10, role, function0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TriStateToggleableElement.class != other.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) other;
        return this.state == triStateToggleableElement.state && Intrinsics.e(this.interactionSource, triStateToggleableElement.interactionSource) && Intrinsics.e(this.indicationNodeFactory, triStateToggleableElement.indicationNodeFactory) && this.enabled == triStateToggleableElement.enabled && Intrinsics.e(this.role, triStateToggleableElement.role) && this.onClick == triStateToggleableElement.onClick;
    }

    private TriStateToggleableElement(EnumC17174a enumC17174a, l lVar, InterfaceC13561B interfaceC13561B, boolean z10, Role role, Function0<Unit> function0) {
        this.state = enumC17174a;
        this.interactionSource = lVar;
        this.indicationNodeFactory = interfaceC13561B;
        this.enabled = z10;
        this.role = role;
        this.onClick = function0;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        l lVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        InterfaceC13561B interfaceC13561B = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (interfaceC13561B != null ? interfaceC13561B.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Role role = this.role;
        return ((iHashCode3 + (role != null ? Role.n(role.getValue()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.state, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(c node) {
        node.q3(this.state, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick);
    }
}
