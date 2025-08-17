package Rv;

import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.AbstractC15335l;
import kw.B;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;
import kw.z;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001d\u001a\u00020\f*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\f*\u00020\u001bH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010(\u001a\u00020\f*\u00020&2\u0006\u0010'\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010+\u001a\u00020\f*\u00020*2\u0006\u0010'\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010.\u001a\u00020-*\u00020\f2\u0006\u0010'\u001a\u00020-H\u0080\u0004¢\u0006\u0004\b.\u0010/\u001a\u001b\u00103\u001a\u000202*\u0002002\u0006\u00101\u001a\u00020\fH\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00106\u001a\u00020\f*\u000205H\u0000¢\u0006\u0004\b6\u00107\u001a\u001b\u00109\u001a\u00020\f*\u0002082\u0006\u0010(\u001a\u00020&H\u0000¢\u0006\u0004\b9\u0010:\u001a\u001d\u0010;\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010<\u001a\u0019\u0010>\u001a\u00020-*\u00020\u00012\u0006\u0010=\u001a\u00020-¢\u0006\u0004\b>\u0010?\u001a\u001d\u0010@\u001a\u00020\f*\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020\fH\u0000¢\u0006\u0004\b@\u0010<\u001a\u0015\u0010C\u001a\u000202*\u00060Aj\u0002`B¢\u0006\u0004\bC\u0010D\u001a\u001b\u0010H\u001a\u00020\b*\u00020E2\u0006\u0010G\u001a\u00020FH\u0000¢\u0006\u0004\bH\u0010I\u001a\u001b\u0010K\u001a\u000202*\u00020E2\u0006\u0010J\u001a\u00020FH\u0000¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010N\u001a\u000202*\u00020E2\u0006\u0010M\u001a\u00020FH\u0000¢\u0006\u0004\bN\u0010L\u001a'\u0010Q\u001a\u000202\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000O2\u0006\u0010P\u001a\u00028\u0000H\u0000¢\u0006\u0004\bQ\u0010R\u001a)\u0010X\u001a\u00020W*\u00060Sj\u0002`T2\u0010\u0010V\u001a\f\u0012\b\u0012\u00060Sj\u0002`T0UH\u0000¢\u0006\u0004\bX\u0010Y\u001a'\u0010]\u001a\u0002022\u0006\u0010Z\u001a\u00020-2\u0006\u0010[\u001a\u00020-2\u0006\u0010\\\u001a\u00020-H\u0000¢\u0006\u0004\b]\u0010^\u001a7\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000U\"\u0004\b\u0000\u0010_2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000`2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000`H\u0000¢\u0006\u0004\ba\u0010b\"\u0014\u0010e\u001a\u00020c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bQ\u0010d\"\u001a\u0010j\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010g\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"", "", "other", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "w", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "", "n", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "value", "", "o", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "g", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "q", "(Ljava/lang/String;II)I", "s", "E", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "k", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "j", "(Ljava/lang/String;CII)I", "p", "(Ljava/lang/String;)I", "name", "y", "(Ljava/lang/String;)Z", "z", "(C)I", "", "mask", "b", "(BI)I", "", "c", "(SI)I", "", "d", "(IJ)J", "Lkw/f;", "medium", "", "H", "(Lkw/f;I)V", "Lkw/g;", "A", "(Lkw/g;)I", "Lkw/e;", "B", "(Lkw/e;B)I", "u", "(Ljava/lang/String;I)I", "defaultValue", "C", "(Ljava/lang/String;J)J", "D", "Ljava/io/Closeable;", "Lokio/Closeable;", "f", "(Ljava/io/Closeable;)V", "Lkw/l;", "Lkw/B;", "file", "x", "(Lkw/l;Lkw/B;)Z", "path", "i", "(Lkw/l;Lkw/B;)V", "directory", "h", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suppressed", "", "G", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "arrayLength", "offset", "count", "e", "(JJJ)V", "T", "", "v", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "", "[B", "EMPTY_BYTE_ARRAY", "Lkw/z;", "Lkw/z;", "m", "()Lkw/z;", "UNICODE_BOMS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final byte[] f33041a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final z f33042b;

    static {
        z.Companion aVar = z.INSTANCE;
        C15331h.Companion aVar2 = C15331h.INSTANCE;
        f33042b = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe0000"), aVar2.b("fffe"), aVar2.b("0000feff"));
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return i10 & j10;
    }

    public static final int A(InterfaceC15330g interfaceC15330g) throws IOException {
        Intrinsics.j(interfaceC15330g, "<this>");
        return b(interfaceC15330g.readByte(), l3.f92484c) | (b(interfaceC15330g.readByte(), l3.f92484c) << 16) | (b(interfaceC15330g.readByte(), l3.f92484c) << 8);
    }

    public static final int B(C15328e c15328e, byte b10) throws EOFException {
        Intrinsics.j(c15328e, "<this>");
        int i10 = 0;
        while (!c15328e.j2() && c15328e.l(0L) == b10) {
            i10++;
            c15328e.readByte();
        }
        return i10;
    }

    public static final long C(String str, long j10) {
        Intrinsics.j(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int D(String str, int i10) throws NumberFormatException {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return a.e.API_PRIORITY_OTHER;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String E(String str, int i10, int i11) {
        Intrinsics.j(str, "<this>");
        int iQ = q(str, i10, i11);
        String strSubstring = str.substring(iQ, s(str, iQ, i11));
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String F(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return E(str, i10, i11);
    }

    public static final Throwable G(Exception exc, List<? extends Exception> suppressed) {
        Intrinsics.j(exc, "<this>");
        Intrinsics.j(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.a(exc, it.next());
        }
        return exc;
    }

    public static final void H(InterfaceC15329f interfaceC15329f, int i10) throws IOException {
        Intrinsics.j(interfaceC15329f, "<this>");
        interfaceC15329f.writeByte((i10 >>> 16) & l3.f92484c);
        interfaceC15329f.writeByte((i10 >>> 8) & l3.f92484c);
        interfaceC15329f.writeByte(i10 & l3.f92484c);
    }

    public static final <E> void a(List<E> list, E e10) {
        Intrinsics.j(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void f(Closeable closeable) throws IOException {
        Intrinsics.j(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] g(String[] strArr, String value) {
        Intrinsics.j(strArr, "<this>");
        Intrinsics.j(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.m0(strArr2)] = value;
        return strArr2;
    }

    public static final void h(AbstractC15335l abstractC15335l, B directory) throws IOException {
        Intrinsics.j(abstractC15335l, "<this>");
        Intrinsics.j(directory, "directory");
        try {
            IOException iOException = null;
            for (B b10 : abstractC15335l.p(directory)) {
                try {
                    if (abstractC15335l.u(b10).getIsDirectory()) {
                        h(abstractC15335l, b10);
                    }
                    abstractC15335l.j(b10);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(AbstractC15335l abstractC15335l, B path) throws IOException {
        Intrinsics.j(abstractC15335l, "<this>");
        Intrinsics.j(path, "path");
        try {
            abstractC15335l.j(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(String str, char c10, int i10, int i11) {
        Intrinsics.j(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int k(String str, String delimiters, int i10, int i11) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.b0(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int l(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return j(str, c10, i10, i11);
    }

    public static final z m() {
        return f33042b;
    }

    public static final boolean n(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.j(strArr, "<this>");
        Intrinsics.j(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = ArrayIteratorKt.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int o(String[] strArr, String value, Comparator<String> comparator) {
        Intrinsics.j(strArr, "<this>");
        Intrinsics.j(value, "value");
        Intrinsics.j(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int p(String str) {
        Intrinsics.j(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.k(cCharAt, 31) <= 0 || Intrinsics.k(cCharAt, l3.f92485d) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int q(String str, int i10, int i11) {
        Intrinsics.j(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return q(str, i10, i11);
    }

    public static final int s(String str, int i10, int i11) {
        Intrinsics.j(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int t(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return s(str, i10, i11);
    }

    public static final int u(String str, int i10) {
        Intrinsics.j(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final <T> List<T> v(Iterable<? extends T> a10, Iterable<? extends T> b10) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        Iterator<? extends T> it = a10.iterator();
        Iterator<? extends T> it2 = b10.iterator();
        List listC = CollectionsKt.c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return CollectionsKt.a(listC);
            }
            if (it.hasNext()) {
                listC.add(it.next());
            }
            if (it2.hasNext()) {
                listC.add(it2.next());
            }
        }
    }

    public static final String[] w(String[] strArr, String[] other, Comparator<? super String> comparator) {
        Intrinsics.j(strArr, "<this>");
        Intrinsics.j(other, "other");
        Intrinsics.j(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean x(kw.AbstractC15335l r2, kw.B r3) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r2, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.j(r3, r0)
            kw.I r0 = r2.A(r3)
            r2.j(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r2 = 1
            if (r0 == 0) goto L17
            r0.close()     // Catch: java.lang.Throwable -> L17
        L17:
            return r2
        L18:
            r1 = move-exception
            goto L26
        L1a:
            kotlin.Unit r1 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L31
        L24:
            r0 = 0
            goto L31
        L26:
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r0 = move-exception
            kotlin.ExceptionsKt.a(r1, r0)
        L30:
            r0 = r1
        L31:
            if (r0 != 0) goto L38
            r2.j(r3)
            r2 = 0
            return r2
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Rv.h.x(kw.l, kw.B):boolean");
    }

    public static final boolean y(String name) {
        Intrinsics.j(name, "name");
        return StringsKt.H(name, "Authorization", true) || StringsKt.H(name, "Cookie", true) || StringsKt.H(name, "Proxy-Authorization", true) || StringsKt.H(name, "Set-Cookie", true);
    }

    public static final int z(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }
}
