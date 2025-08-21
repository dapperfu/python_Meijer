package com.google.maps.android.ktx;

import Md.C4108a;
import Md.C4110c;
import Od.C4459g;
import Od.C4460h;
import Od.C4462j;
import Od.C4463k;
import Od.C4464l;
import Od.C4466n;
import Od.C4467o;
import Od.C4470s;
import Od.C4471t;
import Od.C4472u;
import Od.C4473v;
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
import mv.C15819p;
import pv.C16563h;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086H¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0000H\u0086H¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\"\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086H¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0004\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u001a\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b!\u0010\u0004\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b\"\u0010\u0004\u001a\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001*\u00020\u0000¢\u0006\u0004\b%\u0010\u0004\u001a\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b&\u0010\u0004\u001a\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0001*\u00020\u0000¢\u0006\u0004\b(\u0010\u0004\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020\u0000¢\u0006\u0004\b*\u0010\u0004\u001a\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0001*\u00020\u0000¢\u0006\u0004\b,\u0010\u0004\u001a\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0001*\u00020\u0000¢\u0006\u0004\b.\u0010\u0004\u001a,\u00103\u001a\u0002002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a0\u00106\u001a\u00020\u0016*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a2\u00109\u001a\u0004\u0018\u00010\u0018*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a2\u0010<\u001a\u0004\u0018\u00010\u001c*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a0\u0010?\u001a\u00020+*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a0\u0010B\u001a\u00020-*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a2\u0010F\u001a\u0004\u0018\u00010E*\u00020\u00002\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\bø\u0001\u0000¢\u0006\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"LMd/c;", "Lpv/f;", "Lcom/google/maps/android/ktx/CameraEvent;", "cameraEvents", "(LMd/c;)Lpv/f;", "LMd/a;", "cameraUpdate", "", "durationMs", "", "awaitAnimateCamera", "(LMd/c;LMd/a;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitMapLoad", "(LMd/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cameraIdleEvents", "cameraMoveCanceledEvents", "cameraMoveEvents", "Landroid/graphics/Bitmap;", "bitmap", "awaitSnapshot", "(LMd/c;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cameraMoveStartedEvents", "LOd/g;", "circleClickEvents", "LOd/j;", "groundOverlayClicks", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "indoorStateChangeEvents", "LOd/n;", "infoWindowClickEvents", "infoWindowCloseEvents", "infoWindowLongClickEvents", "Lcom/google/android/gms/maps/model/LatLng;", "mapClickEvents", "mapLongClickEvents", "markerClickEvents", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "markerDragEvents", "myLocationButtonClickEvents", "Landroid/location/Location;", "myLocationClickEvents", "LOd/r;", "poiClickEvents", "LOd/s;", "polygonClickEvents", "LOd/u;", "polylineClickEvents", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "Lkotlin/ExtensionFunctionType;", "optionsActions", "buildGoogleMapOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/GoogleMapOptions;", "LOd/h;", "addCircle", "(LMd/c;Lkotlin/jvm/functions/Function1;)LOd/g;", "LOd/k;", "addGroundOverlay", "(LMd/c;Lkotlin/jvm/functions/Function1;)LOd/j;", "LOd/o;", "addMarker", "(LMd/c;Lkotlin/jvm/functions/Function1;)LOd/n;", "LOd/t;", "addPolygon", "(LMd/c;Lkotlin/jvm/functions/Function1;)LOd/s;", "LOd/v;", "addPolyline", "(LMd/c;Lkotlin/jvm/functions/Function1;)LOd/u;", "LOd/G;", "LOd/F;", "addTileOverlay", "(LMd/c;Lkotlin/jvm/functions/Function1;)LOd/F;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GoogleMapKt {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "Lcom/google/maps/android/ktx/CameraEvent;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1", f = "GoogleMap.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ov.t<? super CameraEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_cameraEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(C4110c c4110c) {
            c4110c.z(null);
            c4110c.A(null);
            c4110c.B(null);
            c4110c.C(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_cameraEvents, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C4110c c4110c, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_cameraEvents = c4110c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar) {
            tVar.k(CameraIdleEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(ov.t tVar) {
            tVar.k(CameraMoveCanceledEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(ov.t tVar) {
            tVar.k(CameraMoveEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(ov.t tVar, int i10) {
            tVar.k(new CameraMoveStartedEvent(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super CameraEvent> tVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_cameraEvents.z(new C4110c.InterfaceC0346c() { // from class: com.google.maps.android.ktx.a
                    @Override // Md.C4110c.InterfaceC0346c
                    public final void onCameraIdle() {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$0(tVar);
                    }
                });
                this.$this_cameraEvents.A(new C4110c.d() { // from class: com.google.maps.android.ktx.b
                    @Override // Md.C4110c.d
                    public final void a() {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$1(tVar);
                    }
                });
                this.$this_cameraEvents.B(new C4110c.e() { // from class: com.google.maps.android.ktx.c
                    @Override // Md.C4110c.e
                    public final void a() {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$2(tVar);
                    }
                });
                this.$this_cameraEvents.C(new C4110c.f() { // from class: com.google.maps.android.ktx.d
                    @Override // Md.C4110c.f
                    public final void a(int i11) {
                        GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$3(tVar, i11);
                    }
                });
                final C4110c c4110c = this.$this_cameraEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$4(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lov/t;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1", f = "GoogleMap.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C115941 extends SuspendLambda implements Function2<ov.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_cameraIdleEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.z(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115941 c115941 = new C115941(this.$this_cameraIdleEvents, continuation);
            c115941.L$0 = obj;
            return c115941;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115941(C4110c c4110c, Continuation<? super C115941> continuation) {
            super(2, continuation);
            this.$this_cameraIdleEvents = c4110c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar) {
            tVar.k(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C115941) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_cameraIdleEvents.z(new C4110c.InterfaceC0346c() { // from class: com.google.maps.android.ktx.f
                    @Override // Md.C4110c.InterfaceC0346c
                    public final void onCameraIdle() {
                        GoogleMapKt.C115941.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C4110c c4110c = this.$this_cameraIdleEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C115941.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lov/t;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1", f = "GoogleMap.kt", l = {176}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C115951 extends SuspendLambda implements Function2<ov.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_cameraMoveCanceledEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.A(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115951 c115951 = new C115951(this.$this_cameraMoveCanceledEvents, continuation);
            c115951.L$0 = obj;
            return c115951;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115951(C4110c c4110c, Continuation<? super C115951> continuation) {
            super(2, continuation);
            this.$this_cameraMoveCanceledEvents = c4110c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar) {
            tVar.k(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C115951) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_cameraMoveCanceledEvents.A(new C4110c.d() { // from class: com.google.maps.android.ktx.h
                    @Override // Md.C4110c.d
                    public final void a() {
                        GoogleMapKt.C115951.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C4110c c4110c = this.$this_cameraMoveCanceledEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C115951.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lov/t;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1", f = "GoogleMap.kt", l = {190}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C115961 extends SuspendLambda implements Function2<ov.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_cameraMoveEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.B(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115961 c115961 = new C115961(this.$this_cameraMoveEvents, continuation);
            c115961.L$0 = obj;
            return c115961;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115961(C4110c c4110c, Continuation<? super C115961> continuation) {
            super(2, continuation);
            this.$this_cameraMoveEvents = c4110c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar) {
            tVar.k(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C115961) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_cameraMoveEvents.B(new C4110c.e() { // from class: com.google.maps.android.ktx.j
                    @Override // Md.C4110c.e
                    public final void a() {
                        GoogleMapKt.C115961.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C4110c c4110c = this.$this_cameraMoveEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C115961.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1", f = "GoogleMap.kt", l = {216}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C115971 extends SuspendLambda implements Function2<ov.t<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_cameraMoveStartedEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.C(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115971 c115971 = new C115971(this.$this_cameraMoveStartedEvents, continuation);
            c115971.L$0 = obj;
            return c115971;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115971(C4110c c4110c, Continuation<? super C115971> continuation) {
            super(2, continuation);
            this.$this_cameraMoveStartedEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Integer> tVar, Continuation<? super Unit> continuation) {
            return ((C115971) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, int i10) {
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_cameraMoveStartedEvents.C(new C4110c.f() { // from class: com.google.maps.android.ktx.l
                    @Override // Md.C4110c.f
                    public final void a(int i11) {
                        GoogleMapKt.C115971.invokeSuspend$lambda$0(tVar, i11);
                    }
                });
                final C4110c c4110c = this.$this_cameraMoveStartedEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C115971.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/g;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1", f = "GoogleMap.kt", l = {230}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C115981 extends SuspendLambda implements Function2<ov.t<? super C4459g>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_circleClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.D(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115981 c115981 = new C115981(this.$this_circleClickEvents, continuation);
            c115981.L$0 = obj;
            return c115981;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115981(C4110c c4110c, Continuation<? super C115981> continuation) {
            super(2, continuation);
            this.$this_circleClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4459g> tVar, Continuation<? super Unit> continuation) {
            return ((C115981) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, C4459g c4459g) {
            Intrinsics.g(c4459g);
            tVar.k(c4459g);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_circleClickEvents.D(new C4110c.g() { // from class: com.google.maps.android.ktx.n
                    @Override // Md.C4110c.g
                    public final void onCircleClick(C4459g c4459g) {
                        GoogleMapKt.C115981.invokeSuspend$lambda$0(tVar, c4459g);
                    }
                });
                final C4110c c4110c = this.$this_circleClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C115981.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/j;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1", f = "GoogleMap.kt", l = {245}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1, reason: invalid class name and case insensitive filesystem */
    static final class C115991 extends SuspendLambda implements Function2<ov.t<? super C4462j>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_groundOverlayClicks;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.E(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115991 c115991 = new C115991(this.$this_groundOverlayClicks, continuation);
            c115991.L$0 = obj;
            return c115991;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C115991(C4110c c4110c, Continuation<? super C115991> continuation) {
            super(2, continuation);
            this.$this_groundOverlayClicks = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4462j> tVar, Continuation<? super Unit> continuation) {
            return ((C115991) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, C4462j c4462j) {
            Intrinsics.g(c4462j);
            tVar.k(c4462j);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_groundOverlayClicks.E(new C4110c.h() { // from class: com.google.maps.android.ktx.p
                    @Override // Md.C4110c.h
                    public final void onGroundOverlayClick(C4462j c4462j) {
                        GoogleMapKt.C115991.invokeSuspend$lambda$0(tVar, c4462j);
                    }
                });
                final C4110c c4110c = this.$this_groundOverlayClicks;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C115991.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1", f = "GoogleMap.kt", l = {266}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116001 extends SuspendLambda implements Function2<ov.t<? super IndoorChangeEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_indoorStateChangeEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C4110c c4110c) {
            c4110c.F(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116001 c116001 = new C116001(this.$this_indoorStateChangeEvents, continuation);
            c116001.L$0 = obj;
            return c116001;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116001(C4110c c4110c, Continuation<? super C116001> continuation) {
            super(2, continuation);
            this.$this_indoorStateChangeEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super IndoorChangeEvent> tVar, Continuation<? super Unit> continuation) {
            return ((C116001) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_indoorStateChangeEvents.F(new C4110c.i() { // from class: com.google.maps.android.ktx.GoogleMapKt.indoorStateChangeEvents.1.1
                    @Override // Md.C4110c.i
                    public void onIndoorBuildingFocused() {
                        tVar.k(IndoorBuildingFocusedEvent.INSTANCE);
                    }

                    @Override // Md.C4110c.i
                    public void onIndoorLevelActivated(C4464l indoorBuilding) {
                        Intrinsics.j(indoorBuilding, "indoorBuilding");
                        tVar.k(new IndoorLevelActivatedEvent(indoorBuilding));
                    }
                });
                final C4110c c4110c = this.$this_indoorStateChangeEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116001.invokeSuspend$lambda$0(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/n;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1", f = "GoogleMap.kt", l = {281}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116011 extends SuspendLambda implements Function2<ov.t<? super C4466n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_infoWindowClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.G(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116011 c116011 = new C116011(this.$this_infoWindowClickEvents, continuation);
            c116011.L$0 = obj;
            return c116011;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116011(C4110c c4110c, Continuation<? super C116011> continuation) {
            super(2, continuation);
            this.$this_infoWindowClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4466n> tVar, Continuation<? super Unit> continuation) {
            return ((C116011) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, C4466n c4466n) {
            Intrinsics.g(c4466n);
            tVar.k(c4466n);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_infoWindowClickEvents.G(new C4110c.j() { // from class: com.google.maps.android.ktx.s
                    @Override // Md.C4110c.j
                    public final void onInfoWindowClick(C4466n c4466n) {
                        GoogleMapKt.C116011.invokeSuspend$lambda$0(tVar, c4466n);
                    }
                });
                final C4110c c4110c = this.$this_infoWindowClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116011.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/n;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1", f = "GoogleMap.kt", l = {296}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116021 extends SuspendLambda implements Function2<ov.t<? super C4466n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_infoWindowCloseEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.H(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116021 c116021 = new C116021(this.$this_infoWindowCloseEvents, continuation);
            c116021.L$0 = obj;
            return c116021;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116021(C4110c c4110c, Continuation<? super C116021> continuation) {
            super(2, continuation);
            this.$this_infoWindowCloseEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4466n> tVar, Continuation<? super Unit> continuation) {
            return ((C116021) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, C4466n c4466n) {
            Intrinsics.g(c4466n);
            tVar.k(c4466n);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_infoWindowCloseEvents.H(new C4110c.k() { // from class: com.google.maps.android.ktx.u
                    @Override // Md.C4110c.k
                    public final void a(C4466n c4466n) {
                        GoogleMapKt.C116021.invokeSuspend$lambda$0(tVar, c4466n);
                    }
                });
                final C4110c c4110c = this.$this_infoWindowCloseEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116021.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/n;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1", f = "GoogleMap.kt", l = {311}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116031 extends SuspendLambda implements Function2<ov.t<? super C4466n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_infoWindowLongClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.I(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116031 c116031 = new C116031(this.$this_infoWindowLongClickEvents, continuation);
            c116031.L$0 = obj;
            return c116031;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116031(C4110c c4110c, Continuation<? super C116031> continuation) {
            super(2, continuation);
            this.$this_infoWindowLongClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4466n> tVar, Continuation<? super Unit> continuation) {
            return ((C116031) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, C4466n c4466n) {
            Intrinsics.g(c4466n);
            tVar.k(c4466n);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_infoWindowLongClickEvents.I(new C4110c.l() { // from class: com.google.maps.android.ktx.w
                    @Override // Md.C4110c.l
                    public final void onInfoWindowLongClick(C4466n c4466n) {
                        GoogleMapKt.C116031.invokeSuspend$lambda$0(tVar, c4466n);
                    }
                });
                final C4110c c4110c = this.$this_infoWindowLongClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116031.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "Lcom/google/android/gms/maps/model/LatLng;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1", f = "GoogleMap.kt", l = {325}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116041 extends SuspendLambda implements Function2<ov.t<? super LatLng>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_mapClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.J(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116041 c116041 = new C116041(this.$this_mapClickEvents, continuation);
            c116041.L$0 = obj;
            return c116041;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116041(C4110c c4110c, Continuation<? super C116041> continuation) {
            super(2, continuation);
            this.$this_mapClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super LatLng> tVar, Continuation<? super Unit> continuation) {
            return ((C116041) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, LatLng latLng) {
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_mapClickEvents.J(new C4110c.m() { // from class: com.google.maps.android.ktx.y
                    @Override // Md.C4110c.m
                    public final void a(LatLng latLng) {
                        GoogleMapKt.C116041.invokeSuspend$lambda$0(tVar, latLng);
                    }
                });
                final C4110c c4110c = this.$this_mapClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116041.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "Lcom/google/android/gms/maps/model/LatLng;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1", f = "GoogleMap.kt", l = {339}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116051 extends SuspendLambda implements Function2<ov.t<? super LatLng>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_mapLongClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.L(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116051 c116051 = new C116051(this.$this_mapLongClickEvents, continuation);
            c116051.L$0 = obj;
            return c116051;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116051(C4110c c4110c, Continuation<? super C116051> continuation) {
            super(2, continuation);
            this.$this_mapLongClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super LatLng> tVar, Continuation<? super Unit> continuation) {
            return ((C116051) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, LatLng latLng) {
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_mapLongClickEvents.L(new C4110c.o() { // from class: com.google.maps.android.ktx.A
                    @Override // Md.C4110c.o
                    public final void a(LatLng latLng) {
                        GoogleMapKt.C116051.invokeSuspend$lambda$0(tVar, latLng);
                    }
                });
                final C4110c c4110c = this.$this_mapLongClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116051.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/n;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1", f = "GoogleMap.kt", l = {353}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116061 extends SuspendLambda implements Function2<ov.t<? super C4466n>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_markerClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.M(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116061 c116061 = new C116061(this.$this_markerClickEvents, continuation);
            c116061.L$0 = obj;
            return c116061;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116061(C4110c c4110c, Continuation<? super C116061> continuation) {
            super(2, continuation);
            this.$this_markerClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4466n> tVar, Continuation<? super Unit> continuation) {
            return ((C116061) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(ov.t tVar, C4466n c4466n) {
            Intrinsics.g(c4466n);
            return ov.k.i(tVar.k(c4466n));
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_markerClickEvents.M(new C4110c.p() { // from class: com.google.maps.android.ktx.C
                    @Override // Md.C4110c.p
                    public final boolean onMarkerClick(C4466n c4466n) {
                        return GoogleMapKt.C116061.invokeSuspend$lambda$0(tVar, c4466n);
                    }
                });
                final C4110c c4110c = this.$this_markerClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116061.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1", f = "GoogleMap.kt", l = {378}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116071 extends SuspendLambda implements Function2<ov.t<? super OnMarkerDragEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_markerDragEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C4110c c4110c) {
            c4110c.N(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116071 c116071 = new C116071(this.$this_markerDragEvents, continuation);
            c116071.L$0 = obj;
            return c116071;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116071(C4110c c4110c, Continuation<? super C116071> continuation) {
            super(2, continuation);
            this.$this_markerDragEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super OnMarkerDragEvent> tVar, Continuation<? super Unit> continuation) {
            return ((C116071) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_markerDragEvents.N(new C4110c.q() { // from class: com.google.maps.android.ktx.GoogleMapKt.markerDragEvents.1.1
                    @Override // Md.C4110c.q
                    public void onMarkerDrag(C4466n marker) {
                        Intrinsics.j(marker, "marker");
                        tVar.k(new MarkerDragEvent(marker));
                    }

                    @Override // Md.C4110c.q
                    public void onMarkerDragEnd(C4466n marker) {
                        Intrinsics.j(marker, "marker");
                        tVar.k(new MarkerDragEndEvent(marker));
                    }

                    @Override // Md.C4110c.q
                    public void onMarkerDragStart(C4466n marker) {
                        Intrinsics.j(marker, "marker");
                        tVar.k(new MarkerDragStartEvent(marker));
                    }
                });
                final C4110c c4110c = this.$this_markerDragEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.E
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116071.invokeSuspend$lambda$0(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lov/t;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1", f = "GoogleMap.kt", l = {393}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116081 extends SuspendLambda implements Function2<ov.t<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_myLocationButtonClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.O(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116081 c116081 = new C116081(this.$this_myLocationButtonClickEvents, continuation);
            c116081.L$0 = obj;
            return c116081;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116081(C4110c c4110c, Continuation<? super C116081> continuation) {
            super(2, continuation);
            this.$this_myLocationButtonClickEvents = c4110c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(ov.t tVar) {
            return ov.k.i(tVar.k(Unit.f143329a));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Unit> tVar, Continuation<? super Unit> continuation) {
            return ((C116081) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_myLocationButtonClickEvents.O(new C4110c.r() { // from class: com.google.maps.android.ktx.F
                    @Override // Md.C4110c.r
                    public final boolean a() {
                        return GoogleMapKt.C116081.invokeSuspend$lambda$0(tVar);
                    }
                });
                final C4110c c4110c = this.$this_myLocationButtonClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116081.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "Landroid/location/Location;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1", f = "GoogleMap.kt", l = {HttpResponseStatus.ERROR_REQUEST_TIMEOUT}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116091 extends SuspendLambda implements Function2<ov.t<? super Location>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_myLocationClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.P(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116091 c116091 = new C116091(this.$this_myLocationClickEvents, continuation);
            c116091.L$0 = obj;
            return c116091;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116091(C4110c c4110c, Continuation<? super C116091> continuation) {
            super(2, continuation);
            this.$this_myLocationClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Location> tVar, Continuation<? super Unit> continuation) {
            return ((C116091) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, Location location) {
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_myLocationClickEvents.P(new C4110c.s() { // from class: com.google.maps.android.ktx.H
                    @Override // Md.C4110c.s
                    public final void a(Location location) {
                        GoogleMapKt.C116091.invokeSuspend$lambda$0(tVar, location);
                    }
                });
                final C4110c c4110c = this.$this_myLocationClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116091.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/r;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1", f = "GoogleMap.kt", l = {423}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116101 extends SuspendLambda implements Function2<ov.t<? super Od.r>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_poiClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.Q(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116101 c116101 = new C116101(this.$this_poiClickEvents, continuation);
            c116101.L$0 = obj;
            return c116101;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116101(C4110c c4110c, Continuation<? super C116101> continuation) {
            super(2, continuation);
            this.$this_poiClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Od.r> tVar, Continuation<? super Unit> continuation) {
            return ((C116101) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, Od.r rVar) {
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_poiClickEvents.Q(new C4110c.t() { // from class: com.google.maps.android.ktx.J
                    @Override // Md.C4110c.t
                    public final void a(Od.r rVar) {
                        GoogleMapKt.C116101.invokeSuspend$lambda$0(tVar, rVar);
                    }
                });
                final C4110c c4110c = this.$this_poiClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116101.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/s;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1", f = "GoogleMap.kt", l = {437}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116111 extends SuspendLambda implements Function2<ov.t<? super C4470s>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_polygonClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.R(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116111 c116111 = new C116111(this.$this_polygonClickEvents, continuation);
            c116111.L$0 = obj;
            return c116111;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116111(C4110c c4110c, Continuation<? super C116111> continuation) {
            super(2, continuation);
            this.$this_polygonClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4470s> tVar, Continuation<? super Unit> continuation) {
            return ((C116111) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, C4470s c4470s) {
            Intrinsics.g(c4470s);
            tVar.k(c4470s);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_polygonClickEvents.R(new C4110c.u() { // from class: com.google.maps.android.ktx.L
                    @Override // Md.C4110c.u
                    public final void onPolygonClick(C4470s c4470s) {
                        GoogleMapKt.C116111.invokeSuspend$lambda$0(tVar, c4470s);
                    }
                });
                final C4110c c4110c = this.$this_polygonClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116111.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "LOd/u;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1", f = "GoogleMap.kt", l = {451}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C116121 extends SuspendLambda implements Function2<ov.t<? super C4472u>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C4110c $this_polylineClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C4110c c4110c) {
            c4110c.S(null);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116121 c116121 = new C116121(this.$this_polylineClickEvents, continuation);
            c116121.L$0 = obj;
            return c116121;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C116121(C4110c c4110c, Continuation<? super C116121> continuation) {
            super(2, continuation);
            this.$this_polylineClickEvents = c4110c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super C4472u> tVar, Continuation<? super Unit> continuation) {
            return ((C116121) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ov.t tVar, C4472u c4472u) {
            Intrinsics.g(c4472u);
            tVar.k(c4472u);
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
                final ov.t tVar = (ov.t) this.L$0;
                this.$this_polylineClickEvents.S(new C4110c.v() { // from class: com.google.maps.android.ktx.N
                    @Override // Md.C4110c.v
                    public final void onPolylineClick(C4472u c4472u) {
                        GoogleMapKt.C116121.invokeSuspend$lambda$0(tVar, c4472u);
                    }
                });
                final C4110c c4110c = this.$this_polylineClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleMapKt.C116121.invokeSuspend$lambda$1(c4110c);
                    }
                };
                this.label = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    private static final Object awaitAnimateCamera$$forInline(C4110c c4110c, C4108a c4108a, int i10, Continuation<? super Unit> continuation) {
        InlineMarker.c(0);
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        c4110c.g(c4108a, i10, new GoogleMapKt$awaitAnimateCamera$2$1(c15819p));
        Unit unit = Unit.f143329a;
        if (c15819p.u() == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return Unit.f143329a;
    }

    private static final Object awaitMapLoad$$forInline(C4110c c4110c, Continuation<? super Unit> continuation) {
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c4110c.K(new GoogleMapKt$awaitMapLoad$2$1(safeContinuation));
        Unit unit = Unit.f143329a;
        if (safeContinuation.b() == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return Unit.f143329a;
    }

    private static final Object awaitSnapshot$$forInline(C4110c c4110c, Bitmap bitmap, Continuation<? super Bitmap> continuation) {
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c4110c.V(new GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        Unit unit = Unit.f143329a;
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objB;
    }

    public static /* synthetic */ Object awaitSnapshot$default(C4110c c4110c, Bitmap bitmap, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = null;
        }
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c4110c.V(new GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objB;
    }

    public static final C4459g addCircle(C4110c c4110c, Function1<? super C4460h, Unit> optionsActions) {
        Intrinsics.j(c4110c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4460h c4460h = new C4460h();
        optionsActions.invoke(c4460h);
        C4459g c4459gA = c4110c.a(c4460h);
        Intrinsics.i(c4459gA, "addCircle(...)");
        return c4459gA;
    }

    public static final C4462j addGroundOverlay(C4110c c4110c, Function1<? super C4463k, Unit> optionsActions) {
        Intrinsics.j(c4110c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4463k c4463k = new C4463k();
        optionsActions.invoke(c4463k);
        return c4110c.b(c4463k);
    }

    public static final C4466n addMarker(C4110c c4110c, Function1<? super C4467o, Unit> optionsActions) {
        Intrinsics.j(c4110c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4467o c4467o = new C4467o();
        optionsActions.invoke(c4467o);
        return c4110c.c(c4467o);
    }

    public static final C4470s addPolygon(C4110c c4110c, Function1<? super C4471t, Unit> optionsActions) {
        Intrinsics.j(c4110c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4471t c4471t = new C4471t();
        optionsActions.invoke(c4471t);
        C4470s c4470sD = c4110c.d(c4471t);
        Intrinsics.i(c4470sD, "addPolygon(...)");
        return c4470sD;
    }

    public static final C4472u addPolyline(C4110c c4110c, Function1<? super C4473v, Unit> optionsActions) {
        Intrinsics.j(c4110c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        C4473v c4473v = new C4473v();
        optionsActions.invoke(c4473v);
        C4472u c4472uE = c4110c.e(c4473v);
        Intrinsics.i(c4472uE, "addPolyline(...)");
        return c4472uE;
    }

    public static final Od.F addTileOverlay(C4110c c4110c, Function1<? super Od.G, Unit> optionsActions) {
        Intrinsics.j(c4110c, "<this>");
        Intrinsics.j(optionsActions, "optionsActions");
        Od.G g10 = new Od.G();
        optionsActions.invoke(g10);
        return c4110c.f(g10);
    }

    public static final Object awaitAnimateCamera(C4110c c4110c, C4108a c4108a, int i10, Continuation<? super Unit> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        c4110c.g(c4108a, i10, new GoogleMapKt$awaitAnimateCamera$2$1(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU == IntrinsicsKt.f() ? objU : Unit.f143329a;
    }

    public static /* synthetic */ Object awaitAnimateCamera$default(C4110c c4110c, C4108a c4108a, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 3000;
        }
        InlineMarker.c(0);
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        c4110c.g(c4108a, i10, new GoogleMapKt$awaitAnimateCamera$2$1(c15819p));
        if (c15819p.u() == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return Unit.f143329a;
    }

    public static final Object awaitMapLoad(C4110c c4110c, Continuation<? super Unit> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c4110c.K(new GoogleMapKt$awaitMapLoad$2$1(safeContinuation));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB == IntrinsicsKt.f() ? objB : Unit.f143329a;
    }

    public static final Object awaitSnapshot(C4110c c4110c, Bitmap bitmap, Continuation<? super Bitmap> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        c4110c.V(new GoogleMapKt$awaitSnapshot$2$1(safeContinuation), bitmap);
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
    public static final InterfaceC16561f<CameraEvent> cameraEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new AnonymousClass1(c4110c, null));
    }

    public static final InterfaceC16561f<Unit> cameraIdleEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C115941(c4110c, null));
    }

    public static final InterfaceC16561f<Unit> cameraMoveCanceledEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C115951(c4110c, null));
    }

    public static final InterfaceC16561f<Unit> cameraMoveEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C115961(c4110c, null));
    }

    public static final InterfaceC16561f<Integer> cameraMoveStartedEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C115971(c4110c, null));
    }

    public static final InterfaceC16561f<C4459g> circleClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C115981(c4110c, null));
    }

    public static final InterfaceC16561f<C4462j> groundOverlayClicks(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C115991(c4110c, null));
    }

    public static final InterfaceC16561f<IndoorChangeEvent> indoorStateChangeEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116001(c4110c, null));
    }

    public static final InterfaceC16561f<C4466n> infoWindowClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116011(c4110c, null));
    }

    public static final InterfaceC16561f<C4466n> infoWindowCloseEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116021(c4110c, null));
    }

    public static final InterfaceC16561f<C4466n> infoWindowLongClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116031(c4110c, null));
    }

    public static final InterfaceC16561f<LatLng> mapClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116041(c4110c, null));
    }

    public static final InterfaceC16561f<LatLng> mapLongClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116051(c4110c, null));
    }

    public static final InterfaceC16561f<C4466n> markerClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116061(c4110c, null));
    }

    public static final InterfaceC16561f<OnMarkerDragEvent> markerDragEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116071(c4110c, null));
    }

    public static final InterfaceC16561f<Unit> myLocationButtonClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116081(c4110c, null));
    }

    public static final InterfaceC16561f<Location> myLocationClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116091(c4110c, null));
    }

    public static final InterfaceC16561f<Od.r> poiClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116101(c4110c, null));
    }

    public static final InterfaceC16561f<C4470s> polygonClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116111(c4110c, null));
    }

    public static final InterfaceC16561f<C4472u> polylineClickEvents(C4110c c4110c) {
        Intrinsics.j(c4110c, "<this>");
        return C16563h.f(new C116121(c4110c, null));
    }
}
