package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.Jd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class HandlerC6857Jd0 extends Handler {
    public HandlerC6857Jd0(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}
