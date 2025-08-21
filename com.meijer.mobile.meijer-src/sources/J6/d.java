package J6;

import A6.HttpHeader;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z6.w;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"LJ6/d;", "Lz6/w$b;", "", "startMillis", "endMillis", "", "statusCode", "", "LA6/f;", "headers", "<init>", "(JJILjava/util/List;)V", "c", "J", "getStartMillis", "()J", "d", "getEndMillis", "e", "I", "getStatusCode", "()I", "f", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "Lz6/w$c;", "getKey", "()Lz6/w$c;", "key", "g", "a", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements w.b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long startMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long endMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LJ6/d$a;", "Lz6/w$c;", "LJ6/d;", "<init>", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J6.d$a, reason: from kotlin metadata */
    public static final class Companion implements w.c<d> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Deprecated
    public d(long j10, long j11, int i10, List<HttpHeader> headers) {
        Intrinsics.j(headers, "headers");
        this.startMillis = j10;
        this.endMillis = j11;
        this.statusCode = i10;
        this.headers = headers;
    }

    @Override // z6.w.b
    public w.c<?> getKey() {
        return INSTANCE;
    }
}
