package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TWO_LINE", "MULTI_LINE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteListDensity implements Parcelable {
    public static final Parcelable.Creator<AutocompleteListDensity> CREATOR;

    @RecentlyNonNull
    public static final AutocompleteListDensity MULTI_LINE;

    @RecentlyNonNull
    public static final AutocompleteListDensity TWO_LINE;
    private static final /* synthetic */ AutocompleteListDensity[] zza;
    private static final /* synthetic */ EnumEntries zzb;

    public static EnumEntries<AutocompleteListDensity> getEntries() {
        return zzb;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(name());
    }

    static {
        AutocompleteListDensity autocompleteListDensity = new AutocompleteListDensity("TWO_LINE", 0);
        TWO_LINE = autocompleteListDensity;
        AutocompleteListDensity autocompleteListDensity2 = new AutocompleteListDensity("MULTI_LINE", 1);
        MULTI_LINE = autocompleteListDensity2;
        AutocompleteListDensity[] autocompleteListDensityArr = {autocompleteListDensity, autocompleteListDensity2};
        zza = autocompleteListDensityArr;
        zzb = EnumEntriesKt.a(autocompleteListDensityArr);
        CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzc
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return AutocompleteListDensity.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i10) {
                return new AutocompleteListDensity[i10];
            }
        };
    }

    @RecentlyNonNull
    public static AutocompleteListDensity valueOf(@RecentlyNonNull String str) {
        return (AutocompleteListDensity) Enum.valueOf(AutocompleteListDensity.class, str);
    }

    @RecentlyNonNull
    public static AutocompleteListDensity[] values() {
        return (AutocompleteListDensity[]) zza.clone();
    }

    private AutocompleteListDensity(String str, int i10) {
    }
}
