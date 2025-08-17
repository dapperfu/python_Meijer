package Ym;

import Bj.o;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j0.InterfaceC14800I;
import kotlin.C17877E0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f40420a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f40421b = ComposableLambdaKt.composableLambdaInstance(-1395255044, false, C0867a.f40422a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ym.a$a, reason: collision with other inner class name */
    static final class C0867a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0867a f40422a = new C0867a();

        public final void a(InterfaceC14800I TextButton, Composer composer, int i10) throws Resources.NotFoundException {
            Intrinsics.j(TextButton, "$this$TextButton");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1395255044, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.topbar.ComposableSingletons$TopBarKt.lambda$-1395255044.<anonymous> (TopBar.kt:83)");
            }
            String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getResources().getString(o.f3054y0);
            Intrinsics.i(string, "getString(...)");
            N1.b(string, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C17877E0.f166879a.c(composer, C17877E0.f166880b).getH6(), composer, 0, 0, 65534);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) throws Resources.NotFoundException {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        C0867a() {
        }
    }

    public final Function3<InterfaceC14800I, Composer, Integer, Unit> a() {
        return f40421b;
    }
}
