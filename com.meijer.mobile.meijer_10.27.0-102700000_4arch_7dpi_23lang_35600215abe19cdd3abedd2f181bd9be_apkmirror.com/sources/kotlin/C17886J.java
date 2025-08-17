package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17886J {

    /* renamed from: a, reason: collision with root package name */
    public static final C17886J f167076a = new C17886J();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC17951k1, Composer, Integer, Unit> f167077b = ComposableLambdaKt.composableLambdaInstance(996639038, false, a.f167078f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx0/k1;", "it", "", "a", "(Lx0/k1;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.J$a */
    static final class a extends Lambda implements Function3<InterfaceC17951k1, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f167078f = new a();

        a() {
            super(3);
        }

        public final void a(InterfaceC17951k1 interfaceC17951k1, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(interfaceC17951k1) : composer.D(interfaceC17951k1) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(996639038, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:154)");
            }
            C17966p1.d(interfaceC17951k1, null, false, null, 0L, 0L, 0L, 0.0f, composer, i11 & 14, 254);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC17951k1 interfaceC17951k1, Composer composer, Integer num) {
            a(interfaceC17951k1, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public final Function3<InterfaceC17951k1, Composer, Integer, Unit> a() {
        return f167077b;
    }
}
