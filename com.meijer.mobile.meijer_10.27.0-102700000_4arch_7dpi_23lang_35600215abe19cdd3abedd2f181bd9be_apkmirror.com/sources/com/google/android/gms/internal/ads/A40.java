package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class A40 {
    public static void a(AtomicReference atomicReference, InterfaceC10101z40 interfaceC10101z40) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC10101z40.zza(obj);
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            Qc.p.h("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
