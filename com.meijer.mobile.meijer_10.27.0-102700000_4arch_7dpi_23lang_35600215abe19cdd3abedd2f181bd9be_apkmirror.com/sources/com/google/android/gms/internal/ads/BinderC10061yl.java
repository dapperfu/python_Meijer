package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.yl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC10061yl extends AbstractBinderC6597Bl {
    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final boolean L(String str) throws RemoteException {
        try {
            return Sc.a.class.isAssignableFrom(Class.forName(str, false, BinderC10061yl.class.getClassLoader()));
        } catch (Throwable unused) {
            Qc.p.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final boolean a(String str) throws RemoteException {
        try {
            return Tc.a.class.isAssignableFrom(Class.forName(str, false, BinderC10061yl.class.getClassLoader()));
        } catch (Throwable unused) {
            Qc.p.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final InterfaceC6733Fl d(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC10061yl.class.getClassLoader());
                if (Sc.f.class.isAssignableFrom(cls)) {
                    return new BinderC7713cm((Sc.f) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Sc.a.class.isAssignableFrom(cls)) {
                    return new BinderC7713cm((Sc.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                Qc.p.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th2) {
                Qc.p.h("Could not instantiate mediation adapter: " + str + ". ", th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            Qc.p.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC7713cm(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC7713cm(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final InterfaceC10170zm p(String str) throws RemoteException {
        return new BinderC6971Mm((RtbAdapter) Class.forName(str, false, C6666Dm.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
