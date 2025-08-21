package com.meijer.mobile.singlepagecheckout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class EnumC13028b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13028b f119168a = new EnumC13028b("ITEM1", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13028b f119169b = new EnumC13028b("ITEM2", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13028b f119170c = new EnumC13028b("ITEM3", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC13028b[] f119171d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f119172e;

    private static final /* synthetic */ EnumC13028b[] a() {
        return new EnumC13028b[]{f119168a, f119169b, f119170c};
    }

    public static EnumEntries<EnumC13028b> b() {
        return f119172e;
    }

    static {
        EnumC13028b[] enumC13028bArrA = a();
        f119171d = enumC13028bArrA;
        f119172e = EnumEntriesKt.a(enumC13028bArrA);
    }

    public static EnumC13028b valueOf(String str) {
        return (EnumC13028b) Enum.valueOf(EnumC13028b.class, str);
    }

    public static EnumC13028b[] values() {
        return (EnumC13028b[]) f119171d.clone();
    }

    private EnumC13028b(String str, int i10) {
    }
}
