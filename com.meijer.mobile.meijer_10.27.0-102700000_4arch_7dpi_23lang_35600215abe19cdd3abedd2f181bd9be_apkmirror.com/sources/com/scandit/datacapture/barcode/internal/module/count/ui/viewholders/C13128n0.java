package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.n0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13128n0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13139t0 f122039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13128n0(C13139t0 c13139t0) {
        super(1);
        this.f122039a = c13139t0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        return this.f122039a.a(it);
    }
}
