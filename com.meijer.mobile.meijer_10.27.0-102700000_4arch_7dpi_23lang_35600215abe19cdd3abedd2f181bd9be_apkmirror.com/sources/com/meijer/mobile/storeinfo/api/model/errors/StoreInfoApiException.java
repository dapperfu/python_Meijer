package com.meijer.mobile.storeinfo.api.model.errors;

import ar.C6145a;
import ar.InterfaceC6146b;
import com.squareup.moshi.t;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\tB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lar/b;", "details", "", "cause", "<init>", "(Lar/b;Ljava/lang/Throwable;)V", "a", "Lar/b;", "getDetails", "()Lar/b;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "", "getMessage", "()Ljava/lang/String;", "message", "c", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StoreInfoApiException extends RuntimeException implements InterfaceC6146b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6146b details;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiException$a;", "", "<init>", "()V", "", "throwable", "Lcom/squareup/moshi/t;", "moshi", "a", "(Ljava/lang/Throwable;Lcom/squareup/moshi/t;)Ljava/lang/Throwable;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.storeinfo.api.model.errors.StoreInfoApiException$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Throwable a(Throwable throwable, t moshi) {
            List<StoreInfoApiError> list;
            HttpException httpException;
            Response<?> response;
            ResponseBody responseBodyErrorBody;
            Intrinsics.j(throwable, "throwable");
            Intrinsics.j(moshi, "moshi");
            Throwable thA = null;
            try {
                httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
            } catch (IOException unused) {
            }
            String strString = (httpException == null || (response = httpException.response()) == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string();
            if (strString == null) {
                return throwable;
            }
            Errors errors = (Errors) moshi.c(Errors.class).fromJson(strString);
            List<StoreInfoApiError> listA = errors != null ? errors.a() : null;
            if (listA == null) {
                listA = CollectionsKt.m();
            }
            List<StoreInfoApiError> list2 = listA;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                list = null;
            } else {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.e(((StoreInfoApiError) it.next()).getType(), "ValidationError")) {
                        list = listA;
                        break;
                    }
                }
                list = null;
            }
            if (list != null) {
                thA = new ValidationErrors(list, throwable);
            } else {
                StoreInfoApiError storeInfoApiError = (StoreInfoApiError) CollectionsKt.u0(listA);
                if (storeInfoApiError != null) {
                    thA = C6145a.a(storeInfoApiError, throwable);
                }
            }
            return thA != null ? thA : throwable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreInfoApiException(InterfaceC6146b details, Throwable th2) {
        super(details.getMessage(), th2);
        Intrinsics.j(details, "details");
        this.details = details;
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable, ar.InterfaceC6146b
    public String getMessage() {
        return this.details.getMessage();
    }
}
