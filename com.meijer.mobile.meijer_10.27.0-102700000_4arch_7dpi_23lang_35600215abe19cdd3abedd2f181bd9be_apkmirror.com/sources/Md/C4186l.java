package Md;

import Bd.InterfaceC2952b;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Md.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4186l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2952b f19441a;

    public C4186l(InterfaceC2952b interfaceC2952b) {
        Y y10 = Y.f19409a;
        this.f19441a = (InterfaceC2952b) com.google.android.gms.common.internal.r.m(interfaceC2952b, "delegate");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4186l)) {
            return false;
        }
        try {
            return this.f19441a.Y6(((C4186l) obj).f19441a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19441a.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
