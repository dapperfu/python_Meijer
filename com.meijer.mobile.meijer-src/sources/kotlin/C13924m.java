package kotlin;

import androidx.compose.ui.platform.Q1;
import g1.C14296A;
import g1.C14314q;
import g1.InterfaceC14300c;
import g1.J;
import g1.O;
import g1.PointerInputChange;
import g1.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0082\u0001\u0010\u0017\u001a\u00020\u0005*\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f26\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001aâ\u0001\u0010 \u001a\u00020\u0005*\u00020\f2K\u0010\u000e\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00050\u00192!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e26\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0080@¢\u0006\u0004\b \u0010!\u001a\u0082\u0001\u0010\"\u001a\u00020\u0005*\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f26\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0086@¢\u0006\u0004\b\"\u0010\u0018\u001a&\u0010&\u001a\u00020\u0007*\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H\u0080@¢\u0006\u0004\b&\u0010'\u001a!\u0010(\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u000b\u001a\u001e\u0010*\u001a\u00020\u0007*\u00020)2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001e\u00100\u001a\u00020/*\u00020,2\u0006\u0010.\u001a\u00020-H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00106\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00104\"\u0014\u00107\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lg1/c;", "Lg1/A;", "pointerId", "Lkotlin/Function1;", "Lg1/B;", "", "onDrag", "", "i", "(Lg1/c;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lg1/c;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg1/J;", "LU0/f;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "dragAmount", "e", "(Lg1/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "down", "slopTriggerChange", "overSlopOffset", "shouldAwaitTouchSlop", "Lf0/z;", "orientationLock", "f", "(Lg1/J;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lf0/z;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "initialPositionChange", "Lg1/s;", "pass", "b", "(Lg1/c;Lg1/B;Lg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lg1/q;", "j", "(Lg1/q;J)Z", "Landroidx/compose/ui/platform/Q1;", "Lg1/O;", "pointerType", "", "k", "(Landroidx/compose/ui/platform/Q1;I)F", "LH1/h;", "a", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13924m {

    /* renamed from: a, reason: collision with root package name */
    private static final float f131267a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f131268b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f131269c;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {851}, m = "awaitAllPointersUpWithSlopDetection")
    /* renamed from: f0.m$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131270a;

        /* renamed from: b, reason: collision with root package name */
        Object f131271b;

        /* renamed from: c, reason: collision with root package name */
        Object f131272c;

        /* renamed from: d, reason: collision with root package name */
        Object f131273d;

        /* renamed from: e, reason: collision with root package name */
        int f131274e;

        /* renamed from: f, reason: collision with root package name */
        float f131275f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f131276g;

        /* renamed from: h, reason: collision with root package name */
        int f131277h;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131276g = obj;
            this.f131277h |= Integer.MIN_VALUE;
            return C13924m.b(null, null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1048}, m = "awaitDragOrCancellation-rnUCldI")
    /* renamed from: f0.m$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131278a;

        /* renamed from: b, reason: collision with root package name */
        Object f131279b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f131280c;

        /* renamed from: d, reason: collision with root package name */
        int f131281d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131280c = obj;
            this.f131281d |= Integer.MIN_VALUE;
            return C13924m.c(null, 0L, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {968}, m = "awaitLongPressOrCancellation-rnUCldI")
    /* renamed from: f0.m$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131282a;

        /* renamed from: b, reason: collision with root package name */
        Object f131283b;

        /* renamed from: c, reason: collision with root package name */
        Object f131284c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f131285d;

        /* renamed from: e, reason: collision with root package name */
        int f131286e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131285d = obj;
            this.f131286e |= Integer.MIN_VALUE;
            return C13924m.d(null, 0L, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {971, 993}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: f0.m$d */
    static final class d extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f131287b;

        /* renamed from: c, reason: collision with root package name */
        int f131288c;

        /* renamed from: d, reason: collision with root package name */
        int f131289d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f131290e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f131291f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<PointerInputChange> f131292g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<PointerInputChange> f131293h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ref.BooleanRef booleanRef, Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f131291f = booleanRef;
            this.f131292g = objectRef;
            this.f131293h = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f131291f, this.f131292g, this.f131293h, continuation);
            dVar.f131290e = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        
            r2 = r6 ? 1 : 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[EDGE_INSN: B:68:0x00e2->B:44:0x00e2 BREAK  A[LOOP:0: B:39:0x00cf->B:43:0x00df], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [T, g1.B] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00be -> B:38:0x00c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13924m.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.m$e */
    public static final class e extends Lambda implements Function1<U0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f131294f = new e();

        e() {
            super(1);
        }

        public final void a(long j10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.m$f */
    public static final class f extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f131295f = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.m$g */
    public static final class g extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f131296f = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg1/B;", "<anonymous parameter 0>", "slopTriggerChange", "LU0/f;", "<anonymous parameter 2>", "", "a", "(Lg1/B;Lg1/B;J)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.m$h */
    static final class h extends Lambda implements Function3<PointerInputChange, PointerInputChange, U0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f131297f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super U0.f, Unit> function1) {
            super(3);
            this.f131297f = function1;
        }

        public final void a(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j10) {
            this.f131297f.invoke(U0.f.d(pointerInputChange2.getPosition()));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, U0.f fVar) {
            a(pointerInputChange, pointerInputChange2, fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.m$i */
    static final class i extends Lambda implements Function1<PointerInputChange, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f131298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function0<Unit> function0) {
            super(1);
            this.f131298f = function0;
        }

        public final void a(PointerInputChange pointerInputChange) {
            this.f131298f.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.m$j */
    static final class j extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f131299f = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: f0.m$k */
    static final class k extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f131300b;

        /* renamed from: c, reason: collision with root package name */
        Object f131301c;

        /* renamed from: d, reason: collision with root package name */
        Object f131302d;

        /* renamed from: e, reason: collision with root package name */
        Object f131303e;

        /* renamed from: f, reason: collision with root package name */
        Object f131304f;

        /* renamed from: g, reason: collision with root package name */
        Object f131305g;

        /* renamed from: h, reason: collision with root package name */
        boolean f131306h;

        /* renamed from: i, reason: collision with root package name */
        float f131307i;

        /* renamed from: j, reason: collision with root package name */
        int f131308j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f131309k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f131310l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f131311m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f131312n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function3<PointerInputChange, PointerInputChange, U0.f, Unit> f131313o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function2<PointerInputChange, U0.f, Unit> f131314p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f131315q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<PointerInputChange, Unit> f131316r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(Function0<Boolean> function0, Ref.LongRef longRef, EnumC13937z enumC13937z, Function3<? super PointerInputChange, ? super PointerInputChange, ? super U0.f, Unit> function3, Function2<? super PointerInputChange, ? super U0.f, Unit> function2, Function0<Unit> function02, Function1<? super PointerInputChange, Unit> function1, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f131310l = function0;
            this.f131311m = longRef;
            this.f131312n = enumC13937z;
            this.f131313o = function3;
            this.f131314p = function2;
            this.f131315q = function02;
            this.f131316r = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = new k(this.f131310l, this.f131311m, this.f131312n, this.f131313o, this.f131314p, this.f131315q, this.f131316r, continuation);
            kVar.f131309k = obj;
            return kVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:164:0x04b8, code lost:
        
            if (kotlin.C13924m.j(r2.a1(), r0) != false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x04e0, code lost:
        
            if (r9 != r6) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x056d, code lost:
        
            if (r8 == false) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02fb, code lost:
        
            if (r4 == r6) goto L169;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:182:0x051a, B:193:0x0546], limit reached: 221 */
        /* JADX WARN: Removed duplicated region for block: B:118:0x03c0 A[PHI: r0 r1 r2 r4 r7 r9 r10 r11 r16 r18
          0x03c0: PHI (r0v21 float) = (r0v19 float), (r0v22 float) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r1v36 g1.B) = (r1v34 g1.B), (r1v38 g1.B) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r2v26 g1.c) = (r2v24 g1.c), (r2v29 g1.c) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r4v19 g1.c) = (r4v17 g1.c), (r4v20 g1.c) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r7v30 f0.P) = (r7v28 f0.P), (r7v32 f0.P) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v21 java.lang.Object) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r10v9 kotlin.jvm.internal.Ref$LongRef) = (r10v7 kotlin.jvm.internal.Ref$LongRef), (r10v10 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r11v20 kotlin.jvm.internal.Ref$LongRef) = (r11v18 kotlin.jvm.internal.Ref$LongRef), (r11v21 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r16v16 long) = (r16v14 long), (r16v17 long) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r18v12 long) = (r18v10 long), (r18v13 long) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x03d0  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0406  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0433  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x047f  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x048e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03f0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0215 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01e6 A[PHI: r0 r1 r2 r4 r5 r7 r8 r9 r11 r16 r18
          0x01e6: PHI (r0v10 float) = (r0v9 float), (r0v11 float) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r1v18 g1.B) = (r1v17 g1.B), (r1v20 g1.B) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r2v8 g1.c) = (r2v7 g1.c), (r2v11 g1.c) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r4v5 g1.c) = (r4v4 g1.c), (r4v6 g1.c) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r5v5 f0.P) = (r5v4 f0.P), (r5v6 f0.P) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v17 java.lang.Object) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r8v4 kotlin.jvm.internal.Ref$LongRef) = (r8v3 kotlin.jvm.internal.Ref$LongRef), (r8v6 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r9v2 kotlin.jvm.internal.Ref$LongRef) = (r9v1 kotlin.jvm.internal.Ref$LongRef), (r9v3 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r11v1 int) = (r11v0 int), (r11v14 int) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r16v6 long) = (r16v5 long), (r16v7 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r18v2 long) = (r18v1 long), (r18v3 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02c2 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
        /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0389 -> B:113:0x038b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03f7 -> B:113:0x038b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x044c -> B:81:0x02be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0453 -> B:115:0x03a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0473 -> B:155:0x0475). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0485 -> B:81:0x02be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x04e0 -> B:170:0x04e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01b2 -> B:74:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x021d -> B:43:0x021e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x026f -> B:74:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0297 -> B:71:0x029a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0333 -> B:89:0x02e3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 1474
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13924m.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {354, 355, 360}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: f0.m$l */
    static final class l extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f131317b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f131318c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f131319d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f131320e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f131321f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<PointerInputChange, U0.f, Unit> f131322g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.m$l$a */
        static final class a extends Lambda implements Function1<PointerInputChange, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<PointerInputChange, U0.f, Unit> f131323f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super PointerInputChange, ? super U0.f, Unit> function2) {
                super(1);
                this.f131323f = function2;
            }

            public final void a(PointerInputChange pointerInputChange) {
                this.f131323f.invoke(pointerInputChange, U0.f.d(r.h(pointerInputChange)));
                pointerInputChange.a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                a(pointerInputChange);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Function1<? super U0.f, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super U0.f, Unit> function2, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f131319d = function1;
            this.f131320e = function0;
            this.f131321f = function02;
            this.f131322g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = new l(this.f131319d, this.f131320e, this.f131321f, this.f131322g, continuation);
            lVar.f131318c = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: CancellationException -> 0x00b6, PHI: r1 r8 r12
          0x0064: PHI (r1v8 g1.c) = (r1v4 g1.c), (r1v9 g1.c) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r8v6 f0.m$l) = (r8v2 f0.m$l), (r8v7 f0.m$l) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[Catch: CancellationException -> 0x00b6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13924m.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {111}, m = "drag-jO51t88")
    /* renamed from: f0.m$m, reason: collision with other inner class name */
    static final class C2083m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131324a;

        /* renamed from: b, reason: collision with root package name */
        Object f131325b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f131326c;

        /* renamed from: d, reason: collision with root package name */
        int f131327d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131326c = obj;
            this.f131327d |= Integer.MIN_VALUE;
            return C13924m.i(null, 0L, null, this);
        }

        C2083m(Continuation<? super C2083m> continuation) {
            super(continuation);
        }
    }

    static {
        float fP = H1.h.p((float) 0.125d);
        f131267a = fP;
        float fP2 = H1.h.p(18);
        f131268b = fP2;
        f131269c = fP / fP2;
    }

    /* JADX WARN: Path cross not found for [B:32:0x00d6, B:38:0x00f2], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009e -> B:23:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(g1.InterfaceC14300c r18, g1.PointerInputChange r19, g1.EnumC14315s r20, kotlin.coroutines.Continuation<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13924m.b(g1.c, g1.B, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (g1.r.k(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(g1.InterfaceC14300c r17, long r18, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13924m.c(g1.c, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, g1.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(g1.InterfaceC14300c r9, long r10, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof kotlin.C13924m.c
            if (r0 == 0) goto L13
            r0 = r12
            f0.m$c r0 = (kotlin.C13924m.c) r0
            int r1 = r0.f131286e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131286e = r1
            goto L18
        L13:
            f0.m$c r0 = new f0.m$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f131285d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f131286e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.f131284c
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r0.f131283b
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r0.f131282a
            g1.B r11 = (g1.PointerInputChange) r11
            kotlin.ResultKt.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            goto La9
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            kotlin.ResultKt.b(r12)
            g1.q r12 = r9.a1()
            boolean r12 = j(r12, r10)
            if (r12 == 0) goto L4d
            return r4
        L4d:
            g1.q r12 = r9.a1()
            java.util.List r12 = r12.c()
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L5d:
            if (r5 >= r2) goto L74
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            g1.B r7 = (g1.PointerInputChange) r7
            long r7 = r7.getId()
            boolean r7 = g1.C14296A.b(r7, r10)
            if (r7 == 0) goto L71
            goto L75
        L71:
            int r5 = r5 + 1
            goto L5d
        L74:
            r6 = r4
        L75:
            r11 = r6
            g1.B r11 = (g1.PointerInputChange) r11
            if (r11 != 0) goto L7b
            return r4
        L7b:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.f143742a = r11
            androidx.compose.ui.platform.Q1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r2.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            f0.m$d r7 = new f0.m$d     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.f131282a = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.f131283b = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.f131284c = r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.f131286e = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            java.lang.Object r9 = r9.H0(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 != r1) goto La8
            return r1
        La8:
            r9 = r2
        La9:
            boolean r9 = r9.f143735a     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 == 0) goto Lb5
            T r9 = r10.f143742a     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            g1.B r9 = (g1.PointerInputChange) r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 != 0) goto Lb4
            return r11
        Lb4:
            return r9
        Lb5:
            return r4
        Lb6:
            T r9 = r10.f143742a
            g1.B r9 = (g1.PointerInputChange) r9
            if (r9 != 0) goto Lbd
            goto Lbe
        Lbd:
            r11 = r9
        Lbe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13924m.d(g1.c, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object e(J j10, Function1<? super U0.f, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super U0.f, Unit> function2, Continuation<? super Unit> continuation) {
        Object objF = f(j10, new h(function1), new i(function0), function02, j.f131299f, null, function2, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
    }

    public static final Object f(J j10, Function3<? super PointerInputChange, ? super PointerInputChange, ? super U0.f, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, EnumC13937z enumC13937z, Function2<? super PointerInputChange, ? super U0.f, Unit> function2, Continuation<? super Unit> continuation) {
        Object objD = C13931t.d(j10, new k(function02, new Ref.LongRef(), enumC13937z, function3, function2, function0, function1, null), continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    public static /* synthetic */ Object g(J j10, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = e.f131294f;
        }
        if ((i10 & 2) != 0) {
            function0 = f.f131295f;
        }
        if ((i10 & 4) != 0) {
            function02 = g.f131296f;
        }
        Function0 function03 = function02;
        return e(j10, function1, function0, function03, function2, continuation);
    }

    public static final Object h(J j10, Function1<? super U0.f, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super U0.f, Unit> function2, Continuation<? super Unit> continuation) {
        Object objD = C13931t.d(j10, new l(function1, function0, function02, function2, null), continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(g1.InterfaceC14300c r4, long r5, kotlin.jvm.functions.Function1<? super g1.PointerInputChange, kotlin.Unit> r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof kotlin.C13924m.C2083m
            if (r0 == 0) goto L13
            r0 = r8
            f0.m$m r0 = (kotlin.C13924m.C2083m) r0
            int r1 = r0.f131327d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131327d = r1
            goto L18
        L13:
            f0.m$m r0 = new f0.m$m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f131326c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f131327d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f131325b
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.f131324a
            g1.c r5 = (g1.InterfaceC14300c) r5
            kotlin.ResultKt.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.b(r8)
        L3e:
            r0.f131324a = r4
            r0.f131325b = r7
            r0.f131327d = r3
            java.lang.Object r8 = c(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            g1.B r8 = (g1.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r4
        L55:
            boolean r5 = g1.r.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13924m.i(g1.c, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final float k(Q1 q12, int i10) {
        return O.g(i10, O.INSTANCE.b()) ? q12.g() * f131269c : q12.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(C14314q c14314q, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listC = c14314q.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                pointerInputChange = listC.get(i10);
                if (C14296A.b(pointerInputChange.getId(), j10)) {
                    break;
                }
                i10++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }
}
