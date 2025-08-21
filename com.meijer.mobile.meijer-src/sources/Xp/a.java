package Xp;

import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u000e\u0006\u000f\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LXp/a;", "", "", "data", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "h", "i", "d", "c", "b", "f", "e", "g", "LXp/a$a;", "LXp/a$b;", "LXp/a$c;", "LXp/a$d;", "LXp/a$e;", "LXp/a$f;", "LXp/a$g;", "LXp/a$h;", "LXp/a$i;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String data;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LXp/a$a;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class CODE128 extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CODE128) && Intrinsics.e(this.data, ((CODE128) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CODE128(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CODE128(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LXp/a$b;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$b, reason: from toString */
    public static final /* data */ class EAN13 extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EAN13) && Intrinsics.e(this.data, ((EAN13) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EAN13(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "EAN13(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LXp/a$c;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$c, reason: from toString */
    public static final /* data */ class EAN8 extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EAN8) && Intrinsics.e(this.data, ((EAN8) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EAN8(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "EAN8(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LXp/a$d;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$d, reason: from toString */
    public static final /* data */ class NSC2 extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NSC2) && Intrinsics.e(this.data, ((NSC2) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NSC2(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "NSC2(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"LXp/a$e;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "pluCode", "", "c", "(Ljava/lang/String;)I", "", "character", "b", "(C)I", "LXp/a$h;", "d", "()LXp/a$h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$e, reason: from toString */
    public static final /* data */ class PLU extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PLU) && Intrinsics.e(this.data, ((PLU) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PLU(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        private final int b(char character) {
            return character - '0';
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "PLU(data=" + this.data + ')';
        }

        private final int c(String pluCode) {
            int i10;
            int length = pluCode.length();
            int iB = 0;
            int iB2 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (i11 % 2 == 0) {
                    iB2 += b(pluCode.charAt(i11));
                } else {
                    iB += b(pluCode.charAt(i11));
                }
            }
            if (pluCode.length() % 2 == 0) {
                i10 = (iB2 + (iB * 3)) % 10;
            } else {
                i10 = (iB + (iB2 * 3)) % 10;
            }
            if (i10 != 0) {
                return 10 - i10;
            }
            return i10;
        }

        public final UPCA d() {
            int i10 = (Integer.parseInt(getData()) * 10) + c(getData());
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
            String str = String.format("%012d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            Intrinsics.i(str, "format(...)");
            return new UPCA(str);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"LXp/a$f;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "LXp/a$h;", "b", "()LXp/a$h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "a", "c", "pluNumber", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Xp.a$f, reason: from toString */
    public static final /* data */ class QR extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String pluNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QR) && Intrinsics.e(this.data, ((QR) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QR(String data) throws IOException {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
            String data2 = getData();
            StringBuilder sb2 = new StringBuilder();
            int length = data2.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = data2.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            this.pluNumber = sb2.toString();
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public final UPCA b() {
            return new PLU(this.pluNumber).d();
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "QR(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LXp/a$g;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$g, reason: from toString */
    public static final /* data */ class UNKNOWN extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UNKNOWN) && Intrinsics.e(this.data, ((UNKNOWN) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "UNKNOWN(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LXp/a$h;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$h, reason: from toString */
    public static final /* data */ class UPCA extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UPCA) && Intrinsics.e(this.data, ((UPCA) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UPCA(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "UPCA(data=" + this.data + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"LXp/a$i;", "LXp/a;", "", "data", "<init>", "(Ljava/lang/String;)V", "LXp/a$h;", "b", "()LXp/a$h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.a$i, reason: from toString */
    public static final /* data */ class UPCE extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UPCE) && Intrinsics.e(this.data, ((UPCE) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UPCE(String data) {
            super(data, null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        @Override // Xp.a
        /* renamed from: a, reason: from getter */
        public String getData() {
            return this.data;
        }

        public final UPCA b() {
            StringBuilder sb2 = new StringBuilder(12);
            if (!new Regex("\\d+").j(getData()) || getData().length() < 8) {
                return null;
            }
            char[] cArr = new char[6];
            getData().getChars(1, 7, cArr, 0);
            sb2.append(getData().charAt(0));
            char c10 = cArr[5];
            switch (c10) {
                case '0':
                case '1':
                case '2':
                    sb2.append(cArr, 0, 2);
                    sb2.append(c10);
                    sb2.append("0000");
                    sb2.append(cArr, 2, 3);
                    break;
                case '3':
                    sb2.append(cArr, 0, 3);
                    sb2.append("00000");
                    sb2.append(cArr, 3, 2);
                    break;
                case '4':
                    sb2.append(cArr, 0, 4);
                    sb2.append("00000");
                    sb2.append(cArr[4]);
                    break;
                default:
                    sb2.append(cArr, 0, 5);
                    sb2.append("0000");
                    sb2.append(c10);
                    break;
            }
            if (getData().length() >= 8) {
                sb2.append(getData().charAt(7));
            }
            String string = sb2.toString();
            Intrinsics.i(string, "toString(...)");
            return new UPCA(string);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "UPCE(data=" + this.data + ')';
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private a(String str) {
        this.data = str;
    }

    /* renamed from: a, reason: from getter */
    public String getData() {
        return this.data;
    }
}
