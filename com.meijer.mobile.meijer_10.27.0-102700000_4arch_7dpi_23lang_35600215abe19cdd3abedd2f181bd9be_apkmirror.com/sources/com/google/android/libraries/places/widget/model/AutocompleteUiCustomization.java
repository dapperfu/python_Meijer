package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B1\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "Landroid/os/Parcelable;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "noMatchingResultsMessage", "", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "searchBarHint", "<init>", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;Ljava/lang/String;Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Builder", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteUiCustomization implements Parcelable {
    private final AutocompleteListDensity zza;
    private final String zzb;
    private final AutocompleteUiIcon zzc;
    private final String zzd;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AutocompleteUiCustomization> CREATOR = new zzd();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "", "<init>", "()V", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "getListDensity", "()Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "setListDensity", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;)V", "noMatchingResultsMessage", "", "getNoMatchingResultsMessage", "()Ljava/lang/String;", "setNoMatchingResultsMessage", "(Ljava/lang/String;)V", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "getListItemIcon", "()Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "setListItemIcon", "(Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;)V", "searchBarHint", "getSearchBarHint", "setSearchBarHint", "build", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private AutocompleteListDensity zza;
        private AutocompleteUiIcon zzb;

        public final AutocompleteUiCustomization build() {
            return new AutocompleteUiCustomization(this.zza, null, this.zzb, null, null);
        }

        public final Builder listDensity(AutocompleteListDensity listDensity) {
            this.zza = listDensity;
            return this;
        }

        public final Builder listItemIcon(AutocompleteUiIcon listItemIcon) {
            this.zzb = listItemIcon;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J \u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Companion;", "", "<init>", "()V", "builder", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "create", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
            throw null;
        }

        @JvmStatic
        public final Builder builder() {
            return new Builder();
        }

        public /* synthetic */ Companion(@RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final AutocompleteUiCustomization create(AutocompleteListDensity listDensity, AutocompleteUiIcon listItemIcon) {
            return new Builder().listDensity(listDensity).listItemIcon(listItemIcon).build();
        }
    }

    public /* synthetic */ AutocompleteUiCustomization(@RecentlyNonNull AutocompleteListDensity autocompleteListDensity, @RecentlyNonNull String str, @RecentlyNonNull AutocompleteUiIcon autocompleteUiIcon, @RecentlyNonNull String str2, @RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = autocompleteListDensity;
        this.zzb = str;
        this.zzc = autocompleteUiIcon;
        this.zzd = str2;
    }

    @JvmStatic
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    public static final AutocompleteUiCustomization create(AutocompleteListDensity autocompleteListDensity, AutocompleteUiIcon autocompleteUiIcon) {
        return INSTANCE.create(autocompleteListDensity, autocompleteUiIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteUiCustomization)) {
            return false;
        }
        AutocompleteListDensity zza = getZza();
        String strName = zza != null ? zza.name() : null;
        AutocompleteUiCustomization autocompleteUiCustomization = (AutocompleteUiCustomization) other;
        AutocompleteListDensity zza2 = autocompleteUiCustomization.getZza();
        if (Intrinsics.e(strName, zza2 != null ? zza2.name() : null) && Intrinsics.e(this.zzb, autocompleteUiCustomization.zzb)) {
            AutocompleteUiIcon zzc = getZzc();
            Integer numValueOf = zzc != null ? Integer.valueOf(zzc.getZza()) : null;
            AutocompleteUiIcon zzc2 = autocompleteUiCustomization.getZzc();
            if (Intrinsics.e(numValueOf, zzc2 != null ? Integer.valueOf(zzc2.getZza()) : null) && Intrinsics.e(this.zzd, autocompleteUiCustomization.zzd)) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNullable
    /* renamed from: listDensity, reason: from getter */
    public final AutocompleteListDensity getZza() {
        return this.zza;
    }

    @RecentlyNullable
    /* renamed from: listItemIcon, reason: from getter */
    public final AutocompleteUiIcon getZzc() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        AutocompleteListDensity autocompleteListDensity = this.zza;
        if (autocompleteListDensity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autocompleteListDensity.writeToParcel(dest, flags);
        }
        dest.writeString(this.zzb);
        AutocompleteUiIcon autocompleteUiIcon = this.zzc;
        if (autocompleteUiIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autocompleteUiIcon.writeToParcel(dest, flags);
        }
        dest.writeString(this.zzd);
    }

    @RecentlyNullable
    /* renamed from: zza, reason: from getter */
    public final String getZzb() {
        return this.zzb;
    }

    @RecentlyNullable
    /* renamed from: zzb, reason: from getter */
    public final String getZzd() {
        return this.zzd;
    }

    public final int hashCode() {
        String strName;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        AutocompleteListDensity zza = getZza();
        Integer numValueOf = null;
        if (zza != null) {
            strName = zza.name();
        } else {
            strName = null;
        }
        int iHashCode4 = 0;
        if (strName != null) {
            iHashCode = strName.hashCode();
        } else {
            iHashCode = 0;
        }
        String str = this.zzb;
        if (str != null) {
            iHashCode2 = str.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i10 = iHashCode * 31;
        AutocompleteUiIcon zzc = getZzc();
        if (zzc != null) {
            numValueOf = Integer.valueOf(zzc.getZza());
        }
        if (numValueOf != null) {
            iHashCode3 = numValueOf.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i11 = (((i10 + iHashCode2) * 31) + iHashCode3) * 31;
        String str2 = this.zzd;
        if (str2 != null) {
            iHashCode4 = str2.hashCode();
        }
        return i11 + iHashCode4;
    }
}
