package Cr;

import ki.DefaultTextArea;
import ki.DefaultTextInputs;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\f\u001aT\u0010\u000f\u001a\u00020\u000e*\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lki/y0;", "", "isError", "isWarning", "isDisabled", "Lkotlin/Function1;", "Lki/q1$f$e;", "Lkotlin/ParameterName;", "name", "template", "transformer", "d", "(Lki/y0;ZZZLkotlin/jvm/functions/Function1;)Lki/q1$f$e;", "Lki/x0;", "Lki/q1$f$d;", "c", "(Lki/x0;ZZZLkotlin/jvm/functions/Function1;)Lki/q1$f$d;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.f.TextInput g(q1.f.TextInput it) {
        Intrinsics.j(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.f.TextArea h(q1.f.TextArea it) {
        Intrinsics.j(it, "it");
        return it;
    }

    public static final q1.f.TextArea c(DefaultTextArea defaultTextArea, boolean z10, boolean z11, boolean z12, Function1<? super q1.f.TextArea, q1.f.TextArea> transformer) {
        Intrinsics.j(defaultTextArea, "<this>");
        Intrinsics.j(transformer, "transformer");
        return transformer.invoke(z10 ? defaultTextArea.getError() : z11 ? defaultTextArea.getWarning() : z12 ? defaultTextArea.getDisabled() : defaultTextArea.getDefault());
    }

    public static final q1.f.TextInput d(DefaultTextInputs defaultTextInputs, boolean z10, boolean z11, boolean z12, Function1<? super q1.f.TextInput, q1.f.TextInput> transformer) {
        Intrinsics.j(defaultTextInputs, "<this>");
        Intrinsics.j(transformer, "transformer");
        return transformer.invoke(z10 ? defaultTextInputs.getError() : z11 ? defaultTextInputs.getWarning() : z12 ? defaultTextInputs.getDisabled() : defaultTextInputs.getDefault());
    }

    public static /* synthetic */ q1.f.TextArea e(DefaultTextArea defaultTextArea, boolean z10, boolean z11, boolean z12, Function1 function1, int i10, Object obj) {
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
            function1 = new Function1() { // from class: Cr.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return f.h((q1.f.TextArea) obj2);
                }
            };
        }
        return c(defaultTextArea, z10, z11, z12, function1);
    }

    public static /* synthetic */ q1.f.TextInput f(DefaultTextInputs defaultTextInputs, boolean z10, boolean z11, boolean z12, Function1 function1, int i10, Object obj) {
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
            function1 = new Function1() { // from class: Cr.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return f.g((q1.f.TextInput) obj2);
                }
            };
        }
        return d(defaultTextInputs, z10, z11, z12, function1);
    }
}
