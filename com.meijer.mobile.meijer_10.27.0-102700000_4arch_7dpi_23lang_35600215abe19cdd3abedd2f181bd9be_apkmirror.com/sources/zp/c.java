package zp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lzp/c;", "", "Lzp/f;", "identifier", "<init>", "(Lzp/f;)V", "a", "Lzp/f;", "getIdentifier", "()Lzp/f;", "b", "c", "Lzp/c$a;", "Lzp/c$b;", "Lzp/c$c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReceiptIdentifier identifier;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzp/c$a;", "Lzp/c;", "Lzp/f;", "identifier", "<init>", "(Lzp/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lzp/f;", "getIdentifier", "()Lzp/f;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zp.c$a, reason: from toString */
    public static final /* data */ class NotFound extends c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReceiptIdentifier identifier;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotFound) && Intrinsics.e(this.identifier, ((NotFound) other).identifier);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotFound(ReceiptIdentifier identifier) {
            super(identifier, null);
            Intrinsics.j(identifier, "identifier");
            this.identifier = identifier;
        }

        public int hashCode() {
            return this.identifier.hashCode();
        }

        public String toString() {
            return "NotFound(identifier=" + this.identifier + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\n¨\u0006\u001c"}, d2 = {"Lzp/c$b;", "Lzp/c;", "Lzp/f;", "identifier", "", "pdfData", "extension", "<init>", "(Lzp/f;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lzp/f;", "getIdentifier", "()Lzp/f;", "c", "Ljava/lang/String;", "a", "d", "getExtension", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zp.c$b, reason: from toString */
    public static final /* data */ class Pdf extends c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReceiptIdentifier identifier;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pdfData;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String extension;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pdf)) {
                return false;
            }
            Pdf pdf = (Pdf) other;
            return Intrinsics.e(this.identifier, pdf.identifier) && Intrinsics.e(this.pdfData, pdf.pdfData) && Intrinsics.e(this.extension, pdf.extension);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pdf(ReceiptIdentifier identifier, String str, String str2) {
            super(identifier, null);
            Intrinsics.j(identifier, "identifier");
            this.identifier = identifier;
            this.pdfData = str;
            this.extension = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getPdfData() {
            return this.pdfData;
        }

        public int hashCode() {
            int iHashCode = this.identifier.hashCode() * 31;
            String str = this.pdfData;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.extension;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Pdf(identifier=" + this.identifier + ", pdfData=" + this.pdfData + ", extension=" + this.extension + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lzp/c$c;", "Lzp/c;", "Lzp/f;", "identifier", "", "url", "<init>", "(Lzp/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lzp/f;", "getIdentifier", "()Lzp/f;", "c", "Ljava/lang/String;", "a", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zp.c$c, reason: collision with other inner class name and from toString */
    public static final /* data */ class Url extends c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReceiptIdentifier identifier;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Url)) {
                return false;
            }
            Url url = (Url) other;
            return Intrinsics.e(this.identifier, url.identifier) && Intrinsics.e(this.url, url.url);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Url(ReceiptIdentifier identifier, String url) {
            super(identifier, null);
            Intrinsics.j(identifier, "identifier");
            Intrinsics.j(url, "url");
            this.identifier = identifier;
            this.url = url;
        }

        /* renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.identifier.hashCode() * 31) + this.url.hashCode();
        }

        public String toString() {
            return "Url(identifier=" + this.identifier + ", url=" + this.url + ')';
        }
    }

    public /* synthetic */ c(ReceiptIdentifier receiptIdentifier, DefaultConstructorMarker defaultConstructorMarker) {
        this(receiptIdentifier);
    }

    private c(ReceiptIdentifier receiptIdentifier) {
        this.identifier = receiptIdentifier;
    }
}
