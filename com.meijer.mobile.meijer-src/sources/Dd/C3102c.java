package Dd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: Dd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3102c extends C3100a implements e {
    @Override // Dd.e
    public final LatLng zzj() throws RemoteException {
        Parcel parcelK1 = K1(4, a2());
        LatLng latLng = (LatLng) s.a(parcelK1, LatLng.CREATOR);
        parcelK1.recycle();
        return latLng;
    }

    @Override // Dd.e
    public final String zzk() throws RemoteException {
        Parcel parcelK1 = K1(2, a2());
        String string = parcelK1.readString();
        parcelK1.recycle();
        return string;
    }

    @Override // Dd.e
    public final String zzm() throws RemoteException {
        Parcel parcelK1 = K1(6, a2());
        String string = parcelK1.readString();
        parcelK1.recycle();
        return string;
    }

    @Override // Dd.e
    public final void zzo() throws RemoteException {
        c2(1, a2());
    }

    C3102c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // Dd.e
    public final void e() throws RemoteException {
        c2(11, a2());
    }

    @Override // Dd.e
    public final boolean g() throws RemoteException {
        Parcel parcelK1 = K1(13, a2());
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Dd.e
    public final int zzg() throws RemoteException {
        Parcel parcelK1 = K1(17, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // Dd.e
    public final String zzl() throws RemoteException {
        Parcel parcelK1 = K1(8, a2());
        String string = parcelK1.readString();
        parcelK1.recycle();
        return string;
    }

    @Override // Dd.e
    public final void zzn() throws RemoteException {
        c2(12, a2());
    }

    @Override // Dd.e
    public final void F(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(22, parcelA2);
    }

    @Override // Dd.e
    public final void F0(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        c2(7, parcelA2);
    }

    @Override // Dd.e
    public final void I7(float f10, float f11) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        parcelA2.writeFloat(f11);
        c2(19, parcelA2);
    }

    @Override // Dd.e
    public final void J0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(9, parcelA2);
    }

    @Override // Dd.e
    public final void K(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        c2(29, parcelA2);
    }

    @Override // Dd.e
    public final void O1(LatLng latLng) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, latLng);
        c2(3, parcelA2);
    }

    @Override // Dd.e
    public final void U(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(27, parcelA2);
    }

    @Override // Dd.e
    public final void V8(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(25, parcelA2);
    }

    @Override // Dd.e
    public final void f1(float f10, float f11) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        parcelA2.writeFloat(f11);
        c2(24, parcelA2);
    }

    @Override // Dd.e
    public final void j1(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(14, parcelA2);
    }

    @Override // Dd.e
    public final void o0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        c2(18, parcelA2);
    }

    @Override // Dd.e
    public final void q2(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(20, parcelA2);
    }

    @Override // Dd.e
    public final void u5(String str) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        c2(5, parcelA2);
    }

    @Override // Dd.e
    public final boolean x6(e eVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, eVar);
        Parcel parcelK1 = K1(16, parcelA2);
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }
}
