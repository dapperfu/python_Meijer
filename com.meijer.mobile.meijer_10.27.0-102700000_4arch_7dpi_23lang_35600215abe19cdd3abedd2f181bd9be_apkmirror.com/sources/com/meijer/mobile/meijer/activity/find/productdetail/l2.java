package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Gp.ReviewItem;
import Ji.LocalThemeScope;
import Kp.ProductReviewDetails;
import Kp.ProductReviewFullDetails;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.activity.find.productdetail.a2;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductImageViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a_\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "product", "LKp/c;", "reviews", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "featureFlags", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "", "onProductReviewAction", "", "onRatingRowClicked", "Landroidx/compose/ui/Modifier;", "modifier", "k", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;LKp/c;Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class l2 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r72, final com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator r73, final Kp.ProductReviewFullDetails r74, final com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags r75, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.find.productdetail.a2, kotlin.Unit> r76, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r77, androidx.compose.ui.Modifier r78, androidx.compose.runtime.Composer r79, final int r80, final int r81) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.l2.k(Ji.M, com.meijer.mobile.meijer.activity.find.viewmodel.h1, Kp.c, com.meijer.mobile.meijer.activity.find.productdetail.W0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, ProductDetailsDecorator productDetailsDecorator, ProductReviewDetails productReviewDetails) {
        function1.invoke(new a2.Report(productDetailsDecorator.getId(), productReviewDetails));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1, ProductDetailsDecorator productDetailsDecorator, ProductReviewDetails productReviewDetails) {
        function1.invoke(new a2.VotePositive(productDetailsDecorator.getId(), productReviewDetails));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, ProductDetailsDecorator productDetailsDecorator, ProductReviewDetails productReviewDetails) {
        function1.invoke(new a2.VoteNegative(productDetailsDecorator.getId(), productReviewDetails));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, ProductDetailsDecorator productDetailsDecorator, ReviewItem reviewItem, int i10) {
        function1.invoke(new a2.ShowReviewGallery(i10, productDetailsDecorator.getId(), reviewItem));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, ProductDetailsDecorator productDetailsDecorator) {
        function1.invoke(new a2.WriteReview(productDetailsDecorator.getName(), ((ProductImageViewModel) CollectionsKt.s0(productDetailsDecorator.h())).c()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, ProductDetailsDecorator productDetailsDecorator) {
        function1.invoke(new a2.SeeAll(productDetailsDecorator.getName(), ((ProductImageViewModel) CollectionsKt.s0(productDetailsDecorator.h())).c()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, ProductDetailsDecorator productDetailsDecorator, ProductReviewFullDetails productReviewFullDetails, ProductDetailFeatureFlags productDetailFeatureFlags, Function1 function1, Function1 function12, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, productDetailsDecorator, productReviewFullDetails, productDetailFeatureFlags, function1, function12, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(ProductDetailsDecorator productDetailsDecorator, Function1 function1, ReviewItem reviewItem) {
        ProductFullDetails productFullDetails;
        mk.f id2 = productDetailsDecorator.getId();
        if (id2 instanceof ProductFullDetails) {
            productFullDetails = (ProductFullDetails) id2;
        } else {
            productFullDetails = null;
        }
        if (productFullDetails != null) {
            function1.invoke(new a2.ReadMore(productFullDetails, reviewItem));
        }
        return Unit.f142422a;
    }
}
