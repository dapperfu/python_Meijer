package Eh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"LEh/g;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3243g {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3243g f7553b = new EnumC3243g("NO_CONFLICT", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3243g f7554c = new EnumC3243g("DIGITAL_CONFLICT", 1, 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC3243g[] f7555d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7556e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    static {
        EnumC3243g[] enumC3243gArrA = a();
        f7555d = enumC3243gArrA;
        f7556e = EnumEntriesKt.a(enumC3243gArrA);
    }

    private static final /* synthetic */ EnumC3243g[] a() {
        return new EnumC3243g[]{f7553b, f7554c};
    }

    public static EnumC3243g valueOf(String str) {
        return (EnumC3243g) Enum.valueOf(EnumC3243g.class, str);
    }

    public static EnumC3243g[] values() {
        return (EnumC3243g[]) f7555d.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private EnumC3243g(String str, int i10, int i11) {
        this.value = i11;
    }
}
