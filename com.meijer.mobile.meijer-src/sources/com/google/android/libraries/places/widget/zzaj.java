package com.google.android.libraries.places.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.widget.PlaceSearchFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzaj implements Parcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzai();
    private final List zza;

    public zzaj(List content) {
        Intrinsics.j(content, "content");
        this.zza = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaj) && Intrinsics.e(this.zza, ((zzaj) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(list).length() + 31);
        sb2.append("ParcelableContentList(content=");
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
            dest.writeString(((PlaceSearchFragment.Content) it.next()).name());
        }
    }

    public final List zza() {
        return this.zza;
    }
}
