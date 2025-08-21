package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.k;
import com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.s;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f123650a;

    /* renamed from: b, reason: collision with root package name */
    public final Size2 f123651b;

    public i(s quadrilateralMapper, Size2 minSize) {
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(minSize, "minSize");
        this.f123650a = quadrilateralMapper;
        this.f123651b = minSize;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c
    public final a a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        return new a(track.getIdentifier(), k.a((Quadrilateral) this.f123650a.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture()), this.f123651b), pickState);
    }
}
