package kotlin;

import kotlin.C6330m;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.q0;
import kotlin.r0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u000f\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lf0/S;", "", "Lc0/i;", "", "animationSpec", "<init>", "(Lc0/i;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "valueDelta", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "h", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/r0;", "Lc0/m;", "a", "Lc0/r0;", "vectorizedSpec", "", "b", "J", "lastFrameTime", "c", "Lc0/m;", "lastVelocity", "", "d", "Z", "isRunning", "e", "F", "i", "()F", "j", "(F)V", "value", "f", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13800S {

    /* renamed from: f, reason: collision with root package name */
    private static final a f130281f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f130282g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final C6330m f130283h = new C6330m(0.0f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0<C6330m> vectorizedSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTime = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C6330m lastVelocity = f130283h;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRunning;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float value;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf0/S$a;", "", "<init>", "()V", "", "", "b", "(F)Z", "Lc0/m;", "ZeroVector", "Lc0/m;", "a", "()Lc0/m;", "VisibilityThreshold", "F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.S$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        public final C6330m a() {
            return C13800S.f130283h;
        }

        public final boolean b(float f10) {
            if (Math.abs(f10) < 0.01f) {
                return true;
            }
            return false;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {102, 153}, m = "animateToZero")
    /* renamed from: f0.S$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130289a;

        /* renamed from: b, reason: collision with root package name */
        Object f130290b;

        /* renamed from: c, reason: collision with root package name */
        Object f130291c;

        /* renamed from: d, reason: collision with root package name */
        float f130292d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f130293e;

        /* renamed from: g, reason: collision with root package name */
        int f130295g;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130293e = obj;
            this.f130295g |= Integer.MIN_VALUE;
            return C13800S.this.h(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.S$c */
    static final class c extends Lambda implements Function1<Long, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f130297g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f130298h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(float f10, Function1<? super Float, Unit> function1) {
            super(1);
            this.f130297g = f10;
            this.f130298h = function1;
        }

        public final void a(long j10) {
            if (C13800S.this.lastFrameTime == Long.MIN_VALUE) {
                C13800S.this.lastFrameTime = j10;
            }
            C6330m c6330m = new C6330m(C13800S.this.getValue());
            long jB = this.f130297g == 0.0f ? C13800S.this.vectorizedSpec.b(new C6330m(C13800S.this.getValue()), C13800S.f130281f.a(), C13800S.this.lastVelocity) : MathKt.f((j10 - C13800S.this.lastFrameTime) / this.f130297g);
            float value = ((C6330m) C13800S.this.vectorizedSpec.d(jB, c6330m, C13800S.f130281f.a(), C13800S.this.lastVelocity)).getValue();
            C13800S c13800s = C13800S.this;
            c13800s.lastVelocity = (C6330m) c13800s.vectorizedSpec.f(jB, c6330m, C13800S.f130281f.a(), C13800S.this.lastVelocity);
            C13800S.this.lastFrameTime = j10;
            float value2 = C13800S.this.getValue() - value;
            C13800S.this.j(value);
            this.f130298h.invoke(Float.valueOf(value2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.S$d */
    static final class d extends Lambda implements Function1<Long, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f130300g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super Float, Unit> function1) {
            super(1);
            this.f130300g = function1;
        }

        public final void a(long j10) {
            float value = C13800S.this.getValue();
            C13800S.this.j(0.0f);
            this.f130300g.invoke(Float.valueOf(value));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (androidx.compose.runtime.C5712d0.c(r0, r2) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[Catch: all -> 0x00b3, PHI: r0 r2 r12 r13 r14
      0x0087: PHI (r0v9 kotlin.jvm.functions.Function0) = (r0v3 kotlin.jvm.functions.Function0), (r0v10 kotlin.jvm.functions.Function0) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v4 f0.S$b) = (r2v2 f0.S$b), (r2v5 f0.S$b) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r12v6 float) = (r12v3 float), (r12v7 float) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r13v6 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r13v3 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r14v16 f0.S) = (r14v9 f0.S), (r14v17 f0.S) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[PHI: r0 r2 r13 r14
      0x00ae: PHI (r0v4 kotlin.jvm.functions.Function0) = (r0v9 kotlin.jvm.functions.Function0), (r0v10 kotlin.jvm.functions.Function0) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r2v3 f0.S$b) = (r2v4 f0.S$b), (r2v5 f0.S$b) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r13v4 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r13v6 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r14v12 f0.S) = (r14v16 f0.S), (r14v17 f0.S) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:54:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r12, kotlin.jvm.functions.Function0<kotlin.Unit> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13800S.h(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: i, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final void j(float f10) {
        this.value = f10;
    }

    public C13800S(InterfaceC6326i<Float> interfaceC6326i) {
        this.vectorizedSpec = interfaceC6326i.a(q0.i(FloatCompanionObject.f142822a));
    }
}
