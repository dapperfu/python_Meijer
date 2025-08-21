package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.k;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Size2 f123640a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f123641b;

    public e(Size2 minSize, com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.h quadrilateralMapper) {
        Intrinsics.j(minSize, "minSize");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        this.f123640a = minSize;
        this.f123641b = quadrilateralMapper;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c
    public final a a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        return new a(track.getIdentifier(), QuadrilateralUtilsKt.boundingBox(k.a((Quadrilateral) this.f123641b.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture()), this.f123640a)), pickState);
    }
}
