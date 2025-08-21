package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.clearcut.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10402a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f82159a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82160b;

    protected C10402a(IBinder iBinder, String str) {
        this.f82159a = iBinder;
        this.f82160b = str;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f82160b);
        return parcelObtain;
    }

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f82159a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f82159a;
    }
}
