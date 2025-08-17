package in;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\t\u0017\u0010\u0018\u000b\u0015\u000e\u0019\u001a\u0013B+\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\b\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lin/b;", "", "", "vehicleImage", "Lak/a;", "description", "position", "", "isChecked", "<init>", "(ILak/a;IZ)V", "a", "(Z)Lin/b;", "I", "d", "()I", "b", "Lak/a;", "()Lak/a;", "c", "Z", "e", "()Z", "g", "h", "i", "f", "Lin/b$a;", "Lin/b$b;", "Lin/b$d;", "Lin/b$e;", "Lin/b$f;", "Lin/b$g;", "Lin/b$h;", "Lin/b$i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: in.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC14745b {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f138126f = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int vehicleImage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int position;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isChecked;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$a;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$a, reason: from toString */
    public static final /* data */ class COUPE extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138131h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public COUPE() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof COUPE) && this.isChecked == ((COUPE) other).isChecked;
        }

        public /* synthetic */ COUPE(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final COUPE f(boolean isChecked) {
            return new COUPE(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "COUPE(isChecked=" + this.isChecked + ')';
        }

        public COUPE(boolean z10) {
            super(S.f98753v, AbstractC5607a.INSTANCE.d(Y.f100350u2, new Object[0]), 3, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$b;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class CROSSOVER extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138133h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public CROSSOVER() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CROSSOVER) && this.isChecked == ((CROSSOVER) other).isChecked;
        }

        public /* synthetic */ CROSSOVER(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final CROSSOVER f(boolean isChecked) {
            return new CROSSOVER(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "CROSSOVER(isChecked=" + this.isChecked + ')';
        }

        public CROSSOVER(boolean z10) {
            super(S.f98756x, AbstractC5607a.INSTANCE.d(Y.f100370v2, new Object[0]), 1, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lin/b$c;", "", "<init>", "()V", "", "Lin/b;", "a", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<AbstractC14745b> a() {
            boolean z10 = false;
            int i10 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            return CollectionsKt.p(new SEDAN(z10, i10, defaultConstructorMarker), new CROSSOVER(z10, i10, defaultConstructorMarker), new SUV(z10, i10, defaultConstructorMarker), new COUPE(z10, i10, defaultConstructorMarker), new MOTORCYCLE(z10, i10, defaultConstructorMarker), new MINIVAN(z10, i10, defaultConstructorMarker), new TRUCK(z10, i10, defaultConstructorMarker), new OTHER(z10, i10, defaultConstructorMarker));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$d;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$d, reason: from toString */
    public static final /* data */ class MINIVAN extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138135h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public MINIVAN() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MINIVAN) && this.isChecked == ((MINIVAN) other).isChecked;
        }

        public /* synthetic */ MINIVAN(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final MINIVAN f(boolean isChecked) {
            return new MINIVAN(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "MINIVAN(isChecked=" + this.isChecked + ')';
        }

        public MINIVAN(boolean z10) {
            super(S.f98687C, AbstractC5607a.INSTANCE.d(Y.f100390w2, new Object[0]), 5, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$e;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$e, reason: from toString */
    public static final /* data */ class MOTORCYCLE extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138137h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public MOTORCYCLE() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MOTORCYCLE) && this.isChecked == ((MOTORCYCLE) other).isChecked;
        }

        public /* synthetic */ MOTORCYCLE(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final MOTORCYCLE f(boolean isChecked) {
            return new MOTORCYCLE(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "MOTORCYCLE(isChecked=" + this.isChecked + ')';
        }

        public MOTORCYCLE(boolean z10) {
            super(S.f98688D, AbstractC5607a.INSTANCE.d(Y.f100410x2, new Object[0]), 4, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$f;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$f, reason: from toString */
    public static final /* data */ class OTHER extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138139h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public OTHER() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OTHER) && this.isChecked == ((OTHER) other).isChecked;
        }

        public /* synthetic */ OTHER(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final OTHER f(boolean isChecked) {
            return new OTHER(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "OTHER(isChecked=" + this.isChecked + ')';
        }

        public OTHER(boolean z10) {
            super(S.f98695K, AbstractC5607a.INSTANCE.d(Y.f100430y2, new Object[0]), 7, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$g;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$g, reason: from toString */
    public static final /* data */ class SEDAN extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138141h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public SEDAN() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SEDAN) && this.isChecked == ((SEDAN) other).isChecked;
        }

        public /* synthetic */ SEDAN(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final SEDAN f(boolean isChecked) {
            return new SEDAN(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "SEDAN(isChecked=" + this.isChecked + ')';
        }

        public SEDAN(boolean z10) {
            super(S.f98697M, AbstractC5607a.INSTANCE.d(Y.f100450z2, new Object[0]), 0, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$h;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$h, reason: from toString */
    public static final /* data */ class SUV extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138143h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public SUV() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SUV) && this.isChecked == ((SUV) other).isChecked;
        }

        public /* synthetic */ SUV(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final SUV f(boolean isChecked) {
            return new SUV(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "SUV(isChecked=" + this.isChecked + ')';
        }

        public SUV(boolean z10) {
            super(S.f98701Q, AbstractC5607a.INSTANCE.d(Y.f99457A2, new Object[0]), 2, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/b$i;", "Lin/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/b$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.b$i, reason: from toString */
    public static final /* data */ class TRUCK extends AbstractC14745b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138145h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public TRUCK() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TRUCK) && this.isChecked == ((TRUCK) other).isChecked;
        }

        public /* synthetic */ TRUCK(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14745b
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final TRUCK f(boolean isChecked) {
            return new TRUCK(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "TRUCK(isChecked=" + this.isChecked + ')';
        }

        public TRUCK(boolean z10) {
            super(S.f98702R, AbstractC5607a.INSTANCE.d(Y.f99476B2, new Object[0]), 6, z10, null);
            this.isChecked = z10;
        }
    }

    public /* synthetic */ AbstractC14745b(int i10, AbstractC5607a abstractC5607a, int i11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, abstractC5607a, i11, z10);
    }

    private AbstractC14745b(int i10, AbstractC5607a abstractC5607a, int i11, boolean z10) {
        this.vehicleImage = i10;
        this.description = abstractC5607a;
        this.position = i11;
        this.isChecked = z10;
    }

    public final AbstractC14745b a(boolean isChecked) {
        if (this instanceof SEDAN) {
            return ((SEDAN) this).f(isChecked);
        }
        if (this instanceof CROSSOVER) {
            return ((CROSSOVER) this).f(isChecked);
        }
        if (this instanceof SUV) {
            return ((SUV) this).f(isChecked);
        }
        if (this instanceof COUPE) {
            return ((COUPE) this).f(isChecked);
        }
        if (this instanceof MOTORCYCLE) {
            return ((MOTORCYCLE) this).f(isChecked);
        }
        if (this instanceof MINIVAN) {
            return ((MINIVAN) this).f(isChecked);
        }
        if (this instanceof TRUCK) {
            return ((TRUCK) this).f(isChecked);
        }
        if (this instanceof OTHER) {
            return ((OTHER) this).f(isChecked);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: d, reason: from getter */
    public final int getVehicleImage() {
        return this.vehicleImage;
    }

    /* renamed from: e, reason: from getter */
    public boolean getIsChecked() {
        return this.isChecked;
    }
}
