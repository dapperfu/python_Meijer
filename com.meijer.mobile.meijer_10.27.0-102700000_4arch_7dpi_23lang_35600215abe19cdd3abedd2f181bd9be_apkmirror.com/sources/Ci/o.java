package Ci;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LCi/o;", "LIi/h;", "", "text", "Lkotlin/Function0;", "", "onClick", "D", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onCloseClick", "Q", "(Lkotlin/jvm/functions/Function0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface o extends Ii.h {
    void D(String text, Function0<Unit> onClick);

    void Q(Function0<Unit> onCloseClick);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a0(o oVar, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeIcon");
        }
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: Ci.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.v();
                }
            };
        }
        oVar.Q(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit v() {
        return Unit.f142422a;
    }
}
