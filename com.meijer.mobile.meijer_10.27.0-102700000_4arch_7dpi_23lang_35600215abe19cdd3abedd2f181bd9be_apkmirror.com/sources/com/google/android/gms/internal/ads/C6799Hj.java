package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Hj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6799Hj implements Q6 {

    /* renamed from: a, reason: collision with root package name */
    private volatile C9522tj f67491a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f67492b;

    public C6799Hj(Context context) {
        this.f67492b = context;
    }

    static /* bridge */ /* synthetic */ void c(C6799Hj c6799Hj) {
        if (c6799Hj.f67491a == null) {
            return;
        }
        c6799Hj.f67491a.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Q6
    public final S6 a(V6 v62) throws zzapv {
        Parcelable.Creator<C9736vj> creator = C9736vj.CREATOR;
        Map mapW = v62.w();
        int size = mapW.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : mapW.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        C9736vj c9736vj = new C9736vj(v62.u(), strArr, strArr2);
        long jC = Lc.v.c().c();
        try {
            C7145Rq c7145Rq = new C7145Rq();
            this.f67491a = new C9522tj(this.f67492b, Lc.v.x().b(), new C6731Fj(this, c7145Rq), new C6765Gj(this, c7145Rq));
            this.f67491a.checkAvailabilityAndConnect();
            C6663Dj c6663Dj = new C6663Dj(this, c9736vj);
            Xj0 xj0 = C6908Kq.f68174a;
            com.google.common.util.concurrent.q qVarO = Mj0.o(Mj0.n(c7145Rq, c6663Dj, xj0), ((Integer) Mc.A.c().a(C8659lf.f76590y4)).intValue(), TimeUnit.MILLISECONDS, C6908Kq.f68177d);
            qVarO.addListener(new RunnableC6697Ej(this), xj0);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qVarO.get();
            Pc.p0.k("Http assets remote cache took " + (Lc.v.c().c() - jC) + "ms");
            C9950xj c9950xj = (C9950xj) new C9639uo(parcelFileDescriptor).B(C9950xj.CREATOR);
            if (c9950xj == null) {
                return null;
            }
            if (c9950xj.f79832a) {
                throw new zzapv(c9950xj.f79833b);
            }
            if (c9950xj.f79836e.length != c9950xj.f79837f.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = c9950xj.f79836e;
                if (i10 >= strArr3.length) {
                    return new S6(c9950xj.f79834c, c9950xj.f79835d, map, c9950xj.f79838g, c9950xj.f79839h);
                }
                map.put(strArr3[i10], c9950xj.f79837f[i10]);
                i10++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            Pc.p0.k("Http assets remote cache took " + (Lc.v.c().c() - jC) + "ms");
            return null;
        } catch (Throwable th2) {
            Pc.p0.k("Http assets remote cache took " + (Lc.v.c().c() - jC) + "ms");
            throw th2;
        }
    }
}
