package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13226c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13226c(r rVar) {
        super(1);
        this.f122594a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.j(it, "it");
        return this.f122594a.f122619a.getUnrecognizedBrush();
    }
}
