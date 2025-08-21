package com.meijer.mobile.meijer.activity.find;

import Ld.AbstractC4021k;
import Ld.InterfaceC4013c;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.meijer.mobile.meijer.activity.find.C12223m0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pv.C16563h;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/m0;", "", "LLd/c;", "client", "<init>", "(LLd/c;)V", "Lpv/f;", "Landroid/location/Location;", "b", "()Lpv/f;", "a", "LLd/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12223m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f107834c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4013c client;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "Landroid/location/Location;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.LocationUpdatesUseCase$fetchUpdates$1", f = "LocationUpdatesUseCase.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.m0$b */
    static final class b extends SuspendLambda implements Function2<ov.t<? super Location>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f107836a;

        /* renamed from: b, reason: collision with root package name */
        Object f107837b;

        /* renamed from: c, reason: collision with root package name */
        int f107838c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f107839d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/meijer/mobile/meijer/activity/find/m0$b$a", "LLd/k;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "", "b", "(Lcom/google/android/gms/location/LocationResult;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.m0$b$a */
        public static final class a extends AbstractC4021k {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ov.t<Location> f107841a;

            /* JADX WARN: Multi-variable type inference failed */
            a(ov.t<? super Location> tVar) {
                this.f107841a = tVar;
            }

            @Override // Ld.AbstractC4021k
            public void b(LocationResult locationResult) {
                Intrinsics.j(locationResult, "locationResult");
                super.b(locationResult);
                this.f107841a.k(locationResult.B());
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C12223m0.this.new b(continuation);
            bVar.f107839d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ov.t<? super Location> tVar, Continuation<? super Unit> continuation) {
            return ((b) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(C12223m0 c12223m0, a aVar) {
            c12223m0.client.f(aVar);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107838c;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ov.t tVar = (ov.t) this.f107839d;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                LocationRequest locationRequestA = new LocationRequest.a(timeUnit.toMillis(60L)).i(timeUnit.toMillis(30L)).j(102).a();
                Intrinsics.i(locationRequestA, "build(...)");
                final a aVar = new a(tVar);
                C12223m0.this.client.i(locationRequestA, aVar, Looper.getMainLooper());
                final C12223m0 c12223m0 = C12223m0.this;
                Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12223m0.b.g(c12223m0, aVar);
                    }
                };
                this.f107839d = tVar;
                this.f107836a = locationRequestA;
                this.f107837b = aVar;
                this.f107838c = 1;
                if (ov.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public C12223m0(InterfaceC4013c client) {
        Intrinsics.j(client, "client");
        this.client = client;
    }

    public final InterfaceC16561f<Location> b() {
        return C16563h.f(new b(null));
    }
}
