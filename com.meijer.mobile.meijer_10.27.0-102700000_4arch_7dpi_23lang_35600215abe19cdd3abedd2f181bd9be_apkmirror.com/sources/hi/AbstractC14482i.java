package hi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0005\f\r\u000b\n\u0007B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhi/i;", "", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "e", "d", "Lhi/i$b;", "Lhi/i$c;", "Lhi/i$d;", "Lhi/i$e;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hi.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC14482i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String value;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lhi/i$b;", "Lhi/i;", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "b", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hi.i$b, reason: from toString */
    public static final /* data */ class Extra extends AbstractC14482i {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Extra)) {
                return false;
            }
            Extra extra = (Extra) other;
            return Intrinsics.e(this.key, extra.key) && Intrinsics.e(this.value, extra.value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Extra(String key, String str) {
            super(key, str, null);
            Intrinsics.j(key, "key");
            this.key = key;
            this.value = str;
        }

        @Override // hi.AbstractC14482i
        /* renamed from: a, reason: from getter */
        public String getKey() {
            return this.key;
        }

        @Override // hi.AbstractC14482i
        /* renamed from: b, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            String str = this.value;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Extra(key=" + this.key + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lhi/i$c;", "Lhi/i;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hi.i$c, reason: from toString */
    public static final /* data */ class Page extends AbstractC14482i {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Page) && Intrinsics.e(this.value, ((Page) other).value);
        }

        public Page(String str) {
            super("page", str, null);
            this.value = str;
        }

        @Override // hi.AbstractC14482i
        /* renamed from: b, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Page(value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lhi/i$d;", "Lhi/i;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hi.i$d, reason: from toString */
    public static final /* data */ class PageType extends AbstractC14482i {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PageType) && Intrinsics.e(this.value, ((PageType) other).value);
        }

        public PageType(String str) {
            super("pagetype", str, null);
            this.value = str;
        }

        @Override // hi.AbstractC14482i
        /* renamed from: b, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "PageType(value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lhi/i$e;", "Lhi/i;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hi.i$e, reason: from toString */
    public static final /* data */ class Section extends AbstractC14482i {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Section) && Intrinsics.e(this.value, ((Section) other).value);
        }

        public Section(String str) {
            super("section", str, null);
            this.value = str;
        }

        @Override // hi.AbstractC14482i
        /* renamed from: b, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Section(value=" + this.value + ')';
        }
    }

    public /* synthetic */ AbstractC14482i(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private AbstractC14482i(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    /* renamed from: a, reason: from getter */
    public String getKey() {
        return this.key;
    }

    /* renamed from: b, reason: from getter */
    public String getValue() {
        return this.value;
    }
}
