package com.meijer.mobile.core.error.model.json;

import Yj.b;
import com.meijer.mobile.core.error.model.common.RestException;
import gw.C14416e;
import gw.InterfaceC14418g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lretrofit2/HttpException;", "Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "a", "(Lretrofit2/HttpException;)Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "Lcom/meijer/mobile/core/error/model/common/RestException;", "b", "(Lretrofit2/HttpException;)Lcom/meijer/mobile/core/error/model/common/RestException;", "json_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class a {
    public static final StandardRestErrorBody a(HttpException httpException) {
        Object objB;
        Object objB2;
        StandardRestErrorBody standardRestErrorBody;
        ResponseBody responseBodyErrorBody;
        InterfaceC14418g bodySource;
        C14416e c14416eE;
        C14416e c14416eClone;
        Intrinsics.j(httpException, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Response<?> response = httpException.response();
            objB = Result.b((response == null || (responseBodyErrorBody = response.errorBody()) == null || (bodySource = responseBodyErrorBody.getBodySource()) == null || (c14416eE = bodySource.e()) == null || (c14416eClone = c14416eE.clone()) == null) ? null : c14416eClone.n3());
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
            qw.a.INSTANCE.u(thE, "Failed to parse error body from HttpException", new Object[0]);
        }
        return (StandardRestErrorBody) (Result.g(objB2) ? null : objB2);
    }

    public static final RestException b(HttpException httpException) {
        b bVarA;
        Intrinsics.j(httpException, "<this>");
        StandardRestErrorBody standardRestErrorBodyA = a(httpException);
        if (standardRestErrorBodyA == null || (bVarA = Zj.b.a(standardRestErrorBodyA)) == null) {
            throw httpException;
        }
        return new RestException(bVarA, httpException);
    }
}
