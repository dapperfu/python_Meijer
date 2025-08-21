package hm;

import hm.AbstractC14537b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhm/a;", "", "Lfo/e;", "rewardsRepository", "<init>", "(Lfo/e;)V", "", "pointBalance", "", "Lhm/b;", "c", "(I)Ljava/util/List;", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lfo/e;", "Lpv/f;", "b", "Lpv/f;", "()Lpv/f;", "homeChipsFlow", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hm.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14536a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f135843d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fo.e rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<List<AbstractC14537b>> homeChipsFlow;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhm/a$a;", "", "<init>", "()V", "", "Lhm/b;", "a", "()Ljava/util/List;", "defaultChipList", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<AbstractC14537b> a() {
            return CollectionsKt.p(new AbstractC14537b.MPerks(0), AbstractC14537b.e.f135880g, AbstractC14537b.g.f135884g, AbstractC14537b.f.f135882g, AbstractC14537b.C2144b.f135875g, AbstractC14537b.h.f135886g, AbstractC14537b.c.f135877g);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.header.chips.HomeChipsRepository", f = "HomeChipsRepository.kt", l = {38}, m = "reload")
    /* renamed from: hm.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f135846a;

        /* renamed from: b, reason: collision with root package name */
        Object f135847b;

        /* renamed from: c, reason: collision with root package name */
        Object f135848c;

        /* renamed from: d, reason: collision with root package name */
        Object f135849d;

        /* renamed from: e, reason: collision with root package name */
        int f135850e;

        /* renamed from: f, reason: collision with root package name */
        int f135851f;

        /* renamed from: g, reason: collision with root package name */
        int f135852g;

        /* renamed from: h, reason: collision with root package name */
        int f135853h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f135854i;

        /* renamed from: k, reason: collision with root package name */
        int f135856k;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135854i = obj;
            this.f135856k |= Integer.MIN_VALUE;
            return C14536a.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hm.a$c */
    public static final class c implements InterfaceC16561f<List<? extends AbstractC14537b>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f135857a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14536a f135858b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hm.a$c$a, reason: collision with other inner class name */
        public static final class C2142a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f135859a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14536a f135860b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.home.ux.header.chips.HomeChipsRepository$special$$inlined$map$1$2", f = "HomeChipsRepository.kt", l = {50}, m = "emit")
            /* renamed from: hm.a$c$a$a, reason: collision with other inner class name */
            public static final class C2143a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135861a;

                /* renamed from: b, reason: collision with root package name */
                int f135862b;

                /* renamed from: c, reason: collision with root package name */
                Object f135863c;

                /* renamed from: e, reason: collision with root package name */
                Object f135865e;

                /* renamed from: f, reason: collision with root package name */
                Object f135866f;

                /* renamed from: g, reason: collision with root package name */
                Object f135867g;

                /* renamed from: h, reason: collision with root package name */
                int f135868h;

                public C2143a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135861a = obj;
                    this.f135862b |= Integer.MIN_VALUE;
                    return C2142a.this.emit(null, this);
                }
            }

            public C2142a(InterfaceC16562g interfaceC16562g, C14536a c14536a) {
                this.f135859a = interfaceC16562g;
                this.f135860b = c14536a;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hm.C14536a.c.C2142a.C2143a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hm.a$c$a$a r0 = (hm.C14536a.c.C2142a.C2143a) r0
                    int r1 = r0.f135862b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135862b = r1
                    goto L18
                L13:
                    hm.a$c$a$a r0 = new hm.a$c$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f135861a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135862b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f135867g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f135865e
                    hm.a$c$a$a r6 = (hm.C14536a.c.C2142a.C2143a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5f
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f135859a
                    r2 = r6
                    java.lang.Number r2 = (java.lang.Number) r2
                    int r2 = r2.intValue()
                    hm.a r4 = r5.f135860b
                    java.util.List r2 = r4.c(r2)
                    r0.f135863c = r6
                    r0.f135865e = r0
                    r0.f135866f = r6
                    r0.f135867g = r7
                    r6 = 0
                    r0.f135868h = r6
                    r0.f135862b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hm.C14536a.c.C2142a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC16561f interfaceC16561f, C14536a c14536a) {
            this.f135857a = interfaceC16561f;
            this.f135858b = c14536a;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super List<? extends AbstractC14537b>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f135857a.collect(new C2142a(interfaceC16562g, this.f135858b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    public C14536a(fo.e rewardsRepository) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        this.rewardsRepository = rewardsRepository;
        this.homeChipsFlow = new c(rewardsRepository.n(), this);
    }

    public final InterfaceC16561f<List<AbstractC14537b>> b() {
        return this.homeChipsFlow;
    }

    public final List<AbstractC14537b> c(int pointBalance) {
        return CollectionsKt.p(new AbstractC14537b.MPerks(pointBalance), AbstractC14537b.e.f135880g, AbstractC14537b.g.f135884g, AbstractC14537b.f.f135882g, AbstractC14537b.C2144b.f135875g, AbstractC14537b.h.f135886g, AbstractC14537b.c.f135877g);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hm.C14536a.b
            if (r0 == 0) goto L13
            r0 = r6
            hm.a$b r0 = (hm.C14536a.b) r0
            int r1 = r0.f135856k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135856k = r1
            goto L18
        L13:
            hm.a$b r0 = new hm.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f135854i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f135856k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f135849d
            hm.a r1 = (hm.C14536a) r1
            java.lang.Object r1 = r0.f135848c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f135847b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f135846a
            hm.a r1 = (hm.C14536a) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L66
        L3a:
            r6 = move-exception
            goto L6b
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L44:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            fo.e r6 = a(r5)     // Catch: java.lang.Exception -> L3a
            r0.f135846a = r5     // Catch: java.lang.Exception -> L3a
            r0.f135847b = r0     // Catch: java.lang.Exception -> L3a
            r0.f135848c = r0     // Catch: java.lang.Exception -> L3a
            r0.f135849d = r5     // Catch: java.lang.Exception -> L3a
            r0.f135850e = r4     // Catch: java.lang.Exception -> L3a
            r0.f135851f = r4     // Catch: java.lang.Exception -> L3a
            r0.f135852g = r4     // Catch: java.lang.Exception -> L3a
            r0.f135853h = r4     // Catch: java.lang.Exception -> L3a
            r0.f135856k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.l(r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L66
            return r1
        L66:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L7c:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto L8b
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "Failed to reload home chips."
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.f(r6, r1, r2)
        L8b:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.C14536a.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
