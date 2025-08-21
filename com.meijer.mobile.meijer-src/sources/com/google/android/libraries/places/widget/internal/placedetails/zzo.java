package com.google.android.libraries.places.widget.internal.placedetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intrinsics.j(parcel, "parcel");
        zzajb zzajbVar = (zzajb) Enum.valueOf(zzajb.class, parcel.readString());
        zzaiz zzaizVar = (zzaiz) Enum.valueOf(zzaiz.class, parcel.readString());
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList.add((zzaiw) Enum.valueOf(zzaiw.class, parcel.readString()));
        }
        return new zzp(zzajbVar, zzaizVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
