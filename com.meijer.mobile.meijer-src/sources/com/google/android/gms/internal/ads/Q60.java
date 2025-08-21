package com.google.android.gms.internal.ads;

import Oc.AbstractBinderC4427r0;
import Oc.C4434t1;
import Oc.InterfaceC4430s0;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Q60 {

    /* renamed from: d, reason: collision with root package name */
    private static Q60 f70351d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f70352a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4430s0 f70353b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f70354c = new AtomicReference();

    public static Q60 d(Context context) {
        synchronized (Q60.class) {
            try {
                Q60 q60 = f70351d;
                if (q60 != null) {
                    return q60;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) C9000ng.f77957b.e()).longValue();
                InterfaceC4430s0 interfaceC4430s0A = null;
                if (jLongValue > 0 && jLongValue <= 244410203) {
                    interfaceC4430s0A = a(applicationContext);
                }
                Q60 q602 = new Q60(applicationContext, interfaceC4430s0A);
                f70351d = q602;
                return q602;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final C4434t1 g() {
        InterfaceC4430s0 interfaceC4430s0 = this.f70353b;
        if (interfaceC4430s0 != null) {
            try {
                return interfaceC4430s0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final InterfaceC6756Cl b() {
        return (InterfaceC6756Cl) this.f70354c.get();
    }

    public final void f(InterfaceC6756Cl interfaceC6756Cl) {
        InterfaceC6756Cl adapterCreator;
        if (!((Boolean) C9000ng.f77956a.e()).booleanValue()) {
            P60.a(this.f70354c, null, interfaceC6756Cl);
            return;
        }
        InterfaceC4430s0 interfaceC4430s0 = this.f70353b;
        if (interfaceC4430s0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC4430s0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.f70354c;
        if (adapterCreator != null) {
            interfaceC6756Cl = adapterCreator;
        }
        P60.a(atomicReference, null, interfaceC6756Cl);
    }

    Q60(Context context, InterfaceC4430s0 interfaceC4430s0) {
        this.f70352a = context;
        this.f70353b = interfaceC4430s0;
    }

    static InterfaceC4430s0 a(Context context) {
        try {
            return AbstractBinderC4427r0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            Sc.p.e("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public final Sc.a c(int i10, boolean z10, int i11) {
        C4434t1 c4434t1G;
        Nc.v.t();
        boolean zF = Rc.D0.f(this.f70352a);
        Sc.a aVar = new Sc.a(244410000, i11, true, zF);
        if (((Boolean) C9000ng.f77958c.e()).booleanValue() && (c4434t1G = g()) != null) {
            return new Sc.a(244410000, c4434t1G.B(), true, zF);
        }
        return aVar;
    }

    public final String e() {
        C4434t1 c4434t1G = g();
        if (c4434t1G != null) {
            return c4434t1G.T();
        }
        return null;
    }
}
