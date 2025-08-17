package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.lang.reflect.Field;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class Y0 {

    /* renamed from: A, reason: collision with root package name */
    private int f81276A;

    /* renamed from: B, reason: collision with root package name */
    private int f81277B;

    /* renamed from: C, reason: collision with root package name */
    private Field f81278C;

    /* renamed from: D, reason: collision with root package name */
    private Object f81279D;

    /* renamed from: E, reason: collision with root package name */
    private Object f81280E;

    /* renamed from: F, reason: collision with root package name */
    private Object f81281F;

    /* renamed from: a, reason: collision with root package name */
    private final Z0 f81282a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f81283b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f81284c;

    /* renamed from: d, reason: collision with root package name */
    private final int f81285d;

    /* renamed from: e, reason: collision with root package name */
    private final int f81286e;

    /* renamed from: f, reason: collision with root package name */
    private final int f81287f;

    /* renamed from: g, reason: collision with root package name */
    private final int f81288g;

    /* renamed from: h, reason: collision with root package name */
    private final int f81289h;

    /* renamed from: i, reason: collision with root package name */
    private final int f81290i;

    /* renamed from: j, reason: collision with root package name */
    private final int f81291j;

    /* renamed from: k, reason: collision with root package name */
    private final int f81292k;

    /* renamed from: l, reason: collision with root package name */
    private final int f81293l;

    /* renamed from: m, reason: collision with root package name */
    private final int f81294m;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f81295n;

    /* renamed from: o, reason: collision with root package name */
    private int f81296o;

    /* renamed from: p, reason: collision with root package name */
    private int f81297p;

    /* renamed from: q, reason: collision with root package name */
    private int f81298q = a.e.API_PRIORITY_OTHER;

    /* renamed from: r, reason: collision with root package name */
    private int f81299r = Integer.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    private int f81300s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f81301t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f81302u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f81303v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f81304w = 0;

    /* renamed from: x, reason: collision with root package name */
    private int f81305x;

    /* renamed from: y, reason: collision with root package name */
    private int f81306y;

    /* renamed from: z, reason: collision with root package name */
    private int f81307z;

    Y0(Class<?> cls, String str, Object[] objArr) {
        this.f81284c = cls;
        Z0 z02 = new Z0(str);
        this.f81282a = z02;
        this.f81283b = objArr;
        this.f81285d = z02.b();
        int iB = z02.b();
        this.f81286e = iB;
        if (iB == 0) {
            this.f81287f = 0;
            this.f81288g = 0;
            this.f81289h = 0;
            this.f81290i = 0;
            this.f81291j = 0;
            this.f81293l = 0;
            this.f81292k = 0;
            this.f81294m = 0;
            this.f81295n = null;
            return;
        }
        int iB2 = z02.b();
        this.f81287f = iB2;
        int iB3 = z02.b();
        this.f81288g = iB3;
        this.f81289h = z02.b();
        this.f81290i = z02.b();
        this.f81293l = z02.b();
        this.f81292k = z02.b();
        this.f81291j = z02.b();
        this.f81294m = z02.b();
        int iB4 = z02.b();
        this.f81295n = iB4 != 0 ? new int[iB4] : null;
        this.f81296o = (iB2 << 1) + iB3;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString());
        }
    }

    private final Object f() {
        Object[] objArr = this.f81283b;
        int i10 = this.f81296o;
        this.f81296o = i10 + 1;
        return objArr[i10];
    }

    private final boolean i() {
        return (this.f81285d & 1) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean a() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Y0.a():boolean");
    }

    final int g() {
        return this.f81305x;
    }

    final int h() {
        return this.f81307z;
    }

    final boolean k() {
        return this.f81307z > EnumC10278a0.f81350d0.a();
    }

    final Field l() {
        int i10 = this.f81276A << 1;
        Object obj = this.f81283b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f81284c, (String) obj);
        this.f81283b[i10] = fieldC;
        return fieldC;
    }

    final Field m() {
        int i10 = (this.f81276A << 1) + 1;
        Object obj = this.f81283b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f81284c, (String) obj);
        this.f81283b[i10] = fieldC;
        return fieldC;
    }

    final Field n() {
        return this.f81278C;
    }

    final boolean o() {
        return i() && this.f81307z <= EnumC10278a0.f81371w.a();
    }

    final Field p() {
        int i10 = (this.f81287f << 1) + (this.f81277B / 32);
        Object obj = this.f81283b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f81284c, (String) obj);
        this.f81283b[i10] = fieldC;
        return fieldC;
    }

    final int q() {
        return this.f81277B % 32;
    }

    final boolean r() {
        return (this.f81306y & 256) != 0;
    }

    final boolean s() {
        return (this.f81306y & 512) != 0;
    }

    final Object t() {
        return this.f81279D;
    }

    final Object u() {
        return this.f81280E;
    }

    final Object v() {
        return this.f81281F;
    }
}
