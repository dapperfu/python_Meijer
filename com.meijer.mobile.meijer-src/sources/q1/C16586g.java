package q1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Lq1/g;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "scrollBy", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "delta", "", "e", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "()V", "min", "max", "f", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offset", "c", "(I)I", "g", "a", "I", "b", "Lkotlin/jvm/functions/Function2;", "<set-?>", "F", "()F", "scrollAmount", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: q1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16586g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int viewportSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<Float, Continuation<? super Float>, Object> scrollBy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scrollAmount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {296}, m = "scrollBy")
    /* renamed from: q1.g$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157795a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157796b;

        /* renamed from: d, reason: collision with root package name */
        int f157798d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157796b = obj;
            this.f157798d |= Integer.MIN_VALUE;
            return C16586g.this.e(0.0f, this);
        }
    }

    public final void d() {
        this.scrollAmount = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(float r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q1.C16586g.a
            if (r0 == 0) goto L13
            r0 = r6
            q1.g$a r0 = (q1.C16586g.a) r0
            int r1 = r0.f157798d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157798d = r1
            goto L18
        L13:
            q1.g$a r0 = new q1.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f157796b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157798d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f157795a
            q1.g r5 = (q1.C16586g) r5
            kotlin.ResultKt.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> r6 = r4.scrollBy
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.c(r5)
            r0.f157795a = r4
            r0.f157798d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.scrollAmount
            float r0 = r0 + r6
            r5.scrollAmount = r0
            kotlin.Unit r5 = kotlin.Unit.f143329a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C16586g.e(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b, reason: from getter */
    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int c(int offset) {
        return RangesKt.o(offset - MathKt.d(this.scrollAmount), 0, this.viewportSize);
    }

    public final Object f(int i10, int i11, Continuation<? super Unit> continuation) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.viewportSize;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f10 = i10;
        float f11 = this.scrollAmount;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return Unit.f143329a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final Object g(float f10, Continuation<? super Unit> continuation) {
        Object objE = e(f10 - this.scrollAmount, continuation);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16586g(int i10, Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> function2) {
        this.viewportSize = i10;
        this.scrollBy = function2;
    }
}
