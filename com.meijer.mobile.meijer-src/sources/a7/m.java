package a7;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class m implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f45296d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f45297e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f45298f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f45299g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f45300h;

    /* renamed from: a, reason: collision with root package name */
    private final c f45301a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g<b, Bitmap> f45302b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f45303c = new HashMap();

    static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final c f45305a;

        /* renamed from: b, reason: collision with root package name */
        int f45306b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f45307c;

        @Override // a7.l
        public void a() {
            this.f45305a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f45306b = i10;
            this.f45307c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f45306b == bVar.f45306b && r7.l.d(this.f45307c, bVar.f45307c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f45306b * 31;
            Bitmap.Config config = this.f45307c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f45306b, this.f45307c);
        }

        public b(c cVar) {
            this.f45305a = cVar;
        }
    }

    static class c extends AbstractC5666c<b> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a7.AbstractC5666c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        c() {
        }

        public b e(int i10, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i10, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f45296d = configArr;
        f45297e = configArr;
        f45298f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f45299g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f45300h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45304a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f45304a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45304a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45304a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45304a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a7.m.b g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            a7.m$c r0 = r8.f45301a
            a7.m$b r0 = r0.e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.j(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 * 8
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            a7.m$c r9 = r8.f45301a
            r9.c(r0)
            a7.m$c r9 = r8.f45301a
            int r10 = r5.intValue()
            a7.m$b r9 = r9.e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.m.g(int, android.graphics.Bitmap$Config):a7.m$b");
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f45297e;
        }
        int i10 = a.f45304a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f45300h : f45299g : f45298f : f45296d;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f45303c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f45303c.put(config, treeMap);
        return treeMap;
    }

    @Override // a7.k
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f45302b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(r7.l.h(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f45302b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f45303c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f45303c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    @Override // a7.k
    public String a(Bitmap bitmap) {
        return h(r7.l.h(bitmap), bitmap.getConfig());
    }

    @Override // a7.k
    public String b(int i10, int i11, Bitmap.Config config) {
        return h(r7.l.g(i10, i11, config), config);
    }

    @Override // a7.k
    public void c(Bitmap bitmap) {
        b bVarE = this.f45301a.e(r7.l.h(bitmap), bitmap.getConfig());
        this.f45302b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f45306b));
        Integer numValueOf = Integer.valueOf(bVarE.f45306b);
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        navigableMapJ.put(numValueOf, Integer.valueOf(iIntValue));
    }

    @Override // a7.k
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(r7.l.g(i10, i11, config), config);
        Bitmap bitmapA = this.f45302b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f45306b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    @Override // a7.k
    public int e(Bitmap bitmap) {
        return r7.l.h(bitmap);
    }
}
