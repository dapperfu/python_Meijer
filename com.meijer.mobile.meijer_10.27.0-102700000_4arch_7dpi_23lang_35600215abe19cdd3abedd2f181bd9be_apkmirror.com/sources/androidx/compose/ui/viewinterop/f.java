package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5773p;
import androidx.compose.ui.focus.s;
import androidx.compose.ui.node.C5815k;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "e", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier$c;", "Landroid/view/View;", "g", "(Landroidx/compose/ui/Modifier$c;)Landroid/view/View;", "other", "", "d", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/focus/s;", "focusOwner", "hostView", "embeddedView", "Landroid/graphics/Rect;", "f", "(Landroidx/compose/ui/focus/s;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect f(s sVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        androidx.compose.ui.geometry.Rect rectQ = sVar.q();
        if (rectQ == null) {
            return null;
        }
        return new Rect((((int) rectQ.getLeft()) + iArr[0]) - iArr2[0], (((int) rectQ.getTop()) + iArr[1]) - iArr2[1], (((int) rectQ.l()) + iArr[0]) - iArr2[0], (((int) rectQ.i()) + iArr[1]) - iArr2[1]);
    }

    public static final Modifier e(Modifier modifier) {
        return C5773p.a(C5773p.a(modifier.then(FocusGroupPropertiesElement.f52750b)).then(FocusTargetPropertiesElement.f52751b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View g(Modifier.c cVar) {
        View viewR = C5815k.o(cVar.getNode()).R();
        if (viewR != null) {
            return viewR;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
