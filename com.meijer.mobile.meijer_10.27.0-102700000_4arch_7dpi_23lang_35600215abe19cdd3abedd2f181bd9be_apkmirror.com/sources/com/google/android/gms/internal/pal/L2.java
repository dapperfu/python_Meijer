package com.google.android.gms.internal.pal;

import Td.C5233k;
import Td.C5235m;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.zzx;
import hd.AbstractC14417s;
import hd.InterfaceC14415p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public final class L2 extends K2 {

    /* renamed from: e, reason: collision with root package name */
    private final D5 f82736e;

    /* renamed from: f, reason: collision with root package name */
    private final zzx f82737f;

    public L2(Handler handler, ExecutorService executorService, Context context, zzx zzxVar) {
        I5 i52 = new I5(context);
        super(handler, executorService, C10658e2.b(2L));
        this.f82736e = i52;
        this.f82737f = zzxVar;
    }

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10870r6 a() {
        final Bundle bundle = new Bundle();
        try {
            D5 d52 = this.f82736e;
            final I5 i52 = (I5) d52;
            return AbstractC10870r6.f((String) C5235m.b(((I5) d52).doRead(AbstractC14417s.a().c(false).d(C10759k6.f83207a).b(new InterfaceC14415p() { // from class: com.google.android.gms.internal.pal.E5
                @Override // hd.InterfaceC14415p
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    I5 i53 = i52;
                    ((C5) ((J5) obj).getService()).j8(bundle, new H5(i53, (C5233k) obj2));
                }
            }).a()), 5L, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            this.f82737f.zza(2);
            return AbstractC10870r6.e();
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof zzgy) {
                FS.log_d("NonceGenerator", "SignalSdk Error code: " + ((zzgy) cause).a());
                this.f82737f.zza(3);
            }
            return AbstractC10870r6.e();
        }
    }
}
