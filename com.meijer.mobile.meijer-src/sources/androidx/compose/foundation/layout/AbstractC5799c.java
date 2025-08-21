package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/c;", "", "<init>", "()V", "Landroidx/compose/ui/layout/f0;", "placeable", "", "a", "(Landroidx/compose/ui/layout/f0;)I", "Landroidx/compose/foundation/layout/c$a;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5799c {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/c$a;", "Landroidx/compose/foundation/layout/c;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/a;)V", "Landroidx/compose/ui/layout/f0;", "placeable", "", "a", "(Landroidx/compose/ui/layout/f0;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/a;", "getAlignmentLine", "()Landroidx/compose/ui/layout/a;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.c$a, reason: from toString */
    public static final /* data */ class Value extends AbstractC5799c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5916a alignmentLine;

        public Value(AbstractC5916a abstractC5916a) {
            super(null);
            this.alignmentLine = abstractC5916a;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Value) && Intrinsics.e(this.alignmentLine, ((Value) other).alignmentLine);
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }

        @Override // androidx.compose.foundation.layout.AbstractC5799c
        public int a(f0 placeable) {
            return placeable.l0(this.alignmentLine);
        }
    }

    public /* synthetic */ AbstractC5799c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(f0 placeable);

    private AbstractC5799c() {
    }
}
