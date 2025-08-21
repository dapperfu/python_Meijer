package com.meijer.mobile.digitalshopping.api.orders;

import com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableResponse;
import com.squareup.moshi.t;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\tB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/OrderStatusCheckException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "details", "", "cause", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;Ljava/lang/Throwable;)V", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "getDetails", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "c", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OrderStatusCheckException extends RuntimeException {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OrderIsEditCancelableResponse details;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/OrderStatusCheckException$a;", "", "<init>", "()V", "", "throwable", "Lcom/squareup/moshi/t;", "moshi", "a", "(Ljava/lang/Throwable;Lcom/squareup/moshi/t;)Ljava/lang/Throwable;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.digitalshopping.api.orders.OrderStatusCheckException$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Throwable a(Throwable throwable, t moshi) {
            Response<?> response;
            ResponseBody responseBodyErrorBody;
            Intrinsics.j(throwable, "throwable");
            Intrinsics.j(moshi, "moshi");
            String strString = null;
            try {
                HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                if (httpException != null && (response = httpException.response()) != null && (responseBodyErrorBody = response.errorBody()) != null) {
                    strString = responseBodyErrorBody.string();
                }
            } catch (IOException unused) {
            }
            if (strString == null) {
                return throwable;
            }
            OrderIsEditCancelableResponse orderIsEditCancelableResponse = (OrderIsEditCancelableResponse) moshi.c(OrderIsEditCancelableResponse.class).fromJson(strString);
            if (orderIsEditCancelableResponse == null) {
                orderIsEditCancelableResponse = new OrderIsEditCancelableResponse("", "Unable to retrieve is editable or is cancelable status", false);
            }
            return new OrderStatusCheckException(orderIsEditCancelableResponse, throwable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusCheckException(OrderIsEditCancelableResponse details, Throwable th2) {
        super(details.getMessage(), th2);
        Intrinsics.j(details, "details");
        this.details = details;
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
