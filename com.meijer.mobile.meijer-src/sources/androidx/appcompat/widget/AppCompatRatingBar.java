package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import i.C14578a;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final C5777k f46736a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136272L);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f46736a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        H.a(this, getContext());
        C5777k c5777k = new C5777k(this);
        this.f46736a = c5777k;
        c5777k.c(attributeSet, i10);
    }
}
