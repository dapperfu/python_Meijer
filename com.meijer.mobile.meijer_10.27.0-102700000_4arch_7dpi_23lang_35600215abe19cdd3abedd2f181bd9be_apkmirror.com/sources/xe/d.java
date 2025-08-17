package xe;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class d extends C18039a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // xe.f
    public final void j5(String str, Bundle bundle, h hVar) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        c.c(parcelA1, bundle);
        c.d(parcelA1, hVar);
        a2(2, parcelA1);
    }
}
