package xd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: xd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18157a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f170680a;

    /* renamed from: b, reason: collision with root package name */
    private final String f170681b = "com.google.android.gms.appset.internal.IAppSetService";

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f170680a;
    }

    protected C18157a(IBinder iBinder, String str) {
        this.f170680a = iBinder;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f170681b);
        return parcelObtain;
    }

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f170680a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
