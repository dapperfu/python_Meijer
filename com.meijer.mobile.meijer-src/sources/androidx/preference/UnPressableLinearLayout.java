package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes4.dex */
public class UnPressableLinearLayout extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z10) {
    }

    public UnPressableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
