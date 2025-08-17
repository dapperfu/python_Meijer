package ld;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C6539v;
import wd.C17809a;
import wd.C17811c;

/* renamed from: ld.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15398a extends C17809a implements IInterface {
    C15398a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void F2(C6539v c6539v) throws RemoteException {
        Parcel parcelA1 = A1();
        C17811c.c(parcelA1, c6539v);
        b2(1, parcelA1);
    }
}
