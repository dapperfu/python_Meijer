package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f122616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f122617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(W w10, r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f122616a = w10;
        this.f122617b = rVar;
        this.f122618c = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f122616a.ordinal();
        if (iOrdinal == 1) {
            zContainsKey = this.f122617b.f122623e.containsKey(Integer.valueOf(this.f122618c.getGlobalId$scandit_barcode_capture()));
        } else if (iOrdinal == 2) {
            zContainsKey = this.f122617b.f122624f.containsKey(Integer.valueOf(this.f122618c.getGlobalId$scandit_barcode_capture()));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalStateException(("Unreachable " + this.f122616a).toString());
            }
            zContainsKey = this.f122617b.f122622d.containsKey(Integer.valueOf(this.f122618c.getGlobalId$scandit_barcode_capture()));
        }
        return Boolean.valueOf(zContainsKey);
    }
}
