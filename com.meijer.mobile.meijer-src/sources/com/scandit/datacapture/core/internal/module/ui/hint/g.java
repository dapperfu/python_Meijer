package com.scandit.datacapture.core.internal.module.ui.hint;

import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f126214a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar) {
        super(0);
        this.f126214a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(-((TextView) this.f126214a.f126218a.getValue()).getHeight());
    }
}
