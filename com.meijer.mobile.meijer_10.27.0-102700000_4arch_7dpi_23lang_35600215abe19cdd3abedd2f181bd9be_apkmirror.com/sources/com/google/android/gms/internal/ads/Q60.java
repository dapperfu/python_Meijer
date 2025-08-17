package com.google.android.gms.internal.ads;

import Mc.AbstractBinderC4149r0;
import Mc.C4156t1;
import Mc.InterfaceC4152s0;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Q60 {

    /* renamed from: d, reason: collision with root package name */
    private static Q60 f69511d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f69512a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4152s0 f69513b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f69514c = new AtomicReference();

    public static Q60 d(Context context) {
        synchronized (Q60.class) {
            try {
                Q60 q60 = f69511d;
                if (q60 != null) {
                    return q60;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) C8875ng.f77117b.e()).longValue();
                InterfaceC4152s0 interfaceC4152s0A = null;
                if (jLongValue > 0 && jLongValue <= 244410203) {
                    interfaceC4152s0A = a(applicationContext);
                }
                Q60 q602 = new Q60(applicationContext, interfaceC4152s0A);
                f69511d = q602;
                return q602;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final C4156t1 g() {
        InterfaceC4152s0 interfaceC4152s0 = this.f69513b;
        if (interfaceC4152s0 != null) {
            try {
                return interfaceC4152s0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final InterfaceC6631Cl b() {
        return (InterfaceC6631Cl) this.f69514c.get();
    }

    public final void f(InterfaceC6631Cl interfaceC6631Cl) {
        InterfaceC6631Cl adapterCreator;
        if (!((Boolean) C8875ng.f77116a.e()).booleanValue()) {
            P60.a(this.f69514c, null, interfaceC6631Cl);
            return;
        }
        InterfaceC4152s0 interfaceC4152s0 = this.f69513b;
        if (interfaceC4152s0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC4152s0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.f69514c;
        if (adapterCreator != null) {
            interfaceC6631Cl = adapterCreator;
        }
        P60.a(atomicReference, null, interfaceC6631Cl);
    }

    Q60(Context context, InterfaceC4152s0 interfaceC4152s0) {
        this.f69512a = context;
        this.f69513b = interfaceC4152s0;
    }

    static InterfaceC4152s0 a(Context context) {
        try {
            return AbstractBinderC4149r0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            Qc.p.e("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public final Qc.a c(int i10, boolean z10, int i11) {
        C4156t1 c4156t1G;
        Lc.v.t();
        boolean zF = Pc.D0.f(this.f69512a);
        Qc.a aVar = new Qc.a(244410000, i11, true, zF);
        if (((Boolean) C8875ng.f77118c.e()).booleanValue() && (c4156t1G = g()) != null) {
            return new Qc.a(244410000, c4156t1G.B(), true, zF);
        }
        return aVar;
    }

    public final String e() {
        C4156t1 c4156t1G = g();
        if (c4156t1G != null) {
            return c4156t1G.T();
        }
        return null;
    }
}
