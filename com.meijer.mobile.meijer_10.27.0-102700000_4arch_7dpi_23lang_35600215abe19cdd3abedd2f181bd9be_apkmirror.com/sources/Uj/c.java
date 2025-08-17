package Uj;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LUj/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f36084a = new c("DEFAULT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f36085b = new c("WELCOME_SHOPPING", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f36086c = new c("WELCOME_REWARDS", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final c f36087d = new c("WELCOME_PICKUP", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final c f36088e = new c("WELCOME_DELIVERY", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ c[] f36089f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f36090g;

    static {
        c[] cVarArrA = a();
        f36089f = cVarArrA;
        f36090g = EnumEntriesKt.a(cVarArrA);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f36084a, f36085b, f36086c, f36087d, f36088e};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f36089f.clone();
    }

    private c(String str, int i10) {
    }
}
