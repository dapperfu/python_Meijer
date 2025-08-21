package com.google.android.libraries.places.api.model;

import De.p;
import De.v;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.zzud;
import com.google.android.libraries.places.internal.zzue;
import com.google.android.libraries.places.internal.zzug;
import com.google.android.libraries.places.internal.zzuh;

/* loaded from: classes6.dex */
public abstract class Review implements Parcelable {
    @RecentlyNonNull
    public abstract String getAttribution();

    @RecentlyNonNull
    public abstract AuthorAttribution getAuthorAttribution();

    @RecentlyNullable
    public abstract Uri getFlagContentUri();

    @RecentlyNullable
    public abstract String getOriginalText();

    @RecentlyNullable
    public abstract String getOriginalTextLanguageCode();

    @RecentlyNullable
    public abstract String getPublishTime();

    @RecentlyNonNull
    public abstract Double getRating();

    @RecentlyNullable
    public abstract String getRelativePublishTimeDescription();

    @RecentlyNullable
    public abstract String getText();

    @RecentlyNullable
    public abstract String getTextLanguageCode();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract String getOriginalText();

        @RecentlyNullable
        public abstract String getOriginalTextLanguageCode();

        @RecentlyNullable
        public abstract String getPublishTime();

        @RecentlyNullable
        public abstract String getRelativePublishTimeDescription();

        @RecentlyNullable
        public abstract String getText();

        @RecentlyNullable
        public abstract String getTextLanguageCode();

        @RecentlyNonNull
        public abstract Builder setFlagContentUri(Uri uri);

        @RecentlyNonNull
        public abstract Builder setOriginalText(String str);

        @RecentlyNonNull
        public abstract Builder setOriginalTextLanguageCode(String str);

        @RecentlyNonNull
        public abstract Builder setPublishTime(String str);

        @RecentlyNonNull
        public abstract Builder setRelativePublishTimeDescription(String str);

        @RecentlyNonNull
        public abstract Builder setText(String str);

        @RecentlyNonNull
        public abstract Builder setTextLanguageCode(String str);

        abstract Builder zzb(AuthorAttribution authorAttribution);

        abstract Builder zzc(String str);

        abstract Review zzd();

        @RecentlyNonNull
        public Review build() {
            Double rating = zzd().getRating();
            boolean z10 = false;
            if (rating.doubleValue() >= 1.0d && rating.doubleValue() <= 5.0d) {
                z10 = true;
            }
            p.l(z10, "Rating must between 1.0 and 5.0 (inclusive), but was: %s.", rating);
            return zzd();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull Double d10, @RecentlyNonNull AuthorAttribution authorAttribution) {
        String strE = v.e(authorAttribution.getUri());
        if (strE.startsWith("//")) {
            strE = "https:".concat(strE);
        }
        zzue zzueVar = new zzue("a");
        int i10 = zzuh.zza;
        zzueVar.zza(zzuh.zza(strE, zzug.zza));
        zzueVar.zzb(authorAttribution.getName());
        zzud zzudVarZzc = zzueVar.zzc();
        zzaz zzazVar = new zzaz();
        zzazVar.zza(d10);
        zzazVar.zzb(authorAttribution);
        zzazVar.zzc(zzudVarZzc.zza());
        return zzazVar;
    }
}
