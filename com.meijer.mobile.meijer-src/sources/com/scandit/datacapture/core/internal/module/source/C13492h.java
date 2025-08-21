package com.scandit.datacapture.core.internal.module.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13492h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeCameraDelegateSettings f126035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13498n f126036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f126037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13492h(NativeCameraDelegateSettings nativeCameraDelegateSettings, C13498n c13498n, Function1 function1) {
        super(1);
        this.f126035a = nativeCameraDelegateSettings;
        this.f126036b = c13498n;
        this.f126037c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        C13491g surfaceCallback = new C13491g(this.f126036b, this.f126037c);
        int width = (int) this.f126035a.frameResolution.getWidth();
        int height = (int) this.f126035a.frameResolution.getHeight();
        int i10 = com.scandit.datacapture.core.internal.module.gl.l.f125593A;
        use.getClass();
        Intrinsics.j(surfaceCallback, "surfaceCallback");
        com.scandit.datacapture.core.internal.module.gl.k kVar = new com.scandit.datacapture.core.internal.module.gl.k(surfaceCallback, width, height, 0);
        com.scandit.datacapture.core.internal.module.gl.i iVar = use.f125600g;
        iVar.sendMessage(iVar.obtainMessage(1, kVar));
        use.f125617x = false;
        return Unit.f143329a;
    }
}
