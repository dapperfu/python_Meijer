package com.google.maps.android.ktx;

import Kd.C3954l;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.maps.android.ktx.StreetViewPanoramaViewKt;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import tv.C17154h;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004*\u00020\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/google/android/gms/maps/StreetViewPanoramaView;", "LKd/l;", "awaitStreetViewPanorama", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltv/f;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "cameraChangeEvents", "(LKd/l;)Ltv/f;", "LMd/A;", "changeEvents", "Lcom/google/android/gms/maps/model/a;", "clickEvents", "longClickEvents", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StreetViewPanoramaViewKt {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$cameraChangeEvents$1", f = "StreetViewPanoramaView.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$cameraChangeEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<sv.t<? super StreetViewPanoramaCamera>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3954l $this_cameraChangeEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3954l c3954l) {
            c3954l.c(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_cameraChangeEvents, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C3954l c3954l, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_cameraChangeEvents = c3954l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super StreetViewPanoramaCamera> tVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, StreetViewPanoramaCamera streetViewPanoramaCamera) {
            Intrinsics.g(streetViewPanoramaCamera);
            tVar.k(streetViewPanoramaCamera);
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
                this.$this_cameraChangeEvents.c(new C3954l.a() { // from class: com.google.maps.android.ktx.P
                    @Override // Kd.C3954l.a
                    public final void a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                        StreetViewPanoramaViewKt.AnonymousClass1.invokeSuspend$lambda$0(tVar, streetViewPanoramaCamera);
                    }
                });
                final C3954l c3954l = this.$this_cameraChangeEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreetViewPanoramaViewKt.AnonymousClass1.invokeSuspend$lambda$1(c3954l);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LMd/A;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$changeEvents$1", f = "StreetViewPanoramaView.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$changeEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114881 extends SuspendLambda implements Function2<sv.t<? super Md.A>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3954l $this_changeEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3954l c3954l) {
            c3954l.d(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114881 c114881 = new C114881(this.$this_changeEvents, continuation);
            c114881.L$0 = obj;
            return c114881;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114881(C3954l c3954l, Continuation<? super C114881> continuation) {
            super(2, continuation);
            this.$this_changeEvents = c3954l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Md.A> tVar, Continuation<? super Unit> continuation) {
            return ((C114881) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, Md.A a10) {
            Intrinsics.g(a10);
            tVar.k(a10);
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
                this.$this_changeEvents.d(new C3954l.b() { // from class: com.google.maps.android.ktx.S
                    @Override // Kd.C3954l.b
                    public final void a(Md.A a10) {
                        StreetViewPanoramaViewKt.C114881.invokeSuspend$lambda$0(tVar, a10);
                    }
                });
                final C3954l c3954l = this.$this_changeEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.T
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreetViewPanoramaViewKt.C114881.invokeSuspend$lambda$1(c3954l);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/android/gms/maps/model/a;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$clickEvents$1", f = "StreetViewPanoramaView.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$clickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114891 extends SuspendLambda implements Function2<sv.t<? super com.google.android.gms.maps.model.a>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3954l $this_clickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3954l c3954l) {
            c3954l.e(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114891 c114891 = new C114891(this.$this_clickEvents, continuation);
            c114891.L$0 = obj;
            return c114891;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114891(C3954l c3954l, Continuation<? super C114891> continuation) {
            super(2, continuation);
            this.$this_clickEvents = c3954l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super com.google.android.gms.maps.model.a> tVar, Continuation<? super Unit> continuation) {
            return ((C114891) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, com.google.android.gms.maps.model.a aVar) {
            Intrinsics.g(aVar);
            tVar.k(aVar);
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
                this.$this_clickEvents.e(new C3954l.c() { // from class: com.google.maps.android.ktx.U
                    @Override // Kd.C3954l.c
                    public final void a(com.google.android.gms.maps.model.a aVar) {
                        StreetViewPanoramaViewKt.C114891.invokeSuspend$lambda$0(tVar, aVar);
                    }
                });
                final C3954l c3954l = this.$this_clickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.V
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreetViewPanoramaViewKt.C114891.invokeSuspend$lambda$1(c3954l);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Lcom/google/android/gms/maps/model/a;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$longClickEvents$1", f = "StreetViewPanoramaView.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$longClickEvents$1, reason: invalid class name and case insensitive filesystem */
    static final class C114901 extends SuspendLambda implements Function2<sv.t<? super com.google.android.gms.maps.model.a>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3954l $this_longClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C3954l c3954l) {
            c3954l.f(null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114901 c114901 = new C114901(this.$this_longClickEvents, continuation);
            c114901.L$0 = obj;
            return c114901;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114901(C3954l c3954l, Continuation<? super C114901> continuation) {
            super(2, continuation);
            this.$this_longClickEvents = c3954l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super com.google.android.gms.maps.model.a> tVar, Continuation<? super Unit> continuation) {
            return ((C114901) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(sv.t tVar, com.google.android.gms.maps.model.a aVar) {
            Intrinsics.g(aVar);
            tVar.k(aVar);
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
                this.$this_longClickEvents.f(new C3954l.d() { // from class: com.google.maps.android.ktx.W
                    @Override // Kd.C3954l.d
                    public final void a(com.google.android.gms.maps.model.a aVar) {
                        StreetViewPanoramaViewKt.C114901.invokeSuspend$lambda$0(tVar, aVar);
                    }
                });
                final C3954l c3954l = this.$this_longClickEvents;
                Function0 function0 = new Function0() { // from class: com.google.maps.android.ktx.X
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreetViewPanoramaViewKt.C114901.invokeSuspend$lambda$1(c3954l);
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

    private static final Object awaitStreetViewPanorama$$forInline(StreetViewPanoramaView streetViewPanoramaView, Continuation<? super C3954l> continuation) {
        InlineMarker.c(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        streetViewPanoramaView.a(new StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1(safeContinuation));
        Unit unit = Unit.f142422a;
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        InlineMarker.c(1);
        return objB;
    }

    public static final Object awaitStreetViewPanorama(StreetViewPanoramaView streetViewPanoramaView, Continuation<? super C3954l> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        streetViewPanoramaView.a(new StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1(safeContinuation));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }

    public static final InterfaceC17152f<StreetViewPanoramaCamera> cameraChangeEvents(C3954l c3954l) {
        Intrinsics.j(c3954l, "<this>");
        return C17154h.f(new AnonymousClass1(c3954l, null));
    }

    public static final InterfaceC17152f<Md.A> changeEvents(C3954l c3954l) {
        Intrinsics.j(c3954l, "<this>");
        return C17154h.f(new C114881(c3954l, null));
    }

    public static final InterfaceC17152f<com.google.android.gms.maps.model.a> clickEvents(C3954l c3954l) {
        Intrinsics.j(c3954l, "<this>");
        return C17154h.f(new C114891(c3954l, null));
    }

    public static final InterfaceC17152f<com.google.android.gms.maps.model.a> longClickEvents(C3954l c3954l) {
        Intrinsics.j(c3954l, "<this>");
        return C17154h.f(new C114901(c3954l, null));
    }
}
