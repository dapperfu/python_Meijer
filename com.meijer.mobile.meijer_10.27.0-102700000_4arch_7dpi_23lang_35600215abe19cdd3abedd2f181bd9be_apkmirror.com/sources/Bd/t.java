package Bd;

import Md.C4191q;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes6.dex */
public final class t extends C2951a implements v {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // Bd.v
    public final com.google.android.gms.dynamic.b J2(C4191q c4191q) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, c4191q);
        Parcel parcelA1 = A1(8, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    @Override // Bd.v
    public final com.google.android.gms.dynamic.b Q1(Bitmap bitmap) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, bitmap);
        Parcel parcelA1 = A1(6, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    @Override // Bd.v
    public final com.google.android.gms.dynamic.b p1(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        Parcel parcelA1 = A1(5, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }
}
