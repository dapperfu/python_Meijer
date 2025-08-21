package kotlin;

import f1.InterfaceC13938a;
import kotlin.Deprecated;
import kotlin.EnumC13937z;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0015BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u00063"}, d2 = {"Lx0/m;", "", "Lx0/n;", "initialValue", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lx0/o1;", "snackbarHostState", "<init>", "(Lx0/n;Lc0/i;Lkotlin/jvm/functions/Function1;Lx0/o1;)V", "LH1/d;", "j", "()LH1/d;", "", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "a", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "Lx0/o1;", "f", "()Lx0/o1;", "Lx0/e;", "c", "Lx0/e;", "()Lx0/e;", "anchoredDraggableState", "LH1/d;", "getDensity$material_release", "l", "(LH1/d;)V", "density", "Lf1/a;", "e", "Lf1/a;", "()Lf1/a;", "nestedScrollConnection", "g", "()Lx0/n;", "targetValue", "i", "()Z", "isRevealed", "h", "isConcealed", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18021m {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<EnumC18024n, Boolean> confirmValueChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18029o1 snackbarHostState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17997e<EnumC18024n> anchoredDraggableState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13938a nestedScrollConnection;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u00030\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx0/m$a;", "", "<init>", "()V", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "Lx0/n;", "", "confirmStateChange", "Lx0/o1;", "snackbarHostState", "LH1/d;", "density", "LL0/k;", "Lx0/m;", "a", "(Lc0/i;Lkotlin/jvm/functions/Function1;Lx0/o1;LH1/d;)LL0/k;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.m$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/n;", "it", "Lx0/m;", "a", "(Lx0/n;)Lx0/m;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.m$a$b */
        static final class b extends Lambda implements Function1<EnumC18024n, C18021m> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ H1.d f169419f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC6452i<Float> f169420g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC18024n, Boolean> f169421h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C18029o1 f169422i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(H1.d dVar, InterfaceC6452i<Float> interfaceC6452i, Function1<? super EnumC18024n, Boolean> function1, C18029o1 c18029o1) {
                super(1);
                this.f169419f = dVar;
                this.f169420g = interfaceC6452i;
                this.f169421h = function1;
                this.f169422i = c18029o1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C18021m invoke(EnumC18024n enumC18024n) {
                return C18018l.d(enumC18024n, this.f169419f, this.f169420g, this.f169421h, this.f169422i);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Lx0/m;", "it", "Lx0/n;", "a", "(LL0/m;Lx0/m;)Lx0/n;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.m$a$a, reason: collision with other inner class name */
        static final class C2710a extends Lambda implements Function2<L0.m, C18021m, EnumC18024n> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2710a f169418f = new C2710a();

            C2710a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC18024n invoke(L0.m mVar, C18021m c18021m) {
                return c18021m.c().s();
            }
        }

        private Companion() {
        }

        public final L0.k<C18021m, ?> a(InterfaceC6452i<Float> animationSpec, Function1<? super EnumC18024n, Boolean> confirmStateChange, C18029o1 snackbarHostState, H1.d density) {
            return L0.l.a(C2710a.f169418f, new b(density, animationSpec, confirmStateChange, snackbarHostState));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.m$b */
    static final class b extends Lambda implements Function1<Float, Float> {
        b() {
            super(1);
        }

        public final Float b(float f10) {
            return Float.valueOf(C18021m.this.j().I1(C18018l.f169267c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.m$c */
    static final class c extends Lambda implements Function0<Float> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(C18021m.this.j().I1(C18018l.f169266b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H1.d j() {
        H1.d dVar = this.density;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + this + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }

    public final Object b(Continuation<? super Unit> continuation) {
        Object objG = androidx.compose.material.a.g(this.anchoredDraggableState, EnumC18024n.f169435a, 0.0f, continuation, 2, null);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final C17997e<EnumC18024n> c() {
        return this.anchoredDraggableState;
    }

    public final Function1<EnumC18024n, Boolean> d() {
        return this.confirmValueChange;
    }

    /* renamed from: e, reason: from getter */
    public final InterfaceC13938a getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    /* renamed from: f, reason: from getter */
    public final C18029o1 getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public final EnumC18024n g() {
        return this.anchoredDraggableState.x();
    }

    public final boolean h() {
        return this.anchoredDraggableState.s() == EnumC18024n.f169435a;
    }

    public final boolean i() {
        return this.anchoredDraggableState.s() == EnumC18024n.f169436b;
    }

    public final Object k(Continuation<? super Unit> continuation) {
        Object objG = androidx.compose.material.a.g(this.anchoredDraggableState, EnumC18024n.f169436b, 0.0f, continuation, 2, null);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final void l(H1.d dVar) {
        this.density = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public C18021m(EnumC18024n enumC18024n, InterfaceC6452i<Float> interfaceC6452i, Function1<? super EnumC18024n, Boolean> function1, C18029o1 c18029o1) {
        this.confirmValueChange = function1;
        this.snackbarHostState = c18029o1;
        C17997e<EnumC18024n> c17997e = new C17997e<>(enumC18024n, new b(), new c(), interfaceC6452i, function1);
        this.anchoredDraggableState = c17997e;
        this.nestedScrollConnection = C18018l.f(c17997e, EnumC13937z.f131419a);
    }
}
