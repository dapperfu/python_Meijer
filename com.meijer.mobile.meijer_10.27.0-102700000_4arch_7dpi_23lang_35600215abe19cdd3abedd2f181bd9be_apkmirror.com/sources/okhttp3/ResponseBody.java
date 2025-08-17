package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lkw/g;", "consumer", "", "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lkw/g;", "", "bytes", "()[B", "Lkw/h;", "byteString", "()Lkw/h;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "a", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @JvmField
    public static final ResponseBody EMPTY;
    private Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/ResponseBody$a;", "Ljava/io/Reader;", "Lkw/g;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lkw/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "", "close", "()V", "a", "Lkw/g;", "b", "Ljava/nio/charset/Charset;", "", "c", "Z", "closed", "d", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15330g source;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Reader delegate;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        public a(InterfaceC15330g source, Charset charset) {
            Intrinsics.j(source, "source");
            Intrinsics.j(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            Intrinsics.j(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.T3(), Rv.k.n(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/ResponseBody$b;", "", "<init>", "()V", "", "Lokhttp3/j;", "contentType", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lokhttp3/j;)Lokhttp3/ResponseBody;", "", "h", "([BLokhttp3/j;)Lokhttp3/ResponseBody;", "Lkw/h;", "c", "(Lkw/h;Lokhttp3/j;)Lokhttp3/ResponseBody;", "Lkw/g;", "", "contentLength", "b", "(Lkw/g;Lokhttp3/j;J)Lokhttp3/ResponseBody;", "content", "e", "(Lokhttp3/j;Ljava/lang/String;)Lokhttp3/ResponseBody;", "g", "(Lokhttp3/j;[B)Lokhttp3/ResponseBody;", "f", "(Lokhttp3/j;Lkw/h;)Lokhttp3/ResponseBody;", "d", "(Lokhttp3/j;JLkw/g;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.ResponseBody$b, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"okhttp3/ResponseBody$b$a", "Lokhttp3/ResponseBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Lkw/g;", "source", "()Lkw/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: okhttp3.ResponseBody$b$a */
        public static final class a extends ResponseBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f154149a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f154150b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15330g f154151c;

            a(j jVar, long j10, InterfaceC15330g interfaceC15330g) {
                this.f154149a = jVar;
                this.f154150b = j10;
                this.f154151c = interfaceC15330g;
            }

            @Override // okhttp3.ResponseBody
            /* renamed from: contentLength, reason: from getter */
            public long getF154150b() {
                return this.f154150b;
            }

            @Override // okhttp3.ResponseBody
            /* renamed from: contentType, reason: from getter */
            public j getF154149a() {
                return this.f154149a;
            }

            @Override // okhttp3.ResponseBody
            /* renamed from: source, reason: from getter */
            public InterfaceC15330g getF154151c() {
                return this.f154151c;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody i(Companion companion, String str, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = null;
            }
            return companion.a(str, jVar);
        }

        public static /* synthetic */ ResponseBody j(Companion companion, C15331h c15331h, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = null;
            }
            return companion.c(c15331h, jVar);
        }

        @JvmStatic
        @JvmName
        public final ResponseBody a(String str, j jVar) {
            Intrinsics.j(str, "<this>");
            Pair<Charset, j> pairB = Rv.a.b(jVar);
            Charset charsetA = pairB.a();
            j jVarB = pairB.b();
            C15328e c15328eL0 = new C15328e().L0(str, charsetA);
            return b(c15328eL0, jVarB, c15328eL0.getSize());
        }

        @JvmStatic
        @JvmName
        public final ResponseBody b(InterfaceC15330g interfaceC15330g, j jVar, long j10) {
            Intrinsics.j(interfaceC15330g, "<this>");
            return new a(jVar, j10, interfaceC15330g);
        }

        @JvmStatic
        @JvmName
        public final ResponseBody c(C15331h c15331h, j jVar) {
            Intrinsics.j(c15331h, "<this>");
            return b(new C15328e().Z2(c15331h), jVar, c15331h.V());
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody d(j contentType, long contentLength, InterfaceC15330g content) {
            Intrinsics.j(content, "content");
            return b(content, contentType, contentLength);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody e(j contentType, String content) {
            Intrinsics.j(content, "content");
            return a(content, contentType);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody f(j contentType, C15331h content) {
            Intrinsics.j(content, "content");
            return c(content, contentType);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody g(j contentType, byte[] content) {
            Intrinsics.j(content, "content");
            return h(content, contentType);
        }

        @JvmStatic
        @JvmName
        public final ResponseBody h(byte[] bArr, j jVar) {
            Intrinsics.j(bArr, "<this>");
            return b(new C15328e().write(bArr), jVar, bArr.length);
        }
    }

    @JvmStatic
    @JvmName
    public static final ResponseBody create(String str, j jVar) {
        return INSTANCE.a(str, jVar);
    }

    /* renamed from: contentLength */
    public abstract long getF154150b();

    /* renamed from: contentType */
    public abstract j getF154149a();

    /* renamed from: source */
    public abstract InterfaceC15330g getF154151c();

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.j(companion, C15331h.f148095e, null, 1, null);
    }

    @JvmStatic
    @JvmName
    public static final ResponseBody create(InterfaceC15330g interfaceC15330g, j jVar, long j10) {
        return INSTANCE.b(interfaceC15330g, jVar, j10);
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getF154151c(), charset());
        this.reader = aVar;
        return aVar;
    }

    private final Charset charset() {
        return Rv.a.a(getF154149a());
    }

    private final <T> T consumeSource(ResponseBody responseBody, Function1<? super InterfaceC15330g, ? extends T> function1, Function1<? super T, Integer> function12) throws Throwable {
        Object obj;
        long f154150b = responseBody.getF154150b();
        if (f154150b <= 2147483647L) {
            InterfaceC15330g f154151c = responseBody.getF154151c();
            Throwable th2 = (Object) null;
            try {
                T tInvoke = function1.invoke(f154151c);
                InlineMarker.b(1);
                Throwable th3 = th2;
                if (f154151c != null) {
                    try {
                        f154151c.close();
                        th3 = th2;
                    } catch (Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        this = this;
                        long r0 = r6.getF154150b()
                        r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                        int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r2 > 0) goto L75
                        kw.g r6 = r6.getF154151c()
                        r2 = 0
                        r3 = 1
                        java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L26
                        kotlin.jvm.internal.InlineMarker.b(r3)
                        if (r6 == 0) goto L1f
                        r6.close()     // Catch: java.lang.Throwable -> L1e
                        goto L1f
                    L1e:
                        r2 = move-exception
                    L1f:
                        kotlin.jvm.internal.InlineMarker.a(r3)
                        r4 = r2
                        r2 = r7
                        r7 = r4
                        goto L37
                    L26:
                        r7 = move-exception
                        kotlin.jvm.internal.InlineMarker.b(r3)
                        if (r6 == 0) goto L34
                        r6.close()     // Catch: java.lang.Throwable -> L30
                        goto L34
                    L30:
                        r6 = move-exception
                        kotlin.ExceptionsKt.a(r7, r6)
                    L34:
                        kotlin.jvm.internal.InlineMarker.a(r3)
                    L37:
                        if (r7 != 0) goto L74
                        java.lang.Object r6 = r8.invoke(r2)
                        java.lang.Number r6 = (java.lang.Number) r6
                        int r6 = r6.intValue()
                        r7 = -1
                        int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                        if (r7 == 0) goto L73
                        long r7 = (long) r6
                        int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                        if (r7 != 0) goto L4f
                        goto L73
                    L4f:
                        java.io.IOException r7 = new java.io.IOException
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        r8.<init>()
                        java.lang.String r2 = "Content-Length ("
                        r8.append(r2)
                        r8.append(r0)
                        java.lang.String r0 = ") and stream length ("
                        r8.append(r0)
                        r8.append(r6)
                        java.lang.String r6 = ") disagree"
                        r8.append(r6)
                        java.lang.String r6 = r8.toString()
                        r7.<init>(r6)
                        throw r7
                    L73:
                        return r2
                    L74:
                        throw r7
                    L75:
                        java.io.IOException r6 = new java.io.IOException
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "Cannot buffer entire body for content length: "
                        r7.append(r8)
                        r7.append(r0)
                        java.lang.String r7 = r7.toString()
                        r6.<init>(r7)
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(okhttp3.ResponseBody, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.lang.Object");
                }

                @JvmStatic
                @JvmName
                public static final ResponseBody create(C15331h c15331h, j jVar) {
                    return INSTANCE.c(c15331h, jVar);
                }

                public final InputStream byteStream() {
                    return getF154151c().T3();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v9 */
                public final C15331h byteString() throws IOException {
                    long f154150b = getF154150b();
                    if (f154150b <= 2147483647L) {
                        InterfaceC15330g f154151c = getF154151c();
                        C15331h th2 = null;
                        try {
                            C15331h c15331hQ2 = f154151c.Q2();
                            if (f154151c != null) {
                                try {
                                    f154151c.close();
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            th = th2;
                            th2 = c15331hQ2;
                        } catch (Throwable th4) {
                            th = th4;
                            if (f154151c != null) {
                                try {
                                    f154151c.close();
                                } catch (Throwable th5) {
                                    ExceptionsKt.a(th, th5);
                                }
                            }
                        }
                        if (th == 0) {
                            int iV = th2.V();
                            if (f154150b != -1 && f154150b != iV) {
                                throw new IOException("Content-Length (" + f154150b + ") and stream length (" + iV + ") disagree");
                            }
                            return th2;
                        }
                        throw th;
                    }
                    throw new IOException("Cannot buffer entire body for content length: " + f154150b);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v9 */
                public final byte[] bytes() throws IOException {
                    long f154150b = getF154150b();
                    if (f154150b <= 2147483647L) {
                        InterfaceC15330g f154151c = getF154151c();
                        byte[] th2 = null;
                        try {
                            byte[] bArrE2 = f154151c.e2();
                            if (f154151c != null) {
                                try {
                                    f154151c.close();
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            th = th2;
                            th2 = bArrE2;
                        } catch (Throwable th4) {
                            th = th4;
                            if (f154151c != null) {
                                try {
                                    f154151c.close();
                                } catch (Throwable th5) {
                                    ExceptionsKt.a(th, th5);
                                }
                            }
                        }
                        if (th == 0) {
                            int length = th2.length;
                            if (f154150b != -1 && f154150b != length) {
                                throw new IOException("Content-Length (" + f154150b + ") and stream length (" + length + ") disagree");
                            }
                            return th2;
                        }
                        throw th;
                    }
                    throw new IOException("Cannot buffer entire body for content length: " + f154150b);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable, kw.J
                public void close() {
                    Rv.h.f(getF154151c());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v5 */
                public final String string() throws IOException {
                    InterfaceC15330g f154151c = getF154151c();
                    String th2 = null;
                    try {
                        String strH2 = f154151c.H2(Rv.k.n(f154151c, charset()));
                        if (f154151c != null) {
                            try {
                                f154151c.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        th = th2;
                        th2 = strH2;
                    } catch (Throwable th4) {
                        th = th4;
                        if (f154151c != null) {
                            try {
                                f154151c.close();
                            } catch (Throwable th5) {
                                ExceptionsKt.a(th, th5);
                            }
                        }
                    }
                    if (th == 0) {
                        return th2;
                    }
                    throw th;
                }

                @Deprecated
                @JvmStatic
                public static final ResponseBody create(j jVar, long j10, InterfaceC15330g interfaceC15330g) {
                    return INSTANCE.d(jVar, j10, interfaceC15330g);
                }

                @Deprecated
                @JvmStatic
                public static final ResponseBody create(j jVar, String str) {
                    return INSTANCE.e(jVar, str);
                }

                @Deprecated
                @JvmStatic
                public static final ResponseBody create(j jVar, C15331h c15331h) {
                    return INSTANCE.f(jVar, c15331h);
                }

                @Deprecated
                @JvmStatic
                public static final ResponseBody create(j jVar, byte[] bArr) {
                    return INSTANCE.g(jVar, bArr);
                }

                @JvmStatic
                @JvmName
                public static final ResponseBody create(byte[] bArr, j jVar) {
                    return INSTANCE.h(bArr, jVar);
                }
            }
