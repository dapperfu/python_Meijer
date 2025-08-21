package Ik;

import Ik.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\r\nB\u0019\b\u0004\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LIk/d;", "", "", "LIk/c;", "errors", "<init>", "(Ljava/util/List;)V", "other", "b", "(LIk/d;)LIk/d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "c", "LIk/d$a;", "LIk/d$b;", "LIk/d$c;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Ik.c> errors;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LIk/d$a;", "LIk/d;", "", "LIk/c;", "errors", "<init>", "(Ljava/util/List;)V", "other", "b", "(LIk/d;)LIk/d;", "c", "(Ljava/util/List;)LIk/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "a", "()Ljava/util/List;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ik.d$a, reason: from toString */
    public static final /* data */ class Failures extends d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Ik.c> errors;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failures) && Intrinsics.e(this.errors, ((Failures) other).errors);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Failures(List<? extends Ik.c> errors) {
            super(null, 1, 0 == true ? 1 : 0);
            Intrinsics.j(errors, "errors");
            this.errors = errors;
        }

        @Override // Ik.d
        public List<Ik.c> a() {
            return this.errors;
        }

        @Override // Ik.d
        public d b(d other) {
            Intrinsics.j(other, "other");
            if ((other instanceof b) || (other instanceof c)) {
                return this;
            }
            if (other instanceof Failures) {
                return new Failures(CollectionsKt.i0(CollectionsKt.P0(a(), ((Failures) other).a())));
            }
            throw new NoWhenBranchMatchedException();
        }

        public final Failures c(List<? extends Ik.c> errors) {
            Intrinsics.j(errors, "errors");
            return new Failures(errors);
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        public String toString() {
            return "Failures(errors=" + this.errors + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LIk/d$b;", "LIk/d;", "<init>", "()V", "other", "b", "(LIk/d;)LIk/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final b f14846b = new b();

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        private b() {
            super(CollectionsKt.e(new c.Pending("")), null);
        }

        @Override // Ik.d
        public d b(d other) {
            Intrinsics.j(other, "other");
            if (other instanceof b) {
                return f14846b;
            }
            if (other instanceof c) {
                return c.f14847b;
            }
            if (other instanceof Failures) {
                return other;
            }
            throw new NoWhenBranchMatchedException();
        }

        public String toString() {
            return "Pending";
        }

        public int hashCode() {
            return -1141907423;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LIk/d$c;", "LIk/d;", "<init>", "()V", "other", "b", "(LIk/d;)LIk/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final c f14847b = new c();

        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        @Override // Ik.d
        public d b(d other) {
            Intrinsics.j(other, "other");
            if ((other instanceof b) || (other instanceof c)) {
                return f14847b;
            }
            if (other instanceof Failures) {
                return other;
            }
            throw new NoWhenBranchMatchedException();
        }

        public String toString() {
            return "Success";
        }

        public int hashCode() {
            return 1968477837;
        }
    }

    public /* synthetic */ d(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public abstract d b(d other);

    /* JADX WARN: Multi-variable type inference failed */
    private d(List<? extends Ik.c> list) {
        this.errors = list;
    }

    public List<Ik.c> a() {
        return this.errors;
    }

    public /* synthetic */ d(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, null);
    }
}
