package Fi;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u0014\u0010\u001b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"LFi/a;", "LIi/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "", "i0", "()Ljava/lang/String;", "searchQuery", "H", "placeholderText", "o0", "()Lkotlin/jvm/functions/Function1;", "onTextUpdate", "Lkotlin/Function0;", "Y", "()Lkotlin/jvm/functions/Function0;", "onClear", "", "h", "()Z", "enabled", "I", "clearDescription", "w0", "labelFor", "LJi/M;", "c", "()LJi/M;", "localThemeScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface a extends Ii.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fi.a$a, reason: collision with other inner class name */
    static final class C0148a implements Function3<Modifier, Composer, Integer, Unit> {
        C0148a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(it) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(794506125, i10, -1, "com.meijer.mobile.android_acres_library.composables.search.SearchComposer.getComposer.<anonymous> (SearchComposer.kt:98)");
            }
            if (a.this.h()) {
                composer.startReplaceGroup(-432774292);
                g.i(a.this, it, composer, (i10 << 3) & 112);
                composer.P();
            } else {
                composer.startReplaceGroup(-432727637);
                g.f(a.this, it, composer, (i10 << 3) & 112);
                composer.P();
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
    }

    String H();

    String I();

    Function0<Unit> Y();

    /* renamed from: c */
    LocalThemeScope getLocalThemeScope();

    boolean h();

    String i0();

    Function1<String, Unit> o0();

    String w0();

    @Override // Ii.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(794506125, true, new C0148a());
    }
}
