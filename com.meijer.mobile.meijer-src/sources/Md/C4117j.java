package Md;

import Nd.InterfaceC4182f;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Md.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4117j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4182f f19766a;

    public Od.I a() {
        try {
            return this.f19766a.B2();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    C4117j(InterfaceC4182f interfaceC4182f) {
        this.f19766a = interfaceC4182f;
    }
}
