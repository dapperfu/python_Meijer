package G6;

import A6.HttpHeader;
import com.apollographql.apollo.exception.DefaultApolloException;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14418g;
import gw.K;
import gw.L;
import gw.w;
import gw.z;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0003\u001a\u0015\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001c\u0010*\u001a\b\u0018\u00010(R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"LG6/h;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lgw/g;", "source", "", "boundary", "<init>", "(Lgw/g;Ljava/lang/String;)V", "", "maxResult", "g", "(J)J", "LG6/h$b;", "h", "()LG6/h$b;", "", "close", "()V", "a", "Lgw/g;", "b", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lgw/h;", "c", "Lgw/h;", "dashDashBoundary", "d", "crlfDashDashBoundary", "", "e", "I", "partCount", "", "f", "Z", "closed", "noMoreParts", "LG6/h$c;", "LG6/h$c;", "currentPart", "Lgw/z;", "i", "Lgw/z;", "afterBoundaryOptions", "j", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h implements Closeable {

    /* renamed from: j, reason: collision with root package name */
    private static final a f11206j = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14418g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String boundary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14419h dashDashBoundary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C14419h crlfDashDashBoundary;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int partCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean noMoreParts;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private c currentPart;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final z afterBoundaryOptions;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LG6/h$a;", "", "<init>", "()V", "Lgw/g;", "source", "", "LA6/f;", "b", "(Lgw/g;)Ljava/util/List;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<HttpHeader> b(InterfaceC14418g source) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String strI1 = source.i1();
                if (strI1.length() == 0) {
                    return arrayList;
                }
                int iP0 = StringsKt.p0(strI1, ':', 0, false, 6, null);
                if (iP0 == -1) {
                    throw new IllegalStateException(("Unexpected header: " + strI1).toString());
                }
                String strSubstring = strI1.substring(0, iP0);
                Intrinsics.i(strSubstring, "substring(...)");
                String string = StringsKt.C1(strSubstring).toString();
                String strSubstring2 = strI1.substring(iP0 + 1);
                Intrinsics.i(strSubstring2, "substring(...)");
                arrayList.add(new HttpHeader(string, StringsKt.C1(strSubstring2).toString()));
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"LG6/h$b;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "LA6/f;", "headers", "Lgw/g;", "body", "<init>", "(Ljava/util/List;Lgw/g;)V", "", "close", "()V", "a", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "b", "Lgw/g;", "()Lgw/g;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC14418g body;

        public b(List<HttpHeader> headers, InterfaceC14418g body) {
            Intrinsics.j(headers, "headers");
            Intrinsics.j(body, "body");
            this.headers = headers;
            this.body = body;
        }

        /* renamed from: a, reason: from getter */
        public final InterfaceC14418g getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LG6/h$c;", "Lgw/K;", "<init>", "(LG6/h;)V", "", "close", "()V", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "Lgw/L;", "timeout", "()Lgw/L;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private final class c implements K {
        public c() {
        }

        @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.e(h.this.currentPart, this)) {
                h.this.currentPart = null;
            }
        }

        @Override // gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!Intrinsics.e(h.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            long jG = h.this.g(byteCount);
            if (jG == 0) {
                return -1L;
            }
            return h.this.source.read(sink, jG);
        }

        @Override // gw.K
        /* renamed from: timeout */
        public L getTimeout() {
            return h.this.source.getTimeout();
        }
    }

    public h(InterfaceC14418g source, String boundary) {
        Intrinsics.j(source, "source");
        Intrinsics.j(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new C14416e().G0("--").G0(boundary).P2();
        this.crlfDashDashBoundary = new C14416e().G0("\r\n--").G0(boundary).P2();
        z.Companion companion = z.INSTANCE;
        C14419h.Companion companion2 = C14419h.INSTANCE;
        this.afterBoundaryOptions = companion.d(companion2.d("\r\n--" + boundary + "--"), companion2.d("\r\n"), companion2.d("--"), companion2.d(" "), companion2.d("\t"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long g(long maxResult) throws IOException {
        this.source.C1(this.crlfDashDashBoundary.V());
        long jO1 = this.source.e().o1(this.crlfDashDashBoundary);
        return jO1 == -1 ? Math.min(maxResult, (this.source.e().getSize() - this.crlfDashDashBoundary.V()) + 1) : Math.min(maxResult, jO1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final b h() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.d0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.V());
        } else {
            while (true) {
                long jG = g(8192L);
                if (jG == 0) {
                    break;
                }
                this.source.skip(jG);
            }
            this.source.skip(this.crlfDashDashBoundary.V());
        }
        boolean z10 = false;
        while (true) {
            int iI2 = this.source.I2(this.afterBoundaryOptions);
            if (iI2 == -1) {
                if (this.source.i2()) {
                    throw new DefaultApolloException("premature end of multipart body", null, 2, null);
                }
                throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
            }
            if (iI2 == 0) {
                if (this.partCount == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (iI2 == 1) {
                this.partCount++;
                List listB = f11206j.b(this.source);
                c cVar = new c();
                this.currentPart = cVar;
                return new b(listB, w.c(cVar));
            }
            if (iI2 == 2) {
                if (z10) {
                    throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (this.partCount == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (iI2 == 3 || iI2 == 4) {
                z10 = true;
            }
        }
    }
}
