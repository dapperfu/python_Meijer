package ej;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lej/H;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final H f128847b = new H("CreditAuth", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final H f128848c = new H("CreditCapture", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final H f128849d = new H("CreditSale", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final H f128850e = new H("None", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ H[] f128851f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f128852g;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lej/H$a;", "", "<init>", "()V", "", "transaction", "Lej/H;", "a", "(Ljava/lang/String;)Lej/H;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ej.H$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final H a(String transaction) {
            Intrinsics.j(transaction, "transaction");
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            String lowerCase = transaction.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -675577299) {
                if (iHashCode != -563911647) {
                    if (iHashCode == -563394880 && lowerCase.equals("creditsale")) {
                        return H.f128849d;
                    }
                } else if (lowerCase.equals("creditauth")) {
                    return H.f128847b;
                }
            } else if (lowerCase.equals("creditcapture")) {
                return H.f128848c;
            }
            return H.f128850e;
        }
    }

    static {
        H[] hArrA = a();
        f128851f = hArrA;
        f128852g = EnumEntriesKt.a(hArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ H[] a() {
        return new H[]{f128847b, f128848c, f128849d, f128850e};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f128851f.clone();
    }

    private H(String str, int i10) {
    }
}
