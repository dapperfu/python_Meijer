package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.kS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8659kS implements InterfaceC9289qH {

    /* renamed from: a, reason: collision with root package name */
    private Message f76488a;

    private C8659kS() {
        throw null;
    }

    public final C8659kS a(Message message, C8874mT c8874mT) {
        this.f76488a = message;
        return this;
    }

    /* synthetic */ C8659kS(LS ls2) {
    }

    public final boolean b(Handler handler) {
        Message message = this.f76488a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f76488a = null;
        C8874mT.e(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9289qH
    public final void zza() {
        Message message = this.f76488a;
        message.getClass();
        message.sendToTarget();
        this.f76488a = null;
        C8874mT.e(this);
    }
}
