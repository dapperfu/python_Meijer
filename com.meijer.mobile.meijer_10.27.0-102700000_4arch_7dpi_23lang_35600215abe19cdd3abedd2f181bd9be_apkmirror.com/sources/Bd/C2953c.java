package Bd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: Bd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2953c extends C2951a implements e {
    @Override // Bd.e
    public final LatLng zzj() throws RemoteException {
        Parcel parcelA1 = A1(4, a2());
        LatLng latLng = (LatLng) s.a(parcelA1, LatLng.CREATOR);
        parcelA1.recycle();
        return latLng;
    }

    @Override // Bd.e
    public final String zzk() throws RemoteException {
        Parcel parcelA1 = A1(2, a2());
        String string = parcelA1.readString();
        parcelA1.recycle();
        return string;
    }

    @Override // Bd.e
    public final String zzm() throws RemoteException {
        Parcel parcelA1 = A1(6, a2());
        String string = parcelA1.readString();
        parcelA1.recycle();
        return string;
    }

    @Override // Bd.e
    public final void zzo() throws RemoteException {
        b2(1, a2());
    }

    C2953c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // Bd.e
    public final void e() throws RemoteException {
        b2(11, a2());
    }

    @Override // Bd.e
    public final boolean f() throws RemoteException {
        Parcel parcelA1 = A1(13, a2());
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Bd.e
    public final int zzg() throws RemoteException {
        Parcel parcelA1 = A1(17, a2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // Bd.e
    public final String zzl() throws RemoteException {
        Parcel parcelA1 = A1(8, a2());
        String string = parcelA1.readString();
        parcelA1.recycle();
        return string;
    }

    @Override // Bd.e
    public final void zzn() throws RemoteException {
        b2(12, a2());
    }

    @Override // Bd.e
    public final void C0(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        b2(7, parcelA2);
    }

    @Override // Bd.e
    public final void E7(float f10, float f11) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        parcelA2.writeFloat(f11);
        b2(19, parcelA2);
    }

    @Override // Bd.e
    public final void F(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(22, parcelA2);
    }

    @Override // Bd.e
    public final void G0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(9, parcelA2);
    }

    @Override // Bd.e
    public final void H1(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLng);
        b2(3, parcelA2);
    }

    @Override // Bd.e
    public final void K(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        b2(29, parcelA2);
    }

    @Override // Bd.e
    public final void U(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(27, parcelA2);
    }

    @Override // Bd.e
    public final void V8(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        b2(25, parcelA2);
    }

    @Override // Bd.e
    public final void c1(float f10, float f11) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        parcelA2.writeFloat(f11);
        b2(24, parcelA2);
    }

    @Override // Bd.e
    public final boolean c3(e eVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, eVar);
        Parcel parcelA1 = A1(16, parcelA2);
        boolean zF = s.f(parcelA1);
        parcelA1.recycle();
        return zF;
    }

    @Override // Bd.e
    public final void h1(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(14, parcelA2);
    }

    @Override // Bd.e
    public final void n0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        b2(18, parcelA2);
    }

    @Override // Bd.e
    public final void o5(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        b2(5, parcelA2);
    }

    @Override // Bd.e
    public final void p2(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f2181b;
        parcelA2.writeInt(z10 ? 1 : 0);
        b2(20, parcelA2);
    }
}
