package com.google.android.gms.internal.pal;

import Vd.C5517k;
import Vd.C5519m;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.zzx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jd.AbstractC14995s;
import jd.InterfaceC14993p;

/* loaded from: classes6.dex */
public final class L2 extends K2 {

    /* renamed from: e, reason: collision with root package name */
    private final D5 f83576e;

    /* renamed from: f, reason: collision with root package name */
    private final zzx f83577f;

    public L2(Handler handler, ExecutorService executorService, Context context, zzx zzxVar) {
        I5 i52 = new I5(context);
        super(handler, executorService, C10783e2.b(2L));
        this.f83576e = i52;
        this.f83577f = zzxVar;
    }

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10995r6 a() {
        final Bundle bundle = new Bundle();
        try {
            D5 d52 = this.f83576e;
            final I5 i52 = (I5) d52;
            return AbstractC10995r6.f((String) C5519m.b(((I5) d52).doRead(AbstractC14995s.a().c(false).d(C10884k6.f84047a).b(new InterfaceC14993p() { // from class: com.google.android.gms.internal.pal.E5
                @Override // jd.InterfaceC14993p
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    I5 i53 = i52;
                    ((C5) ((J5) obj).getService()).g8(bundle, new H5(i53, (C5517k) obj2));
                }
            }).a()), 5L, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            this.f83577f.zza(2);
            return AbstractC10995r6.e();
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof zzgy) {
                FS.log_d("NonceGenerator", "SignalSdk Error code: " + ((zzgy) cause).a());
                this.f83577f.zza(3);
            }
            return AbstractC10995r6.e();
        }
    }
}
