package pv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpv/U;", "T", "Lpv/g;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "<init>", "(Lpv/g;Lkotlin/jvm/functions/Function2;)V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpv/g;", "b", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class U<T> implements InterfaceC16562g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16562g<T> collector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<InterfaceC16562g<? super T>, Continuation<? super Unit>, Object> action;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {HttpResponseStatus.ERROR_UNPROCESSABLE_ENTITY, 426}, m = "onSubscription")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157486a;

        /* renamed from: b, reason: collision with root package name */
        Object f157487b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f157488c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ U<T> f157489d;

        /* renamed from: e, reason: collision with root package name */
        int f157490e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U<T> u10, Continuation<? super a> continuation) {
            super(continuation);
            this.f157489d = u10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157488c = obj;
            this.f157490e |= Integer.MIN_VALUE;
            return this.f157489d.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((pv.U) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [qv.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof pv.U.a
            if (r0 == 0) goto L13
            r0 = r7
            pv.U$a r0 = (pv.U.a) r0
            int r1 = r0.f157490e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157490e = r1
            goto L18
        L13:
            pv.U$a r0 = new pv.U$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f157488c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157490e
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
            java.lang.Object r2 = r0.f157487b
            qv.t r2 = (kotlin.C16788t) r2
            java.lang.Object r4 = r0.f157486a
            pv.U r4 = (pv.U) r4
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.ResultKt.b(r7)
            qv.t r2 = new qv.t
            pv.g<T> r7 = r6.collector
            kotlin.coroutines.CoroutineContext r5 = r0.getF143270a()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2<pv.g<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.action     // Catch: java.lang.Throwable -> L40
            r0.f157486a = r6     // Catch: java.lang.Throwable -> L40
            r0.f157487b = r2     // Catch: java.lang.Throwable -> L40
            r0.f157490e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            pv.g<T> r7 = r4.collector
            boolean r2 = r7 instanceof pv.U
            if (r2 == 0) goto L7c
            pv.U r7 = (pv.U) r7
            r2 = 0
            r0.f157486a = r2
            r0.f157487b = r2
            r0.f157490e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        L7c:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.U.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pv.InterfaceC16562g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        return this.collector.emit(t10, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(InterfaceC16562g<? super T> interfaceC16562g, Function2<? super InterfaceC16562g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.collector = interfaceC16562g;
        this.action = function2;
    }
}
