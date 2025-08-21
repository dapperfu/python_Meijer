package wd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: wd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17858a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f167108a;

    /* renamed from: b, reason: collision with root package name */
    private final String f167109b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f167108a;
    }

    protected C17858a(IBinder iBinder, String str) {
        this.f167108a = iBinder;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f167109b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f167108a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
