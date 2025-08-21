package com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePick f123745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BarcodePick barcodePick) {
        super(1);
        this.f123745a = barcodePick;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObject it = (TrackedObject) obj;
        Intrinsics.j(it, "it");
        BarcodePick._onTrackedObjectTap$scandit_barcode_capture$default(this.f123745a, it, null, 2, null);
        return Unit.f143329a;
    }
}
