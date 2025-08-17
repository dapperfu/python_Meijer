package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.kS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8534kS implements InterfaceC9164qH {

    /* renamed from: a, reason: collision with root package name */
    private Message f75648a;

    private C8534kS() {
        throw null;
    }

    public final C8534kS a(Message message, C8749mT c8749mT) {
        this.f75648a = message;
        return this;
    }

    /* synthetic */ C8534kS(LS ls2) {
    }

    public final boolean b(Handler handler) {
        Message message = this.f75648a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f75648a = null;
        C8749mT.e(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9164qH
    public final void zza() {
        Message message = this.f75648a;
        message.getClass();
        message.sendToTarget();
        this.f75648a = null;
        C8749mT.e(this);
    }
}
