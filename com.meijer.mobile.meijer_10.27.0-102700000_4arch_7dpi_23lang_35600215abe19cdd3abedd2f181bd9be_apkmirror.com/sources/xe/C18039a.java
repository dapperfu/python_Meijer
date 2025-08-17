package xe;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: xe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18039a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f169559a;

    /* renamed from: b, reason: collision with root package name */
    private final String f169560b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f169559a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f169559a;
    }

    protected C18039a(IBinder iBinder, String str) {
        this.f169559a = iBinder;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f169560b);
        return parcelObtain;
    }
}
