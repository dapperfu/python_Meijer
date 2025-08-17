package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ErrorEntity {

    /* renamed from: b, reason: collision with root package name */
    public static final ErrorEntity f146860b = new ErrorEntity("ERROR_CLASS", 0, "<Error class: %s>");

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorEntity f146861c = new ErrorEntity("ERROR_FUNCTION", 1, "<Error function>");

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorEntity f146862d = new ErrorEntity("ERROR_SCOPE", 2, "<Error scope>");

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorEntity f146863e = new ErrorEntity("ERROR_MODULE", 3, "<Error module>");

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorEntity f146864f = new ErrorEntity("ERROR_PROPERTY", 4, "<Error property>");

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorEntity f146865g = new ErrorEntity("ERROR_TYPE", 5, "[Error type: %s]");

    /* renamed from: h, reason: collision with root package name */
    public static final ErrorEntity f146866h = new ErrorEntity("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ ErrorEntity[] f146867i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146868j;

    /* renamed from: a, reason: collision with root package name */
    private final String f146869a;

    private static final /* synthetic */ ErrorEntity[] a() {
        return new ErrorEntity[]{f146860b, f146861c, f146862d, f146863e, f146864f, f146865g, f146866h};
    }

    static {
        ErrorEntity[] errorEntityArrA = a();
        f146867i = errorEntityArrA;
        f146868j = EnumEntriesKt.a(errorEntityArrA);
    }

    public static ErrorEntity valueOf(String str) {
        return (ErrorEntity) Enum.valueOf(ErrorEntity.class, str);
    }

    public static ErrorEntity[] values() {
        return (ErrorEntity[]) f146867i.clone();
    }

    public final String b() {
        return this.f146869a;
    }

    private ErrorEntity(String str, int i10, String str2) {
        this.f146869a = str2;
    }
}
