package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DescriptorKindFilter {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f147162c;

    /* renamed from: d, reason: collision with root package name */
    private static int f147163d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f147164e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f147165f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f147166g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f147167h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f147168i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f147169j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f147170k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f147171l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f147172m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f147173n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147174o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147175p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147176q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147177r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147178s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147179t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147180u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147181v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147182w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f147183x;

    /* renamed from: y, reason: collision with root package name */
    private static final List<Companion.a> f147184y;

    /* renamed from: z, reason: collision with root package name */
    private static final List<Companion.a> f147185z;

    /* renamed from: a, reason: collision with root package name */
    private final List<DescriptorKindExclude> f147186a;

    /* renamed from: b, reason: collision with root package name */
    private final int f147187b;

    @SourceDebugExtension
    public static final class Companion {

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final int f147188a;

            /* renamed from: b, reason: collision with root package name */
            private final String f147189b;

            public a(int i10, String name) {
                Intrinsics.j(name, "name");
                this.f147188a = i10;
                this.f147189b = name;
            }

            public final int a() {
                return this.f147188a;
            }

            public final String b() {
                return this.f147189b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = DescriptorKindFilter.f147163d;
            DescriptorKindFilter.f147163d <<= 1;
            return i10;
        }

        public final int b() {
            return DescriptorKindFilter.f147170k;
        }

        public final int c() {
            return DescriptorKindFilter.f147171l;
        }

        public final int d() {
            return DescriptorKindFilter.f147168i;
        }

        public final int e() {
            return DescriptorKindFilter.f147164e;
        }

        public final int f() {
            return DescriptorKindFilter.f147167h;
        }

        public final int g() {
            return DescriptorKindFilter.f147165f;
        }

        public final int h() {
            return DescriptorKindFilter.f147166g;
        }

        public final int i() {
            return DescriptorKindFilter.f147169j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i10, List<? extends DescriptorKindExclude> excludes) {
        Intrinsics.j(excludes, "excludes");
        this.f147186a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((DescriptorKindExclude) it.next()).a();
        }
        this.f147187b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.e(DescriptorKindFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.e(this.f147186a, descriptorKindFilter.f147186a) && this.f147187b == descriptorKindFilter.f147187b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion.a aVar;
        Companion.a aVar2;
        Companion companion = new Companion(null);
        f147162c = companion;
        f147163d = 1;
        int iJ = companion.j();
        f147164e = iJ;
        int iJ2 = companion.j();
        f147165f = iJ2;
        int iJ3 = companion.j();
        f147166g = iJ3;
        int iJ4 = companion.j();
        f147167h = iJ4;
        int iJ5 = companion.j();
        f147168i = iJ5;
        int iJ6 = companion.j();
        f147169j = iJ6;
        int iJ7 = companion.j() - 1;
        f147170k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f147171l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f147172m = i11;
        int i12 = iJ5 | iJ6;
        f147173n = i12;
        int i13 = 2;
        f147174o = new DescriptorKindFilter(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147175p = new DescriptorKindFilter(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147176q = new DescriptorKindFilter(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147177r = new DescriptorKindFilter(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147178s = new DescriptorKindFilter(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147179t = new DescriptorKindFilter(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147180u = new DescriptorKindFilter(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147181v = new DescriptorKindFilter(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147182w = new DescriptorKindFilter(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f147183x = new DescriptorKindFilter(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.i(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i14 = descriptorKindFilter.f147187b;
                String name = field2.getName();
                Intrinsics.i(name, "getName(...)");
                aVar2 = new Companion.a(i14, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f147184y = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.i(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.e(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.i(name2, "getName(...)");
                aVar = new Companion.a(iIntValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f147185z = arrayList5;
    }

    public final boolean a(int i10) {
        return (i10 & this.f147187b) != 0;
    }

    public int hashCode() {
        return (this.f147186a.hashCode() * 31) + this.f147187b;
    }

    public final List<DescriptorKindExclude> l() {
        return this.f147186a;
    }

    public final int m() {
        return this.f147187b;
    }

    public final DescriptorKindFilter n(int i10) {
        int i11 = i10 & this.f147187b;
        if (i11 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i11, this.f147186a);
    }

    public String toString() {
        Object next;
        Iterator<T> it = f147184y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Companion.a) next).a() == this.f147187b) {
                break;
            }
        }
        Companion.a aVar = (Companion.a) next;
        String strB = aVar != null ? aVar.b() : null;
        if (strB == null) {
            List<Companion.a> list = f147185z;
            ArrayList arrayList = new ArrayList();
            for (Companion.a aVar2 : list) {
                String strB2 = a(aVar2.a()) ? aVar2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = CollectionsKt.B0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f147186a + ')';
    }

    public /* synthetic */ DescriptorKindFilter(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
