package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import android.view.View;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.v;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.w;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final View f122601a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f122602b;

    /* renamed from: c, reason: collision with root package name */
    public final v f122603c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodePickState f122604d;

    /* renamed from: e, reason: collision with root package name */
    public final TrackedObject f122605e;

    public a(View view, Rect rect, w tapData, BarcodePickState pickState, TrackedObject trackedObject) {
        Intrinsics.j(view, "view");
        Intrinsics.j(rect, "rect");
        Intrinsics.j(tapData, "tapData");
        Intrinsics.j(pickState, "pickState");
        Intrinsics.j(trackedObject, "trackedObject");
        this.f122601a = view;
        this.f122602b = rect;
        this.f122603c = tapData;
        this.f122604d = pickState;
        this.f122605e = trackedObject;
    }
}
