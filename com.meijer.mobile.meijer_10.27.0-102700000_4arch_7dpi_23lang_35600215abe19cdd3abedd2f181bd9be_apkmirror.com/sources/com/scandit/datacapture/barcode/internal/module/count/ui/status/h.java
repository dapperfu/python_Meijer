package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f121801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, boolean z10) {
        super(0);
        this.f121801a = mVar;
        this.f121802b = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121801a.a(true, this.f121802b);
        return Unit.f142422a;
    }
}
