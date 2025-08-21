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
/* loaded from: classes12.dex */
public final class HandlerC13457a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125777a;

    public HandlerC13457a(C13498n delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f125777a = new WeakReference(delegate);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.j(msg, "msg");
        C13498n c13498n = (C13498n) this.f125777a.get();
        if (c13498n == null) {
            return;
        }
        int i10 = msg.what;
        if (i10 == 1) {
            Object obj = msg.obj;
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Pair<android.graphics.SurfaceTexture, kotlin.Function1<kotlin.Boolean, kotlin.Unit>>");
            Pair pair = (Pair) obj;
            ((Function1) pair.d()).invoke(Boolean.valueOf(c13498n.f126052d.a((SurfaceTexture) pair.c())));
            return;
        }
        if (i10 == 2) {
            c13498n.a(true);
            Object obj2 = msg.obj;
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            C13498n.a(c13498n, (Function1) TypeIntrinsics.f(obj2, 1));
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            c13498n.b();
            return;
        }
        c13498n.a(false);
        Object obj3 = msg.obj;
        Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        C13498n.a(c13498n, (Function1) TypeIntrinsics.f(obj3, 1));
        HandlerC13457a handlerC13457a = c13498n.f126053e;
        if (handlerC13457a != null) {
            handlerC13457a.sendMessageDelayed(handlerC13457a.obtainMessage(4), 2000L);
        }
    }
}
