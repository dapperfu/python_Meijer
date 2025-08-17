package com.bugsnag.android.ndk;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
/* loaded from: classes4.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Function0 f63515a;

    a(Function0 function0) {
        this.f63515a = function0;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        Intrinsics.f(this.f63515a.invoke(), "invoke(...)");
    }
}
