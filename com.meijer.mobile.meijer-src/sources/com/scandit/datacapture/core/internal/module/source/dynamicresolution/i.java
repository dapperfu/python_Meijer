package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f126006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f126007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f126006a = context;
        this.f126007b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Toast.makeText(this.f126006a, "Dynamic resolution - " + this.f126007b, 0).show();
        return Unit.f143329a;
    }
}
