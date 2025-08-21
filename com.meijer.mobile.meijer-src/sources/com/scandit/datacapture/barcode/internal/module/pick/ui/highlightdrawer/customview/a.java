package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import android.view.View;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.v;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.w;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final View f123553a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f123554b;

    /* renamed from: c, reason: collision with root package name */
    public final v f123555c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodePickState f123556d;

    /* renamed from: e, reason: collision with root package name */
    public final TrackedObject f123557e;

    public a(View view, Rect rect, w tapData, BarcodePickState pickState, TrackedObject trackedObject) {
        Intrinsics.j(view, "view");
        Intrinsics.j(rect, "rect");
        Intrinsics.j(tapData, "tapData");
        Intrinsics.j(pickState, "pickState");
        Intrinsics.j(trackedObject, "trackedObject");
        this.f123553a = view;
        this.f123554b = rect;
        this.f123555c = tapData;
        this.f123556d = pickState;
        this.f123557e = trackedObject;
    }
}
