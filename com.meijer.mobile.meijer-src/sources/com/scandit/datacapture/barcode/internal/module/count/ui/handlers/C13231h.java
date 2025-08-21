package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13231h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13231h(r rVar) {
        super(1);
        this.f122600a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        return this.f122600a.f122619a.brushFromFilterSettings();
    }
}
