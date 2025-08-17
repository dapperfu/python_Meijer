package com.scandit.datacapture.core.internal.module.init;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes11.dex */
public final /* synthetic */ class d extends FunctionReference implements Function1 {
    public d(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.b(e.class);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "storeLog";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "storeLog(Ljava/lang/String;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p02 = (String) obj;
        Intrinsics.j(p02, "p0");
        ((e) this.receiver).a(p02);
        return Unit.f142422a;
    }
}
