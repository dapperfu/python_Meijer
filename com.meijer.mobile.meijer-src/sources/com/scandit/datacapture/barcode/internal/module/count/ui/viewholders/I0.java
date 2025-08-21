package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class I0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f122836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(J0 j02, boolean z10, Function0 function0) {
        super(0);
        this.f122836a = j02;
        this.f122837b = z10;
        this.f122838c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        J0 j02 = this.f122836a;
        boolean z10 = this.f122837b;
        Function0 onFinished = this.f122838c;
        j02.getClass();
        Intrinsics.j(onFinished, "onFinished");
        j02.f122848f.a(new E0(j02, z10, onFinished));
        return Unit.f143329a;
    }
}
