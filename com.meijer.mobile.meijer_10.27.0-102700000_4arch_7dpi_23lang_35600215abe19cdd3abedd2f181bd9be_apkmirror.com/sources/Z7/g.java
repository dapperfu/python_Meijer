package Z7;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"LZ7/g;", "", "LZ7/f;", "metricsDataSource", "<init>", "(LZ7/f;)V", "LZ7/d;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metrics", "", "b", "(LZ7/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZ7/f;", "LZ7/d;", "cachedMetrics", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f metricsDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private MetricsDataModel cachedMetrics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsRepository", f = "MetricsRepository.kt", l = {26}, m = "getMetrics")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f42531a;

        /* renamed from: b, reason: collision with root package name */
        Object f42532b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42533c;

        /* renamed from: e, reason: collision with root package name */
        int f42535e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42533c = obj;
            this.f42535e |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsRepository", f = "MetricsRepository.kt", l = {41}, m = "setMetrics")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f42536a;

        /* renamed from: b, reason: collision with root package name */
        Object f42537b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42538c;

        /* renamed from: e, reason: collision with root package name */
        int f42540e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42538c = obj;
            this.f42540e |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    public g(f metricsDataSource) {
        Intrinsics.j(metricsDataSource, "metricsDataSource");
        this.metricsDataSource = metricsDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super Z7.MetricsDataModel> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Z7.g.a
            if (r0 == 0) goto L13
            r0 = r5
            Z7.g$a r0 = (Z7.g.a) r0
            int r1 = r0.f42535e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42535e = r1
            goto L18
        L13:
            Z7.g$a r0 = new Z7.g$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f42533c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f42535e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f42532b
            Z7.g r1 = (Z7.g) r1
            java.lang.Object r0 = r0.f42531a
            Z7.g r0 = (Z7.g) r0
            kotlin.ResultKt.b(r5)
            goto L51
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.ResultKt.b(r5)
            Z7.d r5 = r4.cachedMetrics
            if (r5 != 0) goto L56
            Z7.f r5 = r4.metricsDataSource
            r0.f42531a = r4
            r0.f42532b = r4
            r0.f42535e = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
            r1 = r0
        L51:
            Z7.d r5 = (Z7.MetricsDataModel) r5
            r1.cachedMetrics = r5
            goto L5e
        L56:
            java.lang.String r5 = "dtxStorage"
            java.lang.String r0 = "metrics cache is not empty"
            x8.f.a(r5, r0)
            r0 = r4
        L5e:
            Z7.d r5 = r0.cachedMetrics
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z7.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(Z7.MetricsDataModel r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Z7.g.b
            if (r0 == 0) goto L13
            r0 = r6
            Z7.g$b r0 = (Z7.g.b) r0
            int r1 = r0.f42540e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42540e = r1
            goto L18
        L13:
            Z7.g$b r0 = new Z7.g$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f42538c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f42540e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f42537b
            Z7.d r5 = (Z7.MetricsDataModel) r5
            java.lang.Object r0 = r0.f42536a
            Z7.g r0 = (Z7.g) r0
            kotlin.ResultKt.b(r6)
            goto L54
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.b(r6)
            Z7.d r6 = r4.cachedMetrics
            boolean r6 = kotlin.jvm.internal.Intrinsics.e(r6, r5)
            if (r6 != 0) goto L57
            Z7.f r6 = r4.metricsDataSource
            r0.f42536a = r4
            r0.f42537b = r5
            r0.f42540e = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r4
        L54:
            r0.cachedMetrics = r5
            goto L5e
        L57:
            java.lang.String r5 = "dtxStorage"
            java.lang.String r6 = "metrics are equals, will not be stored"
            x8.f.a(r5, r6)
        L5e:
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z7.g.b(Z7.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
