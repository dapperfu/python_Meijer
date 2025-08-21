package fsimpl;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;

/* renamed from: fsimpl.ab, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class ViewOnApplyWindowInsetsListenerC14075ab implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f132820a;

    private ViewOnApplyWindowInsetsListenerC14075ab() {
        this.f132820a = false;
    }

    /* synthetic */ ViewOnApplyWindowInsetsListenerC14075ab(Z z10) {
        this();
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i10;
        Insets insets = windowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout());
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        if (this.f132820a) {
            i10 = 0;
            this.f132820a = false;
            if (insets.top != 0) {
            }
            layoutParams.y = i10;
            ((WindowManager) view.getContext().getSystemService(WindowManager.class)).updateViewLayout(view, layoutParams);
            return windowInsets;
        }
        if (insets.top == 0) {
            this.f132820a = true;
            return windowInsets;
        }
        i10 = layoutParams.y + insets.top;
        layoutParams.y = i10;
        ((WindowManager) view.getContext().getSystemService(WindowManager.class)).updateViewLayout(view, layoutParams);
        return windowInsets;
    }
}
