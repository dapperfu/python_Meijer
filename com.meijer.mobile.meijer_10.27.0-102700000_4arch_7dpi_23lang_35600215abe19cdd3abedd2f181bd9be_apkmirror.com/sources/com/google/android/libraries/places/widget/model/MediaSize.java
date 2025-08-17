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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/MediaSize;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.libraries.places.widget.model_media_size_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaSize implements Parcelable {
    public static final Parcelable.Creator<MediaSize> CREATOR;

    @RecentlyNonNull
    public static final MediaSize LARGE;

    @RecentlyNonNull
    public static final MediaSize MEDIUM;

    @RecentlyNonNull
    public static final MediaSize SMALL;
    private static final /* synthetic */ MediaSize[] zza;
    private static final /* synthetic */ EnumEntries zzb;

    public static EnumEntries<MediaSize> getEntries() {
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
        MediaSize mediaSize = new MediaSize("SMALL", 0);
        SMALL = mediaSize;
        MediaSize mediaSize2 = new MediaSize("MEDIUM", 1);
        MEDIUM = mediaSize2;
        MediaSize mediaSize3 = new MediaSize("LARGE", 2);
        LARGE = mediaSize3;
        MediaSize[] mediaSizeArr = {mediaSize, mediaSize2, mediaSize3};
        zza = mediaSizeArr;
        zzb = EnumEntriesKt.a(mediaSizeArr);
        CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzf
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return MediaSize.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i10) {
                return new MediaSize[i10];
            }
        };
    }

    @RecentlyNonNull
    public static MediaSize valueOf(@RecentlyNonNull String str) {
        return (MediaSize) Enum.valueOf(MediaSize.class, str);
    }

    @RecentlyNonNull
    public static MediaSize[] values() {
        return (MediaSize[]) zza.clone();
    }

    private MediaSize(String str, int i10) {
    }
}
