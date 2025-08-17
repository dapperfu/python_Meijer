package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public abstract class c implements com.google.gson.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f89416a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f89417b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f89418c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f89419d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f89420e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f89421f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f89422g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ c[] f89423h;

    private c(String str, int i10) {
    }

    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f89416a = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String b(Field field) {
                return c.l(field.getName());
            }
        };
        f89417b = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String b(Field field) {
                return c.l(c.e(field.getName(), ' '));
            }
        };
        f89418c = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String b(Field field) {
                return c.e(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f89419d = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String b(Field field) {
                return c.e(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f89420e = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String b(Field field) {
                return c.e(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f89421f = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String b(Field field) {
                return c.e(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f89422g = cVar6;
        f89423h = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }

    static String e(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f89423h.clone();
    }

    static String l(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (!Character.isUpperCase(cCharAt)) {
                    char upperCase = Character.toUpperCase(cCharAt);
                    if (i10 == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
                }
            } else {
                i10++;
            }
        }
        return str;
    }
}
