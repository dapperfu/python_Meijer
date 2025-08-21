package En;

import Cn.HelpViewState;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LEn/G;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lyo/k;", "userManager", "<init>", "(Lyo/k;)V", "", "LCn/c;", "m", "()Ljava/util/List;", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "a", "Lyo/k;", "Lpv/B;", "LCn/d;", "b", "Lpv/B;", "_viewState", "Lpv/P;", "c", "Lpv/P;", "n", "()Lpv/P;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class G extends c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<HelpViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<HelpViewState> viewState;

    public G(yo.k userManager) {
        Intrinsics.j(userManager, "userManager");
        this.userManager = userManager;
        InterfaceC16549B<HelpViewState> interfaceC16549BA = S.a(new HelpViewState(null, 1, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
    }

    private final List<Cn.c> m() {
        return this.userManager.b() ? Cn.c.b() : CollectionsKt.p(Cn.c.f5239c, Cn.c.f5241e, Cn.c.f5242f, Cn.c.f5243g);
    }

    public final P<HelpViewState> n() {
        return this.viewState;
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        HelpViewState value;
        Intrinsics.j(owner, "owner");
        super.onCreate(owner);
        InterfaceC16549B<HelpViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, value.a(m())));
    }
}
