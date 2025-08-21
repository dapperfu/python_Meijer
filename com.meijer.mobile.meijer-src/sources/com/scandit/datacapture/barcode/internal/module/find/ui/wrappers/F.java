package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class F extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.find.ui.camera.e f123282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(com.scandit.datacapture.barcode.internal.module.find.ui.camera.e eVar) {
        super(1);
        this.f123282a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        return this.f123282a;
    }
}
