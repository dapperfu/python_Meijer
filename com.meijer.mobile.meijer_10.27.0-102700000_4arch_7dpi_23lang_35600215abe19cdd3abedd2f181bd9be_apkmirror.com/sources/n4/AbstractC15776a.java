package n4;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.b;
import androidx.privacysandbox.ads.adservices.measurement.m;
import androidx.privacysandbox.ads.adservices.measurement.n;
import androidx.privacysandbox.ads.adservices.measurement.o;
import com.google.common.util.concurrent.q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m4.C15550b;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0010B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln4/a;", "", "<init>", "()V", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "Lcom/google/common/util/concurrent/q;", "", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/q;", "trigger", "d", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/q;", "", "b", "()Lcom/google/common/util/concurrent/q;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC15776a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006#"}, d2 = {"Ln4/a$a;", "Ln4/a;", "Landroidx/privacysandbox/ads/adservices/measurement/b;", "mMeasurementManager", "<init>", "(Landroidx/privacysandbox/ads/adservices/measurement/b;)V", "Landroidx/privacysandbox/ads/adservices/measurement/a;", "deletionRequest", "Lcom/google/common/util/concurrent/q;", "", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/a;)Lcom/google/common/util/concurrent/q;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/q;", "Landroidx/privacysandbox/ads/adservices/measurement/m;", "request", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/m;)Lcom/google/common/util/concurrent/q;", "trigger", "d", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/q;", "Landroidx/privacysandbox/ads/adservices/measurement/n;", "h", "(Landroidx/privacysandbox/ads/adservices/measurement/n;)Lcom/google/common/util/concurrent/q;", "Landroidx/privacysandbox/ads/adservices/measurement/o;", "i", "(Landroidx/privacysandbox/ads/adservices/measurement/o;)Lcom/google/common/util/concurrent/q;", "", "b", "()Lcom/google/common/util/concurrent/q;", "Landroidx/privacysandbox/ads/adservices/measurement/b;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n4.a$a, reason: collision with other inner class name */
    private static final class C2334a extends AbstractC15776a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {132}, m = "invokeSuspend")
        /* renamed from: n4.a$a$a, reason: collision with other inner class name */
        static final class C2335a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f150995a;

            C2335a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Continuation<? super C2335a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2334a.this.new C2335a(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2335a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f150995a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C2334a.this.mMeasurementManager;
                    this.f150995a = 1;
                    if (bVar.a(null, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)I"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
        /* renamed from: n4.a$a$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Integer>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f150997a;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2334a.this.new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Integer> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f150997a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                androidx.privacysandbox.ads.adservices.measurement.b bVar = C2334a.this.mMeasurementManager;
                this.f150997a = 1;
                Object objB = bVar.b(this);
                if (objB == objF) {
                    return objF;
                }
                return objB;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        /* renamed from: n4.a$a$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f150999a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f151001c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InputEvent f151002d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f151001c = uri;
                this.f151002d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2334a.this.new c(this.f151001c, this.f151002d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f150999a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C2334a.this.mMeasurementManager;
                    Uri uri = this.f151001c;
                    InputEvent inputEvent = this.f151002d;
                    this.f150999a = 1;
                    if (bVar.c(uri, inputEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        /* renamed from: n4.a$a$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151003a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m f151005c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(m mVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f151005c = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2334a.this.new d(this.f151005c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f151003a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C2334a.this.mMeasurementManager;
                    m mVar = this.f151005c;
                    this.f151003a = 1;
                    if (bVar.d(mVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        /* renamed from: n4.a$a$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151006a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f151008c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f151008c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2334a.this.new e(this.f151008c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f151006a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C2334a.this.mMeasurementManager;
                    Uri uri = this.f151008c;
                    this.f151006a = 1;
                    if (bVar.e(uri, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {172}, m = "invokeSuspend")
        /* renamed from: n4.a$a$f */
        static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151009a;

            f(n nVar, Continuation<? super f> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2334a.this.new f(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f151009a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C2334a.this.mMeasurementManager;
                    this.f151009a = 1;
                    if (bVar.f(null, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {182}, m = "invokeSuspend")
        /* renamed from: n4.a$a$g */
        static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151011a;

            g(o oVar, Continuation<? super g> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2334a.this.new g(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f151011a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C2334a.this.mMeasurementManager;
                    this.f151011a = 1;
                    if (bVar.g(null, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        public C2334a(androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager) {
            Intrinsics.j(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // n4.AbstractC15776a
        public q<Unit> c(Uri attributionSource, InputEvent inputEvent) {
            Intrinsics.j(attributionSource, "attributionSource");
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // n4.AbstractC15776a
        public q<Unit> d(Uri trigger) {
            Intrinsics.j(trigger, "trigger");
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        public q<Unit> f(androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            Intrinsics.j(deletionRequest, "deletionRequest");
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.a()), null, null, new C2335a(deletionRequest, null), 3, null), null, 1, null);
        }

        public q<Unit> g(m request) {
            Intrinsics.j(request, "request");
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        public q<Unit> h(n request) {
            Intrinsics.j(request, "request");
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        public q<Unit> i(o request) {
            Intrinsics.j(request, "request");
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }

        @Override // n4.AbstractC15776a
        public q<Integer> b() {
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.a()), null, null, new b(null), 3, null), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln4/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ln4/a;", "a", "(Landroid/content/Context;)Ln4/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: n4.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AbstractC15776a a(Context context) {
            Intrinsics.j(context, "context");
            b bVarA = b.INSTANCE.a(context);
            if (bVarA != null) {
                return new C2334a(bVarA);
            }
            return null;
        }
    }

    @JvmStatic
    public static final AbstractC15776a a(Context context) {
        return INSTANCE.a(context);
    }

    public abstract q<Integer> b();

    public abstract q<Unit> c(Uri attributionSource, InputEvent inputEvent);

    public abstract q<Unit> d(Uri trigger);
}
