package com.scandit.datacapture.core.internal.sdk.utils;

import android.view.View;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Size2UtilsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"size", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "Landroid/view/View;", "getSize", "(Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/Size2;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ObjectOverlayUtilsKt {
    public static final Size2 getSize(View view) {
        return view == null ? Size2UtilsKt.getSIZE_2_ZERO() : new Size2(view.getWidth(), view.getHeight());
    }
}
