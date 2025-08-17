package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes6.dex */
final class KD0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MD0 f68063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KD0(MD0 md0, Looper looper) {
        super(looper);
        this.f68063a = md0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        MD0.d(this.f68063a, message);
    }
}
