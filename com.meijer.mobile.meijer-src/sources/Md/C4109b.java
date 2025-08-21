package Md;

import Nd.InterfaceC4172a;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Md.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4109b {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC4172a f19754a;

    public static C4108a a(CameraPosition cameraPosition) {
        com.google.android.gms.common.internal.r.m(cameraPosition, "cameraPosition must not be null");
        try {
            return new C4108a(c().V3(cameraPosition));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    private static InterfaceC4172a c() {
        return (InterfaceC4172a) com.google.android.gms.common.internal.r.m(f19754a, "CameraUpdateFactory is not initialized");
    }

    public static void b(InterfaceC4172a interfaceC4172a) {
        f19754a = (InterfaceC4172a) com.google.android.gms.common.internal.r.l(interfaceC4172a);
    }
}
