package za;

import A9.a;
import A9.c;
import W9.MobileEngageRequestContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lza/a;", "LS8/c;", "LA9/c;", "LW9/k;", "requestContext", "LFa/b;", "requestModelHelper", "<init>", "(LW9/k;LFa/b;)V", "requestModel", "d", "(LA9/c;)LA9/c;", "", "", "", "c", "(LA9/c;)Ljava/util/Map;", "b", "", "e", "(LA9/c;)Z", "a", "LW9/k;", "getRequestContext", "()LW9/k;", "LFa/b;", "getRequestModelHelper", "()LFa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: za.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18464a implements S8.c<A9.c, A9.c> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Fa.b requestModelHelper;

    public AbstractC18464a(MobileEngageRequestContext requestContext, Fa.b bVar) {
        Intrinsics.j(requestContext, "requestContext");
        this.requestContext = requestContext;
        this.requestModelHelper = bVar;
    }

    public abstract boolean e(A9.c requestModel);

    public Map<String, String> b(A9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return requestModel.a();
    }

    public Map<String, Object> c(A9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        return requestModel.d();
    }

    @Override // S8.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public A9.c a(A9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        if (!e(requestModel)) {
            return requestModel;
        }
        Map<String, String> mapB = b(requestModel);
        Map<String, ? extends Object> mapC = c(requestModel);
        if (requestModel instanceof A9.a) {
            a.C0007a c0007a = new a.C0007a(requestModel);
            c0007a.j(mapB);
            if (mapC != null) {
                c0007a.l(mapC);
            }
            return c0007a.a();
        }
        c.a aVar = new c.a(requestModel);
        aVar.j(mapB);
        if (mapC != null) {
            aVar.l(mapC);
        }
        return aVar.a();
    }

    public /* synthetic */ AbstractC18464a(MobileEngageRequestContext mobileEngageRequestContext, Fa.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mobileEngageRequestContext, (i10 & 2) != 0 ? null : bVar);
    }
}
