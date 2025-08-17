package Cr;

import ji.DefaultDropdownInputs;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aT\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/u0;", "", "isError", "isWarning", "isDisabled", "Lkotlin/Function1;", "Lji/q1$f$b;", "Lkotlin/ParameterName;", "name", "template", "transformer", "b", "(Lji/u0;ZZZLkotlin/jvm/functions/Function1;)Lji/q1$f$b;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.f.Dropdown d(q1.f.Dropdown it) {
        Intrinsics.j(it, "it");
        return it;
    }

    public static final q1.f.Dropdown b(DefaultDropdownInputs defaultDropdownInputs, boolean z10, boolean z11, boolean z12, Function1<? super q1.f.Dropdown, q1.f.Dropdown> transformer) {
        Intrinsics.j(defaultDropdownInputs, "<this>");
        Intrinsics.j(transformer, "transformer");
        return transformer.invoke(z10 ? defaultDropdownInputs.getError() : z11 ? defaultDropdownInputs.getWarning() : z12 ? defaultDropdownInputs.getDisabled() : defaultDropdownInputs.getDefault());
    }

    public static /* synthetic */ q1.f.Dropdown c(DefaultDropdownInputs defaultDropdownInputs, boolean z10, boolean z11, boolean z12, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: Cr.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return c.d((q1.f.Dropdown) obj2);
                }
            };
        }
        return b(defaultDropdownInputs, z10, z11, z12, function1);
    }
}
