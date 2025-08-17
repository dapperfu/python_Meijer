package fsimpl;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;

/* renamed from: fsimpl.ab, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class ViewOnApplyWindowInsetsListenerC13950ab implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f131570a;

    private ViewOnApplyWindowInsetsListenerC13950ab() {
        this.f131570a = false;
    }

    /* synthetic */ ViewOnApplyWindowInsetsListenerC13950ab(Z z10) {
        this();
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i10;
        Insets insets = windowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout());
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        if (this.f131570a) {
            i10 = 0;
            this.f131570a = false;
            if (insets.top != 0) {
            }
            layoutParams.y = i10;
            ((WindowManager) view.getContext().getSystemService(WindowManager.class)).updateViewLayout(view, layoutParams);
            return windowInsets;
        }
        if (insets.top == 0) {
            this.f131570a = true;
            return windowInsets;
        }
        i10 = layoutParams.y + insets.top;
        layoutParams.y = i10;
        ((WindowManager) view.getContext().getSystemService(WindowManager.class)).updateViewLayout(view, layoutParams);
        return windowInsets;
    }
}
