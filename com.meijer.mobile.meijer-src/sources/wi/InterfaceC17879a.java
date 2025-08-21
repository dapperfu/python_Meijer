package wi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lwi/a;", "Lwi/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lki/q1$s$a;", "b", "()Lki/q1$s$a;", "template", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wi.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC17879a extends InterfaceC17895q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wi.a$a, reason: collision with other inner class name */
    static final class C2658a implements Function3<Modifier, Composer, Integer, Unit> {
        C2658a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1318728768, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.toggle_button.CheckboxComposer.getComposer.<anonymous> (Checkbox.kt:45)");
            }
            C17883e.d(InterfaceC17879a.this, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    q1.s.Checkbox b();

    @Override // Ji.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1318728768, true, new C2658a());
    }
}
