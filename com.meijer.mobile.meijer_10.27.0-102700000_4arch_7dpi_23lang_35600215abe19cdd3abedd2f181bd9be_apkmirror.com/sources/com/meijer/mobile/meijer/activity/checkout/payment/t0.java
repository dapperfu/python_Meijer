package com.meijer.mobile.meijer.activity.checkout.payment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/t0;", "", "Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;", "listener", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;)V", "", "b", "()V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;", "getListener", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;", "setListener", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private u0 listener;

    public t0(u0 listener) {
        Intrinsics.j(listener, "listener");
        this.listener = listener;
    }

    public final void a() {
        this.listener.W(false);
    }

    public final void b() {
        this.listener.W(true);
    }
}
