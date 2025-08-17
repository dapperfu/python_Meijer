package ej;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lej/d;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "j", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class CardType {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final CardType f128883d = new CardType("visa", "Visa");

    /* renamed from: e, reason: collision with root package name */
    private static final CardType f128884e = new CardType("master", "Mastercard");

    /* renamed from: f, reason: collision with root package name */
    private static final CardType f128885f = new CardType("amex", "American Express");

    /* renamed from: g, reason: collision with root package name */
    private static final CardType f128886g = new CardType("discover", "Discover");

    /* renamed from: h, reason: collision with root package name */
    private static final CardType f128887h = new CardType("diners", "Diner's Club");

    /* renamed from: i, reason: collision with root package name */
    private static final CardType f128888i = new CardType("maestro", "Meijer Credit Card");

    /* renamed from: j, reason: collision with root package name */
    private static final CardType f128889j = new CardType("switch", "Switch");

    /* renamed from: k, reason: collision with root package name */
    private static final CardType f128890k = new CardType("meijer_mastercard", "Meijer MasterCard");

    /* renamed from: l, reason: collision with root package name */
    private static final CardType f128891l = new CardType("meijer credit card", "Meijer CreditCard");

    /* renamed from: m, reason: collision with root package name */
    private static final CardType f128892m = new CardType("alliance", "Alliance");

    /* renamed from: n, reason: collision with root package name */
    private static final CardType f128893n = new CardType("ebtCard", "EBT - Food");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lej/d$a;", "", "<init>", "()V", "Lej/d;", "VISA", "Lej/d;", "h", "()Lej/d;", "MASTERCARD", "e", "AMEX", "a", "DISCOVER", "c", "DINERS", "b", "MEIJER_MASTER_CARD", "g", "MEIJER_CREDIT_CARD", "f", "EBT", "d", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ej.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CardType a() {
            return CardType.f128885f;
        }

        public final CardType b() {
            return CardType.f128887h;
        }

        public final CardType c() {
            return CardType.f128886g;
        }

        public final CardType d() {
            return CardType.f128893n;
        }

        public final CardType e() {
            return CardType.f128884e;
        }

        public final CardType f() {
            return CardType.f128891l;
        }

        public final CardType g() {
            return CardType.f128890k;
        }

        public final CardType h() {
            return CardType.f128883d;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardType)) {
            return false;
        }
        CardType cardType = (CardType) other;
        return Intrinsics.e(this.code, cardType.code) && Intrinsics.e(this.name, cardType.name);
    }

    public CardType(String code, String name) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        this.code = code;
        this.name = name;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.name.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public String toString() {
        return "CardType(code=" + this.code + ", name=" + this.name + ')';
    }
}
