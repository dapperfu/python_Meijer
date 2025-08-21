package mv;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a$\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "", "Lmv/W;", "deferreds", "", "b", "([Lmv/W;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmv/C0;", "jobs", "", "c", "([Lmv/C0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15799f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {47}, m = "joinAll")
    /* renamed from: mv.f$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151726a;

        /* renamed from: b, reason: collision with root package name */
        int f151727b;

        /* renamed from: c, reason: collision with root package name */
        int f151728c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f151729d;

        /* renamed from: e, reason: collision with root package name */
        int f151730e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151729d = obj;
            this.f151730e |= Integer.MIN_VALUE;
            return C15799f.c(null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    public static final <T> Object b(W<? extends T>[] wArr, Continuation<? super List<? extends T>> continuation) {
        return wArr.length == 0 ? CollectionsKt.m() : new C15797e(wArr).c(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(mv.C0[] r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof mv.C15799f.a
            if (r0 == 0) goto L13
            r0 = r7
            mv.f$a r0 = (mv.C15799f.a) r0
            int r1 = r0.f151730e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151730e = r1
            goto L18
        L13:
            mv.f$a r0 = new mv.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f151729d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151730e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f151728c
            int r2 = r0.f151727b
            java.lang.Object r4 = r0.f151726a
            mv.C0[] r4 = (mv.C0[]) r4
            kotlin.ResultKt.b(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.ResultKt.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f151726a = r7
            r0.f151727b = r2
            r0.f151728c = r6
            r0.f151730e = r3
            java.lang.Object r4 = r4.o0(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.C15799f.c(mv.C0[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object a(Collection<? extends W<? extends T>> collection, Continuation<? super List<? extends T>> continuation) {
        if (collection.isEmpty()) {
            return CollectionsKt.m();
        }
        return new C15797e((W[]) collection.toArray(new W[0])).c(continuation);
    }
}
