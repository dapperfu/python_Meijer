package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13099i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f121649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f121650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13099i(W w10, r rVar) {
        super(1);
        this.f121649a = w10;
        this.f121650b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f121649a.ordinal();
        if (iOrdinal == 1) {
            return this.f121650b.f121667a.brushForAcceptedBarcodeNotInList(it);
        }
        if (iOrdinal == 2) {
            return this.f121650b.f121667a.brushForRejectedBarcodeNotInList(it);
        }
        if (iOrdinal == 3) {
            return this.f121650b.f121667a.brushForTrackedBarcodeNotInList(it);
        }
        throw new IllegalStateException(("Unreachable " + this.f121649a).toString());
    }
}
