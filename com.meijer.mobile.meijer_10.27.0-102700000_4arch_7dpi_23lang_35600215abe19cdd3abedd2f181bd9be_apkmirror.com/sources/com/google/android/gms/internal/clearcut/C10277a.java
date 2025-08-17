package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.clearcut.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10277a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f81319a;

    /* renamed from: b, reason: collision with root package name */
    private final String f81320b;

    protected C10277a(IBinder iBinder, String str) {
        this.f81319a = iBinder;
        this.f81320b = str;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f81320b);
        return parcelObtain;
    }

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f81319a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f81319a;
    }
}
