package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import android.view.GestureDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f122502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f122503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, p pVar) {
        super(0);
        this.f122502a = context;
        this.f122503b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new GestureDetector(this.f122502a, this.f122503b.f122510d);
    }
}
