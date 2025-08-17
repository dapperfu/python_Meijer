package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13123l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13133q f122028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13123l(C13133q c13133q) {
        super(1);
        this.f122028a = c13133q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        return this.f122028a.a(it);
    }
}
