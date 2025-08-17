package com.scandit.datacapture.core.internal.module.https.scandit.client;

import com.scandit.datacapture.core.internal.module.https.scandit.X;
import com.scandit.datacapture.core.internal.module.https.scandit.Y;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f124714a;

    public c(e eVar) {
        this.f124714a = eVar;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.scandit.Y
    public final void a(X event) {
        Intrinsics.j(event, "event");
        Iterator it = this.f124714a.f124721f.iterator();
        while (it.hasNext()) {
            try {
                ((Y) it.next()).a(event);
            } catch (Throwable unused) {
            }
        }
    }
}
