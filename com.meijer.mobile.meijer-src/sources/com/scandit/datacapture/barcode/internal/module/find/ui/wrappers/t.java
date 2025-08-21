package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f123318a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar) {
        super(1);
        this.f123318a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Number) obj).floatValue();
        this.f123318a.a();
        this.f123318a.f123319a.setListener(null);
        return Unit.f143329a;
    }
}
