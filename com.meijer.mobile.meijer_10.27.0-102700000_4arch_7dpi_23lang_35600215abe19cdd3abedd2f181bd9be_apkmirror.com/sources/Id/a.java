package Id;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f13813a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13814b;

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f13813a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13813a;
    }

    protected a(IBinder iBinder, String str) {
        this.f13813a = iBinder;
        this.f13814b = str;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13814b);
        return parcelObtain;
    }
}
