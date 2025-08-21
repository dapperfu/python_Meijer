package ze;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ze.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18476a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f172708a;

    /* renamed from: b, reason: collision with root package name */
    private final String f172709b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f172708a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f172708a;
    }

    protected C18476a(IBinder iBinder, String str) {
        this.f172708a = iBinder;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f172709b);
        return parcelObtain;
    }
}
