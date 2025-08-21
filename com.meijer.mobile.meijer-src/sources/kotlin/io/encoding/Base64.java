package kotlin.io.encoding;

import fsimpl.C14170dq;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalEncodingApi
@SinceKotlin
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "", "isUrlSafe", "isMimeScheme", "Lkotlin/io/encoding/Base64$PaddingOption;", "paddingOption", "<init>", "(ZZLkotlin/io/encoding/Base64$PaddingOption;)V", "a", "Z", "isUrlSafe$kotlin_stdlib", "()Z", "b", "isMimeScheme$kotlin_stdlib", "c", "Lkotlin/io/encoding/Base64$PaddingOption;", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "d", "PaddingOption", "Default", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public class Base64 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f143647e = {C14170dq.DARKEN, 10};

    /* renamed from: f, reason: collision with root package name */
    private static final Base64 f143648f;

    /* renamed from: g, reason: collision with root package name */
    private static final Base64 f143649g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isUrlSafe;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isMimeScheme;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaddingOption paddingOption;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @SinceKotlin
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaddingOption {

        /* renamed from: a, reason: collision with root package name */
        public static final PaddingOption f143653a = new PaddingOption("PRESENT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final PaddingOption f143654b = new PaddingOption("ABSENT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final PaddingOption f143655c = new PaddingOption("PRESENT_OPTIONAL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final PaddingOption f143656d = new PaddingOption("ABSENT_OPTIONAL", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ PaddingOption[] f143657e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f143658f;

        private static final /* synthetic */ PaddingOption[] a() {
            return new PaddingOption[]{f143653a, f143654b, f143655c, f143656d};
        }

        static {
            PaddingOption[] paddingOptionArrA = a();
            f143657e = paddingOptionArrA;
            f143658f = EnumEntriesKt.a(paddingOptionArrA);
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) f143657e.clone();
        }

        private PaddingOption(String str, int i10) {
        }
    }

    public /* synthetic */ Base64(boolean z10, boolean z11, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, paddingOption);
    }

    static {
        PaddingOption paddingOption = PaddingOption.f143653a;
        f143648f = new Base64(true, false, paddingOption);
        f143649g = new Base64(false, true, paddingOption);
    }

    private Base64(boolean z10, boolean z11, PaddingOption paddingOption) {
        this.isUrlSafe = z10;
        this.isMimeScheme = z11;
        this.paddingOption = paddingOption;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
