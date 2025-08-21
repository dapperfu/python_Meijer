package com.google.android.gms.internal.vision;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.vision.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C11136b {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f85353a = C11136b.class.getClassLoader();

    private C11136b() {
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
