package Od;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Od.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4456d {

    /* renamed from: a, reason: collision with root package name */
    private static Dd.v f23598a;

    public static C4455c a(float f10) {
        try {
            return new C4455c(e().w1(f10));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public static C4455c b(Bitmap bitmap) {
        com.google.android.gms.common.internal.r.m(bitmap, "image must not be null");
        try {
            return new C4455c(e().V1(bitmap));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public static C4455c c(C4469q c4469q) {
        try {
            return new C4455c(e().O4(c4469q));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public static void d(Dd.v vVar) {
        if (f23598a != null) {
            return;
        }
        f23598a = (Dd.v) com.google.android.gms.common.internal.r.m(vVar, "delegate must not be null");
    }

    private static Dd.v e() {
        return (Dd.v) com.google.android.gms.common.internal.r.m(f23598a, "IBitmapDescriptorFactory is not initialized");
    }
}
