package Gi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11473a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<d, Composer, Integer, Unit> f11474b = ComposableLambdaKt.composableLambdaInstance(1634108956, false, C0171a.f11475a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gi.a$a, reason: collision with other inner class name */
    static final class C0171a implements Function3<d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0171a f11475a = new C0171a();

        public final void a(d it, Composer composer, int i10) {
            int i11;
            Intrinsics.j(it, "it");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(it) : composer.D(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1634108956, i11, -1, "com.meijer.mobile.android_acres_library.composables.state.ComposableSingletons$ToastHostStateKt.lambda$1634108956.<anonymous> (ToastHostState.kt:159)");
            }
            N1.b(it.getBodyLabel(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(d dVar, Composer composer, Integer num) {
            a(dVar, composer, num.intValue());
            return Unit.f142422a;
        }

        C0171a() {
        }
    }

    public final Function3<d, Composer, Integer, Unit> a() {
        return f11474b;
    }
}
