package com.google.maps.android.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.maps.android.compose.CameraPositionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a:\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0019\b\u0006\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0011\u0010\u0010\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"", "key", "Lkotlin/Function1;", "Lcom/google/maps/android/compose/CameraPositionState;", "", "Lkotlin/ExtensionFunctionType;", "init", "rememberCameraPositionState", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/CameraPositionState;", "Landroidx/compose/runtime/F0;", "LocalCameraPositionState", "Landroidx/compose/runtime/F0;", "getLocalCameraPositionState", "()Landroidx/compose/runtime/F0;", "getCurrentCameraPositionState", "(Landroidx/compose/runtime/Composer;I)Lcom/google/maps/android/compose/CameraPositionState;", "currentCameraPositionState", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CameraPositionStateKt {
    private static final androidx.compose.runtime.F0<CameraPositionState> LocalCameraPositionState = androidx.compose.runtime.r.f(new Function0() { // from class: com.google.maps.android.compose.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CameraPositionStateKt.LocalCameraPositionState$lambda$0();
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    @SourceDebugExtension
    /* renamed from: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Function1<CameraPositionState, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CameraPositionState cameraPositionState) {
            Intrinsics.j(cameraPositionState, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CameraPositionState cameraPositionState) {
            invoke2(cameraPositionState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    @SourceDebugExtension
    /* renamed from: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$2, reason: invalid class name */
    public static final class AnonymousClass2 implements Function0<CameraPositionState> {
        final /* synthetic */ Function1<CameraPositionState, Unit> $init;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super CameraPositionState, Unit> function1) {
            this.$init = function1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CameraPositionState invoke() {
            CameraPositionState cameraPositionStateInvoke$default = CameraPositionState.Companion.invoke$default(CameraPositionState.INSTANCE, null, 1, null);
            this.$init.invoke(cameraPositionStateInvoke$default);
            return cameraPositionStateInvoke$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPositionState LocalCameraPositionState$lambda$0() {
        return CameraPositionState.Companion.invoke$default(CameraPositionState.INSTANCE, null, 1, null);
    }

    public static final androidx.compose.runtime.F0<CameraPositionState> getLocalCameraPositionState() {
        return LocalCameraPositionState;
    }

    public static final CameraPositionState rememberCameraPositionState(String str, Function1<? super CameraPositionState, Unit> function1, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 2) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        return (CameraPositionState) L0.c.c(new Object[0], CameraPositionState.INSTANCE.getSaver(), str2, new AnonymousClass2(function1), composer, (i10 << 6) & 896, 0);
    }

    @GoogleMapComposable
    @JvmName
    public static final CameraPositionState getCurrentCameraPositionState(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(629347539, i10, -1, "com.google.maps.android.compose.<get-currentCameraPositionState> (CameraPositionState.kt:331)");
        }
        CameraPositionState cameraPositionState = (CameraPositionState) composer.o(LocalCameraPositionState);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return cameraPositionState;
    }
}
