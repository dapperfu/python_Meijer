package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13097g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f121647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13097g(r rVar) {
        super(1);
        this.f121647a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return this.f121647a.f121667a.brushForUnscannedTrackedBarcode(it);
    }
}
