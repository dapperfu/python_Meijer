package Wv;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kw.C15328e;
import kw.C15331h;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006$"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "LQv/e;", "a", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lkw/e;", "", "result", "", "c", "(Lkw/e;Ljava/util/List;)V", "", "g", "(Lkw/e;)Z", "", "prefix", "h", "(Lkw/e;B)Z", "d", "(Lkw/e;)Ljava/lang/String;", "e", "LQv/j;", "Lokhttp3/HttpUrl;", "url", "headers", "f", "(LQv/j;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "b", "(Lokhttp3/Response;)Z", "Lkw/h;", "Lkw/h;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final C15331h f39030a;

    /* renamed from: b, reason: collision with root package name */
    private static final C15331h f39031b;

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void c(kw.C15328e r7, java.util.List<Qv.e> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.j2()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            Qv.e r7 = new Qv.e
            java.util.Map r0 = kotlin.collections.MapsKt.k()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = Rv.h.B(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.j2()
            if (r2 == 0) goto L69
        L42:
            Qv.e r2 = new Qv.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.StringsKt.M(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap(...)"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = Rv.h.B(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 != 0) goto Lbc
            int r5 = Rv.h.B(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = d(r7)
            goto La1
        L9d:
            java.lang.String r6 = e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.j2()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            Qv.e r4 = new Qv.e
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: Wv.e.c(kw.e, java.util.List):void");
    }

    private static final boolean g(C15328e c15328e) throws EOFException {
        boolean z10 = false;
        while (!c15328e.j2()) {
            byte bL = c15328e.l(0L);
            if (bL != 44) {
                if (bL != 32 && bL != 9) {
                    break;
                }
                c15328e.readByte();
            } else {
                c15328e.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    static {
        C15331h.Companion companion = C15331h.INSTANCE;
        f39030a = companion.d("\"\\");
        f39031b = companion.d("\t ,=");
    }

    public static final List<Qv.e> a(Headers headers, String headerName) {
        Intrinsics.j(headers, "<this>");
        Intrinsics.j(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.H(headerName, headers.h(i10), true)) {
                try {
                    c(new C15328e().I0(headers.p(i10)), arrayList);
                } catch (EOFException e10) {
                    okhttp3.internal.platform.c.INSTANCE.e().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Response response) {
        Intrinsics.j(response, "<this>");
        if (Intrinsics.e(response.getRequest().getMethod(), "HEAD")) {
            return false;
        }
        int code = response.getCode();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Rv.k.k(response) == -1 && !StringsKt.H("chunked", Response.j(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    private static final String e(C15328e c15328e) {
        long jE3 = c15328e.e3(f39031b);
        if (jE3 == -1) {
            jE3 = c15328e.getSize();
        }
        if (jE3 != 0) {
            return c15328e.K1(jE3);
        }
        return null;
    }

    public static final void f(Qv.j jVar, HttpUrl url, Headers headers) {
        Intrinsics.j(jVar, "<this>");
        Intrinsics.j(url, "url");
        Intrinsics.j(headers, "headers");
        if (jVar == Qv.j.f31459b) {
            return;
        }
        List<Qv.i> listE = Qv.i.INSTANCE.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        jVar.b(url, listE);
    }

    private static final String d(C15328e c15328e) throws EOFException {
        if (c15328e.readByte() == 34) {
            C15328e c15328e2 = new C15328e();
            while (true) {
                long jE3 = c15328e.e3(f39030a);
                if (jE3 == -1) {
                    return null;
                }
                if (c15328e.l(jE3) == 34) {
                    c15328e2.M1(c15328e, jE3);
                    c15328e.readByte();
                    return c15328e2.n3();
                }
                if (c15328e.getSize() == jE3 + 1) {
                    return null;
                }
                c15328e2.M1(c15328e, jE3);
                c15328e.readByte();
                c15328e2.M1(c15328e, 1L);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final boolean h(C15328e c15328e, byte b10) {
        if (!c15328e.j2() && c15328e.l(0L) == b10) {
            return true;
        }
        return false;
    }
}
