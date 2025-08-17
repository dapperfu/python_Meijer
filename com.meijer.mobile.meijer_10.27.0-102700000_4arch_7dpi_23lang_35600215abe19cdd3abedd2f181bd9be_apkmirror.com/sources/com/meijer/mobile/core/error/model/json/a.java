package com.meijer.mobile.core.error.model.json;

import Xj.b;
import com.meijer.mobile.core.error.model.common.RestException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.InterfaceC15330g;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lretrofit2/HttpException;", "Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "a", "(Lretrofit2/HttpException;)Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "Lcom/meijer/mobile/core/error/model/common/RestException;", "b", "(Lretrofit2/HttpException;)Lcom/meijer/mobile/core/error/model/common/RestException;", "json_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class a {
    public static final StandardRestErrorBody a(HttpException httpException) {
        Object objB;
        Object objB2;
        StandardRestErrorBody standardRestErrorBody;
        ResponseBody responseBodyErrorBody;
        InterfaceC15330g source;
        C15328e c15328eE;
        C15328e c15328eClone;
        Intrinsics.j(httpException, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Response<?> response = httpException.response();
            objB = Result.b((response == null || (responseBodyErrorBody = response.errorBody()) == null || (source = responseBodyErrorBody.getSource()) == null || (c15328eE = source.e()) == null || (c15328eClone = c15328eE.clone()) == null) ? null : c15328eClone.n3());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.h(objB)) {
            try {
                String str = (String) objB;
                objB2 = Result.b((str == null || (standardRestErrorBody = (StandardRestErrorBody) StandardRestErrorBody.INSTANCE.a().c(StandardRestErrorBody.class).fromJson(str)) == null) ? null : StandardRestErrorBody.c(standardRestErrorBody, null, null, null, null, null, null, str, 63, null));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objB = ResultKt.a(th3);
            }
        } else {
            objB2 = Result.b(objB);
        }
        Throwable thE = Result.e(objB2);
        if (thE != null) {
            uw.a.INSTANCE.u(thE, "Failed to parse error body from HttpException", new Object[0]);
        }
        return (StandardRestErrorBody) (Result.g(objB2) ? null : objB2);
    }

    public static final RestException b(HttpException httpException) {
        b bVarA;
        Intrinsics.j(httpException, "<this>");
        StandardRestErrorBody standardRestErrorBodyA = a(httpException);
        if (standardRestErrorBodyA == null || (bVarA = Yj.b.a(standardRestErrorBodyA)) == null) {
            throw httpException;
        }
        return new RestException(bVarA, httpException);
    }
}
