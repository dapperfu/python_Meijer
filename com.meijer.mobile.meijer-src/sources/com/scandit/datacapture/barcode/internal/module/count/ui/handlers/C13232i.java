package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13232i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f122601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f122602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13232i(W w10, r rVar) {
        super(1);
        this.f122601a = w10;
        this.f122602b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f122601a.ordinal();
        if (iOrdinal == 1) {
            return this.f122602b.f122619a.brushForAcceptedBarcodeNotInList(it);
        }
        if (iOrdinal == 2) {
            return this.f122602b.f122619a.brushForRejectedBarcodeNotInList(it);
        }
        if (iOrdinal == 3) {
            return this.f122602b.f122619a.brushForTrackedBarcodeNotInList(it);
        }
        throw new IllegalStateException(("Unreachable " + this.f122601a).toString());
    }
}
