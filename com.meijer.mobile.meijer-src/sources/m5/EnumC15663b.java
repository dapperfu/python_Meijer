package m5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000bj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lm5/b;", "", "", "readEnabled", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", "a", "Z", "b", "()Z", "e", "c", "d", "f", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC15663b {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15663b f150580c = new EnumC15663b("ENABLED", 0, true, true);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC15663b f150581d = new EnumC15663b("READ_ONLY", 1, true, false);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC15663b f150582e = new EnumC15663b("WRITE_ONLY", 2, false, true);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC15663b f150583f = new EnumC15663b("DISABLED", 3, false, false);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC15663b[] f150584g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f150585h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean readEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean writeEnabled;

    static {
        EnumC15663b[] enumC15663bArrA = a();
        f150584g = enumC15663bArrA;
        f150585h = EnumEntriesKt.a(enumC15663bArrA);
    }

    private static final /* synthetic */ EnumC15663b[] a() {
        return new EnumC15663b[]{f150580c, f150581d, f150582e, f150583f};
    }

    public static EnumC15663b valueOf(String str) {
        return (EnumC15663b) Enum.valueOf(EnumC15663b.class, str);
    }

    public static EnumC15663b[] values() {
        return (EnumC15663b[]) f150584g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }

    private EnumC15663b(String str, int i10, boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
    }
}
