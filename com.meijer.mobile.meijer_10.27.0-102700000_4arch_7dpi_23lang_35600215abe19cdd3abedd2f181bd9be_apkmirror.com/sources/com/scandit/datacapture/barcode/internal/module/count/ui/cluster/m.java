package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import android.view.GestureDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f121550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f121551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, p pVar) {
        super(0);
        this.f121550a = context;
        this.f121551b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new GestureDetector(this.f121550a, this.f121551b.f121558d);
    }
}
