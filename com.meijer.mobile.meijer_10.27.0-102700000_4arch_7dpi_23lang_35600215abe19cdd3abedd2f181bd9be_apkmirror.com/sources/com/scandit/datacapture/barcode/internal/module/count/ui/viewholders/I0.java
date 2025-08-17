package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class I0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f121884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(J0 j02, boolean z10, Function0 function0) {
        super(0);
        this.f121884a = j02;
        this.f121885b = z10;
        this.f121886c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        J0 j02 = this.f121884a;
        boolean z10 = this.f121885b;
        Function0 onFinished = this.f121886c;
        j02.getClass();
        Intrinsics.j(onFinished, "onFinished");
        j02.f121896f.a(new E0(j02, z10, onFinished));
        return Unit.f142422a;
    }
}
