package Rv;

import Qv.l;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kw.C15328e;
import kw.InterfaceC15330g;
import kw.J;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.g;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0000¢\u0006\u0004\b \u0010!\u001a\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u0002*\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010)\u001a\u00020(*\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u001a#\u0010-\u001a\u00020\u0002*\u00020+2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b-\u0010.\u001a#\u00100\u001a\u00020\u0002*\u00020+2\u0006\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b0\u0010.\u001a\u001b\u00103\u001a\u00020\u0002*\u0002012\u0006\u00102\u001a\u00020\u0011H\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00106\u001a\u00020\u0016*\u000205H\u0000¢\u0006\u0004\b6\u00107\u001a%\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u00108*\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0000¢\u0006\u0004\b9\u0010:\u001a/\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u001082\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0001¢\u0006\u0004\b<\u0010=\u001a)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u00108*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\fH\u0000¢\u0006\u0004\b>\u0010=\u001a\u0013\u0010@\u001a\u00020?*\u000201H\u0000¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010B\u001a\u00020\u0000*\u00020\u0016H\u0000¢\u0006\u0004\bB\u0010C\u001a\u0013\u0010D\u001a\u00020\u0000*\u00020\u001aH\u0000¢\u0006\u0004\bD\u0010E\u001a\u0013\u0010G\u001a\u00020?*\u00020FH\u0000¢\u0006\u0004\bG\u0010H\"\u0014\u0010L\u001a\u00020I8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\"\u0014\u0010O\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bM\u0010N\"\u0014\u0010Q\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010P¨\u0006R"}, d2 = {"", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "p", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "Lokhttp3/HttpUrl;", "includeDefaultPort", "v", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "format", "", "", "args", "j", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkw/g;", "Ljava/nio/charset/Charset;", "default", "n", "(Lkw/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "", "g", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "", "LYv/c;", "Lokhttp3/Headers;", "s", "(Ljava/util/List;)Lokhttp3/Headers;", "r", "(Lokhttp3/Headers;)Ljava/util/List;", "other", "f", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/g;", "Lokhttp3/g$c;", "c", "(Lokhttp3/g;)Lokhttp3/g$c;", "Lkw/J;", "timeUnit", "o", "(Lkw/J;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "i", "Ljava/net/Socket;", "source", "m", "(Ljava/net/Socket;Lkw/g;)Z", "Lokhttp3/Response;", "k", "(Lokhttp3/Response;)J", "T", "x", "(Ljava/util/List;)Ljava/util/List;", "elements", "l", "([Ljava/lang/Object;)Ljava/util/List;", "y", "", "h", "(Ljava/net/Socket;)V", "u", "(J)Ljava/lang/String;", "t", "(I)Ljava/lang/String;", "LQv/l;", "e", "(LQv/l;)V", "Ljava/util/TimeZone;", "a", "Ljava/util/TimeZone;", "UTC", "b", "Z", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final TimeZone f33046a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final boolean f33047b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final String f33048c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.g d(okhttp3.g gVar, okhttp3.d it) {
        Intrinsics.j(it, "it");
        return gVar;
    }

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        Intrinsics.g(timeZone);
        f33046a = timeZone;
        f33047b = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.i(name, "getName(...)");
        f33048c = StringsKt.L0(StringsKt.J0(name, "okhttp3."), "Client");
    }

    public static final g.c c(final okhttp3.g gVar) {
        Intrinsics.j(gVar, "<this>");
        return new g.c() { // from class: Rv.i
            @Override // okhttp3.g.c
            public final okhttp3.g a(okhttp3.d dVar) {
                return k.d(gVar, dVar);
            }
        };
    }

    public static final void e(l lVar) {
        Intrinsics.j(lVar, "<this>");
        if (f33047b && Thread.holdsLock(lVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + lVar);
        }
    }

    public static final boolean f(HttpUrl httpUrl, HttpUrl other) {
        Intrinsics.j(httpUrl, "<this>");
        Intrinsics.j(other, "other");
        return Intrinsics.e(httpUrl.getHost(), other.getHost()) && httpUrl.getPort() == other.getPort() && Intrinsics.e(httpUrl.getScheme(), other.getScheme());
    }

    public static final int g(String name, long j10, TimeUnit unit) {
        Intrinsics.j(name, "name");
        Intrinsics.j(unit, "unit");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        long millis = unit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small").toString());
    }

    public static final void h(Socket socket) throws IOException {
        Intrinsics.j(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.e(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean i(J j10, int i10, TimeUnit timeUnit) {
        Intrinsics.j(j10, "<this>");
        Intrinsics.j(timeUnit, "timeUnit");
        try {
            return o(j10, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String j(String format, Object... args) {
        Intrinsics.j(format, "format");
        Intrinsics.j(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.i(str, "format(...)");
        return str;
    }

    public static final long k(Response response) {
        Intrinsics.j(response, "<this>");
        String str = response.getHeaders().get("Content-Length");
        if (str != null) {
            return h.C(str, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... elements) {
        Intrinsics.j(elements, "elements");
        return y(elements);
    }

    public static final boolean m(Socket socket, InterfaceC15330g source) throws SocketException {
        Intrinsics.j(socket, "<this>");
        Intrinsics.j(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.j2();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset n(InterfaceC15330g interfaceC15330g, Charset charset) throws IOException {
        Intrinsics.j(interfaceC15330g, "<this>");
        Intrinsics.j(charset, "default");
        int iU2 = interfaceC15330g.U2(h.m());
        if (iU2 == -1) {
            return charset;
        }
        if (iU2 == 0) {
            return Charsets.UTF_8;
        }
        if (iU2 == 1) {
            return Charsets.UTF_16BE;
        }
        if (iU2 == 2) {
            return Charsets.f147389a.b();
        }
        if (iU2 == 3) {
            return Charsets.UTF_16LE;
        }
        if (iU2 == 4) {
            return Charsets.f147389a.a();
        }
        throw new AssertionError();
    }

    public static final boolean o(J j10, int i10, TimeUnit timeUnit) throws IOException {
        Intrinsics.j(j10, "<this>");
        Intrinsics.j(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = j10.getF148081a().getHasDeadline() ? j10.getF148081a().c() - jNanoTime : Long.MAX_VALUE;
        j10.getF148081a().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C15328e c15328e = new C15328e();
            while (j10.read(c15328e, 8192L) != -1) {
                c15328e.a();
            }
            if (jC == Long.MAX_VALUE) {
                j10.getF148081a().a();
                return true;
            }
            j10.getF148081a().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                j10.getF148081a().a();
                return false;
            }
            j10.getF148081a().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                j10.getF148081a().a();
            } else {
                j10.getF148081a().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final ThreadFactory p(final String name, final boolean z10) {
        Intrinsics.j(name, "name");
        return new ThreadFactory() { // from class: Rv.j
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return k.q(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread q(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<Yv.c> r(Headers headers) {
        Intrinsics.j(headers, "<this>");
        IntRange intRangeX = RangesKt.x(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
        Iterator<Integer> it = intRangeX.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new Yv.c(headers.h(iNextInt), headers.p(iNextInt)));
        }
        return arrayList;
    }

    public static final Headers s(List<Yv.c> list) {
        Intrinsics.j(list, "<this>");
        Headers.a aVar = new Headers.a();
        for (Yv.c cVar : list) {
            aVar.d(cVar.getName().c0(), cVar.getValue().c0());
        }
        return aVar.f();
    }

    public static final String v(HttpUrl httpUrl, boolean z10) {
        String host;
        Intrinsics.j(httpUrl, "<this>");
        if (StringsKt.c0(httpUrl.getHost(), ":", false, 2, null)) {
            host = '[' + httpUrl.getHost() + ']';
        } else {
            host = httpUrl.getHost();
        }
        if (!z10 && httpUrl.getPort() == HttpUrl.INSTANCE.b(httpUrl.getScheme())) {
            return host;
        }
        return host + ':' + httpUrl.getPort();
    }

    public static /* synthetic */ String w(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return v(httpUrl, z10);
    }

    public static final <T> List<T> x(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            return CollectionsKt.m();
        }
        if (list.size() == 1) {
            List<T> listSingletonList = Collections.singletonList(list.get(0));
            Intrinsics.i(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.i(array, "toArray(...)");
        List<T> listUnmodifiableList = Collections.unmodifiableList(ArraysKt.g(array));
        Intrinsics.i(listUnmodifiableList, "unmodifiableList(...)");
        Intrinsics.h(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    public static final <T> List<T> y(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return CollectionsKt.m();
        }
        if (tArr.length == 1) {
            List<T> listSingletonList = Collections.singletonList(tArr[0]);
            Intrinsics.i(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List<T> listUnmodifiableList = Collections.unmodifiableList(ArraysKt.g((Object[]) tArr.clone()));
        Intrinsics.i(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final String t(int i10) {
        String hexString = Integer.toHexString(i10);
        Intrinsics.i(hexString, "toHexString(...)");
        return hexString;
    }

    public static final String u(long j10) {
        String hexString = Long.toHexString(j10);
        Intrinsics.i(hexString, "toHexString(...)");
        return hexString;
    }
}
