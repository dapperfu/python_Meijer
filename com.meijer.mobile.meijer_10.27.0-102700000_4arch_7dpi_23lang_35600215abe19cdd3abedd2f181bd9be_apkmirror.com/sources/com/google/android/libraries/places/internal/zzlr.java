package com.google.android.libraries.places.internal;

import Td.AbstractC5223a;
import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5225c;
import Td.InterfaceC5227e;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzlr {
    private final Map zza = new HashMap();

    public final AbstractC5232j zza(AbstractC5232j abstractC5232j, AbstractC5223a abstractC5223a, long j10, String str) {
        final C5233k c5233k = abstractC5223a == null ? new C5233k() : new C5233k(abstractC5223a);
        Map map = this.zza;
        if (!map.containsKey(c5233k)) {
            HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
            handlerThread.start();
            map.put(c5233k, handlerThread);
            final String str2 = "Location timeout.";
            new Handler(handlerThread.getLooper()).postDelayed(new Runnable(str2) { // from class: com.google.android.libraries.places.internal.zzlq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.d(new ApiException(new Status(15, "Location timeout.")));
                }
            }, j10);
        }
        abstractC5232j.k(new InterfaceC5225c(this) { // from class: com.google.android.libraries.places.internal.zzlo
            @Override // Td.InterfaceC5225c
            public final /* synthetic */ Object then(AbstractC5232j abstractC5232j2) {
                C5233k c5233k2 = c5233k;
                Exception excM = abstractC5232j2.m();
                if (abstractC5232j2.r()) {
                    c5233k2.c(abstractC5232j2.n());
                } else if (!abstractC5232j2.p() && excM != null) {
                    c5233k2.b(excM);
                }
                return c5233k2.a();
            }
        });
        c5233k.a().c(new InterfaceC5227e() { // from class: com.google.android.libraries.places.internal.zzlp
            @Override // Td.InterfaceC5227e
            public final /* synthetic */ void onComplete(AbstractC5232j abstractC5232j2) {
                this.zza.zzb(c5233k, abstractC5232j2);
            }
        });
        return c5233k.a();
    }

    final /* synthetic */ void zzb(C5233k c5233k, AbstractC5232j abstractC5232j) {
        HandlerThread handlerThread = (HandlerThread) this.zza.remove(c5233k);
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
    }

    public zzlr(zzln zzlnVar) {
    }
}
