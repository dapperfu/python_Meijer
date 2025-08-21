package mv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension
/* renamed from: mv.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C15807j {
    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        return C15805i.e(coroutineContext, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T a(kotlin.coroutines.CoroutineContext r4, kotlin.jvm.functions.Function2<? super mv.InterfaceC15783O, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5) throws java.lang.InterruptedException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r1 = r4.g(r1)
            kotlin.coroutines.ContinuationInterceptor r1 = (kotlin.coroutines.ContinuationInterceptor) r1
            if (r1 != 0) goto L1f
            mv.a1 r1 = mv.a1.f151702a
            mv.l0 r1 = r1.b()
            mv.v0 r2 = mv.C15832v0.f151773a
            kotlin.coroutines.CoroutineContext r4 = r4.n0(r1)
            kotlin.coroutines.CoroutineContext r4 = mv.C15777I.k(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof mv.AbstractC15812l0
            r3 = 0
            if (r2 == 0) goto L27
            mv.l0 r1 = (mv.AbstractC15812l0) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.j1()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            mv.a1 r1 = mv.a1.f151702a
            mv.l0 r1 = r1.a()
        L3c:
            mv.v0 r2 = mv.C15832v0.f151773a
            kotlin.coroutines.CoroutineContext r4 = mv.C15777I.k(r2, r4)
        L42:
            mv.g r2 = new mv.g
            r2.<init>(r4, r0, r1)
            mv.Q r4 = mv.EnumC15785Q.f151685a
            r2.i1(r4, r2, r5)
            java.lang.Object r4 = r2.j1()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.C15807j.a(kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function2):java.lang.Object");
    }
}
