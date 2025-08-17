package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AbstractC5657c;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.node.n0;
import j0.RowColumnParentData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/I;", "Landroidx/compose/ui/node/n0;", "Landroidx/compose/ui/Modifier$c;", "<init>", "()V", "a", "Landroidx/compose/foundation/layout/I$a;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class I extends Modifier.c implements n0 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/I$a;", "Landroidx/compose/foundation/layout/I;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/a;)V", "LH1/d;", "", "parentData", "R", "(LH1/d;Ljava/lang/Object;)Ljava/lang/Object;", "o", "Landroidx/compose/ui/layout/a;", "getAlignmentLine", "()Landroidx/compose/ui/layout/a;", "K2", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends I {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private AbstractC5774a alignmentLine;

        public a(AbstractC5774a abstractC5774a) {
            super(null);
            this.alignmentLine = abstractC5774a;
        }

        public final void K2(AbstractC5774a abstractC5774a) {
            this.alignmentLine = abstractC5774a;
        }

        @Override // androidx.compose.ui.node.n0
        public Object R(H1.d dVar, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.e(AbstractC5667m.INSTANCE.a(new AbstractC5657c.Value(this.alignmentLine)));
            return rowColumnParentData;
        }
    }

    public /* synthetic */ I(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private I() {
    }
}
