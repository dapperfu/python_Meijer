package com.meijer.mobile.meijer.activity.find;

import Jd.AbstractC3777k;
import Jd.InterfaceC3769c;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.meijer.mobile.meijer.activity.find.C12098m0;
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
import tv.C17154h;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/m0;", "", "LJd/c;", "client", "<init>", "(LJd/c;)V", "Ltv/f;", "Landroid/location/Location;", "b", "()Ltv/f;", "a", "LJd/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.m0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12098m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f106978c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3769c client;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "Landroid/location/Location;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.LocationUpdatesUseCase$fetchUpdates$1", f = "LocationUpdatesUseCase.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.m0$b */
    static final class b extends SuspendLambda implements Function2<sv.t<? super Location>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f106980a;

        /* renamed from: b, reason: collision with root package name */
        Object f106981b;

        /* renamed from: c, reason: collision with root package name */
        int f106982c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f106983d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/meijer/mobile/meijer/activity/find/m0$b$a", "LJd/k;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "", "b", "(Lcom/google/android/gms/location/LocationResult;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.m0$b$a */
        public static final class a extends AbstractC3777k {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ sv.t<Location> f106985a;

            /* JADX WARN: Multi-variable type inference failed */
            a(sv.t<? super Location> tVar) {
                this.f106985a = tVar;
            }

            @Override // Jd.AbstractC3777k
            public void b(LocationResult locationResult) {
                Intrinsics.j(locationResult, "locationResult");
                super.b(locationResult);
                this.f106985a.k(locationResult.B());
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C12098m0.this.new b(continuation);
            bVar.f106983d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super Location> tVar, Continuation<? super Unit> continuation) {
            return ((b) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(C12098m0 c12098m0, a aVar) {
            c12098m0.client.h(aVar);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106982c;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sv.t tVar = (sv.t) this.f106983d;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                LocationRequest locationRequestA = new LocationRequest.a(timeUnit.toMillis(60L)).i(timeUnit.toMillis(30L)).j(102).a();
                Intrinsics.i(locationRequestA, "build(...)");
                final a aVar = new a(tVar);
                C12098m0.this.client.m(locationRequestA, aVar, Looper.getMainLooper());
                final C12098m0 c12098m0 = C12098m0.this;
                Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12098m0.b.g(c12098m0, aVar);
                    }
                };
                this.f106983d = tVar;
                this.f106980a = locationRequestA;
                this.f106981b = aVar;
                this.f106982c = 1;
                if (sv.r.a(tVar, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public C12098m0(InterfaceC3769c client) {
        Intrinsics.j(client, "client");
        this.client = client;
    }

    public final InterfaceC17152f<Location> b() {
        return C17154h.f(new b(null));
    }
}
