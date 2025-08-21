package li;

import androidx.compose.runtime.Composer;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0014\u001a\u00020\b2,\u0010\u0013\u001a(\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0002\b\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lli/l;", "LJi/h;", "Lki/q1$j;", "template", "", "text", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "Z", "(Lki/q1$j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lj0/I;", "", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/ExtensionFunctionType;", "block", "h0", "(Lkotlin/jvm/functions/Function4;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface l extends Ji.h {
    void Z(q1.Label template, String text, Function1<? super TextLayoutResult, Unit> onTextLayout);

    void h0(Function4<? super InterfaceC14888I, ? super Integer, ? super Composer, ? super Integer, Unit> block);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void E(l lVar, q1.Label label, String str, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: titleLabel");
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: li.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return l.l0((TextLayoutResult) obj2);
                }
            };
        }
        lVar.Z(label, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit l0(TextLayoutResult it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }
}
