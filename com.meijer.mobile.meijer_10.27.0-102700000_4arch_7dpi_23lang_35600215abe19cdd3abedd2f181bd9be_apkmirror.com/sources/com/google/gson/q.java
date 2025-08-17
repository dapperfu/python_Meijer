package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f89697a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f89698b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ q[] f89699c;

    enum a extends q {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    private q(String str, int i10) {
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f89697a = aVar;
        q qVar = new q("STRING", 1) { // from class: com.google.gson.q.b
            {
                a aVar2 = null;
            }
        };
        f89698b = qVar;
        f89699c = new q[]{aVar, qVar};
    }

    /* synthetic */ q(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f89699c.clone();
    }
}
