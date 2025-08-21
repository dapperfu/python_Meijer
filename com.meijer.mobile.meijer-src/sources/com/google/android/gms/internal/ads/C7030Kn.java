package com.google.android.gms.internal.ads;

import Oc.C4393f1;
import Oc.C4447y;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7030Kn {

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC8486iq f69001e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f69002a;

    /* renamed from: b, reason: collision with root package name */
    private final Gc.b f69003b;

    /* renamed from: c, reason: collision with root package name */
    private final C4393f1 f69004c;

    /* renamed from: d, reason: collision with root package name */
    private final String f69005d;

    public static InterfaceC8486iq a(Context context) {
        InterfaceC8486iq interfaceC8486iq;
        synchronized (C7030Kn.class) {
            try {
                if (f69001e == null) {
                    f69001e = C4447y.a().o(context, new BinderC10186yl());
                }
                interfaceC8486iq = f69001e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC8486iq;
    }

    public C7030Kn(Context context, Gc.b bVar, C4393f1 c4393f1, String str) {
        this.f69002a = context;
        this.f69003b = bVar;
        this.f69004c = c4393f1;
        this.f69005d = str;
    }

    public final void b(Zc.b bVar) {
        Oc.Y1 y1A;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC8486iq interfaceC8486iqA = a(this.f69002a);
        if (interfaceC8486iqA == null) {
            bVar.a("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.f69002a;
        C4393f1 c4393f1 = this.f69004c;
        com.google.android.gms.dynamic.b bVarI2 = com.google.android.gms.dynamic.d.I2(context);
        if (c4393f1 == null) {
            Oc.Z1 z12 = new Oc.Z1();
            z12.g(jCurrentTimeMillis);
            y1A = z12.a();
        } else {
            c4393f1.o(jCurrentTimeMillis);
            y1A = Oc.c2.f23399a.a(this.f69002a, this.f69004c);
        }
        try {
            interfaceC8486iqA.d5(bVarI2, new C8913mq(this.f69005d, this.f69003b.name(), null, y1A, 0, null), new BinderC6996Jn(this, bVar));
        } catch (RemoteException unused) {
            bVar.a("Internal Error.");
        }
    }
}
