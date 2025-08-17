package Th;

import Fh.h;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LTh/b;", "", "Lak/a;", "errorMessage", "<init>", "(Lak/a;)V", "a", "Lak/a;", "()Lak/a;", "c", "b", "LTh/b$a;", "LTh/b$b;", "LTh/b$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a errorMessage;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LTh/b$a;", "LTh/b;", "Lak/a;", "errorMessage", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lak/a;", "a", "()Lak/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Th.b$a, reason: from toString */
    public static final /* data */ class ErrorConflict extends b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a errorMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorConflict() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorConflict) && Intrinsics.e(this.errorMessage, ((ErrorConflict) other).errorMessage);
        }

        public /* synthetic */ ErrorConflict(AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.d(h.f10641Y, new Object[0]) : abstractC5607a);
        }

        @Override // Th.b
        /* renamed from: a, reason: from getter */
        public AbstractC5607a getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "ErrorConflict(errorMessage=" + this.errorMessage + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ErrorConflict(AbstractC5607a errorMessage) {
            super(null, 1, 0 == true ? 1 : 0);
            Intrinsics.j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LTh/b$b;", "LTh/b;", "Lak/a;", "errorMessage", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lak/a;", "a", "()Lak/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Th.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class ErrorGeneric extends b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a errorMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorGeneric() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorGeneric) && Intrinsics.e(this.errorMessage, ((ErrorGeneric) other).errorMessage);
        }

        public /* synthetic */ ErrorGeneric(AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.d(h.f10485B4, new Object[0]) : abstractC5607a);
        }

        @Override // Th.b
        /* renamed from: a, reason: from getter */
        public AbstractC5607a getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "ErrorGeneric(errorMessage=" + this.errorMessage + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ErrorGeneric(AbstractC5607a errorMessage) {
            super(null, 1, 0 == true ? 1 : 0);
            Intrinsics.j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTh/b$c;", "LTh/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final c f34993b = new c();

        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return -394563159;
        }
    }

    public /* synthetic */ b(AbstractC5607a abstractC5607a, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a);
    }

    private b(AbstractC5607a abstractC5607a) {
        this.errorMessage = abstractC5607a;
    }

    /* renamed from: a, reason: from getter */
    public AbstractC5607a getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ b(AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, null);
    }
}
