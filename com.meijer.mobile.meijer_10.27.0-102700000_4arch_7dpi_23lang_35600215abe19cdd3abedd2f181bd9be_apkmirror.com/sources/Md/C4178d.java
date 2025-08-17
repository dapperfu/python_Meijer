package Md;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Md.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4178d {

    /* renamed from: a, reason: collision with root package name */
    private static Bd.v f19411a;

    public static C4177c a(float f10) {
        try {
            return new C4177c(e().p1(f10));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public static C4177c b(Bitmap bitmap) {
        com.google.android.gms.common.internal.r.m(bitmap, "image must not be null");
        try {
            return new C4177c(e().Q1(bitmap));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public static C4177c c(C4191q c4191q) {
        try {
            return new C4177c(e().J2(c4191q));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public static void d(Bd.v vVar) {
        if (f19411a != null) {
            return;
        }
        f19411a = (Bd.v) com.google.android.gms.common.internal.r.m(vVar, "delegate must not be null");
    }

    private static Bd.v e() {
        return (Bd.v) com.google.android.gms.common.internal.r.m(f19411a, "IBitmapDescriptorFactory is not initialized");
    }
}
