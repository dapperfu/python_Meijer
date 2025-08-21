package Od;

import Dd.InterfaceC3101b;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Od.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4464l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3101b f23628a;

    public C4464l(InterfaceC3101b interfaceC3101b) {
        Y y10 = Y.f23596a;
        this.f23628a = (InterfaceC3101b) com.google.android.gms.common.internal.r.m(interfaceC3101b, "delegate");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4464l)) {
            return false;
        }
        try {
            return this.f23628a.y4(((C4464l) obj).f23628a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f23628a.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
