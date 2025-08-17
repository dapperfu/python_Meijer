package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17882H {

    /* renamed from: a, reason: collision with root package name */
    public static final C17882H f166944a = new C17882H();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<C17963o1, Composer, Integer, Unit> f166945b = ComposableLambdaKt.composableLambdaInstance(239945703, false, a.f166948f);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f166946c = ComposableLambdaKt.composableLambdaInstance(690018774, false, b.f166949f);

    /* renamed from: d, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f166947d = ComposableLambdaKt.composableLambdaInstance(1054313561, false, c.f166950f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/o1;", "it", "", "a", "(Lx0/o1;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.H$a */
    static final class a extends Lambda implements Function3<C17963o1, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f166948f = new a();

        a() {
            super(3);
        }

        public final void a(C17963o1 c17963o1, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.V(c17963o1) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(239945703, i10, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:324)");
            }
            C17960n1.b(c17963o1, null, null, composer, i10 & 14, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C17963o1 c17963o1, Composer composer, Integer num) {
            a(c17963o1, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.H$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f166949f = new b();

        b() {
            super(2);
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(690018774, i10, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-2.<anonymous> (BottomSheetScaffold.kt:473)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.H$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f166950f = new c();

        c() {
            super(2);
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1054313561, i10, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-3.<anonymous> (BottomSheetScaffold.kt:476)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public final Function3<C17963o1, Composer, Integer, Unit> a() {
        return f166945b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f166946c;
    }

    public final Function2<Composer, Integer, Unit> c() {
        return f166947d;
    }
}
