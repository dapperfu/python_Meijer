package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import s.C16842a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f47132a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47133b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47132a = getResources().getDimensionPixelOffset(C16842a.f159824b);
        this.f47133b = getResources().getDimensionPixelOffset(C16842a.f159823a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f47132a * 2), this.f47133b), 1073741824), i11);
    }
}
