package Kd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f16559a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16560b;

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f16559a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16559a;
    }

    protected a(IBinder iBinder, String str) {
        this.f16559a = iBinder;
        this.f16560b = str;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f16560b);
        return parcelObtain;
    }
}
