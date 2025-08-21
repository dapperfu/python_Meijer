package com.google.android.libraries.places.widget;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.internal.zzmy;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PredictionSelectionListener;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/internal/autocomplete/base/BaseAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/listener/PredictionSelectionListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "prediction", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "onPredictionSelected", "(Lcom/google/android/libraries/places/api/model/AutocompletePrediction;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;)V", "Lcom/google/android/gms/common/api/Status;", "errorStatus", "onError", "(Lcom/google/android/gms/common/api/Status;)V", "Landroidx/fragment/app/w;", "factory", "setTestFragmentFactory", "(Landroidx/fragment/app/w;)V", "resultErrorStatus", "Lcom/google/android/gms/common/api/Status;", "Companion", "java.com.google.android.libraries.places.widget_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceAutocompleteActivity extends zzmy implements PredictionSelectionListener {

    @JvmField
    public static final int RESULT_CANCELED = 0;
    private Status zzb;

    @JvmField
    public static final int RESULT_ERROR = 2;

    @JvmField
    public static final int RESULT_OK = -1;

    @Override // com.google.android.libraries.places.widget.listener.PredictionSelectionListener
    public final void onError(@RecentlyNonNull Status errorStatus) throws Throwable {
        Intrinsics.j(errorStatus, "errorStatus");
        if (!errorStatus.U0()) {
            this.zzb = errorStatus;
            zzc(RESULT_ERROR, errorStatus);
            return;
        }
        Status status = this.zzb;
        if (status == null) {
            zzb(RESULT_CANCELED, null, null, errorStatus);
        } else {
            zzb(RESULT_ERROR, null, null, status);
            this.zzb = null;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PredictionSelectionListener
    public final void onPredictionSelected(@RecentlyNonNull AutocompletePrediction prediction, @RecentlyNonNull AutocompleteSessionToken sessionToken) throws Throwable {
        Intrinsics.j(prediction, "prediction");
        Intrinsics.j(sessionToken, "sessionToken");
        zzb(RESULT_OK, prediction, sessionToken, Status.f65575f);
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
        if (baseAutocompleteImplFragment != null) {
            Intrinsics.h(baseAutocompleteImplFragment, "null cannot be cast to non-null type com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment");
            baseAutocompleteImplFragment.zzc(this);
        }
    }
}
