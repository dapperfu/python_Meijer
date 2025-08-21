package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\u0019\b\u0006\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"rememberStreetViewCameraPositionState", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StreetViewCameraPositionStateKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    @SourceDebugExtension
    /* renamed from: com.google.maps.android.compose.streetview.StreetViewCameraPositionStateKt$rememberStreetViewCameraPositionState$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Function1<StreetViewCameraPositionState, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StreetViewCameraPositionState streetViewCameraPositionState) {
            Intrinsics.j(streetViewCameraPositionState, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StreetViewCameraPositionState streetViewCameraPositionState) {
            invoke2(streetViewCameraPositionState);
            return Unit.f143329a;
        }
    }

    public static final StreetViewCameraPositionState rememberStreetViewCameraPositionState(Function1<? super StreetViewCameraPositionState, Unit> function1, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = StreetViewCameraPositionState.INSTANCE.invoke();
            function1.invoke(objB);
            composer.t(objB);
        }
        return (StreetViewCameraPositionState) objB;
    }
}
