package com.google.android.libraries.places.api.model;

import Ee.L;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AutocompletePrediction implements Parcelable {
    @RecentlyNullable
    public abstract Integer getDistanceMeters();

    @RecentlyNonNull
    public abstract String getPlaceId();

    @RecentlyNonNull
    @Deprecated
    public abstract List<Place.Type> getPlaceTypes();

    @RecentlyNonNull
    public abstract List<String> getTypes();

    abstract String zza();

    abstract String zzb();

    abstract String zzc();

    abstract List zzd();

    abstract List zze();

    abstract List zzf();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract Integer getDistanceMeters();

        @RecentlyNonNull
        public abstract String getFullText();

        @RecentlyNonNull
        public abstract List<Place.Type> getPlaceTypes();

        @RecentlyNonNull
        public abstract String getPrimaryText();

        @RecentlyNonNull
        public abstract String getSecondaryText();

        @RecentlyNonNull
        public abstract List<String> getTypes();

        @RecentlyNonNull
        public abstract Builder setDistanceMeters(Integer num);

        @RecentlyNonNull
        public abstract Builder setFullText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setPlaceTypes(@RecentlyNonNull List<Place.Type> list);

        @RecentlyNonNull
        public abstract Builder setPrimaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setSecondaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setTypes(@RecentlyNonNull List<String> list);

        abstract Builder zza(String str);

        @RecentlyNonNull
        public abstract Builder zzb(@RecentlyNonNull List list);

        @RecentlyNonNull
        public abstract Builder zzc(@RecentlyNonNull List list);

        @RecentlyNonNull
        public abstract Builder zzd(@RecentlyNonNull List list);

        abstract AutocompletePrediction zze();

        @RecentlyNonNull
        public AutocompletePrediction build() {
            AutocompletePrediction autocompletePredictionZze = zze();
            setPlaceTypes(L.s(autocompletePredictionZze.getPlaceTypes()));
            setTypes(L.s(autocompletePredictionZze.getTypes()));
            zzb(L.s(autocompletePredictionZze.zzd()));
            zzc(L.s(autocompletePredictionZze.zze()));
            zzd(L.s(autocompletePredictionZze.zzf()));
            return zze();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzi zziVar = new zzi();
        zziVar.zzb(new ArrayList());
        zziVar.zza(str);
        zziVar.setPlaceTypes(new ArrayList());
        zziVar.zzc(new ArrayList());
        zziVar.zzd(new ArrayList());
        zziVar.setTypes(new ArrayList());
        zziVar.setFullText("");
        zziVar.setPrimaryText("");
        zziVar.setSecondaryText("");
        return zziVar;
    }

    private static final SpannableString zzg(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzek zzekVar = (zzek) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zzekVar.zza(), zzekVar.zza() + zzekVar.zzb(), 0);
            }
        }
        return spannableString;
    }

    @RecentlyNonNull
    public SpannableString getFullText(CharacterStyle characterStyle) {
        return zzg(zza(), zzd(), characterStyle);
    }

    @RecentlyNonNull
    public SpannableString getPrimaryText(CharacterStyle characterStyle) {
        return zzg(zzb(), zze(), characterStyle);
    }

    @RecentlyNonNull
    public SpannableString getSecondaryText(CharacterStyle characterStyle) {
        return zzg(zzc(), zzf(), characterStyle);
    }
}
