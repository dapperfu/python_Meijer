package xn;

import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lxn/a;", "", "<init>", "()V", "b", "f", "j", "h", "i", "g", "d", "a", "c", "e", "Lxn/a$a;", "Lxn/a$b;", "Lxn/a$c;", "Lxn/a$d;", "Lxn/a$e;", "Lxn/a$f;", "Lxn/a$g;", "Lxn/a$h;", "Lxn/a$i;", "Lxn/a$j;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xn.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC18200a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxn/a$a;", "Lxn/a;", "", "accepted", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class AcceptTermsAndConditions extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean accepted;

        public AcceptTermsAndConditions(boolean z10) {
            super(null);
            this.accepted = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AcceptTermsAndConditions) && this.accepted == ((AcceptTermsAndConditions) other).accepted;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getAccepted() {
            return this.accepted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.accepted);
        }

        public String toString() {
            return "AcceptTermsAndConditions(accepted=" + this.accepted + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxn/a$b;", "Lxn/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$b */
    public static final /* data */ class b extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f170877a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public String toString() {
            return "ApplyToday";
        }

        public int hashCode() {
            return 994143561;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lxn/a$c;", "Lxn/a;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$c, reason: from toString */
    public static final /* data */ class CallHelpLine extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CallHelpLine) && Intrinsics.e(this.phoneNumber, ((CallHelpLine) other).phoneNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallHelpLine(String phoneNumber) {
            super(null);
            Intrinsics.j(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
        }

        /* renamed from: a, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public String toString() {
            return "CallHelpLine(phoneNumber=" + this.phoneNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxn/a$d;", "Lxn/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$d */
    public static final /* data */ class d extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f170879a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public String toString() {
            return "DisplayTermsAndConditions";
        }

        public int hashCode() {
            return -1076110732;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lxn/a$e;", "Lxn/a;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$e, reason: from toString */
    public static final /* data */ class ErrorMessageClicked extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorMessageClicked) && Intrinsics.e(this.url, ((ErrorMessageClicked) other).url);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorMessageClicked(String url) {
            super(null);
            Intrinsics.j(url, "url");
            this.url = url;
        }

        /* renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "ErrorMessageClicked(url=" + this.url + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxn/a$f;", "Lxn/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$f */
    public static final /* data */ class f extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f170881a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public String toString() {
            return "SubmitMccDetails";
        }

        public int hashCode() {
            return -3690877;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lxn/a$g;", "Lxn/a;", "j$/time/LocalDate", "date", "<init>", "(Lj$/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$g, reason: from toString */
    public static final /* data */ class UpdateDateOfBirth extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate date;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateDateOfBirth) && Intrinsics.e(this.date, ((UpdateDateOfBirth) other).date);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateDateOfBirth(LocalDate date) {
            super(null);
            Intrinsics.j(date, "date");
            this.date = date;
        }

        /* renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return "UpdateDateOfBirth(date=" + this.date + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lxn/a$h;", "Lxn/a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$h, reason: from toString */
    public static final /* data */ class UpdateFirstName extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateFirstName) && Intrinsics.e(this.value, ((UpdateFirstName) other).value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateFirstName(String value) {
            super(null);
            Intrinsics.j(value, "value");
            this.value = value;
        }

        /* renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UpdateFirstName(value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lxn/a$i;", "Lxn/a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$i, reason: from toString */
    public static final /* data */ class UpdateLastFourDigits extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateLastFourDigits) && Intrinsics.e(this.value, ((UpdateLastFourDigits) other).value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateLastFourDigits(String value) {
            super(null);
            Intrinsics.j(value, "value");
            this.value = value;
        }

        /* renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UpdateLastFourDigits(value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lxn/a$j;", "Lxn/a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$j, reason: from toString */
    public static final /* data */ class UpdateLastName extends AbstractC18200a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateLastName) && Intrinsics.e(this.value, ((UpdateLastName) other).value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateLastName(String value) {
            super(null);
            Intrinsics.j(value, "value");
            this.value = value;
        }

        /* renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UpdateLastName(value=" + this.value + ')';
        }
    }

    public /* synthetic */ AbstractC18200a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18200a() {
    }
}
