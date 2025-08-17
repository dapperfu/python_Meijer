package Dh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LDh/e;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC3372e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3372e f6513c = new EnumC3372e("BILLING", 0, 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3372e f6514d = new EnumC3372e("SHIPPING", 1, 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3372e f6515e = new EnumC3372e("UNKNOWN", 2, 99);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC3372e[] f6516f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6517g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LDh/e$a;", "", "<init>", "()V", "", "anInt", "LDh/e;", "a", "(I)LDh/e;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Dh.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC3372e a(int anInt) {
            return anInt != 2 ? anInt != 3 ? EnumC3372e.f6515e : EnumC3372e.f6514d : EnumC3372e.f6513c;
        }

        private Companion() {
        }
    }

    static {
        EnumC3372e[] enumC3372eArrA = a();
        f6516f = enumC3372eArrA;
        f6517g = EnumEntriesKt.a(enumC3372eArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ EnumC3372e[] a() {
        return new EnumC3372e[]{f6513c, f6514d, f6515e};
    }

    public static EnumC3372e valueOf(String str) {
        return (EnumC3372e) Enum.valueOf(EnumC3372e.class, str);
    }

    public static EnumC3372e[] values() {
        return (EnumC3372e[]) f6516f.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private EnumC3372e(String str, int i10, int i11) {
        this.value = i11;
    }
}
