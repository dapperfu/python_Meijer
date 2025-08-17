package com.google.android.libraries.places.widget.model;

import Be.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public enum AutocompleteActivityMode implements Parcelable {
    FULLSCREEN,
    OVERLAY;


    @RecentlyNonNull
    public static final Parcelable.Creator<AutocompleteActivityMode> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzb
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new AutocompleteActivityMode[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return AutocompleteActivityMode.valueOf((String) p.q(parcel.readString()));
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
