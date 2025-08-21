package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import com.scandit.datacapture.barcode.internal.module.pick.capture.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f123550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f123551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, v vVar) {
        super(0);
        this.f123550a = fVar;
        this.f123551b = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f123550a.a(this.f123551b);
        return Unit.f143329a;
    }
}
