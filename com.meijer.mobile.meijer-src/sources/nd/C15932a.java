package nd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C6664v;
import yd.C18302a;
import yd.C18304c;

/* renamed from: nd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15932a extends C18302a implements IInterface {
    C15932a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void I2(C6664v c6664v) throws RemoteException {
        Parcel parcelK1 = K1();
        C18304c.c(parcelK1, c6664v);
        c2(1, parcelK1);
    }
}
