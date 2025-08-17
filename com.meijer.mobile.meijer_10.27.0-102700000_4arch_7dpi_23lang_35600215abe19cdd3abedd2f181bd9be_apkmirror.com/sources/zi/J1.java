package zi;

import Ji.LocalThemeScope;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pi.C16309d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lzi/J1;", "Lzi/h1;", "", "", "Lzi/H1;", "Lkotlin/Function1;", "onValueChange", "Lji/q1$f$e;", "template", "value", "LJi/M;", "localThemeScope", "<init>", "(Lkotlin/jvm/functions/Function1;Lji/q1$f$e;Ljava/lang/String;LJi/M;)V", "Lpi/d;", "v", "Lpi/d;", "z", "()Lpi/d;", "M", "(Lpi/d;)V", "trailingIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class J1 extends AbstractC18492h1<String, Unit> implements H1 {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private C16309d trailingIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(final Function1<? super String, Unit> onValueChange, q1.f.TextInput template, String value, LocalThemeScope localThemeScope) {
        super(new Function2() { // from class: zi.I1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return J1.K0(onValueChange, (String) obj, (Unit) obj2);
            }
        }, value, template, localThemeScope, null, 16, null);
        Intrinsics.j(onValueChange, "onValueChange");
        Intrinsics.j(template, "template");
        Intrinsics.j(value, "value");
        Intrinsics.j(localThemeScope, "localThemeScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(Function1 function1, String input, Unit unit) {
        Intrinsics.j(input, "input");
        Intrinsics.j(unit, "<unused var>");
        function1.invoke(input);
        return Unit.f142422a;
    }

    @Override // zi.InterfaceC18489g1
    public void M(C16309d c16309d) {
        this.trailingIcon = c16309d;
    }

    @Override // zi.InterfaceC18489g1
    /* renamed from: z, reason: from getter */
    public C16309d getTrailingIcon() {
        return this.trailingIcon;
    }
}
