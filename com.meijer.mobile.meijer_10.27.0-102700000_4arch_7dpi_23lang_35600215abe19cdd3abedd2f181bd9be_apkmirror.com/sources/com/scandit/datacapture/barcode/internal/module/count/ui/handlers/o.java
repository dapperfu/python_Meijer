package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f121661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f121661a = rVar;
        this.f121662b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return Boolean.valueOf(this.f121661a.f121669c.containsKey(Integer.valueOf(this.f121662b.getGlobalId$scandit_barcode_capture())));
    }
}
