package com.google.android.gms.internal.pal;

import Td.AbstractC5232j;
import Td.C5235m;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.zzx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.pal.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10978y2 extends K2 {

    /* renamed from: e, reason: collision with root package name */
    private final zzx f84222e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5232j f84223f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f84224g;

    public C10978y2(Handler handler, ExecutorService executorService, Context context, AbstractC5232j abstractC5232j, zzx zzxVar) {
        super(handler, executorService, C10658e2.b(2L));
        this.f84224g = context;
        this.f84223f = abstractC5232j;
        this.f84222e = zzxVar;
    }

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10870r6 a() {
        try {
            return AbstractC10870r6.f(((R4) C5235m.a(this.f84223f)).b(this.f84224g, null));
        } catch (RemoteException | InterruptedException | ExecutionException unused) {
            FS.log_e("NonceGenerator", "Unexpected exception while gathering request signals.");
            this.f84222e.zza(1);
            return AbstractC10870r6.e();
        }
    }
}
