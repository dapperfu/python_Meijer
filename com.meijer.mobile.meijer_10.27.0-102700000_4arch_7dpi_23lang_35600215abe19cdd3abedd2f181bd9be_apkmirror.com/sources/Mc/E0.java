package Mc;

import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19141a;

    /* renamed from: b, reason: collision with root package name */
    private final D0 f19142b;

    public final String toString() {
        return this.f19141a;
    }

    public E0(D0 d02) {
        String strZze;
        this.f19142b = d02;
        try {
            strZze = d02.zze();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
            strZze = null;
        }
        this.f19141a = strZze;
    }
}
