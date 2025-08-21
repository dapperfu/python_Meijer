package com.google.android.gms.internal.pal;

import Vd.AbstractC5516j;
import Vd.C5519m;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.zzx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.pal.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11103y2 extends K2 {

    /* renamed from: e, reason: collision with root package name */
    private final zzx f85062e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5516j f85063f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f85064g;

    public C11103y2(Handler handler, ExecutorService executorService, Context context, AbstractC5516j abstractC5516j, zzx zzxVar) {
        super(handler, executorService, C10783e2.b(2L));
        this.f85064g = context;
        this.f85063f = abstractC5516j;
        this.f85062e = zzxVar;
    }

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10995r6 a() {
        try {
            return AbstractC10995r6.f(((R4) C5519m.a(this.f85063f)).b(this.f85064g, null));
        } catch (RemoteException | InterruptedException | ExecutionException unused) {
            FS.log_e("NonceGenerator", "Unexpected exception while gathering request signals.");
            this.f85062e.zza(1);
            return AbstractC10995r6.e();
        }
    }
}
