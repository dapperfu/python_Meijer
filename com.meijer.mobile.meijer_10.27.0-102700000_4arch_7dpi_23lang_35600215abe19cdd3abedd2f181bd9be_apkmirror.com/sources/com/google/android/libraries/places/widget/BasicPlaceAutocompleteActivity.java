package com.google.android.libraries.places.widget;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmy;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/libraries/places/widget/BasicPlaceAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/internal/autocomplete/base/BaseAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/listener/PlaceSelectionListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/google/android/libraries/places/api/model/Place;", "place", "onPlaceSelected", "(Lcom/google/android/libraries/places/api/model/Place;)V", "Lcom/google/android/gms/common/api/Status;", "status", "onError", "(Lcom/google/android/gms/common/api/Status;)V", "Landroidx/fragment/app/w;", "factory", "setTestFragmentFactory", "(Landroidx/fragment/app/w;)V", "resultErrorStatus", "Lcom/google/android/gms/common/api/Status;", "Companion", "java.com.google.android.libraries.places.widget_basic_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicPlaceAutocompleteActivity extends zzmy implements PlaceSelectionListener {

    @JvmField
    public static final int RESULT_CANCELED = 0;
    private Status zzb;

    @JvmField
    public static final int RESULT_ERROR = 2;

    @JvmField
    public static final int RESULT_OK = -1;

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public final void onError(@RecentlyNonNull Status status) throws Throwable {
        Intrinsics.j(status, "status");
        if (!status.W0()) {
            this.zzb = status;
            zzc(RESULT_ERROR, status);
            return;
        }
        Status status2 = this.zzb;
        if (status2 == null) {
            zza(RESULT_CANCELED, null, status);
        } else {
            zza(RESULT_ERROR, null, status2);
            this.zzb = null;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public final void onPlaceSelected(@RecentlyNonNull Place place) throws Throwable {
        Intrinsics.j(place, "place");
        zza(RESULT_OK, place, Status.f64735f);
    }

    @Override // com.google.android.libraries.places.internal.zzmy, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
        if (baseAutocompleteImplFragment != null) {
            Intrinsics.h(baseAutocompleteImplFragment, "null cannot be cast to non-null type com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment");
            baseAutocompleteImplFragment.zzb(this);
        }
    }
}
