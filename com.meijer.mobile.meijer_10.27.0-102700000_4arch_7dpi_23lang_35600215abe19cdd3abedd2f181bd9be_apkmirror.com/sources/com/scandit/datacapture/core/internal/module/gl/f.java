package com.scandit.datacapture.core.internal.module.gl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f124628a = new f();

    public f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l it = (l) obj;
        Intrinsics.j(it, "it");
        it.f124648g.sendEmptyMessage(2);
        return Unit.f142422a;
    }
}
