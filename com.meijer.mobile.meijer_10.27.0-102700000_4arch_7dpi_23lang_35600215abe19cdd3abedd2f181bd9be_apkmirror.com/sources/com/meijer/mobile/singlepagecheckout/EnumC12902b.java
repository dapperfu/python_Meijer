package com.meijer.mobile.singlepagecheckout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class EnumC12902b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC12902b f118176a = new EnumC12902b("ITEM1", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12902b f118177b = new EnumC12902b("ITEM2", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12902b f118178c = new EnumC12902b("ITEM3", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC12902b[] f118179d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f118180e;

    private static final /* synthetic */ EnumC12902b[] a() {
        return new EnumC12902b[]{f118176a, f118177b, f118178c};
    }

    public static EnumEntries<EnumC12902b> b() {
        return f118180e;
    }

    static {
        EnumC12902b[] enumC12902bArrA = a();
        f118179d = enumC12902bArrA;
        f118180e = EnumEntriesKt.a(enumC12902bArrA);
    }

    public static EnumC12902b valueOf(String str) {
        return (EnumC12902b) Enum.valueOf(EnumC12902b.class, str);
    }

    public static EnumC12902b[] values() {
        return (EnumC12902b[]) f118179d.clone();
    }

    private EnumC12902b(String str, int i10) {
    }
}
