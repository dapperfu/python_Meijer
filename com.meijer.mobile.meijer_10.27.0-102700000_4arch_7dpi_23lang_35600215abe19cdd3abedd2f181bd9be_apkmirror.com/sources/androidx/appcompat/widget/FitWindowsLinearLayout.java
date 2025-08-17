package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5649z f46648a;

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC5649z interfaceC5649z = this.f46648a;
        if (interfaceC5649z != null) {
            interfaceC5649z.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC5649z interfaceC5649z) {
        this.f46648a = interfaceC5649z;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
