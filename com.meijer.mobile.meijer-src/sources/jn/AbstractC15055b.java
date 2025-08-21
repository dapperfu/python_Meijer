package jn;

import bk.AbstractC6392a;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\t\u0017\u0010\u0018\u000b\u0015\u000e\u0019\u001a\u0013B+\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\b\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Ljn/b;", "", "", "vehicleImage", "Lbk/a;", "description", "position", "", "isChecked", "<init>", "(ILbk/a;IZ)V", "a", "(Z)Ljn/b;", "I", "d", "()I", "b", "Lbk/a;", "()Lbk/a;", "c", "Z", "e", "()Z", "g", "h", "i", "f", "Ljn/b$a;", "Ljn/b$b;", "Ljn/b$d;", "Ljn/b$e;", "Ljn/b$f;", "Ljn/b$g;", "Ljn/b$h;", "Ljn/b$i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jn.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC15055b {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f141012f = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int vehicleImage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int position;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isChecked;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$a;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$a, reason: from toString */
    public static final /* data */ class COUPE extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141017h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99610v, AbstractC6392a.INSTANCE.d(Y.f101212u2, new Object[0]), 3, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$b;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class CROSSOVER extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141019h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99613x, AbstractC6392a.INSTANCE.d(Y.f101232v2, new Object[0]), 1, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljn/b$c;", "", "<init>", "()V", "", "Ljn/b;", "a", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<AbstractC15055b> a() {
            boolean z10 = false;
            int i10 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            return CollectionsKt.p(new SEDAN(z10, i10, defaultConstructorMarker), new CROSSOVER(z10, i10, defaultConstructorMarker), new SUV(z10, i10, defaultConstructorMarker), new COUPE(z10, i10, defaultConstructorMarker), new MOTORCYCLE(z10, i10, defaultConstructorMarker), new MINIVAN(z10, i10, defaultConstructorMarker), new TRUCK(z10, i10, defaultConstructorMarker), new OTHER(z10, i10, defaultConstructorMarker));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$d;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$d, reason: from toString */
    public static final /* data */ class MINIVAN extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141021h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99544C, AbstractC6392a.INSTANCE.d(Y.f101252w2, new Object[0]), 5, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$e;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$e, reason: from toString */
    public static final /* data */ class MOTORCYCLE extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141023h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99545D, AbstractC6392a.INSTANCE.d(Y.f101272x2, new Object[0]), 4, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$f;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$f, reason: from toString */
    public static final /* data */ class OTHER extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141025h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99552K, AbstractC6392a.INSTANCE.d(Y.f101292y2, new Object[0]), 7, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$g;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$g, reason: from toString */
    public static final /* data */ class SEDAN extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141027h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99554M, AbstractC6392a.INSTANCE.d(Y.f101312z2, new Object[0]), 0, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$h;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$h, reason: from toString */
    public static final /* data */ class SUV extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141029h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99558Q, AbstractC6392a.INSTANCE.d(Y.f100314A2, new Object[0]), 2, z10, null);
            this.isChecked = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljn/b$i;", "Ljn/b;", "", "isChecked", "<init>", "(Z)V", "f", "(Z)Ljn/b$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jn.b$i, reason: from toString */
    public static final /* data */ class TRUCK extends AbstractC15055b {

        /* renamed from: h, reason: collision with root package name */
        public static final int f141031h = AbstractC6392a.f60445b;

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

        @Override // jn.AbstractC15055b
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
            super(S.f99559R, AbstractC6392a.INSTANCE.d(Y.f100334B2, new Object[0]), 6, z10, null);
            this.isChecked = z10;
        }
    }

    public /* synthetic */ AbstractC15055b(int i10, AbstractC6392a abstractC6392a, int i11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, abstractC6392a, i11, z10);
    }

    private AbstractC15055b(int i10, AbstractC6392a abstractC6392a, int i11, boolean z10) {
        this.vehicleImage = i10;
        this.description = abstractC6392a;
        this.position = i11;
        this.isChecked = z10;
    }

    public final AbstractC15055b a(boolean isChecked) {
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
    public final AbstractC6392a getDescription() {
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
