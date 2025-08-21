package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\u0006\u0010\u000b\u001a\u00020\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "Landroid/os/Parcelable;", "resourceId", "", "<init>", "(I)V", "equals", "", "other", "", "hashCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteUiIcon implements Parcelable {
    private final int zza;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AutocompleteUiIcon> CREATOR = new zze();
    private static final int zzb = R.drawable.location_on_icon;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon$Companion;", "", "<init>", "()V", "DEFAULT_LIST_ITEM_ICON_RESOURCE_ID", "", "getDEFAULT_LIST_ITEM_ICON_RESOURCE_ID$annotations", "getDEFAULT_LIST_ITEM_ICON_RESOURCE_ID", "()I", "noIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "listItemDefaultIcon", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
            throw null;
        }

        public /* synthetic */ Companion(@RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final AutocompleteUiIcon listItemDefaultIcon() {
            return new AutocompleteUiIcon(AutocompleteUiIcon.zzb, null);
        }

        @JvmStatic
        public final AutocompleteUiIcon noIcon() {
            return new AutocompleteUiIcon(0, null);
        }
    }

    public /* synthetic */ AutocompleteUiIcon(int i10, @RecentlyNonNull DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = i10;
    }

    @JvmStatic
    public static final AutocompleteUiIcon listItemDefaultIcon() {
        return INSTANCE.listItemDefaultIcon();
    }

    @JvmStatic
    public static final AutocompleteUiIcon noIcon() {
        return INSTANCE.noIcon();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutocompleteUiIcon) && this.zza == ((AutocompleteUiIcon) other).zza;
    }

    /* renamed from: resourceId, reason: from getter */
    public final int getZza() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.zza);
    }

    public final int hashCode() {
        return Integer.hashCode(this.zza);
    }
}
