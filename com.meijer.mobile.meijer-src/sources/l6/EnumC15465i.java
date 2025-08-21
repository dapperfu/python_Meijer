package l6;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ll6/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC15465i {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15465i f149443a = new EnumC15465i("Immediately", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15465i f149444b = new EnumC15465i("OnIterationFinish", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC15465i[] f149445c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f149446d;

    static {
        EnumC15465i[] enumC15465iArrA = a();
        f149445c = enumC15465iArrA;
        f149446d = EnumEntriesKt.a(enumC15465iArrA);
    }

    private static final /* synthetic */ EnumC15465i[] a() {
        return new EnumC15465i[]{f149443a, f149444b};
    }

    public static EnumC15465i valueOf(String str) {
        return (EnumC15465i) Enum.valueOf(EnumC15465i.class, str);
    }

    public static EnumC15465i[] values() {
        return (EnumC15465i[]) f149445c.clone();
    }

    private EnumC15465i(String str, int i10) {
    }
}
