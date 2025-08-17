package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class A extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f121510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f121511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, B b10) {
        super(1);
        this.f121510a = context;
        this.f121511b = b10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        q qVar = new q(this.f121510a);
        qVar.f121571g = this.f121511b;
        return qVar;
    }
}
