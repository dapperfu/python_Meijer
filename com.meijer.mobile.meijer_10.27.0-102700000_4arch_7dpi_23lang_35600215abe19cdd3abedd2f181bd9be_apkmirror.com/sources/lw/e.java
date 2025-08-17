package lw;

import com.medallia.digital.mobilesdk.q2;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.B;
import kw.C15328e;
import kw.C15331h;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lkw/B;", "", "o", "(Lkw/B;)I", "", "n", "(Lkw/B;)Z", "child", "normalize", "j", "(Lkw/B;Lkw/B;Z)Lkw/B;", "", "k", "(Ljava/lang/String;Z)Lkw/B;", "Lkw/e;", "q", "(Lkw/e;Z)Lkw/B;", "Lkw/h;", "s", "(Ljava/lang/String;)Lkw/h;", "", "r", "(B)Lkw/h;", "slash", "p", "(Lkw/e;Lkw/h;)Z", "a", "Lkw/h;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", "d", "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lkw/B;)Lkw/h;", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final C15331h f149447a;

    /* renamed from: b, reason: collision with root package name */
    private static final C15331h f149448b;

    /* renamed from: c, reason: collision with root package name */
    private static final C15331h f149449c;

    /* renamed from: d, reason: collision with root package name */
    private static final C15331h f149450d;

    /* renamed from: e, reason: collision with root package name */
    private static final C15331h f149451e;

    static {
        C15331h.Companion companion = C15331h.INSTANCE;
        f149447a = companion.d(q2.f92724c);
        f149448b = companion.d("\\");
        f149449c = companion.d("/\\");
        f149450d = companion.d(".");
        f149451e = companion.d("..");
    }

    public static final B j(B b10, B child, boolean z10) {
        Intrinsics.j(b10, "<this>");
        Intrinsics.j(child, "child");
        if (child.isAbsolute() || child.C() != null) {
            return child;
        }
        C15331h c15331hM = m(b10);
        if (c15331hM == null && (c15331hM = m(child)) == null) {
            c15331hM = s(B.f148024c);
        }
        C15328e c15328e = new C15328e();
        c15328e.Z2(b10.getBytes());
        if (c15328e.getSize() > 0) {
            c15328e.Z2(c15331hM);
        }
        c15328e.Z2(child.getBytes());
        return q(c15328e, z10);
    }

    public static final B k(String str, boolean z10) {
        Intrinsics.j(str, "<this>");
        return q(new C15328e().I0(str), z10);
    }

    private static final boolean p(C15328e c15328e, C15331h c15331h) {
        if (!Intrinsics.e(c15331h, f149448b) || c15328e.getSize() < 2 || c15328e.l(1L) != 58) {
            return false;
        }
        char cL = (char) c15328e.l(0L);
        if ('a' > cL || cL >= '{') {
            return 'A' <= cL && cL < '[';
        }
        return true;
    }

    public static final B q(C15328e c15328e, boolean z10) throws EOFException {
        C15331h c15331h;
        C15331h c15331hO1;
        Intrinsics.j(c15328e, "<this>");
        C15328e c15328e2 = new C15328e();
        C15331h c15331hR = null;
        int i10 = 0;
        while (true) {
            if (!c15328e.Y(0L, f149447a)) {
                c15331h = f149448b;
                if (!c15328e.Y(0L, c15331h)) {
                    break;
                }
            }
            byte b10 = c15328e.readByte();
            if (c15331hR == null) {
                c15331hR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.e(c15331hR, c15331h);
        if (z11) {
            Intrinsics.g(c15331hR);
            c15328e2.Z2(c15331hR);
            c15328e2.Z2(c15331hR);
        } else if (i10 > 0) {
            Intrinsics.g(c15331hR);
            c15328e2.Z2(c15331hR);
        } else {
            long jE3 = c15328e.e3(f149449c);
            if (c15331hR == null) {
                c15331hR = jE3 == -1 ? s(B.f148024c) : r(c15328e.l(jE3));
            }
            if (p(c15328e, c15331hR)) {
                if (jE3 == 2) {
                    c15328e2.M1(c15328e, 3L);
                } else {
                    c15328e2.M1(c15328e, 2L);
                }
            }
            Unit unit = Unit.f142422a;
        }
        boolean z12 = c15328e2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c15328e.j2()) {
            long jE32 = c15328e.e3(f149449c);
            if (jE32 == -1) {
                c15331hO1 = c15328e.Q2();
            } else {
                c15331hO1 = c15328e.O1(jE32);
                c15328e.readByte();
            }
            C15331h c15331h2 = f149451e;
            if (Intrinsics.e(c15331hO1, c15331h2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.e(CollectionsKt.D0(arrayList), c15331h2)))) {
                        arrayList.add(c15331hO1);
                    } else if (!z11 || arrayList.size() != 1) {
                        CollectionsKt.N(arrayList);
                    }
                }
            } else if (!Intrinsics.e(c15331hO1, f149450d) && !Intrinsics.e(c15331hO1, C15331h.f148095e)) {
                arrayList.add(c15331hO1);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c15328e2.Z2(c15331hR);
            }
            c15328e2.Z2((C15331h) arrayList.get(i11));
        }
        if (c15328e2.getSize() == 0) {
            c15328e2.Z2(f149450d);
        }
        return new B(c15328e2.Q2());
    }

    private static final C15331h r(byte b10) {
        if (b10 == 47) {
            return f149447a;
        }
        if (b10 == 92) {
            return f149448b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15331h s(String str) {
        if (Intrinsics.e(str, q2.f92724c)) {
            return f149447a;
        }
        if (Intrinsics.e(str, "\\")) {
            return f149448b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(B b10) {
        int iM = C15331h.M(b10.getBytes(), f149447a, 0, 2, null);
        if (iM != -1) {
            return iM;
        }
        return C15331h.M(b10.getBytes(), f149448b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15331h m(B b10) {
        C15331h c15331hB = b10.getBytes();
        C15331h c15331h = f149447a;
        if (C15331h.H(c15331hB, c15331h, 0, 2, null) != -1) {
            return c15331h;
        }
        C15331h c15331hB2 = b10.getBytes();
        C15331h c15331h2 = f149448b;
        if (C15331h.H(c15331hB2, c15331h2, 0, 2, null) == -1) {
            return null;
        }
        return c15331h2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(B b10) {
        if (!b10.getBytes().t(f149451e) || (b10.getBytes().V() != 2 && !b10.getBytes().P(b10.getBytes().V() - 3, f149447a, 0, 1) && !b10.getBytes().P(b10.getBytes().V() - 3, f149448b, 0, 1))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(B b10) {
        if (b10.getBytes().V() == 0) {
            return -1;
        }
        if (b10.getBytes().u(0) == 47) {
            return 1;
        }
        if (b10.getBytes().u(0) == 92) {
            if (b10.getBytes().V() <= 2 || b10.getBytes().u(1) != 92) {
                return 1;
            }
            int iF = b10.getBytes().F(f149448b, 2);
            if (iF == -1) {
                return b10.getBytes().V();
            }
            return iF;
        }
        if (b10.getBytes().V() > 2 && b10.getBytes().u(1) == 58 && b10.getBytes().u(2) == 92) {
            char cU = (char) b10.getBytes().u(0);
            if ('a' > cU || cU >= '{') {
                if ('A' <= cU && cU < '[') {
                    return 3;
                }
            } else {
                return 3;
            }
        }
        return -1;
    }
}
