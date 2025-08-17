package Ii;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14057a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<Modifier, Composer, Integer, Unit> f14058b = ComposableLambdaKt.composableLambdaInstance(-389009716, false, C0222a.f14059a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ii.a$a, reason: collision with other inner class name */
    static final class C0222a implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0222a f14059a = new C0222a();

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-389009716, i10, -1, "com.meijer.mobile.android_acres_library.core.ComposableSingletons$ProviderKt.lambda$-389009716.<anonymous> (Provider.kt:32)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f142422a;
        }

        C0222a() {
        }
    }

    public final Function3<Modifier, Composer, Integer, Unit> a() {
        return f14058b;
    }
}
