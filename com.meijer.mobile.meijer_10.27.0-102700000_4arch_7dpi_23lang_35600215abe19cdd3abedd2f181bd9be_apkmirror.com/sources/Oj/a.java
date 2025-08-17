package Oj;

import Bj.o;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000b\u0012\b\rB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"LOj/a;", "", "", "key", "", "isLoading", "<init>", "(Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Z", "c", "()Z", "Lak/a;", "()Lak/a;", "message", "d", "LOj/a$a;", "LOj/a$b;", "LOj/a$c;", "LOj/a$d;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f23966c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isLoading;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LOj/a$a;", "LOj/a;", "", "key", "Lak/a;", "message", "<init>", "(Ljava/lang/String;Lak/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "Lak/a;", "b", "()Lak/a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oj.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Failed extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f23969f = AbstractC5607a.f45514b;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a message;

        /* JADX WARN: Multi-variable type inference failed */
        public Failed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.e(this.key, failed.key) && Intrinsics.e(this.message, failed.message);
        }

        public /* synthetic */ Failed(String str, AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? AbstractC5607a.INSTANCE.d(o.f3022i0, new Object[0]) : abstractC5607a);
        }

        @Override // Oj.a
        /* renamed from: a, reason: from getter */
        public String getKey() {
            return this.key;
        }

        @Override // Oj.a
        /* renamed from: b, reason: from getter */
        public AbstractC5607a getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Failed(key=" + this.key + ", message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String key, AbstractC5607a message) {
            super(key, false, null);
            Intrinsics.j(key, "key");
            Intrinsics.j(message, "message");
            this.key = key;
            this.message = message;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LOj/a$b;", "LOj/a;", "", "key", "Lak/a;", "message", "<init>", "(Ljava/lang/String;Lak/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "Lak/a;", "b", "()Lak/a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oj.a$b, reason: from toString */
    public static final /* data */ class Loading extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f23972f = AbstractC5607a.f45514b;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a message;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.e(this.key, loading.key) && Intrinsics.e(this.message, loading.message);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loading(String str, AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i10 & 1) != 0 ? "" : str;
            this(str, (i10 & 2) != 0 ? !StringsKt.r0(str) ? AbstractC5607a.INSTANCE.d(o.f2968E, str) : AbstractC5607a.INSTANCE.d(o.f2966D, new Object[0]) : abstractC5607a);
        }

        @Override // Oj.a
        /* renamed from: a, reason: from getter */
        public String getKey() {
            return this.key;
        }

        @Override // Oj.a
        /* renamed from: b, reason: from getter */
        public AbstractC5607a getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Loading(key=" + this.key + ", message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(String key, AbstractC5607a message) {
            super(key, true, null);
            Intrinsics.j(key, "key");
            Intrinsics.j(message, "message");
            this.key = key;
            this.message = message;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LOj/a$c;", "LOj/a;", "", "key", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oj.a$c, reason: from toString */
    public static final /* data */ class NotLoading extends a {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* JADX WARN: Multi-variable type inference failed */
        public NotLoading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotLoading) && Intrinsics.e(this.key, ((NotLoading) other).key);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotLoading(String key) {
            super(key, false, null);
            Intrinsics.j(key, "key");
            this.key = key;
        }

        @Override // Oj.a
        /* renamed from: a, reason: from getter */
        public String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "NotLoading(key=" + this.key + ')';
        }

        public /* synthetic */ NotLoading(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LOj/a$d;", "LOj/a;", "", "key", "Lak/a;", "message", "<init>", "(Ljava/lang/String;Lak/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "Lak/a;", "b", "()Lak/a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oj.a$d, reason: from toString */
    public static final /* data */ class Paging extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f23976f = AbstractC5607a.f45514b;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a message;

        /* JADX WARN: Multi-variable type inference failed */
        public Paging() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paging)) {
                return false;
            }
            Paging paging = (Paging) other;
            return Intrinsics.e(this.key, paging.key) && Intrinsics.e(this.message, paging.message);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Paging(String str, AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i10 & 1) != 0 ? "" : str;
            this(str, (i10 & 2) != 0 ? !StringsKt.r0(str) ? AbstractC5607a.INSTANCE.d(o.f2968E, str) : AbstractC5607a.INSTANCE.d(o.f2966D, new Object[0]) : abstractC5607a);
        }

        @Override // Oj.a
        /* renamed from: a, reason: from getter */
        public String getKey() {
            return this.key;
        }

        @Override // Oj.a
        /* renamed from: b, reason: from getter */
        public AbstractC5607a getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Paging(key=" + this.key + ", message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paging(String key, AbstractC5607a message) {
            super(key, true, null);
            Intrinsics.j(key, "key");
            Intrinsics.j(message, "message");
            this.key = key;
            this.message = message;
        }
    }

    public /* synthetic */ a(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    /* renamed from: b */
    public AbstractC5607a getMessage() {
        return null;
    }

    private a(String str, boolean z10) {
        this.key = str;
        this.isLoading = z10;
    }

    /* renamed from: a, reason: from getter */
    public String getKey() {
        return this.key;
    }

    /* renamed from: c, reason: from getter */
    public boolean getIsLoading() {
        return this.isLoading;
    }
}
