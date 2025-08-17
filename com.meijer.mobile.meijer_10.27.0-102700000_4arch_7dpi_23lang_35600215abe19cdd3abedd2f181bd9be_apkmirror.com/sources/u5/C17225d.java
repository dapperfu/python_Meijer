package u5;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C14664h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* renamed from: u5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17225d {

    /* renamed from: a, reason: collision with root package name */
    public static final C17225d f162685a = new C17225d();

    /* renamed from: b, reason: collision with root package name */
    public static Function3<C14664h, Composer, Integer, Unit> f162686b = ComposableLambdaKt.composableLambdaInstance(-1215153185, false, a.f162687f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/h;", "it", "", "a", "(Li4/h;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: u5.d$a */
    static final class a extends Lambda implements Function3<C14664h, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f162687f = new a();

        a() {
            super(3);
        }

        public final void a(C14664h it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if (ComposerKt.M()) {
                ComposerKt.U(-1215153185, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.ComposableSingletons$AssuranceNavHostKt.lambda-1.<anonymous> (AssuranceNavHost.kt:65)");
            }
            D5.a.a(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h, Composer composer, Integer num) {
            a(c14664h, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public final Function3<C14664h, Composer, Integer, Unit> a() {
        return f162686b;
    }
}
