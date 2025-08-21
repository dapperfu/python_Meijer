package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f122613a = rVar;
        this.f122614b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return Boolean.valueOf(this.f122613a.f122621c.containsKey(Integer.valueOf(this.f122614b.getGlobalId$scandit_barcode_capture())));
    }
}
