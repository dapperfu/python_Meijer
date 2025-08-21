package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5791z f46872a;

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC5791z interfaceC5791z = this.f46872a;
        if (interfaceC5791z != null) {
            interfaceC5791z.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC5791z interfaceC5791z) {
        this.f46872a = interfaceC5791z;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
