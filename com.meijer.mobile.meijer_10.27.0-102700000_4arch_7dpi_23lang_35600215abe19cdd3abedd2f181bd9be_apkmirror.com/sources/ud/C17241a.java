package ud;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ud.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17241a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f162899a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162900b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f162899a;
    }

    protected C17241a(IBinder iBinder, String str) {
        this.f162899a = iBinder;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f162900b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f162899a.transact(i10, parcel, parcelObtain, 0);
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
