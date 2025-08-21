package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13196c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f122384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13196c(C13203j c13203j, TrackedBarcode trackedBarcode) {
        super(1);
        this.f122384a = c13203j;
        this.f122385b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        W statusParam = (W) obj;
        Intrinsics.j(statusParam, "statusParam");
        return (Brush) this.f122384a.invoke(this.f122385b, statusParam);
    }
}
