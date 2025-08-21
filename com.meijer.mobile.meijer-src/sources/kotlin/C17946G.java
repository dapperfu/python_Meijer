package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17946G {

    /* renamed from: a, reason: collision with root package name */
    public static final C17946G f167988a = new C17946G();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<C18029o1, Composer, Integer, Unit> f167989b = ComposableLambdaKt.composableLambdaInstance(-1054097158, false, a.f167990f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/o1;", "it", "", "a", "(Lx0/o1;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.G$a */
    static final class a extends Lambda implements Function3<C18029o1, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f167990f = new a();

        a() {
            super(3);
        }

        public final void a(C18029o1 c18029o1, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.V(c18029o1) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1054097158, i10, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda-1.<anonymous> (BackdropScaffold.kt:351)");
            }
            C18026n1.b(c18029o1, null, null, composer, i10 & 14, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C18029o1 c18029o1, Composer composer, Integer num) {
            a(c18029o1, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function3<C18029o1, Composer, Integer, Unit> a() {
        return f167989b;
    }
}
