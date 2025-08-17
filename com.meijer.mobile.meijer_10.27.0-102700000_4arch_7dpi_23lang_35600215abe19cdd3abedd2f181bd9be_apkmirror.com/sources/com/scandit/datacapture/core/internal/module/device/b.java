package com.scandit.datacapture.core.internal.module.device;

import android.os.BatteryManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f124213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f124213a = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object systemService = this.f124213a.f124214a.getSystemService("batterymanager");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return (BatteryManager) systemService;
    }
}
