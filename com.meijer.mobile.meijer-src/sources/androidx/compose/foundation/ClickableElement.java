package androidx.compose.foundation;

import androidx.compose.ui.node.Y;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13561B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/d;", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "k", "()Landroidx/compose/foundation/d;", "node", "n", "(Landroidx/compose/foundation/d;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lh0/l;", "c", "Ld0/B;", "d", "Z", "e", "Ljava/lang/String;", "f", "Landroidx/compose/ui/semantics/Role;", "g", "Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends Y<d> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0.l interactionSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13561B indicationNodeFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String onClickLabel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Role role;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    public /* synthetic */ ClickableElement(h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z10, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, interfaceC13561B, z10, str, role, function0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ClickableElement.class != other.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) other;
        return Intrinsics.e(this.interactionSource, clickableElement.interactionSource) && Intrinsics.e(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.enabled == clickableElement.enabled && Intrinsics.e(this.onClickLabel, clickableElement.onClickLabel) && Intrinsics.e(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    private ClickableElement(h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z10, String str, Role role, Function0<Unit> function0) {
        this.interactionSource = lVar;
        this.indicationNodeFactory = interfaceC13561B;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
    }

    public int hashCode() {
        h0.l lVar = this.interactionSource;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        InterfaceC13561B interfaceC13561B = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (interfaceC13561B != null ? interfaceC13561B.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        return ((iHashCode3 + (role != null ? Role.n(role.getValue()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public d b() {
        return new d(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(d node) {
        node.p3(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick);
    }
}
