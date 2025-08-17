package in;

import Bj.g;
import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\f\u000b\u0017\u0015\u0018\u0019\u0010\u0013\u001a\u001b\u001c\u001d\u000eB+\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u000b\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lin/a;", "", "", "vehicleColor", "Lak/a;", "description", "position", "", "isChecked", "<init>", "(ILak/a;IZ)V", "a", "(Z)Lin/a;", "I", "d", "()I", "b", "Lak/a;", "()Lak/a;", "c", "Z", "e", "()Z", "k", "j", "i", "f", "g", "l", "h", "Lin/a$a;", "Lin/a$b;", "Lin/a$c;", "Lin/a$e;", "Lin/a$f;", "Lin/a$g;", "Lin/a$h;", "Lin/a$i;", "Lin/a$j;", "Lin/a$k;", "Lin/a$l;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: in.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC14744a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f138098f = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int vehicleColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int position;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isChecked;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$a;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class BLACK extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138103h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public BLACK() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BLACK) && this.isChecked == ((BLACK) other).isChecked;
        }

        public /* synthetic */ BLACK(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final BLACK f(boolean isChecked) {
            return new BLACK(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "BLACK(isChecked=" + this.isChecked + ')';
        }

        public BLACK(boolean z10) {
            super(g.f2614a, AbstractC5607a.INSTANCE.d(Y.f100011d2, new Object[0]), 0, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$b;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$b, reason: from toString */
    public static final /* data */ class BLUE extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138105h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public BLUE() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BLUE) && this.isChecked == ((BLUE) other).isChecked;
        }

        public /* synthetic */ BLUE(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final BLUE f(boolean isChecked) {
            return new BLUE(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "BLUE(isChecked=" + this.isChecked + ')';
        }

        public BLUE(boolean z10) {
            super(g.f2615b, AbstractC5607a.INSTANCE.d(Y.f100031e2, new Object[0]), 5, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$c;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$c, reason: from toString */
    public static final /* data */ class BROWN extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138107h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public BROWN() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BROWN) && this.isChecked == ((BROWN) other).isChecked;
        }

        public /* synthetic */ BROWN(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final BROWN f(boolean isChecked) {
            return new BROWN(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "BROWN(isChecked=" + this.isChecked + ')';
        }

        public BROWN(boolean z10) {
            super(g.f2618e, AbstractC5607a.INSTANCE.d(Y.f100051f2, new Object[0]), 6, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lin/a$d;", "", "<init>", "()V", "", "Lin/a;", "a", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<AbstractC14744a> a() {
            boolean z10 = false;
            int i10 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            return CollectionsKt.p(new BLACK(z10, i10, defaultConstructorMarker), new WHITE(z10, i10, defaultConstructorMarker), new GRAY(z10, i10, defaultConstructorMarker), new SILVER(z10, i10, defaultConstructorMarker), new RED(z10, i10, defaultConstructorMarker), new BLUE(z10, i10, defaultConstructorMarker), new BROWN(z10, i10, defaultConstructorMarker), new GREEN(z10, i10, defaultConstructorMarker), new ORANGE(z10, i10, defaultConstructorMarker), new YELLOW(z10, i10, defaultConstructorMarker), new PURPLE(z10, i10, defaultConstructorMarker));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$e;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$e, reason: from toString */
    public static final /* data */ class GRAY extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138109h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public GRAY() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GRAY) && this.isChecked == ((GRAY) other).isChecked;
        }

        public /* synthetic */ GRAY(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final GRAY f(boolean isChecked) {
            return new GRAY(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "GRAY(isChecked=" + this.isChecked + ')';
        }

        public GRAY(boolean z10) {
            super(g.f2623j, AbstractC5607a.INSTANCE.d(Y.f100071g2, new Object[0]), 2, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$f;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$f, reason: from toString */
    public static final /* data */ class GREEN extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138111h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public GREEN() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GREEN) && this.isChecked == ((GREEN) other).isChecked;
        }

        public /* synthetic */ GREEN(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final GREEN f(boolean isChecked) {
            return new GREEN(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "GREEN(isChecked=" + this.isChecked + ')';
        }

        public GREEN(boolean z10) {
            super(g.f2626m, AbstractC5607a.INSTANCE.d(Y.f100091h2, new Object[0]), 7, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$g;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$g, reason: from toString */
    public static final /* data */ class ORANGE extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138113h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public ORANGE() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ORANGE) && this.isChecked == ((ORANGE) other).isChecked;
        }

        public /* synthetic */ ORANGE(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final ORANGE f(boolean isChecked) {
            return new ORANGE(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "ORANGE(isChecked=" + this.isChecked + ')';
        }

        public ORANGE(boolean z10) {
            super(g.f2628o, AbstractC5607a.INSTANCE.d(Y.f100111i2, new Object[0]), 8, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$h;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$h, reason: from toString */
    public static final /* data */ class PURPLE extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138115h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public PURPLE() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PURPLE) && this.isChecked == ((PURPLE) other).isChecked;
        }

        public /* synthetic */ PURPLE(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final PURPLE f(boolean isChecked) {
            return new PURPLE(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "PURPLE(isChecked=" + this.isChecked + ')';
        }

        public PURPLE(boolean z10) {
            super(g.f2629p, AbstractC5607a.INSTANCE.d(Y.f100130j2, new Object[0]), 10, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$i;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$i, reason: from toString */
    public static final /* data */ class RED extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138117h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public RED() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RED) && this.isChecked == ((RED) other).isChecked;
        }

        public /* synthetic */ RED(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final RED f(boolean isChecked) {
            return new RED(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "RED(isChecked=" + this.isChecked + ')';
        }

        public RED(boolean z10) {
            super(g.f2630q, AbstractC5607a.INSTANCE.d(Y.f100150k2, new Object[0]), 4, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$j;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$j, reason: from toString */
    public static final /* data */ class SILVER extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138119h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public SILVER() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SILVER) && this.isChecked == ((SILVER) other).isChecked;
        }

        public /* synthetic */ SILVER(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final SILVER f(boolean isChecked) {
            return new SILVER(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "SILVER(isChecked=" + this.isChecked + ')';
        }

        public SILVER(boolean z10) {
            super(g.f2621h, AbstractC5607a.INSTANCE.d(Y.f100170l2, new Object[0]), 3, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$k;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$k, reason: from toString */
    public static final /* data */ class WHITE extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138121h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public WHITE() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WHITE) && this.isChecked == ((WHITE) other).isChecked;
        }

        public /* synthetic */ WHITE(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final WHITE f(boolean isChecked) {
            return new WHITE(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "WHITE(isChecked=" + this.isChecked + ')';
        }

        public WHITE(boolean z10) {
            super(g.f2632s, AbstractC5607a.INSTANCE.d(Y.f100190m2, new Object[0]), 1, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lin/a$l;", "Lin/a;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Lin/a$l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.a$l, reason: from toString */
    public static final /* data */ class YELLOW extends AbstractC14744a {

        /* renamed from: h, reason: collision with root package name */
        public static final int f138123h = AbstractC5607a.f45514b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public YELLOW() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof YELLOW) && this.isChecked == ((YELLOW) other).isChecked;
        }

        public /* synthetic */ YELLOW(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        @Override // in.AbstractC14744a
        /* renamed from: e, reason: from getter */
        public boolean getIsChecked() {
            return this.isChecked;
        }

        public final YELLOW f(boolean isChecked) {
            return new YELLOW(isChecked);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "YELLOW(isChecked=" + this.isChecked + ')';
        }

        public YELLOW(boolean z10) {
            super(g.f2634u, AbstractC5607a.INSTANCE.d(Y.f100210n2, new Object[0]), 9, z10, null);
            this.isChecked = z10;
        }
    }

    public /* synthetic */ AbstractC14744a(int i10, AbstractC5607a abstractC5607a, int i11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, abstractC5607a, i11, z10);
    }

    private AbstractC14744a(int i10, AbstractC5607a abstractC5607a, int i11, boolean z10) {
        this.vehicleColor = i10;
        this.description = abstractC5607a;
        this.position = i11;
        this.isChecked = z10;
    }

    public final AbstractC14744a a(boolean isChecked) {
        if (this instanceof BLACK) {
            return ((BLACK) this).f(isChecked);
        }
        if (this instanceof BLUE) {
            return ((BLUE) this).f(isChecked);
        }
        if (this instanceof BROWN) {
            return ((BROWN) this).f(isChecked);
        }
        if (this instanceof GRAY) {
            return ((GRAY) this).f(isChecked);
        }
        if (this instanceof GREEN) {
            return ((GREEN) this).f(isChecked);
        }
        if (this instanceof ORANGE) {
            return ((ORANGE) this).f(isChecked);
        }
        if (this instanceof PURPLE) {
            return ((PURPLE) this).f(isChecked);
        }
        if (this instanceof RED) {
            return ((RED) this).f(isChecked);
        }
        if (this instanceof SILVER) {
            return ((SILVER) this).f(isChecked);
        }
        if (this instanceof WHITE) {
            return ((WHITE) this).f(isChecked);
        }
        if (this instanceof YELLOW) {
            return ((YELLOW) this).f(isChecked);
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
    public final int getVehicleColor() {
        return this.vehicleColor;
    }

    /* renamed from: e, reason: from getter */
    public boolean getIsChecked() {
        return this.isChecked;
    }
}
