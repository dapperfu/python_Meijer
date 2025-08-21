package Mk;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"LMk/b;", "ViewState", "Event", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "state", "", "d", "event", "a", "Lpv/B;", "Lpv/B;", "_viewState", "Lpv/A;", "b", "Lpv/A;", "_events", "Lpv/P;", "c", "()Lpv/P;", "viewState", "Lpv/F;", "()Lpv/F;", "events", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b<ViewState, Event> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<Event> _events = C16555H.b(0, 1, null, 5, null);

    public final void a(Event event) {
        this._events.b(event);
    }

    public final InterfaceC16553F<Event> b() {
        return C16563h.b(this._events);
    }

    public final P<ViewState> c() {
        return C16563h.c(this._viewState);
    }

    public final void d(ViewState state) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (!interfaceC16549B.e(interfaceC16549B.getValue(), state)) {
        }
    }

    public b(ViewState viewstate) {
        this._viewState = S.a(viewstate);
    }
}
