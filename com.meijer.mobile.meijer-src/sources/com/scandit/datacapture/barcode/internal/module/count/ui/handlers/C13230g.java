package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13230g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13230g(r rVar) {
        super(1);
        this.f122599a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return this.f122599a.f122619a.brushForUnscannedTrackedBarcode(it);
    }
}
