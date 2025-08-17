package gm;

import eo.C13719g;
import gm.AbstractC14275b;
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
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgm/a;", "", "Leo/g;", "rewardsRepository", "<init>", "(Leo/g;)V", "", "pointBalance", "", "Lgm/b;", "c", "(I)Ljava/util/List;", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Leo/g;", "Ltv/f;", "b", "Ltv/f;", "()Ltv/f;", "homeChipsFlow", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14274a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f133777d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13719g rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<List<AbstractC14275b>> homeChipsFlow;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lgm/a$a;", "", "<init>", "()V", "", "Lgm/b;", "a", "()Ljava/util/List;", "defaultChipList", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<AbstractC14275b> a() {
            return CollectionsKt.p(new AbstractC14275b.MPerks(0), AbstractC14275b.d.f133812e, AbstractC14275b.f.f133816e, AbstractC14275b.e.f133814e, AbstractC14275b.a.f133807e, AbstractC14275b.g.f133818e, AbstractC14275b.C2103b.f133809e);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.header.chips.HomeChipsRepository", f = "HomeChipsRepository.kt", l = {38}, m = "reload")
    /* renamed from: gm.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f133780a;

        /* renamed from: b, reason: collision with root package name */
        Object f133781b;

        /* renamed from: c, reason: collision with root package name */
        Object f133782c;

        /* renamed from: d, reason: collision with root package name */
        Object f133783d;

        /* renamed from: e, reason: collision with root package name */
        int f133784e;

        /* renamed from: f, reason: collision with root package name */
        int f133785f;

        /* renamed from: g, reason: collision with root package name */
        int f133786g;

        /* renamed from: h, reason: collision with root package name */
        int f133787h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f133788i;

        /* renamed from: k, reason: collision with root package name */
        int f133790k;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f133788i = obj;
            this.f133790k |= Integer.MIN_VALUE;
            return C14274a.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gm.a$c */
    public static final class c implements InterfaceC17152f<List<? extends AbstractC14275b>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f133791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14274a f133792b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: gm.a$c$a, reason: collision with other inner class name */
        public static final class C2101a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f133793a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14274a f133794b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.home.ux.header.chips.HomeChipsRepository$special$$inlined$map$1$2", f = "HomeChipsRepository.kt", l = {50}, m = "emit")
            /* renamed from: gm.a$c$a$a, reason: collision with other inner class name */
            public static final class C2102a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f133795a;

                /* renamed from: b, reason: collision with root package name */
                int f133796b;

                /* renamed from: c, reason: collision with root package name */
                Object f133797c;

                /* renamed from: e, reason: collision with root package name */
                Object f133799e;

                /* renamed from: f, reason: collision with root package name */
                Object f133800f;

                /* renamed from: g, reason: collision with root package name */
                Object f133801g;

                /* renamed from: h, reason: collision with root package name */
                int f133802h;

                public C2102a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f133795a = obj;
                    this.f133796b |= Integer.MIN_VALUE;
                    return C2101a.this.emit(null, this);
                }
            }

            public C2101a(InterfaceC17153g interfaceC17153g, C14274a c14274a) {
                this.f133793a = interfaceC17153g;
                this.f133794b = c14274a;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof gm.C14274a.c.C2101a.C2102a
                    if (r0 == 0) goto L13
                    r0 = r7
                    gm.a$c$a$a r0 = (gm.C14274a.c.C2101a.C2102a) r0
                    int r1 = r0.f133796b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f133796b = r1
                    goto L18
                L13:
                    gm.a$c$a$a r0 = new gm.a$c$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f133795a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f133796b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f133801g
                    tv.g r6 = (tv.InterfaceC17153g) r6
                    java.lang.Object r6 = r0.f133799e
                    gm.a$c$a$a r6 = (gm.C14274a.c.C2101a.C2102a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5f
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    tv.g r7 = r5.f133793a
                    r2 = r6
                    java.lang.Number r2 = (java.lang.Number) r2
                    int r2 = r2.intValue()
                    gm.a r4 = r5.f133794b
                    java.util.List r2 = r4.c(r2)
                    r0.f133797c = r6
                    r0.f133799e = r0
                    r0.f133800f = r6
                    r0.f133801g = r7
                    r6 = 0
                    r0.f133802h = r6
                    r0.f133796b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L5f
                    return r1
                L5f:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: gm.C14274a.c.C2101a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC17152f interfaceC17152f, C14274a c14274a) {
            this.f133791a = interfaceC17152f;
            this.f133792b = c14274a;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super List<? extends AbstractC14275b>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f133791a.collect(new C2101a(interfaceC17153g, this.f133792b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    public C14274a(C13719g rewardsRepository) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        this.rewardsRepository = rewardsRepository;
        this.homeChipsFlow = new c(rewardsRepository.s(), this);
    }

    public final InterfaceC17152f<List<AbstractC14275b>> b() {
        return this.homeChipsFlow;
    }

    public final List<AbstractC14275b> c(int pointBalance) {
        return CollectionsKt.p(new AbstractC14275b.MPerks(pointBalance), AbstractC14275b.d.f133812e, AbstractC14275b.f.f133816e, AbstractC14275b.e.f133814e, AbstractC14275b.a.f133807e, AbstractC14275b.g.f133818e, AbstractC14275b.C2103b.f133809e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gm.C14274a.b
            if (r0 == 0) goto L13
            r0 = r6
            gm.a$b r0 = (gm.C14274a.b) r0
            int r1 = r0.f133790k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133790k = r1
            goto L18
        L13:
            gm.a$b r0 = new gm.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f133788i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f133790k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f133783d
            gm.a r1 = (gm.C14274a) r1
            java.lang.Object r1 = r0.f133782c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f133781b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f133780a
            gm.a r1 = (gm.C14274a) r1
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
            eo.g r6 = a(r5)     // Catch: java.lang.Exception -> L3a
            r0.f133780a = r5     // Catch: java.lang.Exception -> L3a
            r0.f133781b = r0     // Catch: java.lang.Exception -> L3a
            r0.f133782c = r0     // Catch: java.lang.Exception -> L3a
            r0.f133783d = r5     // Catch: java.lang.Exception -> L3a
            r0.f133784e = r4     // Catch: java.lang.Exception -> L3a
            r0.f133785f = r4     // Catch: java.lang.Exception -> L3a
            r0.f133786g = r4     // Catch: java.lang.Exception -> L3a
            r0.f133787h = r4     // Catch: java.lang.Exception -> L3a
            r0.f133790k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.p(r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L66
            return r1
        L66:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L7c:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto L8b
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "Failed to reload home chips."
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.f(r6, r1, r2)
        L8b:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gm.C14274a.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
