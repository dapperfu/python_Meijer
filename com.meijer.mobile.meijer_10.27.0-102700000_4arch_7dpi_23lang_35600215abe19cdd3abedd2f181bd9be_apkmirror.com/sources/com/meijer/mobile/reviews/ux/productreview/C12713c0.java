package com.meijer.mobile.reviews.ux.productreview;

import Gp.ProductInformation;
import Jp.Filter;
import Kp.ProductReviewDetails;
import Kp.ProductReviewFullDetails;
import androidx.view.InterfaceC6015f;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001d\u0019\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020#0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LKp/g;", "bazaarVoiceManager", "<init>", "(LKp/g;)V", "", "r", "()V", "s", "", "reviewId", "LKp/a;", "reviewFeedbackVote", "t", "(Ljava/lang/String;LKp/a;)V", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "action", "w", "(Lcom/meijer/mobile/reviews/ux/productreview/c0$a;)V", "a", "LKp/g;", "Ltv/B;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$c;", "b", "Ltv/B;", "_viewState", "Ltv/P;", "c", "Ltv/P;", "v", "()Ltv/P;", "viewState", "Ltv/A;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$b;", "d", "Ltv/A;", "_viewEvent", "Ltv/F;", "e", "Ltv/F;", "u", "()Ltv/F;", "viewEvent", "", "f", "I", "reviewsToFetch", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.reviews.ux.productreview.c0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12713c0 extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Kp.g bazaarVoiceManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ViewState> viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<b> _viewEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<b> viewEvent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int reviewsToFetch;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "", "<init>", "()V", "e", "b", "a", "c", "h", "g", "f", "d", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$a;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$b;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$c;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$d;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$e;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$f;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$g;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a$h;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$a;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1857a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1857a f115688a = new C1857a();

            private C1857a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1857a);
            }

            public int hashCode() {
                return -1750936923;
            }

            public String toString() {
                return "GetDisplayInformation";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$b;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f115689a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1316902048;
            }

            public String toString() {
                return "GetReviews";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$c;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "", "reviewId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$c, reason: from toString */
        public static final /* data */ class ReportReview extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String reviewId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReportReview) && Intrinsics.e(this.reviewId, ((ReportReview) other).reviewId);
            }

            public int hashCode() {
                return this.reviewId.hashCode();
            }

            public String toString() {
                return "ReportReview(reviewId=" + this.reviewId + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReportReview(String reviewId) {
                super(null);
                Intrinsics.j(reviewId, "reviewId");
                this.reviewId = reviewId;
            }

            /* renamed from: a, reason: from getter */
            public final String getReviewId() {
                return this.reviewId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$d;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$d */
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f115691a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -382036207;
            }

            public String toString() {
                return "ReviewSubmittedSuccessAction";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$e;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "LGp/b;", "productInfo", "<init>", "(LGp/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGp/b;", "()LGp/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$e, reason: from toString */
        public static final /* data */ class SetProductInfo extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductInformation productInfo;

            public SetProductInfo(ProductInformation productInformation) {
                super(null);
                this.productInfo = productInformation;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetProductInfo) && Intrinsics.e(this.productInfo, ((SetProductInfo) other).productInfo);
            }

            public int hashCode() {
                ProductInformation productInformation = this.productInfo;
                if (productInformation == null) {
                    return 0;
                }
                return productInformation.hashCode();
            }

            public String toString() {
                return "SetProductInfo(productInfo=" + this.productInfo + ')';
            }

            /* renamed from: a, reason: from getter */
            public final ProductInformation getProductInfo() {
                return this.productInfo;
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$f;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "Ljava/util/ArrayList;", "LJp/a;", "Lkotlin/collections/ArrayList;", "filterArray", "LJp/b;", "sortBy", "<init>", "(Ljava/util/ArrayList;LJp/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "b", "LJp/b;", "()LJp/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$f, reason: from toString */
        public static final /* data */ class UpdateFilters extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ArrayList<Filter> filterArray;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Jp.b sortBy;

            public UpdateFilters(ArrayList<Filter> arrayList, Jp.b bVar) {
                super(null);
                this.filterArray = arrayList;
                this.sortBy = bVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateFilters)) {
                    return false;
                }
                UpdateFilters updateFilters = (UpdateFilters) other;
                return Intrinsics.e(this.filterArray, updateFilters.filterArray) && this.sortBy == updateFilters.sortBy;
            }

            public int hashCode() {
                ArrayList<Filter> arrayList = this.filterArray;
                int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
                Jp.b bVar = this.sortBy;
                return iHashCode + (bVar != null ? bVar.hashCode() : 0);
            }

            public String toString() {
                return "UpdateFilters(filterArray=" + this.filterArray + ", sortBy=" + this.sortBy + ')';
            }

            public final ArrayList<Filter> a() {
                return this.filterArray;
            }

            /* renamed from: b, reason: from getter */
            public final Jp.b getSortBy() {
                return this.sortBy;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$g;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "", "reviewId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$g, reason: from toString */
        public static final /* data */ class VoteNegative extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String reviewId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VoteNegative) && Intrinsics.e(this.reviewId, ((VoteNegative) other).reviewId);
            }

            public int hashCode() {
                return this.reviewId.hashCode();
            }

            public String toString() {
                return "VoteNegative(reviewId=" + this.reviewId + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VoteNegative(String reviewId) {
                super(null);
                Intrinsics.j(reviewId, "reviewId");
                this.reviewId = reviewId;
            }

            /* renamed from: a, reason: from getter */
            public final String getReviewId() {
                return this.reviewId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$a$h;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$a;", "", "reviewId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$a$h, reason: from toString */
        public static final /* data */ class VotePositive extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String reviewId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VotePositive) && Intrinsics.e(this.reviewId, ((VotePositive) other).reviewId);
            }

            public int hashCode() {
                return this.reviewId.hashCode();
            }

            public String toString() {
                return "VotePositive(reviewId=" + this.reviewId + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VotePositive(String reviewId) {
                super(null);
                Intrinsics.j(reviewId, "reviewId");
                this.reviewId = reviewId;
            }

            /* renamed from: a, reason: from getter */
            public final String getReviewId() {
                return this.reviewId;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$b;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/reviews/ux/productreview/c0$b$a;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$b$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$b$a;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$b;", "", "isSuccess", "LKp/a;", "feedbackVote", "<init>", "(ZLKp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "LKp/a;", "()LKp/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$b$a, reason: from toString */
        public static final /* data */ class FeedbackSubmissionEvent extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSuccess;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Kp.a feedbackVote;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FeedbackSubmissionEvent)) {
                    return false;
                }
                FeedbackSubmissionEvent feedbackSubmissionEvent = (FeedbackSubmissionEvent) other;
                return this.isSuccess == feedbackSubmissionEvent.isSuccess && this.feedbackVote == feedbackSubmissionEvent.feedbackVote;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isSuccess) * 31) + this.feedbackVote.hashCode();
            }

            public String toString() {
                return "FeedbackSubmissionEvent(isSuccess=" + this.isSuccess + ", feedbackVote=" + this.feedbackVote + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FeedbackSubmissionEvent(boolean z10, Kp.a feedbackVote) {
                super(null);
                Intrinsics.j(feedbackVote, "feedbackVote");
                this.isSuccess = z10;
                this.feedbackVote = feedbackVote;
            }

            /* renamed from: a, reason: from getter */
            public final Kp.a getFeedbackVote() {
                return this.feedbackVote;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsSuccess() {
                return this.isSuccess;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$b$b;", "Lcom/meijer/mobile/reviews/ux/productreview/c0$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1858b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1858b f115699a = new C1858b();

            private C1858b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1858b);
            }

            public int hashCode() {
                return -1453370148;
            }

            public String toString() {
                return "ReviewSubmittedSuccessEvent";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0092\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b1\u0010\u001eR+\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b*\u00108R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$c;", "", "Lcom/meijer/mobile/reviews/ux/productreview/U0;", "productReviewDecorator", "LBi/o;", "loadingStatus", "LKp/c;", "firstProductReviews", "", "LKp/b;", "productReviews", "", "productId", "productName", "productImage", "", "index", "Ljava/util/ArrayList;", "LJp/a;", "Lkotlin/collections/ArrayList;", "filterArray", "LJp/b;", "sortBy", "<init>", "(Lcom/meijer/mobile/reviews/ux/productreview/U0;LBi/o;LKp/c;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;LJp/b;)V", "a", "(Lcom/meijer/mobile/reviews/ux/productreview/U0;LBi/o;LKp/c;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;LJp/b;)Lcom/meijer/mobile/reviews/ux/productreview/c0$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/reviews/ux/productreview/U0;", "getProductReviewDecorator", "()Lcom/meijer/mobile/reviews/ux/productreview/U0;", "b", "LBi/o;", "f", "()LBi/o;", "c", "LKp/c;", "d", "()LKp/c;", "Ljava/util/List;", "j", "()Ljava/util/List;", "e", "Ljava/lang/String;", "g", "i", "h", "I", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "LJp/b;", "k", "()LJp/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$c, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductReviewDecorator productReviewDecorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bi.o loadingStatus;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductReviewFullDetails firstProductReviews;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductReviewDetails> productReviews;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productImage;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ArrayList<Filter> filterArray;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Jp.b sortBy;

        public ViewState() {
            this(null, null, null, null, null, null, null, 0, null, null, 1023, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.productReviewDecorator, viewState.productReviewDecorator) && this.loadingStatus == viewState.loadingStatus && Intrinsics.e(this.firstProductReviews, viewState.firstProductReviews) && Intrinsics.e(this.productReviews, viewState.productReviews) && Intrinsics.e(this.productId, viewState.productId) && Intrinsics.e(this.productName, viewState.productName) && Intrinsics.e(this.productImage, viewState.productImage) && this.index == viewState.index && Intrinsics.e(this.filterArray, viewState.filterArray) && this.sortBy == viewState.sortBy;
        }

        public int hashCode() {
            int iHashCode = ((this.productReviewDecorator.hashCode() * 31) + this.loadingStatus.hashCode()) * 31;
            ProductReviewFullDetails productReviewFullDetails = this.firstProductReviews;
            int iHashCode2 = (((((((((((iHashCode + (productReviewFullDetails == null ? 0 : productReviewFullDetails.hashCode())) * 31) + this.productReviews.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.productImage.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
            ArrayList<Filter> arrayList = this.filterArray;
            int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            Jp.b bVar = this.sortBy;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(productReviewDecorator=" + this.productReviewDecorator + ", loadingStatus=" + this.loadingStatus + ", firstProductReviews=" + this.firstProductReviews + ", productReviews=" + this.productReviews + ", productId=" + this.productId + ", productName=" + this.productName + ", productImage=" + this.productImage + ", index=" + this.index + ", filterArray=" + this.filterArray + ", sortBy=" + this.sortBy + ')';
        }

        public ViewState(ProductReviewDecorator productReviewDecorator, Bi.o loadingStatus, ProductReviewFullDetails productReviewFullDetails, List<ProductReviewDetails> productReviews, String productId, String productName, String productImage, int i10, ArrayList<Filter> arrayList, Jp.b bVar) {
            Intrinsics.j(productReviewDecorator, "productReviewDecorator");
            Intrinsics.j(loadingStatus, "loadingStatus");
            Intrinsics.j(productReviews, "productReviews");
            Intrinsics.j(productId, "productId");
            Intrinsics.j(productName, "productName");
            Intrinsics.j(productImage, "productImage");
            this.productReviewDecorator = productReviewDecorator;
            this.loadingStatus = loadingStatus;
            this.firstProductReviews = productReviewFullDetails;
            this.productReviews = productReviews;
            this.productId = productId;
            this.productName = productName;
            this.productImage = productImage;
            this.index = i10;
            this.filterArray = arrayList;
            this.sortBy = bVar;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, ProductReviewDecorator productReviewDecorator, Bi.o oVar, ProductReviewFullDetails productReviewFullDetails, List list, String str, String str2, String str3, int i10, ArrayList arrayList, Jp.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productReviewDecorator = viewState.productReviewDecorator;
            }
            if ((i11 & 2) != 0) {
                oVar = viewState.loadingStatus;
            }
            if ((i11 & 4) != 0) {
                productReviewFullDetails = viewState.firstProductReviews;
            }
            if ((i11 & 8) != 0) {
                list = viewState.productReviews;
            }
            if ((i11 & 16) != 0) {
                str = viewState.productId;
            }
            if ((i11 & 32) != 0) {
                str2 = viewState.productName;
            }
            if ((i11 & 64) != 0) {
                str3 = viewState.productImage;
            }
            if ((i11 & 128) != 0) {
                i10 = viewState.index;
            }
            if ((i11 & 256) != 0) {
                arrayList = viewState.filterArray;
            }
            if ((i11 & 512) != 0) {
                bVar = viewState.sortBy;
            }
            ArrayList arrayList2 = arrayList;
            Jp.b bVar2 = bVar;
            String str4 = str3;
            int i12 = i10;
            String str5 = str;
            String str6 = str2;
            return viewState.a(productReviewDecorator, oVar, productReviewFullDetails, list, str5, str6, str4, i12, arrayList2, bVar2);
        }

        public final ViewState a(ProductReviewDecorator productReviewDecorator, Bi.o loadingStatus, ProductReviewFullDetails firstProductReviews, List<ProductReviewDetails> productReviews, String productId, String productName, String productImage, int index, ArrayList<Filter> filterArray, Jp.b sortBy) {
            Intrinsics.j(productReviewDecorator, "productReviewDecorator");
            Intrinsics.j(loadingStatus, "loadingStatus");
            Intrinsics.j(productReviews, "productReviews");
            Intrinsics.j(productId, "productId");
            Intrinsics.j(productName, "productName");
            Intrinsics.j(productImage, "productImage");
            return new ViewState(productReviewDecorator, loadingStatus, firstProductReviews, productReviews, productId, productName, productImage, index, filterArray, sortBy);
        }

        public final ArrayList<Filter> c() {
            return this.filterArray;
        }

        /* renamed from: d, reason: from getter */
        public final ProductReviewFullDetails getFirstProductReviews() {
            return this.firstProductReviews;
        }

        /* renamed from: e, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: f, reason: from getter */
        public final Bi.o getLoadingStatus() {
            return this.loadingStatus;
        }

        /* renamed from: g, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* renamed from: h, reason: from getter */
        public final String getProductImage() {
            return this.productImage;
        }

        /* renamed from: i, reason: from getter */
        public final String getProductName() {
            return this.productName;
        }

        public final List<ProductReviewDetails> j() {
            return this.productReviews;
        }

        /* renamed from: k, reason: from getter */
        public final Jp.b getSortBy() {
            return this.sortBy;
        }

        public /* synthetic */ ViewState(ProductReviewDecorator productReviewDecorator, Bi.o oVar, ProductReviewFullDetails productReviewFullDetails, List list, String str, String str2, String str3, int i10, ArrayList arrayList, Jp.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ProductReviewDecorator(null, null, 0, null, null, 0.0d, 0, 0, null, null, null, null, null, null, false, 32767, null) : productReviewDecorator, (i11 & 2) != 0 ? Bi.o.f2584a : oVar, (i11 & 4) != 0 ? null : productReviewFullDetails, (i11 & 8) != 0 ? CollectionsKt.m() : list, (i11 & 16) != 0 ? "" : str, (i11 & 32) != 0 ? "" : str2, (i11 & 64) == 0 ? str3 : "", (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? null : arrayList, (i11 & 512) != 0 ? null : bVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewListViewModel$fetchBazaarVoiceFirstDisplay$1", f = "FullReviewListViewModel.kt", l = {152}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115710a;

        /* renamed from: b, reason: collision with root package name */
        int f115711b;

        /* renamed from: c, reason: collision with root package name */
        int f115712c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f115713d;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C12713c0.this.new d(continuation);
            dVar.f115713d = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object value3;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115712c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC16622O) this.f115713d;
                    InterfaceC17140B interfaceC17140B = C12713c0.this._viewState;
                    do {
                        value3 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value3, ViewState.b((ViewState) value3, null, Bi.o.f2584a, null, null, null, null, null, 0, null, null, 1021, null)));
                    C12713c0 c12713c0 = C12713c0.this;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12713c0.bazaarVoiceManager;
                    String productId = c12713c0.v().getValue().getProductId();
                    this.f115713d = r23;
                    this.f115710a = r23;
                    this.f115711b = 0;
                    this.f115712c = 1;
                    objC = gVar.c(productId, 20, this);
                    i10 = r23;
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC16622O) this.f115713d;
                    ResultKt.b(obj);
                    objC = obj;
                    i10 = r24;
                }
                objB = Result.b((ProductReviewFullDetails) objC);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            C12713c0 c12713c02 = C12713c0.this;
            if (Result.h(objB)) {
                ProductReviewFullDetails productReviewFullDetails = (ProductReviewFullDetails) objB;
                InterfaceC17140B interfaceC17140B2 = c12713c02._viewState;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, ViewState.b((ViewState) value2, null, Bi.o.f2587d, productReviewFullDetails, null, null, null, null, 0, null, null, 1017, null)));
                c12713c02.s();
            }
            C12713c0 c12713c03 = C12713c0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qv.E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                InterfaceC17140B interfaceC17140B3 = c12713c03._viewState;
                do {
                    value = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value, ViewState.b((ViewState) value, null, Bi.o.f2585b, null, null, null, null, null, 0, null, null, 1021, null)));
                uw.a.INSTANCE.f(thE, "ProductDisplayPage: Failed to get bulk ratings", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewListViewModel$fetchBazaarVoiceReviews$1", f = "FullReviewListViewModel.kt", l = {185}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115715a;

        /* renamed from: b, reason: collision with root package name */
        int f115716b;

        /* renamed from: c, reason: collision with root package name */
        int f115717c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f115718d;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = C12713c0.this.new e(continuation);
            eVar.f115718d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.C12713c0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewListViewModel$fetchFeedbackSubmission$1", f = "FullReviewListViewModel.kt", l = {218}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115720a;

        /* renamed from: b, reason: collision with root package name */
        int f115721b;

        /* renamed from: c, reason: collision with root package name */
        int f115722c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f115723d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f115725f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Kp.a f115726g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewListViewModel$fetchFeedbackSubmission$1$2$1", f = "FullReviewListViewModel.kt", l = {224}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$f$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f115727a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12713c0 f115728b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Kp.a f115729c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f115728b, this.f115729c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12713c0 c12713c0, Kp.a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f115728b = c12713c0;
                this.f115729c = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115727a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f115728b._viewEvent;
                    b.FeedbackSubmissionEvent feedbackSubmissionEvent = new b.FeedbackSubmissionEvent(true, this.f115729c);
                    this.f115727a = 1;
                    if (interfaceC17139A.emit(feedbackSubmissionEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C12713c0.this.new f(this.f115725f, this.f115726g, continuation);
            fVar.f115723d = obj;
            return fVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Kp.a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f115725f = str;
            this.f115726g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115722c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC16622O) this.f115723d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC16622O) this.f115723d;
                    C12713c0 c12713c0 = C12713c0.this;
                    String str = this.f115725f;
                    Kp.a aVar = this.f115726g;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12713c0.bazaarVoiceManager;
                    this.f115723d = r14;
                    this.f115720a = r14;
                    this.f115721b = 0;
                    this.f115722c = 1;
                    i10 = r14;
                    if (gVar.d(str, aVar, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            C12713c0 c12713c02 = C12713c0.this;
            Kp.a aVar2 = this.f115726g;
            if (Result.h(objB)) {
                C16648k.d(androidx.view.d0.a(c12713c02), null, null, new a(c12713c02, aVar2, null), 3, null);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qv.E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    uw.a.INSTANCE.f(thE, "submitFeedback: Failed to get submitFeedback", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewListViewModel$onAction$5", f = "FullReviewListViewModel.kt", l = {138}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.c0$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115730a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12713c0.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115730a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12713c0.this._viewEvent;
                b.C1858b c1858b = b.C1858b.f115699a;
                this.f115730a = 1;
                if (interfaceC17139A.emit(c1858b, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public C12713c0(Kp.g bazaarVoiceManager) {
        Intrinsics.j(bazaarVoiceManager, "bazaarVoiceManager");
        this.bazaarVoiceManager = bazaarVoiceManager;
        InterfaceC17140B<ViewState> interfaceC17140BA = tv.S.a(new ViewState(null, null, null, null, null, null, null, 0, null, null, 1023, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<b> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._viewEvent = interfaceC17139AB;
        this.viewEvent = C17154h.b(interfaceC17139AB);
        this.reviewsToFetch = 100;
    }

    public final InterfaceC17144F<b> u() {
        return this.viewEvent;
    }

    public final tv.P<ViewState> v() {
        return this.viewState;
    }

    public final void w(a action) {
        ViewState value;
        a.UpdateFilters updateFilters;
        ViewState value2;
        Intrinsics.j(action, "action");
        if (action instanceof a.SetProductInfo) {
            ProductInformation productInfo = ((a.SetProductInfo) action).getProductInfo();
            if (productInfo != null) {
                InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
                do {
                    value2 = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value2, ViewState.b(value2, null, null, null, null, productInfo.getProductId(), productInfo.getProductName(), productInfo.getProductImage(), 0, null, null, 911, null)));
                return;
            }
            return;
        }
        if (action instanceof a.C1857a) {
            r();
            return;
        }
        if (action instanceof a.b) {
            s();
            return;
        }
        if (action instanceof a.ReportReview) {
            t(((a.ReportReview) action).getReviewId(), Kp.a.f17434a);
            return;
        }
        if (action instanceof a.VotePositive) {
            t(((a.VotePositive) action).getReviewId(), Kp.a.f17435b);
            return;
        }
        if (action instanceof a.VoteNegative) {
            t(((a.VoteNegative) action).getReviewId(), Kp.a.f17436c);
            return;
        }
        if (!(action instanceof a.UpdateFilters)) {
            if (!(action instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            C16648k.d(androidx.view.d0.a(this), null, null, new g(null), 3, null);
        } else {
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._viewState;
            do {
                value = interfaceC17140B2.getValue();
                updateFilters = (a.UpdateFilters) action;
            } while (!interfaceC17140B2.e(value, ViewState.b(value, null, null, null, null, null, null, null, 0, updateFilters.a(), updateFilters.getSortBy(), l3.f92484c, null)));
        }
    }

    private final void r() {
        C16648k.d(androidx.view.d0.a(this), null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        C16648k.d(androidx.view.d0.a(this), null, null, new e(null), 3, null);
    }

    private final void t(String reviewId, Kp.a reviewFeedbackVote) {
        C16648k.d(androidx.view.d0.a(this), null, null, new f(reviewId, reviewFeedbackVote, null), 3, null);
    }
}
