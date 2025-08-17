package com.scandit.datacapture.tools.internal.module.mapmaker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final C13411s f126259a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f126260b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f126261c;

    public abstract AbstractC13398e a();

    static {
        C13411s c13411s = new C13411s();
        f126259a = c13411s;
        t tVar = new t();
        f126260b = tVar;
        f126261c = new u[]{c13411s, tVar};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f126261c.clone();
    }

    public u(String str, int i10) {
    }
}
