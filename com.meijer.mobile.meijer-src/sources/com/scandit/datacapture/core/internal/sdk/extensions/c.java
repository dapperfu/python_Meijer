package com.scandit.datacapture.core.internal.sdk.extensions;

import com.medallia.digital.mobilesdk.l3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f126424a = new c();

    public c() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(RangesKt.o(MathKt.d(((Number) obj).floatValue() * l3.f93323c), 0, l3.f93323c));
    }
}
