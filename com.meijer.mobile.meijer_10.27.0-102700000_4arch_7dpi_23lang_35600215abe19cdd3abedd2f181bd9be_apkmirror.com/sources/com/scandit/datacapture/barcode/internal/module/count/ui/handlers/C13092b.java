package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13092b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f121641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13092b(r rVar) {
        super(1);
        this.f121641a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.j(it, "it");
        return this.f121641a.f121667a.getRecognizedBrush();
    }
}
