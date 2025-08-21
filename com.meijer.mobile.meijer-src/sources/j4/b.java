package j4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C14667h;
import kotlin.InterfaceC6302b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f139835a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> f139836b = ComposableLambdaKt.composableLambdaInstance(127448943, false, a.f139837f);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb0/b;", "Li4/h;", "Lkotlin/jvm/JvmSuppressWildcards;", "it", "", "a", "(Lb0/b;Li4/h;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f139837f = new a();

        a() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, Integer num) {
            a(interfaceC6302b, c14667h, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(InterfaceC6302b interfaceC6302b, C14667h c14667h, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(127448943, i10, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda-1.<anonymous> (ComposeNavigator.kt:62)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    public final Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> a() {
        return f139836b;
    }
}
