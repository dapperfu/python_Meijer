package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f82801a = Q.class.getClassLoader();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f82802b = 0;

    private Q() {
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static HashMap e(Parcel parcel) {
        return parcel.readHashMap(f82801a);
    }

    public static boolean a(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Parcelable b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void f(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(iDataAvail);
        throw new BadParcelableException(sb2.toString());
    }
}
