package ze;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class g extends BinderC18477b implements h {
    @Override // ze.BinderC18477b
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
        c.b(parcel);
        P(bundle);
        return true;
    }

    public g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }
}
