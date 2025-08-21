package com.scandit.datacapture.core.internal.module.source;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: com.scandit.datacapture.core.internal.module.source.y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C13508y extends FunctionReference implements Function1 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.b(F.class);
    }

    public C13508y() {
        super(1, CameraFactory.f125724d);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "getCameraDelegateFactory";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getCameraDelegateFactory(Lcom/scandit/datacapture/core/internal/module/source/NativeCameraApi;)Lcom/scandit/datacapture/core/internal/module/source/CameraDelegateFactory;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCameraApi p02 = (NativeCameraApi) obj;
        Intrinsics.j(p02, "p0");
        return F.a((F) this.receiver, p02);
    }
}
