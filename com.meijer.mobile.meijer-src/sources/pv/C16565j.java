package pv;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"T", "Lpv/g;", "Lov/v;", "channel", "", "c", "(Lpv/g;Lov/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consume", "d", "(Lpv/g;Lov/v;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpv/f;", "e", "(Lov/v;)Lpv/f;", "b", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: pv.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16565j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {l3.f93325e, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: pv.j$a */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157526a;

        /* renamed from: b, reason: collision with root package name */
        Object f157527b;

        /* renamed from: c, reason: collision with root package name */
        Object f157528c;

        /* renamed from: d, reason: collision with root package name */
        boolean f157529d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157530e;

        /* renamed from: f, reason: collision with root package name */
        int f157531f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157530e = obj;
            this.f157531f |= Integer.MIN_VALUE;
            return C16565j.d(null, null, false, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    public static final <T> Object c(InterfaceC16562g<? super T> interfaceC16562g, ov.v<? extends T> vVar, Continuation<? super Unit> continuation) {
        Object objD = d(interfaceC16562g, vVar, true, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    public static final <T> InterfaceC16561f<T> b(ov.v<? extends T> vVar) {
        return new C16558c(vVar, true, null, 0, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pv.g] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(pv.InterfaceC16562g<? super T> r6, ov.v<? extends T> r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof pv.C16565j.a
            if (r0 == 0) goto L13
            r0 = r9
            pv.j$a r0 = (pv.C16565j.a) r0
            int r1 = r0.f157531f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157531f = r1
            goto L18
        L13:
            pv.j$a r0 = new pv.j$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f157530e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157531f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f157529d
            java.lang.Object r6 = r0.f157528c
            ov.i r6 = (ov.i) r6
            java.lang.Object r7 = r0.f157527b
            ov.v r7 = (ov.v) r7
            java.lang.Object r2 = r0.f157526a
            pv.g r2 = (pv.InterfaceC16562g) r2
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f157529d
            java.lang.Object r6 = r0.f157528c
            ov.i r6 = (ov.i) r6
            java.lang.Object r7 = r0.f157527b
            ov.v r7 = (ov.v) r7
            java.lang.Object r2 = r0.f157526a
            pv.g r2 = (pv.InterfaceC16562g) r2
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            kotlin.ResultKt.b(r9)
            pv.C16563h.y(r6)
            ov.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f157526a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f157527b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f157528c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f157529d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f157531f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f157526a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f157527b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f157528c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f157529d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f157531f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            ov.n.a(r7, r6)
        L9a:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            ov.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16565j.d(pv.g, ov.v, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> InterfaceC16561f<T> e(ov.v<? extends T> vVar) {
        return new C16558c(vVar, false, null, 0, null, 28, null);
    }
}
