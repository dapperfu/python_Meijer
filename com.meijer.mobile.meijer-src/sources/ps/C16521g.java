package ps;

import android.app.Activity;
import android.content.Context;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ps.AbstractC16499C;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R*\u00109\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010<\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108¨\u0006="}, d2 = {"Lps/g;", "", "Landroid/app/Activity;", "activityContext", "<init>", "(Landroid/app/Activity;)V", "", "code", "", "n", "(I)V", "Lps/C;", "request", "h", "(Lps/C;)V", "i", "()V", "f", "g", "activeIntentCode", "k", "(I)Lps/g;", "c", "j", "d", "a", "Landroid/app/Activity;", "Lyo/k;", "b", "Lyo/k;", "userManager", "Lil/m;", "Lil/m;", "cartRepository", "LDl/e;", "LDl/e;", "meijerIntent", "Lhi/a;", "e", "Lhi/a;", "analyticsEngine", "LDk/b;", "LDk/b;", "meijerBus", "LTq/j;", "LTq/j;", "storeProvider", "Lzl/k;", "Lzl/k;", "featureManager", "Ljava/lang/Integer;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getCloseDrawerListener", "()Lkotlin/jvm/functions/Function0;", "l", "(Lkotlin/jvm/functions/Function0;)V", "closeDrawerListener", "getOpenDrawerListener", "m", "openDrawerListener", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16521g {

    /* renamed from: l, reason: collision with root package name */
    public static final int f157265l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Activity activityContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Dl.e meijerIntent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Dk.b meijerBus;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Integer activeIntentCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> closeDrawerListener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> openDrawerListener;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lps/g$a;", "", "Lyo/k;", "c", "()Lyo/k;", "Lil/m;", "h", "()Lil/m;", "LDl/e;", "e", "()LDl/e;", "Lhi/a;", "a", "()Lhi/a;", "LDk/b;", "d", "()LDk/b;", "LTq/j;", "f", "()LTq/j;", "Lzl/k;", "b", "()Lzl/k;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ps.g$a */
    public interface a {
        InterfaceC14523a a();

        zl.k b();

        yo.k c();

        Dk.b d();

        Dl.e e();

        Tq.j f();

        il.m h();
    }

    public C16521g(Activity activityContext) {
        Intrinsics.j(activityContext, "activityContext");
        this.activityContext = activityContext;
        Context applicationContext = activityContext.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        a aVar = (a) nu.d.a(applicationContext, a.class);
        this.userManager = aVar.c();
        this.cartRepository = aVar.h();
        this.meijerIntent = aVar.e();
        this.analyticsEngine = aVar.a();
        this.meijerBus = aVar.d();
        this.storeProvider = aVar.f();
        this.featureManager = aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f143329a;
    }

    private final void n(final int code) {
        String str = code != 165 ? code != 180 ? code != 200 ? code != 1000 ? code != 1200 ? code != 9000 ? code != 536871032 ? null : "event: menu coupons" : "event: menu help" : "event: menu mcard" : "event: menu receipts & savings" : "event: menu shopping List" : "shopDepartmentMenu" : "event: menu rewards";
        if (str != null) {
            this.analyticsEngine.b(C14756c.a(str), new Function1() { // from class: ps.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16521g.o(code, (TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(int i10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        if (i10 == 180) {
            track.h("siteSection", "menu");
        } else {
            track.v("menu");
        }
        return Unit.f143329a;
    }

    public final void c() {
        Function0<Unit> function0 = this.closeDrawerListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void h(AbstractC16499C request) {
        Intrinsics.j(request, "request");
        if (Intrinsics.e(request, AbstractC16499C.a.f157096a)) {
            c();
            return;
        }
        if (Intrinsics.e(request, AbstractC16499C.b.f157097a)) {
            f();
            return;
        }
        if (request instanceof AbstractC16499C.Destination) {
            d(((AbstractC16499C.Destination) request).getCode());
        } else if (Intrinsics.e(request, AbstractC16499C.d.f157099a)) {
            g();
        } else {
            if (!Intrinsics.e(request, AbstractC16499C.e.f157100a)) {
                throw new NoWhenBranchMatchedException();
            }
            i();
        }
    }

    public final void j() {
        Function0<Unit> function0 = this.openDrawerListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void l(Function0<Unit> function0) {
        this.closeDrawerListener = function0;
    }

    public final void m(Function0<Unit> function0) {
        this.openDrawerListener = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r9) {
        /*
            r8 = this;
            r8.c()
            r0 = 800(0x320, float:1.121E-42)
            r1 = 0
            if (r9 != r0) goto L12
            Bl.k r0 = Bl.k.f3130a
            android.app.Activity r2 = r8.activityContext
            android.content.Intent r0 = r0.e(r2, r1)
        L10:
            r4 = r9
            goto L5b
        L12:
            r0 = 1700(0x6a4, float:2.382E-42)
            r2 = 268436157(0x100002bd, float:2.5245658E-29)
            if (r9 == r0) goto L27
            r0 = 1901(0x76d, float:2.664E-42)
            if (r9 == r0) goto L24
            if (r9 == r2) goto L21
            r0 = 0
            goto L29
        L21:
            java.lang.String r0 = "event: menu manage account"
            goto L29
        L24:
            java.lang.String r0 = "event: menu hearing aids"
            goto L29
        L27:
            java.lang.String r0 = "event: menu pharmacy website"
        L29:
            if (r0 == 0) goto L39
            hi.a r3 = r8.analyticsEngine
            ii.h$a r0 = ii.C14756c.a(r0)
            ps.e r4 = new ps.e
            r4.<init>()
            r3.b(r0, r4)
        L39:
            if (r9 != r2) goto L4e
            zl.k r0 = r8.featureManager
            zl.f$h0 r2 = zl.AbstractC18503f.h0.f172881h
            boolean r0 = r0.e(r2)
            if (r0 == 0) goto L4e
            Bl.u r0 = Bl.u.f3153a
            android.app.Activity r2 = r8.activityContext
            android.content.Intent r0 = r0.a(r2)
            goto L10
        L4e:
            Dl.e r2 = r8.meijerIntent
            android.app.Activity r3 = r8.activityContext
            r6 = 4
            r7 = 0
            r5 = 0
            r4 = r9
            android.content.Intent r9 = Dl.e.t(r2, r3, r4, r5, r6, r7)
            r0 = r9
        L5b:
            if (r0 == 0) goto L8a
            java.lang.String r9 = "com.meijer.intent.extra.EXTERNAL_APPLICATION"
            boolean r2 = r0.hasExtra(r9)
            if (r2 == 0) goto L69
            r0.removeExtra(r9)
            goto L72
        L69:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            android.content.Intent r9 = r0.addFlags(r9)
            kotlin.jvm.internal.Intrinsics.g(r9)
        L72:
            java.lang.String r9 = "com.meijer.intent.extra.FROM_NAV_MENU"
            r2 = 1
            r0.putExtra(r9, r2)
            r8.n(r4)
            android.app.Activity r9 = r8.activityContext
            o2.d[] r1 = new o2.d[r1]
            androidx.core.app.d r1 = androidx.core.app.d.d(r9, r1)
            android.os.Bundle r1 = r1.e()
            r9.startActivity(r0, r1)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.C16521g.d(int):void");
    }

    public final void f() {
        c();
        Activity activity = this.activityContext;
        activity.startActivity(Bl.f.f3124a.a(activity, this.featureManager.e(AbstractC18503f.h0.f172881h)));
    }

    public final void g() {
        c();
        if (this.storeProvider.d()) {
            Activity activity = this.activityContext;
            activity.startActivity(Bl.s.d(activity, this.storeProvider.b(), this.storeProvider.e(), pk.i.f156744b, false, 16, null));
        } else {
            d(HttpResponseStatus.ERROR_BAD_REQUEST);
        }
    }

    public final void i() {
        c();
        Activity activity = this.activityContext;
        activity.startActivity(Bl.k.b(activity, false, null, null, null, null, null, 126, null));
    }

    public final C16521g k(int activeIntentCode) {
        this.activeIntentCode = Integer.valueOf(activeIntentCode);
        return this;
    }
}
