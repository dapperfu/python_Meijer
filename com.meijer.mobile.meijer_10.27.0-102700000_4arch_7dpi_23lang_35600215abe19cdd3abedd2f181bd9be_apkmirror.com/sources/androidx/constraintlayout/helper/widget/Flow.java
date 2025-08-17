package androidx.constraintlayout.helper.widget;

import V1.e;
import V1.g;
import V1.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.f;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* renamed from: k, reason: collision with root package name */
    private g f52996k;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void h(e eVar, boolean z10) {
        this.f52996k.K0(z10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i10, int i11) {
        n(this.f52996k, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f52996k.F1(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f52996k.G1(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f52996k.H1(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f52996k.I1(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f52996k.J1(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f52996k.K1(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f52996k.L1(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f52996k.M1(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f52996k.R1(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f52996k.S1(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f52996k.Y0(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f52996k.Z0(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f52996k.b1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f52996k.c1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f52996k.e1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f52996k.T1(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f52996k.U1(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f52996k.V1(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f52996k.W1(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f52996k.X1(i10);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        this.f52996k = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f53425a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53432b1) {
                    this.f52996k.S1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53439c1) {
                    this.f52996k.Y0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53509m1) {
                    this.f52996k.d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53516n1) {
                    this.f52996k.a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53446d1) {
                    this.f52996k.b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53453e1) {
                    this.f52996k.e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53460f1) {
                    this.f52996k.c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53467g1) {
                    this.f52996k.Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53335L1) {
                    this.f52996k.X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53268B1) {
                    this.f52996k.M1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53329K1) {
                    this.f52996k.W1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53572v1) {
                    this.f52996k.G1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53282D1) {
                    this.f52996k.O1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53586x1) {
                    this.f52996k.I1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53296F1) {
                    this.f52996k.Q1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53600z1) {
                    this.f52996k.K1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53565u1) {
                    this.f52996k.F1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53275C1) {
                    this.f52996k.N1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53579w1) {
                    this.f52996k.H1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53289E1) {
                    this.f52996k.P1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53317I1) {
                    this.f52996k.U1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53593y1) {
                    this.f52996k.J1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f53310H1) {
                    this.f52996k.T1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f53261A1) {
                    this.f52996k.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53323J1) {
                    this.f52996k.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53303G1) {
                    this.f52996k.R1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f53003d = this.f52996k;
        m();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void n(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar != null) {
            lVar.S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.N0(), lVar.M0());
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
