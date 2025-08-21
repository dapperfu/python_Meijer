package Sv;

import Mv.t;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"LSv/b;", "Lokhttp3/Interceptor;", "", "forWebSocket", "<init>", "(Z)V", "", "code", "LRv/i;", "exchange", "a", "(ILRv/i;)Z", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Sv/b$a", "LMv/t;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements t {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rv.i f35810c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ResponseBody f35811d;

        a(Rv.i iVar, ResponseBody responseBody) {
            this.f35810c = iVar;
            this.f35811d = responseBody;
        }
    }

    private final boolean a(int code, Rv.i exchange) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:45:0x00df, B:47:0x00e5, B:49:0x00ee, B:50:0x00f1, B:51:0x0116, B:55:0x0121, B:57:0x013f, B:59:0x014d, B:66:0x0163, B:69:0x0172, B:70:0x0198, B:61:0x0158, B:56:0x0126), top: B:81:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:45:0x00df, B:47:0x00e5, B:49:0x00ee, B:50:0x00f1, B:51:0x0116, B:55:0x0121, B:57:0x013f, B:59:0x014d, B:66:0x0163, B:69:0x0172, B:70:0x0198, B:61:0x0158, B:56:0x0126), top: B:81:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:39:0x00aa, B:41:0x00b3, B:44:0x00bb, B:45:0x00df, B:47:0x00e5, B:49:0x00ee, B:50:0x00f1, B:51:0x0116, B:55:0x0121, B:57:0x013f, B:59:0x014d, B:66:0x0163, B:69:0x0172, B:70:0x0198, B:61:0x0158, B:56:0x0126), top: B:81:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sv.b.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public b(boolean z10) {
        this.forWebSocket = z10;
    }
}
