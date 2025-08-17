package x2;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C17993b {

    /* renamed from: x2.b$a */
    public interface a<T> {
        void a(T t10, Rect rect);
    }

    /* renamed from: x2.b$b, reason: collision with other inner class name */
    public interface InterfaceC2704b<T, V> {
        V a(T t10, int i10);

        int b(T t10);
    }

    /* renamed from: x2.b$c */
    private static class c<T> implements Comparator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f169009a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f169010b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        private final boolean f169011c;

        /* renamed from: d, reason: collision with root package name */
        private final a<T> f169012d;

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            Rect rect = this.f169009a;
            Rect rect2 = this.f169010b;
            this.f169012d.a(t10, rect);
            this.f169012d.a(t11, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f169011c ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f169011c ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return this.f169011c ? 1 : -1;
            }
            if (i16 > i17) {
                return this.f169011c ? -1 : 1;
            }
            return 0;
        }

        c(boolean z10, a<T> aVar) {
            this.f169011c = z10;
            this.f169012d = aVar;
        }
    }

    private static int k(int i10, Rect rect, Rect rect2) {
        return Math.max(0, l(i10, rect, rect2));
    }

    private static int m(int i10, Rect rect, Rect rect2) {
        return Math.max(1, n(i10, rect, rect2));
    }

    private static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(L l10, InterfaceC2704b<L, T> interfaceC2704b, a<T> aVar, T t10, Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        if (i10 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iB = interfaceC2704b.b(l10);
        Rect rect3 = new Rect();
        T t11 = null;
        for (int i11 = 0; i11 < iB; i11++) {
            T tA = interfaceC2704b.a(l10, i11);
            if (tA != t10) {
                aVar.a(tA, rect3);
                if (h(i10, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t11 = tA;
                }
            }
        }
        return t11;
    }

    private static int g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    private static boolean i(Rect rect, Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            return rect.left >= rect2.right;
        }
        if (i10 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i10 == 66) {
            return rect.right <= rect2.left;
        }
        if (i10 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int l(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    private static int n(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.top;
        } else if (i10 == 66) {
            i11 = rect2.right;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.bottom;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    private static int o(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private static boolean a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean zB = b(i10, rect, rect2);
        if (b(i10, rect, rect3) || !zB) {
            return false;
        }
        if (j(i10, rect, rect3) && i10 != 17 && i10 != 66 && k(i10, rect, rect2) >= m(i10, rect, rect3)) {
            return false;
        }
        return true;
    }

    public static <L, T> T d(L l10, InterfaceC2704b<L, T> interfaceC2704b, a<T> aVar, T t10, int i10, boolean z10, boolean z11) {
        int iB = interfaceC2704b.b(l10);
        ArrayList arrayList = new ArrayList(iB);
        for (int i11 = 0; i11 < iB; i11++) {
            arrayList.add(interfaceC2704b.a(l10, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 != 1) {
            if (i10 == 2) {
                return (T) e(t10, arrayList, z11);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) f(t10, arrayList, z11);
    }

    private static <T> T e(T t10, ArrayList<T> arrayList, boolean z10) {
        int iLastIndexOf;
        int size = arrayList.size();
        if (t10 == null) {
            iLastIndexOf = -1;
        } else {
            iLastIndexOf = arrayList.lastIndexOf(t10);
        }
        int i10 = iLastIndexOf + 1;
        if (i10 < size) {
            return arrayList.get(i10);
        }
        if (z10 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static <T> T f(T t10, ArrayList<T> arrayList, boolean z10) {
        int iIndexOf;
        int size = arrayList.size();
        if (t10 == null) {
            iIndexOf = size;
        } else {
            iIndexOf = arrayList.indexOf(t10);
        }
        int i10 = iIndexOf - 1;
        if (i10 >= 0) {
            return arrayList.get(i10);
        }
        if (z10 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    private static boolean h(int i10, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i10)) {
            return false;
        }
        if (!i(rect, rect3, i10) || a(i10, rect, rect2, rect3)) {
            return true;
        }
        if (a(i10, rect, rect3, rect2) || g(k(i10, rect, rect2), o(i10, rect, rect2)) >= g(k(i10, rect, rect3), o(i10, rect, rect3))) {
            return false;
        }
        return true;
    }
}
