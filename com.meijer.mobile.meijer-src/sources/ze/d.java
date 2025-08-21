package ze;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class d extends C18476a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // ze.f
    public final void Y0(String str, Bundle bundle, h hVar) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        c.c(parcelK1, bundle);
        c.d(parcelK1, hVar);
        a2(2, parcelK1);
    }
}
