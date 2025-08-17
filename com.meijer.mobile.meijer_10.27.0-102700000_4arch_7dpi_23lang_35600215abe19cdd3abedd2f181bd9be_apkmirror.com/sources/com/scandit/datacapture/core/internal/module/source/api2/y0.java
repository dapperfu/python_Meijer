package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.Handler;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class y0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f125006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f125008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f125009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Subscription f125010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(i0 i0Var, int i10, Handler handler, C13334g c13334g, Subscription subscription) {
        super(1);
        this.f125006a = i0Var;
        this.f125007b = i10;
        this.f125008c = handler;
        this.f125009d = c13334g;
        this.f125010e = subscription;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        x0 surfaceCallback = new x0(this.f125008c, (C13334g) this.f125009d, this.f125010e);
        i0 i0Var = this.f125006a;
        int i10 = i0Var.f124911a;
        int i11 = i0Var.f124912b;
        int i12 = this.f125007b;
        use.getClass();
        Intrinsics.j(surfaceCallback, "surfaceCallback");
        com.scandit.datacapture.core.internal.module.gl.k kVar = new com.scandit.datacapture.core.internal.module.gl.k(surfaceCallback, i10, i11, i12);
        com.scandit.datacapture.core.internal.module.gl.i iVar = use.f124648g;
        iVar.sendMessage(iVar.obtainMessage(1, kVar));
        return Unit.f142422a;
    }
}
