package com.scandit.datacapture.core.internal.module.source;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class HandlerC13368q extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125113a;

    public HandlerC13368q(C13369s pool) {
        Intrinsics.j(pool, "pool");
        this.f125113a = new WeakReference(pool);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        C13369s c13369s = (C13369s) this.f125113a.get();
        if (c13369s == null) {
            return;
        }
        Object obj = msg.obj;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        c13369s.a((byte[]) obj);
    }
}
