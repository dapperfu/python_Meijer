package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import i.C14587j;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5776j extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f47210b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f47211a;

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f47210b && this.f47211a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        M mV = M.v(context, attributeSet, C14587j.f136589g2, i10, i11);
        if (mV.s(C14587j.f136599i2)) {
            b(mV.a(C14587j.f136599i2, false));
        }
        setBackgroundDrawable(mV.g(C14587j.f136594h2));
        mV.x();
    }

    private void b(boolean z10) {
        if (f47210b) {
            this.f47211a = z10;
        } else {
            androidx.core.widget.j.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f47210b && this.f47211a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public C5776j(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f47210b && this.f47211a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
