package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        this.f53228e = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void i(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f53309n0.E0(0);
        bVar.f53309n0.h0(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }
}
