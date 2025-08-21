package com.scandit.datacapture.core.ui.control;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes12.dex */
public final /* synthetic */ class k extends FunctionReference implements Function1 {
    public k(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.b(TorchSwitchControl.class);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "onFrameSourceStarted";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "onFrameSourceStarted(Lcom/scandit/datacapture/core/source/FrameSource;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameSource p02 = (FrameSource) obj;
        Intrinsics.j(p02, "p0");
        TorchSwitchControl.access$onFrameSourceStarted((TorchSwitchControl) this.receiver, p02);
        return Unit.f143329a;
    }
}
