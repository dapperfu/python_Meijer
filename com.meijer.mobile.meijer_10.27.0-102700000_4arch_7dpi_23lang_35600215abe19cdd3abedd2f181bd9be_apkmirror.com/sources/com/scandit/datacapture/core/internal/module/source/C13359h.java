package com.scandit.datacapture.core.internal.module.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13359h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeCameraDelegateSettings f125083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13365n f125084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f125085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13359h(NativeCameraDelegateSettings nativeCameraDelegateSettings, C13365n c13365n, Function1 function1) {
        super(1);
        this.f125083a = nativeCameraDelegateSettings;
        this.f125084b = c13365n;
        this.f125085c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        C13358g surfaceCallback = new C13358g(this.f125084b, this.f125085c);
        int width = (int) this.f125083a.frameResolution.getWidth();
        int height = (int) this.f125083a.frameResolution.getHeight();
        int i10 = com.scandit.datacapture.core.internal.module.gl.l.f124641A;
        use.getClass();
        Intrinsics.j(surfaceCallback, "surfaceCallback");
        com.scandit.datacapture.core.internal.module.gl.k kVar = new com.scandit.datacapture.core.internal.module.gl.k(surfaceCallback, width, height, 0);
        com.scandit.datacapture.core.internal.module.gl.i iVar = use.f124648g;
        iVar.sendMessage(iVar.obtainMessage(1, kVar));
        use.f124665x = false;
        return Unit.f142422a;
    }
}
