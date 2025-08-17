package tk;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import tk.c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\n\u000b\t\u0006B\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Ltk/c;", "T", "", "data", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "c", "d", "Ltk/c$b;", "Ltk/c$c;", "Ltk/c$d;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T data;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ltk/c$a;", "", "<init>", "()V", "T", "fallbackData", "Lkotlin/Function1;", "", "errorProvider", "Lkotlin/Function0;", "dataProvider", "Ltk/c;", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ltk/c;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tk.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Throwable d(Throwable it) {
            Intrinsics.j(it, "it");
            return it;
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c c(Companion companion, Object obj, Function1 function1, Function0 function0, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                function1 = new Function1() { // from class: tk.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return c.Companion.d((Throwable) obj3);
                    }
                };
            }
            return companion.b(obj, function1, function0);
        }

        public final <T> c<T> b(T fallbackData, Function1<? super Throwable, ? extends Throwable> errorProvider, Function0<? extends T> dataProvider) {
            Intrinsics.j(errorProvider, "errorProvider");
            Intrinsics.j(dataProvider, "dataProvider");
            try {
                return new Success(dataProvider.invoke());
            } catch (Throwable th2) {
                return new Failure(fallbackData, errorProvider.invoke(th2));
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ltk/c$b;", "T", "Ltk/c;", "data", "", "error", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "d", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tk.c$b, reason: from toString */
    public static final /* data */ class Failure<T> extends c<T> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final T data;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(T t10, Throwable error) {
            super(t10, null);
            Intrinsics.j(error, "error");
            this.data = t10;
            this.error = error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.e(this.data, failure.data) && Intrinsics.e(this.error, failure.error);
        }

        public /* synthetic */ Failure(Object obj, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : obj, th2);
        }

        @Override // tk.c
        public T a() {
            return this.data;
        }

        /* renamed from: b, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            T t10 = this.data;
            return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Failure(data=" + this.data + ", error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltk/c$c;", "T", "Ltk/c;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tk.c$c, reason: collision with other inner class name and from toString */
    public static final /* data */ class Loading<T> extends c<T> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final T data;

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(defaultConstructorMarker, 1, defaultConstructorMarker);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.e(this.data, ((Loading) other).data);
        }

        public Loading(T t10) {
            super(t10, null);
            this.data = t10;
        }

        @Override // tk.c
        public T a() {
            return this.data;
        }

        public int hashCode() {
            T t10 = this.data;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Loading(data=" + this.data + ')';
        }

        public /* synthetic */ Loading(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : obj);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltk/c$d;", "T", "Ltk/c;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tk.c$d, reason: from toString */
    public static final /* data */ class Success<T> extends c<T> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final T data;

        public Success(T t10) {
            super(t10, null);
            this.data = t10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.e(this.data, ((Success) other).data);
        }

        @Override // tk.c
        public T a() {
            return this.data;
        }

        public int hashCode() {
            T t10 = this.data;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + ')';
        }
    }

    public /* synthetic */ c(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    private c(T t10) {
        this.data = t10;
    }

    public T a() {
        return this.data;
    }
}
