package Io;

import Co.Category;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.q2;
import com.meijer.mobile.product.model.hybris.api.models.HybrisCategory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisCategory;", "LCo/a;", "b", "(Lcom/meijer/mobile/product/model/hybris/api/models/HybrisCategory;)LCo/a;", "", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Io.a$a, reason: collision with other inner class name */
    public static final class C0227a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            String str = (String) CollectionsKt.u0(StringsKt.a1(((HybrisCategory) t11).getCode(), new String[]{"-"}, false, 0, 6, null));
            if (str == null) {
                str = "";
            }
            String str2 = (String) CollectionsKt.u0(StringsKt.a1(((HybrisCategory) t10).getCode(), new String[]{"-"}, false, 0, 6, null));
            return ComparisonsKt.d(str, str2 != null ? str2 : "");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f14317a;

        public b(Comparator comparator) {
            this.f14317a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Integer numV;
            Integer numV2;
            Integer numValueOf = Integer.valueOf(a.e.API_PRIORITY_OTHER);
            int iCompare = this.f14317a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            String str = (String) CollectionsKt.F0(StringsKt.a1(((HybrisCategory) t10).getCode(), new String[]{"-"}, false, 0, 6, null));
            if (str == null || (numV = StringsKt.v(str)) == null) {
                numV = numValueOf;
            }
            String str2 = (String) CollectionsKt.F0(StringsKt.a1(((HybrisCategory) t11).getCode(), new String[]{"-"}, false, 0, 6, null));
            if (str2 != null && (numV2 = StringsKt.v(str2)) != null) {
                numValueOf = numV2;
            }
            return ComparisonsKt.d(numV, numValueOf);
        }
    }

    public static final String a(List<HybrisCategory> list) {
        String url;
        List listA1;
        Object next;
        String strValueOf;
        Intrinsics.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.r0(((HybrisCategory) obj).getCode())) {
                arrayList.add(obj);
            }
        }
        HybrisCategory hybrisCategory = (HybrisCategory) CollectionsKt.u0(CollectionsKt.Z0(arrayList, new b(new C0227a())));
        String string = null;
        if (hybrisCategory != null && (url = hybrisCategory.getUrl()) != null && (listA1 = StringsKt.a1(url, new String[]{q2.f92724c}, false, 0, 6, null)) != null) {
            Iterator it = listA1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!StringsKt.r0((String) next)) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                if (str.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    char cCharAt = str.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        Locale US = Locale.US;
                        Intrinsics.i(US, "US");
                        strValueOf = CharsKt.e(cCharAt, US);
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb2.append((Object) strValueOf);
                    String strSubstring = str.substring(1);
                    Intrinsics.i(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    string = sb2.toString();
                } else {
                    string = str;
                }
            }
        }
        return string == null ? "" : string;
    }

    public static final Category b(HybrisCategory hybrisCategory) {
        Intrinsics.j(hybrisCategory, "<this>");
        return new Category(hybrisCategory.getCode(), hybrisCategory.getName(), hybrisCategory.getUrl());
    }
}
