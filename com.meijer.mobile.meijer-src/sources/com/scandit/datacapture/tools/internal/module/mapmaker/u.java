package com.scandit.datacapture.tools.internal.module.mapmaker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final C13544s f127211a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f127212b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f127213c;

    public abstract AbstractC13531e a();

    static {
        C13544s c13544s = new C13544s();
        f127211a = c13544s;
        t tVar = new t();
        f127212b = tVar;
        f127213c = new u[]{c13544s, tVar};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f127213c.clone();
    }

    public u(String str, int i10) {
    }
}
