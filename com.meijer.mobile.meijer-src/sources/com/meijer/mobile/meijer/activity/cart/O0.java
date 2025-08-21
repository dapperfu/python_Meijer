package com.meijer.mobile.meijer.activity.cart;

import Co.Image;
import Co.ProductFullDetails;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCo/h;", "Lnk/g;", "b", "(LCo/h;)Lnk/g;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class O0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((nk.g) t10).z()), Boolean.valueOf(((nk.g) t11).z()));
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
        final /* synthetic */ Comparator f102485a;

        public c(Comparator comparator) {
            this.f102485a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f102485a.compare(t10, t11);
            return iCompare != 0 ? iCompare : ComparisonsKt.d(((nk.g) t10).Z0(), ((nk.g) t11).Z0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nk.g b(ProductFullDetails productFullDetails) {
        List<Image> listJ = productFullDetails.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
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
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        Image image = (Image) CollectionsKt.F0(list);
        if (image == null) {
            Image image2 = (Image) CollectionsKt.u0(list2);
            if (image2 != null) {
                return image2.j(HttpResponseStatus.SUCCESS_OK);
            }
            return null;
        }
        return image;
    }
}
