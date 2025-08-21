package nr;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kr.C15408b;
import l0.InterfaceC15433c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: nr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16008a {

    /* renamed from: a, reason: collision with root package name */
    public static final C16008a f152936a = new C16008a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15433c, Composer, Integer, Unit> f152937b = ComposableLambdaKt.composableLambdaInstance(678444680, false, C2366a.f152938a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nr.a$a, reason: collision with other inner class name */
    static final class C2366a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2366a f152938a = new C2366a();

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(678444680, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.ComposableSingletons$HowSubscriptionWorksKt.lambda$678444680.<anonymous> (HowSubscriptionWorks.kt:172)");
            }
            C16015h.g(C15408b.f148730i, null, composer, 0, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        C2366a() {
        }
    }

    public final Function3<InterfaceC15433c, Composer, Integer, Unit> a() {
        return f152937b;
    }
}
