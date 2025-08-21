package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13233j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13233j(r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f122603a = rVar;
        this.f122604b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return (Brush) this.f122603a.f122620b.get(Integer.valueOf(this.f122604b.getGlobalId$scandit_barcode_capture()));
    }
}
