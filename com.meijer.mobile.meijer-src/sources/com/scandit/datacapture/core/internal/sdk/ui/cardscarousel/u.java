package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f126657a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f126658b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f126659c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f126660d;

    /* renamed from: e, reason: collision with root package name */
    public static final u f126661e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f126662f;

    /* renamed from: g, reason: collision with root package name */
    public static final u f126663g;

    /* renamed from: h, reason: collision with root package name */
    public static final u f126664h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u[] f126665i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f126666j;

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f126665i.clone();
    }

    static {
        u uVar = new u("TOP_LEFT", 0);
        f126657a = uVar;
        u uVar2 = new u("TOP", 1);
        f126658b = uVar2;
        u uVar3 = new u("TOP_RIGHT", 2);
        f126659c = uVar3;
        u uVar4 = new u("RIGHT", 3);
        f126660d = uVar4;
        u uVar5 = new u("BOTTOM_RIGHT", 4);
        f126661e = uVar5;
        u uVar6 = new u("BOTTOM", 5);
        f126662f = uVar6;
        u uVar7 = new u("BOTTOM_LEFT", 6);
        f126663g = uVar7;
        u uVar8 = new u("LEFT", 7);
        f126664h = uVar8;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8};
        f126665i = uVarArr;
        f126666j = EnumEntriesKt.a(uVarArr);
    }

    public u(String str, int i10) {
    }
}
