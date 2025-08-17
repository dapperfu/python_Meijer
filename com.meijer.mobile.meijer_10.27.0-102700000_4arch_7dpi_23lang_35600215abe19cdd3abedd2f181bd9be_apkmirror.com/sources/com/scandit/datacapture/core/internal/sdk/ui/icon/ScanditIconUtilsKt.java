package com.scandit.datacapture.core.internal.sdk.ui.icon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"getDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "context", "Landroid/content/Context;", "getDrawableIgnoringBackground", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScanditIconUtilsKt {
    public static final Drawable getDrawable(ScanditIcon scanditIcon, Context context) {
        Intrinsics.j(scanditIcon, "<this>");
        Intrinsics.j(context, "context");
        return scanditIcon.getDrawable$scandit_capture_core(context);
    }

    public static final Drawable getDrawableIgnoringBackground(ScanditIcon scanditIcon, Context context) {
        Intrinsics.j(scanditIcon, "<this>");
        Intrinsics.j(context, "context");
        return scanditIcon.getDrawableIgnoringBackground$scandit_capture_core(context);
    }
}
