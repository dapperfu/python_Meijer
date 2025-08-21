package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import gd.C14349d;
import gd.C14351f;

/* loaded from: classes6.dex */
public abstract class o2 extends BinderC10473y implements n2 {
    public o2() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // com.google.android.gms.internal.clearcut.BinderC10473y
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                g4((Status) Y.a(parcel, Status.CREATOR));
                return true;
            case 2:
                D4((Status) Y.a(parcel, Status.CREATOR));
                return true;
            case 3:
                i1((Status) Y.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                c5((Status) Y.a(parcel, Status.CREATOR));
                return true;
            case 5:
                h5((Status) Y.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                p2((Status) Y.a(parcel, Status.CREATOR), (C14351f[]) parcel.createTypedArray(C14351f.CREATOR));
                return true;
            case 7:
                E1((DataHolder) Y.a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                P3((Status) Y.a(parcel, Status.CREATOR), (C14349d) Y.a(parcel, C14349d.CREATOR));
                return true;
            case 9:
                n4((Status) Y.a(parcel, Status.CREATOR), (C14349d) Y.a(parcel, C14349d.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
