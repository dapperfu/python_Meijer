package Dd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class f extends C3100a implements h {
    @Override // Dd.h
    public final void zzo() throws RemoteException {
        c2(1, a2());
    }

    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // Dd.h
    public final int zzi() throws RemoteException {
        Parcel parcelK1 = K1(20, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // Dd.h
    public final void C0(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(11, parcelA2);
    }

    @Override // Dd.h
    public final void E6(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, bVar);
        c2(27, parcelA2);
    }

    @Override // Dd.h
    public final void F(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(7, parcelA2);
    }

    @Override // Dd.h
    public final void J0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(17, parcelA2);
    }

    @Override // Dd.h
    public final void K2(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        c2(13, parcelA2);
    }

    @Override // Dd.h
    public final boolean M7(h hVar) throws RemoteException {
        Parcel parcelA2 = a2();
        s.e(parcelA2, hVar);
        Parcel parcelK1 = K1(19, parcelA2);
        boolean zF = s.f(parcelK1);
        parcelK1.recycle();
        return zF;
    }

    @Override // Dd.h
    public final void c0(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        c2(3, parcelA2);
    }

    @Override // Dd.h
    public final void d0(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(15, parcelA2);
    }

    @Override // Dd.h
    public final void j0(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeList(list);
        c2(5, parcelA2);
    }

    @Override // Dd.h
    public final void n1(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(23, parcelA2);
    }

    @Override // Dd.h
    public final void w(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = s.f6126b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(21, parcelA2);
    }

    @Override // Dd.h
    public final void zzu(int i10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i10);
        c2(9, parcelA2);
    }

    @Override // Dd.h
    public final void zzw(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        c2(25, parcelA2);
    }
}
