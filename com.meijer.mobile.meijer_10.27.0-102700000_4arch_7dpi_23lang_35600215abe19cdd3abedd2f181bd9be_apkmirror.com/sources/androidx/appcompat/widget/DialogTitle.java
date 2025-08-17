package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import i.C14584j;

/* loaded from: classes.dex */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int lineCount;
        super.onMeasure(i10, i11);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C14584j.f136734J2, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14584j.f136738K2, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            super.onMeasure(i10, i11);
        }
    }
}
