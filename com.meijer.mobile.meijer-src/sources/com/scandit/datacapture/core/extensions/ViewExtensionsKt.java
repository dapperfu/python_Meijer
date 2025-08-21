package com.scandit.datacapture.core.extensions;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.scandit.datacapture.core.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"addRippleForeground", "", "Landroid/view/View;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewExtensionsKt {
    public static final void addRippleForeground(View view) {
        Intrinsics.j(view, "<this>");
        view.setForeground(new RippleDrawable(ColorStateList.valueOf(view.getContext().getColor(R.color.sc_default_ripple)), null, view.getBackground()));
    }
}
