package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13228e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f122596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f122597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13228e(W w10, r rVar) {
        super(1);
        this.f122596a = w10;
        this.f122597b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f122596a.ordinal();
        if (iOrdinal == 1) {
            return this.f122597b.f122619a.getAcceptedNotInListBrush();
        }
        if (iOrdinal == 2) {
            return this.f122597b.f122619a.getRejectedNotInListBrush();
        }
        if (iOrdinal == 3) {
            return this.f122597b.f122619a.getNotInListBrush();
        }
        throw new IllegalStateException(("Unreachable " + this.f122596a).toString());
    }
}
