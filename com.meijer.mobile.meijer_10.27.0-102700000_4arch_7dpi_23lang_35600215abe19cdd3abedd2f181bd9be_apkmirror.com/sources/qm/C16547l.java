package qm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rm.StoreDetails;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqm/l;", "Lqm/e;", "Lqm/b;", "storeDataSource", "<init>", "(Lqm/b;)V", "", "Lrm/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "", "searchRadiusInMiles", "maxStores", "c", "(DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqm/b;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qm.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16547l implements InterfaceC16540e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16537b storeDataSource;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.store.StoreRepositoryImpl", f = "StoreRepositoryImpl.kt", l = {38}, m = "getNearbyShopAndScanStores")
    /* renamed from: qm.l$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        double f157326a;

        /* renamed from: b, reason: collision with root package name */
        double f157327b;

        /* renamed from: c, reason: collision with root package name */
        int f157328c;

        /* renamed from: d, reason: collision with root package name */
        int f157329d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157330e;

        /* renamed from: g, reason: collision with root package name */
        int f157332g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157330e = obj;
            this.f157332g |= Integer.MIN_VALUE;
            return C16547l.this.c(0.0d, 0.0d, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.store.StoreRepositoryImpl", f = "StoreRepositoryImpl.kt", l = {20}, m = "getShopAndScanStores")
    /* renamed from: qm.l$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f157333a;

        /* renamed from: c, reason: collision with root package name */
        int f157335c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157333a = obj;
            this.f157335c |= Integer.MIN_VALUE;
            return C16547l.this.a(this);
        }
    }

    public C16547l(C16537b storeDataSource) {
        Intrinsics.j(storeDataSource, "storeDataSource");
        this.storeDataSource = storeDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable j(StoreDetails store) {
        Intrinsics.j(store, "store");
        return Boolean.valueOf(!store.getIsLabStore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable k(StoreDetails store) {
        Intrinsics.j(store, "store");
        return Integer.valueOf(store.getState().getSortOrder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable l(StoreDetails store) {
        Intrinsics.j(store, "store");
        return store.getStoreShortName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable m(StoreDetails store) {
        Intrinsics.j(store, "store");
        return Boolean.valueOf(!store.getIsLabStore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable n(StoreDetails store) {
        Intrinsics.j(store, "store");
        return Integer.valueOf(store.getState().getSortOrder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable o(StoreDetails store) {
        Intrinsics.j(store, "store");
        return store.getStoreShortName();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qm.InterfaceC16540e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super java.util.List<rm.StoreDetails>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qm.C16547l.b
            if (r0 == 0) goto L13
            r0 = r7
            qm.l$b r0 = (qm.C16547l.b) r0
            int r1 = r0.f157335c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157335c = r1
            goto L18
        L13:
            qm.l$b r0 = new qm.l$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f157333a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157335c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.b(r7)
            qm.b r7 = r6.storeDataSource
            r0.f157335c = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.meijer.mobile.instoreshopping.service.store.models.SearchStoresResponse r7 = (com.meijer.mobile.instoreshopping.service.store.models.SearchStoresResponse) r7
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.x(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L56:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r7.next()
            com.meijer.mobile.instoreshopping.service.store.models.StoreDetailsItemResponse r1 = (com.meijer.mobile.instoreshopping.service.store.models.StoreDetailsItemResponse) r1
            rm.a$a r2 = rm.StoreDetails.INSTANCE
            rm.a r1 = r2.a(r1)
            r0.add(r1)
            goto L56
        L6c:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()
            r2 = r1
            rm.a r2 = (rm.StoreDetails) r2
            boolean r2 = r2.getIsShopAndScanEnabledStore()
            if (r2 == 0) goto L75
            r7.add(r1)
            goto L75
        L8c:
            qm.f r0 = new qm.f
            r0.<init>()
            qm.g r1 = new qm.g
            r1.<init>()
            qm.h r2 = new qm.h
            r2.<init>()
            r4 = 3
            kotlin.jvm.functions.Function1[] r4 = new kotlin.jvm.functions.Function1[r4]
            r5 = 0
            r4[r5] = r0
            r4[r3] = r1
            r0 = 2
            r4[r0] = r2
            java.util.Comparator r0 = kotlin.comparisons.ComparisonsKt.b(r4)
            java.util.List r7 = kotlin.collections.CollectionsKt.Z0(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.C16547l.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // qm.InterfaceC16540e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(double r12, double r14, int r16, int r17, kotlin.coroutines.Continuation<? super java.util.List<rm.StoreDetails>> r18) {
        /*
            r11 = this;
            r0 = r18
            boolean r1 = r0 instanceof qm.C16547l.a
            if (r1 == 0) goto L16
            r1 = r0
            qm.l$a r1 = (qm.C16547l.a) r1
            int r2 = r1.f157332g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f157332g = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            qm.l$a r1 = new qm.l$a
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.f157330e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r9.f157332g
            r10 = 1
            if (r2 == 0) goto L35
            if (r2 != r10) goto L2d
            kotlin.ResultKt.b(r0)
            goto L51
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.ResultKt.b(r0)
            qm.b r2 = r11.storeDataSource
            r9.f157326a = r12
            r9.f157327b = r14
            r7 = r16
            r9.f157328c = r7
            r8 = r17
            r9.f157329d = r8
            r9.f157332g = r10
            r3 = r12
            r5 = r14
            java.lang.Object r0 = r2.d(r3, r5, r7, r8, r9)
            if (r0 != r1) goto L51
            return r1
        L51:
            com.meijer.mobile.instoreshopping.service.store.models.SearchStoresResponse r0 = (com.meijer.mobile.instoreshopping.service.store.models.SearchStoresResponse) r0
            java.util.List r12 = r0.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = kotlin.collections.CollectionsKt.x(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L68:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L7e
            java.lang.Object r14 = r12.next()
            com.meijer.mobile.instoreshopping.service.store.models.StoreDetailsItemResponse r14 = (com.meijer.mobile.instoreshopping.service.store.models.StoreDetailsItemResponse) r14
            rm.a$a r15 = rm.StoreDetails.INSTANCE
            rm.a r14 = r15.a(r14)
            r13.add(r14)
            goto L68
        L7e:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r13.iterator()
        L87:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L9e
            java.lang.Object r14 = r13.next()
            r15 = r14
            rm.a r15 = (rm.StoreDetails) r15
            boolean r15 = r15.getIsShopAndScanEnabledStore()
            if (r15 == 0) goto L87
            r12.add(r14)
            goto L87
        L9e:
            qm.i r13 = new qm.i
            r13.<init>()
            qm.j r14 = new qm.j
            r14.<init>()
            qm.k r15 = new qm.k
            r15.<init>()
            r0 = 3
            kotlin.jvm.functions.Function1[] r0 = new kotlin.jvm.functions.Function1[r0]
            r1 = 0
            r0[r1] = r13
            r0[r10] = r14
            r13 = 2
            r0[r13] = r15
            java.util.Comparator r13 = kotlin.comparisons.ComparisonsKt.b(r0)
            java.util.List r12 = kotlin.collections.CollectionsKt.Z0(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.C16547l.c(double, double, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
