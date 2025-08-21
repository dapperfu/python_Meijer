package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.lang.reflect.Field;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class Y0 {

    /* renamed from: A, reason: collision with root package name */
    private int f82116A;

    /* renamed from: B, reason: collision with root package name */
    private int f82117B;

    /* renamed from: C, reason: collision with root package name */
    private Field f82118C;

    /* renamed from: D, reason: collision with root package name */
    private Object f82119D;

    /* renamed from: E, reason: collision with root package name */
    private Object f82120E;

    /* renamed from: F, reason: collision with root package name */
    private Object f82121F;

    /* renamed from: a, reason: collision with root package name */
    private final Z0 f82122a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f82123b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f82124c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82125d;

    /* renamed from: e, reason: collision with root package name */
    private final int f82126e;

    /* renamed from: f, reason: collision with root package name */
    private final int f82127f;

    /* renamed from: g, reason: collision with root package name */
    private final int f82128g;

    /* renamed from: h, reason: collision with root package name */
    private final int f82129h;

    /* renamed from: i, reason: collision with root package name */
    private final int f82130i;

    /* renamed from: j, reason: collision with root package name */
    private final int f82131j;

    /* renamed from: k, reason: collision with root package name */
    private final int f82132k;

    /* renamed from: l, reason: collision with root package name */
    private final int f82133l;

    /* renamed from: m, reason: collision with root package name */
    private final int f82134m;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f82135n;

    /* renamed from: o, reason: collision with root package name */
    private int f82136o;

    /* renamed from: p, reason: collision with root package name */
    private int f82137p;

    /* renamed from: q, reason: collision with root package name */
    private int f82138q = a.e.API_PRIORITY_OTHER;

    /* renamed from: r, reason: collision with root package name */
    private int f82139r = Integer.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    private int f82140s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f82141t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f82142u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f82143v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f82144w = 0;

    /* renamed from: x, reason: collision with root package name */
    private int f82145x;

    /* renamed from: y, reason: collision with root package name */
    private int f82146y;

    /* renamed from: z, reason: collision with root package name */
    private int f82147z;

    Y0(Class<?> cls, String str, Object[] objArr) {
        this.f82124c = cls;
        Z0 z02 = new Z0(str);
        this.f82122a = z02;
        this.f82123b = objArr;
        this.f82125d = z02.b();
        int iB = z02.b();
        this.f82126e = iB;
        if (iB == 0) {
            this.f82127f = 0;
            this.f82128g = 0;
            this.f82129h = 0;
            this.f82130i = 0;
            this.f82131j = 0;
            this.f82133l = 0;
            this.f82132k = 0;
            this.f82134m = 0;
            this.f82135n = null;
            return;
        }
        int iB2 = z02.b();
        this.f82127f = iB2;
        int iB3 = z02.b();
        this.f82128g = iB3;
        this.f82129h = z02.b();
        this.f82130i = z02.b();
        this.f82133l = z02.b();
        this.f82132k = z02.b();
        this.f82131j = z02.b();
        this.f82134m = z02.b();
        int iB4 = z02.b();
        this.f82135n = iB4 != 0 ? new int[iB4] : null;
        this.f82136o = (iB2 << 1) + iB3;
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
        Object[] objArr = this.f82123b;
        int i10 = this.f82136o;
        this.f82136o = i10 + 1;
        return objArr[i10];
    }

    private final boolean i() {
        return (this.f82125d & 1) == 1;
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
        return this.f82145x;
    }

    final int h() {
        return this.f82147z;
    }

    final boolean k() {
        return this.f82147z > EnumC10403a0.f82190d0.a();
    }

    final Field l() {
        int i10 = this.f82116A << 1;
        Object obj = this.f82123b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f82124c, (String) obj);
        this.f82123b[i10] = fieldC;
        return fieldC;
    }

    final Field m() {
        int i10 = (this.f82116A << 1) + 1;
        Object obj = this.f82123b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f82124c, (String) obj);
        this.f82123b[i10] = fieldC;
        return fieldC;
    }

    final Field n() {
        return this.f82118C;
    }

    final boolean o() {
        return i() && this.f82147z <= EnumC10403a0.f82211w.a();
    }

    final Field p() {
        int i10 = (this.f82127f << 1) + (this.f82117B / 32);
        Object obj = this.f82123b[i10];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f82124c, (String) obj);
        this.f82123b[i10] = fieldC;
        return fieldC;
    }

    final int q() {
        return this.f82117B % 32;
    }

    final boolean r() {
        return (this.f82146y & 256) != 0;
    }

    final boolean s() {
        return (this.f82146y & 512) != 0;
    }

    final Object t() {
        return this.f82119D;
    }

    final Object u() {
        return this.f82120E;
    }

    final Object v() {
        return this.f82121F;
    }
}
