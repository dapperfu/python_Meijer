package com.google.android.libraries.places.internal;

import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5509c;
import Vd.InterfaceC5511e;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzlr {
    private final Map zza = new HashMap();

    public final AbstractC5516j zza(AbstractC5516j abstractC5516j, AbstractC5507a abstractC5507a, long j10, String str) {
        final C5517k c5517k = abstractC5507a == null ? new C5517k() : new C5517k(abstractC5507a);
        Map map = this.zza;
        if (!map.containsKey(c5517k)) {
            HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
            handlerThread.start();
            map.put(c5517k, handlerThread);
            final String str2 = "Location timeout.";
            new Handler(handlerThread.getLooper()).postDelayed(new Runnable(str2) { // from class: com.google.android.libraries.places.internal.zzlq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.d(new ApiException(new Status(15, "Location timeout.")));
                }
            }, j10);
        }
        abstractC5516j.k(new InterfaceC5509c(this) { // from class: com.google.android.libraries.places.internal.zzlo
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j2) {
                C5517k c5517k2 = c5517k;
                Exception excM = abstractC5516j2.m();
                if (abstractC5516j2.r()) {
                    c5517k2.c(abstractC5516j2.n());
                } else if (!abstractC5516j2.p() && excM != null) {
                    c5517k2.b(excM);
                }
                return c5517k2.a();
            }
        });
        c5517k.a().c(new InterfaceC5511e() { // from class: com.google.android.libraries.places.internal.zzlp
            @Override // Vd.InterfaceC5511e
            public final /* synthetic */ void onComplete(AbstractC5516j abstractC5516j2) {
                this.zza.zzb(c5517k, abstractC5516j2);
            }
        });
        return c5517k.a();
    }

    final /* synthetic */ void zzb(C5517k c5517k, AbstractC5516j abstractC5516j) {
        HandlerThread handlerThread = (HandlerThread) this.zza.remove(c5517k);
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
    }

    public zzlr(zzln zzlnVar) {
    }
}
