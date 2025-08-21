package com.scandit.datacapture.core.internal.module.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes12.dex */
public final /* synthetic */ class e extends FunctionReference implements Function1 {
    public e(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.b(DataCaptureTextureView.class);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "doRender";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "doRender(Lcom/scandit/datacapture/core/internal/module/gl/GlRenderThread$RenderData;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.j p02 = (com.scandit.datacapture.core.internal.module.gl.j) obj;
        Intrinsics.j(p02, "p0");
        DataCaptureTextureView.a((DataCaptureTextureView) this.receiver, p02);
        return Unit.f143329a;
    }
}
