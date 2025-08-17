package Kd;

import Ld.InterfaceC4050f;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Kd.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3952j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4050f f16407a;

    public Md.I a() {
        try {
            return this.f16407a.z2();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    C3952j(InterfaceC4050f interfaceC4050f) {
        this.f16407a = interfaceC4050f;
    }
}
