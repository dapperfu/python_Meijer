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
    private g f53220k;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void h(e eVar, boolean z10) {
        this.f53220k.K0(z10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i10, int i11) {
        n(this.f53220k, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f53220k.F1(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f53220k.G1(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f53220k.H1(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f53220k.I1(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f53220k.J1(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f53220k.K1(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f53220k.L1(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f53220k.M1(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f53220k.R1(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f53220k.S1(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f53220k.Y0(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f53220k.Z0(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f53220k.b1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f53220k.c1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f53220k.e1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f53220k.T1(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f53220k.U1(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f53220k.V1(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f53220k.W1(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f53220k.X1(i10);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        this.f53220k = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f53649a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53656b1) {
                    this.f53220k.S1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53663c1) {
                    this.f53220k.Y0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53733m1) {
                    this.f53220k.d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53740n1) {
                    this.f53220k.a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53670d1) {
                    this.f53220k.b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53677e1) {
                    this.f53220k.e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53684f1) {
                    this.f53220k.c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53691g1) {
                    this.f53220k.Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53559L1) {
                    this.f53220k.X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53492B1) {
                    this.f53220k.M1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53553K1) {
                    this.f53220k.W1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53796v1) {
                    this.f53220k.G1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53506D1) {
                    this.f53220k.O1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53810x1) {
                    this.f53220k.I1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53520F1) {
                    this.f53220k.Q1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f53824z1) {
                    this.f53220k.K1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53789u1) {
                    this.f53220k.F1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53499C1) {
                    this.f53220k.N1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53803w1) {
                    this.f53220k.H1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53513E1) {
                    this.f53220k.P1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53541I1) {
                    this.f53220k.U1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f53817y1) {
                    this.f53220k.J1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f53534H1) {
                    this.f53220k.T1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f53485A1) {
                    this.f53220k.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53547J1) {
                    this.f53220k.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f53527G1) {
                    this.f53220k.R1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f53227d = this.f53220k;
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
