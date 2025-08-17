package com.scandit.datacapture.core.ui;

import com.scandit.datacapture.core.internal.sdk.common.NativeError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f125974a = new a();

    public a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeError it = (NativeError) obj;
        Intrinsics.j(it, "it");
        String message = it.getMessage();
        Intrinsics.i(message, "getMessage(...)");
        return message;
    }
}
