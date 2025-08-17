package Zh;

import Fh.h;
import Hk.Validation;
import Hk.c;
import Ik.g;
import Ik.k;
import Ik.m;
import ak.AbstractC5607a;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0005\u000b\t\f\r\u0007B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"LZh/b;", "T", "LZj/a;", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "a", "LHk/b;", "c", "()LHk/b;", "b", "e", "d", "LZh/b$a;", "LZh/b$b;", "LZh/b$c;", "LZh/b$d;", "LZh/b$e;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class b<T> implements Zj.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LZh/b$a;", "LZh/b;", "j$/time/LocalDate", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()LZh/b$a;", "e", "(LHk/b;)LZh/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.b$a, reason: from toString */
    public static final /* data */ class BirthDate extends b<LocalDate> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<LocalDate> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public BirthDate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BirthDate) && Intrinsics.e(this.validation, ((BirthDate) other).validation);
        }

        public /* synthetic */ BirthDate(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation(null, null, 2, null) : validation);
        }

        @Override // Zh.b, Zj.a
        public Validation<LocalDate> c() {
            return this.validation;
        }

        public final BirthDate e(Validation<LocalDate> validation) {
            Intrinsics.j(validation, "validation");
            return new BirthDate(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "BirthDate(validation=" + this.validation + ')';
        }

        public BirthDate f() {
            return e(c().j(new k[0]));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BirthDate(Validation<LocalDate> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LZh/b$b;", "LZh/b;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()LZh/b$b;", "e", "(LHk/b;)LZh/b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class FirstName extends b<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public FirstName() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FirstName) && Intrinsics.e(this.validation, ((FirstName) other).validation);
        }

        public /* synthetic */ FirstName(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zh.b, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final FirstName e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new FirstName(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "FirstName(validation=" + this.validation + ')';
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            if (((Hk.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(h.f10734l1, new Object[0]);
            }
            return super.b();
        }

        public FirstName f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: Zh.b.b.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((FirstName) this.receiver).c();
                }
            }, "firstName")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstName(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LZh/b$c;", "LZh/b;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()LZh/b$c;", "e", "(LHk/b;)LZh/b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.b$c, reason: from toString */
    public static final /* data */ class LastName extends b<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public LastName() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LastName) && Intrinsics.e(this.validation, ((LastName) other).validation);
        }

        public /* synthetic */ LastName(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zh.b, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final LastName e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new LastName(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "LastName(validation=" + this.validation + ')';
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            if (((Hk.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(h.f10594R1, new Object[0]);
            }
            return super.b();
        }

        public LastName f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: Zh.b.c.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((LastName) this.receiver).c();
                }
            }, "lastName")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LastName(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LZh/b$d;", "LZh/b;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()LZh/b$d;", "e", "(LHk/b;)LZh/b$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.b$d, reason: from toString */
    public static final /* data */ class PhoneNumber extends b<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public PhoneNumber() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhoneNumber) && Intrinsics.e(this.validation, ((PhoneNumber) other).validation);
        }

        public /* synthetic */ PhoneNumber(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zh.b, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final PhoneNumber e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new PhoneNumber(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "PhoneNumber(validation=" + this.validation + ')';
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            Hk.c cVar = (Hk.c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(h.f10829y5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC5607a.INSTANCE.d(h.f10829y5, new Object[0]);
            }
            return super.b();
        }

        public PhoneNumber f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: Zh.b.d.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((PhoneNumber) this.receiver).c();
                }
            }, "phoneNumber"), new g(new PropertyReference0Impl(this) { // from class: Zh.b.d.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((PhoneNumber) this.receiver).c();
                }
            }, "phoneNumber")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneNumber(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LZh/b$e;", "LZh/b;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()LZh/b$e;", "e", "(LHk/b;)LZh/b$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.b$e, reason: from toString */
    public static final /* data */ class ZipCode extends b<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public ZipCode() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ZipCode) && Intrinsics.e(this.validation, ((ZipCode) other).validation);
        }

        public /* synthetic */ ZipCode(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zh.b, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final ZipCode e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new ZipCode(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "ZipCode(validation=" + this.validation + ')';
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            Hk.c cVar = (Hk.c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(h.f10486B5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC5607a.INSTANCE.d(h.f10486B5, new Object[0]);
            }
            return super.b();
        }

        public ZipCode f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: Zh.b.e.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ZipCode) this.receiver).c();
                }
            }, "zipCode"), new m(new PropertyReference0Impl(this) { // from class: Zh.b.e.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ZipCode) this.receiver).c();
                }
            }, "zipCode")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZipCode(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    public /* synthetic */ b(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private b(Validation<T> validation) {
        this.validation = validation;
    }

    @Override // Zj.a
    public Validation<T> c() {
        return this.validation;
    }
}
