package ir;

import cr.SubscriptionDetails;
import gr.C14403a;
import j$.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.S;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130 8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lir/a;", "", "Lgr/a;", "subscriptionDataSource", "<init>", "(Lgr/a;)V", "Lcr/j;", "subscriptionDetails", "", "g", "(Lcr/j;)V", "Ldr/g;", "subscriptionProductRequest", "a", "(Ldr/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "subscriptionId", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscriptions", "j$/time/Instant", "timestamp", "e", "(Ljava/util/List;Lj$/time/Instant;)V", "Lgr/a;", "Lpv/B;", "Lir/a$a;", "Lpv/B;", "_subscriptionsFlow", "Lpv/f;", "Lpv/f;", "d", "()Lpv/f;", "subscriptionsFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ir.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14846a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14403a subscriptionDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<SubscriptionsStore> _subscriptionsFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<List<SubscriptionDetails>> subscriptionsFlow;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lir/a$a;", "", "", "Lcr/j;", "subscriptions", "j$/time/Instant", "timestamp", "<init>", "(Ljava/util/List;Lj$/time/Instant;)V", "now", "", "d", "(Lj$/time/Instant;)Z", "f", "(Lj$/time/Instant;)Lir/a$a;", "a", "(Ljava/util/List;Lj$/time/Instant;)Lir/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ir.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class SubscriptionsStore {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SubscriptionDetails> subscriptions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Instant timestamp;

        /* JADX WARN: Multi-variable type inference failed */
        public SubscriptionsStore() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubscriptionsStore)) {
                return false;
            }
            SubscriptionsStore subscriptionsStore = (SubscriptionsStore) other;
            return Intrinsics.e(this.subscriptions, subscriptionsStore.subscriptions) && Intrinsics.e(this.timestamp, subscriptionsStore.timestamp);
        }

        public SubscriptionsStore(List<SubscriptionDetails> subscriptions, Instant timestamp) {
            Intrinsics.j(subscriptions, "subscriptions");
            Intrinsics.j(timestamp, "timestamp");
            this.subscriptions = subscriptions;
            this.timestamp = timestamp;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubscriptionsStore b(SubscriptionsStore subscriptionsStore, List list, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = subscriptionsStore.subscriptions;
            }
            if ((i10 & 2) != 0) {
                instant = subscriptionsStore.timestamp;
            }
            return subscriptionsStore.a(list, instant);
        }

        public static /* synthetic */ boolean e(SubscriptionsStore subscriptionsStore, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = Instant.now();
            }
            return subscriptionsStore.d(instant);
        }

        public static /* synthetic */ SubscriptionsStore g(SubscriptionsStore subscriptionsStore, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = Instant.now();
            }
            return subscriptionsStore.f(instant);
        }

        public final SubscriptionsStore a(List<SubscriptionDetails> subscriptions, Instant timestamp) {
            Intrinsics.j(subscriptions, "subscriptions");
            Intrinsics.j(timestamp, "timestamp");
            return new SubscriptionsStore(subscriptions, timestamp);
        }

        public final List<SubscriptionDetails> c() {
            return this.subscriptions;
        }

        public final boolean d(Instant now) {
            Intrinsics.j(now, "now");
            return now.isAfter(this.timestamp.plusSeconds(300L));
        }

        public final SubscriptionsStore f(Instant now) {
            Intrinsics.j(now, "now");
            return b(this, null, now, 1, null);
        }

        public int hashCode() {
            return (this.subscriptions.hashCode() * 31) + this.timestamp.hashCode();
        }

        public String toString() {
            return "SubscriptionsStore(subscriptions=" + this.subscriptions + ", timestamp=" + this.timestamp + ')';
        }

        public /* synthetic */ SubscriptionsStore(List list, Instant instant, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? Instant.now() : instant);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.subscription.service.repository.SubscriptionRepository", f = "SubscriptionRepository.kt", l = {66}, m = "addSubscription")
    /* renamed from: ir.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f139086a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f139087b;

        /* renamed from: d, reason: collision with root package name */
        int f139089d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f139087b = obj;
            this.f139089d |= Integer.MIN_VALUE;
            return C14846a.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.subscription.service.repository.SubscriptionRepository", f = "SubscriptionRepository.kt", l = {76}, m = "cancelSubscription")
    /* renamed from: ir.a$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f139090a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f139091b;

        /* renamed from: d, reason: collision with root package name */
        int f139093d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f139091b = obj;
            this.f139093d |= Integer.MIN_VALUE;
            return C14846a.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.subscription.service.repository.SubscriptionRepository", f = "SubscriptionRepository.kt", l = {110}, m = "getAllSubscriptions")
    /* renamed from: ir.a$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f139094a;

        /* renamed from: c, reason: collision with root package name */
        int f139096c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f139094a = obj;
            this.f139096c |= Integer.MIN_VALUE;
            return C14846a.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ir.a$e */
    public static final class e implements InterfaceC16561f<List<? extends SubscriptionDetails>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f139097a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ir.a$e$a, reason: collision with other inner class name */
        public static final class C2209a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f139098a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.subscription.service.repository.SubscriptionRepository$special$$inlined$map$1$2", f = "SubscriptionRepository.kt", l = {50}, m = "emit")
            /* renamed from: ir.a$e$a$a, reason: collision with other inner class name */
            public static final class C2210a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f139099a;

                /* renamed from: b, reason: collision with root package name */
                int f139100b;

                /* renamed from: c, reason: collision with root package name */
                Object f139101c;

                /* renamed from: e, reason: collision with root package name */
                Object f139103e;

                /* renamed from: f, reason: collision with root package name */
                Object f139104f;

                /* renamed from: g, reason: collision with root package name */
                Object f139105g;

                /* renamed from: h, reason: collision with root package name */
                int f139106h;

                public C2210a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f139099a = obj;
                    this.f139100b |= Integer.MIN_VALUE;
                    return C2209a.this.emit(null, this);
                }
            }

            public C2209a(InterfaceC16562g interfaceC16562g) {
                this.f139098a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ir.C14846a.e.C2209a.C2210a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ir.a$e$a$a r0 = (ir.C14846a.e.C2209a.C2210a) r0
                    int r1 = r0.f139100b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f139100b = r1
                    goto L18
                L13:
                    ir.a$e$a$a r0 = new ir.a$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f139099a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f139100b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f139105g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f139103e
                    ir.a$e$a$a r5 = (ir.C14846a.e.C2209a.C2210a) r5
                    kotlin.ResultKt.b(r6)
                    goto L59
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f139098a
                    r2 = r5
                    ir.a$a r2 = (ir.C14846a.SubscriptionsStore) r2
                    java.util.List r2 = r2.c()
                    r0.f139101c = r5
                    r0.f139103e = r0
                    r0.f139104f = r5
                    r0.f139105g = r6
                    r5 = 0
                    r0.f139106h = r5
                    r0.f139100b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ir.C14846a.e.C2209a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC16561f interfaceC16561f) {
            this.f139097a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super List<? extends SubscriptionDetails>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f139097a.collect(new C2209a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/a$a;", "it", "", "<anonymous>", "(Lir/a$a;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.service.repository.SubscriptionRepository$subscriptionsFlow$1", f = "SubscriptionRepository.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: ir.a$f */
    static final class f extends SuspendLambda implements Function2<SubscriptionsStore, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f139107a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f139108b;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C14846a.this.new f(continuation);
            fVar.f139108b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SubscriptionsStore subscriptionsStore, Continuation<? super Unit> continuation) {
            return ((f) create(subscriptionsStore, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f139107a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                SubscriptionsStore subscriptionsStore = (SubscriptionsStore) this.f139108b;
                if (SubscriptionsStore.e(subscriptionsStore, null, 1, null)) {
                    C14846a c14846a = C14846a.this;
                    this.f139108b = subscriptionsStore;
                    this.f139107a = 1;
                    if (c14846a.c(this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lir/a$a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.service.repository.SubscriptionRepository$subscriptionsFlow$2", f = "SubscriptionRepository.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: ir.a$g */
    static final class g extends SuspendLambda implements Function3<InterfaceC16562g<? super SubscriptionsStore>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f139110a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f139111b;

        g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super SubscriptionsStore> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            g gVar = new g(continuation);
            gVar.f139111b = interfaceC16562g;
            return gVar.invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f139110a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f139111b;
                SubscriptionsStore subscriptionsStore = new SubscriptionsStore(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                this.f139111b = interfaceC16562g;
                this.f139110a = 1;
                if (interfaceC16562g.emit(subscriptionsStore, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14846a(C14403a subscriptionDataSource) {
        Intrinsics.j(subscriptionDataSource, "subscriptionDataSource");
        this.subscriptionDataSource = subscriptionDataSource;
        Instant MIN = Instant.MIN;
        Intrinsics.i(MIN, "MIN");
        InterfaceC16549B<SubscriptionsStore> interfaceC16549BA = S.a(new SubscriptionsStore(null, MIN, 1, 0 == true ? 1 : 0));
        this._subscriptionsFlow = interfaceC16549BA;
        this.subscriptionsFlow = C16563h.r(new e(C16563h.g(C16563h.O(interfaceC16549BA, new f(null)), new g(null))));
    }

    public static /* synthetic */ void f(C14846a c14846a, List list, Instant instant, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            instant = Instant.now();
        }
        c14846a.e(list, instant);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g(SubscriptionDetails subscriptionDetails) {
        SubscriptionsStore value;
        Map mapD;
        InterfaceC16549B<SubscriptionsStore> interfaceC16549B = this._subscriptionsFlow;
        do {
            value = interfaceC16549B.getValue();
            List<SubscriptionDetails> listC = value.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(listC, 10)), 16));
            for (Object obj : listC) {
                linkedHashMap.put(((SubscriptionDetails) obj).getId(), obj);
            }
            mapD = MapsKt.D(linkedHashMap);
            if (subscriptionDetails.getIsActive()) {
                mapD.put(subscriptionDetails.getId(), subscriptionDetails);
                Unit unit = Unit.f143329a;
            } else if (((SubscriptionDetails) mapD.remove(subscriptionDetails.getId())) == null) {
                qw.a.INSTANCE.d("Subscription ID not found while removing: " + subscriptionDetails.getId(), new Object[0]);
                Unit unit2 = Unit.f143329a;
            }
        } while (!interfaceC16549B.e(value, new SubscriptionsStore(CollectionsKt.j1(mapD.values()), null, 2, 0 == true ? 1 : 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dr.SubscriptionProductRequest r5, kotlin.coroutines.Continuation<? super cr.SubscriptionDetails> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ir.C14846a.b
            if (r0 == 0) goto L13
            r0 = r6
            ir.a$b r0 = (ir.C14846a.b) r0
            int r1 = r0.f139089d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139089d = r1
            goto L18
        L13:
            ir.a$b r0 = new ir.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f139087b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f139089d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f139086a
            dr.g r5 = (dr.SubscriptionProductRequest) r5
            kotlin.ResultKt.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            gr.a r6 = r4.subscriptionDataSource
            r0.f139086a = r5
            r0.f139089d = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r6
            cr.j r5 = (cr.SubscriptionDetails) r5
            r4.g(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.C14846a.a(dr.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, kotlin.coroutines.Continuation<? super cr.SubscriptionDetails> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ir.C14846a.c
            if (r0 == 0) goto L13
            r0 = r6
            ir.a$c r0 = (ir.C14846a.c) r0
            int r1 = r0.f139093d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139093d = r1
            goto L18
        L13:
            ir.a$c r0 = new ir.a$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f139091b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f139093d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f139090a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            gr.a r6 = r4.subscriptionDataSource
            r0.f139090a = r5
            r0.f139093d = r3
            java.lang.Object r6 = r6.f(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r6
            cr.j r5 = (cr.SubscriptionDetails) r5
            r4.g(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.C14846a.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super java.util.List<cr.SubscriptionDetails>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ir.C14846a.d
            if (r0 == 0) goto L13
            r0 = r7
            ir.a$d r0 = (ir.C14846a.d) r0
            int r1 = r0.f139096c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139096c = r1
            goto L18
        L13:
            ir.a$d r0 = new ir.a$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f139094a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f139096c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            kotlin.ResultKt.b(r7)
            pv.B<ir.a$a> r7 = r6._subscriptionsFlow
        L37:
            java.lang.Object r2 = r7.getValue()
            r5 = r2
            ir.a$a r5 = (ir.C14846a.SubscriptionsStore) r5
            ir.a$a r5 = ir.C14846a.SubscriptionsStore.g(r5, r4, r3, r4)
            boolean r2 = r7.e(r2, r5)
            if (r2 == 0) goto L37
            gr.a r7 = r6.subscriptionDataSource
            r0.f139096c = r3
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r0 = r7
            java.util.List r0 = (java.util.List) r0
            r1 = 2
            f(r6, r0, r4, r1, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.C14846a.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC16561f<List<SubscriptionDetails>> d() {
        return this.subscriptionsFlow;
    }

    public final void e(List<SubscriptionDetails> subscriptions, Instant timestamp) {
        Intrinsics.j(subscriptions, "subscriptions");
        Intrinsics.j(timestamp, "timestamp");
        InterfaceC16549B<SubscriptionsStore> interfaceC16549B = this._subscriptionsFlow;
        while (!interfaceC16549B.e(interfaceC16549B.getValue(), new SubscriptionsStore(subscriptions, timestamp))) {
        }
    }
}
