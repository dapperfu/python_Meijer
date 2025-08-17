package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13095e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f121644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f121645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13095e(W w10, r rVar) {
        super(1);
        this.f121644a = w10;
        this.f121645b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f121644a.ordinal();
        if (iOrdinal == 1) {
            return this.f121645b.f121667a.getAcceptedNotInListBrush();
        }
        if (iOrdinal == 2) {
            return this.f121645b.f121667a.getRejectedNotInListBrush();
        }
        if (iOrdinal == 3) {
            return this.f121645b.f121667a.getNotInListBrush();
        }
        throw new IllegalStateException(("Unreachable " + this.f121644a).toString());
    }
}
