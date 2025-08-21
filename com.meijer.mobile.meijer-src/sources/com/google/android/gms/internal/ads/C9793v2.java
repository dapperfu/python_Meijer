package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9793v2 implements Parcelable.Creator {
    C9793v2() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        return new C9900w2(string, string2, AbstractC8042eh0.s(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C9900w2[i10];
    }
}
