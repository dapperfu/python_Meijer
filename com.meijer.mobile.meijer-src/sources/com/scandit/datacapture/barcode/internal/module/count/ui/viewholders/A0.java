package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class A0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f122807a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(J0 j02) {
        super(1);
        this.f122807a = j02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        J0 j02 = this.f122807a;
        int i10 = J0.f122842m;
        return j02.b(it);
    }
}
