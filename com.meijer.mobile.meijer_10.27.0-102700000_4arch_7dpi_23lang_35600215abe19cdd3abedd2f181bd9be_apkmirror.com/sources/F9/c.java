package F9;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LF9/c;", "LF9/m;", "", "<init>", "(Ljava/lang/String;I)V", "", "getKey", "()Ljava/lang/String;", "a", "b", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10316a = new c("HARDWARE_ID", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f10317b = new c("LOG_LEVEL", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ c[] f10318c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10319d;

    static {
        c[] cVarArrA = a();
        f10318c = cVarArrA;
        f10319d = EnumEntriesKt.a(cVarArrA);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f10316a, f10317b};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10318c.clone();
    }

    private c(String str, int i10) {
    }

    @Override // F9.m
    public String getKey() {
        String strName = name();
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return "core_" + lowerCase;
    }
}
