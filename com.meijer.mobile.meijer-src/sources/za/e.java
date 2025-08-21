package za;

import W9.MobileEngageRequestContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lza/e;", "Lza/a;", "LW9/k;", "requestContext", "LFa/b;", "requestModelHelper", "<init>", "(LW9/k;LFa/b;)V", "LA9/c;", "requestModel", "", "", "b", "(LA9/c;)Ljava/util/Map;", "", "e", "(LA9/c;)Z", "c", "LW9/k;", "f", "()LW9/k;", "d", "LFa/b;", "g", "()LFa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC18464a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Fa.b requestModelHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MobileEngageRequestContext requestContext, Fa.b requestModelHelper) {
        super(requestContext, requestModelHelper);
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.requestContext = requestContext;
        this.requestModelHelper = requestModelHelper;
    }

    @Override // za.AbstractC18464a
    public Map<String, String> b(A9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        Map<String, String> mapD = MapsKt.D(requestModel.a());
        String str = getRequestContext().b().get();
        if (str != null) {
            mapD.put("X-Client-State", str);
        }
        mapD.put("X-Request-Order", String.valueOf(getRequestContext().getTimestampProvider().a()));
        mapD.put("X-Client-Id", getRequestContext().getDeviceInfo().getClientId());
        return mapD;
    }

    @Override // za.AbstractC18464a
    public boolean e(A9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return getRequestModelHelper().c(requestModel);
    }

    /* renamed from: f, reason: from getter */
    public MobileEngageRequestContext getRequestContext() {
        return this.requestContext;
    }

    /* renamed from: g, reason: from getter */
    public Fa.b getRequestModelHelper() {
        return this.requestModelHelper;
    }
}
