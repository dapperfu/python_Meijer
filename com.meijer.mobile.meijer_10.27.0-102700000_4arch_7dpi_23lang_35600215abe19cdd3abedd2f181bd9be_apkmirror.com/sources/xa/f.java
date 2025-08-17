package xa;

import U9.MobileEngageRequestContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lxa/f;", "Lxa/a;", "LU9/k;", "requestContext", "LDa/b;", "requestModelHelper", "<init>", "(LU9/k;LDa/b;)V", "Ly9/c;", "requestModel", "", "", "", "c", "(Ly9/c;)Ljava/util/Map;", "", "e", "(Ly9/c;)Z", "LU9/k;", "f", "()LU9/k;", "d", "LDa/b;", "g", "()LDa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC18027a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Da.b requestModelHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MobileEngageRequestContext requestContext, Da.b requestModelHelper) {
        super(requestContext, requestModelHelper);
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.requestContext = requestContext;
        this.requestModelHelper = requestModelHelper;
    }

    @Override // xa.AbstractC18027a
    public Map<String, Object> c(y9.c requestModel) {
        Map<String, Object> linkedHashMap;
        Intrinsics.j(requestModel, "requestModel");
        Map<String, Object> mapD = requestModel.d();
        if (mapD == null || (linkedHashMap = MapsKt.D(mapD)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put("openIdToken", getRequestContext().getOpenIdToken());
        return linkedHashMap;
    }

    @Override // xa.AbstractC18027a
    public boolean e(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return getRequestModelHelper().c(requestModel) && getRequestModelHelper().d(requestModel) && getRequestContext().getOpenIdToken() != null;
    }

    /* renamed from: f, reason: from getter */
    public MobileEngageRequestContext getRequestContext() {
        return this.requestContext;
    }

    /* renamed from: g, reason: from getter */
    public Da.b getRequestModelHelper() {
        return this.requestModelHelper;
    }
}
