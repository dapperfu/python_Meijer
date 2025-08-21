package androidx.constraintlayout.widget;

import V1.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    private boolean f53349i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f53350j;

    public void n(l lVar, int i10, int i11) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f53649a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53698h1) {
                    this.f53349i = true;
                } else if (index == f.f53747o1) {
                    this.f53350j = true;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f53349i || this.f53350j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f53225b; i10++) {
                View viewP = constraintLayout.p(this.f53224a[i10]);
                if (viewP != null) {
                    if (this.f53349i) {
                        viewP.setVisibility(visibility);
                    }
                    if (this.f53350j && elevation > 0.0f) {
                        viewP.setTranslationZ(viewP.getTranslationZ() + elevation);
                    }
                }
            }
        }
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
