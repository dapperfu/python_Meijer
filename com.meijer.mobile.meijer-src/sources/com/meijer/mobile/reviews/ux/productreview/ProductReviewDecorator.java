package com.meijer.mobile.reviews.ux.productreview;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001BØ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010!R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010!R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\bC\u0010BR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b=\u0010@\u001a\u0004\bD\u0010BR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b,\u0010@\u001a\u0004\bE\u0010BR2\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bC\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/U0;", "", "", "title", "reviewText", "", "maxLines", "", "isRecommended", "date", "", "starsRating", "thumbsUpCount", "thumbsDownCount", "", "imageList", "Lkotlin/Function0;", "", "onReportClick", "onReadMoreClick", "thumbsUpClick", "thumbsDownClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "onImageClicked", "shouldShowErrorState", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;DIILjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "w", "b", "q", "c", "I", "m", "d", "Ljava/lang/Boolean;", "x", "()Ljava/lang/Boolean;", "e", "k", "f", "D", "r", "()D", "g", "v", "h", "t", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "j", "Lkotlin/jvm/functions/Function0;", "p", "()Lkotlin/jvm/functions/Function0;", "o", "u", "s", "n", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "Z", "getShouldShowErrorState", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.reviews.ux.productreview.U0, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductReviewDecorator {

    /* renamed from: p, reason: collision with root package name */
    public static final int f116578p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reviewText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isRecommended;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double starsRating;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int thumbsUpCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int thumbsDownCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> imageList;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onReportClick;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onReadMoreClick;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> thumbsUpClick;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> thumbsDownClick;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<Integer, Unit> onImageClicked;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowErrorState;

    public ProductReviewDecorator() {
        this(null, null, 0, null, null, 0.0d, 0, 0, null, null, null, null, null, null, false, 32767, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductReviewDecorator)) {
            return false;
        }
        ProductReviewDecorator productReviewDecorator = (ProductReviewDecorator) other;
        return Intrinsics.e(this.title, productReviewDecorator.title) && Intrinsics.e(this.reviewText, productReviewDecorator.reviewText) && this.maxLines == productReviewDecorator.maxLines && Intrinsics.e(this.isRecommended, productReviewDecorator.isRecommended) && Intrinsics.e(this.date, productReviewDecorator.date) && Double.compare(this.starsRating, productReviewDecorator.starsRating) == 0 && this.thumbsUpCount == productReviewDecorator.thumbsUpCount && this.thumbsDownCount == productReviewDecorator.thumbsDownCount && Intrinsics.e(this.imageList, productReviewDecorator.imageList) && Intrinsics.e(this.onReportClick, productReviewDecorator.onReportClick) && Intrinsics.e(this.onReadMoreClick, productReviewDecorator.onReadMoreClick) && Intrinsics.e(this.thumbsUpClick, productReviewDecorator.thumbsUpClick) && Intrinsics.e(this.thumbsDownClick, productReviewDecorator.thumbsDownClick) && Intrinsics.e(this.onImageClicked, productReviewDecorator.onImageClicked) && this.shouldShowErrorState == productReviewDecorator.shouldShowErrorState;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.reviewText.hashCode()) * 31) + Integer.hashCode(this.maxLines)) * 31;
        Boolean bool = this.isRecommended;
        return ((((((((((((((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.date.hashCode()) * 31) + Double.hashCode(this.starsRating)) * 31) + Integer.hashCode(this.thumbsUpCount)) * 31) + Integer.hashCode(this.thumbsDownCount)) * 31) + this.imageList.hashCode()) * 31) + this.onReportClick.hashCode()) * 31) + this.onReadMoreClick.hashCode()) * 31) + this.thumbsUpClick.hashCode()) * 31) + this.thumbsDownClick.hashCode()) * 31) + this.onImageClicked.hashCode()) * 31) + Boolean.hashCode(this.shouldShowErrorState);
    }

    public String toString() {
        return "ProductReviewDecorator(title=" + this.title + ", reviewText=" + this.reviewText + ", maxLines=" + this.maxLines + ", isRecommended=" + this.isRecommended + ", date=" + this.date + ", starsRating=" + this.starsRating + ", thumbsUpCount=" + this.thumbsUpCount + ", thumbsDownCount=" + this.thumbsDownCount + ", imageList=" + this.imageList + ", onReportClick=" + this.onReportClick + ", onReadMoreClick=" + this.onReadMoreClick + ", thumbsUpClick=" + this.thumbsUpClick + ", thumbsDownClick=" + this.thumbsDownClick + ", onImageClicked=" + this.onImageClicked + ", shouldShowErrorState=" + this.shouldShowErrorState + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductReviewDecorator(String title, String reviewText, int i10, Boolean bool, String date, double d10, int i11, int i12, List<String> imageList, Function0<Unit> onReportClick, Function0<Unit> onReadMoreClick, Function0<Unit> thumbsUpClick, Function0<Unit> thumbsDownClick, Function1<? super Integer, Unit> onImageClicked, boolean z10) {
        Intrinsics.j(title, "title");
        Intrinsics.j(reviewText, "reviewText");
        Intrinsics.j(date, "date");
        Intrinsics.j(imageList, "imageList");
        Intrinsics.j(onReportClick, "onReportClick");
        Intrinsics.j(onReadMoreClick, "onReadMoreClick");
        Intrinsics.j(thumbsUpClick, "thumbsUpClick");
        Intrinsics.j(thumbsDownClick, "thumbsDownClick");
        Intrinsics.j(onImageClicked, "onImageClicked");
        this.title = title;
        this.reviewText = reviewText;
        this.maxLines = i10;
        this.isRecommended = bool;
        this.date = date;
        this.starsRating = d10;
        this.thumbsUpCount = i11;
        this.thumbsDownCount = i12;
        this.imageList = imageList;
        this.onReportClick = onReportClick;
        this.onReadMoreClick = onReadMoreClick;
        this.thumbsUpClick = thumbsUpClick;
        this.thumbsDownClick = thumbsDownClick;
        this.onImageClicked = onImageClicked;
        this.shouldShowErrorState = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(int i10) {
        return Unit.f143329a;
    }

    /* renamed from: k, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final List<String> l() {
        return this.imageList;
    }

    /* renamed from: m, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final Function1<Integer, Unit> n() {
        return this.onImageClicked;
    }

    public final Function0<Unit> o() {
        return this.onReadMoreClick;
    }

    public final Function0<Unit> p() {
        return this.onReportClick;
    }

    /* renamed from: q, reason: from getter */
    public final String getReviewText() {
        return this.reviewText;
    }

    /* renamed from: r, reason: from getter */
    public final double getStarsRating() {
        return this.starsRating;
    }

    public final Function0<Unit> s() {
        return this.thumbsDownClick;
    }

    /* renamed from: t, reason: from getter */
    public final int getThumbsDownCount() {
        return this.thumbsDownCount;
    }

    public final Function0<Unit> u() {
        return this.thumbsUpClick;
    }

    /* renamed from: v, reason: from getter */
    public final int getThumbsUpCount() {
        return this.thumbsUpCount;
    }

    /* renamed from: w, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: x, reason: from getter */
    public final Boolean getIsRecommended() {
        return this.isRecommended;
    }

    public /* synthetic */ ProductReviewDecorator(String str, String str2, int i10, Boolean bool, String str3, double d10, int i11, int i12, List list, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? 4 : i10, (i13 & 8) != 0 ? Boolean.FALSE : bool, (i13 & 16) == 0 ? str3 : "", (i13 & 32) != 0 ? 0.0d : d10, (i13 & 64) != 0 ? 0 : i11, (i13 & 128) != 0 ? 0 : i12, (i13 & 256) != 0 ? CollectionsKt.m() : list, (i13 & 512) != 0 ? new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.P0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductReviewDecorator.f();
            }
        } : function0, (i13 & 1024) != 0 ? new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.Q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductReviewDecorator.g();
            }
        } : function02, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.R0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductReviewDecorator.h();
            }
        } : function03, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.S0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductReviewDecorator.i();
            }
        } : function04, (i13 & 8192) != 0 ? new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.T0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductReviewDecorator.j(((Integer) obj).intValue());
            }
        } : function1, (i13 & 16384) != 0 ? false : z10);
    }
}
