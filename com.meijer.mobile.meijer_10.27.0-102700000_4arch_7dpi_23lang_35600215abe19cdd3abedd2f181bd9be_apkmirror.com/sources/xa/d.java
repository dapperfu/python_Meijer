package xa;

import F9.l;
import U9.MobileEngageRequestContext;
import java.util.LinkedHashMap;
import java.util.Map;
import k9.C15125a;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001c"}, d2 = {"Lxa/d;", "Lxa/a;", "LU9/k;", "requestContext", "LDa/b;", "requestModelHelper", "LF9/l;", "", "deviceEventStateStorage", "<init>", "(LU9/k;LDa/b;LF9/l;)V", "Ly9/c;", "requestModel", "", "", "c", "(Ly9/c;)Ljava/util/Map;", "", "e", "(Ly9/c;)Z", "LU9/k;", "getRequestContext", "()LU9/k;", "d", "LDa/b;", "f", "()LDa/b;", "LF9/l;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC18027a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Da.b requestModelHelper;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String> deviceEventStateStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MobileEngageRequestContext requestContext, Da.b requestModelHelper, l<String> deviceEventStateStorage) {
        super(requestContext, requestModelHelper);
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        Intrinsics.j(deviceEventStateStorage, "deviceEventStateStorage");
        this.requestContext = requestContext;
        this.requestModelHelper = requestModelHelper;
        this.deviceEventStateStorage = deviceEventStateStorage;
    }

    @Override // xa.AbstractC18027a
    public Map<String, Object> c(y9.c requestModel) {
        Map<String, Object> linkedHashMap;
        Intrinsics.j(requestModel, "requestModel");
        Map<String, Object> mapD = requestModel.d();
        if (mapD == null || (linkedHashMap = MapsKt.D(mapD)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        String str = this.deviceEventStateStorage.get();
        Intrinsics.g(str);
        linkedHashMap.put("deviceEventState", new JSONObject(str));
        return linkedHashMap;
    }

    @Override // xa.AbstractC18027a
    public boolean e(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return (getRequestModelHelper().b(requestModel) || getRequestModelHelper().a(requestModel)) && this.deviceEventStateStorage.get() != null && C15125a.c(N8.a.f21473d);
    }

    /* renamed from: f, reason: from getter */
    public Da.b getRequestModelHelper() {
        return this.requestModelHelper;
    }
}
