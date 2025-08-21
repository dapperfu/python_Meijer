package L9;

import D9.ResponseModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"LL9/j;", "LL9/e;", "LD9/c;", "responseModel", "", "inDatabaseTimeEnd", "LA9/c;", "updatedRequestModel", "<init>", "(LD9/c;JLA9/c;)V", "", "", "", "a", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "()Ljava/lang/String;", "topic", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> data;

    public j(ResponseModel responseModel, long j10, A9.c cVar) {
        Intrinsics.j(responseModel, "responseModel");
        A9.c requestModel = responseModel.getRequestModel();
        long timestamp = requestModel.getTimestamp();
        long timestamp2 = responseModel.getTimestamp();
        this.data = MapsKt.r(TuplesKt.a("requestId", requestModel.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()), TuplesKt.a("url", requestModel.getUrl()), TuplesKt.a("statusCode", Integer.valueOf(responseModel.getStatusCode())), TuplesKt.a("inDbStart", Long.valueOf(timestamp)), TuplesKt.a("inDbEnd", Long.valueOf(j10)), TuplesKt.a("inDbDuration", Long.valueOf(j10 - timestamp)), TuplesKt.a("networkingStart", Long.valueOf(j10)), TuplesKt.a("networkingEnd", Long.valueOf(timestamp2)), TuplesKt.a("networkingDuration", Long.valueOf(timestamp2 - j10)));
        if (cVar != null) {
            getData().put("header", cVar.a().toString());
            getData().put("payload", String.valueOf(cVar.d()));
        }
    }

    @Override // L9.e
    public String a() {
        return "log_request";
    }

    @Override // L9.e
    public Map<String, Object> getData() {
        return this.data;
    }

    public /* synthetic */ j(ResponseModel responseModel, long j10, A9.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(responseModel, j10, (i10 & 4) != 0 ? null : cVar);
    }
}
