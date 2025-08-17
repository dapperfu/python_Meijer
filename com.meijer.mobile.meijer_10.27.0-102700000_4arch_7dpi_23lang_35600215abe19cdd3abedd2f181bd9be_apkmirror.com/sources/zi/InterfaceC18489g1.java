package zi;

import Ai.C2857v;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pi.C16309d;
import qi.C16532e;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00198&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010$\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010*\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001e\u0010-\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001e\u00103\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00106\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001e\u00109\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00100\"\u0004\b8\u00102R$\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R$\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R$\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010HR\u001c\u0010N\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001e\u0010Q\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u00100\"\u0004\bP\u00102R\u001e\u0010T\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bR\u00100\"\u0004\bS\u00102ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0001"}, d2 = {"Lzi/g1;", "", "CURRENT", "PREVIOUS", "LIi/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/Function2;", "A", "()Lkotlin/jvm/functions/Function2;", "onValueChange", "getValue", "()Ljava/lang/Object;", "value", "Lji/q1$f;", "b", "()Lji/q1$f;", "template", "LJi/M;", "c", "()LJi/M;", "localThemeScope", "Lqi/e;", "L", "()Lqi/e;", "setInfoBlockScope", "(Lqi/e;)V", "infoBlockScope", "Lri/p;", "j", "()Lri/p;", "setLabel", "(Lri/p;)V", "label", "getDescription", "setDescription", "description", "G", "setPlaceHolder", "placeHolder", "q0", "setWordCount", "wordCount", "Lpi/d;", "q", "()Lpi/d;", "setLabelIcon", "(Lpi/d;)V", "labelIcon", "W", "setLeadingIcon", "leadingIcon", "z", "M", "trailingIcon", "Lkotlin/Function0;", "r", "()Lkotlin/jvm/functions/Function0;", "setOnTrailingIconClick", "(Lkotlin/jvm/functions/Function0;)V", "onTrailingIconClick", "v0", "setOnLeadingIconClick", "onLeadingIconClick", "s0", "setOnLabelIconClick", "onLabelIconClick", "n", "setEndContent", "(Lkotlin/jvm/functions/Function2;)V", "endContent", "", "", "Z", "()Ljava/util/List;", "dropdownItems", "R", "setArrowDownIcon", "arrowDownIcon", "V", "setArrowUpIcon", "arrowUpIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zi.g1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC18489g1<CURRENT, PREVIOUS> extends Ii.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zi.g1$a */
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC18489g1<CURRENT, PREVIOUS> f172550a;

        a(InterfaceC18489g1<CURRENT, PREVIOUS> interfaceC18489g1) {
            this.f172550a = interfaceC18489g1;
        }

        public final void a(Modifier modifier, Composer composer, int i10) {
            Intrinsics.j(modifier, "modifier");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(modifier) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-913242893, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer.getComposer.<anonymous> (CustomFieldComposer.kt:52)");
            }
            q1.f fVarB = this.f172550a.b();
            if (fVarB instanceof q1.f.QuantityInput) {
                composer.startReplaceGroup(-2096066043);
                if (this.f172550a.getValue() instanceof String) {
                    composer.startReplaceGroup(-2095808743);
                    InterfaceC18489g1<CURRENT, PREVIOUS> interfaceC18489g1 = this.f172550a;
                    Intrinsics.h(interfaceC18489g1, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Unit>");
                    C18513r0.g(interfaceC18489g1, modifier, composer, (i10 << 3) & 112, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-2095685921);
                    InterfaceC18489g1<CURRENT, PREVIOUS> interfaceC18489g12 = this.f172550a;
                    Intrinsics.h(interfaceC18489g12, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.Number, kotlin.Number>");
                    C18513r0.d(interfaceC18489g12, modifier, composer, (i10 << 3) & 112, 0);
                    composer.P();
                }
                composer.P();
            } else if (fVarB instanceof q1.f.TextInput) {
                composer.startReplaceGroup(-2095512600);
                InterfaceC18489g1<CURRENT, PREVIOUS> interfaceC18489g13 = this.f172550a;
                Intrinsics.h(interfaceC18489g13, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Unit>");
                K.K(interfaceC18489g13, modifier, composer, (i10 << 3) & 112, 0);
                composer.P();
            } else if (fVarB instanceof q1.f.Dropdown) {
                composer.startReplaceGroup(-2095362870);
                InterfaceC18489g1<CURRENT, PREVIOUS> interfaceC18489g14 = this.f172550a;
                Intrinsics.h(interfaceC18489g14, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Int>");
                C2857v.A(interfaceC18489g14, modifier, composer, (i10 << 3) & 112, 0);
                composer.P();
            } else {
                if (!(fVarB instanceof q1.f.TextArea)) {
                    composer.startReplaceGroup(-1453090033);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2095215031);
                InterfaceC18489g1<CURRENT, PREVIOUS> interfaceC18489g15 = this.f172550a;
                Intrinsics.h(interfaceC18489g15, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Unit>");
                S0.v(interfaceC18489g15, modifier, composer, (i10 << 3) & 112, 0);
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

    Function2<CURRENT, PREVIOUS, Unit> A();

    ri.p G();

    C16532e L();

    void M(C16309d c16309d);

    C16309d R();

    C16309d V();

    C16309d W();

    List<String> Z();

    q1.f b();

    LocalThemeScope c();

    ri.p getDescription();

    CURRENT getValue();

    ri.p j();

    Function2<Composer, Integer, Unit> n();

    C16309d q();

    ri.p q0();

    Function0<Unit> r();

    Function0<Unit> s0();

    Function0<Unit> v0();

    C16309d z();

    @Override // Ii.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-913242893, true, new a(this));
    }
}
