package ps;

import Ki.C;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
import ji.C15040a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "activeIntentCode", "", "isDevMode", "", "Lps/h;", "a", "(Ljava/lang/Integer;Z)Ljava/util/List;", "isNewShoppingListEnabled", "isUserLoggedIn", "cartCount", "Lps/s;", "b", "(ZZILjava/lang/Integer;)Ljava/util/List;", "c", "()Ljava/util/List;", "isMedalliaSurveyEnabled", "isChatBotEnabled", "d", "(ZZLjava/lang/Integer;Z)Ljava/util/List;", "selected", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ps.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16518d {
    public static final List<DefaultDrawerItem> a(Integer num, boolean z10) {
        int i10 = Cj.i.f4693D1;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(8100, i10, companion.d(Cj.o.f5035P, new Object[0]), num != null && num.intValue() == 8100, z10), new DefaultDrawerItem(8101, Cj.i.f4693D1, companion.d(Cj.o.f5023J, new Object[0]), num != null && num.intValue() == 8101, z10), new DefaultDrawerItem(7256, Cj.i.f4724O, companion.d(Cj.o.f5033O, new Object[0]), num != null && num.intValue() == 7256, z10));
    }

    public static final List<InterfaceC16533s> b(boolean z10, boolean z11, int i10, Integer num) {
        int i11 = f0.f157254d;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(0, i11, companion.d(Cj.o.f5041S, new Object[0]), num != null && num.intValue() == 0, false, 16, null), new DefaultDrawerItem(180, Cj.i.f4705H1, companion.d(Cj.o.f5046W, new Object[0]), num != null && num.intValue() == 180, z11), new DefaultDrawerItem(165, f0.f157255e, companion.d(Cj.o.f5045V, new Object[0]), num != null && num.intValue() == 165, false, 16, null), new DefaultDrawerItem(536871032, f0.f157251a, companion.d(Cj.o.f5031N, new Object[0]), num != null && num.intValue() == 536871032, false, 16, null), new CartDrawerItem(268437856, Cj.i.f4811n1, companion.d(Cj.o.f5027L, new Object[0]), i10, num != null && num.intValue() == 268437856, z11), new DefaultDrawerItem(268437956, Cj.i.f4713K0, companion.d(Cj.o.f5048Y, new Object[0]), num != null && num.intValue() == 268437956, false, 16, null), new DefaultDrawerItem(1000, f0.f157257g, companion.d(Cj.o.f5053b0, new Object[0]), num != null && num.intValue() == 1000, false, 16, null), new DefaultDrawerItem(536871412, f0.f157262l, companion.d(Cj.o.f5065h0, new Object[0]), num != null && num.intValue() == 536871412, false, 16, null), new DefaultDrawerItem(HttpResponseStatus.SUCCESS_OK, z10 ? Cj.i.f4738S1 : f0.f157260j, companion.d(Cj.o.f5061f0, new Object[0]), num != null && num.intValue() == 200, false, 16, null), new DefaultDrawerItem(268437756, f0.f157259i, companion.d(Cj.o.f5059e0, new Object[0]), num != null && num.intValue() == 268437756, false, 16, null));
    }

    public static final List<DefaultDrawerItem> c() {
        int i10 = C15040a.f140757Y0;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(1700, i10, companion.d(Cj.o.f5047X, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1901, f0.f157252b, companion.d(Cj.o.f5037Q, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1200, Cj.i.f4718M, companion.d(Cj.o.f5043T, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1201, C.b.d.e.f16960e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Cj.o.f5044U, new Object[0]), false, false, 24, null), new DefaultDrawerItem(1100, C.b.h.l.f17020e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Cj.o.f5049Z, new Object[0]), false, false, 24, null), new DefaultDrawerItem(5100, C.b.c.a.f16940e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Cj.o.f5025K, new Object[0]), false, false, 24, null));
    }

    public static final List<DefaultDrawerItem> d(boolean z10, boolean z11, Integer num, boolean z12) {
        int i10 = f0.f157258h;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        return CollectionsKt.p(new DefaultDrawerItem(268436157, i10, companion.d(Cj.o.f5057d0, new Object[0]), num != null && num.intValue() == 268436157, false, 16, null), new DefaultDrawerItem(9000, f0.f157253c, companion.d(Cj.o.f5039R, new Object[0]), num != null && num.intValue() == 9000, false, 16, null), new DefaultDrawerItem(16385, C.b.a.c.f16918e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(Cj.o.f5029M, new Object[0]), false, z12, 8, null), new DefaultDrawerItem(8266, f0.f157256f, companion.d(Cj.o.f5051a0, new Object[0]), false, z10, 8, null), new DefaultDrawerItem(800, f0.f157261k, companion.d(Cj.o.f5063g0, new Object[0]), false, z11, 8, null));
    }
}
