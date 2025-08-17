package nr;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kr.C15305b;
import l0.InterfaceC15343c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: nr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15932a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15932a f152484a = new C15932a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15343c, Composer, Integer, Unit> f152485b = ComposableLambdaKt.composableLambdaInstance(678444680, false, C2364a.f152486a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nr.a$a, reason: collision with other inner class name */
    static final class C2364a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2364a f152486a = new C2364a();

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(678444680, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.ComposableSingletons$HowSubscriptionWorksKt.lambda$678444680.<anonymous> (HowSubscriptionWorks.kt:172)");
            }
            C15939h.g(C15305b.f147822i, null, composer, 0, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        C2364a() {
        }
    }

    public final Function3<InterfaceC15343c, Composer, Integer, Unit> a() {
        return f152485b;
    }
}
