package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0083@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/F;", "Landroidx/privacysandbox/ads/adservices/topics/u;", "Landroid/adservices/topics/TopicsManager;", "mTopicsManager", "<init>", "(Landroid/adservices/topics/TopicsManager;)V", "Landroid/adservices/topics/GetTopicsRequest;", "getTopicsRequest", "Landroid/adservices/topics/GetTopicsResponse;", "f", "(Landroid/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/topics/b;", "request", "Landroidx/privacysandbox/ads/adservices/topics/h;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Landroidx/privacysandbox/ads/adservices/topics/b;)Landroid/adservices/topics/GetTopicsRequest;", "response", "d", "(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/h;", "b", "Landroid/adservices/topics/TopicsManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
@SourceDebugExtension
/* loaded from: classes4.dex */
public class F extends u {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TopicsManager mTopicsManager;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f57766a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f57767b;

        /* renamed from: d, reason: collision with root package name */
        int f57769d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57767b = obj;
            this.f57769d |= Integer.MIN_VALUE;
            return F.e(F.this, null, this);
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.u
    public Object a(C6103b c6103b, Continuation<? super h> continuation) {
        return e(this, c6103b, continuation);
    }

    public F(TopicsManager mTopicsManager) {
        Intrinsics.j(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.F r4, androidx.privacysandbox.ads.adservices.topics.C6103b r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.h> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.F.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.F$a r0 = (androidx.privacysandbox.ads.adservices.topics.F.a) r0
            int r1 = r0.f57769d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57769d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.F$a r0 = new androidx.privacysandbox.ads.adservices.topics.F$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f57767b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f57769d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f57766a
            androidx.privacysandbox.ads.adservices.topics.F r4 = (androidx.privacysandbox.ads.adservices.topics.F) r4
            kotlin.ResultKt.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f57766a = r4
            r0.f57769d = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.D.a(r6)
            androidx.privacysandbox.ads.adservices.topics.h r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.F.e(androidx.privacysandbox.ads.adservices.topics.F, androidx.privacysandbox.ads.adservices.topics.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        this.mTopicsManager.getTopics(getTopicsRequest, new androidx.privacysandbox.ads.adservices.measurement.k(), j2.m.a(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    public GetTopicsRequest c(C6103b request) {
        Intrinsics.j(request, "request");
        return g.f57777a.b(request);
    }

    public h d(GetTopicsResponse response) {
        Intrinsics.j(response, "response");
        return s.f57780a.a(response);
    }
}
