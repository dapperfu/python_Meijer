package f6;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lf6/b;", "", "<init>", "()V", "", "b", "[I", "()[I", "RECOVERABLE_ERROR_CODES", "c", "a", "HTTP_SUCCESS_CODES", "signal_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: f6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13956b {

    /* renamed from: a, reason: collision with root package name */
    public static final C13956b f131598a = new C13956b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int[] RECOVERABLE_ERROR_CODES = {HttpResponseStatus.ERROR_REQUEST_TIMEOUT, HttpResponseStatus.ERROR_GATEWAY_TIMEOUT, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE};

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int[] HTTP_SUCCESS_CODES = CollectionsKt.i1(CollectionsKt.j1(new IntRange(HttpResponseStatus.SUCCESS_OK, 299)));

    public final int[] a() {
        return HTTP_SUCCESS_CODES;
    }

    public final int[] b() {
        return RECOVERABLE_ERROR_CODES;
    }

    private C13956b() {
    }
}
