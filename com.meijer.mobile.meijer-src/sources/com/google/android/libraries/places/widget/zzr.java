package com.google.android.libraries.places.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.widget.PlaceDetailsFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intrinsics.j(parcel, "parcel");
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList.add(PlaceDetailsFragment.Content.valueOf(parcel.readString()));
        }
        return new zzs(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
