package Eh;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEh/d;", "", "<init>", "()V", "b", "a", "LEh/d$a;", "LEh/d$b;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC3240d {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"LEh/d$a;", "LEh/d;", "LEh/a;", "original", "suggested", "<init>", "(LEh/a;LEh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEh/a;", "()LEh/a;", "b", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eh.d$a, reason: from toString */
    public static final /* data */ class Select extends AbstractC3240d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccountAddress original;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccountAddress suggested;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.e(this.original, select.original) && Intrinsics.e(this.suggested, select.suggested);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Select(AccountAddress original, AccountAddress suggested) {
            super(null);
            Intrinsics.j(original, "original");
            Intrinsics.j(suggested, "suggested");
            this.original = original;
            this.suggested = suggested;
        }

        /* renamed from: a, reason: from getter */
        public final AccountAddress getOriginal() {
            return this.original;
        }

        /* renamed from: b, reason: from getter */
        public final AccountAddress getSuggested() {
            return this.suggested;
        }

        public int hashCode() {
            return (this.original.hashCode() * 31) + this.suggested.hashCode();
        }

        public String toString() {
            return "Select(original=" + this.original + ", suggested=" + this.suggested + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LEh/d$b;", "LEh/d;", "LEh/a;", PlaceTypes.ADDRESS, "<init>", "(LEh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEh/a;", "getAddress", "()LEh/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eh.d$b, reason: from toString */
    public static final /* data */ class Success extends AbstractC3240d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccountAddress address;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.e(this.address, ((Success) other).address);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AccountAddress address) {
            super(null);
            Intrinsics.j(address, "address");
            this.address = address;
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "Success(address=" + this.address + ')';
        }
    }

    public /* synthetic */ AbstractC3240d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3240d() {
    }
}
