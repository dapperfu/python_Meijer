package com.scandit.datacapture.core.internal.module.https.scandit.listeners;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsSession;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionDelegate;
import com.scandit.datacapture.core.internal.module.https.scandit.V;
import com.scandit.datacapture.core.internal.module.https.scandit.X;
import com.scandit.datacapture.core.internal.module.https.scandit.Y;
import com.scandit.datacapture.core.internal.module.https.scandit.g0;
import com.scandit.datacapture.core.internal.module.https.scandit.j0;
import com.scandit.datacapture.core.internal.module.https.scandit.l0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124744a;

    public a(NativeHttpsSession session) {
        Intrinsics.j(session, "session");
        WeakReference session2 = new WeakReference(session);
        Intrinsics.j(session2, "session");
        this.f124744a = session2;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.scandit.Y
    public final void a(X event) {
        NativeHttpsSessionDelegate delegate;
        Intrinsics.j(event, "event");
        NativeHttpsSession nativeHttpsSession = (NativeHttpsSession) this.f124744a.get();
        if (nativeHttpsSession == null) {
            return;
        }
        V v10 = event instanceof V ? (V) event : null;
        if (v10 == null) {
            return;
        }
        l0 l0Var = v10.f124702b;
        if (((l0Var instanceof j0) || (l0Var instanceof g0)) && (delegate = nativeHttpsSession.getDelegate()) != null) {
            delegate.didComplete(nativeHttpsSession, v10.f124701a);
        }
    }
}
