package okhttp3;

import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14418g;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lgw/g;", "consumer", "", "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lgw/g;", "", "bytes", "()[B", "Lgw/h;", "byteString", "()Lgw/h;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "a", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @JvmField
    public static final ResponseBody EMPTY;
    private Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/ResponseBody$a;", "Ljava/io/Reader;", "Lgw/g;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lgw/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "", "close", "()V", "a", "Lgw/g;", "b", "Ljava/nio/charset/Charset;", "", "c", "Z", "closed", "d", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC14418g source;

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

        public a(InterfaceC14418g source, Charset charset) {
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
                inputStreamReader = new InputStreamReader(this.source.T3(), Nv.k.n(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/ResponseBody$b;", "", "<init>", "()V", "", "Lokhttp3/j;", "contentType", "Lokhttp3/ResponseBody;", "c", "(Ljava/lang/String;Lokhttp3/j;)Lokhttp3/ResponseBody;", "", "h", "([BLokhttp3/j;)Lokhttp3/ResponseBody;", "Lgw/h;", "b", "(Lgw/h;Lokhttp3/j;)Lokhttp3/ResponseBody;", "Lgw/g;", "", "contentLength", "a", "(Lgw/g;Lokhttp3/j;J)Lokhttp3/ResponseBody;", "content", "f", "(Lokhttp3/j;Ljava/lang/String;)Lokhttp3/ResponseBody;", "g", "(Lokhttp3/j;[B)Lokhttp3/ResponseBody;", "e", "(Lokhttp3/j;Lgw/h;)Lokhttp3/ResponseBody;", "d", "(Lokhttp3/j;JLgw/g;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.ResponseBody$b, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"okhttp3/ResponseBody$b$a", "Lokhttp3/ResponseBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "Lgw/g;", "source", "()Lgw/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: okhttp3.ResponseBody$b$a */
        public static final class a extends ResponseBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f154457a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f154458b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14418g f154459c;

            a(j jVar, long j10, InterfaceC14418g interfaceC14418g) {
                this.f154457a = jVar;
                this.f154458b = j10;
                this.f154459c = interfaceC14418g;
            }

            @Override // okhttp3.ResponseBody
            /* renamed from: contentLength, reason: from getter */
            public long getF154458b() {
                return this.f154458b;
            }

            @Override // okhttp3.ResponseBody
            /* renamed from: contentType, reason: from getter */
            public j getF154457a() {
                return this.f154457a;
            }

            @Override // okhttp3.ResponseBody
            /* renamed from: source, reason: from getter */
            public InterfaceC14418g getF154459c() {
                return this.f154459c;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody i(Companion companion, C14419h c14419h, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = null;
            }
            return companion.b(c14419h, jVar);
        }

        public static /* synthetic */ ResponseBody j(Companion companion, String str, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = null;
            }
            return companion.c(str, jVar);
        }

        @JvmStatic
        @JvmName
        public final ResponseBody a(InterfaceC14418g interfaceC14418g, j jVar, long j10) {
            Intrinsics.j(interfaceC14418g, "<this>");
            return new a(jVar, j10, interfaceC14418g);
        }

        @JvmStatic
        @JvmName
        public final ResponseBody b(C14419h c14419h, j jVar) {
            Intrinsics.j(c14419h, "<this>");
            return a(new C14416e().g1(c14419h), jVar, c14419h.V());
        }

        @JvmStatic
        @JvmName
        public final ResponseBody c(String str, j jVar) {
            Intrinsics.j(str, "<this>");
            Pair<Charset, j> pairB = Nv.a.b(jVar);
            Charset charsetA = pairB.a();
            j jVarB = pairB.b();
            C14416e c14416eJ0 = new C14416e().J0(str, charsetA);
            return a(c14416eJ0, jVarB, c14416eJ0.getSize());
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody d(j contentType, long contentLength, InterfaceC14418g content) {
            Intrinsics.j(content, "content");
            return a(content, contentType, contentLength);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody e(j contentType, C14419h content) {
            Intrinsics.j(content, "content");
            return b(content, contentType);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody f(j contentType, String content) {
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
            return a(new C14416e().write(bArr), jVar, bArr.length);
        }
    }

    @JvmStatic
    @JvmName
    public static final ResponseBody create(InterfaceC14418g interfaceC14418g, j jVar, long j10) {
        return INSTANCE.a(interfaceC14418g, jVar, j10);
    }

    /* renamed from: contentLength */
    public abstract long getF154458b();

    /* renamed from: contentType */
    public abstract j getF154457a();

    /* renamed from: source */
    public abstract InterfaceC14418g getF154459c();

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.i(companion, C14419h.f134558e, null, 1, null);
    }

    @JvmStatic
    @JvmName
    public static final ResponseBody create(C14419h c14419h, j jVar) {
        return INSTANCE.b(c14419h, jVar);
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getF154459c(), charset());
        this.reader = aVar;
        return aVar;
    }

    private final Charset charset() {
        return Nv.a.a(getF154457a());
    }

    private final <T> T consumeSource(ResponseBody responseBody, Function1<? super InterfaceC14418g, ? extends T> function1, Function1<? super T, Integer> function12) throws Throwable {
        Object obj;
        long f154458b = responseBody.getF154458b();
        if (f154458b <= 2147483647L) {
            InterfaceC14418g f154459c = responseBody.getF154459c();
            Throwable th2 = (Object) null;
            try {
                T tInvoke = function1.invoke(f154459c);
                InlineMarker.b(1);
                Throwable th3 = th2;
                if (f154459c != null) {
                    try {
                        f154459c.close();
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
                        long r0 = r6.getF154458b()
                        r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                        int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r2 > 0) goto L75
                        gw.g r6 = r6.getF154459c()
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
                public static final ResponseBody create(String str, j jVar) {
                    return INSTANCE.c(str, jVar);
                }

                public final InputStream byteStream() {
                    return getF154459c().T3();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v9 */
                public final C14419h byteString() throws IOException {
                    long f154458b = getF154458b();
                    if (f154458b <= 2147483647L) {
                        InterfaceC14418g f154459c = getF154459c();
                        C14419h th2 = null;
                        try {
                            C14419h c14419hP2 = f154459c.P2();
                            if (f154459c != null) {
                                try {
                                    f154459c.close();
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            th = th2;
                            th2 = c14419hP2;
                        } catch (Throwable th4) {
                            th = th4;
                            if (f154459c != null) {
                                try {
                                    f154459c.close();
                                } catch (Throwable th5) {
                                    ExceptionsKt.a(th, th5);
                                }
                            }
                        }
                        if (th == 0) {
                            int iV = th2.V();
                            if (f154458b != -1 && f154458b != iV) {
                                throw new IOException("Content-Length (" + f154458b + ") and stream length (" + iV + ") disagree");
                            }
                            return th2;
                        }
                        throw th;
                    }
                    throw new IOException("Cannot buffer entire body for content length: " + f154458b);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v9 */
                public final byte[] bytes() throws IOException {
                    long f154458b = getF154458b();
                    if (f154458b <= 2147483647L) {
                        InterfaceC14418g f154459c = getF154459c();
                        byte[] th2 = null;
                        try {
                            byte[] bArrD2 = f154459c.d2();
                            if (f154459c != null) {
                                try {
                                    f154459c.close();
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            th = th2;
                            th2 = bArrD2;
                        } catch (Throwable th4) {
                            th = th4;
                            if (f154459c != null) {
                                try {
                                    f154459c.close();
                                } catch (Throwable th5) {
                                    ExceptionsKt.a(th, th5);
                                }
                            }
                        }
                        if (th == 0) {
                            int length = th2.length;
                            if (f154458b != -1 && f154458b != length) {
                                throw new IOException("Content-Length (" + f154458b + ") and stream length (" + length + ") disagree");
                            }
                            return th2;
                        }
                        throw th;
                    }
                    throw new IOException("Cannot buffer entire body for content length: " + f154458b);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable, gw.K
                public void close() {
                    Nv.h.f(getF154459c());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v5 */
                public final String string() throws IOException {
                    InterfaceC14418g f154459c = getF154459c();
                    String th2 = null;
                    try {
                        String strG2 = f154459c.G2(Nv.k.n(f154459c, charset()));
                        if (f154459c != null) {
                            try {
                                f154459c.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        th = th2;
                        th2 = strG2;
                    } catch (Throwable th4) {
                        th = th4;
                        if (f154459c != null) {
                            try {
                                f154459c.close();
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
                public static final ResponseBody create(j jVar, long j10, InterfaceC14418g interfaceC14418g) {
                    return INSTANCE.d(jVar, j10, interfaceC14418g);
                }

                @Deprecated
                @JvmStatic
                public static final ResponseBody create(j jVar, C14419h c14419h) {
                    return INSTANCE.e(jVar, c14419h);
                }

                @Deprecated
                @JvmStatic
                public static final ResponseBody create(j jVar, String str) {
                    return INSTANCE.f(jVar, str);
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
