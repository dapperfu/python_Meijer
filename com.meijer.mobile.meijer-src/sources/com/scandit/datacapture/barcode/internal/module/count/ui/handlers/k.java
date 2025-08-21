package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f122605a = rVar;
        this.f122606b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return (Brush) this.f122605a.f122621c.get(Integer.valueOf(this.f122606b.getGlobalId$scandit_barcode_capture()));
    }
}
