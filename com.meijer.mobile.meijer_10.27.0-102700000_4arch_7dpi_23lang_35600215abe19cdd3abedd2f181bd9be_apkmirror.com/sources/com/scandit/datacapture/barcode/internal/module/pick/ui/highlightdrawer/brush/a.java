package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.m f122548a;

    /* renamed from: b, reason: collision with root package name */
    public final v f122549b;

    /* renamed from: c, reason: collision with root package name */
    public final v f122550c;

    /* renamed from: d, reason: collision with root package name */
    public final v f122551d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodePickState f122552e;

    /* renamed from: f, reason: collision with root package name */
    public final TrackedObject f122553f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f122554g;

    public a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.m mVar, v drawData, w wVar, w boundingBoxData, BarcodePickState pickState, TrackedObject trackedObject, Drawable drawable) {
        Intrinsics.j(drawData, "drawData");
        Intrinsics.j(boundingBoxData, "boundingBoxData");
        Intrinsics.j(pickState, "pickState");
        Intrinsics.j(trackedObject, "trackedObject");
        this.f122548a = mVar;
        this.f122549b = drawData;
        this.f122550c = wVar;
        this.f122551d = boundingBoxData;
        this.f122552e = pickState;
        this.f122553f = trackedObject;
        this.f122554g = drawable;
    }
}
