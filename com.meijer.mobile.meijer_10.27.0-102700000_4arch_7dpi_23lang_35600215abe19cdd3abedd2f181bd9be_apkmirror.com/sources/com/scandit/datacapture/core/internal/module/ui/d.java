package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f125229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SurfaceTexture surfaceTexture) {
        super(1);
        this.f125229a = surfaceTexture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        SurfaceTexture surface = this.f125229a;
        use.getClass();
        Intrinsics.j(surface, "surface");
        com.scandit.datacapture.core.internal.module.gl.i iVar = use.f124648g;
        iVar.sendMessage(iVar.obtainMessage(6, surface));
        return Unit.f142422a;
    }
}
