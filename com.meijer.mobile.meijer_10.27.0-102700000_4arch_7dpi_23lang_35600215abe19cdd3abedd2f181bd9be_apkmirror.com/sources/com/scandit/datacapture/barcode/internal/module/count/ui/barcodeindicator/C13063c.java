package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13063c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f121432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121433b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13063c(C13070j c13070j, TrackedBarcode trackedBarcode) {
        super(1);
        this.f121432a = c13070j;
        this.f121433b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        W statusParam = (W) obj;
        Intrinsics.j(statusParam, "statusParam");
        return (Brush) this.f121432a.invoke(this.f121433b, statusParam);
    }
}
