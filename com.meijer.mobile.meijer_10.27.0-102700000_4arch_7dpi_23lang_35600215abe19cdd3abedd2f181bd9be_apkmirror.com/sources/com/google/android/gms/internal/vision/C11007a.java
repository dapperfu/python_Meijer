package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.vision.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C11007a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f84506a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84507b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f84506a;
    }

    protected C11007a(IBinder iBinder, String str) {
        this.f84506a = iBinder;
        this.f84507b = str;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f84507b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f84506a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void b2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f84506a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
