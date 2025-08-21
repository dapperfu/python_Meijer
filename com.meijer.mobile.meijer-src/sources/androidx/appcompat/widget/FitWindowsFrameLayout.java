package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5791z f46871a;

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC5791z interfaceC5791z = this.f46871a;
        if (interfaceC5791z != null) {
            interfaceC5791z.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC5791z interfaceC5791z) {
        this.f46871a = interfaceC5791z;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
