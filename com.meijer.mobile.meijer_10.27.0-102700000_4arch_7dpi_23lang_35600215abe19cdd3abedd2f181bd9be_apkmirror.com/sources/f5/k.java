package f5;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import c5.EnumC6361g;
import c5.q;
import c5.t;
import d5.InterfaceC13485a;
import f5.i;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.util.Map;
import k5.C15097c;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.AbstractC15335l;
import kw.InterfaceC15330g;
import kw.w;
import l5.C15376l;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.c;
import okhttp3.d;
import q5.C16458j;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 12\u00020\u0001:\u00024-B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u0004\u0018\u00010\u0017*\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)*\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010:R\u0014\u0010>\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010=¨\u0006?"}, d2 = {"Lf5/k;", "Lf5/i;", "", "url", "Ll5/l;", "options", "Lkotlin/Lazy;", "Lokhttp3/d$a;", "callFactory", "Ld5/a;", "diskCache", "", "respectCacheHeaders", "<init>", "(Ljava/lang/String;Ll5/l;Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "Ld5/a$c;", "i", "()Ld5/a$c;", "snapshot", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "Lk5/c;", "cacheResponse", "n", "(Ld5/a$c;Lokhttp3/Request;Lokhttp3/Response;Lk5/c;)Ld5/a$c;", "h", "()Lokhttp3/Request;", "c", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "j", "(Ld5/a$c;)Lk5/c;", "Lc5/q;", "l", "(Ld5/a$c;)Lc5/q;", "Lokhttp3/ResponseBody;", "m", "(Lokhttp3/ResponseBody;)Lc5/q;", "Lc5/g;", "k", "(Lokhttp3/Response;)Lc5/g;", "Lf5/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/j;", "contentType", "f", "(Ljava/lang/String;Lokhttp3/j;)Ljava/lang/String;", "Ljava/lang/String;", "b", "Ll5/l;", "Lkotlin/Lazy;", "d", "e", "Z", "()Ljava/lang/String;", "diskCacheKey", "Lkw/l;", "()Lkw/l;", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class k implements i {

    /* renamed from: g, reason: collision with root package name */
    private static final okhttp3.c f130766g = new c.a().k().l().a();

    /* renamed from: h, reason: collision with root package name */
    private static final okhttp3.c f130767h = new c.a().k().m().a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15376l options;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy<d.a> callFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy<InterfaceC13485a> diskCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean respectCacheHeaders;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f130776a;

        /* renamed from: c, reason: collision with root package name */
        int f130778c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130776a = obj;
            this.f130778c |= Integer.MIN_VALUE;
            return k.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {77, 106}, m = "fetch")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130779a;

        /* renamed from: b, reason: collision with root package name */
        Object f130780b;

        /* renamed from: c, reason: collision with root package name */
        Object f130781c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f130782d;

        /* renamed from: f, reason: collision with root package name */
        int f130784f;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130782d = obj;
            this.f130784f |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    private final C15097c j(InterfaceC13485a.c cVar) throws Throwable {
        Throwable th2;
        C15097c c15097c;
        try {
            InterfaceC15330g interfaceC15330gD = w.d(e().D(cVar.k()));
            try {
                c15097c = new C15097c(interfaceC15330gD);
                if (interfaceC15330gD != null) {
                    try {
                        interfaceC15330gD.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    th2 = null;
                }
            } catch (Throwable th4) {
                if (interfaceC15330gD != null) {
                    try {
                        interfaceC15330gD.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.a(th4, th5);
                    }
                }
                th2 = th4;
                c15097c = null;
            }
            if (th2 == null) {
                return c15097c;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String f(String url, okhttp3.j contentType) {
        String strK;
        String mediaType = contentType != null ? contentType.getMediaType() : null;
        if ((mediaType == null || StringsKt.W(mediaType, "text/plain", false, 2, null)) && (strK = C16458j.k(MimeTypeMap.getSingleton(), url)) != null) {
            return strK;
        }
        if (mediaType != null) {
            return StringsKt.r1(mediaType, ';', null, 2, null);
        }
        return null;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lf5/k$b;", "Lf5/i$a;", "Landroid/net/Uri;", "Lkotlin/Lazy;", "Lokhttp3/d$a;", "callFactory", "Ld5/a;", "diskCache", "", "respectCacheHeaders", "<init>", "(Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "data", "c", "(Landroid/net/Uri;)Z", "Ll5/l;", "options", "LZ4/h;", "imageLoader", "Lf5/i;", "b", "(Landroid/net/Uri;Ll5/l;LZ4/h;)Lf5/i;", "a", "Lkotlin/Lazy;", "Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i.a<Uri> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lazy<d.a> callFactory;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Lazy<InterfaceC13485a> diskCache;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean respectCacheHeaders;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Lazy<? extends d.a> lazy, Lazy<? extends InterfaceC13485a> lazy2, boolean z10) {
            this.callFactory = lazy;
            this.diskCache = lazy2;
            this.respectCacheHeaders = z10;
        }

        private final boolean c(Uri data) {
            if (!Intrinsics.e(data.getScheme(), "http") && !Intrinsics.e(data.getScheme(), BuildConfig.SERVICE_SCHEME)) {
                return false;
            }
            return true;
        }

        @Override // f5.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri data, C15376l options, Z4.h imageLoader) {
            if (!c(data)) {
                return null;
            }
            return new k(data.toString(), options, this.callFactory, this.diskCache, this.respectCacheHeaders);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(okhttp3.Request r5, kotlin.coroutines.Continuation<? super okhttp3.Response> r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f5.k.c
            if (r0 == 0) goto L13
            r0 = r6
            f5.k$c r0 = (f5.k.c) r0
            int r1 = r0.f130778c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130778c = r1
            goto L18
        L13:
            f5.k$c r0 = new f5.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f130776a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130778c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            boolean r6 = q5.C16458j.s()
            if (r6 == 0) goto L5d
            l5.l r6 = r4.options
            l5.b r6 = r6.getNetworkCachePolicy()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            kotlin.Lazy<okhttp3.d$a> r6 = r4.callFactory
            java.lang.Object r6 = r6.getValue()
            okhttp3.d$a r6 = (okhttp3.d.a) r6
            okhttp3.d r5 = r6.b(r5)
            okhttp3.Response r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            kotlin.Lazy<okhttp3.d$a> r6 = r4.callFactory
            java.lang.Object r6 = r6.getValue()
            okhttp3.d$a r6 = (okhttp3.d.a) r6
            okhttp3.d r5 = r6.b(r5)
            r0.f130778c = r3
            java.lang.Object r6 = q5.C16450b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L75:
            boolean r6 = r5.getIsSuccessful()
            if (r6 != 0) goto L92
            int r6 = r5.getCode()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            okhttp3.ResponseBody r6 = r5.getBody()
            if (r6 == 0) goto L8c
            q5.C16458j.d(r6)
        L8c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.k.c(okhttp3.Request, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String d() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final AbstractC15335l e() {
        InterfaceC13485a value = this.diskCache.getValue();
        Intrinsics.g(value);
        return value.getFileSystem();
    }

    private final boolean g(Request request, Response response) {
        if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            return !this.respectCacheHeaders || k5.d.INSTANCE.c(request, response);
        }
        return false;
    }

    private final Request h() {
        Request.a aVarN = new Request.a().t(this.url).n(this.options.getHeaders());
        for (Map.Entry<Class<?>, Object> entry : this.options.getTags().a().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.h(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVarN.r(key, entry.getValue());
        }
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.options.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            aVarN.c(okhttp3.c.f154197p);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                aVarN.c(f130767h);
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            aVarN.c(okhttp3.c.f154196o);
        } else {
            aVarN.c(f130766g);
        }
        return aVarN.b();
    }

    private final InterfaceC13485a.c i() {
        InterfaceC13485a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.b(d());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x018d, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x015a, B:67:0x0172), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x018d, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x015a, B:67:0x0172), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // f5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super f5.h> r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, C15376l c15376l, Lazy<? extends d.a> lazy, Lazy<? extends InterfaceC13485a> lazy2, boolean z10) {
        this.url = str;
        this.options = c15376l;
        this.callFactory = lazy;
        this.diskCache = lazy2;
        this.respectCacheHeaders = z10;
    }

    private final EnumC6361g k(Response response) {
        if (response.getNetworkResponse() != null) {
            return EnumC6361g.f61481d;
        }
        return EnumC6361g.f61480c;
    }

    private final q l(InterfaceC13485a.c cVar) {
        return t.g(cVar.getData(), e(), d(), cVar);
    }

    private final q m(ResponseBody responseBody) {
        return t.e(responseBody.getSource(), this.options.getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[Catch: all -> 0x007f, Exception -> 0x0082, TRY_LEAVE, TryCatch #9 {Exception -> 0x0082, blocks: (B:15:0x002b, B:18:0x0036, B:70:0x00f0, B:38:0x0089, B:31:0x007b, B:39:0x008a, B:55:0x00bc, B:73:0x00f8, B:68:0x00eb, B:74:0x00f9, B:52:0x00b6), top: B:97:0x002b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9 A[Catch: all -> 0x007f, Exception -> 0x0082, TRY_LEAVE, TryCatch #9 {Exception -> 0x0082, blocks: (B:15:0x002b, B:18:0x0036, B:70:0x00f0, B:38:0x0089, B:31:0x007b, B:39:0x008a, B:55:0x00bc, B:73:0x00f8, B:68:0x00eb, B:74:0x00f9, B:52:0x00b6), top: B:97:0x002b, outer: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final d5.InterfaceC13485a.c n(d5.InterfaceC13485a.c r5, okhttp3.Request r6, okhttp3.Response r7, k5.C15097c r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.k.n(d5.a$c, okhttp3.Request, okhttp3.Response, k5.c):d5.a$c");
    }
}
