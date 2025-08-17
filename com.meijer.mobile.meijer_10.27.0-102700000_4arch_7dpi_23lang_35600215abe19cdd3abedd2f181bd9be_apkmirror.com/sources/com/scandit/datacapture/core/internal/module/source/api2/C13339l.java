package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13339l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13343p f124924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13339l(C13343p c13343p) {
        super(0);
        this.f124924a = c13343p;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13343p c13343p = this.f124924a;
        if (c13343p.f124966o == 1) {
            c13343p.startSingleShotFocusInArea(c13343p.f124967p);
        } else {
            c13343p.startContinuousFocusInArea(c13343p.f124967p);
        }
        return Unit.f142422a;
    }
}
