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
import mv.AbstractC15779K;
import mv.C15805i;
import mv.C15819p;
import mv.InterfaceC15783O;
import mv.InterfaceC15815n;
import mv.d1;
import yo.MeijerUser;
import yo.k;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001(BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJT\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00020!\u0018\u0001`\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J \u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0096@¢\u0006\u0004\b1\u00102J$\u00105\u001a\b\u0012\u0004\u0012\u0002040&2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0&H\u0096@¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010A¨\u0006G"}, d2 = {"Lcom/meijer/mobile/reviews/service/a;", "LKp/g;", "Lyo/k;", "userManager", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;", "bazaarVoiceClient", "LHp/f;", "fileFromUriUtil", "LHp/d;", "serviceToDomainMapper", "Lcom/bazaarvoice/bvandroidsdk/BVSDK;", "bvSdk", "", "bazaarVoiceSharedSecretKey", "Lmv/K;", "dispatcher", "<init>", "(Lyo/k;Landroid/content/SharedPreferences;Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;LHp/f;LHp/d;Lcom/bazaarvoice/bvandroidsdk/BVSDK;Ljava/lang/String;Lmv/K;)V", "Lyo/c;", "meijerUser", "", "k", "(Lyo/c;)V", "productId", "", "reviewsToFetch", "LKp/c;", "c", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paginationIndex", "Ljava/util/ArrayList;", "LJp/a;", "Lkotlin/collections/ArrayList;", "filterArray", "LJp/b;", "sortBy", "", "LKp/b;", "a", "(Ljava/lang/String;IILjava/util/ArrayList;LJp/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKp/e;", "reviewSubmitRequest", "b", "(LKp/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewId", "LKp/a;", "feedbackVote", "d", "(Ljava/lang/String;LKp/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productIds", "LGp/c;", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyo/k;", "Landroid/content/SharedPreferences;", "Lcom/bazaarvoice/bvandroidsdk/BVConversationsClient;", "LHp/f;", "LHp/d;", "f", "Lcom/bazaarvoice/bvandroidsdk/BVSDK;", "g", "Ljava/lang/String;", "getBazaarVoiceSharedSecretKey", "()Ljava/lang/String;", "h", "Lmv/K;", "l", "bvUserAuthenticatedToken", "i", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
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
    private final AbstractC15779K dispatcher;

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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LGp/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getBulkProductRatings$2", f = "BazaarVoiceReviewManager.kt", l = {348}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductRatings>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116238a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f116239b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f116240c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LGp/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getBulkProductRatings$2$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$b$a, reason: collision with other inner class name */
        static final class C1839a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductRatings>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f116241a;

            /* renamed from: b, reason: collision with root package name */
            Object f116242b;

            /* renamed from: c, reason: collision with root package name */
            int f116243c;

            /* renamed from: d, reason: collision with root package name */
            int f116244d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<String> f116245e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f116246f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$b$a$a, reason: collision with other inner class name */
            static final class C1840a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallDisplay<BulkRatingsRequest, BulkRatingsResponse> f116247a;

                C1840a(LoadCallDisplay<BulkRatingsRequest, BulkRatingsResponse> loadCallDisplay) {
                    this.f116247a = loadCallDisplay;
                }

                public final void a(Throwable th2) {
                    this.f116247a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$b$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsDisplayCallback;", "Lcom/bazaarvoice/bvandroidsdk/BulkRatingsResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/BulkRatingsResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$b$a$b, reason: collision with other inner class name */
            public static final class C1841b implements ConversationsDisplayCallback<BulkRatingsResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC15815n<List<ProductRatings>> f116248a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f116249b;

                /* JADX WARN: Multi-variable type inference failed */
                C1841b(InterfaceC15815n<? super List<ProductRatings>> interfaceC15815n, a aVar) {
                    this.f116248a = interfaceC15815n;
                    this.f116249b = aVar;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(BulkRatingsResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC15815n<List<ProductRatings>> interfaceC15815n = this.f116248a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(this.f116249b.serviceToDomainMapper.c(response)));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                public void onFailure(ConversationsException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC15815n<List<ProductRatings>> interfaceC15815n = this.f116248a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1839a(List<String> list, a aVar, Continuation<? super C1839a> continuation) {
                super(2, continuation);
                this.f116245e = list;
                this.f116246f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1839a(this.f116245e, this.f116246f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductRatings>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super List<ProductRatings>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductRatings>> continuation) {
                return ((C1839a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116244d;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                List<String> list = this.f116245e;
                a aVar = this.f116246f;
                this.f116241a = list;
                this.f116242b = aVar;
                this.f116243c = 0;
                this.f116244d = 1;
                C15819p c15819p = new C15819p(IntrinsicsKt.c(this), 1);
                c15819p.C();
                BulkRatingsRequest bulkRatingsRequestBuild = new BulkRatingsRequest.Builder(list, BulkRatingOptions.StatsType.All).build();
                C1841b c1841b = new C1841b(c15819p, aVar);
                LoadCallDisplay<BulkRatingsRequest, BulkRatingsResponse> loadCallDisplayPrepareCall = aVar.bazaarVoiceClient.prepareCall(bulkRatingsRequestBuild);
                loadCallDisplayPrepareCall.loadAsync(c1841b);
                c15819p.F(new C1840a(loadCallDisplayPrepareCall));
                Object objU = c15819p.u();
                if (objU == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (objU == objF) {
                    return objF;
                }
                return objU;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f116239b = list;
            this.f116240c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f116239b, this.f116240c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductRatings>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ProductRatings>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductRatings>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116238a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C1839a c1839a = new C1839a(this.f116239b, this.f116240c, null);
                    this.f116238a = 1;
                    obj = d1.c(6000L, c1839a, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return (List) obj;
            } catch (TimeoutCancellationException e10) {
                qw.a.INSTANCE.f(e10, "Timeout: Bulk Ratings SDK call timed out", new Object[0]);
                throw new ReviewException.Timeout("Timeout: Bulk Ratings SDK call timed out", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LKp/b;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviewWithOptions$2", f = "BazaarVoiceReviewManager.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductReviewDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116250a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f116251b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f116252c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f116253d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList<Filter> f116254e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Jp.b f116255f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f116256g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LKp/b;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviewWithOptions$2$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$c$a, reason: collision with other inner class name */
        static final class C1842a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductReviewDetails>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f116257a;

            /* renamed from: b, reason: collision with root package name */
            Object f116258b;

            /* renamed from: c, reason: collision with root package name */
            Object f116259c;

            /* renamed from: d, reason: collision with root package name */
            Object f116260d;

            /* renamed from: e, reason: collision with root package name */
            int f116261e;

            /* renamed from: f, reason: collision with root package name */
            int f116262f;

            /* renamed from: g, reason: collision with root package name */
            int f116263g;

            /* renamed from: h, reason: collision with root package name */
            int f116264h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ String f116265i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f116266j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f116267k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ArrayList<Filter> f116268l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Jp.b f116269m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ a f116270n;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$c$a$a, reason: collision with other inner class name */
            static final class C1843a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallDisplay<ReviewsRequest, ReviewResponse> f116271a;

                C1843a(LoadCallDisplay<ReviewsRequest, ReviewResponse> loadCallDisplay) {
                    this.f116271a = loadCallDisplay;
                }

                public final void a(Throwable th2) {
                    this.f116271a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$c$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsDisplayCallback;", "Lcom/bazaarvoice/bvandroidsdk/ReviewResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/ReviewResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$c$a$b */
            public static final class b implements ConversationsDisplayCallback<ReviewResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC15815n<List<ProductReviewDetails>> f116272a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f116273b;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC15815n<? super List<ProductReviewDetails>> interfaceC15815n, a aVar) {
                    this.f116272a = interfaceC15815n;
                    this.f116273b = aVar;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ReviewResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC15815n<List<ProductReviewDetails>> interfaceC15815n = this.f116272a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(this.f116273b.serviceToDomainMapper.d(response)));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                public void onFailure(ConversationsException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC15815n<List<ProductReviewDetails>> interfaceC15815n = this.f116272a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1842a(this.f116265i, this.f116266j, this.f116267k, this.f116268l, this.f116269m, this.f116270n, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductReviewDetails>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super List<ProductReviewDetails>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1842a(String str, int i10, int i11, ArrayList<Filter> arrayList, Jp.b bVar, a aVar, Continuation<? super C1842a> continuation) {
                super(2, continuation);
                this.f116265i = str;
                this.f116266j = i10;
                this.f116267k = i11;
                this.f116268l = arrayList;
                this.f116269m = bVar;
                this.f116270n = aVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductReviewDetails>> continuation) {
                return ((C1842a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116264h;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                String str = this.f116265i;
                int i11 = this.f116266j;
                int i12 = this.f116267k;
                ArrayList<Filter> arrayList = this.f116268l;
                Jp.b bVar = this.f116269m;
                a aVar = this.f116270n;
                this.f116257a = str;
                this.f116258b = arrayList;
                this.f116259c = bVar;
                this.f116260d = aVar;
                this.f116261e = i11;
                this.f116262f = i12;
                this.f116263g = 0;
                this.f116264h = 1;
                C15819p c15819p = new C15819p(IntrinsicsKt.c(this), 1);
                c15819p.C();
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
                b bVar2 = new b(c15819p, aVar);
                LoadCallDisplay<ReviewsRequest, ReviewResponse> loadCallDisplayPrepareCall = aVar.bazaarVoiceClient.prepareCall(builder.build());
                loadCallDisplayPrepareCall.loadAsync(bVar2);
                c15819p.F(new C1843a(loadCallDisplayPrepareCall));
                Object objU = c15819p.u();
                if (objU == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (objU == objF) {
                    return objF;
                }
                return objU;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f116251b, this.f116252c, this.f116253d, this.f116254e, this.f116255f, this.f116256g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductReviewDetails>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ProductReviewDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, int i11, ArrayList<Filter> arrayList, Jp.b bVar, a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f116251b = str;
            this.f116252c = i10;
            this.f116253d = i11;
            this.f116254e = arrayList;
            this.f116255f = bVar;
            this.f116256g = aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductReviewDetails>> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116250a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C1842a c1842a = new C1842a(this.f116251b, this.f116252c, this.f116253d, this.f116254e, this.f116255f, this.f116256g, null);
                    this.f116250a = 1;
                    obj = d1.c(6000L, c1842a, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return (List) obj;
            } catch (TimeoutCancellationException e10) {
                qw.a.INSTANCE.f(e10, "Timeout: failed to get product review with options", new Object[0]);
                throw new ReviewException.Timeout("Timeout: failed to get product review with options", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LKp/c;", "<anonymous>", "(Lmv/O;)LKp/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviews$2", f = "BazaarVoiceReviewManager.kt", l = {103}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ProductReviewFullDetails>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116274a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f116275b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f116276c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f116277d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LKp/c;", "<anonymous>", "(Lmv/O;)LKp/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$getProductReviews$2$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$d$a, reason: collision with other inner class name */
        static final class C1844a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ProductReviewFullDetails>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f116278a;

            /* renamed from: b, reason: collision with root package name */
            Object f116279b;

            /* renamed from: c, reason: collision with root package name */
            int f116280c;

            /* renamed from: d, reason: collision with root package name */
            int f116281d;

            /* renamed from: e, reason: collision with root package name */
            int f116282e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f116283f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f116284g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a f116285h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$d$a$a, reason: collision with other inner class name */
            static final class C1845a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallDisplay<ProductDisplayPageRequest, ProductDisplayPageResponse> f116286a;

                C1845a(LoadCallDisplay<ProductDisplayPageRequest, ProductDisplayPageResponse> loadCallDisplay) {
                    this.f116286a = loadCallDisplay;
                }

                public final void a(Throwable th2) {
                    this.f116286a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$d$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsDisplayCallback;", "Lcom/bazaarvoice/bvandroidsdk/ProductDisplayPageResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/ProductDisplayPageResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$d$a$b */
            public static final class b implements ConversationsDisplayCallback<ProductDisplayPageResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC15815n<ProductReviewFullDetails> f116287a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f116288b;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC15815n<? super ProductReviewFullDetails> interfaceC15815n, a aVar) {
                    this.f116287a = interfaceC15815n;
                    this.f116288b = aVar;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ProductDisplayPageResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC15815n<ProductReviewFullDetails> interfaceC15815n = this.f116287a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(this.f116288b.serviceToDomainMapper.b(response)));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayCallback
                public void onFailure(ConversationsException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC15815n<ProductReviewFullDetails> interfaceC15815n = this.f116287a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1844a(String str, int i10, a aVar, Continuation<? super C1844a> continuation) {
                super(2, continuation);
                this.f116283f = str;
                this.f116284g = i10;
                this.f116285h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1844a(this.f116283f, this.f116284g, this.f116285h, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ProductReviewFullDetails> continuation) {
                return ((C1844a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116282e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                String str = this.f116283f;
                int i11 = this.f116284g;
                a aVar = this.f116285h;
                this.f116278a = str;
                this.f116279b = aVar;
                this.f116280c = i11;
                this.f116281d = 0;
                this.f116282e = 1;
                C15819p c15819p = new C15819p(IntrinsicsKt.c(this), 1);
                c15819p.C();
                ProductDisplayPageRequest.Builder builder = new ProductDisplayPageRequest.Builder(str);
                PDPContentType pDPContentType = PDPContentType.Reviews;
                ProductDisplayPageRequest productDisplayPageRequestBuild = builder.addIncludeStatistics(pDPContentType).addIncludeContent(pDPContentType, Boxing.d(i11)).build();
                b bVar = new b(c15819p, aVar);
                LoadCallDisplay<ProductDisplayPageRequest, ProductDisplayPageResponse> loadCallDisplayPrepareCall = aVar.bazaarVoiceClient.prepareCall(productDisplayPageRequestBuild);
                loadCallDisplayPrepareCall.loadAsync(bVar);
                c15819p.F(new C1845a(loadCallDisplayPrepareCall));
                Object objU = c15819p.u();
                if (objU == IntrinsicsKt.f()) {
                    DebugProbesKt.c(this);
                }
                if (objU == objF) {
                    return objF;
                }
                return objU;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, int i10, a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f116275b = str;
            this.f116276c = i10;
            this.f116277d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f116275b, this.f116276c, this.f116277d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ProductReviewFullDetails> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116274a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C1844a c1844a = new C1844a(this.f116275b, this.f116276c, this.f116277d, null);
                    this.f116274a = 1;
                    obj = d1.c(6000L, c1844a, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return (ProductReviewFullDetails) obj;
            } catch (TimeoutCancellationException e10) {
                qw.a.INSTANCE.f(e10, "Timeout: failed to get product reviews", new Object[0]);
                throw new ReviewException.Timeout("Timeout: failed to get product reviews", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitFeedbackForReview$2", f = "BazaarVoiceReviewManager.kt", l = {HttpResponseStatus.SUCCESS_UNKNOWN}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f116289a;

        /* renamed from: b, reason: collision with root package name */
        int f116290b;

        /* renamed from: c, reason: collision with root package name */
        int f116291c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f116293e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Kp.a f116294f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitFeedbackForReview$2$1$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$e$a, reason: collision with other inner class name */
        static final class C1846a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f116295a;

            /* renamed from: b, reason: collision with root package name */
            Object f116296b;

            /* renamed from: c, reason: collision with root package name */
            Object f116297c;

            /* renamed from: d, reason: collision with root package name */
            int f116298d;

            /* renamed from: e, reason: collision with root package name */
            int f116299e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f116300f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ a f116301g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Kp.a f116302h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$e$a$a, reason: collision with other inner class name */
            static final class C1847a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallSubmission<FeedbackSubmissionRequest, FeedbackSubmissionResponse> f116303a;

                C1847a(LoadCallSubmission<FeedbackSubmissionRequest, FeedbackSubmissionResponse> loadCallSubmission) {
                    this.f116303a = loadCallSubmission;
                }

                public final void a(Throwable th2) {
                    this.f116303a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$e$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionCallback;", "Lcom/bazaarvoice/bvandroidsdk/FeedbackSubmissionResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/FeedbackSubmissionResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$e$a$b */
            public static final class b implements ConversationsSubmissionCallback<FeedbackSubmissionResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC15815n<Unit> f116304a;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC15815n<? super Unit> interfaceC15815n) {
                    this.f116304a = interfaceC15815n;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(FeedbackSubmissionResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC15815n<Unit> interfaceC15815n = this.f116304a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(Unit.f143329a));
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback
                public void onFailure(ConversationsSubmissionException exception) {
                    Intrinsics.j(exception, "exception");
                    InterfaceC15815n<Unit> interfaceC15815n = this.f116304a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(ResultKt.a(exception)));
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$e$a$c */
            public /* synthetic */ class c {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Kp.a.values().length];
                    try {
                        iArr[Kp.a.f17595a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Kp.a.f17596b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Kp.a.f17597c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1846a(this.f116300f, this.f116301g, this.f116302h, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1846a(String str, a aVar, Kp.a aVar2, Continuation<? super C1846a> continuation) {
                super(2, continuation);
                this.f116300f = str;
                this.f116301g = aVar;
                this.f116302h = aVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1846a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116299e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    String str = this.f116300f;
                    a aVar = this.f116301g;
                    Kp.a aVar2 = this.f116302h;
                    this.f116295a = str;
                    this.f116296b = aVar;
                    this.f116297c = aVar2;
                    this.f116298d = 0;
                    this.f116299e = 1;
                    C15819p c15819p = new C15819p(IntrinsicsKt.c(this), 1);
                    c15819p.C();
                    FeedbackSubmissionRequest.Builder builderFeedbackContentType = new FeedbackSubmissionRequest.Builder(str).authenticationProvider(new BVHostedAuthenticationProvider(aVar.l())).feedbackContentType(N6.a.REVIEW);
                    int i11 = c.$EnumSwitchMapping$0[aVar2.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                builderFeedbackContentType.feedbackType(N6.b.HELPFULNESS);
                                builderFeedbackContentType.feedbackVote(N6.c.NEGATIVE);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            builderFeedbackContentType.feedbackType(N6.b.HELPFULNESS);
                            builderFeedbackContentType.feedbackVote(N6.c.POSITIVE);
                        }
                    } else {
                        builderFeedbackContentType.feedbackType(N6.b.INAPPROPRIATE);
                    }
                    b bVar = new b(c15819p);
                    LoadCallSubmission<FeedbackSubmissionRequest, FeedbackSubmissionResponse> loadCallSubmissionPrepareCall = aVar.bazaarVoiceClient.prepareCall(builderFeedbackContentType.build());
                    loadCallSubmissionPrepareCall.loadAsync(bVar);
                    c15819p.F(new C1847a(loadCallSubmissionPrepareCall));
                    Object objU = c15819p.u();
                    if (objU == IntrinsicsKt.f()) {
                        DebugProbesKt.c(this);
                    }
                    if (objU == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(this.f116293e, this.f116294f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Kp.a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f116293e = str;
            this.f116294f = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout, ReviewException.AuthenticationRequired {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116291c;
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
                    Unit unit = Unit.f143329a;
                    C1846a c1846a = new C1846a(this.f116293e, a.this, this.f116294f, null);
                    this.f116289a = unit;
                    this.f116290b = 0;
                    this.f116291c = 1;
                    if (d1.c(6000L, c1846a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            } catch (TimeoutCancellationException e10) {
                qw.a.INSTANCE.f(e10, "Submit product feedback review SDK call timed out", new Object[0]);
                throw new ReviewException.Timeout("Submit product feedback review SDK call timed out", e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitProductReview$2", f = "BazaarVoiceReviewManager.kt", l = {207}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f116305a;

        /* renamed from: b, reason: collision with root package name */
        int f116306b;

        /* renamed from: c, reason: collision with root package name */
        int f116307c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ProductReviewSubmitRequest f116309e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.service.BazaarVoiceReviewManager$submitProductReview$2$1$1", f = "BazaarVoiceReviewManager.kt", l = {428}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.service.a$f$a, reason: collision with other inner class name */
        static final class C1848a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f116310a;

            /* renamed from: b, reason: collision with root package name */
            Object f116311b;

            /* renamed from: c, reason: collision with root package name */
            int f116312c;

            /* renamed from: d, reason: collision with root package name */
            int f116313d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ProductReviewSubmitRequest f116314e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f116315f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$f$a$a, reason: collision with other inner class name */
            static final class C1849a implements Function1<Throwable, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LoadCallSubmission<ReviewSubmissionRequest, ReviewSubmissionResponse> f116316a;

                C1849a(LoadCallSubmission<ReviewSubmissionRequest, ReviewSubmissionResponse> loadCallSubmission) {
                    this.f116316a = loadCallSubmission;
                }

                public final void a(Throwable th2) {
                    this.f116316a.cancel();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    a(th2);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/reviews/service/a$f$a$b", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionCallback;", "Lcom/bazaarvoice/bvandroidsdk/ReviewSubmissionResponse;", "response", "", "a", "(Lcom/bazaarvoice/bvandroidsdk/ReviewSubmissionResponse;)V", "Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;", "exception", "onFailure", "(Lcom/bazaarvoice/bvandroidsdk/ConversationsSubmissionException;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.reviews.service.a$f$a$b */
            public static final class b implements ConversationsSubmissionCallback<ReviewSubmissionResponse> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC15815n<Unit> f116317a;

                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC15815n<? super Unit> interfaceC15815n) {
                    this.f116317a = interfaceC15815n;
                }

                @Override // com.bazaarvoice.bvandroidsdk.ConversationsSubmissionCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ReviewSubmissionResponse response) {
                    Intrinsics.j(response, "response");
                    InterfaceC15815n<Unit> interfaceC15815n = this.f116317a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(Unit.f143329a));
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
                    InterfaceC15815n<Unit> interfaceC15815n = this.f116317a;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(ResultKt.a(new Throwable(message))));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1848a(this.f116314e, this.f116315f, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1848a(ProductReviewSubmitRequest productReviewSubmitRequest, a aVar, Continuation<? super C1848a> continuation) {
                super(2, continuation);
                this.f116314e = productReviewSubmitRequest;
                this.f116315f = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1848a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116313d;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ProductReviewSubmitRequest productReviewSubmitRequest = this.f116314e;
                    a aVar = this.f116315f;
                    this.f116310a = productReviewSubmitRequest;
                    this.f116311b = aVar;
                    this.f116312c = 0;
                    this.f116313d = 1;
                    C15819p c15819p = new C15819p(IntrinsicsKt.c(this), 1);
                    c15819p.C();
                    ReviewSubmissionRequest.Builder builder = (ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest.Builder) new ReviewSubmissionRequest.Builder(Action.Submit, productReviewSubmitRequest.getProductId()).authenticationProvider(new BVHostedAuthenticationProvider(aVar.l()))).rating(productReviewSubmitRequest.getRating())).reviewText(productReviewSubmitRequest.getDescription())).title(productReviewSubmitRequest.getTitle())).userNickname(productReviewSubmitRequest.getUserName())).userEmail(productReviewSubmitRequest.getUserEmail())).agreedToTermsAndConditions(Boxing.a(productReviewSubmitRequest.getAgreedToTermsAndCondition()));
                    if (productReviewSubmitRequest.getUserLocationName() != null && (!StringsKt.s0(r6))) {
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
                    b bVar = new b(c15819p);
                    LoadCallSubmission<ReviewSubmissionRequest, ReviewSubmissionResponse> loadCallSubmissionPrepareCall = aVar.bazaarVoiceClient.prepareCall(reviewSubmissionRequestBuild);
                    loadCallSubmissionPrepareCall.loadAsync(bVar);
                    c15819p.F(new C1849a(loadCallSubmissionPrepareCall));
                    Object objU = c15819p.u();
                    if (objU == IntrinsicsKt.f()) {
                        DebugProbesKt.c(this);
                    }
                    if (objU == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new f(this.f116309e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ProductReviewSubmitRequest productReviewSubmitRequest, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f116309e = productReviewSubmitRequest;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ReviewException.Timeout, ReviewException.AuthenticationRequired {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116307c;
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
                    Unit unit = Unit.f143329a;
                    C1848a c1848a = new C1848a(this.f116309e, a.this, null);
                    this.f116305a = unit;
                    this.f116306b = 0;
                    this.f116307c = 1;
                    if (d1.c(6000L, c1848a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            } catch (TimeoutCancellationException e10) {
                qw.a.INSTANCE.f(e10, "Submit product feedback review SDK call timed out", new Object[0]);
                throw new ReviewException.Timeout("Submit product feedback review SDK call timed out", e10);
            }
        }
    }

    public a(k userManager, SharedPreferences sharedPreferences, BVConversationsClient bazaarVoiceClient, Hp.f fileFromUriUtil, Hp.d serviceToDomainMapper, BVSDK bvSdk, String bazaarVoiceSharedSecretKey, AbstractC15779K dispatcher) {
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
        return C15805i.g(this.dispatcher, new c(str, i10, i11, arrayList, bVar, this, null), continuation);
    }

    @Override // Kp.g
    public Object b(ProductReviewSubmitRequest productReviewSubmitRequest, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.dispatcher, new f(productReviewSubmitRequest, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    @Override // Kp.g
    public Object c(String str, int i10, Continuation<? super ProductReviewFullDetails> continuation) {
        return C15805i.g(this.dispatcher, new d(str, i10, this, null), continuation);
    }

    @Override // Kp.g
    public Object d(String str, Kp.a aVar, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.dispatcher, new e(str, aVar, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    @Override // Kp.g
    public Object e(List<String> list, Continuation<? super List<ProductRatings>> continuation) {
        return C15805i.g(this.dispatcher, new b(list, this, null), continuation);
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
