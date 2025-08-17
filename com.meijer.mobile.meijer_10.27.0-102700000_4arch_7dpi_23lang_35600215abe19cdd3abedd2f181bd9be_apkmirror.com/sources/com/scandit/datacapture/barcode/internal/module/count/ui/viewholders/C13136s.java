package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13136s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13146x f122068a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13136s(C13146x c13146x) {
        super(1);
        this.f122068a = c13146x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        return this.f122068a.a(it);
    }
}
