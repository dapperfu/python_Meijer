package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14888I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17944F {

    /* renamed from: a, reason: collision with root package name */
    public static final C17944F f167974a = new C17944F();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f167975b = ComposableLambdaKt.composableLambdaInstance(-636475396, false, a.f167977f);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f167976c = ComposableLambdaKt.composableLambdaInstance(-771938130, false, b.f167978f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/I;", "", "a", "(Lj0/I;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.F$a */
    static final class a extends Lambda implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f167977f = new a();

        a() {
            super(3);
        }

        public final void a(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
            if (!composer.p((i10 & 17) != 16, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-636475396, i10, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:89)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/I;", "", "a", "(Lj0/I;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.F$b */
    static final class b extends Lambda implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f167978f = new b();

        b() {
            super(3);
        }

        public final void a(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
            if (!composer.p((i10 & 17) != 16, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-771938130, i10, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-2.<anonymous> (AppBar.kt:166)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> a() {
        return f167975b;
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> b() {
        return f167976c;
    }
}
