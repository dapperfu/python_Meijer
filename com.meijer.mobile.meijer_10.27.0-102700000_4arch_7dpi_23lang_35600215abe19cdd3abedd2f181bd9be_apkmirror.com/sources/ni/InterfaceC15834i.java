package ni;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR%\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lni/i;", "LIi/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/Function0;", "l", "()Lkotlin/jvm/functions/Function0;", "onClick", "Lji/q1$d;", "b", "()Lji/q1$d;", "template", "Lj0/I;", "Lkotlin/ExtensionFunctionType;", "getContent", "content", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ni.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC15834i extends Ii.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ni.i$a */
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {
        a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1865856151, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ButtonComposer.getComposer.<anonymous> (Button.kt:43)");
            }
            q1.d dVarB = InterfaceC15834i.this.b();
            if (dVarB instanceof q1.d.ClippableCouponButton) {
                composer.startReplaceGroup(2086401391);
                C15825f.e(InterfaceC15834i.this, composer, 0);
                composer.P();
            } else if (dVarB instanceof q1.d.StandardButton) {
                composer.startReplaceGroup(2086403755);
                C15825f.c(InterfaceC15834i.this, composer, 0);
                composer.P();
            } else if (dVarB instanceof q1.d.ModalButton) {
                composer.startReplaceGroup(2086405899);
                C15825f.c(InterfaceC15834i.this, composer, 0);
                composer.P();
            } else {
                if (!(dVarB instanceof q1.d.ChipButton)) {
                    composer.startReplaceGroup(2086399310);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(2086408011);
                C15825f.c(InterfaceC15834i.this, composer, 0);
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

    q1.d b();

    Function3<InterfaceC14800I, Composer, Integer, Unit> getContent();

    Function0<Unit> l();

    @Override // Ii.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(1865856151, true, new a());
    }
}
