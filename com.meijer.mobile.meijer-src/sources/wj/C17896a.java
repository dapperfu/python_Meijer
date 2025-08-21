package wj;

import A0.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lwj/a;", "ViewState", "Effect", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "stateChange", "", "d", "(Lkotlin/jvm/functions/Function1;)V", "effect", "c", "Lpv/B;", "a", "Lpv/B;", "_stateFlow", "Lpv/A;", "b", "Lpv/A;", "_effectFlow", "Lpv/P;", "()Lpv/P;", "stateFlow", "Lpv/F;", "()Lpv/F;", "effectFlow", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: wj.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17896a<ViewState, Effect> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _stateFlow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<Effect> _effectFlow = C16555H.b(0, 1, null, 5, null);

    public final InterfaceC16553F<Effect> a() {
        return C16563h.b(this._effectFlow);
    }

    public final P<ViewState> b() {
        return C16563h.c(this._stateFlow);
    }

    public final void c(Effect effect) {
        this._effectFlow.b(effect);
    }

    public final void d(Function1<? super ViewState, ? extends ViewState> stateChange) {
        c.f fVar;
        Intrinsics.j(stateChange, "stateChange");
        stateChange.invoke(this._stateFlow.getValue());
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            fVar = (Object) interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(fVar, stateChange.invoke(fVar)));
    }

    public C17896a(ViewState viewstate) {
        this._stateFlow = S.a(viewstate);
    }
}
