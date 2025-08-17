package vd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: vd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17545a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f164644a;

    /* renamed from: b, reason: collision with root package name */
    private final String f164645b = "com.google.android.gms.appset.internal.IAppSetService";

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f164644a;
    }

    protected C17545a(IBinder iBinder, String str) {
        this.f164644a = iBinder;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f164645b);
        return parcelObtain;
    }

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f164644a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
