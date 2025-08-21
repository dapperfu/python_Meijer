package com.google.maps.android.compose.streetview;

import Md.C4119l;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.C5877o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5867j;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import com.fullstory.FS;
import com.google.android.gms.maps.StreetViewPanoramaView;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import mv.Z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1", f = "StreetView.kt", l = {196, 208}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class StreetViewKt$StreetView$6$1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
    final /* synthetic */ z1<StreetViewPanoramaEventListeners> $clickListeners$delegate;
    final /* synthetic */ z1<StreetViewCameraPositionState> $currentCameraPositionState$delegate;
    final /* synthetic */ z1<Boolean> $currentIsPanningGestureEnabled$delegate;
    final /* synthetic */ z1<Boolean> $currentIsStreetNamesEnabled$delegate;
    final /* synthetic */ z1<Boolean> $currentIsUserNavigationEnabled$delegate;
    final /* synthetic */ z1<Boolean> $currentIsZoomGesturesEnabled$delegate;
    final /* synthetic */ AbstractC5869k $parentComposition;
    final /* synthetic */ StreetViewPanoramaView $streetView;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StreetViewKt$StreetView$6$1(StreetViewPanoramaView streetViewPanoramaView, AbstractC5869k abstractC5869k, z1<StreetViewCameraPositionState> z1Var, z1<Boolean> z1Var2, z1<Boolean> z1Var3, z1<Boolean> z1Var4, z1<Boolean> z1Var5, z1<StreetViewPanoramaEventListeners> z1Var6, Continuation<? super StreetViewKt$StreetView$6$1> continuation) {
        super(2, continuation);
        this.$streetView = streetViewPanoramaView;
        this.$parentComposition = abstractC5869k;
        this.$currentCameraPositionState$delegate = z1Var;
        this.$currentIsPanningGestureEnabled$delegate = z1Var2;
        this.$currentIsStreetNamesEnabled$delegate = z1Var3;
        this.$currentIsUserNavigationEnabled$delegate = z1Var4;
        this.$currentIsZoomGesturesEnabled$delegate = z1Var5;
        this.$clickListeners$delegate = z1Var6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StreetViewKt$StreetView$6$1(this.$streetView, this.$parentComposition, this.$currentCameraPositionState$delegate, this.$currentIsPanningGestureEnabled$delegate, this.$currentIsStreetNamesEnabled$delegate, this.$currentIsUserNavigationEnabled$delegate, this.$currentIsZoomGesturesEnabled$delegate, this.$clickListeners$delegate, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, z1 z1Var5, z1 z1Var6, Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.j()) {
            composer.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1039809540, i10, -1, "com.google.maps.android.compose.streetview.StreetView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StreetView.kt:101)");
            }
            StreetViewCameraPositionState streetViewCameraPositionStateStreetView$lambda$11 = StreetViewKt.StreetView$lambda$11(z1Var);
            boolean zStreetView$lambda$12 = StreetViewKt.StreetView$lambda$12(z1Var2);
            boolean zStreetView$lambda$13 = StreetViewKt.StreetView$lambda$13(z1Var3);
            boolean zStreetView$lambda$14 = StreetViewKt.StreetView$lambda$14(z1Var4);
            boolean zStreetView$lambda$15 = StreetViewKt.StreetView$lambda$15(z1Var5);
            StreetViewPanoramaEventListeners streetViewPanoramaEventListenersStreetView$lambda$17 = StreetViewKt.StreetView$lambda$17(z1Var6);
            Applier<?> applierK = composer.k();
            Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.streetview.StreetViewPanoramaApplier");
            C4119l streetViewPanorama = ((StreetViewPanoramaApplier) applierK).getStreetViewPanorama();
            boolean zD = composer.D(streetViewCameraPositionStateStreetView$lambda$11) | composer.D(streetViewPanorama) | composer.V(streetViewPanoramaEventListenersStreetView$lambda$17);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(streetViewCameraPositionStateStreetView$lambda$11, streetViewPanorama, streetViewPanoramaEventListenersStreetView$lambda$17);
                composer.t(objB);
            }
            Function0 function0 = (Function0) objB;
            if (!(composer.k() instanceof StreetViewPanoramaApplier)) {
                C5859f.c();
            }
            composer.m();
            if (composer.getInserting()) {
                composer.I(function0);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, Boolean.valueOf(zStreetView$lambda$12), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(zStreetView$lambda$12));
            D1.c(composerA, Boolean.valueOf(zStreetView$lambda$13), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2(zStreetView$lambda$13));
            D1.c(composerA, Boolean.valueOf(zStreetView$lambda$14), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3(zStreetView$lambda$14));
            D1.c(composerA, Boolean.valueOf(zStreetView$lambda$15), new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4(zStreetView$lambda$15));
            D1.c(composerA, streetViewPanoramaEventListenersStreetView$lambda$17, StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5.INSTANCE);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f143329a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
        return ((StreetViewKt$StreetView$6$1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC5869k abstractC5869k;
        Function2<? super Composer, ? super Integer, Unit> function2;
        int i10;
        InterfaceC5867j interfaceC5867jA;
        InterfaceC5867j interfaceC5867j;
        Object objF = IntrinsicsKt.f();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC5867j = (InterfaceC5867j) this.L$0;
                    try {
                        ResultKt.b(obj);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        interfaceC5867j.dispose();
                        throw th3;
                    }
                }
                i10 = this.I$0;
                function2 = (Function2) this.L$2;
                abstractC5869k = (AbstractC5869k) this.L$1;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                StreetViewPanoramaView streetViewPanoramaView = this.$streetView;
                abstractC5869k = this.$parentComposition;
                final z1<StreetViewCameraPositionState> z1Var = this.$currentCameraPositionState$delegate;
                final z1<Boolean> z1Var2 = this.$currentIsPanningGestureEnabled$delegate;
                final z1<Boolean> z1Var3 = this.$currentIsStreetNamesEnabled$delegate;
                final z1<Boolean> z1Var4 = this.$currentIsUserNavigationEnabled$delegate;
                final z1<Boolean> z1Var5 = this.$currentIsZoomGesturesEnabled$delegate;
                final z1<StreetViewPanoramaEventListeners> z1Var6 = this.$clickListeners$delegate;
                ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-1039809540, true, new Function2() { // from class: com.google.maps.android.compose.streetview.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return StreetViewKt$StreetView$6$1.invokeSuspend$lambda$1$lambda$0(z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                this.L$0 = SpillingKt.a(streetViewPanoramaView);
                this.L$1 = abstractC5869k;
                this.L$2 = composableLambdaComposableLambdaInstance;
                this.L$3 = this;
                this.L$4 = streetViewPanoramaView;
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.I$3 = 0;
                this.label = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(this));
                streetViewPanoramaView.a(new StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(safeContinuation));
                obj = safeContinuation.b();
                if (obj == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (obj != objF) {
                    function2 = composableLambdaComposableLambdaInstance;
                    i10 = 0;
                }
                return objF;
            }
            this.L$0 = interfaceC5867jA;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = i10;
            this.label = 2;
            if (Z.a(this) != objF) {
                interfaceC5867j = interfaceC5867jA;
                throw new KotlinNothingValueException();
            }
            return objF;
        } catch (Throwable th4) {
            th = th4;
            interfaceC5867j = interfaceC5867jA;
            Throwable th32 = th;
            interfaceC5867j.dispose();
            throw th32;
        }
        C4119l c4119l = (C4119l) obj;
        FS.log_d("StreetView", "Location is " + c4119l.b());
        interfaceC5867jA = C5877o.a(new StreetViewPanoramaApplier(c4119l), abstractC5869k);
        interfaceC5867jA.d(function2);
    }
}
