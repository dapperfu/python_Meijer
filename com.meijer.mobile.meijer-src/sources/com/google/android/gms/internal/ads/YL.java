package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes6.dex */
public final class YL {

    /* renamed from: a, reason: collision with root package name */
    private Context f72378a;

    /* renamed from: b, reason: collision with root package name */
    private PopupWindow f72379b;

    public final void b() {
        PopupWindow popupWindow;
        Context context = this.f72378a;
        if (context == null || this.f72379b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && (popupWindow = this.f72379b) != null && popupWindow.isShowing()) {
            this.f72379b.dismiss();
        }
        this.f72378a = null;
        this.f72379b = null;
    }

    public final void a(Context context, View view) {
        Window window;
        PopupWindow popupWindow;
        if (com.google.android.gms.common.util.n.b() && !com.google.android.gms.common.util.n.d()) {
            if (context instanceof Activity) {
                window = ((Activity) context).getWindow();
            } else {
                window = null;
            }
            if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
                popupWindow = null;
            } else {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.addView(view, -1, -1);
                popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setClippingEnabled(false);
                Sc.p.b("Displaying the 1x1 popup off the screen.");
                try {
                    popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception unused) {
                }
            }
            this.f72379b = popupWindow;
            if (popupWindow == null) {
                context = null;
            }
            this.f72378a = context;
        }
    }
}
