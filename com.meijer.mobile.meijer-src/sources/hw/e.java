package hw;

import com.medallia.digital.mobilesdk.q2;
import gw.B;
import gw.C14416e;
import gw.C14419h;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lgw/B;", "", "o", "(Lgw/B;)I", "", "n", "(Lgw/B;)Z", "child", "normalize", "j", "(Lgw/B;Lgw/B;Z)Lgw/B;", "", "k", "(Ljava/lang/String;Z)Lgw/B;", "Lgw/e;", "q", "(Lgw/e;Z)Lgw/B;", "Lgw/h;", "s", "(Ljava/lang/String;)Lgw/h;", "", "r", "(B)Lgw/h;", "slash", "p", "(Lgw/e;Lgw/h;)Z", "a", "Lgw/h;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", "d", "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lgw/B;)Lgw/h;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final C14419h f136199a;

    /* renamed from: b, reason: collision with root package name */
    private static final C14419h f136200b;

    /* renamed from: c, reason: collision with root package name */
    private static final C14419h f136201c;

    /* renamed from: d, reason: collision with root package name */
    private static final C14419h f136202d;

    /* renamed from: e, reason: collision with root package name */
    private static final C14419h f136203e;

    static {
        C14419h.Companion companion = C14419h.INSTANCE;
        f136199a = companion.d(q2.f93563c);
        f136200b = companion.d("\\");
        f136201c = companion.d("/\\");
        f136202d = companion.d(".");
        f136203e = companion.d("..");
    }

    public static final B j(B b10, B child, boolean z10) {
        Intrinsics.j(b10, "<this>");
        Intrinsics.j(child, "child");
        if (child.isAbsolute() || child.C() != null) {
            return child;
        }
        C14419h c14419hM = m(b10);
        if (c14419hM == null && (c14419hM = m(child)) == null) {
            c14419hM = s(B.f134484c);
        }
        C14416e c14416e = new C14416e();
        c14416e.g1(b10.getBytes());
        if (c14416e.getSize() > 0) {
            c14416e.g1(c14419hM);
        }
        c14416e.g1(child.getBytes());
        return q(c14416e, z10);
    }

    public static final B k(String str, boolean z10) {
        Intrinsics.j(str, "<this>");
        return q(new C14416e().G0(str), z10);
    }

    private static final boolean p(C14416e c14416e, C14419h c14419h) {
        if (!Intrinsics.e(c14419h, f136200b) || c14416e.getSize() < 2 || c14416e.l(1L) != 58) {
            return false;
        }
        char cL = (char) c14416e.l(0L);
        if ('a' > cL || cL >= '{') {
            return 'A' <= cL && cL < '[';
        }
        return true;
    }

    public static final B q(C14416e c14416e, boolean z10) throws EOFException {
        C14419h c14419h;
        C14419h c14419hO1;
        Intrinsics.j(c14416e, "<this>");
        C14416e c14416e2 = new C14416e();
        C14419h c14419hR = null;
        int i10 = 0;
        while (true) {
            if (!c14416e.d0(0L, f136199a)) {
                c14419h = f136200b;
                if (!c14416e.d0(0L, c14419h)) {
                    break;
                }
            }
            byte b10 = c14416e.readByte();
            if (c14419hR == null) {
                c14419hR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.e(c14419hR, c14419h);
        if (z11) {
            Intrinsics.g(c14419hR);
            c14416e2.g1(c14419hR);
            c14416e2.g1(c14419hR);
        } else if (i10 > 0) {
            Intrinsics.g(c14419hR);
            c14416e2.g1(c14419hR);
        } else {
            long jH3 = c14416e.h3(f136201c);
            if (c14419hR == null) {
                c14419hR = jH3 == -1 ? s(B.f134484c) : r(c14416e.l(jH3));
            }
            if (p(c14416e, c14419hR)) {
                if (jH3 == 2) {
                    c14416e2.E1(c14416e, 3L);
                } else {
                    c14416e2.E1(c14416e, 2L);
                }
            }
            Unit unit = Unit.f143329a;
        }
        boolean z12 = c14416e2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c14416e.i2()) {
            long jH32 = c14416e.h3(f136201c);
            if (jH32 == -1) {
                c14419hO1 = c14416e.P2();
            } else {
                c14419hO1 = c14416e.O1(jH32);
                c14416e.readByte();
            }
            C14419h c14419h2 = f136203e;
            if (Intrinsics.e(c14419hO1, c14419h2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.e(CollectionsKt.D0(arrayList), c14419h2)))) {
                        arrayList.add(c14419hO1);
                    } else if (!z11 || arrayList.size() != 1) {
                        CollectionsKt.N(arrayList);
                    }
                }
            } else if (!Intrinsics.e(c14419hO1, f136202d) && !Intrinsics.e(c14419hO1, C14419h.f134558e)) {
                arrayList.add(c14419hO1);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c14416e2.g1(c14419hR);
            }
            c14416e2.g1((C14419h) arrayList.get(i11));
        }
        if (c14416e2.getSize() == 0) {
            c14416e2.g1(f136202d);
        }
        return new B(c14416e2.P2());
    }

    private static final C14419h r(byte b10) {
        if (b10 == 47) {
            return f136199a;
        }
        if (b10 == 92) {
            return f136200b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14419h s(String str) {
        if (Intrinsics.e(str, q2.f93563c)) {
            return f136199a;
        }
        if (Intrinsics.e(str, "\\")) {
            return f136200b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(B b10) {
        int iM = C14419h.M(b10.getBytes(), f136199a, 0, 2, null);
        if (iM != -1) {
            return iM;
        }
        return C14419h.M(b10.getBytes(), f136200b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14419h m(B b10) {
        C14419h c14419hB = b10.getBytes();
        C14419h c14419h = f136199a;
        if (C14419h.H(c14419hB, c14419h, 0, 2, null) != -1) {
            return c14419h;
        }
        C14419h c14419hB2 = b10.getBytes();
        C14419h c14419h2 = f136200b;
        if (C14419h.H(c14419hB2, c14419h2, 0, 2, null) == -1) {
            return null;
        }
        return c14419h2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(B b10) {
        if (!b10.getBytes().t(f136203e) || (b10.getBytes().V() != 2 && !b10.getBytes().P(b10.getBytes().V() - 3, f136199a, 0, 1) && !b10.getBytes().P(b10.getBytes().V() - 3, f136200b, 0, 1))) {
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
            int iF = b10.getBytes().F(f136200b, 2);
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
