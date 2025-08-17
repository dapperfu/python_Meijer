package com.google.maps.android.ktx;

import Kd.C3945c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/google/maps/android/ktx/GoogleMapKt$awaitAnimateCamera$2$1", "LKd/c$a;", "", "onFinish", "()V", "onCancel", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class GoogleMapKt$awaitAnimateCamera$2$1 implements C3945c.a {
    final /* synthetic */ InterfaceC16654n<Unit> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitAnimateCamera$2$1(InterfaceC16654n<? super Unit> interfaceC16654n) {
        this.$continuation = interfaceC16654n;
    }

    @Override // Kd.C3945c.a
    public void onCancel() {
        InterfaceC16654n.a.a(this.$continuation, null, 1, null);
    }

    @Override // Kd.C3945c.a
    public void onFinish() {
        InterfaceC16654n<Unit> interfaceC16654n = this.$continuation;
        Result.Companion companion = Result.INSTANCE;
        interfaceC16654n.resumeWith(Result.b(Unit.f142422a));
    }
}
