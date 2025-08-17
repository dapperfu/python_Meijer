package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import i.C14584j;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5634j extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f46986b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f46987a;

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f46986b && this.f46987a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        M mV = M.v(context, attributeSet, C14584j.f136832g2, i10, i11);
        if (mV.s(C14584j.f136842i2)) {
            b(mV.a(C14584j.f136842i2, false));
        }
        setBackgroundDrawable(mV.g(C14584j.f136837h2));
        mV.x();
    }

    private void b(boolean z10) {
        if (f46986b) {
            this.f46987a = z10;
        } else {
            androidx.core.widget.j.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f46986b && this.f46987a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public C5634j(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f46986b && this.f46987a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
