package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
final class zzdu extends zzba {
    public static final Parcelable.Creator<zzdu> CREATOR = new zzdt();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdu(String str, String str2, String str3, String str4, String str5, Double d10, AuthorAttribution authorAttribution, String str6, String str7, Uri uri) {
        super(str, str2, str3, str4, str5, d10, authorAttribution, str6, str7, uri);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (getRelativePublishTimeDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getRelativePublishTimeDescription());
        }
        if (getText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getText());
        }
        if (getTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTextLanguageCode());
        }
        if (getOriginalText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOriginalText());
        }
        if (getOriginalTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOriginalTextLanguageCode());
        }
        parcel.writeDouble(getRating().doubleValue());
        parcel.writeParcelable(getAuthorAttribution(), i10);
        parcel.writeString(getAttribution());
        if (getPublishTime() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPublishTime());
        }
        parcel.writeParcelable(getFlagContentUri(), i10);
    }
}
