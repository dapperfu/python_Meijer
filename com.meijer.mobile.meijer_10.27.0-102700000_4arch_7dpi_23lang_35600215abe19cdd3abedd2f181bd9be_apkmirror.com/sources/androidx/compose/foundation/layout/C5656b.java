package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AbstractC5774a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/b;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "LH1/h;", "before", "after", "<init>", "(Landroidx/compose/ui/layout/a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "Landroidx/compose/ui/layout/a;", "getAlignmentLine", "()Landroidx/compose/ui/layout/a;", "L2", "(Landroidx/compose/ui/layout/a;)V", "p", "F", "getBefore-D9Ej5fM", "()F", "M2", "(F)V", "q", "getAfter-D9Ej5fM", "K2", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5656b extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private AbstractC5774a alignmentLine;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float before;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float after;

    public /* synthetic */ C5656b(AbstractC5774a abstractC5774a, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5774a, f10, f11);
    }

    private C5656b(AbstractC5774a abstractC5774a, float f10, float f11) {
        this.alignmentLine = abstractC5774a;
        this.before = f10;
        this.after = f11;
    }

    public final void K2(float f10) {
        this.after = f10;
    }

    public final void L2(AbstractC5774a abstractC5774a) {
        this.alignmentLine = abstractC5774a;
    }

    public final void M2(float f10) {
        this.before = f10;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        return C5655a.c(k10, this.alignmentLine, this.before, this.after, i10, j10);
    }
}
