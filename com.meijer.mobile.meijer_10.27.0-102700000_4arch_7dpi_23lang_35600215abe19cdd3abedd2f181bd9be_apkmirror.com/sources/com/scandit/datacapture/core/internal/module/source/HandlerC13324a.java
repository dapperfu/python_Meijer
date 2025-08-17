package com.scandit.datacapture.core.internal.module.source;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class HandlerC13324a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124825a;

    public HandlerC13324a(C13365n delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f124825a = new WeakReference(delegate);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        C13365n c13365n = (C13365n) this.f124825a.get();
        if (c13365n == null) {
            return;
        }
        int i10 = msg.what;
        if (i10 == 1) {
            Object obj = msg.obj;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Pair<android.graphics.SurfaceTexture, kotlin.Function1<kotlin.Boolean, kotlin.Unit>>");
            Pair pair = (Pair) obj;
            ((Function1) pair.d()).invoke(Boolean.valueOf(c13365n.f125100d.a((SurfaceTexture) pair.c())));
            return;
        }
        if (i10 == 2) {
            c13365n.a(true);
            Object obj2 = msg.obj;
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            C13365n.a(c13365n, (Function1) TypeIntrinsics.f(obj2, 1));
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            c13365n.b();
            return;
        }
        c13365n.a(false);
        Object obj3 = msg.obj;
        Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        C13365n.a(c13365n, (Function1) TypeIntrinsics.f(obj3, 1));
        HandlerC13324a handlerC13324a = c13365n.f125101e;
        if (handlerC13324a != null) {
            handlerC13324a.sendMessageDelayed(handlerC13324a.obtainMessage(4), 2000L);
        }
    }
}
