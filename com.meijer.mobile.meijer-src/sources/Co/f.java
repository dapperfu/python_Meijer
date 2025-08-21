package Co;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "LCo/e;", "a", "(Ljava/util/List;)LCo/e;", "fulldetails_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((Image) t10).z()), Boolean.valueOf(((Image) t11).z()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f5276a;

        public c(Comparator comparator) {
            this.f5276a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f5276a.compare(t10, t11);
            return iCompare != 0 ? iCompare : ComparisonsKt.d(((Image) t10).Z0(), ((Image) t11).Z0());
        }
    }

    public static final Image a(List<Image> list) {
        Intrinsics.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Image) obj).h()) {
                arrayList.add(obj);
            }
        }
        List listZ0 = CollectionsKt.Z0(CollectionsKt.Z0(arrayList, new c(new a())), new b());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listZ0) {
            if (((Image) obj2).f() <= 200) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list2 = (List) pair.a();
        List list3 = (List) pair.b();
        Image image = (Image) CollectionsKt.F0(list2);
        if (image != null) {
            return image;
        }
        Image image2 = (Image) CollectionsKt.u0(list3);
        if (image2 != null) {
            return image2.j(HttpResponseStatus.SUCCESS_OK);
        }
        return null;
    }
}
