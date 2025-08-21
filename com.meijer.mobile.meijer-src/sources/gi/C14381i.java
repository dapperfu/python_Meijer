package gi;

import Hc.a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "Lgi/f;", "gamAds", "", "pageType", "", "isGamEnabled", "LHc/a$a;", "builder", "shopperId", "", "adSlotPosition", "Lgi/d;", "c", "(Ljava/util/List;Ljava/lang/String;ZLHc/a$a;Ljava/lang/String;Ljava/lang/Integer;)Lgi/d;", "models_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gi.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C14381i {
    public static final GoogleAdData c(List<? extends EnumC14378f> gamAds, String pageType, boolean z10, a.C0201a builder, String str, Integer num) {
        Intrinsics.j(gamAds, "gamAds");
        Intrinsics.j(pageType, "pageType");
        Intrinsics.j(builder, "builder");
        if (!z10) {
            return null;
        }
        List<? extends EnumC14378f> list = gamAds;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Gc.e adSize = ((EnumC14378f) it.next()).getAdSize();
            if (adSize != null) {
                arrayList.add(adSize);
            }
        }
        Gc.e[] eVarArr = (Gc.e[]) arrayList.toArray(new Gc.e[0]);
        if (eVarArr.length == 0) {
            qw.a.INSTANCE.d("GoogleAdData not created: adSizes is empty.", new Object[0]);
            return null;
        }
        for (EnumC14378f enumC14378f : list) {
            qw.a.INSTANCE.a("AdType: " + enumC14378f.name() + ", AdSize: " + enumC14378f.getAdSize(), new Object[0]);
        }
        String strB0 = CollectionsKt.B0(list, ",", null, null, 0, null, new Function1() { // from class: gi.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14381i.d((EnumC14378f) obj);
            }
        }, 30, null);
        String strB02 = CollectionsKt.B0(list, ",", null, null, 0, null, new Function1() { // from class: gi.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14381i.e((EnumC14378f) obj);
            }
        }, 30, null);
        Hc.a aVarI = builder.g("pos", strB0).h("lang", CollectionsKt.e("en")).g(PlaceTypes.STORE, "meijer-us").g("page_type", pageType).i();
        Intrinsics.i(aVarI, "build(...)");
        String str2 = StringsKt.H(pageType, "search", true) ? "/search-adSlot-%d" : "/adSlot-%d";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/22908976526/");
        sb2.append(pageType);
        if (num != null) {
            String str3 = String.format(str2, Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1));
            Intrinsics.i(str3, "format(...)");
            sb2.append(str3);
        }
        String string = sb2.toString();
        if (!StringsKt.s0(string)) {
            return new GoogleAdData(aVarI, (Gc.e) ArraysKt.g0(eVarArr), eVarArr, string, new GoogleAdAnalytics(strB02, pageType, strB02, string, str));
        }
        qw.a.INSTANCE.d("GoogleAdData not created: adUnitId is blank.", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(EnumC14378f it) {
        Intrinsics.j(it, "it");
        return it.getPlacementPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(EnumC14378f it) {
        Intrinsics.j(it, "it");
        return it.getAdDisplaySize();
    }
}
