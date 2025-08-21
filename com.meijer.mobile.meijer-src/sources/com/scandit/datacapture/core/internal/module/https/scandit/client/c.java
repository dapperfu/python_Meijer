package com.scandit.datacapture.core.internal.module.https.scandit.client;

import com.scandit.datacapture.core.internal.module.https.scandit.X;
import com.scandit.datacapture.core.internal.module.https.scandit.Y;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f125666a;

    public c(e eVar) {
        this.f125666a = eVar;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.scandit.Y
    public final void a(X event) {
        Intrinsics.j(event, "event");
        Iterator it = this.f125666a.f125673f.iterator();
        while (it.hasNext()) {
            try {
                ((Y) it.next()).a(event);
            } catch (Throwable unused) {
            }
        }
    }
}
