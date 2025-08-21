package Ai;

import Bi.C2962v;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import qi.C16673d;
import ri.C16913e;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00198&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010$\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010*\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001e\u0010-\u001a\u0004\u0018\u00010\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001e\u00103\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00106\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001e\u00109\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00100\"\u0004\b8\u00102R$\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R$\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R$\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010HR\u001c\u0010N\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001e\u0010Q\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u00100\"\u0004\bP\u00102R\u001e\u0010T\u001a\u0004\u0018\u00010.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bR\u00100\"\u0004\bS\u00102ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0001"}, d2 = {"LAi/g1;", "", "CURRENT", "PREVIOUS", "LJi/b;", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/Function2;", "C", "()Lkotlin/jvm/functions/Function2;", "onValueChange", "getValue", "()Ljava/lang/Object;", "value", "Lki/q1$f;", "b", "()Lki/q1$f;", "template", "LKi/M;", "c", "()LKi/M;", "localThemeScope", "Lri/e;", "P", "()Lri/e;", "setInfoBlockScope", "(Lri/e;)V", "infoBlockScope", "Lsi/p;", "j", "()Lsi/p;", "setLabel", "(Lsi/p;)V", "label", "getDescription", "setDescription", "description", "I", "setPlaceHolder", "placeHolder", "r0", "setWordCount", "wordCount", "Lqi/d;", "r", "()Lqi/d;", "setLabelIcon", "(Lqi/d;)V", "labelIcon", "c0", "setLeadingIcon", "leadingIcon", "B", "n0", "trailingIcon", "Lkotlin/Function0;", "s", "()Lkotlin/jvm/functions/Function0;", "setOnTrailingIconClick", "(Lkotlin/jvm/functions/Function0;)V", "onTrailingIconClick", "v0", "setOnLeadingIconClick", "onLeadingIconClick", "t0", "setOnLabelIconClick", "onLabelIconClick", "o", "setEndContent", "(Lkotlin/jvm/functions/Function2;)V", "endContent", "", "", "e0", "()Ljava/util/List;", "dropdownItems", "U", "setArrowDownIcon", "arrowDownIcon", "b0", "setArrowUpIcon", "arrowUpIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ai.g1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC2817g1<CURRENT, PREVIOUS> extends Ji.b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.g1$a */
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2817g1<CURRENT, PREVIOUS> f1066a;

        a(InterfaceC2817g1<CURRENT, PREVIOUS> interfaceC2817g1) {
            this.f1066a = interfaceC2817g1;
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
            q1.f fVarB = this.f1066a.b();
            if (fVarB instanceof q1.f.QuantityInput) {
                composer.startReplaceGroup(-2096066043);
                if (this.f1066a.getValue() instanceof String) {
                    composer.startReplaceGroup(-2095808743);
                    InterfaceC2817g1<CURRENT, PREVIOUS> interfaceC2817g1 = this.f1066a;
                    Intrinsics.h(interfaceC2817g1, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Unit>");
                    C2841r0.g(interfaceC2817g1, modifier, composer, (i10 << 3) & 112, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-2095685921);
                    InterfaceC2817g1<CURRENT, PREVIOUS> interfaceC2817g12 = this.f1066a;
                    Intrinsics.h(interfaceC2817g12, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.Number, kotlin.Number>");
                    C2841r0.d(interfaceC2817g12, modifier, composer, (i10 << 3) & 112, 0);
                    composer.P();
                }
                composer.P();
            } else if (fVarB instanceof q1.f.TextInput) {
                composer.startReplaceGroup(-2095512600);
                InterfaceC2817g1<CURRENT, PREVIOUS> interfaceC2817g13 = this.f1066a;
                Intrinsics.h(interfaceC2817g13, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Unit>");
                K.K(interfaceC2817g13, modifier, composer, (i10 << 3) & 112, 0);
                composer.P();
            } else if (fVarB instanceof q1.f.Dropdown) {
                composer.startReplaceGroup(-2095362870);
                InterfaceC2817g1<CURRENT, PREVIOUS> interfaceC2817g14 = this.f1066a;
                Intrinsics.h(interfaceC2817g14, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Int>");
                C2962v.A(interfaceC2817g14, modifier, composer, (i10 << 3) & 112, 0);
                composer.P();
            } else {
                if (!(fVarB instanceof q1.f.TextArea)) {
                    composer.startReplaceGroup(-1453090033);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2095215031);
                InterfaceC2817g1<CURRENT, PREVIOUS> interfaceC2817g15 = this.f1066a;
                Intrinsics.h(interfaceC2817g15, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.composables.form_fields.CustomFieldComposer<kotlin.String, kotlin.Unit>");
                S0.v(interfaceC2817g15, modifier, composer, (i10 << 3) & 112, 0);
                composer.P();
            }
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

    C16673d B();

    Function2<CURRENT, PREVIOUS, Unit> C();

    si.p I();

    C16913e P();

    C16673d U();

    q1.f b();

    C16673d b0();

    /* renamed from: c */
    LocalThemeScope getLocalThemeScope();

    C16673d c0();

    List<String> e0();

    si.p getDescription();

    CURRENT getValue();

    si.p j();

    void n0(C16673d c16673d);

    Function2<Composer, Integer, Unit> o();

    C16673d r();

    si.p r0();

    Function0<Unit> s();

    Function0<Unit> t0();

    Function0<Unit> v0();

    @Override // Ji.b
    default Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-913242893, true, new a(this));
    }
}
