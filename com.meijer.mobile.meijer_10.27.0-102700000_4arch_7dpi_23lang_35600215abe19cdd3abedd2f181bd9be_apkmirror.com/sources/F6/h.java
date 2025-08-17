package F6;

import com.apollographql.apollo.exception.DefaultApolloException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;
import kw.J;
import kw.K;
import kw.w;
import kw.z;
import z6.HttpHeader;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0003\u001a\u0015\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001c\u0010*\u001a\b\u0018\u00010(R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"LF6/h;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lkw/g;", "source", "", "boundary", "<init>", "(Lkw/g;Ljava/lang/String;)V", "", "maxResult", "g", "(J)J", "LF6/h$b;", "h", "()LF6/h$b;", "", "close", "()V", "a", "Lkw/g;", "b", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lkw/h;", "c", "Lkw/h;", "dashDashBoundary", "d", "crlfDashDashBoundary", "", "e", "I", "partCount", "", "f", "Z", "closed", "noMoreParts", "LF6/h$c;", "LF6/h$c;", "currentPart", "Lkw/z;", "i", "Lkw/z;", "afterBoundaryOptions", "j", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h implements Closeable {

    /* renamed from: j, reason: collision with root package name */
    private static final a f10285j = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String boundary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15331h dashDashBoundary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C15331h crlfDashDashBoundary;

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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LF6/h$a;", "", "<init>", "()V", "Lkw/g;", "source", "", "Lz6/f;", "b", "(Lkw/g;)Ljava/util/List;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<HttpHeader> b(InterfaceC15330g source) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String strH1 = source.h1();
                if (strH1.length() == 0) {
                    return arrayList;
                }
                int iO0 = StringsKt.o0(strH1, ':', 0, false, 6, null);
                if (iO0 == -1) {
                    throw new IllegalStateException(("Unexpected header: " + strH1).toString());
                }
                String strSubstring = strH1.substring(0, iO0);
                Intrinsics.i(strSubstring, "substring(...)");
                String string = StringsKt.y1(strSubstring).toString();
                String strSubstring2 = strH1.substring(iO0 + 1);
                Intrinsics.i(strSubstring2, "substring(...)");
                arrayList.add(new HttpHeader(string, StringsKt.y1(strSubstring2).toString()));
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"LF6/h$b;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "Lz6/f;", "headers", "Lkw/g;", "body", "<init>", "(Ljava/util/List;Lkw/g;)V", "", "close", "()V", "a", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "b", "Lkw/g;", "()Lkw/g;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15330g body;

        public b(List<HttpHeader> headers, InterfaceC15330g body) {
            Intrinsics.j(headers, "headers");
            Intrinsics.j(body, "body");
            this.headers = headers;
            this.body = body;
        }

        /* renamed from: a, reason: from getter */
        public final InterfaceC15330g getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LF6/h$c;", "Lkw/J;", "<init>", "(LF6/h;)V", "", "close", "()V", "Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "Lkw/K;", "timeout", "()Lkw/K;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private final class c implements J {
        public c() {
        }

        @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.e(h.this.currentPart, this)) {
                h.this.currentPart = null;
            }
        }

        @Override // kw.J
        public long read(C15328e sink, long byteCount) throws IOException {
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

        @Override // kw.J
        /* renamed from: timeout */
        public K getTimeout() {
            return h.this.source.getTimeout();
        }
    }

    public h(InterfaceC15330g source, String boundary) {
        Intrinsics.j(source, "source");
        Intrinsics.j(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new C15328e().I0("--").I0(boundary).Q2();
        this.crlfDashDashBoundary = new C15328e().I0("\r\n--").I0(boundary).Q2();
        z.Companion companion = z.INSTANCE;
        C15331h.Companion companion2 = C15331h.INSTANCE;
        this.afterBoundaryOptions = companion.d(companion2.d("\r\n--" + boundary + "--"), companion2.d("\r\n"), companion2.d("--"), companion2.d(" "), companion2.d("\t"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long g(long maxResult) throws IOException {
        this.source.B1(this.crlfDashDashBoundary.V());
        long jX0 = this.source.e().x0(this.crlfDashDashBoundary);
        return jX0 == -1 ? Math.min(maxResult, (this.source.e().getSize() - this.crlfDashDashBoundary.V()) + 1) : Math.min(maxResult, jX0);
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
        if (this.partCount == 0 && this.source.Y(0L, this.dashDashBoundary)) {
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
            int iU2 = this.source.U2(this.afterBoundaryOptions);
            if (iU2 == -1) {
                if (this.source.j2()) {
                    throw new DefaultApolloException("premature end of multipart body", null, 2, null);
                }
                throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
            }
            if (iU2 == 0) {
                if (this.partCount == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (iU2 == 1) {
                this.partCount++;
                List listB = f10285j.b(this.source);
                c cVar = new c();
                this.currentPart = cVar;
                return new b(listB, w.d(cVar));
            }
            if (iU2 == 2) {
                if (z10) {
                    throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (this.partCount == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (iU2 == 3 || iU2 == 4) {
                z10 = true;
            }
        }
    }
}
