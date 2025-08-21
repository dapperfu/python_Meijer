package androidx.compose.foundation.layout;

import androidx.compose.ui.node.Y;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/layout/g;", "LP0/e;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/N0;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(LP0/e;ZLkotlin/jvm/functions/Function1;)V", "k", "()Landroidx/compose/foundation/layout/g;", "node", "n", "(Landroidx/compose/foundation/layout/g;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "LP0/e;", "getAlignment", "()LP0/e;", "c", "Z", "getMatchParentSize", "()Z", "d", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BoxChildDataElement extends Y<C5803g> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P0.e alignment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean matchParentSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<N0, Unit> inspectorInfo;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = other instanceof BoxChildDataElement ? (BoxChildDataElement) other : null;
        return boxChildDataElement != null && Intrinsics.e(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5803g b() {
        return new C5803g(this.alignment, this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(C5803g node) {
        node.N2(this.alignment);
        node.O2(this.matchParentSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(P0.e eVar, boolean z10, Function1<? super N0, Unit> function1) {
        this.alignment = eVar;
        this.matchParentSize = z10;
        this.inspectorInfo = function1;
    }
}
