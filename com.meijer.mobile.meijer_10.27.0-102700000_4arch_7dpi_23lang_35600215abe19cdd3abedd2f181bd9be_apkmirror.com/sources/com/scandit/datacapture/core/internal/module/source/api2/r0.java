package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes11.dex */
public final class r0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f124978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f124979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Ref.LongRef longRef, long j10) {
        super(1);
        this.f124978a = longRef;
        this.f124979b = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        Ref.LongRef longRef = this.f124978a;
        long j10 = this.f124979b;
        com.scandit.datacapture.core.internal.module.utils.f fVar = use.f124663v;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (fVar) {
            fVar.f125328b.a(j10, jUptimeMillis);
            unit = Unit.f142422a;
        }
        fVar.a();
        longRef.f142834a = use.f124663v.f125331e;
        return unit;
    }
}
