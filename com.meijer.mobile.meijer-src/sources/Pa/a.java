package Pa;

import H9.m;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LPa/a;", "LH9/m;", "", "<init>", "(Ljava/lang/String;I)V", "", "getKey", "()Ljava/lang/String;", "a", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25752a = new a("PREDICT_SERVICE_URL", 0);

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a[] f25753b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f25754c;

    static {
        a[] aVarArrA = a();
        f25753b = aVarArrA;
        f25754c = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f25752a};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f25753b.clone();
    }

    private a(String str, int i10) {
    }

    @Override // H9.m
    public String getKey() {
        String strName = name();
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return "predict_" + lowerCase;
    }
}
