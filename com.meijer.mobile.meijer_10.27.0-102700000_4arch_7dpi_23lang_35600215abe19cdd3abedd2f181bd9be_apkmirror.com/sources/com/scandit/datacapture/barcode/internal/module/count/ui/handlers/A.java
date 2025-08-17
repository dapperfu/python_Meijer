package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class A extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f121601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(J j10) {
        super(0);
        this.f121601a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121601a.f121630p.listButtonPressed();
        return Unit.f142422a;
    }
}
