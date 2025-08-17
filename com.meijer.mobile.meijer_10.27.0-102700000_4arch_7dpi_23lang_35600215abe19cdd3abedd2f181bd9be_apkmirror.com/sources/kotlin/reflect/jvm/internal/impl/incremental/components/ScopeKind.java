package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ScopeKind {

    /* renamed from: a, reason: collision with root package name */
    public static final ScopeKind f144144a = new ScopeKind("PACKAGE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final ScopeKind f144145b = new ScopeKind("CLASSIFIER", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ScopeKind[] f144146c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144147d;

    private static final /* synthetic */ ScopeKind[] a() {
        return new ScopeKind[]{f144144a, f144145b};
    }

    static {
        ScopeKind[] scopeKindArrA = a();
        f144146c = scopeKindArrA;
        f144147d = EnumEntriesKt.a(scopeKindArrA);
    }

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) f144146c.clone();
    }

    private ScopeKind(String str, int i10) {
    }
}
