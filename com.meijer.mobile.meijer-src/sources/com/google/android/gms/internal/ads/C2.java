package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class C2 implements Parcelable.Creator {
    C2() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, E2.class.getClassLoader());
        return new F2(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new F2[i10];
    }
}
