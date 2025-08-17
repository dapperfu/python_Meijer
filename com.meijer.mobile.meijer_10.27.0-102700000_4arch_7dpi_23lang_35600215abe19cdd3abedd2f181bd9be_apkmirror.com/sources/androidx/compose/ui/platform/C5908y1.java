package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import java.util.List;
import kotlin.Metadata;
import r1.ScrollAxisRange;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u001b\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/y1;", "Landroidx/compose/ui/node/OwnerScope;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Lr1/i;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Lr1/i;Lr1/i;)V", "a", "I", "d", "()I", "b", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "g", "(Ljava/lang/Float;)V", "h", "e", "Lr1/i;", "()Lr1/i;", "f", "(Lr1/i;)V", "i", "", "e1", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5908y1 implements OwnerScope {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int semanticsNodeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<C5908y1> allScopes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Float oldXValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Float oldYValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange horizontalScrollAxisRange;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange verticalScrollAxisRange;

    /* renamed from: a, reason: from getter */
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    /* renamed from: b, reason: from getter */
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    /* renamed from: c, reason: from getter */
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    /* renamed from: d, reason: from getter */
    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    /* renamed from: e, reason: from getter */
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean e1() {
        return this.allScopes.contains(this);
    }

    public final void f(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void g(Float f10) {
        this.oldXValue = f10;
    }

    public final void h(Float f10) {
        this.oldYValue = f10;
    }

    public final void i(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }

    public C5908y1(int i10, List<C5908y1> list, Float f10, Float f11, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i10;
        this.allScopes = list;
        this.oldXValue = f10;
        this.oldYValue = f11;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }
}
