package androidx.compose.foundation.selection;

import androidx.compose.ui.node.Y;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13561B;
import h0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/selection/b;", "", "value", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "", "onValueChange", "<init>", "(ZLh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "k", "()Landroidx/compose/foundation/selection/b;", "node", "n", "(Landroidx/compose/foundation/selection/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Z", "c", "Lh0/l;", "d", "Ld0/B;", "e", "f", "Landroidx/compose/ui/semantics/Role;", "g", "Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ToggleableElement extends Y<b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13561B indicationNodeFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Role role;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1<Boolean, Unit> onValueChange;

    public /* synthetic */ ToggleableElement(boolean z10, l lVar, InterfaceC13561B interfaceC13561B, boolean z11, Role role, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, lVar, interfaceC13561B, z11, role, function1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ToggleableElement.class != other.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) other;
        return this.value == toggleableElement.value && Intrinsics.e(this.interactionSource, toggleableElement.interactionSource) && Intrinsics.e(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.enabled == toggleableElement.enabled && Intrinsics.e(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ToggleableElement(boolean z10, l lVar, InterfaceC13561B interfaceC13561B, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
        this.value = z10;
        this.interactionSource = lVar;
        this.indicationNodeFactory = interfaceC13561B;
        this.enabled = z11;
        this.role = role;
        this.onValueChange = function1;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.value) * 31;
        l lVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        InterfaceC13561B interfaceC13561B = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (interfaceC13561B != null ? interfaceC13561B.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Role role = this.role;
        return ((iHashCode3 + (role != null ? Role.n(role.getValue()) : 0)) * 31) + this.onValueChange.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b b() {
        return new b(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(b node) {
        node.s3(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange);
    }
}
