package com.meijer.mobile.reviews.service;

import Gp.ProductRatings;
import Jp.Filter;
import Kp.ProductReviewDetails;
import Kp.ProductReviewFullDetails;
import Kp.ProductReviewSubmitRequest;
import Kp.g;
import android.content.SharedPreferences;
import android.net.Uri;
import com.bazaarvoice.bvandroidsdk.Action;
import com.bazaarvoice.bvandroidsdk.BVConversationsClient;
import com.bazaarvoice.bvandroidsdk.BVHostedAuthenticationProvider;
import com.bazaarvoice.bvandroidsdk.BVSDK;
import com.bazaarvoice.bvandroidsdk.BulkRatingOptions;
import com.bazaarvoice.bvandroidsdk.BulkRatingsRequest;
import com.bazaarvoice.bvandroidsdk.BulkRatingsResponse;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback;
import com.bazaarvoice.bvandroidsdk.ConversationsException;
import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback;
import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException;
import com.bazaarvoice.bvandroidsdk.EqualityOperator;
import com.bazaarvoice.bvandroidsdk.Error;
import com.bazaarvoice.bvandroidsdk.FeedbackSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.FeedbackSubmissionResponse;
import com.bazaarvoice.bvandroidsdk.FieldError;
import com.bazaarvoice.bvandroidsdk.LoadCallDisplay;
import com.bazaarvoice.bvandroidsdk.LoadCallSubmission;
import com.bazaarvoice.bvandroidsdk.PDPContentType;
import com.bazaarvoice.bvandroidsdk.ProductDisplayPageRequest;
import com.bazaarvoice.bvandroidsdk.ProductDisplayPageResponse;
import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import com.bazaarvoice.bvandroidsdk.ReviewResponse;
import com.bazaarvoice.bvandroidsdk.ReviewSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.ReviewSubmissionResponse;
import com.bazaarvoice.bvandroidsdk.ReviewsRequest;
import com.meijer.mobile.reviews.service.ReviewException;
import com.meijer.mobile.reviews.service.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.TimeoutCancellationException;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.C16658p;
import qv.InterfaceC16622O;
import qv.InterfaceC16654n;
import qv.d1;
import yo.MeijerUser;
import yo.k;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001(BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJT\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00020!\u0018\u0001`\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J \u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0096@¢\u0006\u0004\b1\u00102J$\u00105\u001a\b\u0012\u0004\u0012\u0002040&2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0&H\u0096@¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010A¨\u0006G"}, d2 = {"Lcom/meijer/mobile/reviews/service/a;", "LKp/g;", "Lyo/k;", "userManager", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;", "bazaarVoiceClient", "LHp/f;", "fileFromUriUtil", "LHp/d;", "serviceToDomainMapper", "Lcom/bazaarvoice/bvandroidsdk/BVSDK;", "bvSdk", "", "bazaarVoiceSharedSecretKey", "Lqv/K;", "dispatcher", "<init>", "(Lyo/k;Landroid/content/SharedPreferences;Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;LHp/f;LHp/d;Lcom/bazaarvoice/bvandroidsdk/BVSDK;Ljava/lang/String;Lqv/K;)V", "Lyo/c;", "meijerUser", "", "k", "(Lyo/c;)V", "productId", "", "reviewsToFetch", "LKp/c;", "c", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paginationIndex", "Ljava/util/ArrayList;", "LJp/a;", "Lkotlin/collections/ArrayList;", "filterArray", "LJp/b;", "sortBy", "", "LKp/b;", "a", "(Ljava/lang/String;IILjava/util/ArrayList;LJp/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKp/e;", "reviewSubmitRequest", "b", "(LKp/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewId", "LKp/a;", "feedbackVote", "d", "(Ljava/lang/String;LKp/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productIds", "LGp/c;", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyo/k;", "Landroid/content/SharedPreferences;", "Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;", "LHp/f;", "LHp/d;", "f", "Lcom/bazaarvoice/bvandroidsdk/BVSDK;", "g", "Ljava/lang/String;", "getBazaarVoiceSharedSecretKey", "()Ljava/lang/String;", "h", "Lqv/K;", "l", "bvUserAuthenticatedToken", "i", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a implements g {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final BVConversationsClient bazaarVoiceClient;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Hp.f fileFromUriUtil;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Hp.d serviceToDomainMapper;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final BVSDK bvSdk;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String bazaarVoiceSharedSecretKey;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K dispatcher;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/reviews/service/a$a;", "", "<init>", "()V", "", "", "f", "([B)Ljava/lang/String;", "userInfo", "sharedSecretKey", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "e", "([B[B)[B", "BV_USER_AUTHENTICATED_STRING_KEY", "Ljava/lang/String;", "PHOTO_UPLOAD_CAPTION_DEFAULT", "", "SDK_CALL_TIMEOUT_IN_MILLIS", "J", "BV_USER_ID_QUERY_PARAMETER", "BV_USER_EMAIL_QUERY_PARAMETER", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.service.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(String userInfo, String sharedSecretKey) {
            Charset charset = Charsets.UTF_8;
            byte[] bytes = sharedSecretKey.getBytes(charset);
            Intrinsics.i(bytes, "getBytes(...)");
            byte[] bytes2 = userInfo.getBytes(charset);
            Intrinsics.i(bytes2, "getBytes(...)");
            return f(e(bytes, bytes2));
        }

        private final byte[] e(byte[] key, byte[] userInfo) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
            Mac mac = Mac.getInstance("HmacSHA256");
            Intrinsics.i(mac, "getInstance(...)");
            mac.init(new SecretKeySpec(key, "HmacSHA256"));
            byte[] bArrDoFinal = mac.doFinal(userInfo);
            Intrinsics.i(bArrDoFinal, "doFinal(...)");
            return bArrDoFinal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(byte[] bArr) {
            return ArraysKt.B0(bArr, "", null, null, 0, null, new Function1() { // from class: Hp.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a.Companion.g(((Byte) obj).byteValue());
                }
            }, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence g(byte b10) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.i(str, "format(...)");
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LGp/c;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getBulkProductRatings$2", f = "BazaarVoiceReviewManager.kt", l = {348}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductRatings>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f115294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f115295c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LGp/c;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getBulkProductRatings$2$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$b$a, reason: collision with other inner class name */
        static final class C1832a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductRatings>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f115296a;

            /* renamed from: b, reason: collision with root package name */
            Object f115297b;

            /* renamed from: c, reason: collision with root package name */
            int f115298c;

            /* renamed from: d, reason: collision with root package name */
            int f115299d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<String> f115300e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f115301f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$b$a$a, reason: collision with other inner class name */
            static final class C1833a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallDisplay<BulkRatingsRequest, BulkRatingsResponse> f115302a;

                C1833a(LoadCallDisplay<BulkRatingsRequest, BulkRatingsResponse> loadCallDisplay) {
                    this.f115302a = loadCallDisplay;
                }

                public final void a(Throwable th2) {
                    this.f115302a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$b$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsDisplayCallback;", "Lcom/bazaarvoice/bvandroidsdk/BulkRatingsResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/BulkRatingsResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$b$a$b, reason: collision with other inner class name */
            public static final class C1834b implements ConversationsDisplayCallback<BulkRatingsResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16654n<List<ProductRatings>> f115303a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f115304b;

                /* JADX WARN: Multi-variable type inference failed */
                C1834b(InterfaceC16654n<? super List<ProductRatings>> interfaceC16654n, a aVar) {
                    this.f115303a = interfaceC16654n;
                    this.f115304b = aVar;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(BulkRatingsResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC16654n<List<ProductRatings>> interfaceC16654n = this.f115303a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(this.f115304b.serviceToDomainMapper.c(response)));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                public void onFailure(ConversationsException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC16654n<List<ProductRatings>> interfaceC16654n = this.f115303a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1832a(List<String> list, a aVar, Continuation<? super C1832a> continuation) {
                super(2, continuation);
                this.f115300e = list;
                this.f115301f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1832a(this.f115300e, this.f115301f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductRatings>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super List<ProductRatings>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductRatings>> continuation) {
                return ((C1832a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115299d;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                List<String> list = this.f115300e;
                a aVar = this.f115301f;
                this.f115296a = list;
                this.f115297b = aVar;
                this.f115298c = 0;
                this.f115299d = 1;
                C16658p c16658p = new C16658p(IntrinsicsKt.c(this), 1);
                c16658p.C();
                BulkRatingsRequest bulkRatingsRequestBuild = new BulkRatingsRequest.Builder(list, BulkRatingOptions.StatsType.All).build();
                C1834b c1834b = new C1834b(c16658p, aVar);
                LoadCallDisplay<BulkRatingsRequest, BulkRatingsResponse> loadCallDisplayPrepareCall = aVar.bazaarVoiceClient.prepareCall(bulkRatingsRequestBuild);
                loadCallDisplayPrepareCall.loadAsync(c1834b);
                c16658p.F(new C1833a(loadCallDisplayPrepareCall));
                Object objV = c16658p.v();
                if (objV == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (objV == objF) {
                    return objF;
                }
                return objV;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f115294b = list;
            this.f115295c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f115294b, this.f115295c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductRatings>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductRatings>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductRatings>> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115293a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C1832a c1832a = new C1832a(this.f115294b, this.f115295c, null);
                    this.f115293a = 1;
                    obj = d1.c(6000L, c1832a, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return (List) obj;
            } catch (TimeoutCancellationException e10) {
                uw.a.INSTANCE.f(e10, "Timeout: Bulk Ratings SDK call timed out", new Object[0]);
                throw new ReviewException.Timeout("Timeout: Bulk Ratings SDK call timed out", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LKp/b;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviewWithOptions$2", f = "BazaarVoiceReviewManager.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductReviewDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f115306b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f115307c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f115308d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList<Filter> f115309e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Jp.b f115310f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f115311g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LKp/b;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviewWithOptions$2$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$c$a, reason: collision with other inner class name */
        static final class C1835a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductReviewDetails>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f115312a;

            /* renamed from: b, reason: collision with root package name */
            Object f115313b;

            /* renamed from: c, reason: collision with root package name */
            Object f115314c;

            /* renamed from: d, reason: collision with root package name */
            Object f115315d;

            /* renamed from: e, reason: collision with root package name */
            int f115316e;

            /* renamed from: f, reason: collision with root package name */
            int f115317f;

            /* renamed from: g, reason: collision with root package name */
            int f115318g;

            /* renamed from: h, reason: collision with root package name */
            int f115319h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ String f115320i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f115321j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f115322k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ArrayList<Filter> f115323l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Jp.b f115324m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ a f115325n;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$c$a$a, reason: collision with other inner class name */
            static final class C1836a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallDisplay<ReviewsRequest, ReviewResponse> f115326a;

                C1836a(LoadCallDisplay<ReviewsRequest, ReviewResponse> loadCallDisplay) {
                    this.f115326a = loadCallDisplay;
                }

                public final void a(Throwable th2) {
                    this.f115326a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$c$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsDisplayCallback;", "Lcom/bazaarvoice/bvandroidsdk/ReviewResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/ReviewResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$c$a$b */
            public static final class b implements ConversationsDisplayCallback<ReviewResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16654n<List<ProductReviewDetails>> f115327a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f115328b;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC16654n<? super List<ProductReviewDetails>> interfaceC16654n, a aVar) {
                    this.f115327a = interfaceC16654n;
                    this.f115328b = aVar;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ReviewResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC16654n<List<ProductReviewDetails>> interfaceC16654n = this.f115327a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(this.f115328b.serviceToDomainMapper.d(response)));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                public void onFailure(ConversationsException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC16654n<List<ProductReviewDetails>> interfaceC16654n = this.f115327a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1835a(this.f115320i, this.f115321j, this.f115322k, this.f115323l, this.f115324m, this.f115325n, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductReviewDetails>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super List<ProductReviewDetails>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1835a(String str, int i10, int i11, ArrayList<Filter> arrayList, Jp.b bVar, a aVar, Continuation<? super C1835a> continuation) {
                super(2, continuation);
                this.f115320i = str;
                this.f115321j = i10;
                this.f115322k = i11;
                this.f115323l = arrayList;
                this.f115324m = bVar;
                this.f115325n = aVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductReviewDetails>> continuation) {
                return ((C1835a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115319h;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                String str = this.f115320i;
                int i11 = this.f115321j;
                int i12 = this.f115322k;
                ArrayList<Filter> arrayList = this.f115323l;
                Jp.b bVar = this.f115324m;
                a aVar = this.f115325n;
                this.f115312a = str;
                this.f115313b = arrayList;
                this.f115314c = bVar;
                this.f115315d = aVar;
                this.f115316e = i11;
                this.f115317f = i12;
                this.f115318g = 0;
                this.f115319h = 1;
                C16658p c16658p = new C16658p(IntrinsicsKt.c(this), 1);
                c16658p.C();
                ReviewsRequest.Builder builder = new ReviewsRequest.Builder(str, i11, i12);
                ArrayList arrayList2 = new ArrayList();
                if (arrayList != null) {
                    for (Filter filter : arrayList) {
                        if (filter.getFilter() == ReviewOptions.Filter.Rating) {
                            Boxing.a(arrayList2.add(filter.getValue()));
                        } else {
                            builder.addFilter(filter.getFilter(), filter.getOperator(), filter.getValue());
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    builder.addFilter(ReviewOptions.Filter.Rating, EqualityOperator.EQ, arrayList2);
                }
                if (bVar != null) {
                    builder.addSort(bVar.getSortBy(), bVar.getOrder());
                }
                b bVar2 = new b(c16658p, aVar);
                LoadCallDisplay<ReviewsRequest, ReviewResponse> loadCallDisplayPrepareCall = aVar.bazaarVoiceClient.prepareCall(builder.build());
                loadCallDisplayPrepareCall.loadAsync(bVar2);
                c16658p.F(new C1836a(loadCallDisplayPrepareCall));
                Object objV = c16658p.v();
                if (objV == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (objV == objF) {
                    return objF;
                }
                return objV;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f115306b, this.f115307c, this.f115308d, this.f115309e, this.f115310f, this.f115311g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductReviewDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductReviewDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, int i11, ArrayList<Filter> arrayList, Jp.b bVar, a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f115306b = str;
            this.f115307c = i10;
            this.f115308d = i11;
            this.f115309e = arrayList;
            this.f115310f = bVar;
            this.f115311g = aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductReviewDetails>> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115305a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C1835a c1835a = new C1835a(this.f115306b, this.f115307c, this.f115308d, this.f115309e, this.f115310f, this.f115311g, null);
                    this.f115305a = 1;
                    obj = d1.c(6000L, c1835a, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return (List) obj;
            } catch (TimeoutCancellationException e10) {
                uw.a.INSTANCE.f(e10, "Timeout: failed to get product review with options", new Object[0]);
                throw new ReviewException.Timeout("Timeout: failed to get product review with options", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LKp/c;", "<anonymous>", "(Lqv/O;)LKp/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviews$2", f = "BazaarVoiceReviewManager.kt", l = {103}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ProductReviewFullDetails>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f115330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f115331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f115332d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LKp/c;", "<anonymous>", "(Lqv/O;)LKp/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviews$2$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$d$a, reason: collision with other inner class name */
        static final class C1837a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ProductReviewFullDetails>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f115333a;

            /* renamed from: b, reason: collision with root package name */
            Object f115334b;

            /* renamed from: c, reason: collision with root package name */
            int f115335c;

            /* renamed from: d, reason: collision with root package name */
            int f115336d;

            /* renamed from: e, reason: collision with root package name */
            int f115337e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f115338f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f115339g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a f115340h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$d$a$a, reason: collision with other inner class name */
            static final class C1838a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallDisplay<ProductDisplayPageRequest, ProductDisplayPageResponse> f115341a;

                C1838a(LoadCallDisplay<ProductDisplayPageRequest, ProductDisplayPageResponse> loadCallDisplay) {
                    this.f115341a = loadCallDisplay;
                }

                public final void a(Throwable th2) {
                    this.f115341a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$d$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsDisplayCallback;", "Lcom/bazaarvoice/bvandroidsdk/ProductDisplayPageResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/ProductDisplayPageResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$d$a$b */
            public static final class b implements ConversationsDisplayCallback<ProductDisplayPageResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16654n<ProductReviewFullDetails> f115342a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f115343b;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC16654n<? super ProductReviewFullDetails> interfaceC16654n, a aVar) {
                    this.f115342a = interfaceC16654n;
                    this.f115343b = aVar;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ProductDisplayPageResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC16654n<ProductReviewFullDetails> interfaceC16654n = this.f115342a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(this.f115343b.serviceToDomainMapper.b(response)));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                public void onFailure(ConversationsException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC16654n<ProductReviewFullDetails> interfaceC16654n = this.f115342a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1837a(String str, int i10, a aVar, Continuation<? super C1837a> continuation) {
                super(2, continuation);
                this.f115338f = str;
                this.f115339g = i10;
                this.f115340h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1837a(this.f115338f, this.f115339g, this.f115340h, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ProductReviewFullDetails> continuation) {
                return ((C1837a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115337e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                String str = this.f115338f;
                int i11 = this.f115339g;
                a aVar = this.f115340h;
                this.f115333a = str;
                this.f115334b = aVar;
                this.f115335c = i11;
                this.f115336d = 0;
                this.f115337e = 1;
                C16658p c16658p = new C16658p(IntrinsicsKt.c(this), 1);
                c16658p.C();
                ProductDisplayPageRequest.Builder builder = new ProductDisplayPageRequest.Builder(str);
                PDPContentType pDPContentType = PDPContentType.Reviews;
                ProductDisplayPageRequest productDisplayPageRequestBuild = builder.addIncludeStatistics(pDPContentType).addIncludeContent(pDPContentType, Boxing.d(i11)).build();
                b bVar = new b(c16658p, aVar);
                LoadCallDisplay<ProductDisplayPageRequest, ProductDisplayPageResponse> loadCallDisplayPrepareCall = aVar.bazaarVoiceClient.prepareCall(productDisplayPageRequestBuild);
                loadCallDisplayPrepareCall.loadAsync(bVar);
                c16658p.F(new C1838a(loadCallDisplayPrepareCall));
                Object objV = c16658p.v();
                if (objV == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (objV == objF) {
                    return objF;
                }
                return objV;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, int i10, a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f115330b = str;
            this.f115331c = i10;
            this.f115332d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f115330b, this.f115331c, this.f115332d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ProductReviewFullDetails> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115329a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C1837a c1837a = new C1837a(this.f115330b, this.f115331c, this.f115332d, null);
                    this.f115329a = 1;
                    obj = d1.c(6000L, c1837a, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return (ProductReviewFullDetails) obj;
            } catch (TimeoutCancellationException e10) {
                uw.a.INSTANCE.f(e10, "Timeout: failed to get product reviews", new Object[0]);
                throw new ReviewException.Timeout("Timeout: failed to get product reviews", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitFeedbackForReview$2", f = "BazaarVoiceReviewManager.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115344a;

        /* renamed from: b, reason: collision with root package name */
        int f115345b;

        /* renamed from: c, reason: collision with root package name */
        int f115346c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f115348e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Kp.a f115349f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitFeedbackForReview$2$1$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$e$a, reason: collision with other inner class name */
        static final class C1839a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f115350a;

            /* renamed from: b, reason: collision with root package name */
            Object f115351b;

            /* renamed from: c, reason: collision with root package name */
            Object f115352c;

            /* renamed from: d, reason: collision with root package name */
            int f115353d;

            /* renamed from: e, reason: collision with root package name */
            int f115354e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f115355f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ a f115356g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Kp.a f115357h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$e$a$a, reason: collision with other inner class name */
            static final class C1840a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallSubmission<FeedbackSubmissionRequest, FeedbackSubmissionResponse> f115358a;

                C1840a(LoadCallSubmission<FeedbackSubmissionRequest, FeedbackSubmissionResponse> loadCallSubmission) {
                    this.f115358a = loadCallSubmission;
                }

                public final void a(Throwable th2) {
                    this.f115358a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$e$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionCallback;", "Lcom/bazaarvoice/bvandroidsdk/FeedbackSubmissionResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/FeedbackSubmissionResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$e$a$b */
            public static final class b implements ConversationsSubmissionCallback<FeedbackSubmissionResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16654n<Unit> f115359a;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC16654n<? super Unit> interfaceC16654n) {
                    this.f115359a = interfaceC16654n;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(FeedbackSubmissionResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC16654n<Unit> interfaceC16654n = this.f115359a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(Unit.f142422a));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback
                public void onFailure(ConversationsSubmissionException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC16654n<Unit> interfaceC16654n = this.f115359a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$e$a$c */
            public /* synthetic */ class c {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Kp.a.values().length];
                    try {
                        iArr[Kp.a.f17434a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Kp.a.f17435b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Kp.a.f17436c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1839a(this.f115355f, this.f115356g, this.f115357h, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1839a(String str, a aVar, Kp.a aVar2, Continuation<? super C1839a> continuation) {
                super(2, continuation);
                this.f115355f = str;
                this.f115356g = aVar;
                this.f115357h = aVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1839a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115354e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    String str = this.f115355f;
                    a aVar = this.f115356g;
                    Kp.a aVar2 = this.f115357h;
                    this.f115350a = str;
                    this.f115351b = aVar;
                    this.f115352c = aVar2;
                    this.f115353d = 0;
                    this.f115354e = 1;
                    C16658p c16658p = new C16658p(IntrinsicsKt.c(this), 1);
                    c16658p.C();
                    FeedbackSubmissionRequest.Builder builderFeedbackContentType = new FeedbackSubmissionRequest.Builder(str).authenticationProvider(new BVHostedAuthenticationProvider(aVar.l())).feedbackContentType(M6.a.REVIEW);
                    int i11 = c.$EnumSwitchMapping$0[aVar2.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                builderFeedbackContentType.feedbackType(M6.b.HELPFULNESS);
                                builderFeedbackContentType.feedbackVote(M6.c.NEGATIVE);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            builderFeedbackContentType.feedbackType(M6.b.HELPFULNESS);
                            builderFeedbackContentType.feedbackVote(M6.c.POSITIVE);
                        }
                    } else {
                        builderFeedbackContentType.feedbackType(M6.b.INAPPROPRIATE);
                    }
                    b bVar = new b(c16658p);
                    LoadCallSubmission<FeedbackSubmissionRequest, FeedbackSubmissionResponse> loadCallSubmissionPrepareCall = aVar.bazaarVoiceClient.prepareCall(builderFeedbackContentType.build());
                    loadCallSubmissionPrepareCall.loadAsync(bVar);
                    c16658p.F(new C1840a(loadCallSubmissionPrepareCall));
                    Object objV = c16658p.v();
                    if (objV == IntrinsicsKt.f()) {
                        DebugProbesKt.c(this);
                    }
                    if (objV == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(this.f115348e, this.f115349f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Kp.a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f115348e = str;
            this.f115349f = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout, ReviewException.AuthenticationRequired {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115346c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    a aVar = a.this;
                    aVar.k(aVar.userManager.D());
                    Unit unit = Unit.f142422a;
                    C1839a c1839a = new C1839a(this.f115348e, a.this, this.f115349f, null);
                    this.f115344a = unit;
                    this.f115345b = 0;
                    this.f115346c = 1;
                    if (d1.c(6000L, c1839a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            } catch (TimeoutCancellationException e10) {
                uw.a.INSTANCE.f(e10, "Submit product feedback review SDK call timed out", new Object[0]);
                throw new ReviewException.Timeout("Submit product feedback review SDK call timed out", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitProductReview$2", f = "BazaarVoiceReviewManager.kt", l = {207}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115360a;

        /* renamed from: b, reason: collision with root package name */
        int f115361b;

        /* renamed from: c, reason: collision with root package name */
        int f115362c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ProductReviewSubmitRequest f115364e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitProductReview$2$1$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$f$a, reason: collision with other inner class name */
        static final class C1841a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f115365a;

            /* renamed from: b, reason: collision with root package name */
            Object f115366b;

            /* renamed from: c, reason: collision with root package name */
            int f115367c;

            /* renamed from: d, reason: collision with root package name */
            int f115368d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ProductReviewSubmitRequest f115369e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f115370f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$f$a$a, reason: collision with other inner class name */
            static final class C1842a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallSubmission<ReviewSubmissionRequest, ReviewSubmissionResponse> f115371a;

                C1842a(LoadCallSubmission<ReviewSubmissionRequest, ReviewSubmissionResponse> loadCallSubmission) {
                    this.f115371a = loadCallSubmission;
                }

                public final void a(Throwable th2) {
                    this.f115371a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$f$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionCallback;", "Lcom/bazaarvoice/bvandroidsdk/ReviewSubmissionResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/ReviewSubmissionResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$f$a$b */
            public static final class b implements ConversationsSubmissionCallback<ReviewSubmissionResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16654n<Unit> f115372a;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC16654n<? super Unit> interfaceC16654n) {
                    this.f115372a = interfaceC16654n;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ReviewSubmissionResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC16654n<Unit> interfaceC16654n = this.f115372a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(Unit.f142422a));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback
                public void onFailure(ConversationsSubmissionException exception) {
                    String message;
                    Intrinsics.j(exception, "exception");
                    List<Error> errors = exception.getErrors();
                    List<FieldError> fieldErrors = exception.getFieldErrors();
                    if (errors.isEmpty()) {
                        Intrinsics.g(fieldErrors);
                        message = ((FieldError) CollectionsKt.s0(fieldErrors)).getMessage();
                    } else {
                        Intrinsics.g(errors);
                        message = ((Error) CollectionsKt.s0(errors)).getMessage();
                    }
                    InterfaceC16654n<Unit> interfaceC16654n = this.f115372a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(ResultKt.a(new Throwable(message))));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1841a(this.f115369e, this.f115370f, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1841a(ProductReviewSubmitRequest productReviewSubmitRequest, a aVar, Continuation<? super C1841a> continuation) {
                super(2, continuation);
                this.f115369e = productReviewSubmitRequest;
                this.f115370f = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1841a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115368d;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ProductReviewSubmitRequest productReviewSubmitRequest = this.f115369e;
                    a aVar = this.f115370f;
                    this.f115365a = productReviewSubmitRequest;
                    this.f115366b = aVar;
                    this.f115367c = 0;
                    this.f115368d = 1;
                    C16658p c16658p = new C16658p(IntrinsicsKt.c(this), 1);
                    c16658p.C();
                    ReviewSubmissionRequest.Builder builder = (ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) new ReviewSubmissionRequest.Builder(Action.Submit, productReviewSubmitRequest.getProductId()).authenticationProvider(new BVHostedAuthenticationProvider(aVar.l()))).rating(productReviewSubmitRequest.getRating())).reviewText(productReviewSubmitRequest.getDescription())).title(productReviewSubmitRequest.getTitle())).userNickname(productReviewSubmitRequest.getUserName())).userEmail(productReviewSubmitRequest.getUserEmail())).agreedToTermsAndConditions(Boxing.a(productReviewSubmitRequest.getAgreedToTermsAndCondition()));
                    if (productReviewSubmitRequest.getUserLocationName() != null && (!StringsKt.r0(r6))) {
                        builder.userLocation(productReviewSubmitRequest.getUserLocationName());
                    }
                    Iterator<T> it = productReviewSubmitRequest.e().iterator();
                    while (it.hasNext()) {
                        File fileA = aVar.fileFromUriUtil.a((Uri) it.next());
                        if (fileA != null) {
                            builder.addPhoto(fileA, "Meijer customer product review image");
                        }
                    }
                    if (productReviewSubmitRequest.getIsRecommended()) {
                    }
                    ReviewSubmissionRequest reviewSubmissionRequestBuild = builder.build();
                    Intrinsics.i(reviewSubmissionRequestBuild, "build(...)");
                    b bVar = new b(c16658p);
                    LoadCallSubmission<ReviewSubmissionRequest, ReviewSubmissionResponse> loadCallSubmissionPrepareCall = aVar.bazaarVoiceClient.prepareCall(reviewSubmissionRequestBuild);
                    loadCallSubmissionPrepareCall.loadAsync(bVar);
                    c16658p.F(new C1842a(loadCallSubmissionPrepareCall));
                    Object objV = c16658p.v();
                    if (objV == IntrinsicsKt.f()) {
                        DebugProbesKt.c(this);
                    }
                    if (objV == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new f(this.f115364e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ProductReviewSubmitRequest productReviewSubmitRequest, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f115364e = productReviewSubmitRequest;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout, ReviewException.AuthenticationRequired {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115362c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    a aVar = a.this;
                    aVar.k(aVar.userManager.D());
                    Unit unit = Unit.f142422a;
                    C1841a c1841a = new C1841a(this.f115364e, a.this, null);
                    this.f115360a = unit;
                    this.f115361b = 0;
                    this.f115362c = 1;
                    if (d1.c(6000L, c1841a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            } catch (TimeoutCancellationException e10) {
                uw.a.INSTANCE.f(e10, "Submit product feedback review SDK call timed out", new Object[0]);
                throw new ReviewException.Timeout("Submit product feedback review SDK call timed out", e10);
            }
        }
    }

    public a(k userManager, SharedPreferences sharedPreferences, BVConversationsClient bazaarVoiceClient, Hp.f fileFromUriUtil, Hp.d serviceToDomainMapper, BVSDK bvSdk, String bazaarVoiceSharedSecretKey, AbstractC16618K dispatcher) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        Intrinsics.j(bazaarVoiceClient, "bazaarVoiceClient");
        Intrinsics.j(fileFromUriUtil, "fileFromUriUtil");
        Intrinsics.j(serviceToDomainMapper, "serviceToDomainMapper");
        Intrinsics.j(bvSdk, "bvSdk");
        Intrinsics.j(bazaarVoiceSharedSecretKey, "bazaarVoiceSharedSecretKey");
        Intrinsics.j(dispatcher, "dispatcher");
        this.userManager = userManager;
        this.sharedPreferences = sharedPreferences;
        this.bazaarVoiceClient = bazaarVoiceClient;
        this.fileFromUriUtil = fileFromUriUtil;
        this.serviceToDomainMapper = serviceToDomainMapper;
        this.bvSdk = bvSdk;
        this.bazaarVoiceSharedSecretKey = bazaarVoiceSharedSecretKey;
        this.dispatcher = dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l() {
        String string = this.sharedPreferences.getString("bazaarvoice_user_authenticated_string", "");
        return string == null ? "" : string;
    }

    @Override // Kp.g
    public Object a(String str, int i10, int i11, ArrayList<Filter> arrayList, Jp.b bVar, Continuation<? super List<ProductReviewDetails>> continuation) {
        return C16644i.g(this.dispatcher, new c(str, i10, i11, arrayList, bVar, this, null), continuation);
    }

    @Override // Kp.g
    public Object b(ProductReviewSubmitRequest productReviewSubmitRequest, Continuation<? super Unit> continuation) {
        Object objG = C16644i.g(this.dispatcher, new f(productReviewSubmitRequest, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    @Override // Kp.g
    public Object c(String str, int i10, Continuation<? super ProductReviewFullDetails> continuation) {
        return C16644i.g(this.dispatcher, new d(str, i10, this, null), continuation);
    }

    @Override // Kp.g
    public Object d(String str, Kp.a aVar, Continuation<? super Unit> continuation) {
        Object objG = C16644i.g(this.dispatcher, new e(str, aVar, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    @Override // Kp.g
    public Object e(List<String> list, Continuation<? super List<ProductRatings>> continuation) {
        return C16644i.g(this.dispatcher, new b(list, this, null), continuation);
    }

    public void k(MeijerUser meijerUser) throws ReviewException.AuthenticationRequired {
        Intrinsics.j(meijerUser, "meijerUser");
        if (!this.userManager.b()) {
            throw new ReviewException.AuthenticationRequired("Please login to submit a review", null, 2, null);
        }
        String str = "userid=" + this.userManager.a() + "&email=" + this.userManager.h();
        Companion companion = INSTANCE;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        String strF = companion.f(bytes);
        String str2 = companion.d(str, this.bazaarVoiceSharedSecretKey) + strF;
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("bazaarvoice_user_authenticated_string", str2);
        editorEdit.apply();
        this.bvSdk.setUserAuthString(str2);
    }
}
