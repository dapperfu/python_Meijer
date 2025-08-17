package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f125705a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f125706b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f125707c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f125708d;

    /* renamed from: e, reason: collision with root package name */
    public static final u f125709e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f125710f;

    /* renamed from: g, reason: collision with root package name */
    public static final u f125711g;

    /* renamed from: h, reason: collision with root package name */
    public static final u f125712h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u[] f125713i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f125714j;

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f125713i.clone();
    }

    static {
        u uVar = new u("TOP_LEFT", 0);
        f125705a = uVar;
        u uVar2 = new u("TOP", 1);
        f125706b = uVar2;
        u uVar3 = new u("TOP_RIGHT", 2);
        f125707c = uVar3;
        u uVar4 = new u("RIGHT", 3);
        f125708d = uVar4;
        u uVar5 = new u("BOTTOM_RIGHT", 4);
        f125709e = uVar5;
        u uVar6 = new u("BOTTOM", 5);
        f125710f = uVar6;
        u uVar7 = new u("BOTTOM_LEFT", 6);
        f125711g = uVar7;
        u uVar8 = new u("LEFT", 7);
        f125712h = uVar8;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8};
        f125713i = uVarArr;
        f125714j = EnumEntriesKt.a(uVarArr);
    }

    public u(String str, int i10) {
    }
}
