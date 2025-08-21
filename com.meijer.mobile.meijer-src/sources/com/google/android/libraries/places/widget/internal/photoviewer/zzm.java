package com.google.android.libraries.places.widget.internal.photoviewer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzm implements Parcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzl();
    private final List zza;

    public zzm(List photoPageData) {
        Intrinsics.j(photoPageData, "photoPageData");
        this.zza = photoPageData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzm) && Intrinsics.e(this.zza, ((zzm) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb2 = new StringBuilder(list.toString().length() + 43);
        sb2.append("ParcelablePhotoPageDataList(photoPageData=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.j(dest, "dest");
        List list = this.zza;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i10);
        }
    }

    public final List zza() {
        return this.zza;
    }
}
