package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class t extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final w f124170a;

    /* renamed from: b, reason: collision with root package name */
    public x f124171b;

    public t(RelativeLayout container, SparkScanStateManager stateManager) {
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        w touchListener = new w(context, stateManager, container);
        Intrinsics.j(container, "container");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(touchListener, "touchListener");
        super(container.getContext());
        this.f124170a = touchListener;
        setBackgroundColor(0);
        s sVar = new s(this);
        Intrinsics.j(sVar, "<set-?>");
        touchListener.f124175c = sVar;
        setOnTouchListener(touchListener);
    }
}
