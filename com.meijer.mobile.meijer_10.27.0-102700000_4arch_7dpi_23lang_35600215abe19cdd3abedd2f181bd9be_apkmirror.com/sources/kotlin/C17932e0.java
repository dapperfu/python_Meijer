package kotlin;

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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lx0/e0;", "", "Lx0/f0;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Lx0/f0;Lkotlin/jvm/functions/Function1;)V", "LH1/d;", "g", "()LH1/d;", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "", "h", "()F", "Lx0/e;", "a", "Lx0/e;", "c", "()Lx0/e;", "anchoredDraggableState", "LH1/d;", "getDensity$material_release", "i", "(LH1/d;)V", "density", "e", "()Z", "isOpen", "d", "()Lx0/f0;", "currentValue", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17932e0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17931e<EnumC17935f0> anchoredDraggableState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx0/e0$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lx0/f0;", "", "confirmStateChange", "LL0/k;", "Lx0/e0;", "a", "(Lkotlin/jvm/functions/Function1;)LL0/k;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.e0$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/f0;", "it", "Lx0/e0;", "a", "(Lx0/f0;)Lx0/e0;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.e0$a$b */
        static final class b extends Lambda implements Function1<EnumC17935f0, C17932e0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC17935f0, Boolean> f167860f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super EnumC17935f0, Boolean> function1) {
                super(1);
                this.f167860f = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C17932e0 invoke(EnumC17935f0 enumC17935f0) {
                return new C17932e0(enumC17935f0, this.f167860f);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Lx0/e0;", "it", "Lx0/f0;", "a", "(LL0/m;Lx0/e0;)Lx0/f0;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.e0$a$a, reason: collision with other inner class name */
        static final class C2670a extends Lambda implements Function2<L0.m, C17932e0, EnumC17935f0> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2670a f167859f = new C2670a();

            C2670a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC17935f0 invoke(L0.m mVar, C17932e0 c17932e0) {
                return c17932e0.d();
            }
        }

        private Companion() {
        }

        public final L0.k<C17932e0, EnumC17935f0> a(Function1<? super EnumC17935f0, Boolean> confirmStateChange) {
            return L0.l.a(C2670a.f167859f, new b(confirmStateChange));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.e0$b */
    static final class b extends Lambda implements Function1<Float, Float> {
        b() {
            super(1);
        }

        public final Float b(float f10) {
            return Float.valueOf(C17932e0.this.g().I1(C17929d0.f167731b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.e0$c */
    static final class c extends Lambda implements Function0<Float> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(C17932e0.this.g().I1(C17929d0.f167732c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H1.d g() {
        H1.d dVar = this.density;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(Continuation<? super Unit> continuation) {
        Object objG = androidx.compose.material.a.g(this.anchoredDraggableState, EnumC17935f0.f167889a, 0.0f, continuation, 2, null);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public final C17931e<EnumC17935f0> c() {
        return this.anchoredDraggableState;
    }

    public final EnumC17935f0 d() {
        return this.anchoredDraggableState.s();
    }

    public final Object f(Continuation<? super Unit> continuation) {
        Object objG = androidx.compose.material.a.g(this.anchoredDraggableState, EnumC17935f0.f167890b, 0.0f, continuation, 2, null);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public final float h() {
        return this.anchoredDraggableState.A();
    }

    public final void i(H1.d dVar) {
        this.density = dVar;
    }

    public C17932e0(EnumC17935f0 enumC17935f0, Function1<? super EnumC17935f0, Boolean> function1) {
        this.anchoredDraggableState = new C17931e<>(enumC17935f0, new b(), new c(), C17929d0.f167733d, function1);
    }

    public final boolean e() {
        if (d() == EnumC17935f0.f167890b) {
            return true;
        }
        return false;
    }
}
