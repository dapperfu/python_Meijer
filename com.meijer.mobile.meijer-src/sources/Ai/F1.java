package Ai;

import Ki.LocalThemeScope;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qi.C16673d;
import r1.C16813g;
import r1.C16819m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LAi/F1;", "LAi/h1;", "", "", "LAi/G1;", "Lkotlin/Function1;", "onValueChange", "", "maxCharacters", "Lki/q1$f$d;", "template", "value", "LKi/M;", "localThemeScope", "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Lki/q1$f$d;Ljava/lang/String;LKi/M;Landroidx/compose/ui/Modifier;)V", "Lki/q1$j;", "textValue", "O", "(Lki/q1$j;Ljava/lang/String;)V", "v", "Ljava/lang/Integer;", "getMaxCharacters", "()Ljava/lang/Integer;", "Lqi/d;", "w", "Lqi/d;", "B", "()Lqi/d;", "n0", "(Lqi/d;)V", "trailingIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class F1 extends AbstractC2820h1<String, Unit> implements G1 {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Integer maxCharacters;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private C16673d trailingIcon;

    public /* synthetic */ F1(Function1 function1, Integer num, q1.f.TextArea textArea, String str, LocalThemeScope localThemeScope, Modifier modifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, num, textArea, str, localThemeScope, (i10 & 32) != 0 ? Modifier.INSTANCE : modifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(Function1 function1, Integer num, String input, Unit unit) {
        String strN1;
        Intrinsics.j(input, "input");
        Intrinsics.j(unit, "<unused var>");
        if (num != null && (strN1 = StringsKt.N1(input, num.intValue())) != null) {
            input = strN1;
        }
        function1.invoke(input);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(boolean z10, F1 f12, r1.u clearAndSetSemantics) {
        Intrinsics.j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        if (z10) {
            r1.s.n0(clearAndSetSemantics, C16813g.INSTANCE.a());
            r1.s.g0(clearAndSetSemantics, f12.getValue().length() + " of " + f12.maxCharacters + " Characters");
        }
        return Unit.f143329a;
    }

    @Override // Ai.InterfaceC2817g1
    /* renamed from: B, reason: from getter */
    public C16673d getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // Ai.G1
    public void O(q1.Label template, String textValue) {
        String string;
        Intrinsics.j(template, "template");
        final boolean z10 = (textValue == null || StringsKt.s0(textValue)) && this.maxCharacters != null;
        q1.Label labelY = q1.Label.y(template, C16819m.a(Modifier.INSTANCE, new Function1() { // from class: Ai.D1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return F1.M0(z10, this, (r1.u) obj);
            }
        }), null, null, null, 0, false, 0, null, null, 510, null);
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getValue().length());
            sb2.append('/');
            sb2.append(this.maxCharacters);
            string = sb2.toString();
        } else {
            string = textValue;
        }
        I0(new si.p(labelY, getLocalThemeScope(), string, null, null, null, 56, null));
    }

    @Override // Ai.InterfaceC2817g1
    public void n0(C16673d c16673d) {
        this.trailingIcon = c16673d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(final Function1<? super String, Unit> onValueChange, final Integer num, q1.f.TextArea template, String value, LocalThemeScope localThemeScope, Modifier modifier) {
        super(new Function2() { // from class: Ai.E1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return F1.L0(onValueChange, num, (String) obj, (Unit) obj2);
            }
        }, value, template, localThemeScope, modifier);
        Intrinsics.j(onValueChange, "onValueChange");
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(modifier, "modifier");
        this.maxCharacters = num;
    }
}
