package com.google.maps.android.ktx;

import Kd.C3943a;
import Kd.C3945c;
import Md.C4181g;
import Md.C4182h;
import Md.C4184j;
import Md.C4185k;
import Md.C4186l;
import Md.C4188n;
import Md.C4189o;
import Md.C4192s;
import Md.C4193t;
import Md.C4194u;
import Md.C4195v;
import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.ktx.GoogleMapKt;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import tv.C17154h;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086H¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0000H\u0086H¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\"\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086H¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0004\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u001a\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b!\u0010\u0004\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b\"\u0010\u0004\u001a\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001*\u00020\u0000¢\u0006\u0004\b%\u0010\u0004\u001a\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b&\u0010\u0004\u001a\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0001*\u00020\u0000¢\u0006\u0004\b(\u0010\u0004\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020\u0000¢\u0006\u0004\b*\u0010\u0004\u001a\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0001*\u00020\u0000¢\u0006\u0004\b,\u0010\u0004\u001a\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0001*\u00020\u0000¢\u0006\u0004\b.\u0010\u0004\u001a,\u00103\u001a\u0002002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a0\u00106\u001a\u00020\u0016*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a2\u00109\u001a\u0004\u0018\u00010\u0018*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a2\u0010<\u001a\u0004\u0018\u00010\u001c*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a0\u0010?\u001a\u00020+*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a0\u0010B\u001a\u00020-*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a2\u0010F\u001a\u0004\u0018\u00010E*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"LKd/c;", "Ltv/f;", "Lcom/google/maps/android/ktx/CameraEvent;", "cameraEvents", "(LKd/c;)Ltv/f;", "LKd/a;", "cameraUpdate", "", "durationMs", "", "awaitAnimateCamera", "(LKd/c;LKd/a;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitMapLoad", "(LKd/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cameraIdleEvents", "cameraMoveCanceledEvents", "cameraMoveEvents", "Landroid/graphics/Bitmap;", "bitmap", "awaitSnapshot", "(LKd/c;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cameraMoveStartedEvents", "LMd/g;", "circleClickEvents", "LMd/j;", "groundOverlayClicks", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "indoorStateChangeEvents", "LMd/n;", "infoWindowClickEvents", "infoWindowCloseEvents", "infoWindowLongClickEvents", "Lcom/google/android/gms/maps/model/LatLng;", "mapClickEvents", "mapLongClickEvents", "markerClickEvents", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "markerDragEvents", "myLocationButtonClickEvents", "Landroid/location/Location;", "myLocationClickEvents", "LMd/r;", "poiClickEvents", "LMd/s;", "polygonClickEvents", "LMd/u;", "polylineClickEvents", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "Lkotlin/ExtensionFunctionType;", "optionsActions", "buildGoogleMapOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/GoogleMapOptions;", "LMd/h;", "addCircle", "(LKd/c;Lkotlin/jvm/functions/Function1;)LMd/g;", "LMd/k;", "addGroundOverlay", "(LKd/c;Lkotlin/jvm/functions/Function1;)LMd/j;", "LMd/o;", "addMarker", "(LKd/c;Lkotlin/jvm/functions/Function1;)LMd/n;", "LMd/t;", "addPolygon", "(LKd/c;Lkotlin/jvm/functions/Function1;)LMd/s;", "LMd/v;", "addPolyline", "(LKd/c;Lkotlin/jvm/functions/Function1;)LMd/u;", "LMd/G;", "LMd/F;", "addTileOverlay", "(LKd/c;Lkotlin/jvm/functions/Function1;)LMd/F;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GoogleMapKt {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/maps/android/ktx/CameraEvent;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1", f = "GoogleMap.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<sv.t<? super CameraEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_cameraEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(C3945c c3945c) {
            c3945c.z(null);
            c3945c.A(null);
            c3945c.B(null);
            c3945c.C(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_cameraEvents, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C3945c c3945c, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_cameraEvents = c3945c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar) {
            tVar.k(CameraIdleEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(sv.t tVar) {
            tVar.k(CameraMoveCanceledEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(sv.t tVar) {
            tVar.k(CameraMoveEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(sv.t tVar, int i10) {
            tVar.k(new CameraMoveStartedEvent(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super CameraEvent> tVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_cameraEvents.z(new C3945c.InterfaceC0283c() { // from class: com.google.maps.android.ktx.a
                    @Override // Kd.C3945c.InterfaceC0283c
                    public final void onCameraIdle() {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$0(tVar);
                    }
                });
                this.$this_cameraEvents.A(new C3945c.d() { // from class: com.google.maps.android.ktx.b
                    @Override // Kd.C3945c.d
                    public final void a() {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$1(tVar);
                    }
                });
                this.$this_cameraEvents.B(new C3945c.e() { // from class: com.google.maps.android.ktx.c
                    @Override // Kd.C3945c.e
                    public final void a() {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$2(tVar);
                    }
                });
                this.$this_cameraEvents.C(new C3945c.f() { // from class: com.google.maps.android.ktx.d
                    @Override // Kd.C3945c.f
                    public final void a(int i11) {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$3(tVar, i11);
                    }
                });
                final C3945c c3945c = this.$this_cameraEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$4(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsv/t;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1", f = "GoogleMap.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114691 extends SuspendLambda implements Function2<sv.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_cameraIdleEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.z(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114691 c114691 = new C114691(this.$this_cameraIdleEvents, continuation);
            c114691.L$0 = obj;
            return c114691;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114691(C3945c c3945c, Continuation<? super C114691> continuation) {
            super(2, continuation);
            this.$this_cameraIdleEvents = c3945c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar) {
            tVar.k(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C114691) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_cameraIdleEvents.z(new C3945c.InterfaceC0283c() { // from class: com.google.maps.android.ktx.f
                    @Override // Kd.C3945c.InterfaceC0283c
                    public final void onCameraIdle() {
                        GoogleMapKt.C114691.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C3945c c3945c = this.$this_cameraIdleEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114691.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsv/t;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1", f = "GoogleMap.kt", l = {176}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114701 extends SuspendLambda implements Function2<sv.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_cameraMoveCanceledEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.A(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114701 c114701 = new C114701(this.$this_cameraMoveCanceledEvents, continuation);
            c114701.L$0 = obj;
            return c114701;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114701(C3945c c3945c, Continuation<? super C114701> continuation) {
            super(2, continuation);
            this.$this_cameraMoveCanceledEvents = c3945c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar) {
            tVar.k(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C114701) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_cameraMoveCanceledEvents.A(new C3945c.d() { // from class: com.google.maps.android.ktx.h
                    @Override // Kd.C3945c.d
                    public final void a() {
                        GoogleMapKt.C114701.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C3945c c3945c = this.$this_cameraMoveCanceledEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114701.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsv/t;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1", f = "GoogleMap.kt", l = {190}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114711 extends SuspendLambda implements Function2<sv.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_cameraMoveEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.B(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114711 c114711 = new C114711(this.$this_cameraMoveEvents, continuation);
            c114711.L$0 = obj;
            return c114711;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114711(C3945c c3945c, Continuation<? super C114711> continuation) {
            super(2, continuation);
            this.$this_cameraMoveEvents = c3945c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar) {
            tVar.k(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C114711) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_cameraMoveEvents.B(new C3945c.e() { // from class: com.google.maps.android.ktx.j
                    @Override // Kd.C3945c.e
                    public final void a() {
                        GoogleMapKt.C114711.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C3945c c3945c = this.$this_cameraMoveEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114711.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1", f = "GoogleMap.kt", l = {216}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114721 extends SuspendLambda implements Function2<sv.t<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_cameraMoveStartedEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.C(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114721 c114721 = new C114721(this.$this_cameraMoveStartedEvents, continuation);
            c114721.L$0 = obj;
            return c114721;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114721(C3945c c3945c, Continuation<? super C114721> continuation) {
            super(2, continuation);
            this.$this_cameraMoveStartedEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Integer> tVar, Continuation<? super Unit> continuation) {
            return ((C114721) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, int i10) {
            tVar.k(Integer.valueOf(i10));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_cameraMoveStartedEvents.C(new C3945c.f() { // from class: com.google.maps.android.ktx.l
                    @Override // Kd.C3945c.f
                    public final void a(int i11) {
                        GoogleMapKt.C114721.invokeSuspend$lambda$0(tVar, i11);
                    }
                });
                final C3945c c3945c = this.$this_cameraMoveStartedEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114721.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/g;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1", f = "GoogleMap.kt", l = {230}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114731 extends SuspendLambda implements Function2<sv.t<? super C4181g>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_circleClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.D(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114731 c114731 = new C114731(this.$this_circleClickEvents, continuation);
            c114731.L$0 = obj;
            return c114731;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114731(C3945c c3945c, Continuation<? super C114731> continuation) {
            super(2, continuation);
            this.$this_circleClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4181g> tVar, Continuation<? super Unit> continuation) {
            return ((C114731) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, C4181g c4181g) {
            Intrinsics.g(c4181g);
            tVar.k(c4181g);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_circleClickEvents.D(new C3945c.g() { // from class: com.google.maps.android.ktx.n
                    @Override // Kd.C3945c.g
                    public final void onCircleClick(C4181g c4181g) {
                        GoogleMapKt.C114731.invokeSuspend$lambda$0(tVar, c4181g);
                    }
                });
                final C3945c c3945c = this.$this_circleClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114731.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/j;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1", f = "GoogleMap.kt", l = {245}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1, reason: invalid class name and case insensitive filesystem */
    static final class C114741 extends SuspendLambda implements Function2<sv.t<? super C4184j>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_groundOverlayClicks;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.E(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114741 c114741 = new C114741(this.$this_groundOverlayClicks, continuation);
            c114741.L$0 = obj;
            return c114741;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114741(C3945c c3945c, Continuation<? super C114741> continuation) {
            super(2, continuation);
            this.$this_groundOverlayClicks = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4184j> tVar, Continuation<? super Unit> continuation) {
            return ((C114741) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, C4184j c4184j) {
            Intrinsics.g(c4184j);
            tVar.k(c4184j);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_groundOverlayClicks.E(new C3945c.h() { // from class: com.google.maps.android.ktx.p
                    @Override // Kd.C3945c.h
                    public final void onGroundOverlayClick(C4184j c4184j) {
                        GoogleMapKt.C114741.invokeSuspend$lambda$0(tVar, c4184j);
                    }
                });
                final C3945c c3945c = this.$this_groundOverlayClicks;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114741.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1", f = "GoogleMap.kt", l = {266}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114751 extends SuspendLambda implements Function2<sv.t<? super IndoorChangeEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_indoorStateChangeEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C3945c c3945c) {
            c3945c.F(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114751 c114751 = new C114751(this.$this_indoorStateChangeEvents, continuation);
            c114751.L$0 = obj;
            return c114751;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114751(C3945c c3945c, Continuation<? super C114751> continuation) {
            super(2, continuation);
            this.$this_indoorStateChangeEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super IndoorChangeEvent> tVar, Continuation<? super Unit> continuation) {
            return ((C114751) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_indoorStateChangeEvents.F(new C3945c.i() { // from class: com.google.maps.android.ktx.GoogleMapKt.indoorStateChangeEvents.1.1
                    @Override // Kd.C3945c.i
                    public void onIndoorBuildingFocused() {
                        tVar.k(IndoorBuildingFocusedEvent.INSTANCE);
                    }

                    @Override // Kd.C3945c.i
                    public void onIndoorLevelActivated(C4186l indoorBuilding) {
                        Intrinsics.j(indoorBuilding, "indoorBuilding");
                        tVar.k(new IndoorLevelActivatedEvent(indoorBuilding));
                    }
                });
                final C3945c c3945c = this.$this_indoorStateChangeEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114751.invokeSuspend$lambda$0(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/n;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1", f = "GoogleMap.kt", l = {281}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114761 extends SuspendLambda implements Function2<sv.t<? super C4188n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_infoWindowClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.G(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114761 c114761 = new C114761(this.$this_infoWindowClickEvents, continuation);
            c114761.L$0 = obj;
            return c114761;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114761(C3945c c3945c, Continuation<? super C114761> continuation) {
            super(2, continuation);
            this.$this_infoWindowClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4188n> tVar, Continuation<? super Unit> continuation) {
            return ((C114761) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, C4188n c4188n) {
            Intrinsics.g(c4188n);
            tVar.k(c4188n);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_infoWindowClickEvents.G(new C3945c.j() { // from class: com.google.maps.android.ktx.s
                    @Override // Kd.C3945c.j
                    public final void onInfoWindowClick(C4188n c4188n) {
                        GoogleMapKt.C114761.invokeSuspend$lambda$0(tVar, c4188n);
                    }
                });
                final C3945c c3945c = this.$this_infoWindowClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114761.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/n;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1", f = "GoogleMap.kt", l = {296}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114771 extends SuspendLambda implements Function2<sv.t<? super C4188n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_infoWindowCloseEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.H(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114771 c114771 = new C114771(this.$this_infoWindowCloseEvents, continuation);
            c114771.L$0 = obj;
            return c114771;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114771(C3945c c3945c, Continuation<? super C114771> continuation) {
            super(2, continuation);
            this.$this_infoWindowCloseEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4188n> tVar, Continuation<? super Unit> continuation) {
            return ((C114771) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, C4188n c4188n) {
            Intrinsics.g(c4188n);
            tVar.k(c4188n);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_infoWindowCloseEvents.H(new C3945c.k() { // from class: com.google.maps.android.ktx.u
                    @Override // Kd.C3945c.k
                    public final void a(C4188n c4188n) {
                        GoogleMapKt.C114771.invokeSuspend$lambda$0(tVar, c4188n);
                    }
                });
                final C3945c c3945c = this.$this_infoWindowCloseEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114771.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/n;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1", f = "GoogleMap.kt", l = {311}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114781 extends SuspendLambda implements Function2<sv.t<? super C4188n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_infoWindowLongClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.I(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114781 c114781 = new C114781(this.$this_infoWindowLongClickEvents, continuation);
            c114781.L$0 = obj;
            return c114781;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114781(C3945c c3945c, Continuation<? super C114781> continuation) {
            super(2, continuation);
            this.$this_infoWindowLongClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4188n> tVar, Continuation<? super Unit> continuation) {
            return ((C114781) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, C4188n c4188n) {
            Intrinsics.g(c4188n);
            tVar.k(c4188n);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_infoWindowLongClickEvents.I(new C3945c.l() { // from class: com.google.maps.android.ktx.w
                    @Override // Kd.C3945c.l
                    public final void onInfoWindowLongClick(C4188n c4188n) {
                        GoogleMapKt.C114781.invokeSuspend$lambda$0(tVar, c4188n);
                    }
                });
                final C3945c c3945c = this.$this_infoWindowLongClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114781.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/android/gms/maps/model/LatLng;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1", f = "GoogleMap.kt", l = {325}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114791 extends SuspendLambda implements Function2<sv.t<? super LatLng>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_mapClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.J(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114791 c114791 = new C114791(this.$this_mapClickEvents, continuation);
            c114791.L$0 = obj;
            return c114791;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114791(C3945c c3945c, Continuation<? super C114791> continuation) {
            super(2, continuation);
            this.$this_mapClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super LatLng> tVar, Continuation<? super Unit> continuation) {
            return ((C114791) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, LatLng latLng) {
            Intrinsics.g(latLng);
            tVar.k(latLng);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_mapClickEvents.J(new C3945c.m() { // from class: com.google.maps.android.ktx.y
                    @Override // Kd.C3945c.m
                    public final void a(LatLng latLng) {
                        GoogleMapKt.C114791.invokeSuspend$lambda$0(tVar, latLng);
                    }
                });
                final C3945c c3945c = this.$this_mapClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114791.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/android/gms/maps/model/LatLng;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1", f = "GoogleMap.kt", l = {339}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114801 extends SuspendLambda implements Function2<sv.t<? super LatLng>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_mapLongClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.L(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114801 c114801 = new C114801(this.$this_mapLongClickEvents, continuation);
            c114801.L$0 = obj;
            return c114801;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114801(C3945c c3945c, Continuation<? super C114801> continuation) {
            super(2, continuation);
            this.$this_mapLongClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super LatLng> tVar, Continuation<? super Unit> continuation) {
            return ((C114801) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, LatLng latLng) {
            Intrinsics.g(latLng);
            tVar.k(latLng);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_mapLongClickEvents.L(new C3945c.o() { // from class: com.google.maps.android.ktx.A
                    @Override // Kd.C3945c.o
                    public final void a(LatLng latLng) {
                        GoogleMapKt.C114801.invokeSuspend$lambda$0(tVar, latLng);
                    }
                });
                final C3945c c3945c = this.$this_mapLongClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114801.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/n;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1", f = "GoogleMap.kt", l = {353}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114811 extends SuspendLambda implements Function2<sv.t<? super C4188n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_markerClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.M(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114811 c114811 = new C114811(this.$this_markerClickEvents, continuation);
            c114811.L$0 = obj;
            return c114811;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114811(C3945c c3945c, Continuation<? super C114811> continuation) {
            super(2, continuation);
            this.$this_markerClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4188n> tVar, Continuation<? super Unit> continuation) {
            return ((C114811) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(sv.t tVar, C4188n c4188n) {
            Intrinsics.g(c4188n);
            return sv.k.i(tVar.k(c4188n));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_markerClickEvents.M(new C3945c.p() { // from class: com.google.maps.android.ktx.C
                    @Override // Kd.C3945c.p
                    public final boolean onMarkerClick(C4188n c4188n) {
                        return GoogleMapKt.C114811.invokeSuspend$lambda$0(tVar, c4188n);
                    }
                });
                final C3945c c3945c = this.$this_markerClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114811.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1", f = "GoogleMap.kt", l = {378}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114821 extends SuspendLambda implements Function2<sv.t<? super OnMarkerDragEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_markerDragEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C3945c c3945c) {
            c3945c.N(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114821 c114821 = new C114821(this.$this_markerDragEvents, continuation);
            c114821.L$0 = obj;
            return c114821;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114821(C3945c c3945c, Continuation<? super C114821> continuation) {
            super(2, continuation);
            this.$this_markerDragEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super OnMarkerDragEvent> tVar, Continuation<? super Unit> continuation) {
            return ((C114821) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_markerDragEvents.N(new C3945c.q() { // from class: com.google.maps.android.ktx.GoogleMapKt.markerDragEvents.1.1
                    @Override // Kd.C3945c.q
                    public void onMarkerDrag(C4188n marker) {
                        Intrinsics.j(marker, "marker");
                        tVar.k(new MarkerDragEvent(marker));
                    }

                    @Override // Kd.C3945c.q
                    public void onMarkerDragEnd(C4188n marker) {
                        Intrinsics.j(marker, "marker");
                        tVar.k(new MarkerDragEndEvent(marker));
                    }

                    @Override // Kd.C3945c.q
                    public void onMarkerDragStart(C4188n marker) {
                        Intrinsics.j(marker, "marker");
                        tVar.k(new MarkerDragStartEvent(marker));
                    }
                });
                final C3945c c3945c = this.$this_markerDragEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.E
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114821.invokeSuspend$lambda$0(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsv/t;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1", f = "GoogleMap.kt", l = {393}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114831 extends SuspendLambda implements Function2<sv.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_myLocationButtonClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.O(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114831 c114831 = new C114831(this.$this_myLocationButtonClickEvents, continuation);
            c114831.L$0 = obj;
            return c114831;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114831(C3945c c3945c, Continuation<? super C114831> continuation) {
            super(2, continuation);
            this.$this_myLocationButtonClickEvents = c3945c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(sv.t tVar) {
            return sv.k.i(tVar.k(Unit.f142422a));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C114831) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_myLocationButtonClickEvents.O(new C3945c.r() { // from class: com.google.maps.android.ktx.F
                    @Override // Kd.C3945c.r
                    public final boolean a() {
                        return GoogleMapKt.C114831.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C3945c c3945c = this.$this_myLocationButtonClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114831.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Landroid/location/Location;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1", f = "GoogleMap.kt", l = {HttpResponseStatus.ERROR_REQUEST_TIMEOUT}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114841 extends SuspendLambda implements Function2<sv.t<? super Location>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_myLocationClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.P(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114841 c114841 = new C114841(this.$this_myLocationClickEvents, continuation);
            c114841.L$0 = obj;
            return c114841;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114841(C3945c c3945c, Continuation<? super C114841> continuation) {
            super(2, continuation);
            this.$this_myLocationClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Location> tVar, Continuation<? super Unit> continuation) {
            return ((C114841) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, Location location) {
            Intrinsics.g(location);
            tVar.k(location);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_myLocationClickEvents.P(new C3945c.s() { // from class: com.google.maps.android.ktx.H
                    @Override // Kd.C3945c.s
                    public final void a(Location location) {
                        GoogleMapKt.C114841.invokeSuspend$lambda$0(tVar, location);
                    }
                });
                final C3945c c3945c = this.$this_myLocationClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114841.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/r;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1", f = "GoogleMap.kt", l = {423}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114851 extends SuspendLambda implements Function2<sv.t<? super Md.r>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_poiClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.Q(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114851 c114851 = new C114851(this.$this_poiClickEvents, continuation);
            c114851.L$0 = obj;
            return c114851;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114851(C3945c c3945c, Continuation<? super C114851> continuation) {
            super(2, continuation);
            this.$this_poiClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Md.r> tVar, Continuation<? super Unit> continuation) {
            return ((C114851) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, Md.r rVar) {
            Intrinsics.g(rVar);
            tVar.k(rVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_poiClickEvents.Q(new C3945c.t() { // from class: com.google.maps.android.ktx.J
                    @Override // Kd.C3945c.t
                    public final void a(Md.r rVar) {
                        GoogleMapKt.C114851.invokeSuspend$lambda$0(tVar, rVar);
                    }
                });
                final C3945c c3945c = this.$this_poiClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114851.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/s;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1", f = "GoogleMap.kt", l = {437}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114861 extends SuspendLambda implements Function2<sv.t<? super C4192s>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_polygonClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.R(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114861 c114861 = new C114861(this.$this_polygonClickEvents, continuation);
            c114861.L$0 = obj;
            return c114861;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114861(C3945c c3945c, Continuation<? super C114861> continuation) {
            super(2, continuation);
            this.$this_polygonClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4192s> tVar, Continuation<? super Unit> continuation) {
            return ((C114861) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, C4192s c4192s) {
            Intrinsics.g(c4192s);
            tVar.k(c4192s);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_polygonClickEvents.R(new C3945c.u() { // from class: com.google.maps.android.ktx.L
                    @Override // Kd.C3945c.u
                    public final void onPolygonClick(C4192s c4192s) {
                        GoogleMapKt.C114861.invokeSuspend$lambda$0(tVar, c4192s);
                    }
                });
                final C3945c c3945c = this.$this_polygonClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114861.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/u;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1", f = "GoogleMap.kt", l = {451}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114871 extends SuspendLambda implements Function2<sv.t<? super C4194u>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3945c $this_polylineClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3945c c3945c) {
            c3945c.S(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114871 c114871 = new C114871(this.$this_polylineClickEvents, continuation);
            c114871.L$0 = obj;
            return c114871;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114871(C3945c c3945c, Continuation<? super C114871> continuation) {
            super(2, continuation);
            this.$this_polylineClickEvents = c3945c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super C4194u> tVar, Continuation<? super Unit> continuation) {
            return ((C114871) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, C4194u c4194u) {
            Intrinsics.g(c4194u);
            tVar.k(c4194u);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final sv.t tVar = (sv.t) this.L$0;
                this.$this_polylineClickEvents.S(new C3945c.v() { // from class: com.google.maps.android.ktx.N
                    @Override // Kd.C3945c.v
                    public final void onPolylineClick(C4194u c4194u) {
                        GoogleMapKt.C114871.invokeSuspend$lambda$0(tVar, c4194u);
                    }
                });
                final C3945c c3945c = this.$this_polylineClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C114871.invokeSuspend$lambda$1(c3945c);
                    }
                };
                this.label = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    private static final Object awaitAnimateCamera$$forInline(C3945c c3945c, C3943a c3943a, int i10, Continuation<? super Unit> continuation) {
        InlineMarker.c(0);
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        c3945c.g(c3943a, i10, new GoogleMapKt$awaitAnimateCamera$2$1(c16658p));
        Unit unit = Unit.f142422a;
        if (c16658p.v() == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return Unit.f142422a;
    }

    private static final Object awaitMapLoad$$forInline(C3945c c3945c, Continuation<? super Unit> continuation) {
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c3945c.K(new GoogleMapKt$awaitMapLoad$2$1(safeContinuation));
        Unit unit = Unit.f142422a;
        if (safeContinuation.b() == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return Unit.f142422a;
    }

    private static final Object awaitSnapshot$$forInline(C3945c c3945c, Bitmap bitmap, Continuation<? super Bitmap> continuation) {
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c3945c.V(new GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        Unit unit = Unit.f142422a;
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objB;
    }

    public static /* synthetic */ Object awaitSnapshot$default(C3945c c3945c, Bitmap bitmap, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = null;
        }
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c3945c.V(new GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objB;
    }

    public static final C4181g addCircle(C3945c c3945c, Function1<? super C4182h, Unit> optionsActions) {
        Intrinsics.j(c3945c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4182h c4182h = new C4182h();
        optionsActions.invoke(c4182h);
        C4181g c4181gA = c3945c.a(c4182h);
        Intrinsics.i(c4181gA, "addCircle(...)");
        return c4181gA;
    }

    public static final C4184j addGroundOverlay(C3945c c3945c, Function1<? super C4185k, Unit> optionsActions) {
        Intrinsics.j(c3945c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4185k c4185k = new C4185k();
        optionsActions.invoke(c4185k);
        return c3945c.b(c4185k);
    }

    public static final C4188n addMarker(C3945c c3945c, Function1<? super C4189o, Unit> optionsActions) {
        Intrinsics.j(c3945c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4189o c4189o = new C4189o();
        optionsActions.invoke(c4189o);
        return c3945c.c(c4189o);
    }

    public static final C4192s addPolygon(C3945c c3945c, Function1<? super C4193t, Unit> optionsActions) {
        Intrinsics.j(c3945c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4193t c4193t = new C4193t();
        optionsActions.invoke(c4193t);
        C4192s c4192sD = c3945c.d(c4193t);
        Intrinsics.i(c4192sD, "addPolygon(...)");
        return c4192sD;
    }

    public static final C4194u addPolyline(C3945c c3945c, Function1<? super C4195v, Unit> optionsActions) {
        Intrinsics.j(c3945c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4195v c4195v = new C4195v();
        optionsActions.invoke(c4195v);
        C4194u c4194uE = c3945c.e(c4195v);
        Intrinsics.i(c4194uE, "addPolyline(...)");
        return c4194uE;
    }

    public static final Md.F addTileOverlay(C3945c c3945c, Function1<? super Md.G, Unit> optionsActions) {
        Intrinsics.j(c3945c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        Md.G g10 = new Md.G();
        optionsActions.invoke(g10);
        return c3945c.f(g10);
    }

    public static final Object awaitAnimateCamera(C3945c c3945c, C3943a c3943a, int i10, Continuation<? super Unit> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        c3945c.g(c3943a, i10, new GoogleMapKt$awaitAnimateCamera$2$1(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
    }

    public static /* synthetic */ Object awaitAnimateCamera$default(C3945c c3945c, C3943a c3943a, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 3000;
        }
        InlineMarker.c(0);
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        c3945c.g(c3943a, i10, new GoogleMapKt$awaitAnimateCamera$2$1(c16658p));
        if (c16658p.v() == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return Unit.f142422a;
    }

    public static final Object awaitMapLoad(C3945c c3945c, Continuation<? super Unit> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c3945c.K(new GoogleMapKt$awaitMapLoad$2$1(safeContinuation));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB == IntrinsicsKt.f() ? objB : Unit.f142422a;
    }

    public static final Object awaitSnapshot(C3945c c3945c, Bitmap bitmap, Continuation<? super Bitmap> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c3945c.V(new GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }

    public static final GoogleMapOptions buildGoogleMapOptions(Function1<? super GoogleMapOptions, Unit> optionsActions) {
        Intrinsics.j(optionsActions, "optionsActions");
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        optionsActions.invoke(googleMapOptions);
        return googleMapOptions;
    }

    @Deprecated
    public static final InterfaceC17152f<CameraEvent> cameraEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new AnonymousClass1(c3945c, null));
    }

    public static final InterfaceC17152f<Unit> cameraIdleEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114691(c3945c, null));
    }

    public static final InterfaceC17152f<Unit> cameraMoveCanceledEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114701(c3945c, null));
    }

    public static final InterfaceC17152f<Unit> cameraMoveEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114711(c3945c, null));
    }

    public static final InterfaceC17152f<Integer> cameraMoveStartedEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114721(c3945c, null));
    }

    public static final InterfaceC17152f<C4181g> circleClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114731(c3945c, null));
    }

    public static final InterfaceC17152f<C4184j> groundOverlayClicks(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114741(c3945c, null));
    }

    public static final InterfaceC17152f<IndoorChangeEvent> indoorStateChangeEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114751(c3945c, null));
    }

    public static final InterfaceC17152f<C4188n> infoWindowClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114761(c3945c, null));
    }

    public static final InterfaceC17152f<C4188n> infoWindowCloseEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114771(c3945c, null));
    }

    public static final InterfaceC17152f<C4188n> infoWindowLongClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114781(c3945c, null));
    }

    public static final InterfaceC17152f<LatLng> mapClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114791(c3945c, null));
    }

    public static final InterfaceC17152f<LatLng> mapLongClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114801(c3945c, null));
    }

    public static final InterfaceC17152f<C4188n> markerClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114811(c3945c, null));
    }

    public static final InterfaceC17152f<OnMarkerDragEvent> markerDragEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114821(c3945c, null));
    }

    public static final InterfaceC17152f<Unit> myLocationButtonClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114831(c3945c, null));
    }

    public static final InterfaceC17152f<Location> myLocationClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114841(c3945c, null));
    }

    public static final InterfaceC17152f<Md.r> poiClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114851(c3945c, null));
    }

    public static final InterfaceC17152f<C4192s> polygonClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114861(c3945c, null));
    }

    public static final InterfaceC17152f<C4194u> polylineClickEvents(C3945c c3945c) {
        Intrinsics.j(c3945c, "<this>");
        return C17154h.f(new C114871(c3945c, null));
    }
}
