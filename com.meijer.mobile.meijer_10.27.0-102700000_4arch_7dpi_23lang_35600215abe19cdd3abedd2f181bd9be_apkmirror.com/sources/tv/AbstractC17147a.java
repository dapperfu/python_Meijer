package tv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Ltv/a;", "T", "Ltv/f;", "", "<init>", "()V", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tv.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC17147a<T> implements InterfaceC17152f<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    /* renamed from: tv.a$a, reason: collision with other inner class name */
    static final class C2545a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162183a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17147a<T> f162185c;

        /* renamed from: d, reason: collision with root package name */
        int f162186d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2545a(AbstractC17147a<T> abstractC17147a, Continuation<? super C2545a> continuation) {
            super(continuation);
            this.f162185c = abstractC17147a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162184b = obj;
            this.f162186d |= Integer.MIN_VALUE;
            return this.f162185c.collect(null, this);
        }
    }

    public abstract Object g(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tv.InterfaceC17152f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(tv.InterfaceC17153g<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tv.AbstractC17147a.C2545a
            if (r0 == 0) goto L13
            r0 = r7
            tv.a$a r0 = (tv.AbstractC17147a.C2545a) r0
            int r1 = r0.f162186d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162186d = r1
            goto L18
        L13:
            tv.a$a r0 = new tv.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f162184b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162186d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f162183a
            uv.t r6 = (kotlin.C17352t) r6
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.b(r7)
            uv.t r7 = new uv.t
            kotlin.coroutines.CoroutineContext r2 = r0.getF142644a()
            r7.<init>(r6, r2)
            r0.f162183a = r7     // Catch: java.lang.Throwable -> L55
            r0.f162186d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.g(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.AbstractC17147a.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
