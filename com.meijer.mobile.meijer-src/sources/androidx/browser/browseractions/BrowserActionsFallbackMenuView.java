package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import s.C16988a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f47356a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47357b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47356a = getResources().getDimensionPixelOffset(C16988a.f159687b);
        this.f47357b = getResources().getDimensionPixelOffset(C16988a.f159686a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f47356a * 2), this.f47357b), 1073741824), i11);
    }
}
