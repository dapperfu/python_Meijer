package xa;

import U9.MobileEngageRequestContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y9.C18190a;
import y9.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lxa/a;", "LQ8/c;", "Ly9/c;", "LU9/k;", "requestContext", "LDa/b;", "requestModelHelper", "<init>", "(LU9/k;LDa/b;)V", "requestModel", "d", "(Ly9/c;)Ly9/c;", "", "", "", "c", "(Ly9/c;)Ljava/util/Map;", "b", "", "e", "(Ly9/c;)Z", "a", "LU9/k;", "getRequestContext", "()LU9/k;", "LDa/b;", "getRequestModelHelper", "()LDa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: xa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18027a implements Q8.c<y9.c, y9.c> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Da.b requestModelHelper;

    public AbstractC18027a(MobileEngageRequestContext requestContext, Da.b bVar) {
        Intrinsics.j(requestContext, "requestContext");
        this.requestContext = requestContext;
        this.requestModelHelper = bVar;
    }

    public abstract boolean e(y9.c requestModel);

    public Map<String, String> b(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return requestModel.a();
    }

    public Map<String, Object> c(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return requestModel.d();
    }

    @Override // Q8.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public y9.c a(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        if (!e(requestModel)) {
            return requestModel;
        }
        Map<String, String> mapB = b(requestModel);
        Map<String, ? extends Object> mapC = c(requestModel);
        if (requestModel instanceof C18190a) {
            C18190a.C2745a c2745a = new C18190a.C2745a(requestModel);
            c2745a.j(mapB);
            if (mapC != null) {
                c2745a.l(mapC);
            }
            return c2745a.a();
        }
        c.a aVar = new c.a(requestModel);
        aVar.j(mapB);
        if (mapC != null) {
            aVar.l(mapC);
        }
        return aVar.a();
    }

    public /* synthetic */ AbstractC18027a(MobileEngageRequestContext mobileEngageRequestContext, Da.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mobileEngageRequestContext, (i10 & 2) != 0 ? null : bVar);
    }
}
