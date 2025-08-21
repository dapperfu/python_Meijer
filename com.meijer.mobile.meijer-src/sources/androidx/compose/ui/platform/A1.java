package androidx.compose.ui.platform;

import android.graphics.Rect;
import kotlin.Metadata;
import r1.C16820n;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/A1;", "", "Lr1/n;", "semanticsNode", "Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Lr1/n;Landroid/graphics/Rect;)V", "a", "Lr1/n;", "b", "()Lr1/n;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16820n semanticsNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Rect adjustedBounds;

    /* renamed from: a, reason: from getter */
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    /* renamed from: b, reason: from getter */
    public final C16820n getSemanticsNode() {
        return this.semanticsNode;
    }

    public A1(C16820n c16820n, Rect rect) {
        this.semanticsNode = c16820n;
        this.adjustedBounds = rect;
    }
}
