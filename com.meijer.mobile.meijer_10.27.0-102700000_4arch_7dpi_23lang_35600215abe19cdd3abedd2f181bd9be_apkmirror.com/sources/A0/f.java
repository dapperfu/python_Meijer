package A0;

import f1.C13832e;
import f1.InterfaceC13828a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001Be\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u0002\u00121\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR?\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LA0/f;", "Lf1/a;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pullDelta", "onPull", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "onRelease", "", "enabled", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V", "LU0/f;", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "LH1/y;", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Z", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f implements InterfaceC13828a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Float, Float> onPull;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<Float, Continuation<? super Float>, Object> onRelease;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {98}, m = "onPreFling-QWom1Mo")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        float f51a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f52b;

        /* renamed from: d, reason: collision with root package name */
        int f54d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52b = obj;
            this.f54d |= Integer.MIN_VALUE;
            return f.this.M1(0L, this);
        }
    }

    @Override // f1.InterfaceC13828a
    public long E1(long available, int source) {
        return !this.enabled ? U0.f.INSTANCE.c() : (!C13832e.f(source, C13832e.INSTANCE.d()) || U0.f.n(available) >= 0.0f) ? U0.f.INSTANCE.c() : U0.g.a(0.0f, this.onPull.invoke(Float.valueOf(U0.f.n(available))).floatValue());
    }

    @Override // f1.InterfaceC13828a
    public long L0(long consumed, long available, int source) {
        return !this.enabled ? U0.f.INSTANCE.c() : (!C13832e.f(source, C13832e.INSTANCE.d()) || U0.f.n(available) <= 0.0f) ? U0.f.INSTANCE.c() : U0.g.a(0.0f, this.onPull.invoke(Float.valueOf(U0.f.n(available))).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // f1.InterfaceC13828a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M1(long r5, kotlin.coroutines.Continuation<? super H1.y> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof A0.f.a
            if (r0 == 0) goto L13
            r0 = r7
            A0.f$a r0 = (A0.f.a) r0
            int r1 = r0.f54d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54d = r1
            goto L18
        L13:
            A0.f$a r0 = new A0.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f52b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f54d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.f51a
            kotlin.ResultKt.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> r7 = r4.onRelease
            float r5 = H1.y.i(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.c(r5)
            r6 = 0
            r0.f51a = r6
            r0.f54d = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r6
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = H1.z.a(r5, r6)
            H1.y r5 = H1.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.f.M1(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Function1<? super Float, Float> function1, Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> function2, boolean z10) {
        this.onPull = function1;
        this.onRelease = function2;
        this.enabled = z10;
    }
}
