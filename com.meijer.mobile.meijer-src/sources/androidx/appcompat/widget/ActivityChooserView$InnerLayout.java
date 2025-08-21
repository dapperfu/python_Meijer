package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f46705a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        M mU = M.u(context, attributeSet, f46705a);
        setBackgroundDrawable(mU.g(0));
        mU.x();
    }
}
