package j0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\u000b\u001a\u00020\u0000*\u00020\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lj0/O;", "insets", "c", "(Landroidx/compose/ui/Modifier;Lj0/O;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "consumedWindowInsets", "", "block", "b", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Lk1/l;", "a", "Lk1/l;", "()Lk1/l;", "ModifierLocalConsumedWindowInsets", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private static final k1.l<InterfaceC14894O> f139660a = k1.e.a(a.f139661f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj0/O;", "c", "()Lj0/O;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<InterfaceC14894O> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f139661f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC14894O invoke() {
            return C14896Q.a(0, 0, 0, 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f139662f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.f139662f = function1;
        }

        public final void a(N0 n02) {
            n02.b("onConsumedWindowInsetsChanged");
            n02.getProperties().c("block", this.f139662f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC14894O, Unit> f139663f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super InterfaceC14894O, Unit> function1) {
            super(3);
            this.f139663f = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-1608161351);
            if (ComposerKt.M()) {
                ComposerKt.U(-1608161351, i10, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:141)");
            }
            boolean zV = composer.V(this.f139663f);
            Function1<InterfaceC14894O, Unit> function1 = this.f139663f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C14904h(function1);
                composer.t(objB);
            }
            C14904h c14904h = (C14904h) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c14904h;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f139664f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC14894O interfaceC14894O) {
            super(1);
            this.f139664f = interfaceC14894O;
        }

        public final void a(N0 n02) {
            n02.b("windowInsetsPadding");
            n02.getProperties().c("insets", this.f139664f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f139665f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC14894O interfaceC14894O) {
            super(3);
            this.f139665f = interfaceC14894O;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-1415685722);
            if (ComposerKt.M()) {
                ComposerKt.U(-1415685722, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:79)");
            }
            boolean zV = composer.V(this.f139665f);
            InterfaceC14894O interfaceC14894O = this.f139665f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C14916t(interfaceC14894O);
                composer.t(objB);
            }
            C14916t c14916t = (C14916t) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return c14916t;
        }
    }

    public static final k1.l<InterfaceC14894O> a() {
        return f139660a;
    }

    public static final Modifier b(Modifier modifier, Function1<? super InterfaceC14894O, Unit> function1) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new b(function1);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new c(function1));
    }

    public static final Modifier c(Modifier modifier, InterfaceC14894O interfaceC14894O) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new d(interfaceC14894O);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new e(interfaceC14894O));
    }
}
