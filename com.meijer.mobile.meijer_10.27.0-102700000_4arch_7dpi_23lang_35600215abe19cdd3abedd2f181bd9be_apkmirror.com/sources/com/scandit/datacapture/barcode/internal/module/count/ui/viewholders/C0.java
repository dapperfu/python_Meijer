package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class C0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f121859a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(J0 j02) {
        super(0);
        this.f121859a = j02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f121859a.f121892b.getContext();
        Intrinsics.i(context, "getContext(...)");
        return new com.scandit.datacapture.barcode.internal.module.count.ui.a(context, J0.a(this.f121859a), J0.b(this.f121859a), J0.f121890m);
    }
}
