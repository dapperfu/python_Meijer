package k6;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lk6/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC15106i {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15106i f141546a = new EnumC15106i("Immediately", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15106i f141547b = new EnumC15106i("OnIterationFinish", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC15106i[] f141548c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f141549d;

    static {
        EnumC15106i[] enumC15106iArrA = a();
        f141548c = enumC15106iArrA;
        f141549d = EnumEntriesKt.a(enumC15106iArrA);
    }

    private static final /* synthetic */ EnumC15106i[] a() {
        return new EnumC15106i[]{f141546a, f141547b};
    }

    public static EnumC15106i valueOf(String str) {
        return (EnumC15106i) Enum.valueOf(EnumC15106i.class, str);
    }

    public static EnumC15106i[] values() {
        return (EnumC15106i[]) f141548c.clone();
    }

    private EnumC15106i(String str, int i10) {
    }
}
