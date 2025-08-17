package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import ed.C13645d;
import ed.C13647f;

/* loaded from: classes6.dex */
public abstract class o2 extends BinderC10348y implements n2 {
    public o2() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // com.google.android.gms.internal.clearcut.BinderC10348y
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                U3((Status) Y.a(parcel, Status.CREATOR));
                return true;
            case 2:
                r4((Status) Y.a(parcel, Status.CREATOR));
                return true;
            case 3:
                g1((Status) Y.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                M4((Status) Y.a(parcel, Status.CREATOR));
                return true;
            case 5:
                U4((Status) Y.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                q3((Status) Y.a(parcel, Status.CREATOR), (C13647f[]) parcel.createTypedArray(C13647f.CREATOR));
                return true;
            case 7:
                v1((DataHolder) Y.a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                e6((Status) Y.a(parcel, Status.CREATOR), (C13645d) Y.a(parcel, C13645d.CREATOR));
                return true;
            case 9:
                P6((Status) Y.a(parcel, Status.CREATOR), (C13645d) Y.a(parcel, C13645d.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
