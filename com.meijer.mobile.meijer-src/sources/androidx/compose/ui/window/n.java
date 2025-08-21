package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/window/n;", "Landroidx/compose/ui/window/o;", "<init>", "()V", "Landroid/view/View;", "composeView", "", "width", "height", "", "c", "(Landroid/view/View;II)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class n extends o {
    @Override // androidx.compose.ui.window.o, androidx.compose.ui.window.l
    public void c(View composeView, int width, int height) {
        composeView.setSystemGestureExclusionRects(CollectionsKt.s(new Rect(0, 0, width, height)));
    }
}
