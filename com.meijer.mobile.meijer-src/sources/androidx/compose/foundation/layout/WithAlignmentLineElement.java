package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.I;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/layout/I$a;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/a;)V", "k", "()Landroidx/compose/foundation/layout/I$a;", "node", "", "n", "(Landroidx/compose/foundation/layout/I$a;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/ui/layout/a;", "getAlignmentLine", "()Landroidx/compose/ui/layout/a;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WithAlignmentLineElement extends Y<I.a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5916a alignmentLine;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = other instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) other : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return Intrinsics.e(this.alignmentLine, withAlignmentLineElement.alignmentLine);
    }

    public int hashCode() {
        return this.alignmentLine.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public I.a b() {
        return new I.a(this.alignmentLine);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(I.a node) {
        node.K2(this.alignmentLine);
    }

    public WithAlignmentLineElement(AbstractC5916a abstractC5916a) {
        this.alignmentLine = abstractC5916a;
    }
}
