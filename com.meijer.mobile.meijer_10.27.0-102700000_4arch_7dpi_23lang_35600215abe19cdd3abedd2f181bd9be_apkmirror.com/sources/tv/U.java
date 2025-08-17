package tv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltv/U;", "T", "Ltv/g;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "<init>", "(Ltv/g;Lkotlin/jvm/functions/Function2;)V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltv/g;", "b", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class U<T> implements InterfaceC17153g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17153g<T> collector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<InterfaceC17153g<? super T>, Continuation<? super Unit>, Object> action;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {HttpResponseStatus.ERROR_UNPROCESSABLE_ENTITY, 426}, m = "onSubscription")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162172a;

        /* renamed from: b, reason: collision with root package name */
        Object f162173b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162174c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ U<T> f162175d;

        /* renamed from: e, reason: collision with root package name */
        int f162176e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U<T> u10, Continuation<? super a> continuation) {
            super(continuation);
            this.f162175d = u10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162174c = obj;
            this.f162176e |= Integer.MIN_VALUE;
            return this.f162175d.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((tv.U) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uv.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof tv.U.a
            if (r0 == 0) goto L13
            r0 = r7
            tv.U$a r0 = (tv.U.a) r0
            int r1 = r0.f162176e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162176e = r1
            goto L18
        L13:
            tv.U$a r0 = new tv.U$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f162174c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162176e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f162173b
            uv.t r2 = (kotlin.C17352t) r2
            java.lang.Object r4 = r0.f162172a
            tv.U r4 = (tv.U) r4
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.ResultKt.b(r7)
            uv.t r2 = new uv.t
            tv.g<T> r7 = r6.collector
            kotlin.coroutines.CoroutineContext r5 = r0.getF142363a()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2<tv.g<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.action     // Catch: java.lang.Throwable -> L40
            r0.f162172a = r6     // Catch: java.lang.Throwable -> L40
            r0.f162173b = r2     // Catch: java.lang.Throwable -> L40
            r0.f162176e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            tv.g<T> r7 = r4.collector
            boolean r2 = r7 instanceof tv.U
            if (r2 == 0) goto L7c
            tv.U r7 = (tv.U) r7
            r2 = 0
            r0.f162172a = r2
            r0.f162173b = r2
            r0.f162176e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        L7c:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.U.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tv.InterfaceC17153g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        return this.collector.emit(t10, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(InterfaceC17153g<? super T> interfaceC17153g, Function2<? super InterfaceC17153g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.collector = interfaceC17153g;
        this.action = function2;
    }
}
