package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.Handler;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class y0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f125958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f125960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f125961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Subscription f125962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(i0 i0Var, int i10, Handler handler, C13467g c13467g, Subscription subscription) {
        super(1);
        this.f125958a = i0Var;
        this.f125959b = i10;
        this.f125960c = handler;
        this.f125961d = c13467g;
        this.f125962e = subscription;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        x0 surfaceCallback = new x0(this.f125960c, (C13467g) this.f125961d, this.f125962e);
        i0 i0Var = this.f125958a;
        int i10 = i0Var.f125863a;
        int i11 = i0Var.f125864b;
        int i12 = this.f125959b;
        use.getClass();
        Intrinsics.j(surfaceCallback, "surfaceCallback");
        com.scandit.datacapture.core.internal.module.gl.k kVar = new com.scandit.datacapture.core.internal.module.gl.k(surfaceCallback, i10, i11, i12);
        com.scandit.datacapture.core.internal.module.gl.i iVar = use.f125600g;
        iVar.sendMessage(iVar.obtainMessage(1, kVar));
        return Unit.f143329a;
    }
}
