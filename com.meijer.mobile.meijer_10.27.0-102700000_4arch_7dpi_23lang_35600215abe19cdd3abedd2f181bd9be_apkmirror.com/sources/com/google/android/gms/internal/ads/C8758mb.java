package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8758mb implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f76829a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76830b;

    protected C8758mb(IBinder iBinder, String str) {
        this.f76829a = iBinder;
        this.f76830b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f76829a;
    }

    protected final void F2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f76829a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f76830b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f76829a.transact(i10, parcel, parcelObtain, 0);
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
            this.f76829a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
