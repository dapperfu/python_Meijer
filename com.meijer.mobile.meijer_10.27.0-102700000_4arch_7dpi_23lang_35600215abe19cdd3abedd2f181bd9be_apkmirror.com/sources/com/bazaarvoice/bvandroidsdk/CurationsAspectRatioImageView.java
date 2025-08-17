package com.bazaarvoice.bvandroidsdk;

import O6.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public final class CurationsAspectRatioImageView extends AppCompatImageView {
    private static final String TAG = "AspRatioImageView";
    private int heightRatio;
    private int widthRatio;

    public CurationsAspectRatioImageView(Context context, int i10, int i11) {
        super(context);
        this.widthRatio = i10;
        this.heightRatio = i11;
    }

    public void setRatio(int i10, int i11) {
        this.widthRatio = i10;
        this.heightRatio = i11;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            if (mode2 != 1073741824) {
                size2 = (int) (((size * 1.0f) / this.widthRatio) * this.heightRatio);
            }
        } else if (mode2 == 1073741824) {
            size = (int) (((size2 * 1.0f) / this.heightRatio) * this.widthRatio);
        } else {
            throw new IllegalStateException("Either width or height must be EXACTLY.");
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (getScaleX() * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (getScaleY() * size2), 1073741824));
    }

    public CurationsAspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f23356u);
        this.widthRatio = typedArrayObtainStyledAttributes.getInteger(d.f23358w, 1);
        this.heightRatio = typedArrayObtainStyledAttributes.getInteger(d.f23357v, 1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
