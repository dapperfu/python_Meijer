package N8;

import A9.c;
import W9.MobileEngageRequestContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9.C15475a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"LN8/e;", "", "LW9/k;", "mobileEngageRequestContext", "<init>", "(LW9/k;)V", "LA9/c;", "a", "()LA9/c;", "b", "LW9/k;", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext mobileEngageRequestContext;

    public e(MobileEngageRequestContext mobileEngageRequestContext) {
        Intrinsics.j(mobileEngageRequestContext, "mobileEngageRequestContext");
        this.mobileEngageRequestContext = mobileEngageRequestContext;
    }

    public A9.c a() {
        return new c.a(this.mobileEngageRequestContext.getTimestampProvider(), this.mobileEngageRequestContext.getUuidProvider()).k(A9.b.GET).p(C15475a.f149547a.b(this.mobileEngageRequestContext.getApplicationCode())).a();
    }

    public A9.c b() {
        return new c.a(this.mobileEngageRequestContext.getTimestampProvider(), this.mobileEngageRequestContext.getUuidProvider()).k(A9.b.GET).p(C15475a.f149547a.a(this.mobileEngageRequestContext.getApplicationCode())).a();
    }
}
