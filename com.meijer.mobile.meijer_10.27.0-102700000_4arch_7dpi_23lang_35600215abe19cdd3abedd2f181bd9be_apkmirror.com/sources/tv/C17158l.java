package tv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Ltv/f;", "", "destination", "", "b", "(Ltv/f;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "C", "a", "(Ltv/f;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: tv.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C17158l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT}, m = "toCollection")
    /* renamed from: tv.l$a */
    static final class a<T, C extends Collection<? super T>> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162220a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162221b;

        /* renamed from: c, reason: collision with root package name */
        int f162222c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162221b = obj;
            this.f162222c |= Integer.MIN_VALUE;
            return C17154h.b0(null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.l$b */
    static final class b<T> implements InterfaceC17153g {

        /* renamed from: a, reason: collision with root package name */
        /* JADX INFO: Incorrect field signature: TC; */
        final /* synthetic */ Collection f162223a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        b(Collection collection) {
            this.f162223a = collection;
        }

        @Override // tv.InterfaceC17153g
        public final Object emit(T t10, Continuation<? super Unit> continuation) {
            this.f162223a.add(t10);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(tv.InterfaceC17152f<? extends T> r4, C r5, kotlin.coroutines.Continuation<? super C> r6) {
        /*
            boolean r0 = r6 instanceof tv.C17158l.a
            if (r0 == 0) goto L13
            r0 = r6
            tv.l$a r0 = (tv.C17158l.a) r0
            int r1 = r0.f162222c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162222c = r1
            goto L18
        L13:
            tv.l$a r0 = new tv.l$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f162221b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162222c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f162220a
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.ResultKt.b(r6)
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r6)
            tv.l$b r6 = new tv.l$b
            r6.<init>(r5)
            r0.f162220a = r5
            r0.f162222c = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17158l.a(tv.f, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object b(InterfaceC17152f<? extends T> interfaceC17152f, List<T> list, Continuation<? super List<? extends T>> continuation) {
        return C17154h.b0(interfaceC17152f, list, continuation);
    }

    public static /* synthetic */ Object c(InterfaceC17152f interfaceC17152f, List list, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return C17154h.c0(interfaceC17152f, list, continuation);
    }
}
