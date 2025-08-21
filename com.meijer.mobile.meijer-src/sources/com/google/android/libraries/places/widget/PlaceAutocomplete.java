package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zznf;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzoh;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J+\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocomplete;", "", "<init>", "()V", "getPredictionFromIntent", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "intent", "Landroid/content/Intent;", "getSessionTokenFromIntent", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "getResultStatusFromIntent", "Lcom/google/android/gms/common/api/Status;", "createIntent", "context", "Landroid/content/Context;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/widget/PlaceAutocomplete$IntentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "IntentBuilder", "java.com.google.android.libraries.places.widget_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceAutocomplete {
    public static final PlaceAutocomplete INSTANCE = new PlaceAutocomplete();

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011H\u0007J\u0012\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0010\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocomplete$IntentBuilder;", "", "<init>", "()V", "optionsBuilder", "Lcom/google/android/libraries/places/widget/internal/autocomplete/common/AutocompleteOptions$Builder;", "setInitialQuery", "initialQuery", "", "setLocationBias", "locationBias", "Lcom/google/android/libraries/places/api/model/LocationBias;", "setLocationRestriction", "locationRestriction", "Lcom/google/android/libraries/places/api/model/LocationRestriction;", "setCountries", "countries", "", "setTypesFilter", "typesFilter", "setRegionCode", "regionCode", "setAutocompleteUiCustomization", "autocompleteUiCustomization", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "setOrigin", "origin", "Lcom/google/android/gms/maps/model/LatLng;", "setPureServiceAreaBusinessesIncluded", "isPureServiceAreaBusinessesIncluded", "", "setAutocompleteSessionToken", "autocompleteSessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "build", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "java.com.google.android.libraries.places.widget_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IntentBuilder {
        private final zznf zza;

        public final Intent build(Context context) {
            try {
                Intent intent = new Intent(context, (Class<?>) PlaceAutocompleteActivity.class);
                intent.putExtra("places/AutocompleteOptions", this.zza.zzs());
                return intent;
            } catch (Error e10) {
                zzmr.zzb(e10);
                throw e10;
            } catch (RuntimeException e11) {
                zzmr.zzb(e11);
                throw e11;
            }
        }

        public final IntentBuilder setAutocompleteSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
            this.zza.zzr(autocompleteSessionToken);
            return this;
        }

        public final IntentBuilder setAutocompleteUiCustomization(AutocompleteUiCustomization autocompleteUiCustomization) {
            this.zza.zzp(autocompleteUiCustomization);
            return this;
        }

        public final IntentBuilder setCountries(List<String> countries) {
            this.zza.zzj(countries);
            return this;
        }

        public final IntentBuilder setInitialQuery(String initialQuery) {
            this.zza.zzf(initialQuery);
            return this;
        }

        public final IntentBuilder setLocationBias(LocationBias locationBias) {
            this.zza.zzh(locationBias);
            return this;
        }

        public final IntentBuilder setLocationRestriction(LocationRestriction locationRestriction) {
            this.zza.zzi(locationRestriction);
            return this;
        }

        public final IntentBuilder setOrigin(LatLng origin) {
            this.zza.zze(origin);
            return this;
        }

        public final IntentBuilder setPureServiceAreaBusinessesIncluded(boolean isPureServiceAreaBusinessesIncluded) {
            this.zza.zzq(isPureServiceAreaBusinessesIncluded);
            return this;
        }

        public final IntentBuilder setRegionCode(String regionCode) {
            this.zza.zzo(regionCode);
            return this;
        }

        public final IntentBuilder setTypesFilter(List<String> typesFilter) {
            this.zza.zzl(typesFilter);
            return this;
        }

        public IntentBuilder() {
            zznf zznfVarZzu = zzng.zzu(zzoh.ONE_PLATFORM);
            Intrinsics.i(zznfVarZzu, "builder(...)");
            this.zza = zznfVarZzu;
        }
    }

    private PlaceAutocomplete() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ Intent createIntent$default(@RecentlyNonNull PlaceAutocomplete placeAutocomplete, @RecentlyNonNull Context context, @RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return placeAutocomplete.createIntent(context, function1);
    }

    @RecentlyNullable
    @JvmStatic
    public static final AutocompletePrediction getPredictionFromIntent(@RecentlyNonNull Intent intent) {
        Intrinsics.j(intent, "intent");
        return (AutocompletePrediction) intent.getParcelableExtra("places/selected_prediction");
    }

    @RecentlyNullable
    @JvmStatic
    public static final Status getResultStatusFromIntent(@RecentlyNonNull Intent intent) {
        Intrinsics.j(intent, "intent");
        return zznj.zzc(intent);
    }

    @RecentlyNullable
    @JvmStatic
    public static final AutocompleteSessionToken getSessionTokenFromIntent(@RecentlyNonNull Intent intent) {
        Intrinsics.j(intent, "intent");
        return (AutocompleteSessionToken) intent.getParcelableExtra("places/session_token");
    }

    public final Intent createIntent(@RecentlyNonNull Context context, Function1<? super IntentBuilder, Unit> actions) {
        Intrinsics.j(context, "context");
        IntentBuilder intentBuilder = new IntentBuilder();
        if (actions != null) {
            actions.invoke(intentBuilder);
        }
        return intentBuilder.build(context);
    }
}
