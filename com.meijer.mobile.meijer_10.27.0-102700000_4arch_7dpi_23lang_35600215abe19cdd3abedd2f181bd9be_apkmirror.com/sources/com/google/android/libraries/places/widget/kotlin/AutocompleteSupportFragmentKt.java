package com.google.android.libraries.places.widget.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sv.r;
import sv.t;
import tv.C17154h;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "Ltv/f;", "Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionResult;", "placeSelectionEvents", "(Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)Ltv/f;", "java.com.google.android.libraries.places.widget.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteSupportFragmentKt {

    /* renamed from: com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt$placeSelectionEvents$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public static final /* synthetic */ int zzc = 0;
        int zza;
        final /* synthetic */ AutocompleteSupportFragment zzb;
        private /* synthetic */ Object zzd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AutocompleteSupportFragment autocompleteSupportFragment, Continuation continuation) {
            super(2, continuation);
            this.zzb = autocompleteSupportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.zzb, continuation);
            anonymousClass1.zzd = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((t) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.zza;
            ResultKt.b(obj);
            if (i10 == 0) {
                final t tVar = (t) this.zzd;
                final AutocompleteSupportFragment autocompleteSupportFragment = this.zzb;
                autocompleteSupportFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() { // from class: com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt.placeSelectionEvents.1.1
                    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
                    public void onError(Status status) {
                        Intrinsics.j(status, "status");
                        tVar.k(new PlaceSelectionError(status));
                    }

                    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
                    public void onPlaceSelected(Place place) {
                        Intrinsics.j(place, "place");
                        tVar.k(new PlaceSelectionSuccess(place));
                    }
                });
                Function0 function0 = new Function0() { // from class: com.google.android.libraries.places.widget.kotlin.zza
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Object invoke() {
                        autocompleteSupportFragment.setOnPlaceSelectedListener(null);
                        return Unit.f142422a;
                    }
                };
                this.zza = 1;
                if (r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public static final InterfaceC17152f<PlaceSelectionResult> placeSelectionEvents(@RecentlyNonNull AutocompleteSupportFragment autocompleteSupportFragment) {
        Intrinsics.j(autocompleteSupportFragment, "<this>");
        return C17154h.f(new AnonymousClass1(autocompleteSupportFragment, null));
    }
}
