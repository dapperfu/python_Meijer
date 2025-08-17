package com.scandit.datacapture.core.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Camera f125914a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Camera camera) {
        super(1);
        this.f125914a = camera;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.j(it, "it");
        this.f125914a.getBehaviorDelegate().a(it);
        return Unit.f142422a;
    }
}
