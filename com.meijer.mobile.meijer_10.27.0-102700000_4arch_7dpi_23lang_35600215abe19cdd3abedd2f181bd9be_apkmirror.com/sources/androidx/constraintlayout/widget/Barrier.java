package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    private int f52997i;

    /* renamed from: j, reason: collision with root package name */
    private int f52998j;

    /* renamed from: k, reason: collision with root package name */
    private V1.a f52999k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void o(V1.e eVar, int i10, boolean z10) {
        this.f52998j = i10;
        if (z10) {
            int i11 = this.f52997i;
            if (i11 == 5) {
                this.f52998j = 1;
            } else if (i11 == 6) {
                this.f52998j = 0;
            }
        } else {
            int i12 = this.f52997i;
            if (i12 == 5) {
                this.f52998j = 0;
            } else if (i12 == 6) {
                this.f52998j = 1;
            }
        }
        if (eVar instanceof V1.a) {
            ((V1.a) eVar).P0(this.f52998j);
        }
    }

    public int getMargin() {
        return this.f52999k.M0();
    }

    public int getType() {
        return this.f52997i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void h(V1.e eVar, boolean z10) {
        o(eVar, this.f52997i, z10);
    }

    public boolean n() {
        return this.f52999k.K0();
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f52999k.O0(z10);
    }

    public void setMargin(int i10) {
        this.f52999k.Q0(i10);
    }

    public void setType(int i10) {
        this.f52997i = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        this.f52999k = new V1.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f53425a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53537q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53530p1) {
                    this.f52999k.O0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == f.f53544r1) {
                    this.f52999k.Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f53003d = this.f52999k;
        m();
    }

    public void setDpMargin(int i10) {
        this.f52999k.Q0((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }
}
