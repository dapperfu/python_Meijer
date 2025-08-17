package Kd;

import Ld.InterfaceC4040a;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Kd.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3944b {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC4040a f16395a;

    public static C3943a a(CameraPosition cameraPosition) {
        com.google.android.gms.common.internal.r.m(cameraPosition, "cameraPosition must not be null");
        try {
            return new C3943a(c().J3(cameraPosition));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    private static InterfaceC4040a c() {
        return (InterfaceC4040a) com.google.android.gms.common.internal.r.m(f16395a, "CameraUpdateFactory is not initialized");
    }

    public static void b(InterfaceC4040a interfaceC4040a) {
        f16395a = (InterfaceC4040a) com.google.android.gms.common.internal.r.l(interfaceC4040a);
    }
}
