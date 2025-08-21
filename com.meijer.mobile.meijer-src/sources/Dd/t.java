package Dd;

import Od.C4469q;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes6.dex */
public final class t extends C3100a implements v {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // Dd.v
    public final com.google.android.gms.dynamic.b O4(C4469q c4469q) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, c4469q);
        Parcel parcelK1 = K1(8, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    @Override // Dd.v
    public final com.google.android.gms.dynamic.b V1(Bitmap bitmap) throws RemoteException {
        Parcel parcelA2 = a2();
        s.c(parcelA2, bitmap);
        Parcel parcelK1 = K1(6, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    @Override // Dd.v
    public final com.google.android.gms.dynamic.b w1(float f10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeFloat(f10);
        Parcel parcelK1 = K1(5, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }
}
