package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13100j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f121651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13100j(r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f121651a = rVar;
        this.f121652b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return (Brush) this.f121651a.f121668b.get(Integer.valueOf(this.f121652b.getGlobalId$scandit_barcode_capture()));
    }
}
