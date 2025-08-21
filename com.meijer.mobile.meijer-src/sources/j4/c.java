package j4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C14667h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f139838a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static Function3<C14667h, Composer, Integer, Unit> f139839b = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, a.f139840f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "it", "", "a", "(Li4/h;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function3<C14667h, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f139840f = new a();

        a() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h, Composer composer, Integer num) {
            a(c14667h, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(C14667h c14667h, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1092249270, i10, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:64)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    public final Function3<C14667h, Composer, Integer, Unit> a() {
        return f139839b;
    }
}
