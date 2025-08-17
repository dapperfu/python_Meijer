package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import android.view.GestureDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f121534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f121535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, j jVar) {
        super(0);
        this.f121534a = context;
        this.f121535b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new GestureDetector(this.f121534a, this.f121535b.f121545d);
    }
}
