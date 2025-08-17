package com.meijer.mobile.reviews.ux.rateandreview;

import ak.AbstractC5607a;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0016\u0010\u0017J¬\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010\u001bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b'\u00104R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b2\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b5\u0010#R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b9\u00104R\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0011\u0010@\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b0\u0010<R\u0011\u0010B\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010#R\u0011\u0010D\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bC\u0010#R\u0011\u0010F\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010#R\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010#R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010#R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010#R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u00104¨\u0006N"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/a0;", "", "", "shouldShowAllErrorStateAfterClickSubmit", "", "productId", "productImage", "productName", "", "rateNumber", "reviewInputString", "reviewTitleInputString", "", "Landroid/net/Uri;", "addedPhotos", "nickNameInputString", "emailInputString", "locationInputString", "isTermsAndConditionsChecked", "Lcom/meijer/mobile/reviews/ux/rateandreview/s0;", "recommendProductStatus", "selectingPhotos", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/meijer/mobile/reviews/ux/rateandreview/s0;Ljava/util/List;)V", "a", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/meijer/mobile/reviews/ux/rateandreview/s0;Ljava/util/List;)Lcom/meijer/mobile/reviews/ux/rateandreview/a0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "s", "()Z", "b", "Ljava/lang/String;", "i", "c", "j", "d", "k", "e", "I", "l", "f", "n", "g", "o", "h", "Ljava/util/List;", "()Ljava/util/List;", "y", "m", "Lcom/meijer/mobile/reviews/ux/rateandreview/s0;", "()Lcom/meijer/mobile/reviews/ux/rateandreview/s0;", "r", "Lak/a;", "q", "()Lak/a;", "reviewWordsCountString", "p", "reviewTitleWordsCountString", "nameWordsCountString", "v", "isRatingBarHasError", "w", "isReviewHasError", "x", "isReviewTitleHasError", "u", "isNameHasError", "t", "isEmailHasError", "z", "isTermsAndConditionsHasError", "errorList", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.reviews.ux.rateandreview.a0, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class RateAndReviewDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowAllErrorStateAfterClickSubmit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productImage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rateNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reviewInputString;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reviewTitleInputString;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Uri> addedPhotos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nickNameInputString;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailInputString;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String locationInputString;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTermsAndConditionsChecked;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC12795s0 recommendProductStatus;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Uri> selectingPhotos;

    public RateAndReviewDecorator() {
        this(false, null, null, null, 0, null, null, null, null, null, null, false, null, null, 16383, null);
    }

    public final RateAndReviewDecorator a(boolean shouldShowAllErrorStateAfterClickSubmit, String productId, String productImage, String productName, int rateNumber, String reviewInputString, String reviewTitleInputString, List<? extends Uri> addedPhotos, String nickNameInputString, String emailInputString, String locationInputString, boolean isTermsAndConditionsChecked, EnumC12795s0 recommendProductStatus, List<? extends Uri> selectingPhotos) {
        Intrinsics.j(productId, "productId");
        Intrinsics.j(reviewInputString, "reviewInputString");
        Intrinsics.j(reviewTitleInputString, "reviewTitleInputString");
        Intrinsics.j(addedPhotos, "addedPhotos");
        Intrinsics.j(nickNameInputString, "nickNameInputString");
        Intrinsics.j(emailInputString, "emailInputString");
        Intrinsics.j(locationInputString, "locationInputString");
        Intrinsics.j(recommendProductStatus, "recommendProductStatus");
        Intrinsics.j(selectingPhotos, "selectingPhotos");
        return new RateAndReviewDecorator(shouldShowAllErrorStateAfterClickSubmit, productId, productImage, productName, rateNumber, reviewInputString, reviewTitleInputString, addedPhotos, nickNameInputString, emailInputString, locationInputString, isTermsAndConditionsChecked, recommendProductStatus, selectingPhotos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateAndReviewDecorator)) {
            return false;
        }
        RateAndReviewDecorator rateAndReviewDecorator = (RateAndReviewDecorator) other;
        return this.shouldShowAllErrorStateAfterClickSubmit == rateAndReviewDecorator.shouldShowAllErrorStateAfterClickSubmit && Intrinsics.e(this.productId, rateAndReviewDecorator.productId) && Intrinsics.e(this.productImage, rateAndReviewDecorator.productImage) && Intrinsics.e(this.productName, rateAndReviewDecorator.productName) && this.rateNumber == rateAndReviewDecorator.rateNumber && Intrinsics.e(this.reviewInputString, rateAndReviewDecorator.reviewInputString) && Intrinsics.e(this.reviewTitleInputString, rateAndReviewDecorator.reviewTitleInputString) && Intrinsics.e(this.addedPhotos, rateAndReviewDecorator.addedPhotos) && Intrinsics.e(this.nickNameInputString, rateAndReviewDecorator.nickNameInputString) && Intrinsics.e(this.emailInputString, rateAndReviewDecorator.emailInputString) && Intrinsics.e(this.locationInputString, rateAndReviewDecorator.locationInputString) && this.isTermsAndConditionsChecked == rateAndReviewDecorator.isTermsAndConditionsChecked && this.recommendProductStatus == rateAndReviewDecorator.recommendProductStatus && Intrinsics.e(this.selectingPhotos, rateAndReviewDecorator.selectingPhotos);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.shouldShowAllErrorStateAfterClickSubmit) * 31) + this.productId.hashCode()) * 31;
        String str = this.productImage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productName;
        return ((((((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.rateNumber)) * 31) + this.reviewInputString.hashCode()) * 31) + this.reviewTitleInputString.hashCode()) * 31) + this.addedPhotos.hashCode()) * 31) + this.nickNameInputString.hashCode()) * 31) + this.emailInputString.hashCode()) * 31) + this.locationInputString.hashCode()) * 31) + Boolean.hashCode(this.isTermsAndConditionsChecked)) * 31) + this.recommendProductStatus.hashCode()) * 31) + this.selectingPhotos.hashCode();
    }

    public String toString() {
        return "RateAndReviewDecorator(shouldShowAllErrorStateAfterClickSubmit=" + this.shouldShowAllErrorStateAfterClickSubmit + ", productId=" + this.productId + ", productImage=" + this.productImage + ", productName=" + this.productName + ", rateNumber=" + this.rateNumber + ", reviewInputString=" + this.reviewInputString + ", reviewTitleInputString=" + this.reviewTitleInputString + ", addedPhotos=" + this.addedPhotos + ", nickNameInputString=" + this.nickNameInputString + ", emailInputString=" + this.emailInputString + ", locationInputString=" + this.locationInputString + ", isTermsAndConditionsChecked=" + this.isTermsAndConditionsChecked + ", recommendProductStatus=" + this.recommendProductStatus + ", selectingPhotos=" + this.selectingPhotos + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RateAndReviewDecorator(boolean z10, String productId, String str, String str2, int i10, String reviewInputString, String reviewTitleInputString, List<? extends Uri> addedPhotos, String nickNameInputString, String emailInputString, String locationInputString, boolean z11, EnumC12795s0 recommendProductStatus, List<? extends Uri> selectingPhotos) {
        Intrinsics.j(productId, "productId");
        Intrinsics.j(reviewInputString, "reviewInputString");
        Intrinsics.j(reviewTitleInputString, "reviewTitleInputString");
        Intrinsics.j(addedPhotos, "addedPhotos");
        Intrinsics.j(nickNameInputString, "nickNameInputString");
        Intrinsics.j(emailInputString, "emailInputString");
        Intrinsics.j(locationInputString, "locationInputString");
        Intrinsics.j(recommendProductStatus, "recommendProductStatus");
        Intrinsics.j(selectingPhotos, "selectingPhotos");
        this.shouldShowAllErrorStateAfterClickSubmit = z10;
        this.productId = productId;
        this.productImage = str;
        this.productName = str2;
        this.rateNumber = i10;
        this.reviewInputString = reviewInputString;
        this.reviewTitleInputString = reviewTitleInputString;
        this.addedPhotos = addedPhotos;
        this.nickNameInputString = nickNameInputString;
        this.emailInputString = emailInputString;
        this.locationInputString = locationInputString;
        this.isTermsAndConditionsChecked = z11;
        this.recommendProductStatus = recommendProductStatus;
        this.selectingPhotos = selectingPhotos;
    }

    public final List<Uri> c() {
        return this.addedPhotos;
    }

    /* renamed from: d, reason: from getter */
    public final String getEmailInputString() {
        return this.emailInputString;
    }

    /* renamed from: f, reason: from getter */
    public final String getLocationInputString() {
        return this.locationInputString;
    }

    public final AbstractC5607a g() {
        return AbstractC5607a.INSTANCE.d(Lp.c.f18669v, Integer.valueOf(this.nickNameInputString.length()));
    }

    /* renamed from: h, reason: from getter */
    public final String getNickNameInputString() {
        return this.nickNameInputString;
    }

    /* renamed from: i, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: j, reason: from getter */
    public final String getProductImage() {
        return this.productImage;
    }

    /* renamed from: k, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: l, reason: from getter */
    public final int getRateNumber() {
        return this.rateNumber;
    }

    /* renamed from: m, reason: from getter */
    public final EnumC12795s0 getRecommendProductStatus() {
        return this.recommendProductStatus;
    }

    /* renamed from: n, reason: from getter */
    public final String getReviewInputString() {
        return this.reviewInputString;
    }

    /* renamed from: o, reason: from getter */
    public final String getReviewTitleInputString() {
        return this.reviewTitleInputString;
    }

    public final AbstractC5607a p() {
        return AbstractC5607a.INSTANCE.d(Lp.c.f18672w0, Integer.valueOf(this.reviewTitleInputString.length()));
    }

    public final AbstractC5607a q() {
        return AbstractC5607a.INSTANCE.d(Lp.c.f18632c0, Integer.valueOf(this.reviewInputString.length()));
    }

    public final List<Uri> r() {
        return this.selectingPhotos;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getShouldShowAllErrorStateAfterClickSubmit() {
        return this.shouldShowAllErrorStateAfterClickSubmit;
    }

    public final boolean t() {
        return !Ik.b.INSTANCE.a().matcher(this.emailInputString).matches();
    }

    public final boolean u() {
        String str = this.nickNameInputString;
        return StringsKt.r0(str) || str.length() < 4;
    }

    public final boolean v() {
        return this.rateNumber <= 0;
    }

    public final boolean w() {
        String str = this.reviewInputString;
        return StringsKt.r0(str) || str.length() < 50;
    }

    public final boolean x() {
        String str = this.reviewTitleInputString;
        return StringsKt.r0(str) || str.length() > 50;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getIsTermsAndConditionsChecked() {
        return this.isTermsAndConditionsChecked;
    }

    public final boolean z() {
        return !this.isTermsAndConditionsChecked;
    }

    public final List<Boolean> e() {
        return CollectionsKt.p(Boolean.valueOf(v()), Boolean.valueOf(w()), Boolean.valueOf(x()), Boolean.valueOf(u()), Boolean.valueOf(t()), Boolean.valueOf(z()));
    }

    public /* synthetic */ RateAndReviewDecorator(boolean z10, String str, String str2, String str3, int i10, String str4, String str5, List list, String str6, String str7, String str8, boolean z11, EnumC12795s0 enumC12795s0, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? "-1" : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) == 0 ? str3 : null, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? CollectionsKt.m() : list, (i11 & 256) != 0 ? "" : str6, (i11 & 512) != 0 ? "" : str7, (i11 & 1024) == 0 ? str8 : "", (i11 & RecyclerView.m.FLAG_MOVED) == 0 ? z11 : false, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? EnumC12795s0.f116445a : enumC12795s0, (i11 & 8192) != 0 ? CollectionsKt.m() : list2);
    }
}
