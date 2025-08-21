package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15809k;
import mv.C15819p;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/l;", "Landroidx/privacysandbox/ads/adservices/measurement/b;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroidx/privacysandbox/ads/adservices/measurement/a;", "deletionRequest", "", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/n;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/m;", "d", "(Landroidx/privacysandbox/ads/adservices/measurement/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/o;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "i", "()Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@SourceDebugExtension
/* loaded from: classes4.dex */
public class l extends b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MeasurementManager mMeasurementManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f57976a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f57977b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f57978c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f57979d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {131}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.l$a$a, reason: collision with other inner class name */
        static final class C1144a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f57980a;

            /* renamed from: b, reason: collision with root package name */
            Object f57981b;

            /* renamed from: c, reason: collision with root package name */
            Object f57982c;

            /* renamed from: d, reason: collision with root package name */
            int f57983d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l f57984e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Uri f57985f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ m f57986g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1144a(l lVar, Uri uri, m mVar, Continuation<? super C1144a> continuation) {
                super(2, continuation);
                this.f57984e = lVar;
                this.f57985f = uri;
                this.f57986g = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1144a(this.f57984e, this.f57985f, this.f57986g, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1144a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f57983d;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    l lVar = this.f57984e;
                    Uri uri = this.f57985f;
                    m mVar = this.f57986g;
                    this.f57980a = lVar;
                    this.f57981b = uri;
                    this.f57982c = mVar;
                    this.f57983d = 1;
                    C15819p c15819p = new C15819p(IntrinsicsKt.c(this), 1);
                    c15819p.C();
                    lVar.getMMeasurementManager().registerSource(uri, mVar.getInputEvent(), new k(), j2.m.a(c15819p));
                    Object objU = c15819p.u();
                    if (objU == IntrinsicsKt.f()) {
                        DebugProbesKt.c(this);
                    }
                    if (objU == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, l lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f57978c = mVar;
            this.f57979d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f57978c, this.f57979d, continuation);
            aVar.f57977b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f57976a == 0) {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f57977b;
                List<Uri> listB = this.f57978c.b();
                l lVar = this.f57979d;
                m mVar = this.f57978c;
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    C15809k.d(interfaceC15783O, null, null, new C1144a(lVar, (Uri) it.next(), mVar, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Continuation<? super Unit> continuation) {
        return h(this, aVar, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(Continuation<? super Integer> continuation) {
        return j(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        return k(this, uri, inputEvent, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(m mVar, Continuation<? super Unit> continuation) {
        return l(this, mVar, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, Continuation<? super Unit> continuation) {
        return m(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(n nVar, Continuation<? super Unit> continuation) {
        return n(this, nVar, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(o oVar, Continuation<? super Unit> continuation) {
        return o(this, oVar, continuation);
    }

    public l(MeasurementManager mMeasurementManager) {
        Intrinsics.j(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    static /* synthetic */ Object h(l lVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, Continuation<? super Unit> continuation) {
        new C15819p(IntrinsicsKt.c(continuation), 1).C();
        lVar.getMMeasurementManager();
        throw null;
    }

    static /* synthetic */ Object j(l lVar, Continuation<? super Integer> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        lVar.getMMeasurementManager().getMeasurementApiStatus(new k(), j2.m.a(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        lVar.getMMeasurementManager().registerSource(uri, inputEvent, new k(), j2.m.a(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU == IntrinsicsKt.f() ? objU : Unit.f143329a;
    }

    static /* synthetic */ Object l(l lVar, m mVar, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new a(mVar, lVar, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    static /* synthetic */ Object m(l lVar, Uri uri, Continuation<? super Unit> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        lVar.getMMeasurementManager().registerTrigger(uri, new k(), j2.m.a(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU == IntrinsicsKt.f() ? objU : Unit.f143329a;
    }

    static /* synthetic */ Object n(l lVar, n nVar, Continuation<? super Unit> continuation) {
        new C15819p(IntrinsicsKt.c(continuation), 1).C();
        lVar.getMMeasurementManager();
        throw null;
    }

    static /* synthetic */ Object o(l lVar, o oVar, Continuation<? super Unit> continuation) {
        new C15819p(IntrinsicsKt.c(continuation), 1).C();
        lVar.getMMeasurementManager();
        throw null;
    }

    /* renamed from: i, reason: from getter */
    protected final MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }
}
