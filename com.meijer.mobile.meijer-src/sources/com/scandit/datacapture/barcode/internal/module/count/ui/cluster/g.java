package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import android.view.GestureDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f122486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f122487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, j jVar) {
        super(0);
        this.f122486a = context;
        this.f122487b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new GestureDetector(this.f122486a, this.f122487b.f122497d);
    }
}
