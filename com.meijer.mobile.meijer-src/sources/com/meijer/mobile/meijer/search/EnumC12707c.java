package com.meijer.mobile.meijer.search;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/search/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.search.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC12707c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC12707c f114096a = new EnumC12707c("LIMITED_RESULTS_FEATURE_DOES_NOT_APPLY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12707c f114097b = new EnumC12707c("NO_TOKEN_MATCHES_PLUS_SOME_EMBEDDINGS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12707c f114098c = new EnumC12707c("LIMITED_TOKEN_MATCHES_PLUS_SOME_EMBEDDINGS", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC12707c f114099d = new EnumC12707c("NO_TOKENS_MATCHES_PLUS_NO_EMBEDDINGS", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC12707c[] f114100e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f114101f;

    private static final /* synthetic */ EnumC12707c[] a() {
        return new EnumC12707c[]{f114096a, f114097b, f114098c, f114099d};
    }

    static {
        EnumC12707c[] enumC12707cArrA = a();
        f114100e = enumC12707cArrA;
        f114101f = EnumEntriesKt.a(enumC12707cArrA);
    }

    public static EnumC12707c valueOf(String str) {
        return (EnumC12707c) Enum.valueOf(EnumC12707c.class, str);
    }

    public static EnumC12707c[] values() {
        return (EnumC12707c[]) f114100e.clone();
    }

    private EnumC12707c(String str, int i10) {
    }
}
