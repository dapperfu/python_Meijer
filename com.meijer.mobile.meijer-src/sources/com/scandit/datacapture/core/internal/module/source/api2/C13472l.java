package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13472l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13476p f125876a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13472l(C13476p c13476p) {
        super(0);
        this.f125876a = c13476p;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C13476p c13476p = this.f125876a;
        if (c13476p.f125918o == 1) {
            c13476p.startSingleShotFocusInArea(c13476p.f125919p);
        } else {
            c13476p.startContinuousFocusInArea(c13476p.f125919p);
        }
        return Unit.f143329a;
    }
}
