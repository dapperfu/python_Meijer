package com.google.android.gms.internal.ads;

import Mc.C4115f1;
import Mc.C4169y;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6905Kn {

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC8361iq f68161e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f68162a;

    /* renamed from: b, reason: collision with root package name */
    private final Ec.b f68163b;

    /* renamed from: c, reason: collision with root package name */
    private final C4115f1 f68164c;

    /* renamed from: d, reason: collision with root package name */
    private final String f68165d;

    public static InterfaceC8361iq a(Context context) {
        InterfaceC8361iq interfaceC8361iq;
        synchronized (C6905Kn.class) {
            try {
                if (f68161e == null) {
                    f68161e = C4169y.a().o(context, new BinderC10061yl());
                }
                interfaceC8361iq = f68161e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC8361iq;
    }

    public C6905Kn(Context context, Ec.b bVar, C4115f1 c4115f1, String str) {
        this.f68162a = context;
        this.f68163b = bVar;
        this.f68164c = c4115f1;
        this.f68165d = str;
    }

    public final void b(Xc.b bVar) {
        Mc.Y1 y1A;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC8361iq interfaceC8361iqA = a(this.f68162a);
        if (interfaceC8361iqA == null) {
            bVar.a("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.f68162a;
        C4115f1 c4115f1 = this.f68164c;
        com.google.android.gms.dynamic.b bVarF2 = com.google.android.gms.dynamic.d.F2(context);
        if (c4115f1 == null) {
            Mc.Z1 z12 = new Mc.Z1();
            z12.g(jCurrentTimeMillis);
            y1A = z12.a();
        } else {
            c4115f1.o(jCurrentTimeMillis);
            y1A = Mc.c2.f19212a.a(this.f68162a, this.f68164c);
        }
        try {
            interfaceC8361iqA.N4(bVarF2, new C8788mq(this.f68165d, this.f68163b.name(), null, y1A, 0, null), new BinderC6871Jn(this, bVar));
        } catch (RemoteException unused) {
            bVar.a("Internal Error.");
        }
    }
}
