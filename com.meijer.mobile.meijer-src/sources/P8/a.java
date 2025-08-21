package P8;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00062\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LP8/a;", "LV8/a;", "", "<init>", "(Ljava/lang/String;I)V", "", "a", "()Ljava/lang/String;", "featureName", "b", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements V8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final a f25706b = new a("MOBILE_ENGAGE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f25707c = new a("PREDICT", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f25708d = new a("EVENT_SERVICE_V4", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f25709e = new a("APP_EVENT_CACHE", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f25710f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f25711g;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LP8/a$a;", "", "<init>", "()V", "", "enumAsString", "LP8/a;", "a", "(Ljava/lang/String;)LP8/a;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: P8.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final a a(String enumAsString) {
            Intrinsics.j(enumAsString, "enumAsString");
            try {
                return a.valueOf(enumAsString);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    static {
        a[] aVarArrB = b();
        f25710f = aVarArrB;
        f25711g = EnumEntriesKt.a(aVarArrB);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ a[] b() {
        return new a[]{f25706b, f25707c, f25708d, f25709e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f25710f.clone();
    }

    private a(String str, int i10) {
    }

    @Override // V8.a
    public String a() {
        String strName = name();
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return "inner_feature_" + lowerCase;
    }
}
