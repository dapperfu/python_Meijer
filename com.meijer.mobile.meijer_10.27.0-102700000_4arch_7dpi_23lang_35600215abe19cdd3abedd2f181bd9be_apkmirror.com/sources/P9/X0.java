package P9;

import O8.EmarsysConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LP9/X0;", "", "LO8/h;", "config", "LP9/V0;", "testComponent", "<init>", "(LO8/h;LP9/V0;)V", "a", "LP9/V0;", "component", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class X0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final V0 component;

    public X0(final EmarsysConfig config, V0 v02) {
        Intrinsics.j(config, "config");
        v02 = v02 == null ? new V0(config) : v02;
        this.component = v02;
        Z0.c(v02);
        Z0.a().getConcurrentHandlerHolder().getCoreHandler().b(new Runnable() { // from class: P9.W0
            @Override // java.lang.Runnable
            public final void run() {
                X0.b(this.f24995a, config);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(X0 x02, EmarsysConfig emarsysConfig) {
        x02.component.K3(emarsysConfig);
    }

    public /* synthetic */ X0(EmarsysConfig emarsysConfig, V0 v02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(emarsysConfig, (i10 & 2) != 0 ? null : v02);
    }
}
