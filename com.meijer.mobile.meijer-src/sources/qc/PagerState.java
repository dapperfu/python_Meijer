package qc;

import L0.k;
import L0.m;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.EnumC13564E;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.InterfaceC13897E;
import kotlin.InterfaceC13900H;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import l0.C15429A;
import l0.InterfaceC15439i;
import l0.n;

@Deprecated
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 V2\u00020\u0001:\u00012B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u0015JA\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b(\u0010)R+\u00101\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0005R+\u00105\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u0010\u0005R!\u0010:\u001a\u00020\u00028GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b9\u0010\u0015\u001a\u0004\b8\u0010/R\u001b\u0010>\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010=R/\u0010C\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR?\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010D2\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010D8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010-\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010N\u001a\u0004\u0018\u00010K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010P\u001a\u0004\u0018\u00010K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028G@@X\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010/\"\u0004\bR\u0010\u0005R\u0014\u0010U\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010T¨\u0006W"}, d2 = {"Lqc/g;", "Lf0/H;", "", "currentPage", "<init>", "(I)V", "value", "", "name", "", "t", "(ILjava/lang/String;)V", "", "u", "(FLjava/lang/String;)V", "page", "pageOffset", "i", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "C", "()V", "s", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "f", "(F)F", "toString", "()Ljava/lang/String;", "Ll0/A;", "Ll0/A;", "o", "()Ll0/A;", "lazyListState", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "r", "()I", "B", "_currentPage", "c", "n", "A", "itemSpacing", "d", "Landroidx/compose/runtime/z1;", "q", "getPageCount$annotations", "pageCount", "e", "m", "()F", "currentPageOffset", "getAnimationTargetPage", "()Ljava/lang/Integer;", "x", "(Ljava/lang/Integer;)V", "animationTargetPage", "Lkotlin/Function0;", "g", "getFlingAnimationTarget$pager_release", "()Lkotlin/jvm/functions/Function0;", "z", "(Lkotlin/jvm/functions/Function0;)V", "flingAnimationTarget", "Ll0/i;", "l", "()Ll0/i;", "currentPageLayoutInfo", "p", "mostVisiblePageLayoutInfo", "k", "y", "", "()Z", "isScrollInProgress", "h", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qc.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final class PagerState implements InterfaceC13900H {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final k<PagerState, ?> f158198i = L0.a.a(a.f158206f, b.f158207f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15429A lazyListState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 _currentPage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 itemSpacing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1 pageCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z1 currentPageOffset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 animationTargetPage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 flingAnimationTarget;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LL0/m;", "Lqc/g;", "it", "", "", "a", "(LL0/m;Lqc/g;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qc.g$a */
    static final class a extends Lambda implements Function2<m, PagerState, List<? extends Object>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f158206f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(m listSaver, PagerState it) {
            Intrinsics.j(listSaver, "$this$listSaver");
            Intrinsics.j(it, "it");
            return CollectionsKt.e(Integer.valueOf(it.k()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lqc/g;", "a", "(Ljava/util/List;)Lqc/g;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qc.g$b */
    static final class b extends Lambda implements Function1<List<? extends Object>, PagerState> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f158207f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PagerState invoke(List<? extends Object> it) {
            Intrinsics.j(it, "it");
            Object obj = it.get(0);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return new PagerState(((Integer) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqc/g$c;", "", "<init>", "()V", "LL0/k;", "Lqc/g;", "Saver", "LL0/k;", "a", "()LL0/k;", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qc.g$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final k<PagerState, ?> a() {
            return PagerState.f158198i;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", l = {234, 239, 242, 250, 257, 269}, m = "animateScrollToPage")
    /* renamed from: qc.g$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f158208a;

        /* renamed from: b, reason: collision with root package name */
        int f158209b;

        /* renamed from: c, reason: collision with root package name */
        int f158210c;

        /* renamed from: d, reason: collision with root package name */
        float f158211d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f158212e;

        /* renamed from: g, reason: collision with root package name */
        int f158214g;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f158212e = obj;
            this.f158214g |= Integer.MIN_VALUE;
            return PagerState.this.i(0, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.google.accompanist.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qc.g$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f158215a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f158215a == 0) {
                ResultKt.b(obj);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qc.g$f */
    static final class f extends Lambda implements Function0<Float> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float fN;
            if (PagerState.this.l() != null) {
                fN = RangesKt.n((-r0.getOffset()) / (r0.getSize() + PagerState.this.n()), -0.5f, 0.5f);
            } else {
                fN = 0.0f;
            }
            return Float.valueOf(fN);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qc.g$g, reason: collision with other inner class name */
    static final class C2460g extends Lambda implements Function0<Integer> {
        C2460g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(PagerState.this.getLazyListState().x().f());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", l = {HttpResponseStatus.REDIRECTION_NOT_MODIFIED, 310}, m = "scrollToPage")
    /* renamed from: qc.g$h */
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f158218a;

        /* renamed from: b, reason: collision with root package name */
        float f158219b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f158220c;

        /* renamed from: e, reason: collision with root package name */
        int f158222e;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f158220c = obj;
            this.f158222e |= Integer.MIN_VALUE;
            return PagerState.this.v(0, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.google.accompanist.pager.PagerState$scrollToPage$2$1", f = "PagerState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qc.g$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f158223a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f158224b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15439i f158225c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PagerState f158226d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f158227e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC15439i interfaceC15439i, PagerState pagerState, float f10, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f158225c = interfaceC15439i;
            this.f158226d = pagerState;
            this.f158227e = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = new i(this.f158225c, this.f158226d, this.f158227e, continuation);
            iVar.f158224b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f158223a == 0) {
                ResultKt.b(obj);
                ((InterfaceC13897E) this.f158224b).e((this.f158225c.getSize() + this.f158226d.n()) * this.f158227e);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PagerState() {
        this(0, 1, null);
    }

    public final void s() {
        x(null);
    }

    public PagerState(int i10) {
        this.lazyListState = new C15429A(i10, 0, 2, null);
        this._currentPage = t1.e(Integer.valueOf(i10), null, 2, null);
        this.itemSpacing = t1.e(0, null, 2, null);
        this.pageCount = o1.e(new C2460g());
        this.currentPageOffset = o1.e(new f());
        this.animationTargetPage = t1.e(null, null, 2, null);
        this.flingAnimationTarget = t1.e(null, null, 2, null);
    }

    private final void B(int i10) {
        this._currentPage.setValue(Integer.valueOf(i10));
    }

    public static /* synthetic */ Object j(PagerState pagerState, int i10, float f10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return pagerState.i(i10, f10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC15439i l() {
        InterfaceC15439i interfaceC15439iPrevious;
        List<InterfaceC15439i> listH = this.lazyListState.x().h();
        ListIterator<InterfaceC15439i> listIterator = listH.listIterator(listH.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                interfaceC15439iPrevious = null;
                break;
            }
            interfaceC15439iPrevious = listIterator.previous();
            if (interfaceC15439iPrevious.getIndex() == k()) {
                break;
            }
        }
        return interfaceC15439iPrevious;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int r() {
        return ((Number) this._currentPage.getValue()).intValue();
    }

    private final void t(int value, String name) {
        if (value >= 0) {
            return;
        }
        throw new IllegalArgumentException((name + '[' + value + "] must be >= 0").toString());
    }

    private final void u(float value, String name) {
        if (-1.0f > value || value > 1.0f) {
            throw new IllegalArgumentException((name + " must be >= -1 and <= 1").toString());
        }
    }

    public static /* synthetic */ Object w(PagerState pagerState, int i10, float f10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return pagerState.v(i10, f10, continuation);
    }

    private final void x(Integer num) {
        this.animationTargetPage.setValue(num);
    }

    public final void A(int i10) {
        this.itemSpacing.setValue(Integer.valueOf(i10));
    }

    @Override // kotlin.InterfaceC13900H
    public Object a(EnumC13564E enumC13564E, Function2<? super InterfaceC13897E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objA = this.lazyListState.a(enumC13564E, function2, continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }

    @Override // kotlin.InterfaceC13900H
    public boolean b() {
        return this.lazyListState.b();
    }

    @Override // kotlin.InterfaceC13900H
    public float f(float delta) {
        return this.lazyListState.f(delta);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d0, code lost:
    
        if (r13.k(r1, r12, r4) != r0) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:75:0x0183, B:76:0x0193, B:78:0x0199, B:81:0x01a7, B:83:0x01ab, B:85:0x01b6, B:58:0x0103, B:59:0x0113, B:61:0x0119, B:65:0x0128, B:67:0x012c, B:70:0x014a, B:72:0x0156, B:49:0x00ca, B:51:0x00d5, B:54:0x00e7), top: B:94:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r11, float r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.PagerState.i(int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float m() {
        return ((Number) this.currentPageOffset.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int n() {
        return ((Number) this.itemSpacing.getValue()).intValue();
    }

    /* renamed from: o, reason: from getter */
    public final C15429A getLazyListState() {
        return this.lazyListState;
    }

    public final InterfaceC15439i p() {
        Object obj;
        n nVarX = this.lazyListState.x();
        Iterator<T> it = nVarX.h().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                InterfaceC15439i interfaceC15439i = (InterfaceC15439i) next;
                int iMin = Math.min(interfaceC15439i.getOffset() + interfaceC15439i.getSize(), nVarX.c() - nVarX.b()) - Math.max(interfaceC15439i.getOffset(), 0);
                do {
                    Object next2 = it.next();
                    InterfaceC15439i interfaceC15439i2 = (InterfaceC15439i) next2;
                    int iMin2 = Math.min(interfaceC15439i2.getOffset() + interfaceC15439i2.getSize(), nVarX.c() - nVarX.b()) - Math.max(interfaceC15439i2.getOffset(), 0);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (InterfaceC15439i) obj;
    }

    public final int q() {
        return ((Number) this.pageCount.getValue()).intValue();
    }

    public String toString() {
        return "PagerState(pageCount=" + q() + ", currentPage=" + k() + ", currentPageOffset=" + m() + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(int r9, float r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof qc.PagerState.h
            if (r0 == 0) goto L14
            r0 = r11
            qc.g$h r0 = (qc.PagerState.h) r0
            int r1 = r0.f158222e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f158222e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            qc.g$h r0 = new qc.g$h
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.f158220c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f158222e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L49
            if (r1 == r2) goto L3e
            if (r1 != r7) goto L36
            java.lang.Object r9 = r4.f158218a
            qc.g r9 = (qc.PagerState) r9
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L32
            goto L9a
        L32:
            r0 = move-exception
            r10 = r0
            goto La9
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            float r10 = r4.f158219b
            java.lang.Object r9 = r4.f158218a
            qc.g r9 = (qc.PagerState) r9
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L32
            r1 = r9
            goto L71
        L49:
            kotlin.ResultKt.b(r11)
            java.lang.String r11 = "page"
            r8.t(r9, r11)
            java.lang.String r11 = "pageOffset"
            r8.u(r10, r11)
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.d(r9)     // Catch: java.lang.Throwable -> La6
            r8.x(r11)     // Catch: java.lang.Throwable -> La6
            l0.A r1 = r8.lazyListState     // Catch: java.lang.Throwable -> La6
            r4.f158218a = r8     // Catch: java.lang.Throwable -> La6
            r4.f158219b = r10     // Catch: java.lang.Throwable -> La6
            r4.f158222e = r2     // Catch: java.lang.Throwable -> La6
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r9
            java.lang.Object r9 = l0.C15429A.J(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La6
            if (r9 != r0) goto L70
            goto L98
        L70:
            r1 = r8
        L71:
            r1.C()     // Catch: java.lang.Throwable -> L9c
            float r9 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L9c
            r11 = 953267991(0x38d1b717, float:1.0E-4)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto La0
            l0.i r9 = r1.l()     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto La0
            qc.g$i r3 = new qc.g$i     // Catch: java.lang.Throwable -> L9c
            r11 = 0
            r3.<init>(r9, r1, r10, r11)     // Catch: java.lang.Throwable -> L9c
            r4.f158218a = r1     // Catch: java.lang.Throwable -> L9c
            r4.f158222e = r7     // Catch: java.lang.Throwable -> L9c
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = kotlin.InterfaceC13900H.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9c
            if (r9 != r0) goto L99
        L98:
            return r0
        L99:
            r9 = r1
        L9a:
            r1 = r9
            goto La0
        L9c:
            r0 = move-exception
            r10 = r0
            r9 = r1
            goto La9
        La0:
            r1.s()
            kotlin.Unit r9 = kotlin.Unit.f143329a
            return r9
        La6:
            r0 = move-exception
            r10 = r0
            r9 = r8
        La9:
            r9.s()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.PagerState.v(int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void z(Function0<Integer> function0) {
        this.flingAnimationTarget.setValue(function0);
    }

    public final void C() {
        InterfaceC15439i interfaceC15439iP = p();
        if (interfaceC15439iP != null) {
            y(interfaceC15439iP.getIndex());
        }
    }

    public final int k() {
        return r();
    }

    public final void y(int i10) {
        if (i10 != r()) {
            B(i10);
        }
    }

    public /* synthetic */ PagerState(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
