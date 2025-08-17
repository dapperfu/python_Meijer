package Lk;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"LLk/b;", "ViewState", "Event", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "state", "", "d", "event", "a", "Ltv/B;", "Ltv/B;", "_viewState", "Ltv/A;", "b", "Ltv/A;", "_events", "Ltv/P;", "c", "()Ltv/P;", "viewState", "Ltv/F;", "()Ltv/F;", "events", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class b<ViewState, Event> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<Event> _events = C17146H.b(0, 1, null, 5, null);

    public final void a(Event event) {
        this._events.b(event);
    }

    public final InterfaceC17144F<Event> b() {
        return C17154h.b(this._events);
    }

    public final P<ViewState> c() {
        return C17154h.c(this._viewState);
    }

    public final void d(ViewState state) {
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (!interfaceC17140B.e(interfaceC17140B.getValue(), state)) {
        }
    }

    public b(ViewState viewstate) {
        this._viewState = S.a(viewstate);
    }
}
