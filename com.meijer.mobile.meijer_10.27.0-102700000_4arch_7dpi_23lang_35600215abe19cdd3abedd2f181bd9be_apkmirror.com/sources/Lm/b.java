package Lm;

import hi.TrackingData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LLm/b;", "", "<init>", "()V", "i", "c", "b", "d", "g", "f", "e", "a", "k", "j", "h", "LLm/b$a;", "LLm/b$b;", "LLm/b$c;", "LLm/b$d;", "LLm/b$e;", "LLm/b$f;", "LLm/b$g;", "LLm/b$h;", "LLm/b$i;", "LLm/b$j;", "LLm/b$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLm/b$a;", "LLm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18553a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public String toString() {
            return "ClearReceiptDetails";
        }

        public int hashCode() {
            return -2052876925;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LLm/b$b;", "LLm/b;", "", "date", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class EnterDate extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String date;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterDate) && Intrinsics.e(this.date, ((EnterDate) other).date);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterDate(String date) {
            super(null);
            Intrinsics.j(date, "date");
            this.date = date;
        }

        /* renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return "EnterDate(date=" + this.date + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLm/b$c;", "LLm/b;", "Lhi/f;", "trackingData", "<init>", "(Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$c, reason: from toString */
    public static final /* data */ class EnterReceiptDetails extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterReceiptDetails) && Intrinsics.e(this.trackingData, ((EnterReceiptDetails) other).trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterReceiptDetails(TrackingData trackingData) {
            super(null);
            Intrinsics.j(trackingData, "trackingData");
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            return this.trackingData.hashCode();
        }

        public String toString() {
            return "EnterReceiptDetails(trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LLm/b$d;", "LLm/b;", "", "storeNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$d, reason: from toString */
    public static final /* data */ class EnterStoreInformation extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String storeNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterStoreInformation) && Intrinsics.e(this.storeNumber, ((EnterStoreInformation) other).storeNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterStoreInformation(String storeNumber) {
            super(null);
            Intrinsics.j(storeNumber, "storeNumber");
            this.storeNumber = storeNumber;
        }

        /* renamed from: a, reason: from getter */
        public final String getStoreNumber() {
            return this.storeNumber;
        }

        public int hashCode() {
            return this.storeNumber.hashCode();
        }

        public String toString() {
            return "EnterStoreInformation(storeNumber=" + this.storeNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LLm/b$e;", "LLm/b;", "", "time", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$e, reason: from toString */
    public static final /* data */ class EnterTimeInformation extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String time;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterTimeInformation) && Intrinsics.e(this.time, ((EnterTimeInformation) other).time);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterTimeInformation(String time) {
            super(null);
            Intrinsics.j(time, "time");
            this.time = time;
        }

        /* renamed from: a, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public int hashCode() {
            return this.time.hashCode();
        }

        public String toString() {
            return "EnterTimeInformation(time=" + this.time + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LLm/b$f;", "LLm/b;", "", "tmNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$f, reason: from toString */
    public static final /* data */ class EnterTmNumber extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tmNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterTmNumber) && Intrinsics.e(this.tmNumber, ((EnterTmNumber) other).tmNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterTmNumber(String tmNumber) {
            super(null);
            Intrinsics.j(tmNumber, "tmNumber");
            this.tmNumber = tmNumber;
        }

        /* renamed from: a, reason: from getter */
        public final String getTmNumber() {
            return this.tmNumber;
        }

        public int hashCode() {
            return this.tmNumber.hashCode();
        }

        public String toString() {
            return "EnterTmNumber(tmNumber=" + this.tmNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LLm/b$g;", "LLm/b;", "", "txNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$g, reason: from toString */
    public static final /* data */ class EnterTxNumber extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String txNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnterTxNumber) && Intrinsics.e(this.txNumber, ((EnterTxNumber) other).txNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterTxNumber(String txNumber) {
            super(null);
            Intrinsics.j(txNumber, "txNumber");
            this.txNumber = txNumber;
        }

        /* renamed from: a, reason: from getter */
        public final String getTxNumber() {
            return this.txNumber;
        }

        public int hashCode() {
            return this.txNumber.hashCode();
        }

        public String toString() {
            return "EnterTxNumber(txNumber=" + this.txNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLm/b$h;", "LLm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class h extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f18560a = new h();

        private h() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public String toString() {
            return "RestartRemediation";
        }

        public int hashCode() {
            return 2030249002;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLm/b$i;", "LLm/b;", "Lhi/f;", "trackingData", "<init>", "(Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$i, reason: from toString */
    public static final /* data */ class ScanReceiptBarcode extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScanReceiptBarcode) && Intrinsics.e(this.trackingData, ((ScanReceiptBarcode) other).trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScanReceiptBarcode(TrackingData trackingData) {
            super(null);
            Intrinsics.j(trackingData, "trackingData");
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            return this.trackingData.hashCode();
        }

        public String toString() {
            return "ScanReceiptBarcode(trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLm/b$j;", "LLm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final j f18562a = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public String toString() {
            return "SubmitManualReceipt";
        }

        public int hashCode() {
            return -110181562;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LLm/b$k;", "LLm/b;", "", "barcode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.b$k, reason: from toString */
    public static final /* data */ class SubmitReceiptBarcode extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String barcode;

        public SubmitReceiptBarcode(String str) {
            super(null);
            this.barcode = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmitReceiptBarcode) && Intrinsics.e(this.barcode, ((SubmitReceiptBarcode) other).barcode);
        }

        /* renamed from: a, reason: from getter */
        public final String getBarcode() {
            return this.barcode;
        }

        public int hashCode() {
            String str = this.barcode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SubmitReceiptBarcode(barcode=" + this.barcode + ')';
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
