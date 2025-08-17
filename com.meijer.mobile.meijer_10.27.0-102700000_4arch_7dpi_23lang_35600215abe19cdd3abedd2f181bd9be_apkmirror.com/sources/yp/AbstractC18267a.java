package yp;

import Ji.C;
import ak.AbstractC5607a;
import com.meijer.mobile.rateandtip.ux.C12702a;
import ej.CardType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000e2\u00020\u0001:\b\b\u000f\u0010\u0011\u0012\u0013\u000e\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lyp/a;", "", "LJi/C$g;", "cardIcon", "Lak/a;", "maskedCardNumber", "<init>", "(LJi/C$g;Lak/a;)V", "a", "LJi/C$g;", "()LJi/C$g;", "b", "Lak/a;", "()Lak/a;", "c", "h", "d", "e", "f", "g", "Lyp/a$a;", "Lyp/a$c;", "Lyp/a$d;", "Lyp/a$e;", "Lyp/a$f;", "Lyp/a$g;", "Lyp/a$h;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC18267a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f170834d = AbstractC5607a.f45514b | C.g.f15525d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C.g cardIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a maskedCardNumber;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lyp/a$a;", "Lyp/a;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getCardNumber", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class AmericanExpress extends AbstractC18267a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f170837f = AbstractC5607a.f45514b | C.g.f15525d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AmericanExpress) && Intrinsics.e(this.cardNumber, ((AmericanExpress) other).cardNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmericanExpress(String cardNumber) {
            super(C.g.a.f15527e, AbstractC5607a.INSTANCE.d(C12702a.f115093a, cardNumber), null);
            Intrinsics.j(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "AmericanExpress(cardNumber=" + this.cardNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyp/a$b;", "", "<init>", "()V", "", "cardName", "cardNumber", "Lyp/a;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lyp/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AbstractC18267a a(String cardName, String cardNumber) {
            CardType.Companion companion = CardType.INSTANCE;
            if (Intrinsics.e(cardName, companion.h().getName())) {
                if (cardNumber == null) {
                    cardNumber = "";
                }
                return new Visa(cardNumber);
            }
            if (Intrinsics.e(cardName, companion.e().getName())) {
                if (cardNumber == null) {
                    cardNumber = "";
                }
                return new Mastercard(cardNumber);
            }
            if (Intrinsics.e(cardName, companion.c().getName())) {
                if (cardNumber == null) {
                    cardNumber = "";
                }
                return new Discover(cardNumber);
            }
            if (Intrinsics.e(cardName, companion.a().getName())) {
                if (cardNumber == null) {
                    cardNumber = "";
                }
                return new AmericanExpress(cardNumber);
            }
            if (Intrinsics.e(cardName, companion.g().getName())) {
                if (cardNumber == null) {
                    cardNumber = "";
                }
                return new MeijerMasterCard(cardNumber);
            }
            if (Intrinsics.e(cardName, companion.f().getName())) {
                if (cardNumber == null) {
                    cardNumber = "";
                }
                return new MeijerCreditCard(cardNumber);
            }
            if (cardNumber == null) {
                cardNumber = "";
            }
            return new DefaultCard(cardNumber);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lyp/a$c;", "Lyp/a;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getCardNumber", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$c, reason: from toString */
    public static final /* data */ class DefaultCard extends AbstractC18267a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f170839f = AbstractC5607a.f45514b | C.g.f15525d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DefaultCard) && Intrinsics.e(this.cardNumber, ((DefaultCard) other).cardNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultCard(String cardNumber) {
            super(C.g.c.f15529e, AbstractC5607a.INSTANCE.d(C12702a.f115097e, cardNumber), null);
            Intrinsics.j(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "DefaultCard(cardNumber=" + this.cardNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lyp/a$d;", "Lyp/a;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getCardNumber", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$d, reason: from toString */
    public static final /* data */ class Discover extends AbstractC18267a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f170841f = AbstractC5607a.f45514b | C.g.f15525d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Discover) && Intrinsics.e(this.cardNumber, ((Discover) other).cardNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Discover(String cardNumber) {
            super(C.g.e.f15531e, AbstractC5607a.INSTANCE.d(C12702a.f115098f, cardNumber), null);
            Intrinsics.j(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "Discover(cardNumber=" + this.cardNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lyp/a$e;", "Lyp/a;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getCardNumber", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$e, reason: from toString */
    public static final /* data */ class Mastercard extends AbstractC18267a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f170843f = AbstractC5607a.f45514b | C.g.f15525d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Mastercard) && Intrinsics.e(this.cardNumber, ((Mastercard) other).cardNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Mastercard(String cardNumber) {
            super(C.g.h.f15535e, AbstractC5607a.INSTANCE.d(C12702a.f115105m, cardNumber), null);
            Intrinsics.j(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "Mastercard(cardNumber=" + this.cardNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lyp/a$f;", "Lyp/a;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getCardNumber", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$f, reason: from toString */
    public static final /* data */ class MeijerCreditCard extends AbstractC18267a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f170845f = AbstractC5607a.f45514b | C.g.f15525d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MeijerCreditCard) && Intrinsics.e(this.cardNumber, ((MeijerCreditCard) other).cardNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MeijerCreditCard(String cardNumber) {
            super(C.g.i.f15536e, AbstractC5607a.INSTANCE.d(C12702a.f115106n, cardNumber), null);
            Intrinsics.j(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "MeijerCreditCard(cardNumber=" + this.cardNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lyp/a$g;", "Lyp/a;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getCardNumber", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$g, reason: from toString */
    public static final /* data */ class MeijerMasterCard extends AbstractC18267a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f170847f = AbstractC5607a.f45514b | C.g.f15525d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MeijerMasterCard) && Intrinsics.e(this.cardNumber, ((MeijerMasterCard) other).cardNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MeijerMasterCard(String cardNumber) {
            super(C.g.i.f15536e, AbstractC5607a.INSTANCE.d(C12702a.f115107o, cardNumber), null);
            Intrinsics.j(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "MeijerMasterCard(cardNumber=" + this.cardNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lyp/a$h;", "Lyp/a;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getCardNumber", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yp.a$h, reason: from toString */
    public static final /* data */ class Visa extends AbstractC18267a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f170849f = AbstractC5607a.f45514b | C.g.f15525d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Visa) && Intrinsics.e(this.cardNumber, ((Visa) other).cardNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Visa(String cardNumber) {
            super(C.g.k.f15538e, AbstractC5607a.INSTANCE.d(C12702a.f115092I, cardNumber), null);
            Intrinsics.j(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "Visa(cardNumber=" + this.cardNumber + ')';
        }
    }

    public /* synthetic */ AbstractC18267a(C.g gVar, AbstractC5607a abstractC5607a, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, abstractC5607a);
    }

    private AbstractC18267a(C.g gVar, AbstractC5607a abstractC5607a) {
        this.cardIcon = gVar;
        this.maskedCardNumber = abstractC5607a;
    }

    /* renamed from: a, reason: from getter */
    public final C.g getCardIcon() {
        return this.cardIcon;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getMaskedCardNumber() {
        return this.maskedCardNumber;
    }
}
