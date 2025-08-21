package androidx.view;

import android.view.View;
import android.view.Window;
import androidx.core.view.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p2.C16363j0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/s;", "Landroidx/activity/A;", "<init>", "()V", "Landroidx/activity/L;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "b", "(Landroidx/activity/L;Landroidx/activity/L;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s extends A {
    @Override // androidx.view.B
    public void b(L statusBarStyle, L navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.j(statusBarStyle, "statusBarStyle");
        Intrinsics.j(navigationBarStyle, "navigationBarStyle");
        Intrinsics.j(window, "window");
        Intrinsics.j(view, "view");
        C16363j0.b(window, false);
        window.setStatusBarColor(statusBarStyle.d(statusBarIsDark));
        window.setNavigationBarColor(navigationBarStyle.getDarkScrim());
        new k(window, view).c(!statusBarIsDark);
    }
}
