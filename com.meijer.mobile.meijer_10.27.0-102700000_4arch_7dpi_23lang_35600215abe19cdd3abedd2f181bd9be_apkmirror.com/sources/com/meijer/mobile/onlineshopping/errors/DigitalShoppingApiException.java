package com.meijer.mobile.onlineshopping.errors;

import com.squareup.moshi.t;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import so.C16989c;
import so.InterfaceC16987a;
import so.ServerError;
import uw.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00112\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0013B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u001b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001d¨\u0006\""}, d2 = {"Lcom/meijer/mobile/onlineshopping/errors/DigitalShoppingApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lso/a;", "details", "", "cause", "<init>", "(Lso/a;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "(Ljava/lang/Throwable;)Lcom/meijer/mobile/onlineshopping/errors/DigitalShoppingApiException;", "a", "Lso/a;", "e", "()Lso/a;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "", "getMessage", "()Ljava/lang/String;", "message", "d", "reason", "subject", "errors_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DigitalShoppingApiException extends RuntimeException implements InterfaceC16987a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16987a details;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/onlineshopping/errors/DigitalShoppingApiException$a;", "", "<init>", "()V", "", "json", "Lcom/squareup/moshi/t;", "moshi", "", "throwable", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "c", "(Ljava/lang/String;Lcom/squareup/moshi/t;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;", "b", "(Ljava/lang/String;Lcom/squareup/moshi/t;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "a", "(Ljava/lang/Throwable;Lcom/squareup/moshi/t;)Ljava/lang/Throwable;", "errors_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"com/meijer/mobile/onlineshopping/errors/DigitalShoppingApiException$a$a", "Lso/a;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "b", "getType", "type", "errors_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException$a$a, reason: collision with other inner class name */
        public static final class C1822a implements InterfaceC16987a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message = "An unknown error has occurred.";

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String type = "UnknownServerError";

            @Override // so.InterfaceC16987a
            public String getMessage() {
                return this.message;
            }

            C1822a() {
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final Throwable b(String json, t moshi, Throwable throwable) {
            ServerError c16988bA;
            ServerErrorJson serverErrorJson = (ServerErrorJson) moshi.c(ServerErrorJson.class).fromJson(json);
            if (serverErrorJson == null || (c16988bA = C16989c.a(serverErrorJson)) == null) {
                return null;
            }
            return c16988bA.c(throwable);
        }

        private final RuntimeException c(String json, t moshi, Throwable throwable) {
            List<DigitalShoppingApiError> list;
            Errors errors = (Errors) moshi.c(Errors.class).fromJson(json);
            List<DigitalShoppingApiError> listA = errors != null ? errors.a() : null;
            if (listA == null) {
                listA = CollectionsKt.m();
            }
            List<DigitalShoppingApiError> list2 = listA;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                list = null;
            } else {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.e(((DigitalShoppingApiError) it.next()).getType(), "ValidationError")) {
                        list = listA;
                        break;
                    }
                }
                list = null;
            }
            if (list != null) {
                return new ValidationErrors(list, throwable);
            }
            DigitalShoppingApiError digitalShoppingApiError = (DigitalShoppingApiError) CollectionsKt.u0(listA);
            if (digitalShoppingApiError != null) {
                return digitalShoppingApiError.c(throwable);
            }
            return null;
        }

        public final Throwable a(Throwable throwable, t moshi) {
            Object objB;
            HttpException httpException;
            Response<?> response;
            ResponseBody responseBodyErrorBody;
            Intrinsics.j(throwable, "throwable");
            Intrinsics.j(moshi, "moshi");
            try {
                httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
            } catch (IOException unused) {
            }
            String strString = (httpException == null || (response = httpException.response()) == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string();
            if (strString == null) {
                return throwable;
            }
            Companion companion = DigitalShoppingApiException.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Throwable thC = companion.c(strString, moshi, throwable);
                if (thC == null) {
                    thC = companion.b(strString, moshi, throwable);
                }
                objB = Result.b(thC);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                try {
                    a.INSTANCE.u(thE, "Unexpected error occurred while parsing a DigitalShoppingError", new Object[0]);
                    objB = Result.b(new C1822a().c(throwable));
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(th3));
                }
            }
            Throwable th4 = (Throwable) (Result.g(objB) ? null : objB);
            return th4 != null ? th4 : throwable;
        }
    }

    @Override // so.InterfaceC16987a
    /* renamed from: a */
    public String getSubject() {
        return this.details.getSubject();
    }

    @Override // so.InterfaceC16987a
    public DigitalShoppingApiException c(Throwable cause) {
        return this.details.c(cause);
    }

    @Override // so.InterfaceC16987a
    /* renamed from: d */
    public String getReason() {
        return this.details.getReason();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalShoppingApiException(InterfaceC16987a details, Throwable th2) {
        super(details.getMessage(), th2);
        Intrinsics.j(details, "details");
        this.details = details;
        this.cause = th2;
    }

    /* renamed from: e, reason: from getter */
    public final InterfaceC16987a getDetails() {
        return this.details;
    }

    public boolean equals(Object other) {
        if (!(other instanceof DigitalShoppingApiException)) {
            return false;
        }
        DigitalShoppingApiException digitalShoppingApiException = (DigitalShoppingApiException) other;
        if (!Intrinsics.e(this.details, digitalShoppingApiException.details)) {
            return false;
        }
        if (Intrinsics.e(getCause(), digitalShoppingApiException.getCause())) {
            return true;
        }
        if (getCause() == null || digitalShoppingApiException.getCause() == null) {
            return false;
        }
        return Intrinsics.e(getCause().getMessage(), digitalShoppingApiException.getCause().getMessage());
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable, so.InterfaceC16987a
    public String getMessage() {
        return this.details.getMessage();
    }

    public int hashCode() {
        int iHashCode = this.details.hashCode() * 31;
        Throwable cause = getCause();
        return ((iHashCode + (cause != null ? cause.hashCode() : 0)) * 31) + getMessage().hashCode();
    }
}
