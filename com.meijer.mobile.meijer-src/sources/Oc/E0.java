package Oc;

import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23328a;

    /* renamed from: b, reason: collision with root package name */
    private final D0 f23329b;

    public final String toString() {
        return this.f23328a;
    }

    public E0(D0 d02) {
        String strZze;
        this.f23329b = d02;
        try {
            strZze = d02.zze();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
            strZze = null;
        }
        this.f23328a = strZze;
    }
}
