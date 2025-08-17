package com.meijer.mobile.meijer.search;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/search/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.search.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC12581c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC12581c f113243a = new EnumC12581c("LIMITED_RESULTS_FEATURE_DOES_NOT_APPLY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12581c f113244b = new EnumC12581c("NO_TOKEN_MATCHES_PLUS_SOME_EMBEDDINGS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12581c f113245c = new EnumC12581c("LIMITED_TOKEN_MATCHES_PLUS_SOME_EMBEDDINGS", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC12581c f113246d = new EnumC12581c("NO_TOKENS_MATCHES_PLUS_NO_EMBEDDINGS", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC12581c[] f113247e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f113248f;

    private static final /* synthetic */ EnumC12581c[] a() {
        return new EnumC12581c[]{f113243a, f113244b, f113245c, f113246d};
    }

    static {
        EnumC12581c[] enumC12581cArrA = a();
        f113247e = enumC12581cArrA;
        f113248f = EnumEntriesKt.a(enumC12581cArrA);
    }

    public static EnumC12581c valueOf(String str) {
        return (EnumC12581c) Enum.valueOf(EnumC12581c.class, str);
    }

    public static EnumC12581c[] values() {
        return (EnumC12581c[]) f113247e.clone();
    }

    private EnumC12581c(String str, int i10) {
    }
}
