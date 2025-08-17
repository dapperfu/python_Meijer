package com.scandit.datacapture.tools.internal.sdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/tools/internal/sdk/ProxyGetterKind;", "", "CONSTRUCTOR", "WITH_SETTER", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ProxyGetterKind {
    public static final ProxyGetterKind CONSTRUCTOR;
    public static final ProxyGetterKind WITH_SETTER;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ ProxyGetterKind[] f126269a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f126270b;

    public static EnumEntries<ProxyGetterKind> getEntries() {
        return f126270b;
    }

    public static ProxyGetterKind valueOf(String str) {
        return (ProxyGetterKind) Enum.valueOf(ProxyGetterKind.class, str);
    }

    public static ProxyGetterKind[] values() {
        return (ProxyGetterKind[]) f126269a.clone();
    }

    static {
        ProxyGetterKind proxyGetterKind = new ProxyGetterKind("CONSTRUCTOR", 0);
        CONSTRUCTOR = proxyGetterKind;
        ProxyGetterKind proxyGetterKind2 = new ProxyGetterKind("WITH_SETTER", 1);
        WITH_SETTER = proxyGetterKind2;
        ProxyGetterKind[] proxyGetterKindArr = {proxyGetterKind, proxyGetterKind2};
        f126269a = proxyGetterKindArr;
        f126270b = EnumEntriesKt.a(proxyGetterKindArr);
    }

    private ProxyGetterKind(String str, int i10) {
    }
}
