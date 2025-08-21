package com.scandit.datacapture.core.internal.sdk.extensions;

import com.medallia.digital.mobilesdk.l3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f126425a = new d();

    public d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Float.valueOf(((Number) obj).intValue() / l3.f93323c);
    }
}
