package qi;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lqi/a;", "LIi/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lji/q1$i;", "b", "()Lji/q1$i;", "template", "LJi/M;", "c", "()LJi/M;", "localThemeScope", "Lkotlin/Function0;", "getContent", "()Lkotlin/jvm/functions/Function2;", "content", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qi.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC16528a extends Ii.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qi.a$a, reason: collision with other inner class name */
    static final class C2437a implements Function3<Modifier, Composer, Integer, Unit> {
        C2437a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-654703133, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.info_block.InfoBlockComposer.getComposer.<anonymous> (InfoBlock.kt:57)");
            }
            C16531d.c(InterfaceC16528a.this, composer, 0);
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

    /* renamed from: b */
    q1.InfoBlock getTemplate();

    LocalThemeScope c();

    Function2<Composer, Integer, Unit> getContent();

    @Override // Ii.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-654703133, true, new C2437a());
    }
}
