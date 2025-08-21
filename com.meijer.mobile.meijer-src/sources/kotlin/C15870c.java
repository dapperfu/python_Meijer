package kotlin;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.S;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln0/c;", "Landroidx/compose/ui/layout/S;", "<init>", "()V", "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "b", "Z", "wasPositioned", "Lkotlin/coroutines/Continuation;", "c", "Lkotlin/coroutines/Continuation;", "continuation", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15870c implements S {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean wasPositioned;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Continuation<? super Unit> continuation;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {49}, m = "waitForFirstLayout")
    /* renamed from: n0.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151920a;

        /* renamed from: b, reason: collision with root package name */
        Object f151921b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f151922c;

        /* renamed from: e, reason: collision with root package name */
        int f151924e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151922c = obj;
            this.f151924e |= Integer.MIN_VALUE;
            return C15870c.this.e(this);
        }
    }

    @Override // androidx.compose.ui.layout.S
    public void O(LayoutCoordinates coordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        Continuation<? super Unit> continuation = this.continuation;
        if (continuation != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.b(Unit.f143329a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.C15870c.a
            if (r0 == 0) goto L13
            r0 = r6
            n0.c$a r0 = (kotlin.C15870c.a) r0
            int r1 = r0.f151924e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151924e = r1
            goto L18
        L13:
            n0.c$a r0 = new n0.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f151922c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151924e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f151921b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r0.f151920a
            n0.c r0 = (kotlin.C15870c) r0
            kotlin.ResultKt.b(r6)
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.wasPositioned
            if (r6 != 0) goto L75
            kotlin.coroutines.Continuation<? super kotlin.Unit> r6 = r5.continuation
            r0.f151920a = r5
            r0.f151921b = r6
            r0.f151924e = r3
            mv.p r2 = new mv.p
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r2.<init>(r4, r3)
            r2.C()
            b(r5, r2)
            java.lang.Object r2 = r2.u()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r2 != r3) goto L64
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L64:
            if (r2 != r1) goto L67
            return r1
        L67:
            r1 = r6
        L68:
            if (r1 == 0) goto L75
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            kotlin.Unit r6 = kotlin.Unit.f143329a
            java.lang.Object r6 = kotlin.Result.b(r6)
            r1.resumeWith(r6)
        L75:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C15870c.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
