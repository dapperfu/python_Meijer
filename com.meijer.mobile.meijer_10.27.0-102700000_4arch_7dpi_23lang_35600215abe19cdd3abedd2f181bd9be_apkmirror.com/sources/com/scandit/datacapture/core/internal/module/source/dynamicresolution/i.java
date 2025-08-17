package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f125054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f125055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f125054a = context;
        this.f125055b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Toast.makeText(this.f125054a, "Dynamic resolution - " + this.f125055b, 0).show();
        return Unit.f142422a;
    }
}
