package Kp;

import Gp.ProductRatings;
import Jp.Filter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJX\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00102\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u001e0\u0010H¦@¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"LKp/g;", "", "", "productId", "", "reviewsToFetch", "LKp/c;", "c", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paginationIndex", "Ljava/util/ArrayList;", "LJp/a;", "Lkotlin/collections/ArrayList;", "filterArray", "LJp/b;", "sortBy", "", "LKp/b;", "a", "(Ljava/lang/String;IILjava/util/ArrayList;LJp/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKp/e;", "reviewSubmitRequest", "", "b", "(LKp/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewId", "LKp/a;", "feedbackVote", "d", "(Ljava/lang/String;LKp/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productIds", "LGp/c;", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface g {
    Object a(String str, int i10, int i11, ArrayList<Filter> arrayList, Jp.b bVar, Continuation<? super List<ProductReviewDetails>> continuation);

    Object b(ProductReviewSubmitRequest productReviewSubmitRequest, Continuation<? super Unit> continuation);

    Object c(String str, int i10, Continuation<? super ProductReviewFullDetails> continuation);

    Object d(String str, a aVar, Continuation<? super Unit> continuation);

    Object e(List<String> list, Continuation<? super List<ProductRatings>> continuation);
}
