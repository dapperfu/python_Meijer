package Hh;

import Gh.h;
import Ik.Validation;
import Ik.c;
import Jk.d;
import Jk.m;
import ak.InterfaceC5697a;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0007\u000b\f\r\u0007\u000e\u000f\u0010B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LHh/a;", "T", "Lak/a;", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "a", "LIk/b;", "getValidation", "()LIk/b;", "c", "d", "f", "b", "e", "g", "LHh/a$a;", "LHh/a$b;", "LHh/a$c;", "LHh/a$d;", "LHh/a$e;", "LHh/a$f;", "LHh/a$g;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class a<T> implements InterfaceC5697a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LHh/a$a;", "LHh/a;", "", "LIk/b;", "validation", "information", "<init>", "(LIk/b;Ljava/lang/String;)V", "f", "()LHh/a$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Apartment extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String information;

        /* JADX WARN: Multi-variable type inference failed */
        public Apartment() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Apartment)) {
                return false;
            }
            Apartment apartment = (Apartment) other;
            return Intrinsics.e(this.validation, apartment.validation) && Intrinsics.e(this.information, apartment.information);
        }

        public Apartment f() {
            return this;
        }

        public /* synthetic */ Apartment(Validation validation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation, (i10 & 2) != 0 ? "" : str);
        }

        @Override // ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        /* renamed from: e, reason: from getter */
        public final String getInformation() {
            return this.information;
        }

        public int hashCode() {
            return (this.validation.hashCode() * 31) + this.information.hashCode();
        }

        public String toString() {
            return "Apartment(validation=" + this.validation + ", information=" + this.information + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Apartment(Validation<String> validation, String information) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            Intrinsics.j(information, "information");
            this.validation = validation;
            this.information = information;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LHh/a$b;", "LHh/a;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()LHh/a$b;", "e", "(LIk/b;)LHh/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$b, reason: from toString */
    public static final /* data */ class City extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public City() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof City) && Intrinsics.e(this.validation, ((City) other).validation);
        }

        public /* synthetic */ City(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final City e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new City(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "City(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            if (((c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f12999v5, new Object[0]);
            }
            return super.b();
        }

        public City f() {
            return e(c().j(new d(new PropertyReference0Impl(this) { // from class: Hh.a.b.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((City) this.receiver).c();
                }
            }, "city")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public City(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LHh/a$c;", "LHh/a;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()LHh/a$c;", "e", "(LIk/b;)LHh/a$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$c, reason: from toString */
    public static final /* data */ class FirstName extends a<String> {

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

        @Override // ak.InterfaceC5697a
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

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            if (((c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f12925l1, new Object[0]);
            }
            return super.b();
        }

        public FirstName f() {
            return e(c().j(new d(new PropertyReference0Impl(this) { // from class: Hh.a.c.a
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LHh/a$d;", "LHh/a;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()LHh/a$d;", "e", "(LIk/b;)LHh/a$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$d, reason: from toString */
    public static final /* data */ class LastName extends a<String> {

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

        @Override // ak.InterfaceC5697a
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

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            if (((c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f12785R1, new Object[0]);
            }
            return super.b();
        }

        public LastName f() {
            return e(c().j(new d(new PropertyReference0Impl(this) { // from class: Hh.a.d.a
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LHh/a$e;", "LHh/a;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()LHh/a$e;", "e", "(LIk/b;)LHh/a$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$e, reason: from toString */
    public static final /* data */ class State extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && Intrinsics.e(this.validation, ((State) other).validation);
        }

        public /* synthetic */ State(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final State e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new State(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "State(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            if (((c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f13027z5, new Object[0]);
            }
            return super.b();
        }

        public State f() {
            return e(c().j(new d(new PropertyReference0Impl(this) { // from class: Hh.a.e.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).c();
                }
            }, "state")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public State(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LHh/a$f;", "LHh/a;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()LHh/a$f;", "e", "(LIk/b;)LHh/a$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$f, reason: from toString */
    public static final /* data */ class StreetAddress extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public StreetAddress() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StreetAddress) && Intrinsics.e(this.validation, ((StreetAddress) other).validation);
        }

        public /* synthetic */ StreetAddress(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final StreetAddress e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new StreetAddress(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "StreetAddress(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            if (((c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f12670A5, new Object[0]);
            }
            return super.b();
        }

        public StreetAddress f() {
            return e(c().j(new d(new PropertyReference0Impl(this) { // from class: Hh.a.f.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((StreetAddress) this.receiver).c();
                }
            }, "streetAddress")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreetAddress(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LHh/a$g;", "LHh/a;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()LHh/a$g;", "e", "(LIk/b;)LHh/a$g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hh.a$g, reason: from toString */
    public static final /* data */ class ZipCode extends a<String> {

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

        @Override // ak.InterfaceC5697a
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

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            c cVar = (c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f12677B5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC6392a.INSTANCE.d(h.f12677B5, new Object[0]);
            }
            return super.b();
        }

        public ZipCode f() {
            return e(c().j(new d(new PropertyReference0Impl(this) { // from class: Hh.a.g.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ZipCode) this.receiver).c();
                }
            }, "zipCode"), new m(new PropertyReference0Impl(this) { // from class: Hh.a.g.b
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

    public /* synthetic */ a(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private a(Validation<T> validation) {
        this.validation = validation;
    }
}
