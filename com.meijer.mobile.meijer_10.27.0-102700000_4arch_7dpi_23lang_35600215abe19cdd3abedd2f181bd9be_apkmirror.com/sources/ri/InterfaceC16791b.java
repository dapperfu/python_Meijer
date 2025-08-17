package ri;

import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lri/b;", "LIi/h;", "Lji/q1$j;", "template", "", "text", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "m", "(Lji/q1$j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ri.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC16791b extends Ii.h {
    void m(q1.Label template, String text, Function1<? super TextLayoutResult, Unit> onTextLayout);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void o(InterfaceC16791b interfaceC16791b, q1.Label label, String str, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: label");
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: ri.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InterfaceC16791b.x0((TextLayoutResult) obj2);
                }
            };
        }
        interfaceC16791b.m(label, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit x0(TextLayoutResult it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }
}
