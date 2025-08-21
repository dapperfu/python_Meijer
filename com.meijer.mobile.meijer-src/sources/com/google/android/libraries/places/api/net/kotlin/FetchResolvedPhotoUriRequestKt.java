package com.google.android.libraries.places.api.net.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001b\b\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"fetchResolvedPhotoUriRequest", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest;", "photoMetadata", "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FetchResolvedPhotoUriRequestKt {
    public static final FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest(@RecentlyNonNull PhotoMetadata photoMetadata, Function1<? super FetchResolvedPhotoUriRequest.Builder, Unit> function1) {
        Intrinsics.j(photoMetadata, "photoMetadata");
        FetchResolvedPhotoUriRequest.Builder builder = FetchResolvedPhotoUriRequest.builder(photoMetadata);
        if (function1 != null) {
            function1.invoke(builder);
        }
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestBuild = builder.build();
        Intrinsics.i(fetchResolvedPhotoUriRequestBuild, "build(...)");
        return fetchResolvedPhotoUriRequestBuild;
    }

    @RecentlyNonNull
    public static /* synthetic */ FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest$default(@RecentlyNonNull PhotoMetadata photoMetadata, @RecentlyNonNull Function1 function1, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return fetchResolvedPhotoUriRequest(photoMetadata, function1);
    }
}
