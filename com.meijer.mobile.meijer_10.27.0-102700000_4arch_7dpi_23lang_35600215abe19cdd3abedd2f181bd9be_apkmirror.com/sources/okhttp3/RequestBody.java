package okhttp3;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.AbstractC15335l;
import kw.B;
import kw.C15331h;
import kw.InterfaceC15329f;
import kw.J;
import kw.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Lkw/f;", "sink", "", "writeTo", "(Lkw/f;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @JvmField
    public static final RequestBody EMPTY;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\u00020\u0007*\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u0007*\u00020\u00162\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010\"J5\u0010#\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0016H\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lokhttp3/RequestBody$a;", "", "<init>", "()V", "", "Lokhttp3/j;", "contentType", "Lokhttp3/RequestBody;", "c", "(Ljava/lang/String;Lokhttp3/j;)Lokhttp3/RequestBody;", "Lkw/h;", "d", "(Lkw/h;Lokhttp3/j;)Lokhttp3/RequestBody;", "Ljava/io/FileDescriptor;", "b", "(Ljava/io/FileDescriptor;Lokhttp3/j;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "o", "([BLokhttp3/j;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "a", "(Ljava/io/File;Lokhttp3/j;)Lokhttp3/RequestBody;", "Lkw/B;", "Lkw/l;", "fileSystem", "e", "(Lkw/B;Lkw/l;Lokhttp3/j;)Lokhttp3/RequestBody;", "content", "g", "(Lokhttp3/j;Ljava/lang/String;)Lokhttp3/RequestBody;", "h", "(Lokhttp3/j;Lkw/h;)Lokhttp3/RequestBody;", "k", "(Lokhttp3/j;[BII)Lokhttp3/RequestBody;", "file", "f", "(Lokhttp3/j;Ljava/io/File;)Lokhttp3/RequestBody;", "EMPTY", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.RequestBody$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/RequestBody$a$a", "Lokhttp3/RequestBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Lkw/f;", "sink", "", "writeTo", "(Lkw/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: okhttp3.RequestBody$a$a, reason: collision with other inner class name */
        public static final class C2393a extends RequestBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f154101a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f154102b;

            C2393a(j jVar, File file) {
                this.f154101a = jVar;
                this.f154102b = file;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f154102b.length();
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType, reason: from getter */
            public j getF154110a() {
                return this.f154101a;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC15329f sink) throws FileNotFoundException {
                Intrinsics.j(sink, "sink");
                J j10 = w.j(this.f154102b);
                try {
                    sink.G0(j10);
                    CloseableKt.a(j10, null);
                } finally {
                }
            }
        }

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/RequestBody$a$b", "Lokhttp3/RequestBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Lkw/f;", "sink", "", "writeTo", "(Lkw/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: okhttp3.RequestBody$a$b */
        public static final class b extends RequestBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f154103a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC15335l f154104b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ B f154105c;

            b(j jVar, AbstractC15335l abstractC15335l, B b10) {
                this.f154103a = jVar;
                this.f154104b = abstractC15335l;
                this.f154105c = b10;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                Long lC = this.f154104b.u(this.f154105c).getSize();
                if (lC != null) {
                    return lC.longValue();
                }
                return -1L;
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType, reason: from getter */
            public j getF154110a() {
                return this.f154103a;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC15329f sink) throws IOException {
                Intrinsics.j(sink, "sink");
                J jD = this.f154104b.D(this.f154105c);
                try {
                    sink.G0(jD);
                    CloseableKt.a(jD, null);
                } finally {
                }
            }
        }

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/RequestBody$a$c", "Lokhttp3/RequestBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Lkw/f;", "sink", "", "writeTo", "(Lkw/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: okhttp3.RequestBody$a$c */
        public static final class c extends RequestBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f154106a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15331h f154107b;

            c(j jVar, C15331h c15331h) {
                this.f154106a = jVar;
                this.f154107b = c15331h;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f154107b.V();
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType, reason: from getter */
            public j getF154110a() {
                return this.f154106a;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC15329f sink) throws IOException {
                Intrinsics.j(sink, "sink");
                sink.Z2(this.f154107b);
            }
        }

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/RequestBody$a$d", "Lokhttp3/RequestBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "isOneShot", "()Z", "Lkw/f;", "sink", "", "writeTo", "(Lkw/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: okhttp3.RequestBody$a$d */
        public static final class d extends RequestBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f154108a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileDescriptor f154109b;

            @Override // okhttp3.RequestBody
            public boolean isOneShot() {
                return true;
            }

            d(j jVar, FileDescriptor fileDescriptor) {
                this.f154108a = jVar;
                this.f154109b = fileDescriptor;
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType, reason: from getter */
            public j getF154110a() {
                return this.f154108a;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC15329f sink) {
                Intrinsics.j(sink, "sink");
                FileInputStream fileInputStream = new FileInputStream(this.f154109b);
                try {
                    sink.e().G0(w.k(fileInputStream));
                    CloseableKt.a(fileInputStream, null);
                } finally {
                }
            }
        }

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/RequestBody$a$e", "Lokhttp3/RequestBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Lkw/f;", "sink", "", "writeTo", "(Lkw/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: okhttp3.RequestBody$a$e */
        public static final class e extends RequestBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f154110a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f154111b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f154112c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f154113d;

            e(j jVar, int i10, byte[] bArr, int i11) {
                this.f154110a = jVar;
                this.f154111b = i10;
                this.f154112c = bArr;
                this.f154113d = i11;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f154111b;
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType, reason: from getter */
            public j getF154110a() {
                return this.f154110a;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC15329f sink) throws IOException {
                Intrinsics.j(sink, "sink");
                sink.write(this.f154112c, this.f154113d, this.f154111b);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        @JvmStatic
        @JvmOverloads
        public final RequestBody i(j jVar, byte[] content) {
            Intrinsics.j(content, "content");
            return r(this, jVar, content, 0, 0, 12, null);
        }

        @Deprecated
        @JvmStatic
        @JvmOverloads
        public final RequestBody j(j jVar, byte[] content, int i10) {
            Intrinsics.j(content, "content");
            return r(this, jVar, content, i10, 0, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        @JvmName
        public final RequestBody l(byte[] bArr) {
            Intrinsics.j(bArr, "<this>");
            return s(this, bArr, null, 0, 0, 7, null);
        }

        @JvmStatic
        @JvmOverloads
        @JvmName
        public final RequestBody m(byte[] bArr, j jVar) {
            Intrinsics.j(bArr, "<this>");
            return s(this, bArr, jVar, 0, 0, 6, null);
        }

        @JvmStatic
        @JvmOverloads
        @JvmName
        public final RequestBody n(byte[] bArr, j jVar, int i10) {
            Intrinsics.j(bArr, "<this>");
            return s(this, bArr, jVar, i10, 0, 4, null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody p(Companion companion, String str, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = null;
            }
            return companion.c(str, jVar);
        }

        public static /* synthetic */ RequestBody q(Companion companion, C15331h c15331h, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = null;
            }
            return companion.d(c15331h, jVar);
        }

        public static /* synthetic */ RequestBody r(Companion companion, j jVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.k(jVar, bArr, i10, i11);
        }

        public static /* synthetic */ RequestBody s(Companion companion, byte[] bArr, j jVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                jVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.o(bArr, jVar, i10, i11);
        }

        @JvmStatic
        @JvmName
        public final RequestBody a(File file, j jVar) {
            Intrinsics.j(file, "<this>");
            return new C2393a(jVar, file);
        }

        @JvmStatic
        @JvmName
        public final RequestBody b(FileDescriptor fileDescriptor, j jVar) {
            Intrinsics.j(fileDescriptor, "<this>");
            return new d(jVar, fileDescriptor);
        }

        @JvmStatic
        @JvmName
        public final RequestBody c(String str, j jVar) {
            Intrinsics.j(str, "<this>");
            Pair<Charset, j> pairB = Rv.a.b(jVar);
            Charset charsetA = pairB.a();
            j jVarB = pairB.b();
            byte[] bytes = str.getBytes(charsetA);
            Intrinsics.i(bytes, "getBytes(...)");
            return o(bytes, jVarB, 0, bytes.length);
        }

        @JvmStatic
        @JvmName
        public final RequestBody d(C15331h c15331h, j jVar) {
            Intrinsics.j(c15331h, "<this>");
            return new c(jVar, c15331h);
        }

        @JvmStatic
        @JvmName
        public final RequestBody e(B b10, AbstractC15335l fileSystem, j jVar) {
            Intrinsics.j(b10, "<this>");
            Intrinsics.j(fileSystem, "fileSystem");
            return new b(jVar, fileSystem, b10);
        }

        @Deprecated
        @JvmStatic
        public final RequestBody f(j contentType, File file) {
            Intrinsics.j(file, "file");
            return a(file, contentType);
        }

        @Deprecated
        @JvmStatic
        public final RequestBody g(j contentType, String content) {
            Intrinsics.j(content, "content");
            return c(content, contentType);
        }

        @Deprecated
        @JvmStatic
        public final RequestBody h(j contentType, C15331h content) {
            Intrinsics.j(content, "content");
            return d(content, contentType);
        }

        @Deprecated
        @JvmStatic
        @JvmOverloads
        public final RequestBody k(j contentType, byte[] content, int offset, int byteCount) {
            Intrinsics.j(content, "content");
            return o(content, contentType, offset, byteCount);
        }

        @JvmStatic
        @JvmOverloads
        @JvmName
        public final RequestBody o(byte[] bArr, j jVar, int i10, int i11) {
            Intrinsics.j(bArr, "<this>");
            Rv.h.e(bArr.length, i10, i11);
            return new e(jVar, i11, bArr, i10);
        }
    }

    @JvmStatic
    @JvmName
    public static final RequestBody create(File file, j jVar) {
        return INSTANCE.a(file, jVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    /* renamed from: contentType */
    public abstract j getF154110a();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC15329f sink) throws IOException;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.q(companion, C15331h.f148095e, null, 1, null);
    }

    @JvmStatic
    @JvmName
    public static final RequestBody create(FileDescriptor fileDescriptor, j jVar) {
        return INSTANCE.b(fileDescriptor, jVar);
    }

    @JvmStatic
    @JvmName
    public static final RequestBody create(String str, j jVar) {
        return INSTANCE.c(str, jVar);
    }

    @JvmStatic
    @JvmName
    public static final RequestBody create(C15331h c15331h, j jVar) {
        return INSTANCE.d(c15331h, jVar);
    }

    @JvmStatic
    @JvmName
    public static final RequestBody create(B b10, AbstractC15335l abstractC15335l, j jVar) {
        return INSTANCE.e(b10, abstractC15335l, jVar);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(j jVar, File file) {
        return INSTANCE.f(jVar, file);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(j jVar, String str) {
        return INSTANCE.g(jVar, str);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(j jVar, C15331h c15331h) {
        return INSTANCE.h(jVar, c15331h);
    }

    @Deprecated
    @JvmStatic
    @JvmOverloads
    public static final RequestBody create(j jVar, byte[] bArr) {
        return INSTANCE.i(jVar, bArr);
    }

    @Deprecated
    @JvmStatic
    @JvmOverloads
    public static final RequestBody create(j jVar, byte[] bArr, int i10) {
        return INSTANCE.j(jVar, bArr, i10);
    }

    @Deprecated
    @JvmStatic
    @JvmOverloads
    public static final RequestBody create(j jVar, byte[] bArr, int i10, int i11) {
        return INSTANCE.k(jVar, bArr, i10, i11);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName
    public static final RequestBody create(byte[] bArr) {
        return INSTANCE.l(bArr);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName
    public static final RequestBody create(byte[] bArr, j jVar) {
        return INSTANCE.m(bArr, jVar);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName
    public static final RequestBody create(byte[] bArr, j jVar, int i10) {
        return INSTANCE.n(bArr, jVar, i10);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName
    public static final RequestBody create(byte[] bArr, j jVar, int i10, int i11) {
        return INSTANCE.o(bArr, jVar, i10, i11);
    }
}
