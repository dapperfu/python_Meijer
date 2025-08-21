package Bi;

import ki.DefaultDropdownInputs;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aj\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lki/u0;", "", "isError", "isWarning", "isSuccess", "isDisabled", "isStatic", "Lkotlin/Function1;", "Lki/q1$f$b;", "Lkotlin/ParameterName;", "name", "template", "transformer", "a", "(Lki/u0;ZZZZZLkotlin/jvm/functions/Function1;)Lki/q1$f$b;", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class m0 {
    public static final q1.f.Dropdown a(DefaultDropdownInputs defaultDropdownInputs, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Function1<? super q1.f.Dropdown, q1.f.Dropdown> function1) {
        q1.f.Dropdown dropdownInvoke;
        Intrinsics.j(defaultDropdownInputs, "<this>");
        q1.f.Dropdown error = z10 ? defaultDropdownInputs.getError() : z11 ? defaultDropdownInputs.getWarning() : z12 ? defaultDropdownInputs.getSuccess() : z13 ? defaultDropdownInputs.getDisabled() : z14 ? defaultDropdownInputs.getStatic() : defaultDropdownInputs.getDefault();
        return (function1 == null || (dropdownInvoke = function1.invoke(error)) == null) ? error : dropdownInvoke;
    }

    public static /* synthetic */ q1.f.Dropdown b(DefaultDropdownInputs defaultDropdownInputs, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Function1 function1, int i10, Object obj) {
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
            z13 = false;
        }
        if ((i10 & 16) != 0) {
            z14 = false;
        }
        if ((i10 & 32) != 0) {
            function1 = null;
        }
        return a(defaultDropdownInputs, z10, z11, z12, z13, z14, function1);
    }
}
