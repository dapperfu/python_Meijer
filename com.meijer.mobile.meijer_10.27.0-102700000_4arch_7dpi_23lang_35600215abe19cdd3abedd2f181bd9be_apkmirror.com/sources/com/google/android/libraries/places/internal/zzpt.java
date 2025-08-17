package com.google.android.libraries.places.internal;

import android.net.Uri;
import com.fullstory.FS;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import qv.InterfaceC16654n;

/* loaded from: classes6.dex */
final class zzpt implements Function1 {
    final /* synthetic */ InterfaceC16654n zza;

    zzpt(InterfaceC16654n interfaceC16654n) {
        this.zza = interfaceC16654n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Uri uri = ((FetchResolvedPhotoUriResponse) obj).getUri();
        if (uri == null) {
            FS.log_i("PlaceSearchViewModel", "No URI returned, falling back to placeholder image.");
            this.zza.resumeWith(Result.b(com.google.android.libraries.places.widget.internal.placedetails.zzbo.zza));
        } else {
            this.zza.resumeWith(Result.b(new com.google.android.libraries.places.widget.internal.placedetails.zzbl(uri)));
            FS.log_i("PlaceSearchViewModel", "Successfully resolved photo URI.");
        }
        return Unit.f142422a;
    }
}
