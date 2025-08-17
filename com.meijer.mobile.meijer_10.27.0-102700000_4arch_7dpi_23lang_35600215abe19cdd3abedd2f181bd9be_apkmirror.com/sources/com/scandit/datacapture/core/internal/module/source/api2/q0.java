package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class q0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f124976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(long j10) {
        super(1);
        this.f124976a = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        long j10 = this.f124976a;
        com.scandit.datacapture.core.internal.module.utils.f fVar = use.f124663v;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (fVar) {
            com.scandit.datacapture.core.internal.module.utils.c cVar = fVar.f125328b;
            cVar.getClass();
            cVar.f125320b.put(new com.scandit.datacapture.core.internal.module.utils.e(j10), Long.valueOf(jUptimeMillis));
            com.scandit.datacapture.core.internal.module.utils.c cVar2 = fVar.f125329c;
            cVar2.getClass();
            cVar2.f125320b.put(new com.scandit.datacapture.core.internal.module.utils.e(j10), Long.valueOf(jUptimeMillis));
            unit = Unit.f142422a;
        }
        return unit;
    }
}
