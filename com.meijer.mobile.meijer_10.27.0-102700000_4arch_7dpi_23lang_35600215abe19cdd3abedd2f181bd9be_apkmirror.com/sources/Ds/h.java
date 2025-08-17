package Ds;

import j$.time.LocalTime;
import java.util.regex.Pattern;
import kj.C15170c;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import vk.C17590a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LDs/h;", "", "<init>", "()V", "", "email", "", "a", "(Ljava/lang/CharSequence;)Z", "", "timeValue", "c", "(Ljava/lang/String;)Z", "intValue", "", "minValue", "maxValue", "b", "(Ljava/lang/String;II)Z", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "PIN_PATTERN", "ZIP_CODE_PATTERN", "d", "getEMAIL_ADDRESS", "()Ljava/util/regex/Pattern;", "EMAIL_ADDRESS", "e", "US_OR_CANADIAN_POSTAL_CODE_PATTERN", "", "f", "[Ljava/lang/String;", "getPIN_CODE_BLACKLIST", "()[Ljava/lang/String;", "PIN_CODE_BLACKLIST", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7341a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Pattern PIN_PATTERN;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Pattern ZIP_CODE_PATTERN;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Pattern EMAIL_ADDRESS;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Pattern US_OR_CANADIAN_POSTAL_CODE_PATTERN;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final String[] PIN_CODE_BLACKLIST;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7347g;

    static {
        Pattern patternCompile = Pattern.compile("^[0-9]{4}$", 8);
        Intrinsics.i(patternCompile, "compile(...)");
        PIN_PATTERN = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^[0-9]{5}$");
        Intrinsics.i(patternCompile2, "compile(...)");
        ZIP_CODE_PATTERN = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        Intrinsics.i(patternCompile3, "compile(...)");
        EMAIL_ADDRESS = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("(^[0-9]{5}$)|(^[AaBbCcEeGgHhJ-Nj-nPpRrSsTtVvXxYy][0-9][AaBbCcEeGgHhJ-Nj-nPpRrSsTtV-Zv-z] ?[0-9][AaBbCcEeGgHhJ-Nj-nPpRrSsTtV-Zv-z][0-9]$)");
        Intrinsics.i(patternCompile4, "compile(...)");
        US_OR_CANADIAN_POSTAL_CODE_PATTERN = patternCompile4;
        PIN_CODE_BLACKLIST = new String[]{"0000"};
        f7347g = 8;
    }

    public final boolean a(CharSequence email) {
        return email != null && EMAIL_ADDRESS.matcher(email).matches();
    }

    public final boolean b(String intValue, int minValue, int maxValue) {
        IntRange intRange = new IntRange(minValue, maxValue);
        Integer numV = intValue != null ? StringsKt.v(intValue) : null;
        return numV != null && intRange.p(numV.intValue());
    }

    public final boolean c(String timeValue) {
        return (timeValue != null ? (LocalTime) vk.d.b(timeValue, C17590a.f164803a.v(), new C15170c()) : null) != null;
    }

    private h() {
    }
}
