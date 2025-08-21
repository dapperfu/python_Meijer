package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.u0;
import androidx.compose.ui.node.v0;
import i0.C14592e;
import kotlin.EnumC13937z;
import kotlin.InterfaceC15852K;
import kotlin.InterfaceC15885r;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import r1.C16808b;
import r1.ScrollAxisRange;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/g;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/u0;", "Lkotlin/Function0;", "Ln0/r;", "itemProviderLambda", "Ln0/K;", "state", "Lf0/z;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Ln0/K;Lf0/z;ZZ)V", "", "P2", "()V", "O2", "Lr1/u;", "T1", "(Lr1/u;)V", "o", "Lkotlin/jvm/functions/Function0;", "p", "Ln0/K;", "q", "Lf0/z;", "r", "Z", "s", "Lr1/i;", "t", "Lr1/i;", "scrollAxisRange", "Lkotlin/Function1;", "", "", "u", "Lkotlin/jvm/functions/Function1;", "indexForKeyMapping", "v", "scrollToIndexAction", "N2", "()Z", "isVertical", "Lr1/b;", "M2", "()Lr1/b;", "collectionInfo", "o2", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class g extends Modifier.c implements u0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function0<? extends InterfaceC15885r> itemProviderLambda;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15852K state;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private EnumC13937z orientation;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean userScrollEnabled;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange scrollAxisRange;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Integer> indexForKeyMapping = new b();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Integer, Boolean> scrollToIndexAction;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.e() - g.this.state.c());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needle", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<Object, Integer> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            InterfaceC15885r interfaceC15885r = (InterfaceC15885r) g.this.itemProviderLambda.invoke();
            int iA = interfaceC15885r.a();
            int i10 = 0;
            while (true) {
                if (i10 >= iA) {
                    i10 = -1;
                    break;
                }
                if (Intrinsics.e(interfaceC15885r.d(i10), obj)) {
                    break;
                }
                i10++;
            }
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function0<Float> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.f());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function0<Float> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.a());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function1<Integer, Boolean> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49078a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f49079b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f49080c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f49079b = gVar;
                this.f49080c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f49079b, this.f49080c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f49078a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15852K interfaceC15852K = this.f49079b.state;
                    int i11 = this.f49080c;
                    this.f49078a = 1;
                    if (interfaceC15852K.b(i11, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        e() {
            super(1);
        }

        public final Boolean a(int i10) {
            InterfaceC15885r interfaceC15885r = (InterfaceC15885r) g.this.itemProviderLambda.invoke();
            if (!(i10 >= 0 && i10 < interfaceC15885r.a())) {
                C14592e.a("Can't scroll to index " + i10 + ", it is out of bounds [0, " + interfaceC15885r.a() + ')');
            }
            C15809k.d(g.this.j2(), null, null, new a(g.this, i10, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(u uVar) {
        s.H0(uVar, true);
        s.x(uVar, this.indexForKeyMapping);
        if (N2()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                Intrinsics.x("scrollAxisRange");
                scrollAxisRange = null;
            }
            s.I0(uVar, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                Intrinsics.x("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            s.l0(uVar, scrollAxisRange2);
        }
        Function1<? super Integer, Boolean> function1 = this.scrollToIndexAction;
        if (function1 != null) {
            s.b0(uVar, null, function1, 1, null);
        }
        s.s(uVar, null, new a(), 1, null);
        s.d0(uVar, M2());
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final C16808b M2() {
        return this.state.d();
    }

    private final boolean N2() {
        return this.orientation == EnumC13937z.f131419a;
    }

    private final void P2() {
        this.scrollAxisRange = new ScrollAxisRange(new c(), new d(), this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new e() : null;
    }

    public final void O2(Function0<? extends InterfaceC15885r> itemProviderLambda, InterfaceC15852K state, EnumC13937z orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = itemProviderLambda;
        this.state = state;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            v0.b(this);
        }
        if (this.userScrollEnabled == userScrollEnabled && this.reverseScrolling == reverseScrolling) {
            return;
        }
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        P2();
        v0.b(this);
    }

    public g(Function0<? extends InterfaceC15885r> function0, InterfaceC15852K interfaceC15852K, EnumC13937z enumC13937z, boolean z10, boolean z11) {
        this.itemProviderLambda = function0;
        this.state = interfaceC15852K;
        this.orientation = enumC13937z;
        this.userScrollEnabled = z10;
        this.reverseScrolling = z11;
        P2();
    }
}
