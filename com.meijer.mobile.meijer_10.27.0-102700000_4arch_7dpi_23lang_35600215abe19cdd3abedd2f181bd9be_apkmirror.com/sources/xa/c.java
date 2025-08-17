package xa;

import U9.MobileEngageRequestContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxa/c;", "Lxa/a;", "LU9/k;", "requestContext", "<init>", "(LU9/k;)V", "Ly9/c;", "requestModel", "", "e", "(Ly9/c;)Z", "", "", "b", "(Ly9/c;)Ljava/util/Map;", "c", "LU9/k;", "f", "()LU9/k;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC18027a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    @Override // xa.AbstractC18027a
    public boolean e(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MobileEngageRequestContext requestContext) {
        super(requestContext, null, 2, null);
        Intrinsics.j(requestContext, "requestContext");
        this.requestContext = requestContext;
    }

    @Override // xa.AbstractC18027a
    public Map<String, String> b(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        Map<String, String> mapD = MapsKt.D(requestModel.a());
        mapD.put("Content-Type", "application/json");
        mapD.put("X-EMARSYS-SDK-VERSION", getRequestContext().getDeviceInfo().getSdkVersion());
        mapD.put("X-EMARSYS-SDK-MODE", getRequestContext().getDeviceInfo().getIsDebugMode() ? "debug" : "production");
        return mapD;
    }

    /* renamed from: f, reason: from getter */
    public MobileEngageRequestContext getRequestContext() {
        return this.requestContext;
    }
}
