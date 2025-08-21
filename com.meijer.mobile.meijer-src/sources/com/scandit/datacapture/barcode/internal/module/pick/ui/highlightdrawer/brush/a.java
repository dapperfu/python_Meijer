package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.m f123500a;

    /* renamed from: b, reason: collision with root package name */
    public final v f123501b;

    /* renamed from: c, reason: collision with root package name */
    public final v f123502c;

    /* renamed from: d, reason: collision with root package name */
    public final v f123503d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodePickState f123504e;

    /* renamed from: f, reason: collision with root package name */
    public final TrackedObject f123505f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f123506g;

    public a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.m mVar, v drawData, w wVar, w boundingBoxData, BarcodePickState pickState, TrackedObject trackedObject, Drawable drawable) {
        Intrinsics.j(drawData, "drawData");
        Intrinsics.j(boundingBoxData, "boundingBoxData");
        Intrinsics.j(pickState, "pickState");
        Intrinsics.j(trackedObject, "trackedObject");
        this.f123500a = mVar;
        this.f123501b = drawData;
        this.f123502c = wVar;
        this.f123503d = boundingBoxData;
        this.f123504e = pickState;
        this.f123505f = trackedObject;
        this.f123506g = drawable;
    }
}
