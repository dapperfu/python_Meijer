package com.google.maps.android.ktx;

import Md.C4110c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/google/maps/android/ktx/GoogleMapKt$awaitAnimateCamera$2$1", "LMd/c$a;", "", "onFinish", "()V", "onCancel", "maps-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class GoogleMapKt$awaitAnimateCamera$2$1 implements C4110c.a {
    final /* synthetic */ InterfaceC15815n<Unit> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitAnimateCamera$2$1(InterfaceC15815n<? super Unit> interfaceC15815n) {
        this.$continuation = interfaceC15815n;
    }

    @Override // Md.C4110c.a
    public void onCancel() {
        InterfaceC15815n.a.a(this.$continuation, null, 1, null);
    }

    @Override // Md.C4110c.a
    public void onFinish() {
        InterfaceC15815n<Unit> interfaceC15815n = this.$continuation;
        Result.Companion companion = Result.INSTANCE;
        interfaceC15815n.resumeWith(Result.b(Unit.f143329a));
    }
}
