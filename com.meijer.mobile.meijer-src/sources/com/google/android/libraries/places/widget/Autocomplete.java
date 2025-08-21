package com.google.android.libraries.places.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zznf;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzoc;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* loaded from: classes6.dex */
public final class Autocomplete {

    public static class IntentBuilder {
        private final zznf zza;

        public IntentBuilder(zzng zzngVar) {
            this.zza = zzngVar.zzs();
        }

        public IntentBuilder(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode, @RecentlyNonNull List<Place.Field> list) {
            this.zza = zzng.zzt(autocompleteActivityMode, list, zzoc.INTENT);
        }

        @RecentlyNonNull
        public Intent build(@RecentlyNonNull Context context) throws Throwable {
            try {
                Intent intent = new Intent(context, (Class<?>) AutocompleteActivity.class);
                zznf zznfVar = this.zza;
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = new TypedValue();
                if (theme.resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                    zznfVar.zzm(typedValue.data);
                }
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(R.attr.colorPrimaryDark, typedValue2, true)) {
                    zznfVar.zzn(typedValue2.data);
                }
                intent.putExtra("places/AutocompleteOptions", zznfVar.zzs());
                return intent;
            } catch (Error e10) {
                e = e10;
                zzmr.zzb(e);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                zzmr.zzb(e);
                throw e;
            }
        }

        @RecentlyNonNull
        public IntentBuilder setCountries(@RecentlyNonNull List<String> list) {
            this.zza.zzj(list);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public IntentBuilder setCountry(String str) {
            this.zza.zzt(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setHint(String str) {
            this.zza.zzg(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setInitialQuery(String str) {
            this.zza.zzf(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationBias(LocationBias locationBias) {
            this.zza.zzh(locationBias);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationRestriction(LocationRestriction locationRestriction) {
            this.zza.zzi(locationRestriction);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setRegionCode(String str) {
            this.zza.zzo(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public IntentBuilder setTypeFilter(TypeFilter typeFilter) {
            this.zza.zzk(typeFilter);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setTypesFilter(@RecentlyNonNull List<String> list) {
            this.zza.zzl(list);
            return this;
        }

        public final IntentBuilder zza(zzoc zzocVar) {
            this.zza.zzd(zzocVar);
            return this;
        }
    }

    private Autocomplete() {
    }

    @RecentlyNonNull
    public static Place getPlaceFromIntent(@RecentlyNonNull Intent intent) {
        return zznj.zza(intent);
    }

    @RecentlyNonNull
    public static Status getStatusFromIntent(@RecentlyNonNull Intent intent) {
        return zznj.zzb(intent);
    }
}
