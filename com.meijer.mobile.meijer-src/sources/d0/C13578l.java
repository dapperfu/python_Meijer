package d0;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.C5958l;
import androidx.compose.ui.node.InterfaceC5956j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/j;", "", "b", "(Landroidx/compose/ui/node/j;)Z", "Landroid/view/View;", "c", "(Landroid/view/View;)Z", "", "a", "J", "()J", "TapIndicationDelay", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13578l {

    /* renamed from: a, reason: collision with root package name */
    private static final long f127786a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f127786a;
    }

    public static final boolean b(InterfaceC5956j interfaceC5956j) {
        return c(C5958l.a(interfaceC5956j));
    }

    private static final boolean c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
