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
public final class C6924Hj implements Q6 {

    /* renamed from: a, reason: collision with root package name */
    private volatile C9647tj f68331a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f68332b;

    public C6924Hj(Context context) {
        this.f68332b = context;
    }

    static /* bridge */ /* synthetic */ void c(C6924Hj c6924Hj) {
        if (c6924Hj.f68331a == null) {
            return;
        }
        c6924Hj.f68331a.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Q6
    public final S6 a(V6 v62) throws zzapv {
        Parcelable.Creator<C9861vj> creator = C9861vj.CREATOR;
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
        C9861vj c9861vj = new C9861vj(v62.u(), strArr, strArr2);
        long jC = Nc.v.c().c();
        try {
            C7270Rq c7270Rq = new C7270Rq();
            this.f68331a = new C9647tj(this.f68332b, Nc.v.x().b(), new C6856Fj(this, c7270Rq), new C6890Gj(this, c7270Rq));
            this.f68331a.checkAvailabilityAndConnect();
            C6788Dj c6788Dj = new C6788Dj(this, c9861vj);
            Xj0 xj0 = C7033Kq.f69014a;
            com.google.common.util.concurrent.q qVarO = Mj0.o(Mj0.n(c7270Rq, c6788Dj, xj0), ((Integer) Oc.A.c().a(C8784lf.f77430y4)).intValue(), TimeUnit.MILLISECONDS, C7033Kq.f69017d);
            qVarO.addListener(new RunnableC6822Ej(this), xj0);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qVarO.get();
            Rc.p0.k("Http assets remote cache took " + (Nc.v.c().c() - jC) + "ms");
            C10075xj c10075xj = (C10075xj) new C9764uo(parcelFileDescriptor).B(C10075xj.CREATOR);
            if (c10075xj == null) {
                return null;
            }
            if (c10075xj.f80672a) {
                throw new zzapv(c10075xj.f80673b);
            }
            if (c10075xj.f80676e.length != c10075xj.f80677f.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = c10075xj.f80676e;
                if (i10 >= strArr3.length) {
                    return new S6(c10075xj.f80674c, c10075xj.f80675d, map, c10075xj.f80678g, c10075xj.f80679h);
                }
                map.put(strArr3[i10], c10075xj.f80677f[i10]);
                i10++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            Rc.p0.k("Http assets remote cache took " + (Nc.v.c().c() - jC) + "ms");
            return null;
        } catch (Throwable th2) {
            Rc.p0.k("Http assets remote cache took " + (Nc.v.c().c() - jC) + "ms");
            throw th2;
        }
    }
}
