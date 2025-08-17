package so;

import com.meijer.mobile.onlineshopping.errors.ServerErrorJson;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/onlineshopping/errors/ServerErrorJson;", "Lso/b;", "a", "(Lcom/meijer/mobile/onlineshopping/errors/ServerErrorJson;)Lso/b;", "errors_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: so.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16989c {
    public static final ServerError a(ServerErrorJson serverErrorJson) {
        Intrinsics.j(serverErrorJson, "<this>");
        return new ServerError((String) CollectionsKt.s0(CollectionsKt.r(serverErrorJson.getMessage(), serverErrorJson.getException(), serverErrorJson.getErrorMessage(), "An internal error occurred. Please contact IT support.")), serverErrorJson.getType());
    }
}
