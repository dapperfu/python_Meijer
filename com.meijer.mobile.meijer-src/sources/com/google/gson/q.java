package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f90539a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f90540b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ q[] f90541c;

    enum a extends q {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    private q(String str, int i10) {
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f90539a = aVar;
        q qVar = new q("STRING", 1) { // from class: com.google.gson.q.b
            {
                a aVar2 = null;
            }
        };
        f90540b = qVar;
        f90541c = new q[]{aVar, qVar};
    }

    /* synthetic */ q(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f90541c.clone();
    }
}
