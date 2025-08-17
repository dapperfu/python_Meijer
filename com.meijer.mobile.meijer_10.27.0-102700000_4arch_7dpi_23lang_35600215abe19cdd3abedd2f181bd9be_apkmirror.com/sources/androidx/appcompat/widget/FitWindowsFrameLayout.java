package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5649z f46647a;

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC5649z interfaceC5649z = this.f46647a;
        if (interfaceC5649z != null) {
            interfaceC5649z.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC5649z interfaceC5649z) {
        this.f46647a = interfaceC5649z;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
