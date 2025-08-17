package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.platform.N0;
import k0.C15086a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/layout/b;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "LH1/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/N0;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/a;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "n", "()Landroidx/compose/foundation/layout/b;", "node", "o", "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroidx/compose/ui/layout/a;", "getAlignmentLine", "()Landroidx/compose/ui/layout/a;", "c", "F", "getBefore-D9Ej5fM", "()F", "d", "getAfter-D9Ej5fM", "e", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends Y<C5656b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5774a alignmentLine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<N0, Unit> inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AbstractC5774a abstractC5774a, float f10, float f11, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5774a, f10, f11, function1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = other instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) other : null;
        return alignmentLineOffsetDpElement != null && Intrinsics.e(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && H1.h.u(this.before, alignmentLineOffsetDpElement.before) && H1.h.u(this.after, alignmentLineOffsetDpElement.after);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(AbstractC5774a abstractC5774a, float f10, float f11, Function1<? super N0, Unit> function1) {
        this.alignmentLine = abstractC5774a;
        this.before = f10;
        this.after = f11;
        this.inspectorInfo = function1;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            C15086a.a("Padding from alignment line must be a non-negative number");
        }
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + H1.h.w(this.before)) * 31) + H1.h.w(this.after);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5656b b() {
        return new C5656b(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(C5656b node) {
        node.L2(this.alignmentLine);
        node.M2(this.before);
        node.K2(this.after);
    }
}
