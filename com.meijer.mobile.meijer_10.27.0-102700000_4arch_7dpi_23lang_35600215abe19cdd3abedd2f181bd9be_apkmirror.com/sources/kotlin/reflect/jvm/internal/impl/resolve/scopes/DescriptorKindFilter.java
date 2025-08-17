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
/* loaded from: classes13.dex */
public final class DescriptorKindFilter {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f146255c;

    /* renamed from: d, reason: collision with root package name */
    private static int f146256d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f146257e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f146258f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f146259g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f146260h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f146261i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f146262j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f146263k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f146264l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f146265m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f146266n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146267o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146268p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146269q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146270r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146271s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146272t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146273u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146274v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146275w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final DescriptorKindFilter f146276x;

    /* renamed from: y, reason: collision with root package name */
    private static final List<Companion.a> f146277y;

    /* renamed from: z, reason: collision with root package name */
    private static final List<Companion.a> f146278z;

    /* renamed from: a, reason: collision with root package name */
    private final List<DescriptorKindExclude> f146279a;

    /* renamed from: b, reason: collision with root package name */
    private final int f146280b;

    @SourceDebugExtension
    public static final class Companion {

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final int f146281a;

            /* renamed from: b, reason: collision with root package name */
            private final String f146282b;

            public a(int i10, String name) {
                Intrinsics.j(name, "name");
                this.f146281a = i10;
                this.f146282b = name;
            }

            public final int a() {
                return this.f146281a;
            }

            public final String b() {
                return this.f146282b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = DescriptorKindFilter.f146256d;
            DescriptorKindFilter.f146256d <<= 1;
            return i10;
        }

        public final int b() {
            return DescriptorKindFilter.f146263k;
        }

        public final int c() {
            return DescriptorKindFilter.f146264l;
        }

        public final int d() {
            return DescriptorKindFilter.f146261i;
        }

        public final int e() {
            return DescriptorKindFilter.f146257e;
        }

        public final int f() {
            return DescriptorKindFilter.f146260h;
        }

        public final int g() {
            return DescriptorKindFilter.f146258f;
        }

        public final int h() {
            return DescriptorKindFilter.f146259g;
        }

        public final int i() {
            return DescriptorKindFilter.f146262j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i10, List<? extends DescriptorKindExclude> excludes) {
        Intrinsics.j(excludes, "excludes");
        this.f146279a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((DescriptorKindExclude) it.next()).a();
        }
        this.f146280b = i10;
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
        return Intrinsics.e(this.f146279a, descriptorKindFilter.f146279a) && this.f146280b == descriptorKindFilter.f146280b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion.a aVar;
        Companion.a aVar2;
        Companion companion = new Companion(null);
        f146255c = companion;
        f146256d = 1;
        int iJ = companion.j();
        f146257e = iJ;
        int iJ2 = companion.j();
        f146258f = iJ2;
        int iJ3 = companion.j();
        f146259g = iJ3;
        int iJ4 = companion.j();
        f146260h = iJ4;
        int iJ5 = companion.j();
        f146261i = iJ5;
        int iJ6 = companion.j();
        f146262j = iJ6;
        int iJ7 = companion.j() - 1;
        f146263k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f146264l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f146265m = i11;
        int i12 = iJ5 | iJ6;
        f146266n = i12;
        int i13 = 2;
        f146267o = new DescriptorKindFilter(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146268p = new DescriptorKindFilter(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146269q = new DescriptorKindFilter(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146270r = new DescriptorKindFilter(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146271s = new DescriptorKindFilter(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146272t = new DescriptorKindFilter(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146273u = new DescriptorKindFilter(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146274v = new DescriptorKindFilter(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146275w = new DescriptorKindFilter(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f146276x = new DescriptorKindFilter(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
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
                int i14 = descriptorKindFilter.f146280b;
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
        f146277y = arrayList2;
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
        f146278z = arrayList5;
    }

    public final boolean a(int i10) {
        return (i10 & this.f146280b) != 0;
    }

    public int hashCode() {
        return (this.f146279a.hashCode() * 31) + this.f146280b;
    }

    public final List<DescriptorKindExclude> l() {
        return this.f146279a;
    }

    public final int m() {
        return this.f146280b;
    }

    public final DescriptorKindFilter n(int i10) {
        int i11 = i10 & this.f146280b;
        if (i11 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i11, this.f146279a);
    }

    public String toString() {
        Object next;
        Iterator<T> it = f146277y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Companion.a) next).a() == this.f146280b) {
                break;
            }
        }
        Companion.a aVar = (Companion.a) next;
        String strB = aVar != null ? aVar.b() : null;
        if (strB == null) {
            List<Companion.a> list = f146278z;
            ArrayList arrayList = new ArrayList();
            for (Companion.a aVar2 : list) {
                String strB2 = a(aVar2.a()) ? aVar2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = CollectionsKt.B0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f146279a + ')';
    }

    public /* synthetic */ DescriptorKindFilter(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
