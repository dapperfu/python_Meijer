package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.InterfaceC5225c;
import Z.C5503a;
import android.util.Log;
import com.fullstory.FS;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
class V {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f88847a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, AbstractC5232j<String>> f88848b = new C5503a();

    interface a {
        AbstractC5232j<String> start();
    }

    public static /* synthetic */ AbstractC5232j a(V v10, String str, AbstractC5232j abstractC5232j) {
        synchronized (v10) {
            v10.f88848b.remove(str);
        }
        return abstractC5232j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized AbstractC5232j<String> b(final String str, a aVar) {
        AbstractC5232j<String> abstractC5232j = this.f88848b.get(str);
        if (abstractC5232j != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return abstractC5232j;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Making new request for: " + str);
        }
        AbstractC5232j abstractC5232jL = aVar.start().l(this.f88847a, new InterfaceC5225c() { // from class: com.google.firebase.messaging.U
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j2) {
                return V.a(this.f88845a, str, abstractC5232j2);
            }
        });
        this.f88848b.put(str, abstractC5232jL);
        return abstractC5232jL;
    }

    V(Executor executor) {
        this.f88847a = executor;
    }
}
