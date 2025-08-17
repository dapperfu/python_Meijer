package com.google.android.libraries.places.api.net.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.IsOpenResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087@¢\u0006\u0002\u0010\b\u001a5\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087@¢\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087@¢\u0006\u0002\u0010\u000e\u001aC\u0010\u0012\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087@¢\u0006\u0002\u0010\u001a\u001a \u0010\u001b\u001a\u00020\u001c*\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0087@¢\u0006\u0002\u0010\u001d\u001a&\u0010\u001e\u001a\u00020\u001f*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0087@¢\u0006\u0002\u0010\"\u001a&\u0010\u001e\u001a\u00020\u001f*\u00020\u00022\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0087@¢\u0006\u0002\u0010%\u001aC\u0010&\u001a\u00020'*\u00020\u00022\u0006\u0010(\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087@¢\u0006\u0002\u0010\u001a\u001aC\u0010*\u001a\u00020+*\u00020\u00022\u0006\u0010,\u001a\u00020-2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087@¢\u0006\u0002\u0010/¨\u00060"}, d2 = {"awaitFindAutocompletePredictions", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFetchPhoto", "Lcom/google/android/libraries/places/api/net/FetchPhotoResponse;", "photoMetadata", "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "Lcom/google/android/libraries/places/api/net/FetchPhotoRequest$Builder;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/PhotoMetadata;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFetchResolvedPhotoUri", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriResponse;", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest$Builder;", "awaitFetchPlace", "Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;", "placeId", "", "placeFields", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "Lcom/google/android/libraries/places/api/net/FetchPlaceRequest$Builder;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFindCurrentPlace", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceResponse;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitIsOpen", "Lcom/google/android/libraries/places/api/net/IsOpenResponse;", "utcTimeMillis", "", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSearchByText", "Lcom/google/android/libraries/places/api/net/SearchByTextResponse;", "textQuery", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest$Builder;", "awaitSearchNearby", "Lcom/google/android/libraries/places/api/net/SearchNearbyResponse;", "locationRestriction", "Lcom/google/android/libraries/places/api/model/LocationRestriction;", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest$Builder;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/LocationRestriction;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlacesClientKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitIsOpen(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.model.Place r5, java.lang.Long r6, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.IsOpenResponse> r7) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r7 instanceof com.google.android.libraries.places.api.net.kotlin.zzo
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.libraries.places.api.net.kotlin.zzo r0 = (com.google.android.libraries.places.api.net.kotlin.zzo) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzo r0 = new com.google.android.libraries.places.api.net.kotlin.zzo
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L56
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r7)
            Td.b r7 = new Td.b
            r7.<init>()
            com.google.android.libraries.places.api.net.kotlin.zze r2 = new com.google.android.libraries.places.api.net.kotlin.zze
            r2.<init>()
            com.google.android.libraries.places.api.net.IsOpenRequest r5 = com.google.android.libraries.places.api.net.kotlin.IsOpenRequestKt.isOpenRequest(r5, r6, r2)
            com.google.android.libraries.places.internal.zzmo r6 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzh(r5, r6)
            java.lang.String r5 = "isOpen(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r7 = Bv.b.a(r4, r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitIsOpen(com.google.android.libraries.places.api.net.PlacesClient, com.google.android.libraries.places.api.model.Place, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RecentlyNonNull
    public static /* synthetic */ Object awaitIsOpen$default(@RecentlyNonNull PlacesClient placesClient, @RecentlyNonNull Place place, @RecentlyNonNull Long l10, @RecentlyNonNull Continuation continuation, int i10, @RecentlyNonNull Object obj) throws ApiException {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        return awaitIsOpen(placesClient, place, l10, (Continuation<? super IsOpenResponse>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFetchPhoto(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.model.PhotoMetadata r5, @androidx.annotation.RecentlyNonNull kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder, kotlin.Unit> r6, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FetchPhotoResponse> r7) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r7 instanceof com.google.android.libraries.places.api.net.kotlin.zzi
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.libraries.places.api.net.kotlin.zzi r0 = (com.google.android.libraries.places.api.net.kotlin.zzi) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzi r0 = new com.google.android.libraries.places.api.net.kotlin.zzi
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L5f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r7)
            Td.b r7 = new Td.b
            r7.<init>()
            com.google.android.libraries.places.api.net.FetchPhotoRequest$Builder r5 = com.google.android.libraries.places.api.net.FetchPhotoRequest.builder(r5)
            Td.a r2 = r7.b()
            r5.setCancellationToken(r2)
            r6.invoke(r5)
            com.google.android.libraries.places.api.net.FetchPhotoRequest r5 = r5.build()
            com.google.android.libraries.places.internal.zzmo r6 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzb(r5, r6)
            java.lang.String r5 = "fetchPhoto(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r7 = Bv.b.a(r4, r7, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitFetchPhoto(com.google.android.libraries.places.api.net.PlacesClient, com.google.android.libraries.places.api.model.PhotoMetadata, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RecentlyNonNull
    public static /* synthetic */ Object awaitFetchPhoto$default(@RecentlyNonNull PlacesClient placesClient, @RecentlyNonNull PhotoMetadata photoMetadata, @RecentlyNonNull Function1 function1, @RecentlyNonNull Continuation continuation, int i10, @RecentlyNonNull Object obj) throws ApiException {
        if ((i10 & 2) != 0) {
            function1 = zzh.zza;
        }
        return awaitFetchPhoto(placesClient, photoMetadata, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFetchPlace(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull java.lang.String r5, @androidx.annotation.RecentlyNonNull java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> r6, @androidx.annotation.RecentlyNonNull kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder, kotlin.Unit> r7, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FetchPlaceResponse> r8) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r8 instanceof com.google.android.libraries.places.api.net.kotlin.zzj
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.libraries.places.api.net.kotlin.zzj r0 = (com.google.android.libraries.places.api.net.kotlin.zzj) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzj r0 = new com.google.android.libraries.places.api.net.kotlin.zzj
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r8)
            goto L5f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r8)
            Td.b r8 = new Td.b
            r8.<init>()
            com.google.android.libraries.places.api.net.FetchPlaceRequest$Builder r5 = com.google.android.libraries.places.api.net.FetchPlaceRequest.builder(r5, r6)
            Td.a r6 = r8.b()
            r5.setCancellationToken(r6)
            r7.invoke(r5)
            com.google.android.libraries.places.api.net.FetchPlaceRequest r5 = r5.build()
            com.google.android.libraries.places.internal.zzmo r6 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzd(r5, r6)
            java.lang.String r5 = "fetchPlace(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r8 = Bv.b.a(r4, r8, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r8, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitFetchPlace(com.google.android.libraries.places.api.net.PlacesClient, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RecentlyNonNull
    public static /* synthetic */ Object awaitFetchPlace$default(@RecentlyNonNull PlacesClient placesClient, @RecentlyNonNull String str, @RecentlyNonNull List list, @RecentlyNonNull Function1 function1, @RecentlyNonNull Continuation continuation, int i10, @RecentlyNonNull Object obj) throws ApiException {
        if ((i10 & 4) != 0) {
            function1 = zzb.zza;
        }
        return awaitFetchPlace(placesClient, str, list, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFetchResolvedPhotoUri(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.model.PhotoMetadata r5, @androidx.annotation.RecentlyNonNull kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder, kotlin.Unit> r6, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse> r7) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r7 instanceof com.google.android.libraries.places.api.net.kotlin.zzk
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.libraries.places.api.net.kotlin.zzk r0 = (com.google.android.libraries.places.api.net.kotlin.zzk) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzk r0 = new com.google.android.libraries.places.api.net.kotlin.zzk
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L5f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r7)
            Td.b r7 = new Td.b
            r7.<init>()
            com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest$Builder r5 = com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.builder(r5)
            Td.a r2 = r7.b()
            r5.setCancellationToken(r2)
            r6.invoke(r5)
            com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest r5 = r5.build()
            com.google.android.libraries.places.internal.zzmo r6 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzc(r5, r6)
            java.lang.String r5 = "fetchResolvedPhotoUri(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r7 = Bv.b.a(r4, r7, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitFetchResolvedPhotoUri(com.google.android.libraries.places.api.net.PlacesClient, com.google.android.libraries.places.api.model.PhotoMetadata, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RecentlyNonNull
    public static /* synthetic */ Object awaitFetchResolvedPhotoUri$default(@RecentlyNonNull PlacesClient placesClient, @RecentlyNonNull PhotoMetadata photoMetadata, @RecentlyNonNull Function1 function1, @RecentlyNonNull Continuation continuation, int i10, @RecentlyNonNull Object obj) throws ApiException {
        if ((i10 & 2) != 0) {
            function1 = zza.zza;
        }
        return awaitFetchResolvedPhotoUri(placesClient, photoMetadata, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFindAutocompletePredictions(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r5, @androidx.annotation.RecentlyNonNull kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder, kotlin.Unit> r6, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse> r7) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r7 instanceof com.google.android.libraries.places.api.net.kotlin.zzl
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.libraries.places.api.net.kotlin.zzl r0 = (com.google.android.libraries.places.api.net.kotlin.zzl) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzl r0 = new com.google.android.libraries.places.api.net.kotlin.zzl
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L5f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            Td.b r7 = new Td.b
            r7.<init>()
            com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest$Builder r2 = com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.builder()
            Td.a r4 = r7.b()
            r2.setCancellationToken(r4)
            r6.invoke(r2)
            com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest r6 = r2.build()
            com.google.android.libraries.places.internal.zzmo r2 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r5 = r5.zza(r6, r2)
            java.lang.String r6 = "findAutocompletePredictions(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            r0.zzb = r3
            java.lang.Object r7 = Bv.b.a(r5, r7, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitFindAutocompletePredictions(com.google.android.libraries.places.api.net.PlacesClient, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFindCurrentPlace(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> r5, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.FindCurrentPlaceResponse> r6) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r6 instanceof com.google.android.libraries.places.api.net.kotlin.zzm
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.libraries.places.api.net.kotlin.zzm r0 = (com.google.android.libraries.places.api.net.kotlin.zzm) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzm r0 = new com.google.android.libraries.places.api.net.kotlin.zzm
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L56
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            Td.b r6 = new Td.b
            r6.<init>()
            com.google.android.libraries.places.api.net.kotlin.zzc r2 = new com.google.android.libraries.places.api.net.kotlin.zzc
            r2.<init>()
            com.google.android.libraries.places.api.net.FindCurrentPlaceRequest r5 = com.google.android.libraries.places.api.net.kotlin.FindCurrentPlaceRequestKt.findCurrentPlaceRequest(r5, r2)
            com.google.android.libraries.places.internal.zzmo r2 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzf(r5, r2)
            java.lang.String r5 = "findCurrentPlace(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r6 = Bv.b.a(r4, r6, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitFindCurrentPlace(com.google.android.libraries.places.api.net.PlacesClient, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RecentlyNonNull
    public static /* synthetic */ Object awaitIsOpen$default(@RecentlyNonNull PlacesClient placesClient, @RecentlyNonNull String str, @RecentlyNonNull Long l10, @RecentlyNonNull Continuation continuation, int i10, @RecentlyNonNull Object obj) throws ApiException {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        return awaitIsOpen(placesClient, str, l10, (Continuation<? super IsOpenResponse>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitSearchByText(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull java.lang.String r5, @androidx.annotation.RecentlyNonNull java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> r6, @androidx.annotation.RecentlyNonNull kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.SearchByTextRequest.Builder, kotlin.Unit> r7, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.SearchByTextResponse> r8) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r8 instanceof com.google.android.libraries.places.api.net.kotlin.zzp
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.libraries.places.api.net.kotlin.zzp r0 = (com.google.android.libraries.places.api.net.kotlin.zzp) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzp r0 = new com.google.android.libraries.places.api.net.kotlin.zzp
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r8)
            goto L5f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r8)
            Td.b r8 = new Td.b
            r8.<init>()
            com.google.android.libraries.places.api.net.SearchByTextRequest$Builder r5 = com.google.android.libraries.places.api.net.SearchByTextRequest.builder(r5, r6)
            Td.a r6 = r8.b()
            r5.setCancellationToken(r6)
            r7.invoke(r5)
            com.google.android.libraries.places.api.net.SearchByTextRequest r5 = r5.build()
            com.google.android.libraries.places.internal.zzmo r6 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzi(r5, r6)
            java.lang.String r5 = "searchByText(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r8 = Bv.b.a(r4, r8, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r8, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitSearchByText(com.google.android.libraries.places.api.net.PlacesClient, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RecentlyNonNull
    public static /* synthetic */ Object awaitSearchByText$default(@RecentlyNonNull PlacesClient placesClient, @RecentlyNonNull String str, @RecentlyNonNull List list, @RecentlyNonNull Function1 function1, @RecentlyNonNull Continuation continuation, int i10, @RecentlyNonNull Object obj) throws ApiException {
        if ((i10 & 4) != 0) {
            function1 = zzf.zza;
        }
        return awaitSearchByText(placesClient, str, list, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitSearchNearby(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.model.LocationRestriction r5, @androidx.annotation.RecentlyNonNull java.util.List<? extends com.google.android.libraries.places.api.model.Place.Field> r6, @androidx.annotation.RecentlyNonNull kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder, kotlin.Unit> r7, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.SearchNearbyResponse> r8) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r8 instanceof com.google.android.libraries.places.api.net.kotlin.zzq
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.libraries.places.api.net.kotlin.zzq r0 = (com.google.android.libraries.places.api.net.kotlin.zzq) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzq r0 = new com.google.android.libraries.places.api.net.kotlin.zzq
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r8)
            goto L5f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r8)
            Td.b r8 = new Td.b
            r8.<init>()
            com.google.android.libraries.places.api.net.SearchNearbyRequest$Builder r5 = com.google.android.libraries.places.api.net.SearchNearbyRequest.builder(r5, r6)
            Td.a r6 = r8.b()
            r5.setCancellationToken(r6)
            r7.invoke(r5)
            com.google.android.libraries.places.api.net.SearchNearbyRequest r5 = r5.build()
            com.google.android.libraries.places.internal.zzmo r6 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzj(r5, r6)
            java.lang.String r5 = "searchNearby(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r8 = Bv.b.a(r4, r8, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r8, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitSearchNearby(com.google.android.libraries.places.api.net.PlacesClient, com.google.android.libraries.places.api.model.LocationRestriction, java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RecentlyNonNull
    public static /* synthetic */ Object awaitSearchNearby$default(@RecentlyNonNull PlacesClient placesClient, @RecentlyNonNull LocationRestriction locationRestriction, @RecentlyNonNull List list, @RecentlyNonNull Function1 function1, @RecentlyNonNull Continuation continuation, int i10, @RecentlyNonNull Object obj) throws ApiException {
        if ((i10 & 4) != 0) {
            function1 = zzg.zza;
        }
        return awaitSearchNearby(placesClient, locationRestriction, list, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RecentlyNullable
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitIsOpen(@androidx.annotation.RecentlyNonNull com.google.android.libraries.places.api.net.PlacesClient r4, @androidx.annotation.RecentlyNonNull java.lang.String r5, java.lang.Long r6, @androidx.annotation.RecentlyNonNull kotlin.coroutines.Continuation<? super com.google.android.libraries.places.api.net.IsOpenResponse> r7) throws com.google.android.gms.common.api.ApiException {
        /*
            boolean r0 = r7 instanceof com.google.android.libraries.places.api.net.kotlin.zzn
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.libraries.places.api.net.kotlin.zzn r0 = (com.google.android.libraries.places.api.net.kotlin.zzn) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.api.net.kotlin.zzn r0 = new com.google.android.libraries.places.api.net.kotlin.zzn
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.zzb
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L56
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r7)
            Td.b r7 = new Td.b
            r7.<init>()
            com.google.android.libraries.places.api.net.kotlin.zzd r2 = new com.google.android.libraries.places.api.net.kotlin.zzd
            r2.<init>()
            com.google.android.libraries.places.api.net.IsOpenRequest r5 = com.google.android.libraries.places.api.net.kotlin.IsOpenRequestKt.isOpenRequest(r5, r6, r2)
            com.google.android.libraries.places.internal.zzmo r6 = com.google.android.libraries.places.internal.zzmo.PROGRAMMATIC_KOTLIN_API
            Td.j r4 = r4.zzh(r5, r6)
            java.lang.String r5 = "isOpen(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r0.zzb = r3
            java.lang.Object r7 = Bv.b.a(r4, r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.i(r7, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.kotlin.PlacesClientKt.awaitIsOpen(com.google.android.libraries.places.api.net.PlacesClient, java.lang.String, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
