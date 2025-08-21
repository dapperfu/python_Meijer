package com.scandit.datacapture.core.internal.module.source;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC13501q extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f126065a;

    public HandlerC13501q(C13502s pool) {
        Intrinsics.j(pool, "pool");
        this.f126065a = new WeakReference(pool);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        C13502s c13502s = (C13502s) this.f126065a.get();
        if (c13502s == null) {
            return;
        }
        Object obj = msg.obj;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        c13502s.a((byte[]) obj);
    }
}
