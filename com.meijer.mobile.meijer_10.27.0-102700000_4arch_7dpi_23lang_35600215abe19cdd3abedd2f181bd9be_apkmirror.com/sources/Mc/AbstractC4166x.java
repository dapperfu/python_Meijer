package Mc;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C8235hg;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9730vg;

/* renamed from: Mc.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC4166x {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4132l0 f19360a;

    static {
        InterfaceC4132l0 c4126j0 = null;
        try {
            Object objNewInstance = C4163w.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c4126j0 = iInterfaceQueryLocalInterface instanceof InterfaceC4132l0 ? (InterfaceC4132l0) iInterfaceQueryLocalInterface : new C4126j0(iBinder);
                }
            } else {
                Qc.p.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            Qc.p.g("Failed to instantiate ClientApi class.");
        }
        f19360a = c4126j0;
    }

    protected abstract Object a();

    protected abstract Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException;

    protected abstract Object c() throws RemoteException;

    public final Object d(Context context, boolean z10) {
        boolean z11;
        Object objE;
        if (!z10) {
            C4169y.b();
            if (!Qc.g.u(context, 12451000)) {
                Qc.p.b("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        C8659lf.a(context);
        if (((Boolean) C8235hg.f74763a.e()).booleanValue()) {
            z11 = false;
        } else if (((Boolean) C8235hg.f74764b.e()).booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z10 | z13;
            z11 = false;
        }
        if (z12) {
            objE = e();
            if (objE == null && !z11) {
                objE = f();
            }
        } else {
            Object objF = f();
            if (objF == null) {
                if (C4169y.e().nextInt(((Long) C9730vg.f79103a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C4169y.b().p(context, C4169y.c().f29929a, "gmob-apps", bundle, true);
                }
            }
            objE = objF == null ? e() : objF;
        }
        return objE == null ? a() : objE;
    }

    private final Object e() {
        InterfaceC4132l0 interfaceC4132l0 = f19360a;
        if (interfaceC4132l0 == null) {
            Qc.p.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(interfaceC4132l0);
        } catch (RemoteException e10) {
            Qc.p.h("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }

    AbstractC4166x() {
    }

    private final Object f() {
        try {
            return c();
        } catch (RemoteException e10) {
            Qc.p.h("Cannot invoke remote loader.", e10);
            return null;
        }
    }
}
