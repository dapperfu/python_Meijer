package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class P extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(u0 u0Var) {
        super(0);
        this.f122159a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        u0 u0Var = this.f122159a;
        if (u0Var.f122294n) {
            u0Var.f122294n = false;
            ViewExtensionsKt.runOnMainThread(u0Var.f122290j, new i0(u0Var));
        }
        return Unit.f142422a;
    }
}
