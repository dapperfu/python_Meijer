package ps;

import Ji.C;
import ak.AbstractC5607a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ii.C14730a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "activeIntentCode", "", "isDevMode", "", "Lps/h;", "a", "(Ljava/lang/Integer;Z)Ljava/util/List;", "isNewShoppingListEnabled", "isUserLoggedIn", "cartCount", "Lps/s;", "b", "(ZZILjava/lang/Integer;)Ljava/util/List;", "c", "()Ljava/util/List;", "isMedalliaSurveyEnabled", "isChatBotEnabled", "d", "(ZZLjava/lang/Integer;Z)Ljava/util/List;", "selected", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ps.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16392d {
    public static final List<DefaultDrawerItem> a(Integer num, boolean z10) {
        int i10 = Bj.i.f2648D1;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(8100, i10, companion.d(Bj.o.f2990P, new Object[0]), num != null && num.intValue() == 8100, z10), new DefaultDrawerItem(8101, Bj.i.f2648D1, companion.d(Bj.o.f2978J, new Object[0]), num != null && num.intValue() == 8101, z10), new DefaultDrawerItem(7256, Bj.i.f2679O, companion.d(Bj.o.f2988O, new Object[0]), num != null && num.intValue() == 7256, z10));
    }

    public static final List<InterfaceC16407s> b(boolean z10, boolean z11, int i10, Integer num) {
        int i11 = f0.f156481d;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(0, i11, companion.d(Bj.o.f2996S, new Object[0]), num != null && num.intValue() == 0, false, 16, null), new DefaultDrawerItem(180, Bj.i.f2660H1, companion.d(Bj.o.f3001W, new Object[0]), num != null && num.intValue() == 180, z11), new DefaultDrawerItem(165, f0.f156482e, companion.d(Bj.o.f3000V, new Object[0]), num != null && num.intValue() == 165, false, 16, null), new DefaultDrawerItem(536871032, f0.f156478a, companion.d(Bj.o.f2986N, new Object[0]), num != null && num.intValue() == 536871032, false, 16, null), new CartDrawerItem(268437856, Bj.i.f2766n1, companion.d(Bj.o.f2982L, new Object[0]), i10, num != null && num.intValue() == 268437856, z11), new DefaultDrawerItem(268437956, Bj.i.f2668K0, companion.d(Bj.o.f3003Y, new Object[0]), num != null && num.intValue() == 268437956, false, 16, null), new DefaultDrawerItem(1000, f0.f156484g, companion.d(Bj.o.f3008b0, new Object[0]), num != null && num.intValue() == 1000, false, 16, null), new DefaultDrawerItem(536871412, f0.f156489l, companion.d(Bj.o.f3020h0, new Object[0]), num != null && num.intValue() == 536871412, false, 16, null), new DefaultDrawerItem(HttpResponseStatus.SUCCESS_OK, z10 ? Bj.i.f2693S1 : f0.f156487j, companion.d(Bj.o.f3016f0, new Object[0]), num != null && num.intValue() == 200, false, 16, null), new DefaultDrawerItem(268437756, f0.f156486i, companion.d(Bj.o.f3014e0, new Object[0]), num != null && num.intValue() == 268437756, false, 16, null));
    }

    public static final List<DefaultDrawerItem> c() {
        int i10 = C14730a.f137871Y0;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(1700, i10, companion.d(Bj.o.f3002X, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1901, f0.f156479b, companion.d(Bj.o.f2992Q, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1200, Bj.i.f2673M, companion.d(Bj.o.f2998T, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1201, C.b.d.e.f15416e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Bj.o.f2999U, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1100, C.b.h.l.f15476e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Bj.o.f3004Z, new Object[0]), false, false, 24, null), new DefaultDrawerItem(5100, C.b.c.a.f15396e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Bj.o.f2980K, new Object[0]), false, false, 24, null));
    }

    public static final List<DefaultDrawerItem> d(boolean z10, boolean z11, Integer num, boolean z12) {
        int i10 = f0.f156485h;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(268436157, i10, companion.d(Bj.o.f3012d0, new Object[0]), num != null && num.intValue() == 268436157, false, 16, null), new DefaultDrawerItem(9000, f0.f156480c, companion.d(Bj.o.f2994R, new Object[0]), num != null && num.intValue() == 9000, false, 16, null), new DefaultDrawerItem(16385, C.b.a.c.f15374e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Bj.o.f2984M, new Object[0]), false, z12, 8, null), new DefaultDrawerItem(8266, f0.f156483f, companion.d(Bj.o.f3006a0, new Object[0]), false, z10, 8, null), new DefaultDrawerItem(800, f0.f156488k, companion.d(Bj.o.f3018g0, new Object[0]), false, z11, 8, null));
    }
}
